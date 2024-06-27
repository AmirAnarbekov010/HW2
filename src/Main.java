import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String result = permission(23, 32);
        String result1 = permission(12, -32);
        String result2 = permission(32, 2);
        String result3 = permission(2, 32);
        String result4 = permission(23, 0);

        System.out.println(result + "\n" + result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);

        String result5 = permission(generateRundom(),23);
        String result6 = permission(generateRundom(),23);
        String result7 = permission(generateRundom(),23);
        String result8 =permission(generateRundom(),23);
        String result9 =permission(generateRundom(),23);

        System.out.println("Применен метод для рандомного значение возраста: "+result5 + "\n" + result6 + "\n" + result7 + "\n" + result8 + "\n" +result9);
    }

    // создание статичьного -"не нужно создовать екзепляр" возвращаемого метода с входящими данными
    public static String permission(int age, int temperature) {

        String result;

        if ((age > 20 && age < 45 && temperature > -20 && temperature < 30) ||
                (age < 20 && temperature > 0 && temperature < 28) ||
                (age > 45 && temperature > -10 && temperature < 25)) {
            result = "Можно идти гулять";
        } else {
            result = "Оставайся дома";
        }
        return result;
    }

    //Создание метода каторы генерирует случайные число используя клас Random
    public static int generateRundom(){
        Random random = new Random();
        int number = random.nextInt(100);
        return number;

    }
}