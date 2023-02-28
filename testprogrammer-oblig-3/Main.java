public class Main {
    public static void main(String[] args) {
        Prioritetskoe<Integer> nyList = new Prioritetskoe<>();
        nyList.leggTil(0, 1);
        nyList.leggTil(1, 8);
        nyList.leggTil(2, 3);
        nyList.leggTil(3, 4);
        nyList.leggTil(300);
        System.out.println(nyList);
        nyList.fjern(3);
        System.out.println(nyList);
        }


}
