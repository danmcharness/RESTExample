class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

//        "/api/phones"(resources: 'phone', excludes: ['create', 'edit'])

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
