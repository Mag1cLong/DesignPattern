package singleton;

/**
 * 单例模式-枚举单例
 * 枚举单例是单例模式的最佳实践。使用枚举来实现单实例控制会更加简洁，而且无偿地提供了序列化机制，并由JVM从根本上提供保障，绝对防止多次实例化，是更简洁、高效、安全的实现单例的方式。
 */
public enum Singleton {
    INSTANCE;
    private String name;

    Singleton() {
        init();
    }

    private void init() {
        System.out.println("init...");
        setName("singleton");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void oper() {
        System.out.println(getName());
    }

    public static void main(String[] args) {
        Singleton.INSTANCE.oper();
    }
}
