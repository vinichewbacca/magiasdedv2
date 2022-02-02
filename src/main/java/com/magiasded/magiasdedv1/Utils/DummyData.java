package com.magiasded.magiasdedv1.Utils;

import com.magiasded.magiasdedv1.model.Classe;
import com.magiasded.magiasdedv1.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//@Component
public class DummyData
{
    @Autowired
    ClasseRepository classeRepository;

    //@PostConstruct
    public void saveClasse()
    {
        List<Classe> classeList = new ArrayList<>();
        Classe c1 = new Classe();
        c1.setNome("Bardo");
        Classe c2 = new Classe();
        c2.setNome("Bruxo");
        Classe c3 = new Classe();
        c3.setNome("Clérigo");
        Classe c4 = new Classe();
        c4.setNome("Druida");

        classeList.add(c1);
        classeList.add(c2);
        classeList.add(c3);
        classeList.add(c4);

        for (Classe classe: classeList)
        {
            Classe classeSaved = classeRepository.save(classe);
            System.out.println(classeSaved.getId());
        }
    }
}
