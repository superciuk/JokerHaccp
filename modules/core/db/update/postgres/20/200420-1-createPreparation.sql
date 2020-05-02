create table JOKERHACCP_PREPARATION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    RONER boolean,
    RONER_TIME_IN_MINUTES integer,
    BLAST_CHILLER boolean,
    BLAST_CHILLER_TIME_IN_MINUTES integer,
    VACUUM_PACKED boolean,
    STORAGE_TEMPERATURE varchar(50),
    STORAGE_TIME_IN_DAYS integer,
    --
    primary key (ID)
);