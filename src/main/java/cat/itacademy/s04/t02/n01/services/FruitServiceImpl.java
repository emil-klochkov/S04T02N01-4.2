package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruit;

import cat.itacademy.s04.t02.n01.repository.FruitRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;


        @Service
      public class FruitServiceImpl implements FruitService {

     @Autowired
     private FruitRepository fruitRepository;

        @Override
    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

     @Override
    public Fruit updateFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

        @Override
    public void deleteFruit(int id) {
        fruitRepository.deleteById(id);
    }

     @Override
    public Optional<Fruit> getFruitById(int id) {
        return fruitRepository.findById(id);
    }

        @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
}