import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author y.wang39
 */
public class TestBeanPostProcessor implements BeanPostProcessor {

	public TestBeanPostProcessor() {
		System.out.println("TestBeanPostProcessor 构造器");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TestBeanPostProcessor before 方法");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TestBeanPostProcessor after 方法");
		return bean;
	}
}
