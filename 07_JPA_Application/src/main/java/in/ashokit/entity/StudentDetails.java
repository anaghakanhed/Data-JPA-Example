package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class StudentDetails {
@Id
	private Integer stdId;
	private String Name;
	private Integer rollno;
	private Integer age;
}
