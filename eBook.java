package tr.org.kamp.linux.Books;

public class eBook extends Book{

	protected int fileSize;//dosya boyutu
	protected String encodingFormat;
	protected int numberOfDevicesBookBeingUsed; //Device:aygıt
	
	
	
	
	public eBook(String name, String author, int price, int bookId, int applyDiscount, int fileSize,
			String encodingFormat, int numberOfDevicesBookBeingUsed) {
		super(name, author, price, bookId, applyDiscount);
		this.fileSize = fileSize;
		this.encodingFormat = encodingFormat;
		this.numberOfDevicesBookBeingUsed = numberOfDevicesBookBeingUsed;
	}
	
	public void addDevice() {
		numberOfDevicesBookBeingUsed=numberOfDevicesBookBeingUsed+1;
	}
	public void removeDevice()
	{
		numberOfDevicesBookBeingUsed=numberOfDevicesBookBeingUsed-1;

	}
	


	public eBook(String name, String author, int price, int bookId, int applyDiscount) {
		super(name, author, price, bookId, applyDiscount);
	}


	public int getFileSize() {
		return fileSize;
	}


	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}


	public String getEncodingFormat() {
		return encodingFormat;
	}


	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}


	public int getNumberOfDevicesBookBeingUsed() {
		return numberOfDevicesBookBeingUsed;
	}


	public void setNumberOfDevicesBookBeingUsed(int numberOfDevicesBookBeingUsed) {
		this.numberOfDevicesBookBeingUsed = numberOfDevicesBookBeingUsed;
	}
	

}
