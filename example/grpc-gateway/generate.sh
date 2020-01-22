#!/bin/bash

TARGET_DIR=$GOPATH/src/gogrpc/employee
if [ ! -d $TARGET_DIR ]
then
    echo "Create ${TARGET_DIR} directory"
    mkdir -p $TARGET_DIR
fi

echo "Generating stub at ${TARGET_DIR} ..."
protoc -I/usr/local/include -I. \
  -I$GOPATH/src \
  -I$GOPATH/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis \
  --grpc-gateway_out=logtostderr=true:$TARGET_DIR \
  --go_out=plugins=grpc:$TARGET_DIR \
  ./proto/employee.proto