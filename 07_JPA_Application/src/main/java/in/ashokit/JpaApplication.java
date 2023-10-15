package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.StudentDetails;
import in.ashokit.repository.StudentDetailsRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(JpaApplication.class, args);
	StudentDetailsRepository bean = ctxt.getBean(StudentDetailsRepository.class);
		System.out.println(ctxt.getClass().getName());
		
		
		StudentDetails sd = new StudentDetails();
		sd.setStdId(101);
		sd.setName("Anagha");
		sd.setRollno(02);
		sd.setAge(24);
		bean.save(sd);
		
	}

}
