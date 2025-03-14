package baitap;
import baitap.Hinhchunhat;
    import baitap.Hinhhoc;
    import baitap.Hinhtron;
    import baitap.Hinhtru;
    import baitap.Hinhvuong;
public class main {
    
    public static void main(String[] args) {
        Hinhtron hinhTron = new Hinhtron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuvi();
        hinhTron.inDientich();

        Hinhtru hinhTru = new Hinhtru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inThetich();

        Hinhchunhat hinhChuNhat = new Hinhchunhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuvi();
        hinhChuNhat.tinhDientich();
        hinhChuNhat.inChuvi();
        hinhChuNhat.inDientich();

        Hinhvuong hinhVuong = new Hinhvuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuvi();
        hinhVuong.tinhDientich();
        hinhVuong.inChuvi();
        hinhVuong.inDientich();
    }
}
