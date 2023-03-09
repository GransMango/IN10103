public class Main {
    public static void main(String[] args) {
        IndeksertListe<String> nyList = new IndeksertListe<>();
        nyList.leggTil("A");
        nyList.leggTil("B");
        nyList.leggTil("C");
        nyList.fjern();
        nyList.sett(1, "D");
        System.out.println(nyList);
        }


}
