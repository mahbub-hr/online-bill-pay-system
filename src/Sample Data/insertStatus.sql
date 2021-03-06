--------------------------------------------------------
--  File created - Monday-January-15-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table STATUS
--------------------------------------------------------

  CREATE TABLE "PROJECT"."STATUS" 
   (	"STATUS_ID" NUMBER(5,0), 
	"STATUS_NAME" VARCHAR2(15 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into PROJECT.STATUS
SET DEFINE OFF;
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (11,'VERIFIED');
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (12,'NOT VERIFIED');
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (13,'PROCESSING');
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (14,'PAID');
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (15,'NOT PAID');
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (16,'ADMIN');
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (17,'APPROVED');
Insert into PROJECT.STATUS (STATUS_ID,STATUS_NAME) values (18,'PENDING');
--------------------------------------------------------
--  DDL for Index STATUS_ID_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PROJECT"."STATUS_ID_PK" ON "PROJECT"."STATUS" ("STATUS_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table STATUS
--------------------------------------------------------

  ALTER TABLE "PROJECT"."STATUS" ADD CONSTRAINT "STATUS_ID_PK" PRIMARY KEY ("STATUS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "PROJECT"."STATUS" MODIFY ("STATUS_NAME" NOT NULL ENABLE);
