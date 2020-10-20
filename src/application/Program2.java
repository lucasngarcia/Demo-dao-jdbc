package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list){
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Department insert ===");
		Department newDepartment = new Department();
		newDepartment.setName("Games");
		departmentDao.insert(newDepartment);
		System.out.println("Department insert");
		
		System.out.println("\n=== TEST 4: Department update ===");
		dep = departmentDao.findById(4);
		dep.setName("Livros");
		departmentDao.update(dep);
		System.out.println(departmentDao.findById(4));
		
		System.out.println("\n=== TEST 6: seller delete ===");
		departmentDao.deleteById(10);
		System.out.println("Delete complete");
	}

}
