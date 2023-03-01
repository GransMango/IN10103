public class Main {
    public static void main(String[] args) {
        Prioritetskoe<Integer> nyList = new Prioritetskoe<>();
        nyList.leggTil(1);
        nyList.leggTil(0);
        nyList.leggTil(-2);
        System.out.println(nyList);
        }


}
