package com.magiasded.magiasdedv1.service;

import com.magiasded.magiasdedv1.model.Classe;

import java.util.List;

public interface ClasseService
{
    List<Classe> findAll();//metodo para listar todas as classes de personagens
    Classe findById(Long id);//metodo para listar uma unica classe de acordo com o id
    Classe create (Classe classe);//metodo para criar uma classe no bd
    Classe findByName (String nome);//metodo para retornar uma classe pelo nome
}
