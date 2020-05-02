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
);