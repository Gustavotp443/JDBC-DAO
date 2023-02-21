package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1 : FindById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		System.out.println("\n=== TEST 2 : FindAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n=== TEST 3 : Insert ===");
//		Department newDepartment = new Department(null, "Games");
//		departmentDao.insert(newDepartment);
//		System.out.println("Insert Success");
		
		System.out.println("\n=== TEST 4 : Update ===");
		department = departmentDao.findById(7);
		department.setName("GamesChanged");
		departmentDao.update(department);
		System.out.println("Update completed");
	
		System.out.println("\n=== TEST 5 : Delete ===");
		departmentDao.deleteById(7);
		System.out.println("Delete completed");
	}

}
