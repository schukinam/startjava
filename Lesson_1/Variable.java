public class Variable {
    public static void main(String[] args) {
        byte cpuCores = 2;
        short cpuCasheSizeKb = 3072;
        float cpuFrequencyMhz = 1199.951f;
        double cpuBogoMips = 4988.37;
        int ramTotalKb = 8_062_292;
        long ramVmallocTotalKb = 34_359_738_367L;
        char osNameFirstLetter = 'L';
        boolean isCudaAvailable = false;

        System.out.println("CPU cores = " + cpuCores);
        System.out.println("CPU cashe size, Kb = " + cpuCasheSizeKb);
        System.out.println("CPU frequency, MHz = " + cpuFrequencyMhz);
        System.out.println("CPU bogo MIPS = " + cpuBogoMips);
        System.out.println("RAM total, Kb = " + ramTotalKb);
        System.out.println("RAM vmalloc total, Kb = " + ramVmallocTotalKb);
        System.out.println("Operating system name first letter = " + osNameFirstLetter);
        System.out.println("Is CUDA available = " + isCudaAvailable);
    }
}