package g30126.covrig.mihaela.l5.e2;

public class ProxyImage implements Image {

	 private Image image;
	   public ProxyImage(String fileName, String type){
	      switch (type) {
		case "real":
			image=new RealImage(fileName);
			break;
		case "rotated":
			image=new RotatedImage(fileName);
		break;
		}
	   }
	 
	   @Override
	   public void display() {
		   image.display();
	   }
	   public static void main(String[] args) {
		ProxyImage proxyImage=new ProxyImage("merge","rotated");
		proxyImage.display();
	}
	}