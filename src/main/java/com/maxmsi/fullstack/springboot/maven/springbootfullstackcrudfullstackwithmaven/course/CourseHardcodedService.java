package com.maxmsi.fullstack.springboot.maven.springbootfullstackcrudfullstackwithmaven.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public  class CourseHardcodedService {
		
		private static List<Course> courses = new ArrayList<>();
		private static long idCounter=0;
		
	static {
		    courses.add(new Course(++idCounter, "maxmsi", "Learn Full stack with Spring Boot and Angular"));
		    courses.add(new Course(++idCounter, "maxmsi", "Learn Full stack with Spring Boot and React"));
		    courses.add(new Course(++idCounter, "maxmsi", "Master Microservices with Spring Boot and Spring Cloud"));
		    courses.add(new Course(++idCounter, "maxmsi",
		        "Deploy Spring Boot Microservices to Cloud with Docker and Kubernetes"));
		  }
	public List<Course> findAll() {
		    return courses;
		  }
}

