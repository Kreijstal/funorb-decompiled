/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2State {
    byte[][] codeLengths;
    int bitsAvailable;
    int bitBuffer;
    int[] mtfBases;
    int inUseCount;
    int[][] huffmanBase;
    int[] minimumCodeLengths;
    int originalPointer;
    int currentByte;
    int blockSize100k;
    boolean[] inUseGroups;
    int[][] huffmanLimits;
    int[][] huffmanPermutation;
    int outputIndex;
    int outputRemaining;
    byte[] output;
    int traversalIndex;
    byte[] input;
    byte[] mtfSymbols;
    byte[] selectorMtf;
    int[] cumulativeFrequencies;
    int totalOutputBytes;
    int pendingRunLength;
    int inputIndex;
    boolean[] inUse;
    int[] byteFrequencies;
    byte[] sequenceToByte;
    int totalInputBytes;
    static QuickChatParameterType field_r;
    byte[] selectors;
    int blockUsed;
    byte pendingRunByte;
    int blockLength;
    static String field_m;
    static int[] jungleBackgroundColors;
    static String field_v;
    static String field_H;
    private static String field_J;

    public static void a(byte param0) {
        field_r = null;
        jungleBackgroundColors = null;
        field_v = null;
        if (param0 <= -95) {
          field_H = null;
          field_m = null;
          return;
        }
        field_v = (String) null;
        field_H = null;
        field_m = null;
    }

    Bzip2State() {
        this.huffmanPermutation = new int[6][258];
        this.codeLengths = new byte[6][258];
        this.mtfSymbols = new byte[4096];
        this.inputIndex = 0;
        this.cumulativeFrequencies = new int[257];
        this.huffmanBase = new int[6][258];
        this.byteFrequencies = new int[256];
        this.outputIndex = 0;
        this.selectors = new byte[18002];
        this.sequenceToByte = new byte[256];
        this.inUse = new boolean[256];
        this.mtfBases = new int[16];
        this.inUseGroups = new boolean[16];
        this.huffmanLimits = new int[6][258];
        this.selectorMtf = new byte[18002];
        this.minimumCodeLengths = new int[6];
    }

    static {
        field_J = "ro.A(";
        field_r = new QuickChatParameterType(2, 4, 4, 0);
        jungleBackgroundColors = new int[]{30870, 12658477, 16494651, 26679, 16711935};
        field_H = "Who can join";
        field_m = "Show all lobby chat";
        field_v = "<br><br>Press <img=6> to close this message.";
    }
}
