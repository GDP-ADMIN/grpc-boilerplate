#!/bin/bash

TARGET_DIR=$PWD/demo-client/src/grpc
if [ ! -d $TARGET_DIR ]
then
    echo "Create ${TARGET_DIR} directory"
    mkdir -p $TARGET_DIR
fi

echo "Generating stub at ${TARGET_DIR} ..."

protoc -I ../../proto \
../../proto/Book.proto \
--js_out=import_style=commonjs,binary:demo-client/src/grpc \
--grpc-web_out=import_style=commonjs,mode=grpcwebtext:$TARGET_DIR
