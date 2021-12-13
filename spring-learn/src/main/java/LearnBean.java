public class LearnBean {

	private String name;

	private int age;

	public LearnBean() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "LearnBean{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
