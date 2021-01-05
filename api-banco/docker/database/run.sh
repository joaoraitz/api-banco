#!/bin/bash

docker build -t "database" .
docker run --rm --network=antarez -d -p 3306:3306 --name "database" "database"
