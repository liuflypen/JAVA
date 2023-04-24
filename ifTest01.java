/*
 关于java语言中的if语句 属于选择结构
  1，if语句中的语法结构：四种编写方式
  第一种：
  if（布尔表示式）{
        java语句;
        java语句;
        java语句;
        java语句;
        java语句;
        ....
    }
   第二种：
   if（布尔表示式）{
        java语句;
        java语句;
        ..
        }else{
        java语句;
        java语句;
        java语句;
        ....
        }
   第三种：
   if（布尔表示式）{
        java语句;
        java语句;
        ..
        }else if(布尔表达式）{
        java语句;
        java语句;
        ..
         }else if(布尔表达式）{
        java语句;
        java语句;
        ..
         }else if(布尔表达式）{
        java语句;
        java语句;
        ..
        }     
        第四种：
         if（布尔表示式）{
        java语句;
        java语句;
        ..
        }else if(布尔表达式）{
        java语句;
        java语句;
        ..
         }else if(布尔表达式）{
        java语句;
        java语句;
        ..
         }else if(布尔表达式）{
        java语句;
        java语句;
        ..
        }else{
            java语句;
            java语句;
            ..
            }
*/
public class ifTest01
{
    public static void main(String[]args){
        //需求；所在位置的五公里范围之内有kfc的话，就去kfc吃午饭
        //公里数
        double distance = 4.0;  //单位km

        //判断语句
        if(distance < 5 ){
            System.out.println("去kcf吃饭");
        }
        /*
        需求：
        假设系统给考生一个成绩
        根据学生的成绩判断该学生的成绩等级：
        [90-100] a
        [80-90] b
        [70-80] c
        [60-70] d
        [0-60]  e
        */

       double score = 59.5;
       score = 80;
       String grade = "E等级";
       if(score < 0 || score > 100){
        grade = "成绩不合法";
       }else if (score >= 90){
        grade = "A等级";
       }else if (score >= 80){
        grade = "B等级";
       }else if (score >= 70){
        grade = "C等级";
       }else if (score >= 60){
        grade = "D等级";
       }
       System.out.println(grade);

    }
}
