package org.wcci.interview;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class StringUtilTest {
	@Test
	public void reversingAnEmptyStringGivesAnEmptyString(){
		assertEquals("", StringUtil.reverse(""));
	}

	@Test
	public void reversingLetterAGivesLetterA(){
		assertEquals("A", StringUtil.reverse("A"));
	}

	@Test
	public void reversingWordItGivesTi(){
		assertEquals("tI", StringUtil.reverse("It"));
	}
}
