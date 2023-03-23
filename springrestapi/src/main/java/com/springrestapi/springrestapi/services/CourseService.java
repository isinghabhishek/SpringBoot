package com.springrestapi.springrestapi.services;

import java.util.*;

import com.springrestapi.springrestapi.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseID);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);
}
