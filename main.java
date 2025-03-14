package btap8;
public class main {
    public static void main(String[] args) {
        Hinhtron ht = new Hinhtron();
        ht.nhapThongTin();
        ht.tinhChuvi();
        ht.tinhDientich();
        ht.xuatTen();
        System.out.println("Chu vi: " + ht.chuvi);
        System.out.println("Diện tích: " + ht.dientich);
        Hinhtru htr = new Hinhtru();
        htr.nhapThongTin();
        htr.tinhThetich();
        htr.xuatTen();
        System.out.println("Thể tích: " + htr.thetich);
        Hinhchunhat hcn = new Hinhchunhat();
        hcn.nhapThongTin();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.xuatTen();
        System.out.println("Chu vi: " + hcn.chuvi);
        System.out.println("Diện tích: " + hcn.dientich);
        Hinhvuong hv = new Hinhvuong();
        hv.nhapThongTin();
        hv.tinhChuvi();
        hv.tinhDientich();
        hv.xuatTen();
        System.out.println("Chu vi: " + hv.chuvi);
        System.out.println("Diện tích: " + hv.dientich);
    }
}


