package com.csi.esmee.demo.service;

import com.csi.esmee.demo.model.Tableau;
import com.csi.esmee.demo.repository.TableauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class TableauService {

    @Autowired
    private final TableauRepository tableauRepository;



    @Autowired
    public TableauService(TableauRepository tableauRepository) {
        this.tableauRepository = tableauRepository;
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/tableau/{id}")
    public Tableau getTableauById(@PathVariable Long id) {
        return tableauRepository.findById(id).orElse(null);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/tableau")
    public Tableau createTableau(@RequestBody Tableau tableau) {
        return tableauRepository.save(tableau);
    }
    @CrossOrigin(origins = "*")
    @PutMapping("/tableau")
    public Tableau updateTableau(@PathVariable Long id, @RequestBody Tableau tableau) {
        tableau.setId(id);
        return tableauRepository.save(tableau);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/tableau")
    public List<Tableau> getAllTableaux() {
        return tableauRepository.findAll();
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/tableau/{id}")
    public ResponseEntity<Void> deleteTableau(@PathVariable Long id) {
        tableauRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
