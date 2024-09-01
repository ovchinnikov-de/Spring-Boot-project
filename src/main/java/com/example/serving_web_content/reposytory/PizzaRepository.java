package com.example.serving_web_content.reposytory;

import com.example.serving_web_content.models.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza,Long> {
}
