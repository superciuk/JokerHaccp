alter table JOKERHACCP_SUPPLIER add constraint FK_JOKERHACCP_SUPPLIER_ON_PRODUCT foreign key (PRODUCT_ID) references JOKERHACCP_PRODUCT(ID);
create index IDX_JOKERHACCP_SUPPLIER_ON_PRODUCT on JOKERHACCP_SUPPLIER (PRODUCT_ID);