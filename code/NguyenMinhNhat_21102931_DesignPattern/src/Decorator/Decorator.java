package Decorator;

//Component Interface
interface Employee {
 void doWork();
}

//Concrete Component
class BasicEmployee implements Employee {
 public void doWork() {
     System.out.println("Nhân viên: Làm công việc được giao.");
 }
}

//Decorator
abstract class EmployeeDecorator implements Employee {
 protected Employee employee;

 public EmployeeDecorator(Employee employee) {
     this.employee = employee;
 }

 public void doWork() {
     employee.doWork();
 }
}

//Concrete Decorators
class TruongPhongDecorator extends EmployeeDecorator {
 public TruongPhongDecorator(Employee employee) {
     super(employee);
 }

 public void doWork() {
     employee.doWork();
     System.out.println("Trưởng phòng: Quản lý nhân viên và báo cáo.");
 }
}

class QuanLyDecorator extends EmployeeDecorator {
 public QuanLyDecorator(Employee employee) {
     super(employee);
 }

 public void doWork() {
     employee.doWork();
     System.out.println("Quản lý: Đưa ra chiến lược và giám sát toàn bộ.");
 }
}

public class Decorator {
	 public static void main(String[] args) {
	     Employee nhanVien = new BasicEmployee();
	     Employee truongPhong = new TruongPhongDecorator(new BasicEmployee());
	     Employee quanLy = new QuanLyDecorator(new TruongPhongDecorator(new BasicEmployee()));

	     System.out.println("Nhân viên:");
	     nhanVien.doWork();
	     System.out.println("\nTrưởng phòng:");
	     truongPhong.doWork();
	     System.out.println("\nQuản lý:");
	     quanLy.doWork();
	 }
}
