public class App {
    /**
     * 
     * Method that computes the sum of two(2) numbers(integers)
     */
    private static int sum2Numbers(int num1, int num2){
        return num1 + num2;
    }

    /**
     * 
     * Method that computes the sum of three(3) numbers(integers)
     */

    private static int sum3Numbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * 
     * Approaching Program with Overloading
     */
    
    /**
     * Compute sum of 2 numbers
     * @param args
     * @throws Exception
     */
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    

    /**
     * Compute sum of 3 numbers
     * @param args
     * @throws Exception
     */
    private static int computeSum(int num1, int num2,int num3){
        return num1 + num2 + num3;
    }


    public static void main(String[] args) throws Exception {
        /**
         * Invoke Methods 
         */
        System.out.println("Computing two numbers 10 and 20 = " + App.sum2Numbers(10, 20));
        System.out.println("Computing three numbers 10 and 20 and 30 = " + App.sum3Numbers(10, 20, 30));
        System.out.println("=================================");
        /**
         * Using overloading
         */
        System.out.println("Computing two numbers 10 and 20 = " + App.computeSum(10, 20));
        System.out.println("Computing three numbers 10 and 20 and 30 = " + App.computeSum(10, 20, 30));

        /**
         * Constructor from Pen Class
         */

        Pen p1 = new Pen("G-tech Pilot");
        Pen p2 = new Pen(1);
    }
}
