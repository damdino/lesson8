package les8;

public class Lesson8 {


    public static void main(String[] args) {

        Lesson8 lesson8 = new Lesson8();
        lesson8.ornekBir();
    }

    public void ornekBir() {

        String testVerisi = "| Date@01011900 | @17465 | Name@Taner | Sn@Temel | HBG@L:3@H:5@R:2.5 | HBS@L:2@H:5@R:1.5 ";

        String[] dizi = testVerisi.split("\\|");


        for (int i = 0; i < dizi.length; i++) {
            String[] dizi2 = dizi[i].split("@");
            for (int j = 0; j < dizi2.length; j++) {
                System.out.print(dizi2[j]);
            }
        }
    }
}
