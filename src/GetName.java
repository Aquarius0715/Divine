import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GetName {
    String name;
    static List<String> badNameList;
    public void GetName() {
        while (true) {
            System.out.println("名前をローマ字半角で入力してください");
            this.name = new Scanner(System.in).nextLine();
        }
    }
}
