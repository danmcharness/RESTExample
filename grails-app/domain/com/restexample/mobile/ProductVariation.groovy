package com.restexample.mobile

class ProductVariation {

    String label
    Boolean baseVariation
    BigDecimal listPrice
    BigDecimal salePrice

    static belongsTo = [product: Product]

    static constraints = {
        label nullable: true
    }
}
