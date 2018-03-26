package g30126.covrig.mihaela.l4.e4;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
public class TestAuthor {
	@Test
	public void testToSting() {
		Author a=new Author("gigi","gigi@gigi.com",'M');
		assertEquals(a.getName()+"("+a.getGender()+")"+" at "+a.getEmail(),a.toString());
		}
}
