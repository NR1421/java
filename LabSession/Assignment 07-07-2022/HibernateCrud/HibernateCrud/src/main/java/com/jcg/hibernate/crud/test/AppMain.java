package com.jcg.hibernate.crud.test;

import java.util.List;

import org.apache.log4j.Logger;

import com.jcg.hibernate.crud.dao.DbOperations;
import com.jcg.hibernate.crud.entity.Student;

public class AppMain
{

	public final static Logger logger = Logger.getLogger(AppMain.class);

	public static void main(String[] args) {
		logger.info(".......Hibernate Crud Operations Example.......\n");

		logger.info("\n=======CREATE RECORDS=======\n");
		DbOperations.createRecord();

		logger.info("\n=======READ RECORDS=======\n");
		List<Student>viewStudents = DbOperations.displayRecords();
		if(viewStudents != null & viewStudents.size() > 0) {
			for(Student studentObj : viewStudents) {
				logger.info(studentObj.toString());
			}
		}

		logger.info("\n=======UPDATE RECORDS=======\n");
		int updateId = 1;
		DbOperations.updateRecord(updateId);
		logger.info("\n=======READ RECORDS AFTER UPDATION=======\n");
		List<Student> updateStudent = DbOperations.displayRecords();
		if(updateStudent != null & updateStudent.size() > 0) {
			for(Student studentObj : updateStudent) {
				logger.info(studentObj.toString());
			}
		}

		logger.info("\n=======DELETE RECORD=======\n");
		int deleteId = 5;
		DbOperations.deleteRecord(deleteId);
		logger.info("\n=======READ RECORDS AFTER DELETION=======\n");
		List<Student> deleteStudentRecord = DbOperations.displayRecords();
		for(Student studentObj : deleteStudentRecord) {
			logger.info(studentObj.toString());
		}

		logger.info("\n=======DELETE ALL RECORDS=======\n");
		DbOperations.deleteAllRecords();
		logger.info("\n=======READ RECORDS AFTER ALL RECORDS DELETION=======");
		List<Student> deleteAll = DbOperations.displayRecords();
		if(deleteAll.size() == 0) {
			logger.info("\nNo Records Are Present In The Database Table!\n");
		}		
		System.exit(0);
	} 
}