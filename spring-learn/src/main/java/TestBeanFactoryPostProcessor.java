import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor, InitializingBean {

	public TestBeanFactoryPostProcessor() {
		System.out.println("TestBeanFactoryPostProcessor 构造");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("TestBeanFactoryPostProcessor postProcessBeanFactory 方法调用");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("TestBeanFactoryPostProcessor afterPropertiesSet 方法调用");
	}
}
