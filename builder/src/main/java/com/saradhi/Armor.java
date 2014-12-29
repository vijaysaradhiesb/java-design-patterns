package com.saradhi;

public enum Armor {

	CLOTHES, LEATHER, CHAIN_MAIL, PLATE_MAIL;

	@Override
	public String toString() {
		return name().toLowerCase().replaceAll("_", " ");
	}

}
