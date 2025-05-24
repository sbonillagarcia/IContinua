package PayrollRepository.infrastructure.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PayrollRepository.application.service.PayrollService;
import payroll_service.domain.model.Payroll;

@RestController
@RequestMapping("/payrolls")
public class PayrollController {

    private final PayrollService payrollService;

    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public Payroll create(@RequestBody Payroll payroll) {
        return payrollService.createPayroll(payroll);
    }

    @GetMapping
    public List<Payroll> getAll() {
        return payrollService.getAllPayrolls();
    }
}
