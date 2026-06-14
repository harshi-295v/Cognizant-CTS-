// =============== Singleton Pattern ===============

class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance Created");
    }
}

// =============== Factory Pattern ===============

interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }

        return new Rectangle();
    }
}

// =============== Observer Pattern ===============

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class YouTubeChannel {

    private Observer observer1;
    private Observer observer2;

    public void subscribe(Observer observer1,
                          Observer observer2) {

        this.observer1 = observer1;
        this.observer2 = observer2;
    }

    public void uploadVideo(String title) {

        observer1.update(title);
        observer2.update(title);
    }
}

// =============== Main Class ===============

public class DesignPatternsPractice {

    public static void main(String[] args) {

        System.out.println("===== Singleton Pattern =====");

        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        System.out.println("\n===== Factory Pattern =====");

        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("Circle");
        circle.draw();

        Shape rectangle = factory.getShape("Rectangle");
        rectangle.draw();

        System.out.println("\n===== Observer Pattern =====");

        Subscriber s1 = new Subscriber("Harshitha");
        Subscriber s2 = new Subscriber("Sneha");

        YouTubeChannel channel = new YouTubeChannel();

        channel.subscribe(s1, s2);

        channel.uploadVideo("Design Patterns Tutorial");
    }
}