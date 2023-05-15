package com.project.Portfolio.service;

import com.project.Portfolio.model.Social;
import com.project.Portfolio.repository.SocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SocialService implements ISocialService {

    @Autowired
    private SocialRepository socialRepo;

    @Override
    public List<Social> getSocial() {
        return socialRepo.findAll();
    }

}
