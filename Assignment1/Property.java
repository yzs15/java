package Assignment1;
import java.util.*;
import java.math.BigDecimal;

public class Property
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int total_money_fen=0;
        int hongbao_num=0;

        System.out.print("要发的红包金额（单位元） ");
        BigDecimal total_money = input.nextBigDecimal();
        BigDecimal const_100 = new BigDecimal(100);
        total_money_fen = total_money.multiply(const_100).intValue();
        BigDecimal check_money = new BigDecimal(total_money_fen);

        if (check_money.compareTo(total_money.multiply(const_100)) != 0)
        {
            System.out.println("输入值错误，最小单位为分，程序已退出");
            System.exit(1);
        }


        System.out.print("要发的红包数（个） ");
        try
        {
            hongbao_num = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("输入值错误 （要发的红包数非整数），程序已退出");
            System.exit(1);
        }


        Random random = new Random();

        int money_fen= 0;
        int total_money_fen_left = total_money_fen;

        for (int i = 1; i<= hongbao_num; i++)
        {

            if (i < hongbao_num)
            {
                //为了公平，每个红包的期望都是一致的
                money_fen = random.nextInt(total_money_fen_left / (hongbao_num - i +1) * 2);
            }
            else
            {
               money_fen = total_money_fen_left;
            }
            BigDecimal money_yuan = new BigDecimal(money_fen);
            money_yuan = money_yuan.divide(const_100);
            System.out.print("第"+i+"个红包金额是"+money_yuan+"元\n");
            total_money_fen_left = total_money_fen_left - money_fen;
        }

    }
}
