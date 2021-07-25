public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        boolean isMaleGender = false;
        float height = 1.6f;
        char firstLetterOfName = 'I';

        if(age > 20) {
            System.out.println("Возраст " + age + " больше 20");
        }

        if(isMaleGender) {
            System.out.println("Пол мужской");
        }

        if(!isMaleGender) {
            System.out.println("Пол не мужской");
        }

        if(height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост не меньше 1.80");
        }

        if(firstLetterOfName == 'M') {
            System.out.println("Первая буква имени действительно M");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Первая буква имени действительно I");
        } else {
            System.out.println("Первая буква имени равна " + firstLetterOfName);
        }
    }
}