#!/bin/bash

JAVA_PATH_BASE="$(find /usr/lib/jvm -name 'java-*8*' | head -n 1)"
JAVA_PATH="${JAVA_PATH_BASE}/bin/java"

"$JAVA_PATH" -Xmx8192M -Xms4096M -jar forge-1.12.2-14.23.5.2859-universal.jar nogui

