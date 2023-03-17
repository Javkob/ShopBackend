--liquibase formatted sql
--changeset javkobwitness:9
alter table review add moderated boolean default false;