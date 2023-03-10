import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Cacheable
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@OneToMany
List< Student> list;
public List<Student> getList() {
	return list;
}
public void setList(List<Student> list) {
	this.list = list;
}

}
