package PayrollRepository.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import payroll_service.domain.model.Payroll;

public interface SpringDataPayrollRepository extends JpaRepository<Payroll, Long>{


    

}