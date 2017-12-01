package com.o2.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.o2.model.UserInfo;

@Repository
public class RegistrationDao {

	@Autowired
	private  MongoTemplate mongoTemplate;

	public void saveRegistrationData(UserInfo userInfo){
		mongoTemplate.save(userInfo);
	}

}

