public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        // Добавление сотрудников
        employeeManagement.addEmployee("Иван", "Иванов");
        employeeManagement.addEmployee("Петр", "Петров");
        employeeManagement.addEmployee("Мария", "Сидорова");
        employeeManagement.addEmployee("Анна", "Петрова");

        // Вывод списка сотрудников
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employeeManagement.getAllEmployees().values()) {
            System.out.println(employee);
        }
    }
}
