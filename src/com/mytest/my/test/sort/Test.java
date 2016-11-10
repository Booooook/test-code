package com.mytest.my.test.sort;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bjhl on 11/1/16.
 */
public class Test {

    public static void main(String[] args) {

        File file = new File("/Users/bjhl/Downloads/2016年10月京东金融内部推荐岗位汇总.xlsx");

        System.out.println(file.getName());

    }

    public static int test(){
        try {
            int[] a = { 1, 2 };
            a[3]=1;
        }catch (Exception e) {
            System.out.println(1);
            return 2;
        }finally {
            System.out.println(3);
        }
        return 0;
    }

}


class People {

    static {
        System.out.println(1);
    }

    public People(){
        System.out.println(2);
    }


}

class Student extends People{
    static{
        System.out.println(3);
    }
    public  Student(){
        System.out.println(4);
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        try {
//            InputStream file = new FileInputStream("/Users/bjhl/Downloads/老师会员线上成交订单.xlsx");
//            Workbook rwb = WorkbookFactory.create(file);
//            Sheet st = rwb.getSheetAt(0);
//            //获取Sheet表中所包含的总行数
//            int rsRows = st.getLastRowNum();
//            //获取指定单元格的对象引用
//            for (int i = 1; i <= rsRows; i++) {
//                Comment c = st.getCellComment(i, 1);
//                String s = st.getCellComment(i, 1).getString().getString();
//                //                st.get
//                System.out.println(i+"\t"+s);
//            }
//            rwb.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}