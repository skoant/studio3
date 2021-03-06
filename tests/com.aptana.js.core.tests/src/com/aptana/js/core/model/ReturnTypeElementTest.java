package com.aptana.js.core.model;

import com.aptana.js.core.model.ReturnTypeElement;

import junit.framework.TestCase;

public class ReturnTypeElementTest extends TestCase
{

	public void testEquals() throws Exception
	{
		ReturnTypeElement first = new ReturnTypeElement();
		first.setType("Object");

		ReturnTypeElement other = new ReturnTypeElement();
		other.setType("Object");
		assertEquals("same type should be equal", first, other);

		// Different descriptions.
		first.setDescription("first");
		other.setDescription("other");
		assertEquals("Expected same type different description to still be equal", first, other);
	}

}
