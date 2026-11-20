/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2State {
    int inputPosition;
    int currentByte;
    int[] frequencies;
    int bitCount;
    int bwtPosition;
    int alphabetSize;
    int blockSize100k;
    int totalOutput;
    int blockLength;
    byte[] input;
    byte[] selectorMtf;
    int[] cumulativeFrequencies;
    int originalPointer;
    int outputRemaining;
    int[] minimumCodeLengths;
    byte[] selectors;
    int bwtBytesUsed;
    static String[] field_q;
    int totalInput;
    int[][] permutations;
    byte runByte;
    int[][] codeBases;
    byte[] usedSymbols;
    byte[] mtfBuffer;
    boolean[] inUse;
    byte[][] codeLengths;
    int runLength;
    static MusicTrack field_u;
    int[][] codeLimits;
    boolean[] inUseGroups;
    int outputPosition;
    int[] mtfBases;
    byte[] output;
    int bitBuffer;
    private static String field_I;

    public static void clearSharedReferences(int param0) {
        int var1 = 44 % ((-35 - param0) / 52);
        field_u = null;
        field_q = null;
    }

    Bzip2State() {
        this.inputPosition = 0;
        this.frequencies = new int[256];
        this.selectorMtf = new byte[18002];
        this.selectors = new byte[18002];
        this.cumulativeFrequencies = new int[257];
        this.minimumCodeLengths = new int[6];
        this.inUse = new boolean[256];
        this.codeLengths = new byte[6][258];
        this.inUseGroups = new boolean[16];
        this.codeLimits = new int[6][258];
        this.permutations = new int[6][258];
        this.mtfBuffer = new byte[4096];
        this.usedSymbols = new byte[256];
        this.mtfBases = new int[16];
        this.outputPosition = 0;
        this.codeBases = new int[6][258];
    }

    static {
        field_I = "dha.A(";
    }
}
