public class SmartParkingApp {
    

    public static void main(String[] args) {
        System.out.println("--- UNG DUNG SMART PARKING BAT ĐAU ---");
        

        DichVuNguoiDung dichVu = new DichVuNguoiDung();
        

        System.out.println("\n--- THU NGHIEM ĐANG KY ---");

        MockAPIDuLieu.dangKyNguoiDung("nguoi_lai_xe_B", "xeB456", "lai_xe");

        MockAPIDuLieu.dangKyNguoiDung("quanly_phu", "pass_ql", "quan_ly");

        MockAPIDuLieu.dangKyNguoiDung("admin", "admin123", "quan_ly"); 



        System.out.println("\n--- THU NGHIEM ĐANG NHAP ---");
        

        dichVu.xuLyDangNhap("admin", "admin123");
        

        dichVu.xuLyDangNhap("nguoi_lai_xe_B", "xeB456"); 
        

        dichVu.xuLyDangNhap("admin", "sai_mat_khau"); 
        

        dichVu.xuLyDangNhap("nguoi_dung_khong_ton_tai", "123"); 
        
        System.out.println("\n--- KET THUC CHUONG TRINH ---");
    }
}