package com.waihon.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data

public class Product {
	private Long id;
	private String sku;
	private String name;
	private String description;
	private BigDecimal unitPrice;
	private String imageUrl;
	private boolean active;
	private int unitsInStock;
	private Date dateCreated;
	private Date lastUpdated;
}
