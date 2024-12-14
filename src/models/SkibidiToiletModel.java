package models;

import enums.AuraSizeEnum;
import exception.AuraValueException;

public class SkibidiToiletModel {

	private String rizzler;
	private Boolean amostradinho;
	private Long aura;

	public String getRizzler() {
		return rizzler;
	}

	public void setRizzler(String rizzler) {
		this.rizzler = rizzler;
	}

	public Boolean getAmostradinho() {
		return amostradinho;
	}

	public void setAmostradinho(Boolean amostradinho) {
		this.amostradinho = amostradinho;
	}

	public Long getAura() {
		return aura;
	}

	public void setAura(Long aura) {
		validateAura(aura);
		this.aura = aura;
	}

	private void validateAura(Long aura) {
		if (aura < AuraSizeEnum.MIN.getAuraValue() || aura > AuraSizeEnum.MAX.getAuraValue()) {
			throw new AuraValueException();
		}
	}

	public SkibidiToiletModel(String rizzler, Boolean amostradinho, Long aura) {
		setRizzler(rizzler);
		setAmostradinho(amostradinho);
		setAura(aura);
	}
}