// grpc-client/src/main/java/baas/grpc/client/config/GrpcClientConfig.java
package baas.grpc.client.config;

import io.grpc.ManagedChannel;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {

    @Bean
    public ManagedChannel grpcChannel() {
        return NettyChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();
    }

    @Bean
    public baas.grpc.account.deposit.DepositServiceGrpc.DepositServiceBlockingStub depositStub(ManagedChannel ch) {
        return baas.grpc.account.deposit.DepositServiceGrpc.newBlockingStub(ch);
    }

    @Bean
    public baas.grpc.account.withdraw.WithdrawServiceGrpc.WithdrawServiceBlockingStub withdrawStub(ManagedChannel ch) {
        return baas.grpc.account.withdraw.WithdrawServiceGrpc.newBlockingStub(ch);
    }
}
