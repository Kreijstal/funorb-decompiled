/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    int[] field_P;
    int[] field_f;
    short field_I;
    private boolean field_O;
    short field_D;
    short[] field_w;
    short[] field_v;
    short field_n;
    short[] field_r;
    int field_p;
    int[] field_q;
    static dl[] field_i;
    short[] field_c;
    int[] field_y;
    short[] field_B;
    short[] field_A;
    byte field_s;
    short[] field_N;
    short[] field_u;
    int[] field_m;
    int field_j;
    short[] field_K;
    int field_C;
    int[] field_z;
    short[] field_g;
    short[] field_G;
    int[] field_H;
    int[] field_d;
    byte[] field_o;
    int[] field_M;
    short[] field_J;
    short[] field_a;
    int field_e;
    short[] field_k;
    static String field_h;
    short[] field_R;
    int field_E;
    short[] field_L;
    short[] field_l;
    short[] field_b;
    static String field_t;
    int field_x;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        for (var5 = param3; var5 < ((jg) this).field_n; var5++) {
            ((jg) this).field_L[var5] = (short)(((jg) this).field_L[var5] + param0);
            ((jg) this).field_G[var5] = (short)(((jg) this).field_G[var5] + param2);
            ((jg) this).field_b[var5] = (short)(((jg) this).field_b[var5] + param1);
        }
        this.a(true);
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        if (((jg) this).field_O) {
          return;
        } else {
          ((jg) this).field_O = true;
          var2 = param0;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (((jg) this).field_n <= var8) {
              ((jg) this).field_E = var6;
              ((jg) this).field_x = var2;
              ((jg) this).field_e = var7;
              ((jg) this).field_p = var4;
              ((jg) this).field_C = var3;
              ((jg) this).field_j = var5;
              return;
            } else {
              L1: {
                var9 = ((jg) this).field_L[var8];
                var10 = ((jg) this).field_G[var8];
                if (var10 <= var6) {
                  break L1;
                } else {
                  var6 = var10;
                  break L1;
                }
              }
              L2: {
                if (var2 <= var9) {
                  break L2;
                } else {
                  var2 = var9;
                  break L2;
                }
              }
              L3: {
                if (var5 < var9) {
                  var5 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var3 > var10) {
                  var3 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var11 = ((jg) this).field_b[var8];
                if (var4 > var11) {
                  var4 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = CrazyCrystals.field_B;
        if (param0 != -30866) {
            return;
        }
        for (var6 = 0; ((jg) this).field_n > var6; var6++) {
            ((jg) this).field_L[var6] = (short)(param2 * ((jg) this).field_L[var6] / param3);
            ((jg) this).field_G[var6] = (short)(param4 * ((jg) this).field_G[var6] / param3);
            ((jg) this).field_b[var6] = (short)(param1 * ((jg) this).field_b[var6] / param3);
        }
        this.a(true);
    }

    public static void a(int param0) {
        field_t = null;
        if (param0 != 32767) {
            jg.a(39);
        }
        field_h = null;
        field_i = null;
    }

    final static boolean a(db param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 0;
            stackOut_0_0 = param0.a(false);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("jg.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -38 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(boolean param0) {
        ((jg) this).field_O = false;
    }

    jg() {
        ((jg) this).field_s = (byte) 0;
        ((jg) this).field_O = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
