/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    boolean[] field_u;
    int field_s;
    int[] field_j;
    int field_m;
    int field_E;
    int field_c;
    int[] field_h;
    int field_f;
    byte[] field_k;
    static String field_o;
    boolean[] field_J;
    int[][] field_y;
    int[][] field_b;
    static o field_n;
    byte[][] field_D;
    static o field_p;
    byte[] field_v;
    byte[] field_z;
    int field_C;
    int field_t;
    int field_w;
    byte[] field_A;
    static pd field_e;
    int field_g;
    int field_K;
    int field_H;
    int field_l;
    int[] field_I;
    byte[] field_d;
    int field_q;
    int[] field_r;
    int[][] field_B;
    int field_F;
    int field_G;
    static int field_x;
    byte field_a;
    byte[] field_i;

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ch.field_a.a(4, "", param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("hj.B(").append(-2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(boolean param0) {
        return gf.field_Z == gb.field_i;
    }

    public static void b() {
        field_n = null;
        field_o = null;
        field_p = null;
        field_e = null;
    }

    final static af a() {
        if (null == la.field_i) {
          la.field_i = new af(jh.field_g, 20, 0, 0, 0, 11579568, -1, 0, 0, jh.field_g.field_F, -1, 2147483647, true);
          return la.field_i;
        } else {
          return la.field_i;
        }
    }

    hj() {
        ((hj) this).field_j = new int[256];
        ((hj) this).field_J = new boolean[256];
        ((hj) this).field_y = new int[6][258];
        ((hj) this).field_b = new int[6][258];
        ((hj) this).field_u = new boolean[16];
        ((hj) this).field_z = new byte[256];
        ((hj) this).field_k = new byte[4096];
        ((hj) this).field_A = new byte[18002];
        ((hj) this).field_I = new int[257];
        ((hj) this).field_h = new int[16];
        ((hj) this).field_r = new int[6];
        ((hj) this).field_w = 0;
        ((hj) this).field_D = new byte[6][258];
        ((hj) this).field_F = 0;
        ((hj) this).field_i = new byte[18002];
        ((hj) this).field_B = new int[6][258];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Name is available";
    }
}
