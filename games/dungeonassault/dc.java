/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    int field_b;
    int field_P;
    int[][] field_B;
    static int field_l;
    int field_u;
    int field_a;
    byte[] field_d;
    int[] field_w;
    int field_M;
    int field_t;
    byte[] field_g;
    byte[] field_G;
    byte[][] field_r;
    static cf[] field_q;
    int[] field_s;
    static String field_k;
    int[][] field_f;
    byte[] field_C;
    int field_o;
    static int[] field_p;
    int field_h;
    byte field_O;
    int field_A;
    int field_N;
    static cn field_x;
    int field_L;
    int field_F;
    int field_j;
    int[][] field_D;
    int[] field_i;
    int[] field_m;
    byte[] field_y;
    boolean[] field_E;
    static se field_e;
    byte[] field_J;
    int field_I;
    static int field_z;
    int field_c;
    static String field_H;
    static String field_v;
    boolean[] field_n;

    public static void a(byte param0) {
        String discarded$0 = null;
        field_p = null;
        field_k = null;
        field_H = null;
        field_q = null;
        field_x = null;
        field_v = null;
        field_e = null;
        if (param0 <= 76) {
            discarded$0 = dc.a(-94);
        }
    }

    final static String a(int param0) {
        if (param0 >= -109) {
            dc.a((byte) -113);
            if (tc.field_u == null) {
                return "";
            }
            return tc.field_u;
        }
        if (tc.field_u == null) {
            return "";
        }
        return tc.field_u;
    }

    dc() {
        this.field_s = new int[256];
        this.field_f = new int[6][258];
        this.field_D = new int[6][258];
        this.field_C = new byte[256];
        this.field_r = new byte[6][258];
        this.field_B = new int[6][258];
        this.field_y = new byte[4096];
        this.field_h = 0;
        this.field_a = 0;
        this.field_g = new byte[18002];
        this.field_J = new byte[18002];
        this.field_w = new int[6];
        this.field_i = new int[257];
        this.field_m = new int[16];
        this.field_n = new boolean[16];
        this.field_E = new boolean[256];
    }

    static {
        field_k = "ON";
        field_p = new int[]{1, 2, 3, 5, 10, 25};
        field_H = "Orc Blademaster";
        field_v = "Cancel";
    }
}
