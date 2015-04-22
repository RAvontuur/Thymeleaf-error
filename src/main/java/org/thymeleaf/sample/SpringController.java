package org.thymeleaf.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.sample.model.Page;
import org.thymeleaf.sample.model.PageElement;
import org.thymeleaf.sample.model.PriceElement;

import java.math.BigDecimal;

@Controller
public class SpringController {

    @RequestMapping("/")
    public String showMainPage(Model model){
        // creating Page object with 100 PageElement
        // each PageElement has price object with currency and amount
        Page page = createModel();
        model.addAttribute("page", page);
        return "page";
    }

    private Page createModel() {
        Page page = new Page();
        for(int i = 0 ; i < 50;i++) {
            page.getElementCollection().add(new PageElement(new PriceElement("EUR", BigDecimal.valueOf(i))));
            page.getElementCollection().add(new PageElement(new PriceElement("USD", BigDecimal.valueOf(i))));
        }
        return page;
    }
}

