
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author tokyo
 */
public class DaoStudentUse implements IEstudensDao {
    List<Student> students;
    private static DaoStudentUse instance = null;
    
    public DaoStudentUse(){
    this.students = new ArrayList<>(); 
    
    }
    
    

    @Override
    public List<Student> getAllStudent() {
        return students;
    }
    
    
    public Student getStudent(int studentId){
        Student student = null;
        for(Student actual : students){
            if(actual.getCodeId() == studentId){
                student = actual;
                break;
            }
        }
        return student;
    
    
    }
    
    
    
    @Override
    public boolean addStudent(Student student) {
        students.add(student);
        System.out.println("agragado");
        return true;
    }

    @Override
    public boolean updateStudent(Student student) {
        if(students.contains(student)){
            int pos = students.indexOf(student);
            students.set(pos, student);
            return true;
        
        }
        
        return false;
    }

    @Override
    public boolean deleteStudent(Student student) {
        students.remove(student);
        return true;
    }
    
    
    public static DaoStudentUse getInstance() {
        if (instance == null) {
            instance = new DaoStudentUse();
        }
        return instance;
    }
}
