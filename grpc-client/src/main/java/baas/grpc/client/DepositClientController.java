package baas.grpc.client;

import baas.grpc.account.deposit.*;
import com.linecorp.armeria.client.grpc.GrpcClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deposit")
public class DepositClientController {

    private static final Logger log = LoggerFactory.getLogger(DepositClientController.class);

    private final DepositServiceGrpc.DepositServiceBlockingStub stub;

    public DepositClientController() {
        this.stub = GrpcClients.builder("gproto+h2c://localhost:9091")
                .build(DepositServiceGrpc.DepositServiceBlockingStub.class);
    }

    @PostMapping
    public DepositResponseDto deposit(@RequestBody DepositRequestDto dto) {
        log.info("Received DepositRequestDto: accountId={}, amount={}", dto.accountId(), dto.amount());

        DepositRequest request = DepositRequest.newBuilder()
                .setAccountId(dto.accountId())
                .setAmount(dto.amount())
                .build();

        DepositResponse response = stub.deposit(request);

        log.info("Received DepositResponse from gRPC: success={}, transactionId={}, message={}",
                response.getSuccess(), response.getTransactionId(), response.getMessage());

        return new DepositResponseDto(
                response.getSuccess(),
                response.getTransactionId(),
                response.getMessage()
        );
    }
}
