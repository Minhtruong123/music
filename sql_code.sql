create schema music;
use music;

create table type_song(
	id_type_song int auto_increment primary key,
    type_name varchar(45)
);

create table role_user(
	id_role_user int auto_increment primary key,
    name_role_user varchar(45)
);

create table user_account(
	id_user_account int auto_increment primary key,
    user_account varchar(45),
    password_account varchar(45),
    id_role_user int,
    foreign key (id_role_user) references role_user(id_role_user)
);

create table singer(
	id_singer int auto_increment primary key,
    name_singer varchar(45),
    nationality varchar(45),
    date_of_birth date,
    gender varchar(10),
    image varchar(255),
    describe_singer mediumtext
);

create table song(
	id_song int auto_increment primary key,
    name_song varchar(45),
    release_date date,
    image varchar(255),
    length_song varchar(10),
    id_type_song int,
    foreign key (id_type_song) references type_song(id_type_song)
);

create table singer_list(
	id_song int,
    id_singer int,
    primary key (id_song, id_singer),
    foreign key (id_song) references song(id_song),
    foreign key (id_singer) references singer(id_singer)
);

create table album(
	id_album int auto_increment primary key,
    name_album varchar(45),
    release_date date,
    image varchar(255),
    describe_album mediumtext,
	id_song int,
    foreign key (id_song) references song(id_song)
);

create table author(
	id_author int auto_increment primary key,
    name_author varchar(45),
    nationality varchar(45),
    date_of_birth date,
    gender varchar(10),
    image varchar(255),
    describe_author mediumtext
);

create table author_list(
	id_song int,
    id_author int,
    primary key (id_song, id_author),
    foreign key (id_song) references song(id_song),
    foreign key (id_author) references author(id_author)
);

create table playlist(
	id_playlist int auto_increment primary key,
    name_playlist varchar(45),
    release_date date,
    image varchar(255),
    describe_playlist mediumtext
);

create table playlist_detail(
	id_song int,
    id_playlist int,
    primary key (id_song, id_playlist),
    foreign key (id_song) references song(id_song),
    foreign key (id_playlist) references playlist(id_playlist)
);