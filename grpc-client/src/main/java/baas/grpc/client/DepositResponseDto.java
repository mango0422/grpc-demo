package baas.grpc.client;

public record DepositResponseDto(boolean success, String transactionId, String message) {}