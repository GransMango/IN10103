public class Main {
    public static void main(String[] args) {
        /*
        TestLeggTil tester = new TestLeggTil();
        tester.testAll();

         */
        Prioritetskoe<Integer> nyList = new Prioritetskoe<>();
        for (int i = 100; i > 0; i--) {
            nyList.leggTil(i);
        }
        System.out.println(nyList);
        // System.out.println(nyList);
       // System.out.println(nyList);


        }


}
