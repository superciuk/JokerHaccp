alter table JOKERHACCP_PRODUCT_SUPPLIER_LINK add constraint FK_PROSUP_ON_PRODUCT foreign key (PRODUCT_ID) references JOKERHACCP_PRODUCT(ID);
alter table JOKERHACCP_PRODUCT_SUPPLIER_LINK add constraint FK_PROSUP_ON_SUPPLIER foreign key (SUPPLIER_ID) references JOKERHACCP_SUPPLIER(ID);