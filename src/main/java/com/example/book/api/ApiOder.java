package com.example.book.api;

import com.example.book.dto.OderDto;
import com.example.book.entity.OderEntity;
import com.example.book.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/oder")
public class ApiOder {

    @Autowired
    private IOderService iOderService;

    @PostMapping(value = "/create")
    public OderDto createNew(@RequestBody OderDto oderDto) {
        return iOderService.create(oderDto);
    }

    @GetMapping(value = "/show")
    public List<OderEntity> display(){
        return iOderService.display();
    }

}
