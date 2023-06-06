public class lab9_3{
	public static void main(String[] args) {
		Animal[] ani=new Animal[4];
		ani[0]=new Tiger("Tiger");
		ani[1]=new Deer("Deer");
		ani[2]=new Donkey("Donkey");
		ani[3]=new Camel("Camel");
		for(int i=0;i<4;i++){
			if(ani[i] instanceof Transport){
				((Transport)ani[i]).deliver();			
			}
		}
		for(int i=0;i<4;i++){
			ani[i].printName();
		}
		
	}
}
interface Transport{
	public void deliver();
}
abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	public void printName(){
		System.out.println(name);
	}
}
class Tiger extends Animal{
	Tiger(String name){
		super(name);
	}
}
class Deer extends Animal{
	Deer(String name){
		super(name);
	}
}
class Donkey extends Animal implements Transport{
	Donkey(String name){
		super(name);
	}
	public void deliver(){
		System.out.println("Deliver Donkey");
	}
}
class Camel extends Animal implements Transport{
	Camel(String name){
		super(name);
	}
	public void deliver(){
		System.out.println("Deliver Camel");
	}
}