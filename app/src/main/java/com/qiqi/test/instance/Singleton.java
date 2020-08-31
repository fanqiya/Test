package com.qiqi.test.instance;

public class Singleton {
    //单例模式中的全局唯一对应的是整个APP，比如你在一个activity中已经创建了单例类的实例，
    // 在没有被回收的境况下，在另一个activity中去get这个实例，还是同一个对象，也即单例的全局唯一性。
    /**
     * 懒汉式
     */
    //被volatile修饰的变量，在一个线程中被改变时会立刻同步到主内存中，而另一个线程在操作这个变量时都会先从主内存更新这个变量的值。
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton instance() {
        //第一次判断非空，如果不是就直接return，如果是就走下边。优点：避免造成不必要的同步开销，节省资源
        if (singleton == null) {
            //如果两个同时进来，同步锁让他们排队
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
