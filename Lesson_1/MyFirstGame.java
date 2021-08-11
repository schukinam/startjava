public class MyFirstGame {
    public static void main(String[] args) {
        byte hiddenNumber = 77;
        int guessedNumber = 100;

        System.out.println("Игра начинается!");
        System.out.println("Ваша попытка: " + guessedNumber);
        
        while(hiddenNumber != guessedNumber) {
            if(guessedNumber > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                guessedNumber--;
            } else if(guessedNumber < hiddenNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                guessedNumber++;
            }
            System.out.println("Ваша попытка: " + guessedNumber);
        }
        System.out.println("Поздравляю, число угадано!");
    }
}