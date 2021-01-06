import java.util.Scanner;

//给定一个数字，判定一个数字是否是素数
public class 判定素数 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int input = sca.nextInt();
        int i = 0;
            for(i = 2; i < input; i++)
            {
                if(input % i ==0)
                    break;
            }
            if(i == input)
                System.out.print("YES\n");
            else
                System.out.print("NO\n");
        }
}
