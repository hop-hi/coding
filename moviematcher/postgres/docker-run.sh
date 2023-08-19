docker run -d \
	--name movie-postgres \
    -p 5432:5432 \
	-e POSTGRES_PASSWORD=1234 \
	-e PGDATA=/var/lib/postgresql/data/pgdata \
	-v /c/Users/stuko/git-all-install/git-duna/coding/moviematcher/postgres/volume:/var/lib/postgresql/data \
	postgres

