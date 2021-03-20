package com.israel.employee;

import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(listeners.DotTestListener.class)
public class EmployeeTest {
  Employee employee = new Employee();
  String expectedId = "123456789";
  String expectedName = "Israel Rivas";
  String expectedDepartment = "Technology";
  int expectedAge = 37;

  @BeforeSuite
  void initializeObject() {
    employee.setId(expectedId);
    employee.setName(expectedName);
    employee.setAge(expectedAge);
    employee.setDepartment(expectedDepartment);
  }

  @Test(priority = 1)
  void testGetName() {
    Assert.assertEquals(employee.getName(), expectedName);
  }

  @Test(priority = 1)
  void testSetName() {
    String newName = "Lazarillo de Tormes";
    employee.setName(newName);
    Assert.assertEquals(employee.getName(), newName);
  }

  @Test(priority = 1)
  void testGetAge() {
    Assert.assertEquals(employee.getAge(), expectedAge);
  }

  @Test(priority = 1)
  void testSetAge() {
    employee.setAge(51);
    Assert.assertEquals(employee.getAge(), 51);
  }

  @Test(priority = 1)
  void testGetId() {
    Assert.assertEquals(employee.getId(), expectedId);
  }

  @Test(priority = 1)
  void testSetId() {
    String newId = "987654321";
    employee.setId(newId);
    Assert.assertEquals(employee.getId(), newId);
  }

  @Test(priority = 1)
  void testGetDepartment() {
    Assert.assertEquals(employee.getDepartment(), expectedDepartment);
  }

  @Test(priority = 1)
  void testSetDepartment() {
    String newDepartment = "Legal";
    employee.setDepartment(newDepartment);
    Assert.assertEquals(employee.getDepartment(), newDepartment);
  }

  @Test(priority = 1)
  void testEquals() {
    Employee employee1 = new Employee("111222333", "Felipe VI", "Casa Real");
    Employee employee2 = new Employee("111222331", "Felipe V", "Casa Real");
    Employee employee3 = new Employee("111222331", "Felipe IV", "Casa Real");
    Assert.assertFalse(employee1.equals(employee2));
    Assert.assertTrue(employee2.equals(employee3));
  }
}
