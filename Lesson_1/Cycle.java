public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int j = 6;
        while(j >= -6) {
            System.out.println(j);
            j = j - 2;
        }

        int result = 0;
        int k = 10;
        do {
            if(k % 2 != 0) {
                result = result + k;
            }
            k++;
        } while(k <= 20);
        System.out.println(result);
    }
}