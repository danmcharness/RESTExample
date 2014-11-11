package com.restexample.mobile

class Manufacturer {

    String name

    static hasMany = [products: Product]

    static constraints = {
    }
}
