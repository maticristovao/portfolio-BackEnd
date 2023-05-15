package com.project.Portfolio.service;

import com.project.Portfolio.model.Level;
import com.project.Portfolio.repository.LevelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LevelService implements ILevelService {

    @Autowired
    private LevelRepository levRepo;

    @Override
    public List<Level> getLevels() {
        return levRepo.findAll();
    }
}
