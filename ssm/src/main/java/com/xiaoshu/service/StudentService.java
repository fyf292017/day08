package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.MajorMapper;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.entity.Major;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class StudentService {

	@Autowired
	StudentMapper studentMapper;
	
	@Autowired
	MajorMapper majorMapper;

	public List<Major> findMajorAll() {
		// TODO Auto-generated method stub
		return majorMapper.selectAll();
	}

	public PageInfo<StudentVo> findStudentPage(StudentVo studentVo, Integer pageNum, Integer pageSize, String ordername,
			String order) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<StudentVo> userList = studentMapper.findStudentAll(studentVo);
		PageInfo<StudentVo> pageInfo = new PageInfo<StudentVo>(userList);
		return pageInfo;
	}

	public void deleteStudent(int parseInt) {
		// TODO Auto-generated method stub
		studentMapper.deleteByPrimaryKey(parseInt);
	}

	public Student findBysName(String sName) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setsName(sName);
		
		return studentMapper.selectOne(student);
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.insert(student);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updateByPrimaryKey(student);
	}

	public List<StudentVo> findList(StudentVo studentVo) {
		// TODO Auto-generated method stub
		return studentMapper.findStudentAll(studentVo);
	}
}
