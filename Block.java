public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = timeStamp;
        this.hash = createHash();
    }
    public String createHash() {
        String createHash = StringConverter.applySha256(
            previousHash + Long.toString(timeStamp) + data);
        return createHash;   
    }
}
