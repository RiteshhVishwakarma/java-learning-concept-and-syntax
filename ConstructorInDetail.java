public class ConstructorInDetail {
    int a, b;
    ConstructorInDetail() {  // Created a Default constructor
        System.out.println("Default ");
        a = 0;
        b = 0;
    }

    ConstructorInDetail(int x, int y) {
        System.out.println("para");
        a = x;
        b = y;
    }

    ConstructorInDetail(ConstructorInDetail x) {
        System.out.println("Copy called");
        System.out.println(x.a); //
        System.out.println(x.b);

    }

    void input() {
        a = 25;
        b = 35;
    }

    void output() {
        System.out.println("a= " + a + "   b = " + b);
    }


    public static void main(String[] args) {
        ConstructorInDetail obj = new ConstructorInDetail(90, 100); // par
        ConstructorInDetail obj1 = new ConstructorInDetail(obj); // copy
        ConstructorInDetail obj2 = new ConstructorInDetail(); // de
//         obj.input(); // 25 35
//         obj1.output(); //
//         obj2.input();
//        obj2.output();
    }
}