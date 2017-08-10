create database MidDb;

use MidDb;

CREATE TABLE tRemote_Factory(
Id				bigint primary key identity(1,1),
FactoryId		int not null,
FactoryName		NVARCHAR(40) not null);

select * from tRemote_Factory;

insert into tRemote_Factory(FactoryId,FactoryName)values(12345,'浙江超仪水表');
insert into tRemote_Factory(FactoryId,FactoryName)values(123456,'浙江嘉兴超仪水表');

drop table tRemote_customer;

CREATE TABLE tRemote_customer(
Id				bigint primary key identity(1,1),
UserName		NVARCHAR(60) not null,
MeterId			int unique,
OldMeterID		int,
FactoryId		int not null,
MeterAddr		NVARCHAR(60) unique not null,
Linkman			NVARCHAR(60),
Phone			NVARCHAR(30),
PaperNo			NVARCHAR(20),
Address			NVARCHAR(100),
Caliber			NVARCHAR(20),
InstallDate		datetime default current_timestamp,
IfCtrlValve		tinyint not null,
Imported		tinyint not null default 0,
UserCode		NVARCHAR(10),
Remark			NVARCHAR(200),
ExtendData1		NVARCHAR(60),
ExtendData2		NVARCHAR(60),
ExtendData3		NVARCHAR(60));

select * from tRemote_customer;

exec sys.sp_readerrorlog 0, 1, 'listening';

insert into tRemote_customer(
UserName,MeterId,OldMeterID,FactoryId,MeterAddr,
Linkman,Phone,PaperNo,Address,Caliber,InstallDate,
IfCtrlValve,Imported,UserCode,Remark,ExtendData1,ExtendData2,ExtendData3)
values('Tom',20170809,20170809,12345,'201712345','Jack','13512345678','1234567890',
'浙江省杭州市西湖区申花路789号','123',1502345010415,0,0,'1234567890','remark','1','2','3');

select * from tRemote_customer;

delete from tRemote_customer where Id = 1;
truncate table tRemote_customer;

create table tRemote_Data(
Id			bigint primary key identity(1,1),
FactoryId	int not null,
MeterAddr	NVARCHAR(60) unique not null,
ReadNumber  numeric(18,2) not null,
ReadDate	datetime default current_timestamp not null);

select * from tRemote_Data;

create table tRemote_Valve(
Id				bigint primary key identity(1,1),
FactoryId		int not null,
MeterAddr		NVARCHAR(60) unique not null,
ValveFlag		tinyint not null default 0,
InsertDate		datetime default current_timestamp not null,
IfProcess		tinyint not null default 0,
ProcessDate		datetime,
ProcessResult	tinyint,
ProcessDesc		NVARCHAR(60));

insert into tRemote_Valve(
FactoryId,MeterAddr,ValveFlag,InsertDate
)values(12345,'201712345',0,'2017-08-10 14:03:30');

select * from tRemote_Valve;