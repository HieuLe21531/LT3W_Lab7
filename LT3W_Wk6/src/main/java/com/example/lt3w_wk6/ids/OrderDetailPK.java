package com.example.lt3w_wk6.ids;

import com.example.lt3w_wk6.models.Order;
import com.example.lt3w_wk6.models.Product;
import java.io.Serializable;

public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
