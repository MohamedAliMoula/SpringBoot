package tn.esprit.foyer.Controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entity.Universite;
import tn.esprit.foyer.Service.UniversiteService;
import tn.esprit.foyer.Service.UniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/universite")
@CrossOrigin("*")
public class UniversiteController {
    UniversiteService universiteService;
    
    @GetMapping("/all")
    @JsonIgnore
    public List<Universite> getAll() {
        return universiteService.retrieveAllUniversities();
    }
    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id){
        return universiteService.retrieveUniversity(id);
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite e) {
        return universiteService.addUniversity(e);
    }
    @PutMapping("/update")
    public Universite updateUniversite( @RequestBody Universite  Universite){
        return universiteService.updateUniversity(Universite);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUniversite(@PathVariable Long id){
        universiteService.removeUniversity(id);

    }

}
