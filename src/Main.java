import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        arrayList.size();
        System.out.println(arrayList.toString());
        arrayList.remove(1);
        System.out.println(arrayList.toString());
        arrayList.size();
        arrayList.add(123);
        System.out.println(arrayList.toString());
        System.out.println(arrayList.toString());
        arrayList.size();
        int[] newArrayList = (int[]) arrayList.clone();
        for (int newArrayListI: newArrayList) {
            System.out.println(newArrayListI);
        }
        System.out.println(arrayList.isEmpty());
        ArrayList <Integer> intt = new ArrayList<Integer>();
        intt.add(5);
        intt.add(5);
        intt.add(5);
        System.out.println(intt.indexOf(5));
        System.out.println(arrayList.indexOf(7));
        arrayList.set(2,10);
        System.out.println(arrayList.get(10));
    }
}
