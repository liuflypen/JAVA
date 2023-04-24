/*
 需求
 假设系统给定一个人的年龄，根据年龄判断这个人处于生命的哪个阶段，年龄必须在【0-150】
   [0-5]    幼儿
   [6-10]   少儿
   [11-18]  青少年
   [19-35]  青年
   [36-55]  中年
   [56-150] 老年
   */
   public class ifTest02
  {
    public static void main(String [] args){
        //1,接受键盘输入，年龄【输入的时候必须是数字】
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入您的年龄"); //输出提示信息
        int age = s.nextInt();
        System.out.println("age = "+ age);
        //2，根据需求进行业务逻辑判断
        String str ="老年";
        if (age < 0 || age > 150 ){
          str = "年龄不合法";
        }else if(age <= 5){
          str ="幼儿";
        }else if(age <= 10){
          str = "少年";
        }else if (age <= 18){
          str = "青少年";         
        }else if (age <= 35){
          str ="青年";
        }else if (age <= 55){
          str = "中年";
        }
        System.out.println("您处于生命周期的" + str + "阶段");
    }
  }