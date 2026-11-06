class Patient {
    String patientName;
    double height;
    double weight;

    Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    double computeBMI() {
        return weight / (height * height);
    }
}

public class test3 {
    public static void main(String[] args) {
        Patient p = new Patient("John Doe", 1.75, 68.5);
        System.out.println("Patient Name: " + p.patientName);
        System.out.println("Height: " + p.height + " m");
        System.out.println("Weight: " + p.weight + " kg");
        System.out.printf("Computed BMI: %.2f\n", p.computeBMI());
    }
}

