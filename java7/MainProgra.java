// File: MyPackage/ClassA.java
package MyPackage;

public class ClassA {
    public void showMessage() {
        System.out.println("Hello from ClassA in MyPackage!");
    }
}
// File: MyPackage/ClassB.java
package MyPackage;

public class ClassB {
    public void showMessage() {
        System.out.println("Hello from ClassB in MyPackage!");
    }
}
// File: MainProgram.java
import MyPackage.ClassA;
import MyPackage.ClassB;

public class MainProgra {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.showMessage();

        ClassB b = new ClassB();
        b.showMessage();
    }
}

