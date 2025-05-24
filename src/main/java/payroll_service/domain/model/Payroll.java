package payroll_service.domain.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Payroll {
    public Payroll() {
        // TODO Auto-generated method stub
    }
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empleado;
    private double salario;

    // Getters, setters, constructor vacío, etc.
}
