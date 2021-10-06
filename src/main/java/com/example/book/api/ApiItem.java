package com.example.book.api;

import com.example.book.dto.ItemDto;
import com.example.book.service.IItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ApiItem {
    private final IItemService iItemService;

    public ApiItem(IItemService iItemService) {
        this.iItemService = iItemService;
    }

    @PostMapping(value = "/create")
    public ItemDto createNew(@RequestBody ItemDto itemDto) {
        return iItemService.update(itemDto);
    }

    @GetMapping(value = "/show")
    public List<ItemDto> display(){
        return iItemService.display();
    }

    @GetMapping(value = "/search/id={id}")
    public ItemDto getItemById(@PathVariable("id")long id){
        return iItemService.getItemId(id);
    }

    @PutMapping(value = "/update")
    public ItemDto update(@RequestBody ItemDto itemDto) {
        return iItemService.update(itemDto);
    }

    @DeleteMapping(value = "/delete/id={id}")
    public void deleteNew(@PathVariable("id") long id) {
        iItemService.delete(id);
    }
}
