/*
Navicat SQL Server Data Transfer

Source Server         : sqlserver2000-127.0.0.1
Source Server Version : 80000
Source Host           : 127.0.0.1:1433
Source Database       : db_spring
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 80000
File Encoding         : 65001

Date: 2012-08-19 09:10:18
*/


-- ----------------------------
-- Table structure for [dbo].[t_person]
-- ----------------------------
DROP TABLE [dbo].[t_person]
GO
CREATE TABLE [dbo].[t_person] (
[ID] varchar(32) NULL ,
[birthday] datetime NULL ,
[age] int NULL ,
[userName] varchar(200) NULL ,
[gender] bit NULL 
)


GO

-- ----------------------------
-- Records of t_person
-- ----------------------------
