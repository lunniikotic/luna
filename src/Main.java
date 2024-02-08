import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        int[] array = new int[5];
        arrayList.add("fggh");
        arrayList.add("jhjkk");
        arrayList.add("hjm ");
        arrayList.add("bnmm");
        arrayList.add("iuyuuii");
        Random rnd;

        {
            rnd = new Random();
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        int[] array1 = new int[10];
        int a = 0;
        int i;
        for (i = 0; i < 11; i++) {
            arrayList1.add((int) Math.round(Math.random() * 100));
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);

            arrayList2.add(String.valueOf(arrayList1));


        for (String str : arrayList2) {
            System.out.println(str);
        }
    }
}