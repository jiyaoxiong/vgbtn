package cn.tedu;

public class Test1 {
    public static void main(String[] args) {
        int[] a = {1,5,2,2,3,5};
        //判断内容是否重复
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 1; j <a.length ; j++) {
                if(a[i]==a[j]){
                    System.out.println("true");
                    break;
                }
            }
        }
    }
}
