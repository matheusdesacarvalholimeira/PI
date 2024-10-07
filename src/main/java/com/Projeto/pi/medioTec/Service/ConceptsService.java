package com.Projeto.pi.medioTec.Service;

import com.Projeto.pi.medioTec.Dto.Request.concept.CreateAlunoConceptGenericReqDto;
import com.Projeto.pi.medioTec.Dto.Request.concept.InsertConceptsAlunoGenericReqDto;
import com.Projeto.pi.medioTec.Repository.ConceptUnitOneRepository;
import com.Projeto.pi.medioTec.Repository.ConceptUnitThreeRepository;
import com.Projeto.pi.medioTec.Repository.ConceptUnitTwoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConceptsService {

    @Autowired
    private ConceptUnitOneRepository conceptUnitOneRepository;
    @Autowired
    private ConceptUnitTwoRepository conceptUnitTwoRepository;
    @Autowired
    private ConceptUnitThreeRepository conceptUnitThreeRepository;




    public void insertConceptsAlunoUnitOne(InsertConceptsAlunoGenericReqDto data){
        conceptUnitOneRepository.insert_aluno_concept_unit_one(
                data.id(),
                data.av1(),
                data.av2(),
                data.status(),
                data.alunoId(),
                data.disciplineId()
        );
    }



    public void insertConceptsAlunoUnitTwo(InsertConceptsAlunoGenericReqDto data){
        conceptUnitTwoRepository.insert_aluno_concept_unit_two(
                data.id(),
                data.av1(),
                data.av2(),
                data.status(),
                data.alunoId(),
                data.disciplineId()
        );
    }


    public void insertConceptsAlunoUnitThree(InsertConceptsAlunoGenericReqDto data){
        conceptUnitThreeRepository.insert_aluno_concept_unit_three(
                data.id(),
                data.av1(),
                data.av2(),
                data.status(),
                data.alunoId(),
                data.disciplineId()
        );
    }
}
