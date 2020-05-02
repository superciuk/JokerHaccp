alter table JOKERHACCP_SUPPLIER rename column product_id to product_id__u32158 ;
alter table JOKERHACCP_SUPPLIER drop constraint FK_JOKERHACCP_SUPPLIER_ON_PRODUCT ;
drop index IDX_JOKERHACCP_SUPPLIER_ON_PRODUCT ;
