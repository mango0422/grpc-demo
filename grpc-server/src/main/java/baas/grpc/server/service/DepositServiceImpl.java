package baas.grpc.server.service;

import baas.grpc.account.deposit.DepositRequest;
import baas.grpc.account.deposit.DepositResponse;
import baas.grpc.account.deposit.DepositServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DepositServiceImpl extends DepositServiceGrpc.DepositServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(DepositServiceImpl.class);

    @Override
    public void deposit(DepositRequest request, StreamObserver<DepositResponse> responseObserver) {
        log.info("Received DepositRequest: accountId={}, amount={}", request.getAccountId(), request.getAmount());

        DepositResponse response = DepositResponse.newBuilder()
                .setSuccess(true)
                .setTransactionId("tx-deposit-" + System.currentTimeMillis())
                .setMessage("입금 성공")
                .build();

        log.info("Sending DepositResponse: success={}, transactionId={}, message={}",
                response.getSuccess(), response.getTransactionId(), response.getMessage());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
