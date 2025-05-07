// grpc-client/src/main/java/baas/grpc/client/controller/AccountController.java
package baas.grpc.client.controller;

import baas.grpc.account.deposit.DepositRequest;
import baas.grpc.account.deposit.DepositResponse;
import baas.grpc.account.withdraw.WithdrawRequest;
import baas.grpc.account.withdraw.WithdrawResponse;
import io.grpc.StatusRuntimeException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final baas.grpc.account.deposit.DepositServiceGrpc.DepositServiceBlockingStub depositStub;
    private final baas.grpc.account.withdraw.WithdrawServiceGrpc.WithdrawServiceBlockingStub withdrawStub;

    public AccountController(
            baas.grpc.account.deposit.DepositServiceGrpc.DepositServiceBlockingStub depositStub,
            baas.grpc.account.withdraw.WithdrawServiceGrpc.WithdrawServiceBlockingStub withdrawStub) {
        this.depositStub = depositStub;
        this.withdrawStub = withdrawStub;
    }

    @PostMapping("/{id}/deposit")
    public DepositResponse deposit(@PathVariable String id, @RequestParam double amount) {
        try {
            return depositStub.deposit(
                    DepositRequest.newBuilder().setAccountId(id).setAmount(amount).build()
            );
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("gRPC Deposit 호출 실패", e);
        }
    }

    @PostMapping("/{id}/withdraw")
    public WithdrawResponse withdraw(@PathVariable String id, @RequestParam double amount) {
        try {
            return withdrawStub.withdraw(
                    WithdrawRequest.newBuilder().setAccountId(id).setAmount(amount).build()
            );
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("gRPC Withdraw 호출 실패", e);
        }
    }
}
