/*
  关于java中的‘+’运算符：
  1.加法运算，求和    （两边都是数字的时候）
  2.字符串的连接运算   （两边有一个数据是字符串
  */

 public class OperatorTest05
{
    public static void main(String[]args){
        System.out.println(10+20);  //求和
        System.out.println(10+20+30);   //求和
        System.out.println(10+20+"30");  //第一个加号是求和 
        System.out.println(10+(20+"30"));//"102030"

        int a = 10;
        int b = 20;
        System.out.println("10+20=30");

        System.out.println("10+20="+ a + b ); //"10+20=1020"

        System.out.println(a + "+20=" + (a + b));
        
        System.out.println(a + " + " + b + " = " + (a + b));
        
        a = 100;
        b = 200;
        System.out.println(a + " + "+ b + " = " + (a + b));

        //引用类型 String
        //String.out是字节码文件

        String username = "aoteman";
        System.out.println("登入成功,欢迎"+ username +"回来");//  动态的


         








    }
}

