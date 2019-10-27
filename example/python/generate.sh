#!/bin/bash

python -m grpc_tools.protoc -I../../proto --python_out=book --grpc_python_out=book ../../proto/Book.proto
