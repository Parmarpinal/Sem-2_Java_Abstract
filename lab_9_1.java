public class lab_9_1{
	public static void main(String[] args) {
		Potato p1=new Potato("Potato","Skin");
		System.out.println(p1);
		Brinjal b1=new Brinjal("Brinjal","Purple");
		System.out.println(b1);
		Tomato t1=new Tomato("Tomato","Red");
		System.out.println(t1);
	}
}
abstract class Vegetable{
	String name;
	String color;
	Vegetable(String name,String color){
		this.name=name;
		this.color=color;
	}
}
class Potato extends Vegetable{
	Potato(String name,String color){
		super(name,color);
	}
	public String toString(){
		return "Name of vegetable is " + name + " and color is " + color;
	}
}
class Tomato extends Vegetable{
	Tomato(String name,String color){
		super(name,color);
	}
	public String toString(){
		return "Name of vegetable is " + name + " and color is " + color;
	}
}
class Brinjal extends Vegetable{
	Brinjal(String name,String color){
		super(name,color);
	}
	public String toString(){
		return "Name of vegetable is " + name + " and color is " + color;
	}
}
