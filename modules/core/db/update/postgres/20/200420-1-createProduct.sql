create table JOKERHACCP_PRODUCT (
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
    PRODUCT_CATEGORY varchar(50),
    UNIT varchar(255),
    UNIT_PRICE decimal(19, 2),
    STORAGE varchar(50),
    STORAGE_TEMPERATURE varchar(50),
    --
    primary key (ID)
);