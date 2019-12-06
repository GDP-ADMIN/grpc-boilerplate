## gRPC Web

### Code Generator Plugin

You can download the `protoc-gen-grpc-web` protoc plugin from our
[release](https://github.com/grpc/grpc-web/releases) page:

If you don't already have `protoc` installed, you will have to download it
first from [here](https://github.com/protocolbuffers/protobuf/releases).

Make sure they are both executable and are discoverable from your PATH.

For example, in MacOS, you can do:

```
$ sudo mv ~/Downloads/protoc-gen-grpc-web-1.0.7-darwin-x86_64 \
  /usr/local/bin/protoc-gen-grpc-web
$ chmod +x /usr/local/bin/protoc-gen-grpc-web
```

### Generate Stub
- run `./generate.sh`

### Run Envoy Proxy
```sh
$ docker build -t bookservice/envoy -f ./envoy.Dockerfile .
$ docker run -d -p 8085:8085 -p 9901:9901 --network=host bookservice/envoy
```

## Run gRPC backend server
- you can run spring-grpc-java producer-server or go-grpc

## Run Clinet
- go to `demo-client` directory
- `npm i`
- `npm run serve`
