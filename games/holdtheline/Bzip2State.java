/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Bzip2State {
    int outputPosition;
    int inputBytesRead;
    byte[] field_c;
    int field_h;
    int[][] field_p;
    byte[] symbolMap;
    int field_s;
    int symbolsInUse;
    int bitBuffer;
    static int[] field_q;
    int bitsAvailable;
    byte[] field_G;
    byte[] output;
    int outputRemaining;
    int field_f;
    int inputPosition;
    int field_z;
    byte[] input;
    static int[] field_x;
    int[] field_H;
    boolean[] inUseGroups;
    int field_B;
    int field_k;
    static String field_d;
    int[][] field_n;
    int[] field_D;
    int[] field_C;
    byte[][] field_t;
    boolean[] inUse;
    byte field_o;
    int[] field_w;
    int[][] field_g;
    static String field_a;
    int originalPointer;
    byte[] field_v;
    int field_u;
    static String field_J;

    public static void clearSharedReferences(byte param0) {
        field_d = null;
        field_J = null;
        field_x = null;
        field_a = null;
        if (param0 >= -73) {
          return;
        }
        field_q = null;
    }

    final static void drawAccountUi(int param0, boolean param1) {
        AccountUiUtilities.field_b.draw(-81, param0, 0);
    }

    Bzip2State() {
        this.field_p = new int[6][258];
        this.symbolMap = new byte[256];
        this.field_G = new byte[18002];
        this.inputPosition = 0;
        this.field_c = new byte[18002];
        this.inUseGroups = new boolean[16];
        this.field_H = new int[16];
        this.field_g = new int[6][258];
        this.field_w = new int[256];
        this.field_D = new int[257];
        this.field_n = new int[6][258];
        this.field_v = new byte[4096];
        this.field_t = new byte[6][258];
        this.field_C = new int[6];
        this.inUse = new boolean[256];
        this.outputPosition = 0;
    }

    static {
        field_q = new int[8192];
        field_x = new int[4];
        field_d = "To Customer Support";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_J = "Pause Menu";
    }
}
