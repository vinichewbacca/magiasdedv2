package com.magiasded.magiasdedv1.service.magiaImplement;

import com.magiasded.magiasdedv1.model.Magias;
import com.magiasded.magiasdedv1.repository.MagiasRepository;
import com.magiasded.magiasdedv1.service.MagiaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
@Slf4j
public class MagiaServiceImplement implements MagiaService
{
    private final MagiasRepository magiasRepository;

    @Override
    public List<Magias> findAll() {
        return magiasRepository.findAll();
    }

    @Override
    public Magias findById(Long id) {
        return magiasRepository.findById(id).get();
    }

    @Override
    public Magias create(Magias magia) {
        log.info("Magia {} criado com sucesso", magia.getNome());
        return magiasRepository.save(magia);
    }

    @Override
    public Magias findByName(String nome) {
        return null;
    }
}
