/**
 * Aptana Studio
 * Copyright (c) 2005-2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the GNU Public License (GPL) v3 (with exceptions).
 * Please see the license.html included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
package com.aptana.editor.common.viewer;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ViewerTests
{

	public static Test suite()
	{
		TestSuite suite = new TestSuite(ViewerTests.class.getName());
		// $JUnit-BEGIN$
		suite.addTestSuite(CommonProjectionViewerTest.class);
		// Please do not include ad-hoc performance test classes in here.
		// They have no pass/fail and just slow down the build!
		// $JUnit-END$
		return suite;
	}

}
