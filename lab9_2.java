public class lab9_2{
	public static void main(String[] args) {
		EventDemo e1=new EventDemo();
		e1.performEvent();
		e1.mouseClicked();
        e1.mousePressed();
        e1.mouseReleased();
        e1.mouseMoved();
        e1.mouseDragged();
        e1.keyPressed();
        e1.keyReleased();
	}
}
interface EventListener{
	public void performEvent();
}
interface MouseListener extends EventListener{
  	public void  mouseClicked();
  	public void  mousePressed();
  	public void  mouseReleased();
  	public void  mouseMoved();
  	public void  mouseDragged();
}
interface KeyListener extends EventListener{
	public void keyPressed();
	public void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
	public void performEvent(){
		System.out.println("Event performed");
	}
	public void mouseClicked(){
		System.out.println("Mouse clicked");
	}
	public void mousePressed(){
		System.out.println("Mouse pressed");
	}
	public void mouseReleased(){
		System.out.println("Mouse released");
	}
	public void mouseMoved(){
		System.out.println("Mouse moved");
	}
	public void mouseDragged(){
		System.out.println("Mouse dragged");
	}
	public void keyPressed(){
		System.out.println("Key pressed");
	}
	public void keyReleased(){
		System.out.println("Key released");
	}
}