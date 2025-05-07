package baas.grpc.account.withdraw;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class WithdrawServiceGrpc {

  private WithdrawServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "WithdrawService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<baas.grpc.account.withdraw.WithdrawRequest,
      baas.grpc.account.withdraw.WithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = baas.grpc.account.withdraw.WithdrawRequest.class,
      responseType = baas.grpc.account.withdraw.WithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<baas.grpc.account.withdraw.WithdrawRequest,
      baas.grpc.account.withdraw.WithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<baas.grpc.account.withdraw.WithdrawRequest, baas.grpc.account.withdraw.WithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = WithdrawServiceGrpc.getWithdrawMethod) == null) {
      synchronized (WithdrawServiceGrpc.class) {
        if ((getWithdrawMethod = WithdrawServiceGrpc.getWithdrawMethod) == null) {
          WithdrawServiceGrpc.getWithdrawMethod = getWithdrawMethod =
              io.grpc.MethodDescriptor.<baas.grpc.account.withdraw.WithdrawRequest, baas.grpc.account.withdraw.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  baas.grpc.account.withdraw.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  baas.grpc.account.withdraw.WithdrawResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WithdrawServiceMethodDescriptorSupplier("Withdraw"))
              .build();
        }
      }
    }
    return getWithdrawMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WithdrawServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceStub>() {
        @java.lang.Override
        public WithdrawServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WithdrawServiceStub(channel, callOptions);
        }
      };
    return WithdrawServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static WithdrawServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceBlockingV2Stub>() {
        @java.lang.Override
        public WithdrawServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WithdrawServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return WithdrawServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WithdrawServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceBlockingStub>() {
        @java.lang.Override
        public WithdrawServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WithdrawServiceBlockingStub(channel, callOptions);
        }
      };
    return WithdrawServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WithdrawServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WithdrawServiceFutureStub>() {
        @java.lang.Override
        public WithdrawServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WithdrawServiceFutureStub(channel, callOptions);
        }
      };
    return WithdrawServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 계정계 출금 RPC
     * </pre>
     */
    default void withdraw(baas.grpc.account.withdraw.WithdrawRequest request,
        io.grpc.stub.StreamObserver<baas.grpc.account.withdraw.WithdrawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WithdrawService.
   */
  public static abstract class WithdrawServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WithdrawServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WithdrawService.
   */
  public static final class WithdrawServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WithdrawServiceStub> {
    private WithdrawServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WithdrawServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WithdrawServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 출금 RPC
     * </pre>
     */
    public void withdraw(baas.grpc.account.withdraw.WithdrawRequest request,
        io.grpc.stub.StreamObserver<baas.grpc.account.withdraw.WithdrawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WithdrawService.
   */
  public static final class WithdrawServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<WithdrawServiceBlockingV2Stub> {
    private WithdrawServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WithdrawServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WithdrawServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 출금 RPC
     * </pre>
     */
    public baas.grpc.account.withdraw.WithdrawResponse withdraw(baas.grpc.account.withdraw.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service WithdrawService.
   */
  public static final class WithdrawServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WithdrawServiceBlockingStub> {
    private WithdrawServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WithdrawServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WithdrawServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 출금 RPC
     * </pre>
     */
    public baas.grpc.account.withdraw.WithdrawResponse withdraw(baas.grpc.account.withdraw.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WithdrawService.
   */
  public static final class WithdrawServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WithdrawServiceFutureStub> {
    private WithdrawServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WithdrawServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WithdrawServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 계정계 출금 RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<baas.grpc.account.withdraw.WithdrawResponse> withdraw(
        baas.grpc.account.withdraw.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WITHDRAW = 0;

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
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((baas.grpc.account.withdraw.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<baas.grpc.account.withdraw.WithdrawResponse>) responseObserver);
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
          getWithdrawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              baas.grpc.account.withdraw.WithdrawRequest,
              baas.grpc.account.withdraw.WithdrawResponse>(
                service, METHODID_WITHDRAW)))
        .build();
  }

  private static abstract class WithdrawServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WithdrawServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return baas.grpc.account.withdraw.Withdraw.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WithdrawService");
    }
  }

  private static final class WithdrawServiceFileDescriptorSupplier
      extends WithdrawServiceBaseDescriptorSupplier {
    WithdrawServiceFileDescriptorSupplier() {}
  }

  private static final class WithdrawServiceMethodDescriptorSupplier
      extends WithdrawServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WithdrawServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WithdrawServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WithdrawServiceFileDescriptorSupplier())
              .addMethod(getWithdrawMethod())
              .build();
        }
      }
    }
    return result;
  }
}
