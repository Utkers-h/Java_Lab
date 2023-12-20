import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class ArrayList_{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(10);
        list.add(30);
        list.add(50);
        System.out.println(list);

        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(20);
        newlist.add(1);

        list.addAll(newlist);
        // System.out.println(list);
        list.remove(2);
        list.set(2, 0);
        // System.out.println(list);

        // traversing the arrayList
        // for(int i=0;i<list.size();i++){
        //     System.out.println("Element is: " + list.get(i));
        // }

        // for(Integer ele : list){
        //     System.out.println("Element is: " + ele);
        // }

        // Using iterator 
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}