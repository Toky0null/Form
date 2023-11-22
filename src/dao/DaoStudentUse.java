
package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Contact;

/**
 *
 * @author tokyo
 */
public class DaoStudentUse implements IEstudensDao {
    List<Contact> students;
    private static DaoStudentUse instance = null;
    private static final String FILE_DIRECTORY = "src/model/files/";
    private int totalStudentsLoaded; // Variable para almacenar el total de estudiantes cargados


    public DaoStudentUse(){
    this.students = new ArrayList<>();
    loadStudents();
    
    }
    
    

    @Override
    public List<Contact> getAllStudent() {
        return students;
    }
    
    
    public Contact getStudent(int studentId){
        Contact student = null;
        for(Contact actual : students){
            if(actual.getCodeId() == studentId){
                student = actual;
                break;
            }
        }
        return student;
    
    
    }
    
    private void saveStudent(Contact student) {
        int nextId = student.getCodeId(); // Obtener el próximo ID disponible
        String filePath = FILE_DIRECTORY + "student_" + nextId + ".ser";

        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outputStream.writeObject(student);
            outputStream.close();

            System.out.println("Estudiante guardado en " + filePath);

            // Actualizar el siguiente ID para el siguiente estudiante
            Contact.setNextId(nextId + 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveStudentsExternally(Contact student) {
        saveStudent(student); // Llamada al método privado para guardar estudiantes
    }
    
    @Override
    public boolean addStudent(Contact student) {
        students.add(student);
        System.out.println("agregado "+ student.getName() +" "+ student.getLastName());
        return true;
    }

    @Override
    public boolean updateStudent(Contact student) {
        if(students.contains(student)){
            int pos = students.indexOf(student);
            students.set(pos, student);
            return true;
        
        }
        
        return false;
    }

    @Override
    public boolean deleteStudent(Contact student) {
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
    
    public int getTotalStudentsLoaded(){
        return totalStudentsLoaded;
    }
    
    public int getsizeSt(){
        return students.size();
    }    

    private void loadStudents() {
        File directory = new File(FILE_DIRECTORY);
        File[] files = directory.listFiles();

        if (files != null) {
            List<Contact> loadedStudents = new ArrayList<>();
            int lastId = 0;

            for (File file : files) {
                if (file.isFile() && file.getName().startsWith("student_")) {
                    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
                        Object obj = inputStream.readObject();
                        if (obj instanceof Contact) {
                            Contact student = (Contact) obj;
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
            Contact.setNextId(nextId);
            System.out.println(totalStudentsLoaded);
        } else {
            System.out.println("No se encontraron archivos de estudiantes en la ruta especificada.");
        }
    }  
    
    public void loadStudentsExternally() {
        loadStudents(); // Llamada al método privado para cargar
    }
   
    public void updateStudentFile(Contact student) {
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
   
    public void updateStudentFileExternally(Contact student) {
        updateStudentFile(student); // Llamada al método privado para guardar estudiantes
    }
    
    public boolean deleteStudentFile(int studentId) {
        String filePath = FILE_DIRECTORY + "student_" + studentId + ".ser";
        File file = new File(filePath);

        if (file.exists()) {
            if (file.delete()) {
            System.out.println("Archivo del estudiante eliminado: " + filePath);
            return true;
            } else {
            System.out.println("No se pudo eliminar el archivo del estudiante: " + filePath);
            return false;
            }
        } else {
        System.out.println("El archivo del estudiante no existe.");
        return false;
        }
    }
   
    public boolean deleteStudentByIndex(int index) {
    if (index >= 0 && index < students.size()) {
        Contact removedStudent = students.remove(index);
        if (removedStudent != null) {
            System.out.println("Eliminado " + removedStudent.getName());
            return true;
        }
    }
    return false;
}

    @Override
    public boolean deleteStudentI(int index) {
    if (index >= 0 && index < students.size()) {
        Contact removedStudent = students.remove(index);
        if (removedStudent != null) {
            System.out.println("Eliminado " + removedStudent.getName());
            return true;
        }
    }
    return false;
    }   
    /**
     * Obtiene un estudiante por su ID.
     *
     * @param id El ID del estudiante a buscar.
     * @return El estudiante si se encuentra, de lo contrario null.
     */
    public Contact getStudentById(int id) {
        for (Contact student : students) {
            if (student.getCodeId() == id) {
                return student;
            }
        }
        return null; // Retorna null si no encuentra el estudiante
    }


}
    
    
   
 

