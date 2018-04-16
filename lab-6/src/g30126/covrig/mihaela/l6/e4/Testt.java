package g30126.covrig.mihaela.l6.e4;

import org.junit.Test;


public class Testt {
	@Test
	public void testSubseq()
	{
		ImplementCharSequence implementCharSequence=new ImplementCharSequence(new char[] {'a','b','c','d','e','f'});
		assertEquals("abc", implementCharSequence.subSequence(0,2));
	}

	private void assertEquals(String string, CharSequence subSequence) {
		
	}

	
		
	}




