public class Main {
    public static void main(String[] args) {
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Пока что не дорос, малец.");
        }
        System.out.println("____________________________________________________________________________");
        int age2 =36;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Учится в универе.");
        }
        if (age2 >= 24) {
            System.out.println("Пора и поработать.");
        }
        System.out.println("____________________________________________________________________________");
        int qnty = 106;
        if (qnty < 40) {
            System.out.println("В вагоне " + (40 - qnty) + " сидячих мест и 66 стоячих.");
        }
        if (qnty == 40) {
            System.out.println("Сидячих мест нет, 66 человек могут ехать стоя.");
        }
        if (qnty > 40 && qnty < 106) {
            System.out.println("Сидячих мест нет, стоя может ехать " + (106 - qnty) + " человек.");
        }
        if (qnty >= 106) {
            System.out.println("В автобусе мест нет, ждите трамвая.");
        }
        System.out.println("____________________________________________________________________________");



        }
}