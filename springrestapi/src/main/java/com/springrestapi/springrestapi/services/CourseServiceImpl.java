package com.springrestapi.springrestapi.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.dao.CourseDao;
import com.springrestapi.springrestapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	// List<Course> list;
	
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course(199, "Java Core Course", "This course contain"));
//		list.add(new Course(249, "Spring Boot Course", "creating the application with the help of spring-boot which is a module of spring frame work"));
	
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {

//		Course c = null;
//		for(Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		
		// list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
	

}
