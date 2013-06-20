package org.code_factory.jpa.nestedset.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * User: markmo
 * Date: 14/06/13
 * Time: 8:58 PM
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface NodeClass {
    Class type();
}
