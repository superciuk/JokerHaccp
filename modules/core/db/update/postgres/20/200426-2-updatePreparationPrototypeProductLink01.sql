alter table JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK add constraint FK_JOKERHACCP_PREPARPROTOTPRODUCLINK_ON_PREPARATION_PROTOTYPE foreign key (PREPARATION_PROTOTYPE_ID) references JOKERHACCP_PREPARATION_Prototype(ID);