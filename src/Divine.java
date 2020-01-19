public class Divine {

    public void Divine() {
        GetBirthDay b = new GetBirthDay();
        System.out.println("誕生年は西暦"+ b.number_year + "年です");//////debug
        System.out.println("誕生月は" + b.number_month + "月です");//////debug
        System.out.println("誕生日は" + b.number_day + "日です");//////debug
            if(b.number_year < 1800) {
                System.out.println("さてはおぬし...タイムスリップしてきたな");
            } else if(b.number_year >= 1800 && b.number_year < 1989) {
                System.out.println("昭和生まれですか！");
            } else if(b.number_year >= 1983 && b.number_year < 2019) {
                System.out.println("平成生まれ！まだ若いですね");
            } else if(b.number_year >= 2019) {
                System.out.println("令和生まれ！なんで文字読めてるの？ｗ");
            } else

            switch (b.number_month) {
                case 0:
                    System.out.println("debug");/////debug
                case 1:
                    System.out.println("1月生まれですか、あなたは素朴ですね");
                case 2:
                    System.out.println("2月生まれですか、あなたは純潔ですね");
                case 3:
                    System.out.println("3月生まれですか、あなたは思いやりがありますね");
                case 4:
                    System.out.println("4月生まれですか、あなたの心は美しいですね");
                case 5:
                    System.out.println("5月生まれですか、あなたには幸福が訪れるでしょう");
                case 6:
                    System.out.println("5月生まれですか、あなたには愛があります");
                case 7:
                    System.out.println("7月生まれですか、あなたには威厳があります");
                case 8:
                    System.out.println("8月生まれですか、気をつけてください。偽りの富が見えます");
                case 9:
                    System.out.println("9月生まれですか、あなたには不安定さが見られます");
                case 10:
                    System.out.println("10月生まれですか、あなたには希望が見えます");
                case 11:
                    System.out.println("11月生まれですか、あなたは緻密な判断ができます");
                case 12:
                    System.out.println("12月生まれですか、あなたは清純ですね");
                    break;
            }

        }
    }
