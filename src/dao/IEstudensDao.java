package dao;
import model.Student;
import java.util.List;

/**
 *
 * @author tokyo
 */
public interface IEstudensDao {
    public List<Student> getAllStudent();
//    public Student getStudent(0);
    public boolean addStudent(Student studen);
    public boolean updateStudent(Student studen);
    public boolean deleteStudent(Student studen);
    public boolean deleteStudentI(int index);
    
}
