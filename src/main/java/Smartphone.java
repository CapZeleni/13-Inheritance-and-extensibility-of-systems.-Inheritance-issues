public class Smartphone extends Product {

    protected String vender;

    public Smartphone(int id, String name, int price, String vender) {
        super(id, name, price);
        this.vender = vender;
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }
}
