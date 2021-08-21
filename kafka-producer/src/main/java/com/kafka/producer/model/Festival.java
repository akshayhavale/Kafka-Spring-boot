package com.kafka.producer.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Festival implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8022890396224351074L;

	private String festivalName;
	private Date festivalDate;

}
