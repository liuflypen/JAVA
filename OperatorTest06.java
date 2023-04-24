/*
三元运算符/条件运算符
    1.语法规则
      布尔表达式？表达式1：表达式2：
    2，执行原理
       当布尔表达式的结果是true的时候，选择表达式1作为整个表达式的执行结果
       当布尔表达式的结果是false的时候，选择表达式2作为整个表达式的执行结果



*/
public class OperatorTest06
{
    public static void main(String[]args){
        boolean sex = false;

        char c = sex ? '男' : '女';
        System.out.println(c);

        sex = true;
        c = (sex ? '男' : '女' );
        System.out.println(c);

        System.out.println(sex ? '男' :"女");

        String s = sex ? "男的" : "女的";
        System.out.println(s);
        


    }
}