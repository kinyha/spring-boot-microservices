package by.bratchykau.inventoryservice.controller;


import by.bratchykau.inventoryservice.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    private final InventoryService inventoryService;


    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skuCode) {
        return inventoryService.isInStock(skuCode);

    }

}
