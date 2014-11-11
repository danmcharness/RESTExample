package com.restexample.mobile

import grails.rest.Resource

@Resource(uri = "/phones", formats = ["json"], readOnly = true)
class Phone extends Product {

    static constraints = {
    }
}
