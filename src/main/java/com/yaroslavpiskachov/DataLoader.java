package com.yaroslavpiskachov;

import com.yaroslavpiskachov.model.Product;
import com.yaroslavpiskachov.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private ProductService productService;

    @Autowired
    public DataLoader(ProductService productService) {
        this.productService = productService;
    }

    public void run(ApplicationArguments args) {
        productService.add(new Product("Iphone 11 Pro", "Triple-lens cameras\n" +
                "new ultra wide-angle lens\n" +
                "More durable, water resistant body\n" +
                "Matte finish and new dark green color\n" +
                "Night Mode for better low-light images\n" +
                "Haptic Touch instead of 3D Touch\n" +
                "Ultra Wideband support\n" +
                "A13 chip\n" +
                "Faster WiFi and LTE", 1000.0));

        productService.add(new Product("Iphone 11", "Dual-lens rear camera\n" +
                "Ultra Wide and Wide lenses\n" +
                "6.1\" Liquid Retina display\n" +
                "Night Mode\n" +
                "Dolby Atmos\n" +
                "More durable glass\n" +
                "New colors", 800.0));

        productService.add(new Product("Iphone XR", "Edge-to-edge display with Face ID\n" +
                "Glass body with aluminum frame\n" +
                "12-megapixel rear camera\n" +
                "A12 Bionic chip\n" +
                "IP67 water and dust resistance\n" +
                "Six color options", 700.0));

        productService.add(new Product("Ipad Pro", "12.9-inch 2732 x 2048 or 11-inch 2388 x 1668 display\n" +
                "A12Z Bionic processor\n" +
                "Edge-to-edge display without Home button\n" +
                "12MP Wide and 10MP Ultra Wide rear cameras\n" +
                "LiDAR depth scanner for AR\n" +
                "TrueDepth Camera with Face ID\n" +
                "Optional Apple Pencil 2, Magic Keyboard With Trackpad, and Smart Keyboard Folio\n" +
                "Available in Silver and Space Gray", 1200.0));

        productService.add(new Product("AirPods Pro", "New in-ear design\n" +
                "Silicone tips in 3 sizes\n" +
                "Active noise cancellation technology\n" +
                "IPX4 water and sweat resistance\n" +
                "H1 chip with \"Hey Siri\" support", 400.0));
    }
}
