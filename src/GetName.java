import java.util.Scanner;
public class GetName {
    String name;
    public void GetName() {
        while (true) {
            System.out.println("名前を入力してください");
            this.name = new Scanner(System.in).nextLine();
            if (name.contains("　") || name.contains(" ") || name.contains("!") || name.contains("#") || name.contains("$") || name.contains("%") || name.contains("(") || name.contains(")") || name.contains("=") || name.contains("~") || name.contains("@") || name.contains("sex") || name.contains("fuck") || name.contains("penis")) {
                System.out.println("禁止用語・記号・スペースが含まれています");
            } else if (name.isEmpty()) {

            }else {
                break;
            }

        }
    }
}
