#!/bin/bash

curl -fsSLo pwib.jar https://github.com/packwiz/packwiz-installer-bootstrap/releases/download/v0.0.3/packwiz-installer-bootstrap.jar
java -jar pwib.jar -s server -g https://raw.githubusercontent.com/RedstoneWizard08/gcsrv/revert/pack.toml
rm pwib.jar packwiz-installer.jar
chmod +x start.sh

read -p "Do you agree to the Minecraft EULA (https://account.mojang.com/documents/minecraft_eula)? " -n 1 -r
echo

if [[ ! $REPLY =~ ^[Yy]$ ]]
then
    exit 1
fi

echo "eula=true" > eula.txt
