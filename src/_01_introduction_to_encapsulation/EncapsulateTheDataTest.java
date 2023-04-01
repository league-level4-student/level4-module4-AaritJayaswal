package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {

	@Test
	void test() {
		EncapsulateTheData x = new EncapsulateTheData();
		
		//itemsReceieved test
		
		x.setItemsReceived(-10);
		assertEquals(0,x.getItemsReceived());
	
		//degreesTurned test
		
		x.setDegreesTurned(-26.0f);
		assertEquals(0.0f,x.getDegreesTurned());
	
		x.setDegreesTurned(500.0f);
		assertEquals(360.0f,x.getDegreesTurned());
		
		//nomenclature test
		
		x.setNomenclature("");
		assertEquals(" ",x.getNomenclature());
		
		//memberObj test
		
		x.setMemberObj("string");
		assertTrue(x.getMemberObj() instanceof Object);
	
	}

}
