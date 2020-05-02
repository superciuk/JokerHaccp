-- begin JOKERHACCP_PURCHASE
create table JOKERHACCP_PURCHASE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ date,
    PRODUCT_ID uuid,
    SUPPLIER_ID uuid,
    LOT varchar(255),
    QUANTITY decimal(19, 2),
    UNIT varchar(50),
    PRICE decimal(19, 2),
    PAYMENT varchar(50),
    PURCHASE_DOCUMENT varchar(50),
    PURCHASE_DOCUMENT_ID varchar(255),
    NOTE varchar(255),
    --
    primary key (ID)
)^
-- end JOKERHACCP_PURCHASE

-- begin JOKERHACCP_PRODUCT
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
)^
-- end JOKERHACCP_PRODUCT
-- begin JOKERHACCP_SUPPLIER
create table JOKERHACCP_SUPPLIER (
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
    ADDRESS varchar(255),
    CAP varchar(255),
    CITY varchar(255),
    PROVINCE varchar(255),
    COUNTRY varchar(255),
    VAT varchar(255),
    FISCAL_CODE varchar(255),
    PHONE varchar(255),
    EMAIL_ADDRESS varchar(255),
    PEC varchar(255),
    SDI varchar(255),
    SUPPLIER_TYPE varchar(50),
    PRODUCT_CATEGORY varchar(50),
    --
    primary key (ID)
)^
-- end JOKERHACCP_SUPPLIER
-- begin JOKERHACCP_PREPARATION
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
    PREPARATION_DATE date,
    EXPIRATION_DATE date,
    PREPARATION_ID uuid,
    INTERNAL_LOT varchar(255),
    QUANTITY integer,
    --
    primary key (ID)
)^
-- end JOKERHACCP_PREPARATION
-- begin JOKERHACCP_CONTACT
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
)^
-- end JOKERHACCP_CONTACT
-- begin JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK
create table JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK (
    PREPARATION_PROTOTYPE_ID uuid,
    PRODUCT_ID uuid,
    primary key (PREPARATION_PROTOTYPE_ID, PRODUCT_ID)
)^
-- end JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK
-- begin JOKERHACCP_PRODUCT_SUPPLIER_LINK
create table JOKERHACCP_PRODUCT_SUPPLIER_LINK (
    PRODUCT_ID uuid,
    SUPPLIER_ID uuid,
    primary key (PRODUCT_ID, SUPPLIER_ID)
)^
-- end JOKERHACCP_PRODUCT_SUPPLIER_LINK
-- begin JOKERHACCP_PREPARATION_PROTOTYPE
create table JOKERHACCP_PREPARATION_Prototype (
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
)^
-- end JOKERHACCP_PREPARATION_PROTOTYPE
