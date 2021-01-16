package oop.this_test;

class ThisKeywordTest {
    public static void main(String[] args) {
        B b_test = new B();
        b_test.printTest();
        System.out.println("--------------------");
        B b_test_1 = new B();
        b_test_1.printTest();
    }
}

class A {
    int x;
    int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class B extends A {
    public B () {
        super(0, 0);
        this.x = 3;
        this.y = 2;
    }

    public void printTest() {
        System.out.printf("super.x = %d, super.y = %d \n", super.x, super.y);
        System.out.printf("super.reference address: %s \n", super.toString());

        System.out.printf("this.x = %d, this.y = %d \n", this.x, this.y);
        System.out.printf("this.reference address: %s \n", this.toString());
    }
}