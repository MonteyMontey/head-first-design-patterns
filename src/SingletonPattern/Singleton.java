package SingletonPattern;

public class Singleton {
    private static Singleton uniqueInstance; //needs to be static, otherwise can't be accessed without class being instantiated

    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

// Watch it!
// If there are two threads and both check if the unique instance is null right after each other it can happen
// that two instances are being created!

// Solution:
// 1. Synchronize the getInstance() method
// 2. eager instantiation (instantiate instance immediately and just return this one without checking)
// 3. double-checked-locking, synchronize only the first time the instance gets created

// synchronized means no two threads can enter the method at the same time