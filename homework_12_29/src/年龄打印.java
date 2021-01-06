import java.util.Scanner;

//根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
public class 年龄打印 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int input = sca.nextInt();
        if(input <= 18)
            System.out.println("少年");
        else if(input >= 19 && input <= 28)
            System.out.println("青年");
        else if(input >= 29 && input <= 55)
            System.out.println("中年");
        else
            System.out.println("老年");
    }
}
