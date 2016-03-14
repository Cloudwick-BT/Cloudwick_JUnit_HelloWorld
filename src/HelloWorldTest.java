import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
	
	@Test
	public void trueTest1(){
		String msg = new String("Hello World");
		HelloWorld tem = new HelloWorld();
		String str = tem.main("Hello World");
		assertEquals(msg, tem.main("Hello World"));
	}
	
	@Test
	public void falseTest2() {
		String msg = new String ("Hello World");
		HelloWorld tem = new HelloWorld();
		assertEquals(msg, tem.main("Hello"));
	}
	

}
