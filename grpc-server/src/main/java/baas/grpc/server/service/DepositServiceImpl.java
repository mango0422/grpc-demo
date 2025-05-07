// grpc-server/src/main/java/baas/grpc/server/service/DepositServiceImpl.java
package baas.grpc.server.service;

import baas.grpc.account.deposit.*;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Component;

@Component
public class DepositServiceImpl extends DepositServiceGrpc.DepositServiceImplBase {
    @Override
    public void deposit(DepositRequest req, StreamObserver<DepositResponse> resp) {
        // TODO: 실제 입금 로직
        DepositResponse r = DepositResponse.newBuilder()
                .setSuccess(true)
                .setTransactionId("tx-"+System.currentTimeMillis())
                .setMessage("입금 완료")
                .build();
        resp.onNext(r);
        resp.onCompleted();
    }
}
