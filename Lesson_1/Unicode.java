public class Unicode {
    public static void main(String[] args) throws Exception {
        char symbolResult;
        for(int i = 9398; i <= 10178; i++) {
            symbolResult = (char) i;
            System.out.println("Код: " + i + "; Символ: " + symbolResult);
        }
        
    }
}