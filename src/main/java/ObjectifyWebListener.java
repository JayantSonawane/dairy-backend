import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.googlecode.objectify.ObjectifyService;

import entity.Student;

@WebListener
public class ObjectifyWebListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ObjectifyService.init();
		// This is a good place to register your POJO entity classes.
		// ObjectifyService.register(YourEntity.class);
		ObjectifyService.register(Student.class);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
	}
}