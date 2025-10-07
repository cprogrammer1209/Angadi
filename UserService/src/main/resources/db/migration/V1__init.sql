create table users (
    id serial primary key,
    username varchar(50) not null unique,
    password varchar(100) not null,
    created_at timestamp default current_timestamp
);