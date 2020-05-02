create table JOKERHACCP_CONTACT (
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
    SURNAME varchar(255),
    PHONE varchar(255),
    PERSONAL_EMAIL_ADDRESS varchar(255),
    NOTE varchar(255),
    SUPPLIER_ID uuid,
    --
    primary key (ID)
);