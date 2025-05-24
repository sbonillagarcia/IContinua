package PayrollRepository.application.service;
import org.springframework.stereotype.Service;
import payroll_service.domain.model.Payroll;
import payroll_service.domain.ports.PayrollRepository;

import java.util.List;

@Service
public class PayrollService {

    private final PayrollRepository payrollRepository;

    public PayrollService(PayrollRepository payrollRepository) {
        this.payrollRepository = payrollRepository;
    }

    public Payroll createPayroll(Payroll payroll) {
        return payrollRepository.save(payroll);
    }

    public List<Payroll> getAllPayrolls() {
        return payrollRepository.findAll();
    }
}
