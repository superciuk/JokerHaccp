alter table JOKERHACCP_PREPARATION add constraint FK_JOKERHACCP_PREPARATION_ON_PREPARATION foreign key (PREPARATION_ID) references JOKERHACCP_PREPARATION_Prototype(ID);
create index IDX_JOKERHACCP_PREPARATION_ON_PREPARATION on JOKERHACCP_PREPARATION (PREPARATION_ID);
