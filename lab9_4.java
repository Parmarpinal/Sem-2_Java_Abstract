public class lab9_4{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		switch(a){
			case 1:
			{
				BookPublication b1=new BookPublication();
				b1.display();
				break;
			}
			case 2:
			{
				PaperPublication p1=new PaperPublication();
				p1.display();
				break;
			}
		}		
	}
} 
class Book{
	private String authorName;
	Book(){
		authorName="Pinal";
	}
	void display(){
		System.out.println("Author name = "+authorName);
	}
}
class BookPublication extends Book{
	private String title;
	BookPublication(){
		title="Rich dad & Poor dad";
	}
	void display(){
		super.display();
		System.out.println("Book title="+title);
	}
}
class PaperPublication extends Book{
	private String title;
	PaperPublication(){
		title="Divyabhaskar";
	}
	void display(){
		super.display();
		System.out.println("Paper title="+title);
	}
}
