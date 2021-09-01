public class DogiChain {
    public static void main(String[] args) {

        Block genesisBlock = new Block("Hello, i'm the first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Hi, i'm the second block", genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hiyah, i'm the third block", secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash );
    }
}
