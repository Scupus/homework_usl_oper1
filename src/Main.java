public class Main {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("Пока что не дорос, малец.");
        }
        System.out.println("____________________________________________________________________________");
        int age2 =38;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
      else if (age2 >= 18 && age2 < 24) {
            System.out.println("Учится в универе.");
        }
      else if (age2 >= 24) {
                    System.out.println("Пора и поработать.");
        }
        System.out.println("____________________________________________________________________________");
        int qnty = 31;
        if (qnty < 40) {
            System.out.println("В вагоне " + (40 - qnty) + " сидячих мест и 66 стоячих.");
        }
        else if (qnty == 40) {
            System.out.println("Сидячих мест нет, 66 человек могут ехать стоя.");
        }
        else if (qnty > 40 && qnty < 106) {
            System.out.println("Сидячих мест нет, стоя может ехать " + (106 - qnty) + " человек.");
        }
        else if (qnty >= 106) {
            System.out.println("В автобусе мест нет, ждите трамвая.");
        }
        System.out.println("____________________________________________________________________________");
        int age3 = 28;
        if (age3 >= 2 && age3 < 7) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в детский сад.");
        }
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в школу.");
        }
        if (age3 >= 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить в универ.");
        }
        if (age3 >= 24) {
            System.out.println("Если возраст человека равен " + age3 + " то ему нужно ходить на работу");
        }
        System.out.println("____________________________________________________________________________");
        int age4 = 14;
        int adult = 1;
        if (age4 < 5) {
            System.out.println("Кататься нельзя категорически, даже в присутствии взрослых.");
        }
        if (age4 >= 5 && age4 <14 && adult == 1) {
            System.out.println("Кататься можно, но в присутствии взрослых.");
        }
        if (age4 >= 14) {
            System.out.println("Кататься можно, даже без родителей.");






        }
}