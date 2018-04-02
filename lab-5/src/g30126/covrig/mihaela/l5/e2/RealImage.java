package g30126.covrig.mihaela.l5.e2;

public class RealImage implements Image {
	private String fileName;
	
public RealImage(String fileName) {
	
	this.fileName=fileName;
}
@Override
public void display() {
   System.out.println("Displaying " + fileName);
}
}
