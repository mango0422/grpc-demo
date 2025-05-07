package baas.grpc.client;

public record DepositRequestDto(String accountId, double amount) {}