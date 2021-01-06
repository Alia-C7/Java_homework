//打印 1 - 100 之间所有的素数
public class 打印素数 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        for(i = 1; i <= 100; i++)
        {
            for( j = 2; j <= i - 1; j++)
            {
                if(i % j == 0)
                    break;
            }
            if(i == j)
                System.out.println(i);
        }

    }
}
