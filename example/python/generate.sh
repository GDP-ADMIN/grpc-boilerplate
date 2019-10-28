#!/bin/bash

if [ ! -d "book" ] 
then
    echo "create book directory"
    mkdir book
fi

echo "generating grpc stub"

python -m grpc_tools.protoc -I../../proto --python_out=book --grpc_python_out=book ../../proto/Book.proto
