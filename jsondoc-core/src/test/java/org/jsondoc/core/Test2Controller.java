package org.jsondoc.core;

import java.util.List;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiBodyObject;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiParam;
import org.jsondoc.core.annotation.ApiResponseObject;
import org.jsondoc.core.pojo.ApiVerb;
import org.springframework.http.MediaType;

@Api(name="Test2Controller", description="My test controller #2")
public class Test2Controller {
	
	@ApiMethod(
			path="/test2", 
			verb=ApiVerb.POST, 
			description="test method for controller 2", 
			consumes={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	)
	public @ApiResponseObject String save(@ApiBodyObject List<String> names) {
		return null;
	}
	
	@ApiMethod(
			path="/testDelete", 
			verb=ApiVerb.DELETE, 
			description="delete test method for controller 2", 
			consumes={},
			produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
	)
	public @ApiResponseObject void delete(@ApiParam(name="parent", description="A parent object") Parent parent) {
		
	}

}