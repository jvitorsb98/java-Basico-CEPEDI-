package dog;

public class Dog {
	
	
	String nome;
	private int age;
	private int weight;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	public Dog(String nome, int age, int weight) {
		super();
		this.nome = nome;
		this.age = age;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Dog [nome=" + nome + ", age=" + age + ", weight=" + weight + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void speak() {
		System.out.println("BARK!!");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Leclerc",12,80);
		System.out.println(dog);
		dog.speak();
	}
}
