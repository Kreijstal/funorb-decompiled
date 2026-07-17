/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static boolean field_t;
    int field_q;
    int field_i;
    byte[] field_e;
    byte field_h;
    byte[] field_r;
    int field_C;
    int field_B;
    int[][] field_E;
    int[][] field_f;
    byte[] field_p;
    int field_u;
    boolean[] field_b;
    byte[] field_j;
    int field_s;
    int field_k;
    int[][] field_l;
    byte[] field_x;
    int[] field_m;
    int[] field_y;
    byte[][] field_v;
    int field_d;
    int field_o;
    int field_D;
    int[] field_w;
    int field_a;
    int field_A;
    int field_g;
    int[] field_F;
    boolean[] field_n;
    int field_c;
    int field_G;
    byte[] field_z;

    final static boolean a(qc param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              var2_int = param0.c((byte) 34);
              if (var2_int == 1) {
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 0;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_3_0;
            stackOut_3_0 = var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("jl.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static void a(byte param0) {
        if (param0 >= -113) {
          L0: {
            field_t = true;
            if (oc.field_e != null) {
              oc.field_e.b(-122);
              oc.field_e = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (oc.field_e != null) {
              oc.field_e.b(-122);
              oc.field_e = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    jl() {
        ((jl) this).field_C = 0;
        ((jl) this).field_B = 0;
        ((jl) this).field_E = new int[6][258];
        ((jl) this).field_r = new byte[18002];
        ((jl) this).field_b = new boolean[16];
        ((jl) this).field_x = new byte[256];
        ((jl) this).field_y = new int[16];
        ((jl) this).field_l = new int[6][258];
        ((jl) this).field_m = new int[256];
        ((jl) this).field_w = new int[6];
        ((jl) this).field_f = new int[6][258];
        ((jl) this).field_F = new int[257];
        ((jl) this).field_e = new byte[4096];
        ((jl) this).field_z = new byte[18002];
        ((jl) this).field_v = new byte[6][258];
        ((jl) this).field_n = new boolean[256];
    }

    static {
    }
}
