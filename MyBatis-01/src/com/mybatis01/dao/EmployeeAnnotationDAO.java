package com.mybatis01.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.mybatis01.bean.Employee;
/**
 * Employee的数据访问类
 * @author admin
 *
 */
public interface EmployeeAnnotationDAO {
	/**
	 * 根据emp_id查询Employee对象
	 * @param emp_id
	 * @return
	 */
	//注解方式 不适合长难sql、重要sql,简单的sql操作直接使用注解  混合开发
	@Select(value = "select * from tb_emp where emp_id=#{emp_id}")
	@ResultType(value = Employee.class)
	public Employee getEmployee(Integer emp_id);
	/**
	 * 根据emp_id修改Employee对象
	 * @param employee
	 * @return
	 */
	public int updateEmployee(Employee employee);
	/**
	 * 根据emp_id删除Employee对象
	 * @param emp_id
	 * @return
	 */
	public boolean deleteEmployee(Integer emp_id);
	/**
	 * 插入员工信息数据
	 * @param employee
	 * @return
	 */
	public int insertEmployee(Employee employee);
}
