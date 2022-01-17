package com.waihon.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="product_category")
// @Data -- known bug when using relationships such as one-to-many
@Getter
@Setter
public class ProductCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "category_name")
	private String categoryName;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<Product> products;
}
