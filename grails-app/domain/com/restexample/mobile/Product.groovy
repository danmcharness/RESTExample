package com.restexample.mobile

class Product {

    String name
    String description

    static belongsTo = [manufacturer: Manufacturer]

    static hasMany = [images: Image,
                      productVariations: ProductVariation]

//    static hasMany = [productVariations: ProductVariation]

    static constraints = {
        description nullable: true
    }
}
