public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("Возраст " + age + " больше 20");
        }

        boolean isMaleGender = false;
        if(isMaleGender) {
            System.out.println("Пол мужской");
        }
        
        if(!isMaleGender) {
            System.out.println("Пол не мужской");
        }

        float height = 1.6f;
        if(height < 1.80) {
            System.out.println("Рост меньше 1.80");
        } else {
            System.out.println("Рост не меньше 1.80");
        }

        char firstLetterOfName = 'I';
        if(firstLetterOfName == 'M') {
            System.out.println("Первая буква имени действительно M");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Первая буква имени действительно I");
        } else {
            System.out.println("Первая буква имени равна " + firstLetterOfName);
        }
    }
}