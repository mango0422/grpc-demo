package baas.grpc.server.service;

import baas.grpc.account.withdraw.WithdrawRequest;
import baas.grpc.account.withdraw.WithdrawResponse;
import baas.grpc.account.withdraw.WithdrawServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WithdrawServiceImpl extends WithdrawServiceGrpc.WithdrawServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(WithdrawServiceImpl.class);

    @Override
    public void withdraw(WithdrawRequest request, StreamObserver<WithdrawResponse> responseObserver) {
        log.info("Received WithdrawRequest: accountId={}, amount={}", request.getAccountId(), request.getAmount());

        WithdrawResponse response = WithdrawResponse.newBuilder()
                .setSuccess(true)
                .setTransactionId("tx-withdraw-" + System.currentTimeMillis())
                .setMessage("출금 성공")
                .build();

        log.info("Sending WithdrawResponse: success={}, transactionId={}, message={}",
                response.getSuccess(), response.getTransactionId(), response.getMessage());

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
