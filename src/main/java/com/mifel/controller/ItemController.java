package com.mifel.controller;

import com.mifel.model.Item;
import com.mifel.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping
    public List<Item> obtenerItems(@RequestBody Map<String, String> filtro) {
        String nombre = filtro.get("nombre");
        if (nombre == null || nombre.trim().isEmpty()) {
            return itemRepository.findAll();
        } else {
            return itemRepository.findByNombreContainingIgnoreCase(nombre);
        }
    }
}