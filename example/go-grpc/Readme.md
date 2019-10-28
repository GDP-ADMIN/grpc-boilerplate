## gRPC with go

### Requirements
- Install golang
- Install [protocol buffer](https://developers.google.com/protocol-buffers/)
- Make sure you have added `GOPATH` to you environtment variable. And add `$GOPATH/bin` to `PATH`
- Install protoc go plugin by run this `go get -u github.com/golang/protobuf/protoc-gen-go`. `protoc-gen-go` will be installed in `$GOPATH/bin`

### Generate code from .proto file
- Create proto file. If you need sample you can look at `proto/Book.proto`
- Run `protoc -I {src dir} {src dir}/Book.proto --go_out=plugins=grpc:{output dir}`
- Golang code will be generated in output dir

### Generate stub for this project
- Run `./generate.sh`

### Run example
- Run server : `go run server.go` in server folder. Currently server is emplemented using dummy data. I suggest you to run producer-server in spring-grpc-java instead.
- Run client : `go run client.go` in client folder
- Run benchmark : `go run benchmark.go` in benchmark folder
