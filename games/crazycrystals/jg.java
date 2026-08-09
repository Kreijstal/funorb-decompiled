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
        for (var5 = param3; var5 < this.field_n; var5++) {
            this.field_L[var5] = (short)(this.field_L[var5] + param0);
            this.field_G[var5] = (short)(this.field_G[var5] + param2);
            this.field_b[var5] = (short)(this.field_b[var5] + param1);
        }
        this.a(true);
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = CrazyCrystals.field_B;
        if (this.field_O) {
          return;
        } else {
          this.field_O = true;
          var2 = param0;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (this.field_n <= var8) {
              this.field_E = var6;
              this.field_x = var2;
              this.field_e = var7;
              this.field_p = var4;
              this.field_C = var3;
              this.field_j = var5;
              return;
            } else {
              L1: {
                var9 = this.field_L[var8];
                var10 = this.field_G[var8];
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
                var11 = this.field_b[var8];
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
        for (var6 = 0; this.field_n > var6; var6++) {
            this.field_L[var6] = (short)(param2 * this.field_L[var6] / param3);
            this.field_G[var6] = (short)(param4 * this.field_G[var6] / param3);
            this.field_b[var6] = (short)(param1 * this.field_b[var6] / param3);
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -73 % ((param1 - 25) / 34);
            stackIn_1_0 = param0.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("jg.E(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(boolean param0) {
        this.field_O = false;
        if (!param0) {
            this.a(66, 120, -42, -98);
        }
    }

    jg() {
        this.field_s = (byte) 0;
        this.field_O = false;
    }

    static {
        field_t = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
