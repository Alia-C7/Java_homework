//输出 1000 - 2000 之间所有的闰年
public class 输出闰年 {
    public static void main(String[] args) {
        int i = 1000;
        int count = 0;
        for(i = 1000;i <= 2000; i++)
        {
            if(i % 4 == 0 && i % 100 != 0)
            {
                System.out.println(i);
                count++;
            }
            else if(i % 400 == 0)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
