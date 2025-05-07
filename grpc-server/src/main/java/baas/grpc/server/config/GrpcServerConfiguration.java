// grpc-server/src/main/java/baas/grpc/server/config/GrpcServerConfiguration.java
package baas.grpc.server.config;

import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfiguration {

    @Value("${grpc.server.port:9090}")
    private int port;

    // 1) 서비스 Impl 빈을 주입받아 gRPC Server 인스턴스를 생성
    @Bean
    public Server grpcServer(
            baas.grpc.server.service.DepositServiceImpl depositSvc,
            baas.grpc.server.service.WithdrawServiceImpl withdrawSvc) {
        return NettyServerBuilder
                .forPort(port)
                .addService(depositSvc)
                .addService(withdrawSvc)
                .build();
    }

    // 2) Spring Boot 시작 후 gRPC 서버 start(), 종료 훅 등록
    @Bean
    public ApplicationRunner grpcServerRunner(Server grpcServer) {
        return args -> {
            grpcServer.start();
            System.out.println("gRPC server started on port " + port);
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("Shutting down gRPC server...");
                grpcServer.shutdown();
            }));
        };
    }
}
