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

        productService.add(new Product("MacBook Pro 13”", "13.3-inch Retina display1\n" +
                "Up to 4-core Intel Core i7 processor\n" +
                "Up to 16GB memory\n" +
                "Up to 2TB storage2\n" +
                "Up to 10 hours battery life3\n" +
                "Touch Bar and Touch ID\n" +
                "Backlit keyboard", 999.0));

        productService.add(new Product("MacBook Pro 16””", "16-inch Retina display1\n" +
                "Up to 8-core Intel Core i9 processor\n" +
                "Up to 64GB memory\n" +
                "Up to 8TB storage2\n" +
                "Up to 11 hours battery life3\n" +
                "Touch Bar and Touch ID\n" +
                "Backlit Magic Keyboard", 999.0));

        productService.add(new Product("iPhone SE", "4.7” Retina HD display\n" +
                "Single-camera system (Wide)\n" +
                "Water resistant to a depth of 1 meter for up to 30 minutes2\n" +
                "Up to 13 hours of video playback3", 399.0));

        productService.add(new Product("iPhone XS", "Silver, space gray, and gold\n" +
                "5.8-inch Super Retina HD display with HDR and True Tone1\n" +
                "Glass and stainless steel design\n" +
                "Water resistant to a depth of 2 meters for up to 30 minutes (IP68)3\n" +
                "Dual 12MP cameras (Wide, Telephoto) with Portrait mode, Smart HDR, and 4K video up to 60 fps with extended dynamic range up to 30 fps\n" +
                "7MP TrueDepth front camera with Portrait mode, Smart HDR, and 1080p HD video recording up to 60 fps\n" +
                "Face ID for secure authentication and Apple Pay\n" +
                "A12 Bionic chip with second-generation Neural Engine\n" +
                "Battery life: Up to 14 hours video playback2\n" +
                "Wireless charging11\n" +
                "Fast-charge capable", 899.0));

        productService.add(new Product("iPhone XS", "Silver, space gray, and gold\n" +
                "6.5-inch Super Retina HD display with HDR and True Tone1\n" +
                "Glass and stainless steel design\n" +
                "Water resistant to a depth of 2 meters for up to 30 minutes (IP68)3\n" +
                "Dual 12MP cameras (Wide, Telephoto) with Portrait mode, Smart HDR, and 4K video up to 60 fps with extended dynamic range up to 30 fps\n" +
                "7MP TrueDepth front camera with Portrait mode, Smart HDR, and 1080p HD video recording up to 60 fps\n" +
                "Face ID for secure authentication and Apple Pay\n" +
                "A12 Bionic chip with second-generation Neural Engine\n" +
                "Battery life: Up to 15 hours video playback2\n" +
                "Wireless charging11\n" +
                "Fast-charge capable", 999.0));

        productService.add(new Product("iPhone X", "Silver and space gray\n" +
                "5.8-inch Super Retina HD display with HDR and True Tone1\n" +
                "Glass and stainless steel design\n" +
                "Water resistant to a depth of 1 meter for up to 30 minutes (IP67)3\n" +
                "Dual 12MP cameras (Wide, Telephoto) with Portrait mode, Auto HDR, and 4K video up to 60 fps\n" +
                "7MP TrueDepth front camera with Portrait mode, Auto HDR, and 1080p HD video recording at 30 fps\n" +
                "Face ID for secure authentication and Apple Pay\n" +
                "A11 Bionic chip with Neural Engine\n" +
                "Battery life: Up to 13 hours video playback2\n" +
                "Wireless charging11\n" +
                "Fast-charge capable", 899.0));

        productService.add(new Product("iPhone 8 Plus", "Silver, space gray, and gold\n" +
                "5.5-inch Retina HD display with True Tone\n" +
                "Glass and aluminum design\n" +
                "Water resistant to a depth of 1 meter for up to 30 minutes (IP67)3\n" +
                "Dual 12MP cameras (Wide, Telephoto) with Portrait mode, Auto HDR, and 4K video up to 60 fps\n" +
                "7MP FaceTime HD camera with Auto HDR and 1080p HD video recording at 30 fps\n" +
                "Touch ID for secure authentication and Apple Pay\n" +
                "A11 Bionic chip with Neural Engine\n" +
                "Battery life: Up to 14 hours video playback2\n" +
                "Wireless charging11\n" +
                "Fast-charge capable", 599.0));

        productService.add(new Product("iPhone 7 Plus", "Black, silver, gold, and rose gold\n" +
                "5.5-inch Retina HD display\n" +
                "Water resistant to a depth of 1 meter for up to 30 minutes (IP67)3\n" +
                "Dual 12MP cameras (Wide, Telephoto) with Portrait mode, HDR, and 4K video at 30 fps\n" +
                "7MP FaceTime HD camera with HDR and 1080p HD video recording at 30 fps\n" +
                "Touch ID for secure authentication and Apple Pay\n" +
                "A10 Fusion chip\n" +
                "Battery life: Up to 14 hours video playback2", 399.0));

        productService.add(new Product("iPhone 6s", "Silver, space gray, gold, and rose gold\n" +
                "4.7-inch Retina HD display\n" +
                "Single 12MP camera (Wide) with HDR and 4K video at 30 fps\n" +
                "5MP FaceTime HD camera with HDR and 720p HD video recording at 30 fps\n" +
                "Touch ID for secure authentication and Apple Pay\n" +
                "A9 chip\n" +
                "Battery life: Up to 11 hours video playback2", 349.0));

        productService.add(new Product("iPhone 6s", "Silver, space gray, and gold\n" +
                "4.7-inch Retina HD display\n" +
                "Single 8MP camera (Wide) with HDR and 1080p HD video up to 60 fps\n" +
                "1.2MP FaceTime HD camera with HDR and 720p HD video recording at 30 fps\n" +
                "Touch ID for secure authentication and Apple Pay\n" +
                "A8 chip\n" +
                "Battery life: Up to 11 hours video playback2", 299.0));

        productService.add(new Product("Test title", "Some test description\n" +
                "Some test description\n" +
                "Some test description\n" +
                "Some test description\n" +
                "Some test description", 100.0));
    }
}
