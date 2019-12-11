# spring-sec-sample-app

## Build docker containers

To serve a MySQL server in a docker container, run the following command.
```shell script
$ docker-compose up -d
```

### Confirm a connection to MySQL server in the container

Run the following command.  
(Only if you have installed MySQL client.)
```shell script
$ mysql -h 127.0.0.1 -uroot -proot
```

Or login the docker container and run mysql command.
```shell script
$ docker exec -it ${CONTAINER-ID} bash
/# mysql -uroot -proot
```
