/*关于java中的整数型
*/
public class DateTypeTest05
{
    public static void main (String[]args){
        //100L是long类型字面值
        //x是long类型变量 8个字节
        //不存在类型转换，直接赋值
        long x =100L;
        //y变量是int类型，4个字节
        //大容量不能直接赋值给小容量 需要进行强制类型转换
        //强制类型转换需要加“强制类型转换符号” 但是运行阶段可能损失精准度。
        //所以强制类型转换谨慎使用，因为损失精度之后可能损失很严重。
        int y = (int)x;
        System.out.println(y);
        /*计算机二进制有三种表现形式
        反码 补码 原码
        */
       




    } 
}
