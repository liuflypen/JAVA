/*
关于基本数据类型之间的互相转换：转换规则
1.八种基本数据类型当中除布尔类型之外剩下的7中类型之间都可以互相转换
2.小容量向大容量转换称为自动嘞转换。
3.大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符 程序才能编译通过，但是在运行阶段会损失精度
4，当整数字面值没有超出byte,short,char的取值范围，可以直接赋值给byte,short,shar类型的变量
5，byte，short,char混合运算的时候，各自先转换成int类型在做运算
6多种数据类型混合运算，先转换成容量最大的那种类型
*/
public class DateTypeTast08{
    public static void main(String[]args){
        byte a =20;
        short b =1000;
        int c =1000;
        long d =c;
        int e =(int)d;
        int f =10/3;
        long g =10;
        byte h =(byte)(int)(g/3);
        short i =10;
        byte j =5;
        int k = i + j;
        char l ='a';
        System.out.println(l);
        System.out.println((byte)l);
        int m =1+100;
        System.out.println(m); 
        double dd =10 / 3;
        System.out.println(dd);
        dd = 10.0/3;
        System.out.println(dd);

    }
}
