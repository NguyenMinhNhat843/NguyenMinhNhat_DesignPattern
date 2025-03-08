package State;

//State Interface
interface RoleState {
 void doWork();
}

//Concrete States
class NhanVienState implements RoleState {
 public void doWork() {
     System.out.println("Nhân viên: Làm công việc được giao.");
 }
}

class TruongPhongState implements RoleState {
 public void doWork() {
     System.out.println("Trưởng phòng: Quản lý nhân viên và báo cáo.");
 }
}

class QuanLyState implements RoleState {
 public void doWork() {
     System.out.println("Quản lý: Đưa ra chiến lược và giám sát toàn bộ.");
 }
}

//Context
class Employee {
	 private RoleState state;
	
	 public Employee(String role) {
	     if (role.equals("Nhân viên")) {
	     this.state = new NhanVienState();
	 } else if (role.equals("Trưởng phòng")) {
	     this.state = new TruongPhongState();
	 } else if (role.equals("Quản lý")) {
	         this.state = new QuanLyState();
	     }
	 }
	
	 public void setState(RoleState state) {
	     this.state = state;
	 }
	
	 public void doWork() {
	     state.doWork();
	 }
}

public class StatePattern {
	 public static void main(String[] args) {
	     Employee nhanVien = new Employee("Nhân viên");
	     Employee truongPhong = new Employee("Trưởng phòng");
	     Employee quanLy = new Employee("Quản lý");

	     nhanVien.doWork();
	     truongPhong.doWork();
	     quanLy.doWork();
	 }
}
