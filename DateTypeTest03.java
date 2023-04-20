/*
关于java语言中的char类型：
   转义字符  \
   ！！转义字符出现在特殊字符之前会将特殊字符转换成普通字符！！
   */
  public class DateTypeTest03
  {
    public static void main(String[]args){
     char c1 = 'n';   //普通的n字符
     System.out.println(c1);
     char c2 ='\n';    
     //  '\' 是一个"换行符"，属于 char类型的数据
     //反斜杠在java语言中具有转义功能
     //println输出之后换行，print表示输出，但是不换行
        System.out.print ("A");
        System.out.print (c2);
        System.out.println ("B");
         
         //普通的t字符
         char x = '\t';
         System.out.print(x);

         //制表符 TAB
         //强调：制表符和空格不同，他们的ASCII不同，体现在键盘上两个不同的摁键
         char y ='\t';
         System.out.print("A");
         System.out.print(y);
         System.out.println ("B"); 

         //输出一个'\'
         char k ='\\';
         System.out.println(k);  //第一个反斜杠具有转义功能，将后面的反斜杠转义为普通反斜杠字符。
         //输出一个单引号'''
         char a ='\'';
         System.out.println(a);  //反斜杠将第二个单引号转换成普通单引号字符
         //输出一个双引号'"'
         char f ='"';
         System.out.println(f);


         System.out.println("HelloWord!");
         System.out.println("\"HelloWord!\"");
         
         char m ='中';
         System.out.println(m);
         //JDK中自带native2ascii.exe命令，可以将文字转换成unicode编码形式
         //如何使用这个命令：
         //在命令行输入native2ascii 回车，然后输入文字之后回车即可得到uniclode编码。
         char n = '\u4e2d';   //‘中’的unicloud编码
         System.out.println(n);
         char g ='\u0000';
         System.out.println(g);





         
         }
  }