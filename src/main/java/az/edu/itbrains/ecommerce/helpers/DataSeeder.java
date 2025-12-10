package az.edu.itbrains.ecommerce.helpers;

import az.edu.itbrains.ecommerce.repositories.CategoryRepository;
import az.edu.itbrains.ecommerce.repositories.ColorRepository;
import az.edu.itbrains.ecommerce.repositories.PhotoRepository;
import az.edu.itbrains.ecommerce.repositories.ProductRepository;
import az.edu.itbrains.ecommerce.repositories.SizeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ColorRepository colorRepository;
    private final SizeRepository sizeRepository;
    private final PhotoRepository photoRepository;

    @Override
    public void run(String... args) throws Exception {
//        List<Category> categories = categoryRepository.findAll();
//        if (categories.isEmpty()) {
//            List<Category> categoryList = List.of(
//                    new Category("Man", "man"),
//                    new Category("Woman", "woman"),
//                    new Category("T-Shirts", "t-shirts"),
//                    new Category("Hoodies & Sweatshirts", "hoodies-sweatshirts"),
//                    new Category("Jeans", "jeans"),
//                    new Category("Pants & Trousers", "pants-trousers"),
//                    new Category("Shorts", "shorts"),
//                    new Category("Jackets & Coats", "jackets-coats"),
//                    new Category("Suits & Blazers", "suits-blazers"),
//                    new Category("Shoes", "shoes"),
//                    new Category("Sneakers", "sneakers"),
//                    new Category("Bags", "bags"),
//                    new Category("Accessories", "accessories"),
//                    new Category("Dresses", "dresses"),
//                    new Category("Skirts", "skirts"),
//                    new Category("Blouses", "blouses"),
//                    new Category("Cardigans", "cardigans"),
//                    new Category("Knitwear", "knitwear"),
//                    new Category("Underwear", "underwear"),
//                    new Category("Sportswear", "sportswear"),
//                    new Category("Swimwear", "swimwear"),
//                    new Category("Premium Collection", "premium-collection")
//            );
//
//            categoryRepository.saveAll(categoryList);
//
//            System.out.println("Salam!");
//        }
//
//        List<Product> products = productRepository.findAll();
//        if (products.isEmpty()) {
//            Category c1 = categories.get(0);
//            Category c2 = categories.get(1);
//            Category c3 = categories.get(2);
//            Category c4 = categories.get(3);
//            Category c5 = categories.get(4);
//            Category c6 = categories.get(5);
//            Category c7 = categories.get(6);
//            Category c8 = categories.get(7);
//            Category c9 = categories.get(8);
//            Category c10 = categories.get(9);
//
//            List<Product> productList = List.of(
//                    new Product("BC001", c1, "Nike Air Force 1 Low kişi ayaqqabısı gündəlik istifadə üçün ideal seçimdir. Dəri materialı həm davamlılıq, həm də rahatlıq təmin edir. Modelin altlığı zərbəni yumşaldır və ayağı uzun müddət yormur. Retro dizaynı sayəsində həm klassik, həm də streetwear kombinlər ilə ahəng yaradır.", 0.10, 149.99, "Nike Air Force 1"),
//                    new Product("BC002", c2, "Zara Woman Black Coat qadınlar üçün qara rəngli uzun palto modelidir. Soyuq havalarda istilik saxlayan teksturası və zərif görünüşü ilə həm gündəlik, həm də rəsmi kombinlərdə mükəmməl uyğunluq yaradır. Kəmər detayı bədən xəttini daha incə göstərir və rahat hərəkət təmin edir.", 0.15, 89.90, "Zara Black Coat"),
//                    new Product("BC003", c3, "Adidas Ultraboost 22 kişi qaçış ayaqqabısı Boost texnologiyası ilə maksimal komfort verir. Mesh üst hissə hava dövranını artırır və ayağın tərləməsinin qarşısını alır. Uzun məsafələrdə stabil dəstək təklif edir və peşəkar idmançılar tərəfindən ən çox seçilən modellərdən biridir.", 0.05, 199.99, "Adidas Ultraboost"),
//                    new Product("BC004", c4, "Bershka Oversized Denim Jacket qadınlar üçün rahat oversized kəsimli cins gödəkcədir. Həm payız, həm yaz mövsümlərində istifadə oluna bilər. Streetwear tərzini sevənlər üçün ideal seçimdir və qalın materialı onu daha davamlı edir. Gündəlik hər kombinlə uyğunlaşır.", 0.12, 49.99, "Denim Jacket"),
//                    new Product("BC005", c5, "Puma Essentials Hoodie kişi üçün hazırlanmış rahat və yumşaq kapşonludur. Materialı dərini qıcıqlandırmır və uzun müddət istifadədə formanı itirmir. Minimalist dizaynı onu həm idman, həm də gündəlik geyimlə uyğun edir. Qışda və ya sərin havada ideal isidici qat rolunu oynayır.", 0.07, 39.90, "Puma Hoodie"),
//                    new Product("BC006", c6, "Massimo Dutti Silk Blouse qadınlar üçün zərif ipək qarışımlı koftadır. Toxunuşda yüngül və zərif hiss yaradır, ofis və xüsusi günlər üçün mükəmməl seçimdir. Parça nəfəs alan və rahat oturan quruluşa malikdir. Minimalist dizaynı kombinasiyaları daha şık göstərir.", 0.10, 59.99, "Silk Blouse"),
//                    new Product("BC007", c7, "Levi’s 501 Original Jeans kişi cins şalvarıdır və klassik düz kəsimi ilə illərdir populyarlığını qoruyur. Parçası çox davamlıdır və zamanla bədən formasına uyğunlaşır. Hər yay və qış kombinlərinə uyğun universal model olaraq bilinir və uzunmüddətli istifadə təmin edir.", 0.10, 79.90, "Levi’s 501"),
//                    new Product("BC008", c8, "H&M Long Knit Dress qadınlar üçün hazırlanmış uzun trikotaj don modelidir. Yumşaq toxuması sayəsində həm rahatlıq, həm də istilik verir. Gündəlik istifadə üçün idealdır və həm idman ayaqqabısı, həm də çəkmə ilə kombin edilə bilər. Elastik strukturu fiquru narahat etmədən oturur.", 0.18, 35.99, "Knit Dress"),
//                    new Product("BC009", c9, "Columbia Waterproof Jacket kişi üçün suya davamlı gödəkcədir. Yağış və küləkli havalarda tam qoruma təmin edir. Həm yüngül çəkili, həm də yüksək davamlı materialdan hazırlanıb. Dağ yürüşü, səyahət və çətin hava şəraiti üçün mükəmməl funksionallıq təklif edir.", 0.20, 129.99, "Columbia Jacket"),
//                    new Product("BC010", c10, "Stradivarius High-Waist Pants qadın şalvarıdır və hündür bel kəsimi ilə bədəni daha proporsional göstərir. Materialı yüngül və elastikdir, gün boyu rahatlıq təmin edir. Ofis, gündəlik və minimalist kombinlərdə tez-tez seçilir və çox yönlü istifadə imkanı yaradır.", 0.10, 29.99, "High-Waist Pants"),
//                    new Product("BC011", c1, "Uniqlo Ultra Light Down Jacket kişi üçün ultra yüngül və yığcam gödəkcədir. Soyuq havalarda istilik saxlayan xüsusi dolğuya malikdir. Çox asan qatlanır və çantada az yer tutur. Günlük istifadə və səyahətlər üçün ideal funksionallığa sahibdir.", 0.10, 89.99, "Ultra Light Down"),
//                    new Product("BC012", c2, "Mango Wool Coat qadın üçün yüksək keyfiyyətli yun qarışımlı palto modelidir. Modern kəsimi və yumşaq teksturası ilə həm gündəlik, həm də rəsmi tərz üçün uyğundur. Uzun müddət formasını saxlayan keyfiyyətli parçadan hazırlanıb və qışda isti saxlayır.", 0.12, 119.99, "Mango Wool Coat"),
//                    new Product("BC013", c3, "Nike Dri-FIT Training Shirt kişi üçün məşq köynəyidir. Hava keçirən materialı tərləməni azaldır və bədəni quru saxlayır. Hərəkət zamanı dartılmayan və bədəni sıxmayan xüsusi elastik liflərlə hazırlanmışdır. İdman zallarında və açıq havada istifadə üçün idealdır.", 0.05, 24.99, "Dri-FIT Shirt"),
//                    new Product("BC014", c4, "Zara Satin Midi Skirt qadın üçün zərif parıldayan atlas midi ətək modelidir. Axıcı materialı zərif görünüş verir və hərəkət zamanı yumşaq şəkildə dalğalanır. Həm gündəlik, həm də xüsusi günlər üçün istifadə oluna bilər. Minimalist üst geyimlərlə mükəmməl uyğunlaşır.", 0.08, 39.99, "Satin Skirt"),
//                    new Product("BC015", c5, "Adidas Classic Hoodie kişi üçün rahat və davamlı kapşonlu sviterdir. Pambıq qarışımlı parça dərini qıcıqlandırmır və gün ərzində komfort təmin edir. Minimalist loqosu ilə sadə, lakin idman tərzinə uyğun görünüş yaradır. Soyuq havalarda əlavə isidici qat kimi əladır.", 0.07, 44.99, "Adidas Hoodie"),
//                    new Product("BC016", c6, "Pull&Bear Cargo Pants qadın üçün geniş cibləri olan rahat kargo şalvar modelidir. Elastik bel və düz kəsim gündəlik hərəkəti daha rahat edir. Streetwear tərzi sevənlər üçün ideal seçimdir və qalın materialı uzunmüddətli istifadə təmin edir.", 0.10, 35.99, "Cargo Pants"),
//                    new Product("BC017", c7, "Levi’s Trucker Jacket kişi üçün məşhur cins gödəkcə modelidir. Onilliklərdir aktual qalan ikonik dizayna malikdir. Davamlı denim materialı uzun illər formasını qoruyur və həm yay axşamları, həm də payız üçün mükəmməldir. Hər kombinə uyğundur.", 0.10, 95.00, "Trucker Jacket"),
//                    new Product("BC018", c8, "H&M Ribbed Sweater qadın üçün qalın toxumalı, rahat və isti sviter modelidir. Elastik strukturu bədənə tam oturur və soyuq havalarda isti saxlayır. Minimalist dizaynı ilə müxtəlif şalvar və ətəklərlə uyğunlaşır. Gündəlik istifadə üçün idealdır.", 0.15, 22.99, "Ribbed Sweater"),
//                    new Product("BC019", c9, "North Face Explorer Backpack kişi üçün nəzərdə tutulmuş geniş, çox bölməli çanta modelidir. Suya davamlı materialdan hazırlandığı üçün səyahət və yürüş üçün idealdır. Günlük daşıma üçün rahat arxa paneli və yumşaq qayışları ilə istifadəçi komfortu təmin edir.", 0.05, 69.99, "Explorer Backpack"),
//                    new Product("BC020", c10, "Stradivarius Crop Top qadın üçün yüngül və elastik üst geyimidir. Yay mövsümündə bədəni sərin saxlayır və müxtəlif yüksək bel şalvar, şort və ətəklərlə uyğunlaşır. Minimalist dizaynı gündəlik tərzdə çox yönlü kombin imkanları yaradır.", 0.10, 15.99, "Crop Top"),
//                    new Product("BC021", c1, "Nike Jordan Hoodie kişi üçün qalın və rahat kapşonlu sviterdir. Premium materialı həm isti saxlayır, həm də uzunmüddətli istifadə üçün idealdır. Gündəlik idman tərzi sevənlər üçün uyğundur və Jordan loqosu modeli daha cazibədar edir.", 0.12, 79.99, "Jordan Hoodie"),
//                    new Product("BC022", c2, "Zara Leather Crossbag qadın üçün minimalist dəri çantadır. Çarpaz asılqanı sayəsində rahat daşınır və gündəlik istifadə üçün idealdır. Kiçik olsa da, əsas əşyaları rahatlıqla yerləşdirmək mümkündür. Zərif dizaynı kombinləri daha modern göstərir.", 0.10, 49.99, "Leather Crossbag"),
//                    new Product("BC023", c3, "Adidas Running Shorts kişi üçün nəfəs alan və yüngül qaçış şortudur. İdman zamanı hava dövranını artırır və bədəni quru saxlayır. Elastik beli hərəkəti məhdudlaşdırmır və uzun məsafələr üçün ideal rahatlıq təmin edir.", 0.08, 19.99, "Running Shorts"),
//                    new Product("BC024", c4, "Mango Midi Dress qadın üçün zərif siluetli midi don modelidir. Axıcı parça həm yüngül, həm də rahatdır. Həm gündəlik istifadə, həm də xüsusi tədbirlər üçün uyğundur. Minimalist kəsimi və modern görünüşü ilə kombinlərdə xüsusi yer tutur.", 0.10, 45.99, "Midi Dress"),
//                    new Product("BC025", c5, "Puma Jogger Pants kişi üçün yumşaq və elastik idman şalvarıdır. Gündəlik istifadə üçün idealdır və ayağa rahat oturur. Parça tər toplamaz və uzunmüddətli istifadə üçün davamlıdır. Həm idman, həm də casual kombinlərə uyğun gəlir.", 0.07, 29.99, "Jogger Pants"),
//                    new Product("BC026", c6, "Massimo Dutti Linen Shirt qadın üçün yay mövsiminə uyğun kətan materialdan hazırlanmış koftadır. Təbii parça bədəni sərin saxlayır və hava keçirmə qabiliyyəti yüksəkdir. Minimalist dizaynı onu həm ofis, həm də gündəlik kombinlərdə istifadə edilə bilən universal seçimə çevirir.", 0.12, 59.99, "Linen Shirt"),
//                    new Product("BC027", c7, "Levi’s Slim Fit Jeans kişi üçün dar kəsim cins modelidir. Elastikliyi hərəkət zamanı rahatlıq təmin edir. Parça formasını itirmir və uzun müddət istifadə oluna bilər. Şık və modern görünüş yaratdığı üçün həm gündəlik, həm də ofis tərzinə uyğun gəlir.", 0.10, 72.99, "Slim Fit Jeans"),
//                    new Product("BC028", c8, "H&M Oversized Hoodie qadınlar üçün geniş kəsimli rahat sviterdir. Yumşaq iç astarı soyuq havalarda bədəni isti saxlayır. Minimalist dizaynı ilə jeans, leggings və ətəklərlə asan kombin edilir. Günlük istifadə üçün ideal rahatlıq verir.", 0.18, 27.99, "Oversized Hoodie"),
//                    new Product("BC029", c9, "Columbia Hiking Boots kişi üçün dağ yürüşlərinə uyğun suya davamlı çəkmə modelidir. Altlığın sürüşməyən quruluşu müxtəlif səthlərdə sabitlik təmin edir. Qalın materialı ayağı zədələrdən qoruyur və uzun yürüşlər üçün yüksək komfort yaradır.", 0.15, 140.00, "Hiking Boots"),
//                    new Product("BC030", c10, "Stradivarius Wide Leg Pants qadın üçün geniş kəsimli yüngül şalvar modelidir. Axıcı parça rahat hərəkət etməyə imkan verir və fiquru daha proportional göstərir. Minimalist dizaynı ilə həm ofis, həm də gündəlik istifadə üçün mükəmməl seçimdir.", 0.10, 32.99, "Wide Leg Pants")
//            );
//
//            productRepository.saveAll(productList);
    }
}
