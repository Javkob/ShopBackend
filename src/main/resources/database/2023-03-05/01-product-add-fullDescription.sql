--liquibase formatted sql
--changeset javkobwitness:4
alter table product add full_description text default null after description;