package ClassPrac2;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary <= 1000) {
            return 0;
        } else        return 0.03;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours-40) * 30;
        } else return 0;
    }

    double raiseSalary() {
        if (this.hireYear <= 2002) {
            return 0.15;
        }
        if (this.hireYear <= 2012) {
            return 0.1;
        } else {
            return 0.05;
        }
    }

    void toStringg() {
        System.out.println(" Adı\t\t\t: " + name);
        System.out.println(" Maaşı\t\t\t: " + salary);
        System.out.println(" Çalışma saati\t: " + workHours);
        System.out.println(" Vergi\t\t\t: " + (salary * tax()));
        System.out.println(" Bonus\t\t\t: " + bonus());
        System.out.println(" Maaş Artışı\t: " + salary * raiseSalary());
        System.out.println(" Toplam maaş\t: " + ((salary * raiseSalary()) + salary
                + (bonus())-(salary*tax())));
    }
}


