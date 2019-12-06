#!/bin/bash

TARGET_DIR=$PWD/book
if [ ! -d $TARGET_DIR ] 
then
    echo "Create ${TARGET_DIR} directory"
    mkdir -p $TARGET_DIR
fi

echo "Generating stub at ${TARGET_DIR}..."

python -m grpc_tools.protoc -I../../proto --python_out=book --grpc_python_out=book ../../proto/Book.proto
