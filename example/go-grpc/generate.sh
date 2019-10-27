#!/bin/bash

protoc -I ../../proto ../../proto/Book.proto --go_out=plugins=grpc:$GOPATH/src/gogrpc/book
