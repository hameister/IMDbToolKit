CREATE DATABASE filmdb
    WITH
    OWNER = hameiste
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
GRANT ALL PRIVILEGES ON DATABASE filmdb TO hameiste;
\c filmdb

CREATE TABLE Film (
  id              VARCHAR(255)  PRIMARY KEY,
  tconst	VARCHAR(255),
  titleType	VARCHAR(255),
  primaryTitle	VARCHAR(255),
  originalTitle	VARCHAR(255),
  isAdult	VARCHAR(255),
  startYear	VARCHAR(255),
  endYear	VARCHAR(255),
  runtimeMinutes	VARCHAR(255),
  genres VARCHAR(255)
);

