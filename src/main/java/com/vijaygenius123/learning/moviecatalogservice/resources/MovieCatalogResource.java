package com.vijaygenius123.learning.moviecatalogservice.resources;

import com.vijaygenius123.learning.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        return Collections.singletonList(
                new CatalogItem("Avengers", "The Avengers", 5)
        );
    }
}
