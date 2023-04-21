/*
关于java中的赋值运算符：、
赋值类运算符包括两种：
  *基本的赋值运算符
     =
   *扩展的赋值运算符
     +=    -=  *=  /=  %=
赋值类的运算符优先级：限制性等号右边的表达式，将执行的结果赋值给左边的变量
*/
public class OperatorTest04
{
    public static void main (String[]args){
        //基本的赋值运算符
        int i = 10;
        System.out.println(i);  //15

        //扩展的赋值和运算符【+=可以翻译为“追加/累加”】
        i -= i + 5;   //等同于：i = i + 5；
        System.out.println(i);  //15

        i *= 2;   // 等同于i= i * 2
        System.out.println(i);  //30

        i /= 4;   //等同于i= i / 2
        System.out.println(i); //7

        i %= 2;   //等同于i= i % ;
        System.out.println(i);    //1
//____________________________________________________
        byte b = 10;
        b = (byte)(b+5);
        System.out.println(b); //15

        byte x = 10;
        x += 5;  //x = x+5;
        System.out.println(x);  //15




    }
}       