package com.csi.esmee.demo.repository;
import org.springframework.stereotype.Repository;
import com.csi.esmee.demo.model.Tableau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@EnableJpaRepositories
@Repository
public interface TableauRepository extends JpaRepository<Tableau, Long> {
}
