package PayrollRepository.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import payroll_service.domain.ports.PayrollRepository;
import payroll_service.domain.model.Payroll;
import java.util.*;



    @Repository
    public class PayrollRepositoryImpl implements PayrollRepository{
           
        @Autowired
        private SpringDataPayrollRepository jpaRepository;
        
        @Override
        public List<Payroll> findAll() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Payroll save(Payroll payroll) {
            // TODO Auto-generated method stub
            return null;
        }

        
    }