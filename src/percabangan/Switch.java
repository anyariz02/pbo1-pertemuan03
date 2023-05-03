package percabangan;

public class Switch {
    public static void main(String[] args) {
        int jalanJalan=3;
        switch (jalanJalan){
            case 1:
                System.out.println("urang lapas");
                break;
            case 2:
                System.out.println("urang acayan");
                break;
            case 3:
                System.out.println("ubat nyamuk");
                break;
            case 4:
                System.out.println("dubil dit");
                break;
            default:
                System.out.println("makhluk halus");
                break;
        }

        char nilai='D';
        switch (nilai) {
            case 'A':
                System.out.println("Mhs   : \"Terima Kasih pak\"");
                System.out.println("Dosen : \"Selamat Ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen : \"3&65#?\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian ??\"");
                System.out.println("Mhs   : \"Hihihi...\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Mhs   : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"*menceleng\"");
                System.out.println("Dosen : \"Kabur...\"");
                break;
        }
    }
}
