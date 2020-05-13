drop table if exists task cascade;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start 10 increment 1;
create table task
(
    id            int8         not null,
    creation_date timestamp,
    delivery_date date,
    is_done       boolean,
    order_id      varchar(255) not null,
    primary key (id)
)
