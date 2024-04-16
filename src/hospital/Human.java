package hospital;

public abstract class Human {
    private String name, gender;
    private double weight, height;
    private int age;

    public Human(String name, String gender, double weight, double height, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", gender=" + gender + ", weight=" + weight + ", height=" + height + ", age=" + age + '}';
    }
    
    
}
