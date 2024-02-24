import java.util.HashMap;
import java.util.Map;

public class EmployeeManagement {
    private final Map<String, Employee> employees;

    public EmployeeManagement() {
        this.employees = new HashMap<>();
    }

    public Employee addEmployee(String firstName, String lastName) {
        String key = generateKey(firstName, lastName);
        if (employees.containsKey(key)) {
            throw new RuntimeException("Employee already exists.");
        }
        Employee employee = new Employee(firstName, lastName);
        employees.put(key, employee);
        return employee;
    }

    public Employee removeEmployee(String firstName, String lastName) {
        String key = generateKey(firstName, lastName);
        Employee removedEmployee = employees.remove(key);
        if (removedEmployee == null) {
            throw new RuntimeException("Employee not found.");
        }
        return removedEmployee;
    }

    public Employee findEmployee(String firstName, String lastName) {
        String key = generateKey(firstName, lastName);
        Employee employee = employees.get(key);
        if (employee == null) {
            throw new RuntimeException("Employee not found.");
        }
        return employee;
    }

    public Map<String, Employee> getAllEmployees() {
        return new HashMap<>(employees);
    }

    private String generateKey(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}

