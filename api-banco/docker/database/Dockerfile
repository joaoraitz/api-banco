FROM mariadb:10.3

ENV MYSQL_ROOT_USER sa
ENV MYSQL_ROOT_PASSWORD sa

COPY ./V0.1.0_initial-bancoot.sql /docker-entrypoint-initdb.d/

#COPY ./V0.2.0_sample_data.sql /docker-entrypoint-initdb.d/
#COPY ./V0.2.0_sample_jogo.sql /docker-entrypoint-initdb.d/

