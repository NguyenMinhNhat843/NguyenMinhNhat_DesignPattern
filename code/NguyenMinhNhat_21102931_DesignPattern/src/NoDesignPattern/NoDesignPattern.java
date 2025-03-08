package NoDesignPattern;

class Employee {
	private String role;
	
	public Employee(String role) {
		this.role = role;
	}
	
	public void doWork() {
		if (role.equals("Nhân viên")) {
			System.out.println("Nhân viên: Làm công việc được giao.");
		} else if (role.equals("Trưởng phòng")) {
			System.out.println("Trưởng phòng: Quản lý nhân viên và báo cáo.");
		} else if (role.equals("Quản lý")) {
			System.out.println("Quản lý: Đưa ra chiến lược và giám sát toàn bộ.");
		} else {
			System.out.println("Chức vụ không xác định.");
		}
	}
}

public class NoDesignPattern {
    public static void main(String[] args) {
        Employee nhanVien = new Employee("Nhân viên");
        Employee truongPhong = new Employee("Trưởng phòng");
        Employee quanLy = new Employee("Quản lý");

        nhanVien.doWork();
        truongPhong.doWork();
        quanLy.doWork();
    }
}
