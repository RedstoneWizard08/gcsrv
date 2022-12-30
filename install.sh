#!/bin/bash

curl -fsSLo pwib.jar https://github.com/packwiz/packwiz-installer-bootstrap/releases/download/v0.0.3/packwiz-installer-bootstrap.jar
java -jar pwib.jar -s server -g https://raw.githubusercontent.com/RedstoneWizard08/gcsrv/main/pack.toml
rm pwib.jar packwiz-installer.jar
