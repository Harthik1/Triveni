package services;

import org.osgi.service.component.annotations.Component;
import com.Task.core.services.Test;
@Component(service=Test.class)
public class DefaultTest implements Test {

	@Override
	public String testMethod() {
		// TODO Auto-generated method stub
		return "This is ";
	}

}               