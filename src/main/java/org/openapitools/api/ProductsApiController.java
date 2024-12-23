package org.openapitools.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-22T14:52:36.334800500-05:00[America/New_York]", comments = "Generator version: 7.10.0")
@Controller
@RequestMapping("${openapi.product.base-path:}")
public class ProductsApiController implements ProductsApi {

    private final NativeWebRequest request;

    @Autowired
    public ProductsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
