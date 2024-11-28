package com.Notas.domain;

import lombok.Data;

@Data
public class Comment {
	private Long id;
	private String username;
	private String text;
	private String date; //ya veremos si esto es así o no.
}
