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
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                jl.a((byte) 47);
                break L1;
              }
            }
            L2: {
              var2_int = param0.c((byte) 34);
              if (var2_int == 1) {
                stackIn_5_0 = 1;
                break L2;
              } else {
                stackIn_5_0 = 0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("jl.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
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
        this.field_C = 0;
        this.field_B = 0;
        this.field_E = new int[6][258];
        this.field_r = new byte[18002];
        this.field_b = new boolean[16];
        this.field_x = new byte[256];
        this.field_y = new int[16];
        this.field_l = new int[6][258];
        this.field_m = new int[256];
        this.field_w = new int[6];
        this.field_f = new int[6][258];
        this.field_F = new int[257];
        this.field_e = new byte[4096];
        this.field_z = new byte[18002];
        this.field_v = new byte[6][258];
        this.field_n = new boolean[256];
    }

    static {
    }
}
