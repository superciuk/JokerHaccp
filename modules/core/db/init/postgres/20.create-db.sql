-- begin JOKERHACCP_PURCHASE
alter table JOKERHACCP_PURCHASE add constraint FK_JOKERHACCP_PURCHASE_ON_PRODUCT foreign key (PRODUCT_ID) references JOKERHACCP_PRODUCT(ID)^
alter table JOKERHACCP_PURCHASE add constraint FK_JOKERHACCP_PURCHASE_ON_SUPPLIER foreign key (SUPPLIER_ID) references JOKERHACCP_SUPPLIER(ID)^
create index IDX_JOKERHACCP_PURCHASE_ON_PRODUCT on JOKERHACCP_PURCHASE (PRODUCT_ID)^
create index IDX_JOKERHACCP_PURCHASE_ON_SUPPLIER on JOKERHACCP_PURCHASE (SUPPLIER_ID)^
-- end JOKERHACCP_PURCHASE

-- begin JOKERHACCP_CONTACT
alter table JOKERHACCP_CONTACT add constraint FK_JOKERHACCP_CONTACT_ON_SUPPLIER foreign key (SUPPLIER_ID) references JOKERHACCP_SUPPLIER(ID)^
create index IDX_JOKERHACCP_CONTACT_ON_SUPPLIER on JOKERHACCP_CONTACT (SUPPLIER_ID)^
-- end JOKERHACCP_CONTACT
-- begin JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK
alter table JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK add constraint FK_PREPROPRO_ON_PREPARATION_PROTOTYPE foreign key (PREPARATION_PROTOTYPE_ID) references JOKERHACCP_PREPARATION_Prototype(ID)^
alter table JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK add constraint FK_PREPROPRO_ON_PRODUCT foreign key (PRODUCT_ID) references JOKERHACCP_PRODUCT(ID)^
-- end JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK
-- begin JOKERHACCP_PRODUCT_SUPPLIER_LINK
alter table JOKERHACCP_PRODUCT_SUPPLIER_LINK add constraint FK_PROSUP_ON_PRODUCT foreign key (PRODUCT_ID) references JOKERHACCP_PRODUCT(ID)^
alter table JOKERHACCP_PRODUCT_SUPPLIER_LINK add constraint FK_PROSUP_ON_SUPPLIER foreign key (SUPPLIER_ID) references JOKERHACCP_SUPPLIER(ID)^
-- end JOKERHACCP_PRODUCT_SUPPLIER_LINK
-- begin JOKERHACCP_PREPARATION
alter table JOKERHACCP_PREPARATION add constraint FK_JOKERHACCP_PREPARATION_ON_PREPARATION foreign key (PREPARATION_ID) references JOKERHACCP_PREPARATION_Prototype(ID)^
create index IDX_JOKERHACCP_PREPARATION_ON_PREPARATION on JOKERHACCP_PREPARATION (PREPARATION_ID)^
-- end JOKERHACCP_PREPARATION