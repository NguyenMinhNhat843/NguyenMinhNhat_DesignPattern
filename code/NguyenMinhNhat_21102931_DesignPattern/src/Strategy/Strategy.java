package Strategy;

//Strategy Interface
interface WorkStrategy {
 void doWork();
}

//Concrete Strategies
class NhanVienWork implements WorkStrategy {
 public void doWork() {
     System.out.println("Nhân viên: Làm công việc được giao.");
 }
}

class TruongPhongWork implements WorkStrategy {
 public void doWork() {
     System.out.println("Trưởng phòng: Quản lý nhân viên và báo cáo.");
 }
}

class QuanLyWork implements WorkStrategy {
 public void doWork() {
     System.out.println("Quản lý: Đưa ra chiến lược và giám sát toàn bộ.");
 }
}

//Context
class Employee {
 private WorkStrategy workStrategy;

 public Employee(WorkStrategy workStrategy) {
     this.workStrategy = workStrategy;
 }

 public void setWorkStrategy(WorkStrategy workStrategy) {
     this.workStrategy = workStrategy;
 }

 public void doWork() {
     workStrategy.doWork();
 }
}

public class Strategy {
	 public static void main(String[] args) {
	     Employee nhanVien = new Employee(new NhanVienWork());
	     Employee truongPhong = new Employee(new TruongPhongWork());
	     Employee quanLy = new Employee(new QuanLyWork());

	     nhanVien.doWork();
	     truongPhong.doWork();
	     quanLy.doWork();
	 }
}
