package exceptionPackage;

public final class ImmutableDemo {

	private final String name;
	private final int age;
	
	public ImmutableDemo(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ImmutableDemo [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
		ImmutableDemo m1=new ImmutableDemo("chetan", 26);
		System.out.println(m1);
		String str=m1.getName().concat("Bawane");
		System.out.println(str);
		System.out.println(m1.getName());
}
}
