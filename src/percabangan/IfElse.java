package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 40000;
        double uangDiDompet = 40000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }
        else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang cukup, angsulannya "+angsul);
        }
        else {
            System.out.println("Uang pas.. UwU..");
        }
    }
}
