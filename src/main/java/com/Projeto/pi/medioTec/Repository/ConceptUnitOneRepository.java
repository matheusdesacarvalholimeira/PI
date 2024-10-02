package com.Projeto.pi.medioTec.Repository;

import com.Projeto.pi.medioTec.Entity.Concepts.ConceptUnitOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface ConceptUnitOneRepository extends JpaRepository<ConceptUnitOne, String> {

    @Procedure
    void create_aluno_concept_unit_one(@Param("p_aluno_id") String aluno,
                                       @Param("p_discipline_id") String discipline
    );

    @Procedure
    void insert_aluno_concept_unit_one(@Param ("p_id") String id,
                                       @Param ("p_av1") String av1 ,
                                       @Param ("p_av2") String av2,
                                       @Param ("p_nf") String nf,
                                       @Param ("p_status") String status
    );

}