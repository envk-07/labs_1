package pr2.task05;

// ПитомникСобак
public class DogKennel {
    private Dog[] dogs;
    private int count;

    public DogKennel(int capacity) {
        dogs = new Dog[capacity];
    }

    public boolean add(Dog dog) {
        if (count == dogs.length) {
            return false;
        }
        dogs[count++] = dog;
        return true;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel(5);
        kennel.add(new Dog("Шарик", 3));
        kennel.add(new Dog("Бобик", 5));
        kennel.add(new Dog("Рекс", 1));
        kennel.print();
    }
}
