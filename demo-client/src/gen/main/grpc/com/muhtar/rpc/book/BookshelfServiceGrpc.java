package com.muhtar.rpc.book;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: Bookshelf.proto")
public final class BookshelfServiceGrpc {

  private BookshelfServiceGrpc() {}

  public static final String SERVICE_NAME = "com.muhtar.rpc.book.BookshelfService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.muhtar.rpc.book.Empty,
      com.muhtar.rpc.book.BookMessageList> getReadAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readAll",
      requestType = com.muhtar.rpc.book.Empty.class,
      responseType = com.muhtar.rpc.book.BookMessageList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.muhtar.rpc.book.Empty,
      com.muhtar.rpc.book.BookMessageList> getReadAllMethod() {
    io.grpc.MethodDescriptor<com.muhtar.rpc.book.Empty, com.muhtar.rpc.book.BookMessageList> getReadAllMethod;
    if ((getReadAllMethod = BookshelfServiceGrpc.getReadAllMethod) == null) {
      synchronized (BookshelfServiceGrpc.class) {
        if ((getReadAllMethod = BookshelfServiceGrpc.getReadAllMethod) == null) {
          BookshelfServiceGrpc.getReadAllMethod = getReadAllMethod =
              io.grpc.MethodDescriptor.<com.muhtar.rpc.book.Empty, com.muhtar.rpc.book.BookMessageList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "readAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.muhtar.rpc.book.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.muhtar.rpc.book.BookMessageList.getDefaultInstance()))
              .setSchemaDescriptor(new BookshelfServiceMethodDescriptorSupplier("readAll"))
              .build();
        }
      }
    }
    return getReadAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.muhtar.rpc.book.BookMessage,
      com.muhtar.rpc.book.BookMessage> getAddBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBook",
      requestType = com.muhtar.rpc.book.BookMessage.class,
      responseType = com.muhtar.rpc.book.BookMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.muhtar.rpc.book.BookMessage,
      com.muhtar.rpc.book.BookMessage> getAddBookMethod() {
    io.grpc.MethodDescriptor<com.muhtar.rpc.book.BookMessage, com.muhtar.rpc.book.BookMessage> getAddBookMethod;
    if ((getAddBookMethod = BookshelfServiceGrpc.getAddBookMethod) == null) {
      synchronized (BookshelfServiceGrpc.class) {
        if ((getAddBookMethod = BookshelfServiceGrpc.getAddBookMethod) == null) {
          BookshelfServiceGrpc.getAddBookMethod = getAddBookMethod =
              io.grpc.MethodDescriptor.<com.muhtar.rpc.book.BookMessage, com.muhtar.rpc.book.BookMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.muhtar.rpc.book.BookMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.muhtar.rpc.book.BookMessage.getDefaultInstance()))
              .setSchemaDescriptor(new BookshelfServiceMethodDescriptorSupplier("addBook"))
              .build();
        }
      }
    }
    return getAddBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookshelfServiceStub newStub(io.grpc.Channel channel) {
    return new BookshelfServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookshelfServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookshelfServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookshelfServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookshelfServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookshelfServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void readAll(com.muhtar.rpc.book.Empty request,
        io.grpc.stub.StreamObserver<com.muhtar.rpc.book.BookMessageList> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    /**
     */
    public void addBook(com.muhtar.rpc.book.BookMessage request,
        io.grpc.stub.StreamObserver<com.muhtar.rpc.book.BookMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getAddBookMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.muhtar.rpc.book.Empty,
                com.muhtar.rpc.book.BookMessageList>(
                  this, METHODID_READ_ALL)))
          .addMethod(
            getAddBookMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.muhtar.rpc.book.BookMessage,
                com.muhtar.rpc.book.BookMessage>(
                  this, METHODID_ADD_BOOK)))
          .build();
    }
  }

  /**
   */
  public static final class BookshelfServiceStub extends io.grpc.stub.AbstractStub<BookshelfServiceStub> {
    private BookshelfServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookshelfServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookshelfServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookshelfServiceStub(channel, callOptions);
    }

    /**
     */
    public void readAll(com.muhtar.rpc.book.Empty request,
        io.grpc.stub.StreamObserver<com.muhtar.rpc.book.BookMessageList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBook(com.muhtar.rpc.book.BookMessage request,
        io.grpc.stub.StreamObserver<com.muhtar.rpc.book.BookMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookshelfServiceBlockingStub extends io.grpc.stub.AbstractStub<BookshelfServiceBlockingStub> {
    private BookshelfServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookshelfServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookshelfServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookshelfServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.muhtar.rpc.book.BookMessageList readAll(com.muhtar.rpc.book.Empty request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.muhtar.rpc.book.BookMessage addBook(com.muhtar.rpc.book.BookMessage request) {
      return blockingUnaryCall(
          getChannel(), getAddBookMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookshelfServiceFutureStub extends io.grpc.stub.AbstractStub<BookshelfServiceFutureStub> {
    private BookshelfServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookshelfServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookshelfServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookshelfServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.muhtar.rpc.book.BookMessageList> readAll(
        com.muhtar.rpc.book.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.muhtar.rpc.book.BookMessage> addBook(
        com.muhtar.rpc.book.BookMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getAddBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_ALL = 0;
  private static final int METHODID_ADD_BOOK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookshelfServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookshelfServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_ALL:
          serviceImpl.readAll((com.muhtar.rpc.book.Empty) request,
              (io.grpc.stub.StreamObserver<com.muhtar.rpc.book.BookMessageList>) responseObserver);
          break;
        case METHODID_ADD_BOOK:
          serviceImpl.addBook((com.muhtar.rpc.book.BookMessage) request,
              (io.grpc.stub.StreamObserver<com.muhtar.rpc.book.BookMessage>) responseObserver);
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

  private static abstract class BookshelfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookshelfServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.muhtar.rpc.book.Bookshelf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookshelfService");
    }
  }

  private static final class BookshelfServiceFileDescriptorSupplier
      extends BookshelfServiceBaseDescriptorSupplier {
    BookshelfServiceFileDescriptorSupplier() {}
  }

  private static final class BookshelfServiceMethodDescriptorSupplier
      extends BookshelfServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookshelfServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookshelfServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookshelfServiceFileDescriptorSupplier())
              .addMethod(getReadAllMethod())
              .addMethod(getAddBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
