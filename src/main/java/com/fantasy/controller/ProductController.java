package com.fantasy.controller;

import com.fantasy.entity.Product;
import com.fantasy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    public ProductService productService;

    @GetMapping("/")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.findAll());
        return "productsList";
    }

    @GetMapping("/addProduct")
    public String createProductPage() {
        return "createProduct";
    }


    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute("product") Product product) throws Exception {
        productService.save(product);
        return "redirect:/";
    }

    @PostMapping("/updateProduct")
    public String updateProduct(@ModelAttribute("product") Product product) {
        productService.update(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", productService.getById(id));
        return "editProduct";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        productService.delete(id);
        return "redirect:/";
    }
}
