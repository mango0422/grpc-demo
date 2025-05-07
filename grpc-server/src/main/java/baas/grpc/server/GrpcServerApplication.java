package baas.grpc.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcServerApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(GrpcServerApplication.class, args);
    }
}
