package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;

import cat.itacademy.s04.t02.n01.services.FruitService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

   @RestController
   @RequestMapping("/fruit")
     public class FruitController {

        @Autowired
    private FruitService fruitService;

     @PostMapping("/add")
     public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(fruitService.addFruit(fruit));
    }

        @PutMapping("/update")
     public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(fruitService.updateFruit(fruit));
    }

     @DeleteMapping("/delete/{id}")
     public ResponseEntity<Void> deleteFruit(@PathVariable int id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

        @GetMapping("/getOne/{id}")
     public ResponseEntity<Fruit> getFruit(@PathVariable int id) {
        return fruitService.getFruitById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

     @GetMapping("/getAll")
     public ResponseEntity<List<Fruit>> getAllFruits() {
        return ResponseEntity.ok(fruitService.getAllFruits());
    }
}