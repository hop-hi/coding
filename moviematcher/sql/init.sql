
create table movie_info
(
  movie_key varchar(50),
  movie_title varchar(100),
  movie_nation varchar(100),
  primary key(movie_key)
);

create table movie_actor
(
   movie_actor_key varchar(50),
   movie_key varchar(50),
   actor_key varchar(50),
   primary key(movie_actor_key)
);


create table actor_info
(
   actor_key varchar(50),
   actor_name varchar(200),
   primary key(actor_key)
);

create table movie_director
(
   movie_director_key varchar(50),
   movie_key varchar(50),
   director_key varchar(50),
   primary key(movie_director_key)
);

create table director_info
(
   director_key varchar(50),
   director_name varchar(200),
   primary key(director_key)
);


create table music_info
(
  music_key varchar(50),
  music_title varchar(100),
  primary key(music_key)
);

create table music_genres_info
(
  music_genres_key varchar(50),
  music_key varchar(50),
  genres_key varchar(50),
  primary key(music_genres_key)
);

create table genres_info
(
  genres_key varchar(50),
  genres_name varchar(100),
  primary key(genres_key)
);

create table music_artist_info
(
  music_artist_key varchar(50),
  music_key varchar(50),
  artist_key varchar(50),
  primary key(music_artist_key)
);

create table artist_info
(
  artist_key varchar(50),
  artist_name varchar(100),
  primary key(artist_key)
);



create table movie_actor
(
   movie_actor_key varchar(50),
   movie_key varchar(50),
   actor_key varchar(50),
   primary key(movie_actor_key)
);


create table actor_info
(
   actor_key varchar(50),
   actor_name varchar(200),
   primary key(actor_key)
);

create table movie_director
(
   movie_director_key varchar(50),
   movie_key varchar(50),
   director_key varchar(50),
   primary key(movie_director_key)
);

create table director_info
(
   director_key varchar(50),
   director_name varchar(200),
   primary key(director_key)
);




select * 
from   movie_info

insert into movie_info(movie_key, movie_title, movie_nation)
values('M-1111','타이타닉','미국');

insert into movie_info(movie_key, movie_title, movie_nation)
values('M-1112','미션임파서블','미국');

select *
from   movie_info
where  movie_title = '타이타닉'

insert into music_info(music_key, music_title)
values('MU-1111','밤편지');

insert into artist_info(artist_key, artist_name)
values('AR-1111','아이유');

insert into music_artist_info 
(music_artist_key, music_key, artist_key)
values('MA-1111' , 'MU-1111' , 'AR-1111')

select *
from   music_info 

select *
from   artist_info 

select *
from   music_artist_info


select *
from   music_info M
       inner join music_artist_info MA
       on M.music_key  = MA.music_key
       inner join artist_info A
       on MA.artist_key  = A.artist_key 
       