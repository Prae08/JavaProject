import java.util.Scanner;
public class PerShop {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double Priceorder;
        String Typemember;

  
            System.out.println("==========|PerShop|=========");
            System.out.println("==========|Input type Member|=========");
            Typemember=kb.next();
            System.out.println("==========|Input Price order|=========");
            Priceorder=kb.nextDouble();
            String Calcsum = Calc(Typemember,Priceorder);
            System.out.println(""+ Calcsum);

    }
    public static String Calc(String member, double Price) 
    {
        if (Price >= 1000 && member.equals("Silver")) {
            double percentage = 2; //
            double result = (percentage / 100) * Price;
            String show1 = String.valueOf(result); //String.valueOf(result) การแปลงค่าจาก double เป็น String
            System.out.println("คำนวน 2%| >> "+show1);
            double result1 = Price+result;
            System.out.println("|แสดงราคา|:="+Price+"|แสดงคำนวน 2%|:="+result);
            System.out.println("|แสดงราคารวม , ราคา+ราคาคำนวน 2% |:="+result1);
            return "|Member| >> "+member+"|PSercentage 2%| >> "+show1+"|ผลรวม| >> "+result1;
        }
        else if (Price <= 1000 & member.equals("Silver")) {
            double percentage = 0; //
            double result = (percentage / 100) * Price;
            String show1 = String.valueOf(result); //String.valueOf(result) การแปลงค่าจาก double เป็น String
            System.out.println("คำนวน 0%"+show1);
            double result1 = Price+result;
            System.out.println("|แสดงราคา|:="+Price+"|แสดงคำนวน 0%|:="+result);
            System.out.println("|แสดงราคารวม , ราคา+ราคาคำนวน 0% |:="+result1);
            return "|Percentage 0%|>> "+show1+"|ผลรวม|>> "+result1;
        }
        if (Price >= 1000 && member.equals("Gold")) {
            double percentage = 2; //
            double result = (percentage / 100) * Price;
            String show1 = String.valueOf(result); //String.valueOf(result) การแปลงค่าจาก double เป็น String
            System.out.println("คำนวน 3%| >> "+show1);
            double result1 = Price+result;
            System.out.println("|แสดงราคา|:="+Price+"|แสดงคำนวน 3%|:="+result);
            System.out.println("|แสดงราคารวม , ราคา+ราคาคำนวน 3% |:="+result1);
            return "|Member| >> "+member+"|PSercentage 3%| >> "+show1+"|ผลรวม| >> "+result1;
        }
        else if (Price <= 1000 & member.equals("Gold")) {
            double percentage = 0; //
            double result = (percentage / 100) * Price;
            String show1 = String.valueOf(result); //String.valueOf(result) การแปลงค่าจาก double เป็น String
            System.out.println("คำนวน 0%"+show1);
            double result1 = Price+result;
            System.out.println("|แสดงราคา|:="+Price+"|แสดงคำนวน 0%|:="+result);
            System.out.println("|แสดงราคารวม , ราคา+ราคาคำนวน 0% |:="+result1);
            return "|Percentage 0%|>> "+show1+"|ผลรวม|>> "+result1;
        }
        if (Price >= 1000 && member.equals("Platinum")) {
            double percentage = 5; //
            double result = (percentage / 100) * Price;
            String show1 = String.valueOf(result); //String.valueOf(result) การแปลงค่าจาก double เป็น String
            System.out.println("คำนวน 5%| >> "+show1);
            double result1 = Price+result;
            System.out.println("|แสดงราคา|:="+Price+"|แสดงคำนวน 5%|:="+result);
            System.out.println("|แสดงราคารวม , ราคา+ราคาคำนวน 5% |:="+result1);
            return "|Member| >> "+member+"|PSercentage 5%| >> "+show1+"|ผลรวม| >> "+result1;
        }
        else if (Price <= 1000 & member.equals("Platinum")) {
            double percentage = 5; //
            double result = (percentage / 100) * Price;
            String show1 = String.valueOf(result); //String.valueOf(result) การแปลงค่าจาก double เป็น String
            System.out.println("คำนวน 5%| >> "+show1);
            double result1 = Price+result;
            System.out.println("|แสดงราคา|:="+Price+"|แสดงคำนวน 5%|:="+result);
            System.out.println("|แสดงราคารวม , ราคา+ราคาคำนวน 5% |:="+result1);
            return "|Member| >> "+member+"|PSercentage 5%| >> "+show1+"|ผลรวม| >> "+result1;
        }
        else return ("==========|PerShop|=========");
        

    }
}
