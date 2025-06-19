class Test {
    int age;
    public void assignAge(int num) {
        age = num;
    }
}

// For Constructor overloading
class ConstructorEx {
    ConstructorEx() {
        System.out.println("Constructor triggered");
    }
    ConstructorEx(int A) {
        System.out.println(A + " is the one integer");
    }
    ConstructorEx(int A, int B) {
        System.out.println(A + " and " + B + " is the two integers");
    }
}

// For Encapsulation
class BankAccount {
    private double balance;  // Private variable (data hiding)

    public BankAccount(double initial) {
        balance = initial;
    }

    // Public method to access the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setNewBalance(double newBalance) {
        balance = newBalance;
    }
}

// Base class
class Vehicle {
    private String VehicleNumber;

    public Vehicle(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public void honk() {
        System.out.println("Honk !!!!!!!!!!!");
    }

    public void printVehicleNumber() {
        System.out.println(VehicleNumber);
    }
}

// Derived class
class Car extends Vehicle{
    public Car(String CarNumber) {
        super(CarNumber);
    }
}

// Derived class
class Bus extends Vehicle{
    public Bus(String BusNumber) {
        super(BusNumber);
    }
}

public class OOPS_Base {
    private static int sum(int A, int B) {
        return A + B;
    }

    public static void main(String[] args) {
//        int add = sum(17, 23);
//        Test test1 = new Test();
//        test1.assignAge(21);
//
//        Test test2 = new Test();
//        test2.assignAge(25);
//
//        System.out.println(test1.age);
//        System.out.println(test2.age);
//        System.out.println(add);
//        ConstructorEx cons = new ConstructorEx();
//        ConstructorEx cons1 = new ConstructorEx(12);
//        ConstructorEx cons2 = new ConstructorEx(12, 13);
//        System.out.print(cons2);

//        BankAccount bankAcc = new BankAccount(200.00);
//        System.out.println(bankAcc.getBalance());
//        bankAcc.setNewBalance(205.50);
//        System.out.println(bankAcc.getBalance());

        Car car = new Car("AB12CD2345");
        car.printVehicleNumber();
        car.honk();

        Bus bus = new Bus("XY23MN5678");
        bus.printVehicleNumber();
        bus.honk();
    }
}