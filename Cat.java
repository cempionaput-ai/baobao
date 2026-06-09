public class Cat {
    // Характеристики кошки
    private String name;
    private int age;
    private int energy;
    private double weight;

    // Конструктор для создания кошки
    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energy = 100; // Изначально кошка полна сил
    }

    // Метод: кошка спит
    public void sleep() {
        energy += 30;
        if (energy > 100) energy = 100;
        System.out.println(name + " сладко спит. Энергия восстановлена до " + energy + "%.");
    }

    // Метод: кошка играет
    public void play() {
        if (energy >= 20) {
            energy -= 20;
            System.out.println(name + " бегает за лазерной указкой! Энергия: " + energy + "%.");
        } else {
            System.out.println(name + " слишком устал(а) для игр. Пора спать.");
        }
    }

    // Метод: кошка мяукае
    public void meow() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }

    // Главный метод для запуска программы
    public static void main(String[] args) {
        // Создаем пушистого персонажа
        Cat myCat = new Cat("Мурка", 3, 4.2);

        System.out.println("Знакомьтесь, это наша кошка!");
        System.out.println("Имя: " + myCat.name + ", Возраст: " + myCat.age + " года, Вес: " + myCat.weight + " кг.");
        System.out.println("---------------------------------------------");

        // Действия кошки
        myCat.meow();
        myCat.play();
        myCat.play();
        myCat.sleep();
    }
}
