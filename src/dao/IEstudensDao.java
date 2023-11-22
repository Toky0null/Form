package dao;
import model.Contact;
import java.util.List;

/**
 *
 * @author tokyo
 */
public interface IEstudensDao {
    public List<Contact> getAllStudent();
//    public Student getStudent(0);
    public boolean addStudent(Contact studen);
    public boolean updateStudent(Contact studen);
    public boolean deleteStudent(Contact studen);
    public boolean deleteStudentI(int index);
    
}
