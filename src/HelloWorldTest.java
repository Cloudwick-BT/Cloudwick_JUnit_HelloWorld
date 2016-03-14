import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
	
	@Test
	public void test1(){
		String msg = new String("Hello World");
		HelloWorld tem = new HelloWorld();
		assertEquals(msg, tem.main(null));
	}
	

}
