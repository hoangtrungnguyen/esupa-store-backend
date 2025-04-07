FROM ubuntu:latest
LABEL authors="nguyen"

ENTRYPOINT ["top", "-b"]