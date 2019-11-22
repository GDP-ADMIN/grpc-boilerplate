#!/bin/bash
echo creating grpc stub directory ...
mkdir -p demo-client/src/grpc
echo generateing stub ...
protoc -I ../../proto ../../proto/Book.proto --js_out=import_style=commonjs,binary:demo-client/src/grpc --grpc-web_out=import_style=commonjs,mode=grpcwebtext:demo-client/src/grpc
echo stub generated.