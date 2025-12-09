package az.edu.itbrains.ecommerce.controllers.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/dashboard")
public class ProductController {

    @GetMapping("/product")
    public String index(){
        return "admin/product/index.html";
    }

    @GetMapping("/product/create")
    public String create(){
        return "admin/product/create.html";
    }



}
