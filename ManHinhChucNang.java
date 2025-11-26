import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ManHinhChucNang {

    public ManHinhChucNang(String vaiTro, String tenDangNhap) {
        JFrame manHinh = new JFrame("Smart Parking - Chức Năng Chính (" + vaiTro + ")");
        manHinh.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        

        Dimension kichThuocManHinh = Toolkit.getDefaultToolkit().getScreenSize();
        

        int rong = kichThuocManHinh.width / 2;
        int cao = kichThuocManHinh.height / 2;
        manHinh.setSize(rong, cao);
        

        int x = (kichThuocManHinh.width - rong) / 2;
        int y = (kichThuocManHinh.height - cao) / 2;
        manHinh.setLocation(x, y);


        
        JLabel chaoMung = new JLabel("Chào mừng " + tenDangNhap + " với vai trò " + vaiTro + "!", SwingConstants.CENTER);
        chaoMung.setFont(chaoMung.getFont().deriveFont(24f));
        manHinh.add(chaoMung); 


        manHinh.setVisible(true);
    }
}