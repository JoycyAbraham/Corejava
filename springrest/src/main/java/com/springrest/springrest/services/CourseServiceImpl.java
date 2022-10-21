package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDAO;
import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseDAO courseDao;
	//List<Course> list;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(1,"Java Core","Edubridge courses"));
//		list.add(new Course(2,"Spring boot","Programs using STS"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course: list) {
//			if(course.getId() == courseId)
//			{
//				c = course;
//				break;
//			}
//		}
	return courseDao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
	return courseDao.save(course);
	}
	@Override
	public Course updateCourse(Course c) {
		// TODO Auto-generated method stub
//		list.forEach(e -> {
//			if(e.getId()== c.getId()) {
//				e.setDescription(c.getDescription());
//				e.setTitle(c.getTitle());
//			}
//		});
		return courseDao.save(c);
	}
	@Override
	public void deleteCourse(long cid) {
		// TODO Auto-generated method stub
		//list = list.stream().filter(e->e.getId()!=cid).collect(Collectors.toList());
		Course cone = courseDao.getOne(cid);
		courseDao.delete(cone);
	}

}
