package payroll_service.domain.ports;
import java.util.List;

import payroll_service.domain.model.Payroll;


public interface PayrollRepository {
    
    Payroll save(Payroll payroll);
    List<Payroll> findAll();
}