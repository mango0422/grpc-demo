// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withdraw.proto

package baas.grpc.account.withdraw;

public final class Withdraw {
  private Withdraw() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WithdrawRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WithdrawRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WithdrawResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WithdrawResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016withdraw.proto\"4\n\017WithdrawRequest\022\021\n\ta" +
      "ccountId\030\001 \001(\t\022\016\n\006amount\030\002 \001(\001\"K\n\020Withdr" +
      "awResponse\022\017\n\007success\030\001 \001(\010\022\025\n\rtransacti" +
      "onId\030\002 \001(\t\022\017\n\007message\030\003 \001(\t2B\n\017WithdrawS" +
      "ervice\022/\n\010Withdraw\022\020.WithdrawRequest\032\021.W" +
      "ithdrawResponseB\036\n\032baas.grpc.account.wit" +
      "hdrawP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WithdrawRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WithdrawRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WithdrawRequest_descriptor,
        new java.lang.String[] { "AccountId", "Amount", });
    internal_static_WithdrawResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_WithdrawResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WithdrawResponse_descriptor,
        new java.lang.String[] { "Success", "TransactionId", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
