package baithimodul2;

import java.io.Serializable;

public class SanPham implements Serializable {
    public int maSanPham;
    public String tenSanPhan;
    public int giaSanPham;
    public int soLuong;
    public String moTa;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPhan, int giaSanPham, int soLuong, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPhan = tenSanPhan;
        this.giaSanPham = giaSanPham;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPhan() {
        return tenSanPhan;
    }

    public int getGiaSanPham() {
        return giaSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setTenSanPhan(String tenSanPhan) {
        this.tenSanPhan = tenSanPhan;
    }

    public void setGiaSanPham(int giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPhan='" + tenSanPhan + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
