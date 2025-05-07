package baas.grpc.server;

import baas.grpc.server.service.DepositServiceImpl;
import baas.grpc.server.service.WithdrawServiceImpl;
import com.linecorp.armeria.server.grpc.GrpcService;
import com.linecorp.armeria.spring.ArmeriaServerConfigurator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    private final DepositServiceImpl depositService;
    private final WithdrawServiceImpl withdrawService;

    public GrpcServerConfig(DepositServiceImpl depositService, WithdrawServiceImpl withdrawService) {
        this.depositService = depositService;
        this.withdrawService = withdrawService;
    }

    @Bean
    public ArmeriaServerConfigurator armeriaServerConfigurator() {
        return serverBuilder -> serverBuilder.service(
                GrpcService.builder()
                        .addService(depositService)
                        .addService(withdrawService)
                        .enableUnframedRequests(true)
                        .build()
        );
    }
}
