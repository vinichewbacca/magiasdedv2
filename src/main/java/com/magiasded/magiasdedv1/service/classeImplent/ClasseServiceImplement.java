package com.magiasded.magiasdedv1.service.classeImplent;

import com.magiasded.magiasdedv1.model.Classe;
import com.magiasded.magiasdedv1.repository.ClasseRepository;
import com.magiasded.magiasdedv1.service.ClasseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
@Slf4j
public class ClasseServiceImplement implements ClasseService
{
    private final ClasseRepository classeRepository;

    @Override
    public List<Classe> findAll() {
        return classeRepository.findAll();
    }

    @Override
    public Classe findById(Long id) {
        return classeRepository.findById(id).get();
    }

    @Override
    public Classe create(Classe classe) {
        log.info("Criada nova classe: {} ", classe.getNome());
        return classeRepository.save(classe);
    }

    @Override
    public Classe findByName(String nome) {
        return null;
    }
}
