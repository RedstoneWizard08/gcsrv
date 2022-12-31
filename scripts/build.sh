#!/bin/bash

VERSION=0.3.1+1.12.2_14.23.5.2859

[[ ! -d build ]] && mkdir build

packwiz cf export --side client --output build/gcsrv-pack-v$VERSION-client.zip
packwiz cf export --side server --output build/gcsrv-pack-v$VERSION-server.zip

zip -r gcsrv-pack-v$VERSION.zip build
