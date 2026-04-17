public class MainGateway {
    public static void main(String[] args) {

        // Array bertipe Payment (parent)
        Payment[] payments = new Payment[2];

        payments[0] = new EWallet(); 
        // UPCASTING: object EWallet disimpan sebagai tipe Payment

        payments[1] = new CreditCard(); 
        // UPCASTING: object CreditCard disimpan sebagai tipe Payment

        // Looping untuk polymorphism
        for (Payment p : payments) {
            p.process(100000);

            // Mengecek tipe asli object
            if (p instanceof EWallet) {

                EWallet ew = (EWallet) p; 
                // DOWNCASTING: dari Payment kembali ke EWallet

                ew.inputPin();
            }

            System.out.println();
        }
    }
}