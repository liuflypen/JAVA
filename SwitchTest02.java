public class SwitchTest02
{
    public static void main(String[] args){
        char c ='A';
        switch(c){
            case'A':
            System.out.println("高等");
            break;
            case'B':
            System.out.println("中级");
            break;
            case'C':
            System.out.println("低级");
            break;
            default :
            System.out.println("出错了！");
        }
    }
}