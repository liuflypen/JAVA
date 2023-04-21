/*
逻辑运算符
    &    逻辑与 （两边的算子都是ture，结果才是ture）
    |    逻辑或 （两边的算子只要有一个是ture，结果就是徒惹）
    !    逻辑非 （取反，！false就是ture，！true就是false，这是一个单目运算符号）
    ^    逻辑异或 （两边的算子只要不一样，结果就是true）

    &&   短路与   和逻辑与运算结果相同，只不过存在短路现象
    ||   短路或   和逻辑或运算结果相同，只不过存在短路现象

   1,逻辑运算符要求两边的算子都是布尔类型，并且逻辑运算符最终的运算结果也是一个布尔类型
  
   */
public class OperatorTest03
{
    public static vorm main(string[]ard){
        //运算符号优先级不确定，加小括号）
        System.out.println(5 > 3 & 5 > 2);
        System.out.println(5 > 3 & 5 > 6);
        System.out.println(5 > 3 | 5 > 6);
        
    }
}