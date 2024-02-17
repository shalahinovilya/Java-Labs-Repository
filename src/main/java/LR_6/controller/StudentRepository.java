package LR_6.controller;

import LR_6.model.Sex;
import LR_6.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private final String url = "jdbc:postgresql://localhost:5432/StudentsDB";
    private final String user = "postgres";
    private final String password = "1234";

    // - SQL запрос буде сформований згідно запросу який зробив користувач і вже сервер управління баз даних буде
    // вирішувати, які самі студенти народилися в тому чи іншому місяці.
    // Цей підхід було обрано через перевагу у швидкості, оскльіки не треба забирати весь перелік студентів з бази даних
    public List<Student> getStudentsBornInMonth(int month) {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM public.\"Students\" WHERE EXTRACT(MONTH FROM \"BirthDate\") = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, month);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet);
                String lastName = resultSet.getString("LastName");
                String firstName = resultSet.getString("FirstName");
                String patronymic = resultSet.getString("Patronymic");
                Date birthdate = resultSet.getDate("BirthDate");
                String recordBookNumber = resultSet.getString("RecordBookNumber");
                Student student = new Student(firstName, lastName, patronymic, birthdate, recordBookNumber, Sex.MALE);
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}