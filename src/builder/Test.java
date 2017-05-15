package builder;

/**
 * 建造者模式
 */
public class Test {
    public static void main(String[] args) {
        Builder welcomeBuilder = new WelcomeBuilder();
        Director director = new Director(welcomeBuilder);
        director.construct("dog@apple.com","cat@sumsung.com");

        System.out.println("--------------------------------------");

        Builder goodbyeBuilder = new GoodbyeBuilder();
        director = new Director(goodbyeBuilder);
        director.construct("dog@apple.com","cat@sumsung.com");
    }
}
