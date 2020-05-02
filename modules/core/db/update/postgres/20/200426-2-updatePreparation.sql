alter table JOKERHACCP_PREPARATION rename column storage_time_in_days to storage_time_in_days__u18578 ;
alter table JOKERHACCP_PREPARATION rename column storage_temperature to storage_temperature__u73134 ;
alter table JOKERHACCP_PREPARATION rename column vacuum_packed to vacuum_packed__u35233 ;
alter table JOKERHACCP_PREPARATION rename column blast_chiller_time_in_minutes to blast_chiller_time_in_minutes__u17670 ;
alter table JOKERHACCP_PREPARATION rename column blast_chiller to blast_chiller__u67400 ;
alter table JOKERHACCP_PREPARATION rename column roner_time_in_minutes to roner_time_in_minutes__u09057 ;
alter table JOKERHACCP_PREPARATION rename column roner to roner__u24070 ;
alter table JOKERHACCP_PREPARATION rename column name to name__u50068 ;
alter table JOKERHACCP_PREPARATION add column PREPARATION_ID uuid ;
alter table JOKERHACCP_PREPARATION add column PREPARATION_DATE date ;
alter table JOKERHACCP_PREPARATION add column QUANTITY integer ;
alter table JOKERHACCP_PREPARATION add column INTERNAL_LOT varchar(255) ;
alter table JOKERHACCP_PREPARATION add column EXPIRATION_DATE date ;
