package cz.czechitas.java2webapps.ukol3.controller;

import entity.Vizitka;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final List<Vizitka> vizitky=List.of(
          new Vizitka ("Dita (Přikrylová) Formánková", "Czechitas",
                  "Václavské náměstí 837/11<",
                  "Praha 11000", "Václavské náměstí 837/11, 11000 Praha",
                  "dita@czechitas.cs",
                  "+420 800123456", "www.czechitas.cz"),
          new Vizitka("Barbora Bühnová", "Czechitas",
                  "Václavské náměstí 837/11", "Praha 11000",
                  "Václavské náměstí 837/11, 11000 Praha",
                  "barbora@seznam.cz","+420 800123456", "www.czechitas.cz"),
          new Vizitka("Monika Ptáčníková", "Czechitas",
                  "Václavské náměstí 837/11", "Praha 11000",
                  "Václavské náměstí 837/11, 11000 Praha",
                  "monika@seznam.cz","+420 800123456", "www.czechitas.cz"),
          new Vizitka("Mirka Zatloukalová", "Czechitas",
                  "Václavské náměstí 837/11", "Praha 11000",
                  "Václavské náměstí 837/11, 11000 Praha",
                  "mirka@seznam.cz","+420 800123456", "www.czechitas.cz")
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("vizitky", vizitky);

    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView= new ModelAndView("detail");
    modelAndView.addObject("vizitka", vizitky.get(id));
    return modelAndView;
  }
}
