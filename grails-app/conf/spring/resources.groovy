import com.restexample.mobile.Image
import com.restexample.mobile.Manufacturer
import com.restexample.mobile.Phone
import com.restexample.mobile.ProductVariation
import grails.rest.render.json.JsonRenderer

// Place your Spring DSL code here
beans = {
    phoneJsonRenderer(JsonRenderer, Phone) {
        excludes = ['class']
    }
    imageJsonRenderer(JsonRenderer, Image) {
        excludes = ['class', 'id']
    }
    manufacturerJsonRenderer(JsonRenderer, Manufacturer) {
        excludes = ['class', 'id', 'products']
    }
    productVariationJsonRenderer(JsonRenderer, ProductVariation) {
        excludes = ['class', 'id', 'product']
    }
}
