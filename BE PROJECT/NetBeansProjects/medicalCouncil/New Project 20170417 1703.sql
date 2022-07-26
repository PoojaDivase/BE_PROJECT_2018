-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema healthcare_fraud
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ healthcare_fraud;
USE healthcare_fraud;

--
-- Table structure for table `healthcare_fraud`.`admininfo`
--

DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `fn` varchar(50) NOT NULL default '',
  `ln` varchar(45) NOT NULL default '',
  `dob` varchar(45) NOT NULL default '',
  `emailid` varchar(45) NOT NULL default '',
  `num` varchar(45) NOT NULL default '',
  `uname` varchar(45) NOT NULL default '',
  `pass` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`admininfo`
--

/*!40000 ALTER TABLE `admininfo` DISABLE KEYS */;
INSERT INTO `admininfo` (`fn`,`ln`,`dob`,`emailid`,`num`,`uname`,`pass`) VALUES 
 ('yogesh','indani','9:1:1993','yog@gmail.com','9874563230','admin','admin');
/*!40000 ALTER TABLE `admininfo` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`admintable`
--

DROP TABLE IF EXISTS `admintable`;
CREATE TABLE `admintable` (
  `username` varchar(20) NOT NULL default '',
  `password` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`admintable`
--

/*!40000 ALTER TABLE `admintable` DISABLE KEYS */;
INSERT INTO `admintable` (`username`,`password`) VALUES 
 ('admin','admin');
/*!40000 ALTER TABLE `admintable` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`doctor_claim`
--

DROP TABLE IF EXISTS `doctor_claim`;
CREATE TABLE `doctor_claim` (
  `title` varchar(33) NOT NULL default '',
  `patient_name` varchar(45) NOT NULL default '',
  `dob` varchar(45) NOT NULL default '',
  `address` varchar(45) NOT NULL default '',
  `mob` varchar(45) character set latin1 collate latin1_bin NOT NULL default '',
  `id` varchar(45) NOT NULL default '',
  `insurance_nm` varchar(45) NOT NULL default '',
  `insurance_no` varchar(45) NOT NULL default '',
  `diseases` varchar(45) NOT NULL default '',
  `medicine` varchar(45) NOT NULL default '',
  `nr` varchar(45) NOT NULL default '',
  `rb` varchar(45) NOT NULL default '',
  `rd` varchar(45) NOT NULL default '',
  `sc` varchar(45) NOT NULL default '',
  `pd` varchar(45) NOT NULL default '',
  `sd` varchar(45) NOT NULL default '',
  `status` varchar(45) NOT NULL default '',
  `claimid` varchar(45) NOT NULL default '',
  `doc_username` varchar(45) NOT NULL default '',
  `date` varchar(45) NOT NULL default '',
  `time` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`claimid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`doctor_claim`
--

/*!40000 ALTER TABLE `doctor_claim` DISABLE KEYS */;
INSERT INTO `doctor_claim` (`title`,`patient_name`,`dob`,`address`,`mob`,`id`,`insurance_nm`,`insurance_no`,`diseases`,`medicine`,`nr`,`rb`,`rd`,`sc`,`pd`,`sd`,`status`,`claimid`,`doc_username`,`date`,`time`) VALUES 
 ('Mr.','yogesh','2:2:1991','pune','9488594885','yog@gmail.com','tata health insurance','T1','fever','phenylpropanolamine','4','8','raj','300','operation','fast food','new','pooja_1','pooja','13-04-2017','5:29:22 PM'),
 ('Ms.','ranveer','1:5:1995','delhi','8888889089','ran@gmail.com','tata health insurance','T10','diarrhea','attapulgite','4','8','amol','1000','blood test,sonography','more water,liquids','processed','pooja_10','pooja','11-3-2014','4:7:23 PM'),
 ('Mr.','srikant','17:9:1995','deccan','9657148021','srikant@gmail.com','tata health insurance','T2','gastroesophageal','cisapride,tegaserod','2','8','pramod','500','blood test','boiled food','new','pooja_2','pooja','13-04-2017','5:32:23 PM'),
 ('Ms.','manish','2:2:1991','hadapsar','1234567890','manisha@gmail.com','tata health insurance','T3','constipation','tegaserod','2','8','raj','300','normal chekup','boiled food','new','pooja_3','pooja','13-04-2017','5:38:14 PM'),
 ('Ms.','gauri','4:6:1987','katraj','9175690658','gau@gmail.com','tata health insurance','T4','fever','nsaids','3','10','pramod','200','blood test','non spicy','new','pooja_4','pooja','14-04-2017','8:02:43 PM');
INSERT INTO `doctor_claim` (`title`,`patient_name`,`dob`,`address`,`mob`,`id`,`insurance_nm`,`insurance_no`,`diseases`,`medicine`,`nr`,`rb`,`rd`,`sc`,`pd`,`sd`,`status`,`claimid`,`doc_username`,`date`,`time`) VALUES 
 ('Mr.','tushar','6:7:1992','mumbai','9665788657','tus@gmail.com','tata health insurance','T5','obesity,weight loss','lorcaserin','3','60','pooja','800','blood test,sugar test,colestrol','low fat food','new','pooja_5','pooja','15-05-2017','2:43:21 PM'),
 ('Ms.','yogita','11:07:1979','sangali','9098909097','yogi@gmail.com','tata health insurance','T6','gastroesophageal','cisapride','3','4','pramod','500','blood test','boiled food','processed','pooja_6','pooja','12-02-2016','1:07:23 PM'),
 ('Mr.','sachin','2:4:1978','bhor','9244867821','sach@gmail.com','tata health insurance','T7','constipation','phenolphthalein','2','7','raj','300','ecg','boiled food','processed','pooja_7','pooja','13-4-2016','2:06:34 PM'),
 ('Ms.','neelam','3:8:1995','jabalpur','9897969594','neel@gmail.com','tata health insurance','T8','headache,migraine,sinus,tension','analgin','3','15','amol','150','fever,ecg','fruits,tea,coffee','processed','pooja_8','pooja','12-3-2014','1:23:53 PM'),
 ('Mr','sangita','2:6:1992','amadpur','9292939495','san@gmail','tata health insurance','T9','obesity,weight loss','lorcaserin','3','60','rajesh','800','blood test,sugar test,colestrol','low fat food','processed','pooja_9','pooja','12-03-2015','2:3:23 PM');
INSERT INTO `doctor_claim` (`title`,`patient_name`,`dob`,`address`,`mob`,`id`,`insurance_nm`,`insurance_no`,`diseases`,`medicine`,`nr`,`rb`,`rd`,`sc`,`pd`,`sd`,`status`,`claimid`,`doc_username`,`date`,`time`) VALUES 
 ('Mr.','ajay','16:10:2001','pune','1234567890','anil@gmail.com','tata health insurance','T567','heart','xxx','2','4','pramod','1000','ecg','non oily','new','rupali_1','rupali','16-04-2017','11:14:59 AM');
/*!40000 ALTER TABLE `doctor_claim` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`doctor_info`
--

DROP TABLE IF EXISTS `doctor_info`;
CREATE TABLE `doctor_info` (
  `regn` varchar(45) NOT NULL default '',
  `title` varchar(45) NOT NULL default '',
  `firstname` varchar(45) NOT NULL default '',
  `lastname` varchar(45) NOT NULL default '',
  `dob` varchar(45) NOT NULL default '',
  `education` varchar(45) NOT NULL default '',
  `specifications` varchar(45) NOT NULL default '',
  `raddress` varchar(45) NOT NULL default '',
  `paddress` varchar(45) NOT NULL default '',
  `mob` varchar(45) NOT NULL default '',
  `emailid` varchar(45) NOT NULL default '',
  `username` varchar(45) NOT NULL default '',
  `password` varchar(45) NOT NULL default ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`doctor_info`
--

/*!40000 ALTER TABLE `doctor_info` DISABLE KEYS */;
INSERT INTO `doctor_info` (`regn`,`title`,`firstname`,`lastname`,`dob`,`education`,`specifications`,`raddress`,`paddress`,`mob`,`emailid`,`username`,`password`) VALUES 
 ('123errttt','Ms.','pooja','lakhe','3:3:1992','md','eye','mumbai','pune','9653287467','pooja@gmail.com','pooja','123'),
 ('po998uu','Mr.','rajesh','shinde','17:3:2006','mbbs','eye','mumbai','mumbai','9632587410','rajesh@gmail.com','rajesh','123'),
 ('oopp85','Mr.','amol','nalge','18:11:2001','md','eye','pune','pune','9966385247','amol@gmail.com','amol','123'),
 ('9954hf','Mr.','raju','kadam','18:10:2005','md','ent','nashik','nashik','9856321474','raj@yahoo.com','raj','123'),
 ('null','null','karan','kk','5:3:1995','null','null','null','null','9652387410','dfg@gmail.com','null','karan'),
 ('PUN007','Mr.','pramod','salunkhe','2:4:1993','ms diabetes','diabetes','mumbai','pune,india','9175690657','adk0657@gmail.com','pramod','1234'),
 ('MUM10234','Mr.','Anil','Kumar','1:1:1992','Ms','diabetes','pune','pune','1234567890','anil@gmail.com','anil','123'),
 ('null','null','swapnil','badgujar','14:3:2001','null','null','null','null','1234567890','swap@gmail.com','null','1234');
INSERT INTO `doctor_info` (`regn`,`title`,`firstname`,`lastname`,`dob`,`education`,`specifications`,`raddress`,`paddress`,`mob`,`emailid`,`username`,`password`) VALUES 
 ('null','null','','','0:0:0','null','null','null','null','','','null',''),
 ('R12113','Ms.','rupali','gorad','16:11:1991','Ms','heart','mumbai','mumbai','9175690651','ruplai@gmail.com','rupali','123');
/*!40000 ALTER TABLE `doctor_info` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`drugsinfo`
--

DROP TABLE IF EXISTS `drugsinfo`;
CREATE TABLE `drugsinfo` (
  `diseases` varchar(44) NOT NULL default '',
  `drugsnm` varchar(45) NOT NULL default ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`drugsinfo`
--

/*!40000 ALTER TABLE `drugsinfo` DISABLE KEYS */;
INSERT INTO `drugsinfo` (`diseases`,`drugsnm`) VALUES 
 ('xdf','fnfd');
/*!40000 ALTER TABLE `drugsinfo` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`fraud_info`
--

DROP TABLE IF EXISTS `fraud_info`;
CREATE TABLE `fraud_info` (
  `claimid` varchar(45) NOT NULL default '',
  `doc_username` varchar(45) NOT NULL default '',
  `patient_name` varchar(45) NOT NULL default '',
  `insurance_nm` varchar(45) NOT NULL default '',
  `insurance_no` varchar(45) NOT NULL default '',
  `disease` varchar(45) NOT NULL default '',
  `date` varchar(45) NOT NULL default '',
  `time` varchar(45) NOT NULL default '',
  `fraudlevel` varchar(45) NOT NULL default ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`fraud_info`
--

/*!40000 ALTER TABLE `fraud_info` DISABLE KEYS */;
INSERT INTO `fraud_info` (`claimid`,`doc_username`,`patient_name`,`insurance_nm`,`insurance_no`,`disease`,`date`,`time`,`fraudlevel`) VALUES 
 ('pooja_3','pooja','manish','tata health insurance','T3','constipation','13-04-2017','5:38:14 PM','VERY LOW'),
 ('pooja_3','pooja','manish','tata health insurance','T3','constipation','13-04-2017','5:38:14 PM','VERY LOW'),
 ('pooja_2','pooja','srikant','tata health insurance','T2','gastroesophageal','13-04-2017','5:32:23 PM','MEDIUM'),
 ('pooja_2','pooja','srikant','tata health insurance','T2','gastroesophageal','13-04-2017','5:32:23 PM','MEDIUM'),
 ('pooja_1','pooja','yogesh','tata health insurance','T1','fever','13-04-2017','5:29:22 PM','VERY HIGH'),
 ('pooja_1','pooja','yogesh','tata health insurance','T1','fever','13-04-2017','5:29:22 PM','VERY HIGH');
/*!40000 ALTER TABLE `fraud_info` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`insurance_info`
--

DROP TABLE IF EXISTS `insurance_info`;
CREATE TABLE `insurance_info` (
  `insurance_company` varchar(45) NOT NULL default '',
  `eid` varchar(45) NOT NULL default '',
  `firstname` varchar(45) NOT NULL default '',
  `lastname` varchar(45) NOT NULL default '',
  `dob` varchar(45) NOT NULL default '',
  `position` varchar(45) NOT NULL default '',
  `address` varchar(45) NOT NULL default '',
  `mob` varchar(45) NOT NULL default '',
  `email` varchar(45) NOT NULL default '',
  `password` varchar(45) NOT NULL default ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`insurance_info`
--

/*!40000 ALTER TABLE `insurance_info` DISABLE KEYS */;
INSERT INTO `insurance_info` (`insurance_company`,`eid`,`firstname`,`lastname`,`dob`,`position`,`address`,`mob`,`email`,`password`) VALUES 
 ('tata health insurance','004u','YOGESH','INDANI','18:1:2005','Manager','pune','9404884484','yogesh88indani@gmail.com','123'),
 ('aetna life insurance','001','YOGESH','INDANI','16:3:2007','Manager','pune','9404884484','yogesh88indani@gmail.com','123'),
 ('medicare','A123','aniket','kadam','2:1:1994','Team leader','Pune','9632587410','yogesh@ahoo.com','123'),
 ('bajaj health insurance','B0089','swapnil','badgujar','13:2:2002','Team leader','pune','1234567890','swap@gmail.com','123'),
 ('aetna life insurance','A12','aniket','kadam','14:2:1990','Flower manager','pune','1234567890','anil@gmail.com','123');
/*!40000 ALTER TABLE `insurance_info` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`patient_info`
--

DROP TABLE IF EXISTS `patient_info`;
CREATE TABLE `patient_info` (
  `title` varchar(50) NOT NULL default '',
  `firstname` varchar(45) NOT NULL default '',
  `lastname` varchar(45) NOT NULL default '',
  `dob` varchar(45) NOT NULL default '',
  `address` varchar(45) NOT NULL default '',
  `mobile` varchar(45) NOT NULL default '',
  `emailid` varchar(45) NOT NULL default '',
  `health_company` varchar(45) NOT NULL default '',
  `health_no` varchar(45) NOT NULL default '',
  `username` varchar(45) NOT NULL default '',
  `password` varchar(45) NOT NULL default ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`patient_info`
--

/*!40000 ALTER TABLE `patient_info` DISABLE KEYS */;
INSERT INTO `patient_info` (`title`,`firstname`,`lastname`,`dob`,`address`,`mobile`,`emailid`,`health_company`,`health_no`,`username`,`password`) VALUES 
 ('Mr','YOGESH','INDANI','19:08:1990','mumbai','9874563210','rajesh@gmail.com','medicare','9856321470','yogesh','123');
/*!40000 ALTER TABLE `patient_info` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`rulesinfo`
--

DROP TABLE IF EXISTS `rulesinfo`;
CREATE TABLE `rulesinfo` (
  `Diseases` varchar(550) NOT NULL default '',
  `suggmedicine` varchar(545) NOT NULL default '',
  `notsuggmedicine` varchar(545) NOT NULL default '',
  `recalls` varchar(545) NOT NULL default '',
  `indays` varchar(545) NOT NULL default '',
  `refdoctor` varchar(545) NOT NULL default '',
  `servicecost` varchar(545) NOT NULL default '',
  `suggprocedures` varchar(545) NOT NULL default '',
  `notsuggprocedures` varchar(545) NOT NULL default '',
  `dietary` varchar(545) NOT NULL default '',
  `notdietary` varchar(545) NOT NULL default '',
  PRIMARY KEY  (`Diseases`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`rulesinfo`
--

/*!40000 ALTER TABLE `rulesinfo` DISABLE KEYS */;
INSERT INTO `rulesinfo` (`Diseases`,`suggmedicine`,`notsuggmedicine`,`recalls`,`indays`,`refdoctor`,`servicecost`,`suggprocedures`,`notsuggprocedures`,`dietary`,`notdietary`) VALUES 
 ('constipation ','laxatives,bulk-forming,osmotic,tegaserod','phenylpropanolamine','2','7','raj','250','normal checkup,blood test','ecg','boiled food','mutton,chicken'),
 ('diarrhea','attapulgite,bismuth subsalicylate,charcoal activated,difenoxin,kaolin,pectin,nitazoxanide','imodium,loperamide','4','8','amol','1000','blood test,sonography','operation','more water,liquids','fried items'),
 ('fever','acetaminophen,nsaids,aspirin,barbiturates,aspirin,codeine,chlorzaxozine,acetaminophen,salicylates    ','nimesulide,cisapride,phenylpropanolamine','3','10','pooja','200','blood test','operation','non spicy','fast food'),
 ('gastroesophageal','histamine h2 receptor antagonists,proton pump inhibitors,sucralfate    ','cisapride,tegaserod','2','5','pooja','300','normal checkup','blood test ','boiled food ','fried and oily food '),
 ('headache,migraine,sinus,tension ','acetaminophen,fioricet  ','analgin ,oxyphenbutazone','3','15','raj','150','check fever,ecg','surgery','fruits,tea,coffee ','cold drinks ');
INSERT INTO `rulesinfo` (`Diseases`,`suggmedicine`,`notsuggmedicine`,`recalls`,`indays`,`refdoctor`,`servicecost`,`suggprocedures`,`notsuggprocedures`,`dietary`,`notdietary`) VALUES 
 ('obesity,weight loss ','lorcaserin,sibutramine,rimonabant,metformin','fenfluramine,dexfenfluramine,rimonabant,sibutramine,phenylpropanolamine ','3 ','60','rajesh','800','blood test,sugar test,colestrol','sonography','low fat food','fast food,fried food,chicken');
/*!40000 ALTER TABLE `rulesinfo` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`serviceinfo`
--

DROP TABLE IF EXISTS `serviceinfo`;
CREATE TABLE `serviceinfo` (
  `service` varchar(55) NOT NULL default '',
  `charge` varchar(45) NOT NULL default ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`serviceinfo`
--

/*!40000 ALTER TABLE `serviceinfo` DISABLE KEYS */;
INSERT INTO `serviceinfo` (`service`,`charge`) VALUES 
 ('fever','50');
/*!40000 ALTER TABLE `serviceinfo` ENABLE KEYS */;


--
-- Table structure for table `healthcare_fraud`.`temp_claimid`
--

DROP TABLE IF EXISTS `temp_claimid`;
CREATE TABLE `temp_claimid` (
  `doctor_nm` varchar(44) NOT NULL default '',
  `claimID` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`claimID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `healthcare_fraud`.`temp_claimid`
--

/*!40000 ALTER TABLE `temp_claimid` DISABLE KEYS */;
INSERT INTO `temp_claimid` (`doctor_nm`,`claimID`) VALUES 
 ('amol','amol_0'),
 ('anil','anil_0'),
 ('null','null_0'),
 ('pooja','pooja_0'),
 ('pramod','pramod_0'),
 ('raj','raj_0'),
 ('rupali','rupali_0');
/*!40000 ALTER TABLE `temp_claimid` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
