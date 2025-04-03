public class ThisKeyword {
    int num1, num2; // Class Variable, Global Variable

    void input(int num1, int num2){
        this.num1 = num1; // Its a Local variable or instance
        this.num2 = num2;
    }

    void output(){
        System.out.println("num1 = "+this.num1); // Good practice to use this keyword for global variables
        System.out.println("num2 = "+this.num2);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.input(25,52);
        obj.output();
    }
}
