import com.restexample.mobile.Image
import com.restexample.mobile.Manufacturer
import com.restexample.mobile.Phone
import com.restexample.mobile.ProductVariation

class BootStrap {

    def init = { servletContext ->
        def numbers = ["1","2","3","4","5"]
        def letters = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
        def variations = ["16GB", "32GB", "64GB", "128GB"]
        def phonePrefix = ["Mega", "Giga", "Xtreme", "Galactic", "Nano", "Plutonium", "Crypto", "Edge"]
        def phoneMiddle = ["Galaxy", "Universe", "Element", "Photon", "Compound", "xPhone", "Communicator", "L4", "X4", "AERO", "Spec", "Lens"]
        def manufacturers = ["Samsang", "Sweedia", "Fruit", "Googly", "XTC", "Sonny", "Blueberry"]

        Random random = new Random()

        manufacturers.each {
            def manufacturer = new Manufacturer(name: it)

            random.nextInt(40).times {
                def phone = new Phone()
                phone.name = "${phonePrefix[random.nextInt(phonePrefix.size())]} ${phoneMiddle[random.nextInt(phonePrefix.size())]} " +
                             "${letters[random.nextInt(letters.size())]}${numbers[random.nextInt(numbers.size())]}"
                phone.description = phone.name

                def price = random.nextInt(500)
                def isFirst = true
                variations[0..random.nextInt(4)].each {
                    def variation = new ProductVariation()
                    variation.label = it
                    variation.listPrice = price
                    variation.salePrice = price
                    variation.baseVariation = isFirst
                    isFirst = false
                    price += 100
                    phone.addToProductVariations(variation)
                }

                def image = new Image(url: "www.blah.com", caption: phone.name, isPrimary: true)
                phone.addToImages(image)
                manufacturer.addToProducts(phone)
            }

            manufacturer.save(failOnError: true)
        }
    }

    def destroy = {
    }
}
