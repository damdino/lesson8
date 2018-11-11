package les8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listeler {

    public static void main(String[] args) {
        Listeler listeler = new Listeler();
        listeler.basitListeIslemleri();
    }

    public void basitListeIslemleri() {

        Random random = new Random();

        List<Integer> liste = new ArrayList<>();

        while (liste.size() < 100) {

            int deger = random.nextInt(1000);
            if (!liste.contains(deger)) {
                liste.add(deger);

            }
        }

        liste.forEach(item -> {
            System.out.println(item);
        });


    }
}
