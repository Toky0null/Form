
package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    private static final String FILE_DIRECTORY = "src/model/files/";

    public DaoStudentUse(){
    this.students = new ArrayList<>();
    loadStudents();
    
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
    
    private void saveStudents() {
        int lastId = students.size() > 0 ? students.get(students.size() - 1).getCodeId() : 0;
        String filePath = FILE_DIRECTORY + "students_" + lastId + ".ser";

        try {
            File directory = new File(FILE_DIRECTORY);
            if (!directory.exists()) {
                directory.mkdirs(); // Crea la carpeta si no existe
            }

            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile(); // Crea el archivo si no existe
            }

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(students);
            outputStream.close();
            System.out.println("Estudiantes guardados en " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveStudentsExternally() {
        saveStudents(); // Llamada al método privado para guardar estudiantes
    }
    
    @Override
    public boolean addStudent(Student student) {
        students.add(student);
        System.out.println("agregado"+ student.getName());
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
         System.out.println("Eliminado" + student.getName());
        return true;
    }
    
    
    public static DaoStudentUse getInstance() {
        if (instance == null) {
            instance = new DaoStudentUse();
        }
        return instance;
    }

    private void loadStudents() {
    File directory = new File(FILE_DIRECTORY);
    File[] files = directory.listFiles();

    if (files != null) {
        List<Student> loadedStudents = new ArrayList<>();

        for (File file : files) {
            if (file.isFile() && file.getName().startsWith("students_")) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                    Object obj = inputStream.readObject();
                    if (obj instanceof List<?>) {
                        List<Student> studentsFromFile = (List<Student>) obj;
                        loadedStudents.addAll(studentsFromFile);
                        System.out.println("Estudiantes cargados desde: " + file.getName());
                    }
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Error al cargar el archivo de estudiantes: " + file.getName());
                    e.printStackTrace();
                }
            }
        }

        students = loadedStudents;
    } else {
        System.out.println("No se encontraron archivos de estudiantes en la ruta especificada.");
    }
  }
    
    
   public void loadStudentsExternally() {
        loadStudents(); // Llamada al método privado para cargar
    }
}
