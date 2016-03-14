import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class HelloWorldTestRunner {
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(HelloWorldTest.class);
		for(Failure failure : result.getFailures()){
			System.out.print(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
