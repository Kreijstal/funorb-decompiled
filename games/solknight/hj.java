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
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -2) {
              stackOut_3_0 = ch.field_a.a(4, "", param1);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("hj.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return gf.field_Z == gb.field_i ? true : false;
    }

    public static void b(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 != -37) {
            return;
        }
        field_p = null;
        field_e = null;
    }

    final static af a(byte param0) {
        if (null != la.field_i) {
          if (param0 >= -58) {
            field_e = (pd) null;
            return la.field_i;
          } else {
            return la.field_i;
          }
        } else {
          la.field_i = new af(jh.field_g, 20, 0, 0, 0, 11579568, -1, 0, 0, jh.field_g.field_F, -1, 2147483647, true);
          if (param0 < -58) {
            return la.field_i;
          } else {
            field_e = (pd) null;
            return la.field_i;
          }
        }
    }

    hj() {
        this.field_j = new int[256];
        this.field_J = new boolean[256];
        this.field_y = new int[6][258];
        this.field_b = new int[6][258];
        this.field_u = new boolean[16];
        this.field_z = new byte[256];
        this.field_k = new byte[4096];
        this.field_A = new byte[18002];
        this.field_I = new int[257];
        this.field_h = new int[16];
        this.field_r = new int[6];
        this.field_w = 0;
        this.field_D = new byte[6][258];
        this.field_F = 0;
        this.field_i = new byte[18002];
        this.field_B = new int[6][258];
    }

    static {
        field_o = "Name is available";
    }
}
