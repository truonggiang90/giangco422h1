package baithimodul2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiSanPham  {
    ArrayList<SanPham>sanPhams = new ArrayList<>();
    File file = new File("sp.txt");
    public void GhiSanSham(ArrayList<SanPham> sanPhams) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(sanPhams);
            objectOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void docFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            sanPhams = (ArrayList<SanPham>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println("Không thể đọc được file");
        }
    }

    Scanner sc = new Scanner(System.in);

    public void MenuSanPham(){
        int chon = 0;
        do {
            System.out.println("1: Xem danh sách");
            System.out.println("2: Thêm mới ");
            System.out.println("3: Cập nhập ");
            System.out.println("4: Xóa");
            System.out.println("5: Sắp xếp");
            System.out.println("6: Tìm sp có giá trị đắt nhất");
            System.out.println("7: Đọc từ file");
            System.out.println("8: Ghi từ file");
            System.out.println("9: Xem danh sách");
            System.out.println("Chọn chức năng ------");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    HienThi();
                    break;
                case 2:
                    ThemSanPham();
                    break;
                case 3:
                    CapNhapSanPham();
                    break;
                case 4:
                    XoaSanPham();
                    break;
                case 5:

                    break;
                case 6:
                    TimKiemSp();
                    break;
                case 7:

                    break;
                case 8 :

                    break;
                case 9 :
                    break;
            }

        }while (chon!=0);

        }
    public boolean checkSanPham() {
        System.out.println("Nhập mã sp ");
        int ma = Integer.parseInt(sc.nextLine());
        for (SanPham sp : sanPhams) {
            return true;
        }
        return false;
    }
    public SanPham TaoSp(){
        System.out.println("Nhập mã sp ");
        int maSp = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sp ");
        String ten = sc.nextLine();
        System.out.println("Nhập giá sp ");
        int giaSP = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Mô tả sp");
        String mota = sc.nextLine();
        return new SanPham(maSp,ten,giaSP,soLuong,mota);
    }


    public void ThemSanPham(){
        SanPham sanPham = TaoSp();
        sanPhams.add(sanPham);
    }
    public void HienThi(){
        for (SanPham sp :sanPhams) {
            System.out.println(sp);
        }
    }

    public void CapNhapSanPham(){
        System.out.println("Nhập mã cần xóa");
        int masp = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < sanPhams.size(); i ++){
            if(sanPhams.get(i).getMaSanPham()==masp){
                System.out.println("Nhập mã sp mới cần ");
            }
        System.out.println("Nhập tên sản phẩm ");
        String ten = sc.nextLine();
        System.out.println("Nhập giá sp ");
        int gia = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lương");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Mô tả ");
        String mota = sc.nextLine();
        sanPhams.get(i).setMaSanPham(masp);
        sanPhams.get(i).setTenSanPhan(ten);
        sanPhams.get(i).setGiaSanPham(gia);
        sanPhams.get(i).setSoLuong(soluong);
        sanPhams.get(i).setMoTa(mota);
        }
        if (!checkSanPham()){
            System.out.println("Nhập lại mã sp ");
        }
    }
    public void XoaSanPham(){
        System.out.println("Nhập mã cần xóa ");
        int ma = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < sanPhams.size();i++){
            if (ma == sanPhams.get(i).maSanPham){
                sanPhams.remove(sanPhams.get(i));
            }
        }
    }
    public void SapXepSanPham(){

    }
    public void TimKiemSp(){
        int max = 0;
        int k = 0;
        for (int i=0;i<sanPhams.size();i++){
            if (max<sanPhams.get(i).getGiaSanPham()){
                max = sanPhams.get(i).getGiaSanPham();
                k=i;
            }
        }
        System.out.println(sanPhams.get(k));

    }
}
