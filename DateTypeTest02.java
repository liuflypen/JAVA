*/
 /*关于八种基本数据类型的默认值
                              一切向0看齐
 */
public class DateTypeTest02
{
    static int k = 1000;      //static必须加
     static int f;    //成员变量  成员变量没有手动赋值系统会默认赋值【局部变量不会】
     public static void main (String[]args){
        /*
        int i;       //局本变量
        System.out.println(i);
        */
       System.out.println(k);
       System.out.println(f);
     }
}
