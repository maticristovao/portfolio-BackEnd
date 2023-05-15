package com.project.Portfolio.service;

import com.project.Portfolio.model.Area;
import com.project.Portfolio.repository.AreaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AreaService implements IAreaService {

    @Autowired
    private AreaRepository areaRepo;

    @Override
    public List<Area> getAreas() {
        List<Area> areaList = areaRepo.findAllByOrderByName();
        return areaList;
    }

}
