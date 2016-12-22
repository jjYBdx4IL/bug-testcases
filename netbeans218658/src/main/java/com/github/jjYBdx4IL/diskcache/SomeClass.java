package com.github.jjYBdx4IL.diskcache;

import com.github.jjYBdx4IL.diskcache.jpa.SomeTypedQueryFactory;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author jjYBdx4IL
 */
public class SomeClass {
  
    protected EntityManagerFactory emf = null; 
    protected EntityManager em = null; 
    protected final SomeTypedQueryFactory diskCacheQueryFactory;

    public SomeClass(File parentDir, String dbName, boolean reinit) {
        diskCacheQueryFactory = new SomeTypedQueryFactory(em);    
    } 

}
