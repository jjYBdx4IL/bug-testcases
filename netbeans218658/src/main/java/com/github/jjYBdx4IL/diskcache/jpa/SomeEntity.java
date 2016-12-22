package com.github.jjYBdx4IL.diskcache.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Github jjYBdx4IL Projects
 */
@Entity
public class SomeEntity {
 
    private long id;

    @Id
    @GeneratedValue
	public long getId() {
		return id;
	} 
 
	public void setId(long id) {
		this.id = id;
	} 
 
}
