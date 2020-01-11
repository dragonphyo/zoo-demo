package com.example.demozoo.service;

import com.example.demozoo.domain.*;
import com.example.demozoo.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseImpl implements IDatabase{
    private final AnimalRepository animalRepository;
    private final CageRepository cageRepository;
    private final CategoryRepository categoryRepository;
    private final FootItemsRepository footItemsRepository;
    private final SupplierRepository supplierRepository;

    public DatabaseImpl( AnimalRepository animalRepository, CageRepository cageRepository,
                              CategoryRepository categoryRepository, FootItemsRepository footItemsRepository,
                              SupplierRepository supplierRepository) {
        this.animalRepository = animalRepository;
        this.cageRepository = cageRepository;
        this.categoryRepository = categoryRepository;
        this.footItemsRepository = footItemsRepository;
        this.supplierRepository = supplierRepository;
    }

    @Override
    @Transactional
    public void createTable() {
        {
            Category category1 = new Category();
            Category category2 = new Category();
            category1.setCategory_type("memals");
            category2.setCategory_type("reptile");

            Animal animal1 = new Animal("Tiger",2);
            Animal animal2 = new Animal("Beer",3);
            Animal animal3 = new Animal("Snake",4);
            Animal animal4 = new Animal("Monkey",5);

            Cage cage1 = new Cage("1","East");
            Cage cage2 = new Cage("2","West");
            Cage cage3 = new Cage("3","South");
            Cage cage4 = new Cage("4","North");

            Supplier supplier1 = new Supplier("Thomas","12345","Ygn");
            Supplier supplier2 = new Supplier("Willian","12345","Mdy");

            FootItems footItems1 = new FootItems("Wheat",300);
            FootItems footItems2 = new FootItems("Vegitables",100);
            FootItems footItems3 = new FootItems("Meats",100);
            FootItems footItems4 = new FootItems("Beans",300);

            animal1.setCategory(category1);
            animal2.setCategory(category1);
            animal3.setCategory(category2);
            animal4.setCategory(category2);

            cage1.setAnimal(animal1);
            cage2.setAnimal(animal2);
            cage3.setAnimal(animal3);
            cage4.setAnimal(animal4);

            footItems1.setSupplier(supplier1);
            footItems2.setSupplier(supplier1);
            footItems3.setSupplier(supplier2);
            footItems4.setSupplier(supplier2);

            footItems1.getAnimals().add(animal1);
            footItems2.getAnimals().add(animal1);
            footItems3.getAnimals().add(animal1);
            footItems4.getAnimals().add(animal1);


            footItems2.getAnimals().add(animal2);
            footItems3.getAnimals().add(animal3);
            footItems4.getAnimals().add(animal4);

            animalRepository.save(animal1);
            animalRepository.save(animal2);
            animalRepository.save(animal3);
            animalRepository.save(animal4);

            cageRepository.save(cage1);
            cageRepository.save(cage2);
            cageRepository.save(cage3);
            cageRepository.save(cage4);

            footItemsRepository.save(footItems1);
            footItemsRepository.save(footItems2);
            footItemsRepository.save(footItems3);
            footItemsRepository.save(footItems4);



        }
    }
}
