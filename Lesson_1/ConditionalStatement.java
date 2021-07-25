public class ConditionalStatement{
    public static void main(String[] args){
        int age = Integer.parseInt(args[0]);
        boolean isMaleGender = Boolean.parseBoolean(args[1]);
        float height = Float.parseFloat(args[2]);
        char firstLetterOfName = args[3].charAt(0);

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
            System.out.println("Рост " + height + " меньше 1.80");
        } else {
            System.out.println("Рост " + height + " не меньше 1.80");
        }

        if(firstLetterOfName == "M".charAt(0)) {
            System.out.println("Первая буква имени действительно M");
        } else if(firstLetterOfName == "I".charAt(0)) {
            System.out.println("Первая буква имени действительно I");
        } else {
            System.out.println("Первая буква имени равна " + firstLetterOfName);
        }
    }
}