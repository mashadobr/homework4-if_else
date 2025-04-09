public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("задача 1");
        int age = 30;
        if (age >= 18) {
            System.out.println("Cовершеннолетний");
        }
        if (age < 18) {
            System.out.println("Не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("____________________");

        //задача 2
        System.out.println("задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        }
        System.out.println("____________________");

        //задача 3
        System.out.println("задача 3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, можно ездить спокойно");
        }
        System.out.println("____________________");
        //задача 4
        System.out.println("задача 4");
        int age1 = 10;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в университет");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему пора ходить на работу");
        }
        System.out.println("____________________");

        //задача 5
        System.out.println("задача 5");
        int ageChild = 20;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то  ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то  ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("____________________");

        //задача 6
        System.out.println("задача 6");
        int tikets = 50;
        if (tikets <= 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (tikets > 60 && tikets <= 102) {
            System.out.println("В вагоне есть стоячее место");
        } else if (tikets > 102) {
            System.out.println("В вагоне нет мест");
        }
        System.out.println("____________________");
        //задача 7
        System.out.println("задача 7");
        int one = 4;
        int two = 2;
        int three = 4;
        if (one >= two && one >= three) {
            System.out.println("Самое большое число из трех " + one);
        } else if (two > one && two >= three) {
            System.out.println("Самое большое число из трех " + two);
        } else if (three > one && three > two) {
            System.out.println("Самое большое число из трех " + three);
        }
        System.out.println("____________________");
    }
}
