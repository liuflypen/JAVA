/*
实现计算机中的
+
-
*
/
%
实现思路：
1.选择所有数据从键盘输入
2，使用switch语句进行判断
3，需要从控制台上输入三次：
  *第一个数字
  *运算符
  *第二个数字
  */
 

 public class SwitchTest03
 {
    public static void main (String[]args){
        System.out.println("欢迎使用简单计算器系统");

        System.out.print("请输入第一个数字");
        int numl = s.nextInt();

        System.out.print("请输入运算符");
        String operator = s.next();

        System.out.print("请输入第二个数字");
        int num2 = s.nextInt();

        switch(operator){
            case"+":
            ...
            break;
            case"-":
            ...
            break;
            case"*":
            ...
            break;
            case"/":
            ...
            break;
            case"%":
            ...
            break;
        }


    }
 }
