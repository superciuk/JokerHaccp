create table JOKERHACCP_PREPARATION_1 (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PREPARATION_DATE date,
    EXPIRATION_DATE date,
    PREPARATION_ID uuid,
    INTERNAL_LOT varchar(255),
    --
    primary key (ID)
);