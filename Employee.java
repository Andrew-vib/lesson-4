package lesson4;

public class Employee {

        String name;
        double salary;
        int age;
// вызов конструктора класса
        public Employee(String name, int age, double salary) {
            this.name = name;
            this.salary = salary;
            this.age = age;
        }
// метод возврающее значение возраста
        public int getAge() {
            return age;
        }

// метод возврающее значение заработной платы
        public double getSalary() {
            return salary;
        }
// метод возврающее значение ФИО
        public String getName() {
            return name;
        }
// метод для вывода в консоль при помощи методов из пункта 3
        public void printInfo() {
            System.out.println("ФИО сотрудника: " + getName() + "Возраст сотрудника: " + getAge() + " лет");
        }
// 6. метод повышающий зарплату сотрудникам старше 45 лет
    public void setSAlary(int salary) {
        this.salary += salary;
        System.out.println("Теперь он получает " + getSalary());
    }

        public static void main(String[] args) {

            Employee myEmployee1 = new Employee("Мельников Андрей Александрович ", 29, 90);
            Employee myEmployee2 = new Employee("Коваль Никита Игоревич ", 20, 5000);
            Employee myEmployee3 = new Employee("Плотников Руслан Александрович ", 35, 10000);
            Employee myEmployee4 = new Employee("Николаев Петр Владимирович ", 60, 20000);
            Employee myEmployee5 = new Employee("Валиев Николай Петрович ", 50, 15000);

 // 4. вывод на консоль данные о сотрудниках при помощи метода
            System.out.println("Список сотрудников компании");
            myEmployee1.printInfo();
            myEmployee2.printInfo();
            myEmployee3.printInfo();
            myEmployee4.printInfo();
            myEmployee5.printInfo();

// 5. создание массива из 5 сотрудников
            Employee[] arr = new Employee[5];
            arr[0] = myEmployee1;
            arr[1] = myEmployee2;
            arr[2] = myEmployee3;
            arr[3] = myEmployee4;
            arr[4] = myEmployee5;
// поиск сотрудников старше 45 лет
            System.out.println("Сотрудники старше 45 лет ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].age > 40) arr[i].printInfo();
            }
// поиск и повышение зарплаты сотрудникаам старше 45 лет
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].age > 45) {
                    System.out.println("Сотрудник старше 45 лет: " + arr [i].name);
                    arr[i].setSAlary(5000);
                }
            }

        }
    }