/*
关于变量的分类
根据变量声明的位置来分类：
*局部变量 在方法体当中声明的变量叫做局部变量
*成员变量 在方法体外【类体之内】声明的变量叫做成员变量
在不同的作用当中，变量名是可以相同的。
在同一个作用域当中，变量名不能重名
*/
public class VarTest04
{
    //成员变量
    int k =200;
    //主方法：入口
    public static void main (String[]args){
        //i变量就是局部变量
        int  i = 3;
        //java遵循就近原则
        System.out.println(i);
    }
    //成员变量
    int i =100;    //声明变量

    //doSome方法
public static void doSome(){
    //局部变量
    int i = 90;
}

}