package g30126.covrig.mihaela.l4.e7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCylinder {
@SuppressWarnings("deprecation")
@Test
public void testGetVolume()
{
	Cylinder cylinder=new Cylinder(10, 10);
	assertEquals( Math.PI*cylinder.getRadius()*cylinder.getHeight(), cylinder.getVolume());
}
}
