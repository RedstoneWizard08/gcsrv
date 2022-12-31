#!/bin/bash

VERSION=0.4.0+1.12.2_14.23.5.2859

[[ ! -d build ]] && mkdir build

packwiz cf export --side client --output build/client/gcsrv-pack-v$VERSION-client.zip
packwiz cf export --side server --output build/server/gcsrv-pack-v$VERSION-server.zip

zip -r build/gcsrv-pack-v$VERSION.zip \
    build/client/gcsrv-pack-v$VERSION-client.zip \
    build/server/gcsrv-pack-v$VERSION-server.zip
