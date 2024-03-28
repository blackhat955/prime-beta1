FROM ubuntu:latest
LABEL authors="ironfeast"

ENTRYPOINT ["top", "-b"]