
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
    
    private void saveStudent(Student student) {
        int nextId = student.getCodeId(); // Obtener el próximo ID disponible
        String filePath = FILE_DIRECTORY + "student_" + nextId + ".ser";

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outputStream.writeObject(student);
            outputStream.close();

            System.out.println("Estudiante guardado en " + filePath);

            // Actualizar el siguiente ID para el siguiente estudiante
            Student.setNextId(nextId + 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveStudentsExternally(Student student) {
        saveStudent(student); // Llamada al método privado para guardar estudiantes
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

    private int totalStudentsLoaded; // Variable para almacenar el total de estudiantes cargados

    private void loadStudents() {
        File directory = new File(FILE_DIRECTORY);
        File[] files = directory.listFiles();

        if (files != null) {
            List<Student> loadedStudents = new ArrayList<>();
            int lastId = 0;

            for (File file : files) {
                if (file.isFile() && file.getName().startsWith("student_")) {
                    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                        Object obj = inputStream.readObject();
                        if (obj instanceof Student) {
                            Student student = (Student) obj;
                            loadedStudents.add(student);
                            int fileId = student.getCodeId();
                            if (fileId > lastId) {
                                lastId = fileId;
                            }
                            System.out.println("Estudiante cargado desde: " + file.getName());
                        }
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Error al cargar el archivo del estudiante: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }

            students = loadedStudents;
            totalStudentsLoaded = students.size(); // Guardar el total de estudiantes cargados

            // Asegurar que el próximo ID sea mayor que el último encontrado
            int nextId = lastId + 1;
            Student.setNextId(nextId);
            System.out.println(totalStudentsLoaded);
        } else {
            System.out.println("No se encontraron archivos de estudiantes en la ruta especificada.");
        }
    }

    
    
   public void loadStudentsExternally() {
        loadStudents(); // Llamada al método privado para cargar
    }
   
   public void updateStudentFile(Student student) {
        // Encontrar el archivo correspondiente al estudiante y actualizarlo
        String filePath = FILE_DIRECTORY + "student_" + student.getCodeId() + ".ser";
        File file = new File(filePath);
        if (file.exists()) {
            try {
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
                outputStream.writeObject(student);
                outputStream.close();
                System.out.println("Archivo del estudiante actualizado: " + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo del estudiante no existe para actualizar.");
        }
    }
   
   public void updateStudentFileExternally(Student student) {
        updateStudentFile(student); // Llamada al método privado para guardar estudiantes
    }
}
