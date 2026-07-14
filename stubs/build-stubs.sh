#!/usr/bin/env bash
# Build the compilation stub jar used when compiling the decompiled game
# sources. These stubs stand in for native/platform classes (DirectX, OpenGL,
# Microsoft J++ runtime, Jagex native peers, browser JSObject, etc.) that the
# games reference but that are not part of the standard JDK.
#
# Mirrors scripts/build-stubs.sh from Kreijstal/dekobloko-work.
set -euo pipefail

cd "$(dirname "$0")"

SRC_DIR="src"
CLASSES_DIR="classes"

rm -rf "$CLASSES_DIR"
mkdir -p "$CLASSES_DIR"

if javac --help 2>&1 | grep -q -- '--release'; then
  javac --release 8 -d "$CLASSES_DIR" $(find "$SRC_DIR" -name '*.java' | sort)
else
  javac -source 8 -target 8 -d "$CLASSES_DIR" $(find "$SRC_DIR" -name '*.java' | sort)
fi

jar cf funorb-stubs.jar -C "$CLASSES_DIR" .
echo "Built funorb-stubs.jar"
