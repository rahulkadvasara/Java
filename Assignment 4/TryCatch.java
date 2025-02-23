class TryCatch{
    void div(int a,int b){
        int c = 0;
        try{
            c=a/b;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }finally{
            System.out.println("Result :"+c);
        }
    }
    public static void main(String[] args) {
        TryCatch a1 = new TryCatch();
        a1.div(50, 5);
        a1.div(50, 0);
    }
}