#!/usr/bin/env bash

set -e

DOCKERFILE="./Dockerfile"
DOCKER_IMAGE_NAME="java-project"

if [ ! -f $DOCKERFILE ]; then
  echo "Cannot find DOCKERFILE at ${DOCKERFILE}"
  echo "Are you sure you are in the right directory?"
  exit 1
fi

echo "Building $DOCKER_IMAGE_NAME from $DOCKERFILE..."
docker build -f $DOCKERFILE -t $DOCKER_IMAGE_NAME .
echo "Build: SUCCESS"
