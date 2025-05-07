// grpc-server/src/main/java/baas/grpc/server/service/WithdrawServiceImpl.java
package baas.grpc.server.service;

import baas.grpc.account.withdraw.*;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Component;

@Component
public class WithdrawServiceImpl extends WithdrawServiceGrpc.WithdrawServiceImplBase {
    @Override
    public void withdraw(WithdrawRequest req, StreamObserver<WithdrawResponse> resp) {
        // TODO: 실제 출금 로직
        WithdrawResponse r = WithdrawResponse.newBuilder()
                .setSuccess(true)
                .setTransactionId("tx-"+System.currentTimeMillis())
                .setMessage("출금 완료")
                .build();
        resp.onNext(r);
        resp.onCompleted();
    }
}
