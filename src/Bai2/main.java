package Bai2;

import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        String str = "Rikkei Academy - Rikkei Academy la hoc vien dau tien ap dung mo hinh hoc dao nguoc";
        //Khoi tao doi tuong TReeMap
        TreeMap<String,Integer> myMap = new TreeMap<>();
        //Tach chuoi str ra mang
        String[] arrStr = str.toUpperCase().split("");
        //duyet cac phan tu arrStr,day cac phan tu sang myMap
        for (int i = 0; i < arrStr.length; i++) {
            if (myMap.containsKey(arrStr[i])){
                //key arrSTr[i] da ton tai trong myMap--->tang value len 1
                myMap.put(arrStr[i],myMap.get(arrStr[i])+1);
            }else {
            //key arrSTr[i] chua ton tai trong myMap-->them 1 phan tu vao myMap
                myMap.put( arrStr[i],1);
            }
        }
        for (String key : myMap.keySet()){
            System.out.printf("%s - %d\n", key ,myMap.get(key));

        }
    }
}
