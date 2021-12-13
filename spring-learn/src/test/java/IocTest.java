import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {


	@Test
	public void testIoC() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		LearnBean learnBean = (LearnBean) applicationContext.getBean("learnBean");
		System.out.println(learnBean);
	}

}
