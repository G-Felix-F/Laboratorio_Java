package enums;

public enum AuraSizeEnum {
	MIN(1L),
	MAX(1000L);
	
	private final Long value;
	
	AuraSizeEnum(Long value) {
		this.value = value;
	}
	
	public Long getAuraValue() {
		return value;
	}
}