package com.konversiBerat.KonversiBerat;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hp
 */
@Controller
public class KonversiBerat {
    
    @RequestMapping("/viewberat")
    public String inputanuser(HttpServletRequest data, Model berat){
        String hberat = data.getParameter("var_konversiBerat");
        Double chberat = Double.valueOf(hberat);
        Double c = chberat;
       
        Double gram = c * 1000;
        Double pon = c * 2.20;
        Double ons = c * 35.27;
        

        berat.addAttribute("c",c);
        berat.addAttribute("berat",chberat);
        berat.addAttribute("gram",gram);
        berat.addAttribute("pon",pon);
        berat.addAttribute("ons",ons);
        return "MuhIhsan";
    }
}
