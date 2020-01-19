import java.util.Scanner;

public class GetBirthDay {
    String year;
    String month;
    String day;
   public int number_year;
    public int number_month;
    public int number_day;

    public void GetBirthDay() {
        System.out.println("あなたの誕生日を教えてください。2000年01月01日の場合、20000101と入力");
        int birthday = new Scanner(System.in).nextInt();
            String word_birthday = Integer.toString(birthday);
            this.year = word_birthday.substring(0, 4);
            this.month = word_birthday.substring(4, 6);
            this.day = word_birthday.substring(6, 8);
            try {
                this.number_year = Integer.parseInt(this.year);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            try {
                this.number_month = Integer.parseInt(this.month);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            try {
                this.number_day = Integer.parseInt(this.day);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            System.out.println(this.number_year + "検査後");/////debug
            System.out.println(this.number_month + "検査後");/////debug
            System.out.println(this.number_day + "検査後");/////debug
        }
    }
