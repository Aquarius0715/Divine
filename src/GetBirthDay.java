import java.util.Scanner;

public class GetBirthDay {
   private   String year;
    private String month;
    private String day;
    public int number_year;
    public int number_month;
    public int number_day;
    public void GetBirthDay() {
        System.out.println("あなたの誕生日を教えてください。2000年01月01日の場合、20000101と入力");
            int birthday = new Scanner(System.in).nextInt();
            String word_birthday = Integer.toString(birthday);
            this.year = word_birthday.substring(0, 4);
            System.out.println(this.year);/////debug
            this.month = word_birthday.substring(4, 6);
            System.out.println(this.month);/////debug
            this.day = word_birthday.substring(6, 8);
            System.out.println(this.day);/////debug
        try {
            this.number_year = Integer.parseInt(this.year);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            this.number_month = Integer.parseInt(this.year);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            this.number_day = Integer.parseInt(this.year);
        } catch(NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
