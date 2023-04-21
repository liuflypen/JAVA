/*
关于java编程中运算符之：算术运算符
+           求和
-           相减
*           乘积      
/           商
%           求余数【取模】
++          自加1
--          自减1
注意：一个表达式中有多个运算符，运算符有优先级，
不确定加小括号，优先级得到提升 

*/
public class OperatorTest01
{
    public static void main(String[]args){
        int i =10;
        int j =3;
        System.out.println( i + j );  //13
        System.out.println( i - j );  //7
        System.out.println( i * j );  //30
        System.out.println( i / j );  //3
        System.out.println( i % j );  //1
        //关于++运算符【自加1】
        int k = 10;
        //++运算符可以出现在变量后面【单目运算符】
        k ++;
        System.out.println(k);  //11
        
        int y =10;

        //运算符可以出现在变量前面【单目运算符】
        ++ y;
        System.out.println(y);  //11

        //++出现在变量后
        //规则：先做赋值运算，再对变量中保存的值进行自家1
        int a =100;
        int b = a ++;
        System.out.println(a);   //101
        System.out.println(b);   //100

        //++出现在变量前
        //先进行自加1运算再进行赋值操作。
        int m =20;
        int n = ++ m;
        System.out.println(m);   //21
        System.out.println(n);   //21 

        int mm=500;
        System.out.println(mm);




    }
}