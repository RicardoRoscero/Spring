/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Laptop;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.LaptopService;

/**
 *
 * @author rrosero23
 */

@RestController
@RequestMapping("/laptops")

public class LaptopController {
    @Autowired
    private LaptopService laptopService;
    
    @GetMapping
    public List<Laptop>findAll(){
    return laptopService.findAll();
    }
    @GetMapping("/{id}")
    public Laptop findById(@PathVariable Long id) {
        return laptopService.findById(id);
    }

    @PostMapping
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopService.create(laptop);
    }

    @PutMapping("/{id}")
    public Laptop update(@PathVariable Long id, @RequestBody Laptop laptop) {
        return laptopService.update(id, laptop);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        laptopService.delete(id);
    }
    
    @DeleteMapping
    public void deleteAll() {
        laptopService.deleteAll();
    }
    
}
