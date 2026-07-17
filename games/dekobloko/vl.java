/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    int[] field_v;
    int field_m;
    int[][] field_c;
    byte field_I;
    int field_C;
    static int[] field_G;
    int field_l;
    byte[] field_w;
    int field_r;
    int field_b;
    int field_e;
    int field_o;
    byte[] field_d;
    int field_p;
    int field_F;
    int field_E;
    int field_f;
    int field_z;
    byte[] field_a;
    byte[][] field_x;
    int[][] field_D;
    byte[] field_j;
    byte[] field_g;
    int field_n;
    byte[] field_h;
    static int field_k;
    int[] field_s;
    int field_i;
    int[] field_t;
    static byte[] field_A;
    boolean[] field_y;
    int[] field_B;
    int field_H;
    int[][] field_u;
    boolean[] field_q;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param2 >>> 31;
        if (param0 != 23841) {
          field_k = -119;
          return (param2 + var3) / param1 + -var3;
        } else {
          return (param2 + var3) / param1 + -var3;
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_G = null;
    }

    vl() {
        ((vl) this).field_v = new int[6];
        ((vl) this).field_r = 0;
        ((vl) this).field_x = new byte[6][258];
        ((vl) this).field_g = new byte[18002];
        ((vl) this).field_c = new int[6][258];
        ((vl) this).field_h = new byte[4096];
        ((vl) this).field_s = new int[257];
        ((vl) this).field_d = new byte[256];
        ((vl) this).field_t = new int[16];
        ((vl) this).field_B = new int[256];
        ((vl) this).field_E = 0;
        ((vl) this).field_y = new boolean[16];
        ((vl) this).field_D = new int[6][258];
        ((vl) this).field_u = new int[6][258];
        ((vl) this).field_q = new boolean[256];
        ((vl) this).field_a = new byte[18002];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new byte[]{(byte) 2, (byte) 5, (byte) 5, (byte) 5, (byte) 3};
    }
}
