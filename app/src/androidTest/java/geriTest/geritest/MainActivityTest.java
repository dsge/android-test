package geriTest.geritest;

import android.support.test.filters.SmallTest;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by HUAdravM on 2018-01-26.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();

    }

    @SmallTest
    public void testTextView(){
        TextView tv = (TextView) getActivity().findViewById(R.id.welcomeText);
        assertNotNull(tv);
        //assertNull(tv);
    }

    @SmallTest
    public void testButton(){
        Button bt = (Button) getActivity().findViewById(R.id.FirstScreenButton);
        assertNotNull(bt);
        //assertNull(bt);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}
