import java.util.HashMap;
import java.util.Map;

public class MockAPIDuLieu {

    private static final Map<String, String> kho_du_lieu_dang_nhap = new HashMap<>();
    private static final Map<String, String> kho_du_lieu_vai_tro = new HashMap<>();
    private static final Map<String, String> kho_du_lieu_bien_so = new HashMap<>();
    private static final Map<String, String> kho_du_lieu_loai_xe = new HashMap<>();
    private static final Map<String, String> kho_du_lieu_bien_so_sang_ten = new HashMap<>();


    static {
        kho_du_lieu_dang_nhap.put("admin", "admin123");
        kho_du_lieu_vai_tro.put("admin", "quan_ly");
        
        String ten_mac_dinh = "nguoi_lai_xe_A";
        String bs_mac_dinh = "92-A1 555.55";
        
        kho_du_lieu_dang_nhap.put(ten_mac_dinh, "xeA123");
        kho_du_lieu_vai_tro.put(ten_mac_dinh, "lai_xe");
        kho_du_lieu_bien_so.put(ten_mac_dinh, bs_mac_dinh); 
        kho_du_lieu_loai_xe.put(ten_mac_dinh, "oto");
        kho_du_lieu_bien_so_sang_ten.put(bs_mac_dinh, ten_mac_dinh); 
    }

    public static boolean dangKyNguoiDung(String tenDangNhap, String matKhau, String vaiTro) {
        return dangKyNguoiDung(tenDangNhap, matKhau, vaiTro, "", "");
    }
    
    public static boolean dangKyNguoiDung(String tenDangNhap, String matKhau, String vaiTro, String bienSo, String loaiXe) {
        if (kho_du_lieu_dang_nhap.containsKey(tenDangNhap)) return false;
        kho_du_lieu_dang_nhap.put(tenDangNhap, matKhau);
        kho_du_lieu_vai_tro.put(tenDangNhap, vaiTro);
        
        if (vaiTro.equals("lai_xe")) {
            kho_du_lieu_bien_so.put(tenDangNhap, bienSo);
            kho_du_lieu_loai_xe.put(tenDangNhap, loaiXe);
            kho_du_lieu_bien_so_sang_ten.put(bienSo, tenDangNhap);
        }
        return true;
    }

    public static boolean kiemTraDangNhap(String tenDangNhap, String matKhau) {
        return kho_du_lieu_dang_nhap.containsKey(tenDangNhap) && kho_du_lieu_dang_nhap.get(tenDangNhap).equals(matKhau);
    }
    
    public static String layVaiTro(String tenDangNhap) { return kho_du_lieu_vai_tro.get(tenDangNhap); }
    public static String getBienSoXe(String tenDangNhap) { return kho_du_lieu_bien_so.get(tenDangNhap); }
    public static String getLoaiXe(String tenDangNhap) { return kho_du_lieu_loai_xe.get(tenDangNhap); }
    public static String getTenDangNhapTheoBienSo(String bienSo) { return kho_du_lieu_bien_so_sang_ten.getOrDefault(bienSo, "Không Rõ"); }
}