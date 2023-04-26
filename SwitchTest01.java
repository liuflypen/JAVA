/*
关于switch语句
1.switch语句属于选择结构，也是分支语句
2switch语句的语法结构：
一个比较完整的switch语句应该这样写：
switch（int或string类型的字面值或变量）{
    case int或string类型的字面值或变量：
        java语句;
        ....
        break;
        case int或string类型的字面值或变量：
        java语句;
        ....
        break;
        case int或string类型的字面值或变量：
        java语句;
        ....vivienne
        break;
        case int或string类型的字面值或变量：
        java语句;
        ....
        break;
        ..
        default
        java语句;
        ...
    

}
*/
public class SwitchTest01
{
    public static  void main (String[]args){
    long x = 100L;
    switch((int)x){}

    byte b = 10;
    switch(b){}

    char c = 'A';
    switch(c){}

    String username = "zhangsan";
    switch(username){}
    
    java.util.Scanner scanner = new java .util.Scanner(System.in);
    System.out.print("请输入数字");
    int num = scanner.nextInt();
    switch(num){
        case 1 :
               System.out.println("星期一");
               break;
        case 2 : 
               System.out.println("星期二");
               break;      
        case 3 : 
               System.out.println("星期三");
               break;      
        case 4 : 
               System.out.println("星期四");
               break;            
        case 5 : 
               System.out.println("星期五");
               break;      
        case 6 : 
               System.out.println("星期六");
               break;      
        case 7 : 
               System.out.println("星期日");
               break;

        default:
        System.out.println("输入内容不合法");
                               
    }


    }

}
