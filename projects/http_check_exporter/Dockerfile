FROM golang:1.14-alpine
MAINTAINER fromm huangmingyou


ADD code/http_check_exporter /opt/
COPY code/example.yml /opt/config.yml

EXPOSE 8080

CMD ["/opt/http_check_exporter","-config","/opt/config.yml"]
