/*
需求 
判断当前天气
下雨：带雨伞
判断性别：
男：带黑伞
女带花伞

晴天：
判断温度：
温度在30以上：
男：戴墨镜
女：擦防晒霜
*/




public class ifTest03
{
    public static void main (String[]args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("欢迎使用本系统，您通过本系统可以完成一些简单的判断");
        System.out.println("说明1：1代表下雨，0代表晴天");
        System.out.println("说明2：1代表男，0代表女");
        System.out.println("说明3：温度为数字");

        //接受性别
        System.out.print("请输入性别");
        int sex = s.nextInt();

        //接收天气的状况
        System.out.println("请输入当前天气情况：");
        int weather = s.nextInt();
        
        //判断天气状况
        if(weather == 1 ){
            //下雨天
            //System.out.println("下雨天");
            if (sex == 1){
                System.out.println("带一把黑伞");
            }else if (sex == 0 ){
                System.out.println("带一把花伞");
            }

        }else if(weather == 0 ){
            //晴天
            //System.out.println("晴天");
            //接收温度
            System.out.print("请输入当前的温度");
            int tem = s.nextInt();
            if (tem > 30){
                if(sex == 1){
                    System.out.println("戴墨镜");
                }else if (sex == 0){
                    System.out.println("擦防晒霜");

                }

            }


        }    
        
    }
}