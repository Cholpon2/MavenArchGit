package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest2 {
    public class AppTest
            extends TestCase
    {
        /**
         * Create the test case
         *
         * @param testName name of the test case
         */
        public AppTest( String testName )
        {
            super( testName );
        }

        /**
         * @return the suite of tests being tested
         */
        public Test suite()
        {
            return new TestSuite( org.example.AppTest.class );
        }

        /**
         * Rigourous Test :-)
         */
        public void testApp()
        {
            assertTrue( true );
        }
    }
}
