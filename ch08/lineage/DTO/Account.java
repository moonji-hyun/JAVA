package ch08.lineage.DTO;

public class Account {
	
	//필드
	private String id;
	private String pw;
	private String nickName;
	//private ElfDTO elfDTO;        // 요정객체
	//private KnightDTO knightDTO;  // 기사객체	
	private HumanDTO humanDTO;

	//생성자	
	
	public HumanDTO getHumanDTO() {
		return humanDTO;
	}
	public void setHumanDTO(HumanDTO humanDTO) {
		this.humanDTO = humanDTO;
	}
	//메서드
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getNickName() {
		return nickName;
	}
//	public ElfDTO getElfDTO() {
//		return elfDTO;
//	}
//	public KnightDTO getKnightDTO() {
//		return knightDTO;
//	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
//	public void setElfDTO(ElfDTO elfDTO) {
//		this.elfDTO = elfDTO;
//	}
//	public void setKnightDTO(KnightDTO knightDTO) {
//		this.knightDTO = knightDTO;
//	}
	
	
	
}
