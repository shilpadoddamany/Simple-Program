public class HelloWorld {
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        MyMathClass myMathClass = new MyMathClass();

        int numb1 = 2;
        int numb2 = 8;
        String name = "Shilpa";

        System.out.println("hello Shilpa");
        System.out.println("Good Morning");
        anotherClass.printSomething();
        myMathClass.addTwoNumbers(numb1,numb2);

        for (int i = 0; i < 5; i++) {

                       System.out.println("Hello " + name);

        }
    }
}
