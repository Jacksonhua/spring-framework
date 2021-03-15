import com.whh.test.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @description:
 * @author: Artermus wang on 2021-03-15 17:01
 */
@SuppressWarnings("deprecation")
public class BeanTest {
	@Test
	public void simpleBeanDefine(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
		User user = (User) beanFactory.getBean("user");
		Assertions.assertEquals("whh",user.getName());
	}

}
