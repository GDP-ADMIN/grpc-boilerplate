package com.demo.grpc.interceptor;

import io.grpc.*;

import java.util.logging.Logger;

public class MyInterceptor implements ServerInterceptor {

    private static final Logger LOGGER = Logger.getLogger(MyInterceptor.class.getName());

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next
    ) {
        LOGGER.info("my interceptor here");
        return next.startCall(
            new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {},
            headers
        );
    }
}
