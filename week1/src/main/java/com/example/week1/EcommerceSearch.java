package com.example.week1;

import java.util.ArrayList;
import java.util.List;

public class EcommerceSearch {
    public List<String> search(String query, List<String> products) {
        List<String> results = new ArrayList<>();
        String lower = query.toLowerCase();
        for (String product : products) {
            if (product.toLowerCase().contains(lower)) {
                results.add(product);
            }
        }
        return results;
    }
}
