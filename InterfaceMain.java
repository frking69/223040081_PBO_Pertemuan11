public class InterfaceMain {
    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("TF1111", "123");
        System.out.println("Otentikasi: " + kartu.otentikasi("123"));
    }

}
