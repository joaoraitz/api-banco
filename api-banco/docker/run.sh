#!/bin/bash

docker rm -f $(docker ps -aqf "name=database")
docker network rm antarez 

docker network create antarez

( cd database ; ./run.sh )