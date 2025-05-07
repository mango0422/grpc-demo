package baas.grpc.account.deposit;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.70.0)",
    comments = "Source: deposit.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DepositServiceGrpc {

  private DepositServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "DepositService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<baas.grpc.account.deposit.DepositRequest,
      baas.grpc.account.deposit.DepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = baas.grpc.account.deposit.DepositRequest.class,
      responseType = baas.grpc.account.deposit.DepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<baas.grpc.account.deposit.DepositRequest,
      baas.grpc.account.deposit.DepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<baas.grpc.account.deposit.DepositRequest, baas.grpc.account.deposit.DepositResponse> getDepositMethod;
    if ((getDepositMethod = DepositServiceGrpc.getDepositMethod) == null) {
      synchronized (DepositServiceGrpc.class) {
        if ((getDepositMethod = DepositServiceGrpc.getDepositMethod) == null) {
          DepositServiceGrpc.getDepositMethod = getDepositMethod =
              io.grpc.MethodDescriptor.<baas.grpc.account.deposit.DepositRequest, baas.grpc.account.deposit.DepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  baas.grpc.account.deposit.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  baas.grpc.account.deposit.DepositResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DepositServiceMethodDescriptorSupplier("Deposit"))
              .build();
        }
      }
    }
    return getDepositMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepositServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepositServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepositServiceStub>() {
        @java.lang.Override
        public DepositServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepositServiceStub(channel, callOptions);
        }
      };
    return DepositServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DepositServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepositServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepositServiceBlockingV2Stub>() {
        @java.lang.Override
        public DepositServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepositServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DepositServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepositServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepositServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepositServiceBlockingStub>() {
        @java.lang.Override
        public DepositServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepositServiceBlockingStub(channel, callOptions);
        }
      };
    return DepositServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepositServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DepositServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DepositServiceFutureStub>() {
        @java.lang.Override
        public DepositServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DepositServiceFutureStub(channel, callOptions);
        }
      };
    return DepositServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 계정계 입금 RPC
     * </pre>
     */
    default void deposit(baas.grpc.account.deposit.DepositRequest request,
        io.grpc.stub.StreamObserver<baas.grpc.account.deposit.DepositResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DepositService.
   */
  public static abstract class DepositServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DepositServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DepositService.
   */
  public static final class DepositServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DepositServiceStub> {
    private DepositServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepositServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepositServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 입금 RPC
     * </pre>
     */
    public void deposit(baas.grpc.account.deposit.DepositRequest request,
        io.grpc.stub.StreamObserver<baas.grpc.account.deposit.DepositResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DepositService.
   */
  public static final class DepositServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DepositServiceBlockingV2Stub> {
    private DepositServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepositServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepositServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 입금 RPC
     * </pre>
     */
    public baas.grpc.account.deposit.DepositResponse deposit(baas.grpc.account.deposit.DepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DepositService.
   */
  public static final class DepositServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DepositServiceBlockingStub> {
    private DepositServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepositServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepositServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 입금 RPC
     * </pre>
     */
    public baas.grpc.account.deposit.DepositResponse deposit(baas.grpc.account.deposit.DepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DepositService.
   */
  public static final class DepositServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DepositServiceFutureStub> {
    private DepositServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepositServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DepositServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 입금 RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<baas.grpc.account.deposit.DepositResponse> deposit(
        baas.grpc.account.deposit.DepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPOSIT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSIT:
          serviceImpl.deposit((baas.grpc.account.deposit.DepositRequest) request,
              (io.grpc.stub.StreamObserver<baas.grpc.account.deposit.DepositResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getDepositMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              baas.grpc.account.deposit.DepositRequest,
              baas.grpc.account.deposit.DepositResponse>(
                service, METHODID_DEPOSIT)))
        .build();
  }

  private static abstract class DepositServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepositServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return baas.grpc.account.deposit.Deposit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepositService");
    }
  }

  private static final class DepositServiceFileDescriptorSupplier
      extends DepositServiceBaseDescriptorSupplier {
    DepositServiceFileDescriptorSupplier() {}
  }

  private static final class DepositServiceMethodDescriptorSupplier
      extends DepositServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DepositServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DepositServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepositServiceFileDescriptorSupplier())
              .addMethod(getDepositMethod())
              .build();
        }
      }
    }
    return result;
  }
}
