package Jump2Java;

public class 메소드_처음사용 {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
    public static void main(String[] args) {
        메소드_처음사용 cat = new 메소드_처음사용();
        cat.setName("boby");

        메소드_처음사용 dog = new 메소드_처음사용();
        dog.setName("happy");
        
        System.out.println(cat.name);
        System.out.println(dog.name);

    }
}
