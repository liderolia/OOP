package hw_07;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Иван", "Иванов", "разработки", 120000);
        Employee e2 = new Employee("Пётр", "Петров", "администрирования", 100000);
        Employee e3 = new Employee("Пётр", "Петров", "управления", 150000);
        
        System.out.println("Список сотрудников:\n" + e1 + "\n" + e2 + "\n" + e3 + "\n");
        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3) + "\n");
        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
    }
}
