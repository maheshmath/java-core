import java.util.ArrayList;
import java.util.List;

class MyArray {

    public List<Integer> revArray(List<Integer> arr){

        List<Integer> revArr = new ArrayList<Integer>();
        int size = arr.size();
        for(int index=size-1;index>=0;index--) {
            revArr.add(arr.get(index));
        }
        
        return revArr;
    } 

}
public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        MyArray myArr = new MyArray();

        System.out.println("Hello, World!"+myArr.revArray(arr).toString());
    }
}
