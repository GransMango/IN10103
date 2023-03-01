import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Prioritetskoe<Integer> nyList = new Prioritetskoe<>();
        /*
        for (int i = 100; i > 0; i--) {
            nyList.leggTil(r.nextInt(100));
        }

         */
        nyList.leggTil(4);
        nyList.leggTil(3);
        nyList.leggTil(8);
        System.out.println(nyList);
        System.out.println(nyList);
        }


}
