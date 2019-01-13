# IMDbToolKit

Some Code to work with IMDb data: 
* https://www.imdb.com/interfaces/
* https://datasets.imdbws.com

# Init DB
 goto subdir ./docker

Execute:

 `docker-compose -f docker-compose.yml up`

# Connect to database with PSQL

`docker run -it --rm --link postgres_films:postgres postgres:11.1-alpine psql -h postgres -U hameiste`

