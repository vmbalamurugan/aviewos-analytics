package com.avios.hackathon.controller;

import com.avios.hackathon.domain.City;
import com.avios.hackathon.domain.Image;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by t594957 on 10/24/2018.
 */
@RestController
@RequestMapping("/favourites")
public class FavouritesController {

    private boolean recommend;

    @CrossOrigin
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<City>> getFavourites() throws Exception {
        List<Image> images = new ArrayList<>();
        City city1 = new City();
        if (recommend) {
            city1.setName("Santorini (Thira)");
            city1.setDetails("Santorini is a 'must-see'. Look up from the ocean for pristine blue and white houses clinging to the top of the caldera - left by the eruption 3,600 years ago. Look from the Western cliffs for jaw-dropping sunsets. And look a little further for caves, lemon groves and the preserved town of Akrotiri.");
            Image image1 = new Image();
            image1.setAlt("Photo of Santorini (Thira)");
            image1.setSrc("/explorer-map/images/large/santorini_large.jpg");
            images.add(image1);
            city1.setImages(images);
        } else {
            city1.setName("Prague");
            city1.setDetails("Prague's history and architecture is its headline attraction - gothic, neoclassical or even cubist. But Medieval musts like Charles Bridge and the Old Town can pale after a while. Especially when the call of Pilsner, Budvar or Staropramen gets hold. Then it's time to drink all that culture in.");
            Image image1 = new Image();
            image1.setAlt("Photo of Prague");
            image1.setSrc("/explorer-map/images/large/prague_large.jpg");
            images = new ArrayList<>();
            images.add(image1);
            city1.setImages(images);

        }


        City city2 = new City();
        city2.setName("Venice");
        city2.setDetails("Strangely unafraid of the notion it could fall into water, Venice seems more canal than land. This blissful blindness to the future echoes its visiting lovers. Piazza San Marco, Bellinis at Harry's Bar, hypnotic gondaliers getting couples to part with Euros. Somehow it all makes glorious sense here.");
        Image image2 = new Image();
        image2.setAlt("Photo of Venice");
        image2.setSrc("/explorer-map/images/large/venice_large.jpg");
        images = new ArrayList<>();
        images.add(image2);
        city2.setImages(images);

        City city3 = new City();
        city3.setName("Seville");
        city3.setDetails("Strangely unafraid of the notion it could fall into water, Venice seems more canal than land. This blissful blindness to the future echoes its visiting lovers. Piazza San Marco, Bellinis at Harry's Bar, hypnotic gondaliers getting couples to part with Euros. Somehow it all makes glorious sense here.");
        Image image3 = new Image();
        image3.setAlt("Photo of Seville");
        image3.setSrc("/explorer-map/images/large/seville_large.jpg");
        images = new ArrayList<>();
        images.add(image3);
        city3.setImages(images);

        City city4 = new City();
        city4.setName("Nice");
        city4.setDetails("Queen of the French Riviera - with an Italian twist. It's not all grand hotels, la belle époque and Salad Nicoise. Life here centres on the beach and picturesque port, with the Promenade des Anglais taking pride of place. But its flower markets and chateau provide distraction too.");
        Image image4 = new Image();
        image4.setAlt("Photo of Nice");
        image4.setSrc("/explorer-map/images/large/nice_large.jpg");
        images.add(image4);
        city4.setImages(images);

        List<City> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);


        return new ResponseEntity<List<City>>(cities, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addFavourites(HttpServletRequest request, @PathVariable String city) throws Exception {
        recommend = true;
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }


}
