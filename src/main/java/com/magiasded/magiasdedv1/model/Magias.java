package com.magiasded.magiasdedv1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_magias")
public class Magias
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String escolaMagia;
    private int nivel;
    private String tempoConjuracao;
    private String alcance;
    private String componentes;
    private String duracao;
    @Lob
    private String descricao;
}
