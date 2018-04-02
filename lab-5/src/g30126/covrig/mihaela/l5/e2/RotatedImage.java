package g30126.covrig.mihaela.l5.e2;

public class RotatedImage implements Image{
	 private String fileName;
	 
	public RotatedImage(String fileName) {
		this.fileName=fileName;
	}
	@Override
	public void display() {
		
		System.out.println("Display Rotated " + fileName);
		
	}

}
