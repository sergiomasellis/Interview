import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;
import java.util.Arrays;



// This section declares all of the test classes in your program.
@RunWith(Suite.class)
@Suite.SuiteClasses({
   ReverseArrayTest.class  // Add test classes here.
})
public class Main {
  public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("Interview App Loaded");
		System.out.println("=====================\n");

		System.out.println("=====================");
		System.out.println("Reverse Sort");
		System.out.println("=====================");

    junit.textui.TestRunner.run (suite());
  }

   public static junit.framework.Test suite() 
    {
       return new JUnit4TestAdapter(Main.class);
    }
}