public class EWallet extends Payment {

    // Override method dari superclass
    @Override
    public void process(int amount) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp " + amount + "... Suksess!");
    }

    // Method khusus subclass
    public void inputPin() {
        System.out.println("Memasukkan 6 digit PIN E-Wallet...");
    }
}