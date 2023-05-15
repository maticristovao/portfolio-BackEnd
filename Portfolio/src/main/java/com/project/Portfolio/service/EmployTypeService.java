package com.project.Portfolio.service;

import com.project.Portfolio.model.EmployType;
import com.project.Portfolio.repository.EmployTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployTypeService implements IEmployTypeService {

    @Autowired
    private EmployTypeRepository employRepo;

    @Override
    public List<EmployType> getEmployTypes() {
        return employRepo.findAllByOrderByName();
    }

}
