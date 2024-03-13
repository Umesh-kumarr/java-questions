import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();

        obj.add("Apple");
        obj.add("Banana");
        obj.add("Cherry");
        obj.add("Date");
        System.out.println(obj);

        int i = 0;
        int j = obj.size()- 1;
        while (i<j ) {
            String a = obj.get(i);
            String b = obj.get(j);
            String temp = a;
            a = b;
            b = temp;
            obj.set(i, a);
            obj.set(j, b);
            i++;
            j--;
        }
            System.out.println(obj);
        }
    }