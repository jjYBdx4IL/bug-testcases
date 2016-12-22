package com.github.jjYBdx4IL.diskcache.jpa;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Github jjYBdx4IL Projects
 */
public class SomeTypedQueryFactory {

    private final EntityManager em;

    public SomeTypedQueryFactory(EntityManager em) {
        this.em = em;
    }

    public TypedQuery<SomeEntity> getByUrlQuery(String url) {
        Object o = SomeEntity_.id;
        return null;
    }

}
