#!/usr/bin/env bash

# Run bash in a container with Ubuntu and Java.

set -e

IMAGE="java-project"
CONTAINER_NAME="java-project"
MOUNT_VOLUME=`pwd`:"/app"

docker run -it --rm -v "${MOUNT_VOLUME}" --name "${CONTAINER_NAME}" "${IMAGE}"
