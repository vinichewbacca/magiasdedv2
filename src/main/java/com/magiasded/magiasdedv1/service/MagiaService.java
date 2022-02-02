package com.magiasded.magiasdedv1.service;

import com.magiasded.magiasdedv1.model.Magias;

import java.util.List;

public interface MagiaService
{
    List<Magias> findAll();
    Magias findById (Long id);
    Magias create (Magias magia);
    Magias findByName (String nome);

}
