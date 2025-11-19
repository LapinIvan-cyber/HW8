//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            int age = 19;
            if (age >= 18) {
                System.out.println("Если возраст человека равен 18, то он совершеннолетний");
            }
            int age1 = 17;
            if (age1 >= 18) {
                System.out.println("Если возраст человека равен 18, то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен 17, то он  еще  не достиг совершеннолетия," +
                        "  нужно немного подождать");
                int t = 4;
                if (t < 5) {
                    System.out.println("На улице " + t + " градусов, нужно надеть шапку");
                }
                int t2 = 6;
                if (t2 > 5) {
                    System.out.println("На улице " + t2 + " градусов, можно идти без шапки");
                }
                int speed = 70;
                if (speed > 60) {
                    System.out.println("Если скорость " + speed + "придется заплатить штраф");
                }
                int speed2 = 50;
                if (speed2 < 60) {
                    System.out.println("Если скорость " + speed2 + " можно ездить спокойно");
                }
                int ageFrom2To6 = 2;
                if (ageFrom2To6 >= 2 && ageFrom2To6 < 6) {
                    System.out.println("Если возраст человека равен " + ageFrom2To6 + ", то ему нужно ходить  в детский сад");
                } else {
                    System.out.println("Ему не нужно ходить в детский сад");
                }
                int ageFrom7To18 = 7;
                if (ageFrom7To18 >= 7 && ageFrom7To18 < 18) {
                    System.out.println("Если возраст человека равен " + ageFrom7To18 + ", то ему нужно ходить  в школу");
                } else {
                    System.out.println("Ему не нужно ходить в школу");
                }
                int ageFrom18To24 = 18;
                if (ageFrom18To24 >= 18 && ageFrom18To24 < 24) {
                    System.out.println("Если возраст человека равен " + ageFrom18To24 + ", то ему нужно ходить в университет");
                } else {
                    System.out.println("Ему не нужно ходить в университет");
                }
                int ageFromMoreThan24 = 25;
                if (ageFromMoreThan24 > 24) {
                    System.out.println("Если возраст человека равен " + ageFromMoreThan24 + ", то ему нужно ходить на работу");
                } else {
                    System.out.println("Ему не нужно ходить на работу");
                }
                int ageFromLessThan5 = 4;
                if (ageFromLessThan5 < 5) {
                    System.out.println("Если возраст  ребенка равен " + ageFromLessThan5 + ", то  он не может кататься на аттракционе.");
                } else {
                    System.out.println("Если больше 5 лет, то может каталься на аттракционев в присутвствии взрослого");
                }
                int ageFrom5To14 = 6;
                if (ageFrom5To14 > 5 && ageFrom5To14 < 14) {
                    System.out.println("Если возраст  ребенка равен " + ageFrom5To14 + ", то  он   может кататься на аттракционе в сопровождении  взрослого.");
                } else {
                    System.out.println("Если больше 14 лет, то может кататься без  сопровождения взрослого");
                }
                int ageFromMoreThan14 = 14;
                if (ageFromMoreThan14 >= 14) {
                    System.out.println("Если возраст  ребенка равен " + ageFromMoreThan14 + ", то  он   может кататься на " +
                            "аттракционе  без  сопровождения взрослого.");
                } else {
                    System.out.println("Если меньше 14 лет, то может кататься, но в  сопровождении взрослого ");
                }
                int place = 70;
                if (place > 60) {
                    System.out.println("Если место под номером " + place + ", то   место стоячее");
                }
                int place2 = 50;
                if (place2 <= 60 && place2 != 0) {
                    System.out.println("Если место под номером " + place2 + ", то   место сидячее");
                } else {
                    System.out.println("Если мест " + place + ", то вагон уже полностью забит ");
                }
                int One = 15;
                int Two = 8;
                int Three = 22;
                if (One >= Two && One >= Three) {
                    System.out.println("Наибольшее число " + One);
                } else if (Two >= One && Two >= Three) {
                    System.out.println("Наибольшее число " + Two);
                } else if (Three >= One && Three >= Two) {
                    System.out.println("Наибольшее число " + Three);
                }
            }
        }
    }
}








