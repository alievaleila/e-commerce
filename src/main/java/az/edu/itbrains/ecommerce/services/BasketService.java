package az.edu.itbrains.ecommerce.services;

import az.edu.itbrains.ecommerce.dtos.basket.BasketAddDto;

public interface BasketService {
    public void addToCart(String email, BasketAddDto basketAddDto) ;

    public boolean removeFromBasket(String email, Long productId) ;

    void removeAllItemsByEmail(String email);
}
