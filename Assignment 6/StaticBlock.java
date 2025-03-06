class StaticBlock{
    static{
        System.out.println("Static Block : 1");
    }
    static{
        System.out.println("Static Block : 2");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static{
        System.out.println("Static Block : 3");
    }
}