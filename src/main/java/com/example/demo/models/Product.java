package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;


@Entity
@Table(name = "product")
public class Product implements Serializable {
	@Id
	private String id;
	private String name;
	private int stock;
}
