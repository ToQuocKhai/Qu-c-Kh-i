package btap8;
public abstract class Hinhhoc {
    protected final float pi = 3.14f;
    protected String ten;
    protected float chuvi;
    protected float dientich;
    protected float thetich;

    public abstract void nhapThongTin();
    public abstract void tinhChuvi();
    public abstract void tinhDientich();
    public abstract void tinhThetich();

    public void xuatTen() {
        System.out.println("Hình: " + ten);
    }
}