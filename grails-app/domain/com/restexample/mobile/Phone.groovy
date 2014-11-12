package com.restexample.mobile

import grails.rest.Resource

@Resource(uri = "/api/phones", formats = ["json"], readOnly = true)
class Phone extends Product {

    static constraints = {
    }
}
