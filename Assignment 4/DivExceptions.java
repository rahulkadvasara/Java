class DivExceptions{
    void div(String s1,String s2){
        int c = 0;
        try{
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            c = a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero!");
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input: Please enter valid numbers.");
        } catch(Exception e){
            System.out.println("Something went wrong!!");
        } finally{
            System.out.println("Result :" + (c != 0 ? c : "undefined"));
        }
    }
    public static void main(String[] args) {
        DivExceptions a1 = new DivExceptions();
        a1.div("50", "5");
        a1.div("50", "0");
        a1.div("a", "5");
        a1.div("a", "0");
    }
}