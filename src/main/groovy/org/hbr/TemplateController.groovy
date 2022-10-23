package org.hbr

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/template")
class TemplateController {

    @Get(uri="/", produces="text/plain")
    String index() {
        "Example Response"
    }
}