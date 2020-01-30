public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private int[] arrayList;
    private int size;
    private int index;
    MyArrayList(){
        arrayList = new int[DEFAULT_CAPACITY];
    }
    MyArrayList(int capacity){
        arrayList = new int[capacity];
    }
    public void add(int value){
        if (index == arrayList.length)
            moreCapacity();
        arrayList[index] = value;
        index++;
        size++;
    }
    private void moreCapacity(){
        int[] newArrayList = new int[arrayList.length + 1];
        System.arraycopy(arrayList, 0,newArrayList, 0, index);
        arrayList = newArrayList;
    }
    public int indexOf(int value) {
        int num = -1;
        for (int index = 0; index < arrayList.length; index++) {
            if (value == arrayList[index]){
                num = index;
                break;
            }
        }
        return num;
    }
    public boolean contains(int value){
        boolean bool = false;
        for (int index = 0; index < arrayList.length; index++){
            if (value == arrayList[index]) {
                bool = true;
                break;
                }

            }
        return bool;
        }
    public void size(){
        System.out.println(size);
    }
    @Override
    public String toString(){
        String list = "";
        for (int index:arrayList) {
            list = list + " " + "[" + String.valueOf(index)+"]";
        }
        return list;
    }
    public void remove(int value){
        int[] newArrayList = new int[arrayList.length - 1];
        System.arraycopy(arrayList, 0 ,newArrayList,0, value - 1);
        System.arraycopy(arrayList, value, newArrayList, value - 1, arrayList.length - value);
        arrayList = newArrayList;
        index--;
        size--;
    }
    public void clear(){
        int[] newArrayList = new int[DEFAULT_CAPACITY];
        arrayList = newArrayList;
        index = 0;
        size = 0;
    }
    public Object clone(){
        return arrayList;
    }
    public boolean isEmpty(){
        boolean bool = true;
        for (int array:arrayList)
        if(arrayList[array] != 0) {
            bool = false;
            break;
        }
        return bool;
    }
    public void set(int value, int index){
        arrayList[index] = value;
    }
    public int get(int index){
       return arrayList[index];
    }
}
