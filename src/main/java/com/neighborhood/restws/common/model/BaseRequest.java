package com.neighborhood.restws.common.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 *
 * @author Balaji Nandarapu
 *
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class BaseRequest {

}
