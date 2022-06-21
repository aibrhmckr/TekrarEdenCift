import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] list = {4,2,5,9,13,2,4,35,48,4,2,35};
        ArrayList<Integer>tekrarEden=new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i!=j && list[j]==list[i] && list[j]%2==0){
                    if(!isFind(tekrarEden,list[i])){
                        tekrarEden.add(list[i]);
                    }
                    break;
                }

            }
        }
        for (int i:tekrarEden) {
            System.out.print(i+" ");
        }
    }
    static boolean isFind(ArrayList<Integer> arr, int value){
            for(int i : arr){
                if(i==value){
                    return true;
                }
            }
        return false;
    }
}
