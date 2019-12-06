#!/bin/bash

TARGET_DIR=$GOPATH/src/gogrpc/book
if [ ! -d $TARGET_DIR ]
then
    echo "Create ${TARGET_DIR} directory"
    mkdir -p $TARGET_DIR
fi

echo "Generating stub at ${TARGET_DIR} ..."

protoc -I ../../proto ../../proto/Book.proto --go_out=plugins=grpc:$TARGET_DIR
