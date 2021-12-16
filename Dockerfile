#
#  Author: Hari Sekhon
#  Date: 2016-01-16 09:58:07 +0000 (Sat, 16 Jan 2016)
#
#  vim:ts=4:sts=4:sw=4:et
#
#  https://github.com/harisekhon/Dockerfiles
#
#  If you're using my code you're welcome to connect with me on LinkedIn and optionally send me feedback to help improve or steer this or other code I publish
#
#  https://www.linkedin.com/in/harisekhon
#
#  Github file: https://github.com/HariSekhon/Dockerfiles/blob/master/ubuntu-java/Dockerfile
#

FROM ubuntu:latest
MAINTAINER Hari Sekhon (https://www.linkedin.com/in/harisekhon)

LABEL Description="Java + Ubuntu (OpenJDK)"

ENV DEBIAN_FRONTEND noninteractive

ARG JAVA_VERSION=8
ARG JAVA_RELEASE=JDK

RUN bash -c ' \
    set -euxo pipefail && \
    apt-get update && \
    pkg="openjdk-$JAVA_VERSION"; \
    if [ "$JAVA_RELEASE" = "JDK" ]; then \
        pkg="$pkg-jdk-headless"; \
    else \
        pkg="$pkg-jre-headless"; \
    fi; \
    apt-get install -y --no-install-recommends "$pkg" && \
    apt-get clean && \
    rm -fr /var/lib/apt/lists \
    '

COPY profile.d/java.sh /etc/profile.d/

ENV JAVA_HOME=/usr

CMD ["/bin/bash"]
