public class main {
    public static void main(String[] args){
        Gundam G1 = new Gundam();
        G1.namagundam = "HeavyArms";
        G1.rilis = "1995";

        Gundam G2 = new Gundam();
        G2.namagundam = "RX-78-2";
        G2.rilis= "0079";

        Gundam G3 = new Gundam();
        G3.namagundam = "Zaku";
        G3.rilis = "0079";

        G1.info();
        G2.info();
        G3.info();
    }
}