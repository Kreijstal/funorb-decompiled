/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2State {
    int outputPosition;
    int[] minCodeLengths;
    int field_o;
    int[][] huffmanBases;
    int totalOutput;
    int bufferedBits;
    byte field_d;
    byte[] output;
    int totalInput;
    static vf field_I;
    byte[] field_b;
    int[] field_t;
    int field_e;
    int bitBuffer;
    int usedByteCount;
    boolean[] inUse;
    boolean[] inUse16;
    byte[] selectors;
    int field_B;
    int field_x;
    int[] field_q;
    byte[][] codeLengths;
    int field_s;
    static wc[] field_J;
    int field_g;
    byte[] input;
    int outputRemaining;
    int inputPosition;
    byte[] field_z;
    byte[] symbolsToBytes;
    int[] field_A;
    int[][] huffmanLimits;
    static int field_j;
    int[][] huffmanSymbols;
    int field_c;

    public static void releaseStatics(boolean param0) {
        field_I = null;
        if (!param0) {
          field_j = 2;
        }
        field_J = null;
    }

    final static int a(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = 0;
          if (param0 != -94) {
            field_J = (wc[]) null;
          }
          for (var2 = 0; var2 < 25; var2++) {
            var1_int = var1_int + OpenGlTexture3D.field_j[var2];
          }
          stackIn_7_0 = var1_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "ku.B(" + param0 + ')');
        }
    }

    Bzip2State() {
        this.outputPosition = 0;
        this.huffmanBases = new int[6][258];
        this.field_t = new int[16];
        this.minCodeLengths = new int[6];
        this.selectors = new byte[18002];
        this.field_b = new byte[18002];
        this.inUse = new boolean[256];
        this.codeLengths = new byte[6][258];
        this.field_q = new int[257];
        this.symbolsToBytes = new byte[256];
        this.field_z = new byte[4096];
        this.inputPosition = 0;
        this.huffmanLimits = new int[6][258];
        this.huffmanSymbols = new int[6][258];
        this.inUse16 = new boolean[16];
        this.field_A = new int[256];
    }

    static {
        field_I = new vf();
    }
}
