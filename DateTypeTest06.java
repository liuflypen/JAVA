/*
关于浮点型数据类型：
float 单精度【四个字节】
double 双精度【八个字节，精度高】(不适合做财务软件)
在java语言当中，所有的浮点型字面值，默认被当作double类型来处理
想要该字面值当作float类型来处理，需要在字面值后面添加F/f
注意：
      double和float在计算机内部存储的时候存储的都是近似值。
*/
public class DateTypeTest06
{
    public static void main(String[]args){
        //3.0是double类型的字面值
        //d是double类型的变量
        double d =3.0;
        System.out.println(d);


        float f =(float)5.1; //大容量转换成小容量


    }
}
