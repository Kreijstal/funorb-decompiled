/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    int[] field_a;
    int[] field_c;
    byte field_o;
    short[] field_P;
    short[] field_g;
    short[] field_M;
    short[] field_b;
    short[] field_C;
    short[] field_w;
    short[] field_s;
    short[] field_v;
    short[] field_y;
    short field_x;
    short[] field_I;
    short[] field_z;
    int[] field_Q;
    byte[] field_p;
    static bi field_F;
    int[] field_H;
    short[] field_B;
    short field_u;
    short[] field_i;
    int field_k;
    int[] field_K;
    int field_E;
    short[] field_f;
    int[] field_m;
    int field_t;
    int field_j;
    int field_r;
    int[] field_l;
    static int field_q;
    short field_e;
    private boolean field_d;
    int[] field_D;
    short[] field_L;
    int[] field_A;
    short[] field_J;
    short[] field_n;
    short[] field_G;
    static boolean field_h;
    static String field_N;
    int field_O;

    private final void a(int param0) {
        ((sr) this).field_d = false;
        if (param0 < 102) {
            Object var3 = null;
            int discarded$0 = sr.a((String) null, 127, (byte) 99, -16, (String) null, (String) null, false);
        }
    }

    final static int a(String param0, int param1, byte param2, int param3, String param4, String param5, boolean param6) {
        e var7 = new e(param0);
        if (param2 > -38) {
            return -102;
        }
        e var8 = new e(param5);
        return si.a(param1, param3, var8, var7, 125, param4, param6);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param3 != 32767) {
            Object var7 = null;
            boolean discarded$0 = sr.a(71, (String) null);
        }
        for (var5 = 0; ((sr) this).field_x > var5; var5++) {
            ((sr) this).field_w[var5] = (short)(((sr) this).field_w[var5] + param1);
            ((sr) this).field_z[var5] = (short)(((sr) this).field_z[var5] + param2);
            ((sr) this).field_f[var5] = (short)(((sr) this).field_f[var5] + param0);
        }
        this.a(107);
    }

    public static void a(byte param0) {
        int var1 = 19 % ((24 - param0) / 60);
        field_N = null;
        field_F = null;
    }

    final void a(boolean param0) {
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((sr) this).field_d) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param0) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((sr) this).field_d = stackIn_5_1 != 0;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= ((sr) this).field_x) {
              ((sr) this).field_k = var2;
              ((sr) this).field_t = var6;
              ((sr) this).field_j = var3;
              ((sr) this).field_E = var4;
              ((sr) this).field_O = var5;
              ((sr) this).field_r = var7;
              return;
            } else {
              L2: {
                var9 = ((sr) this).field_w[var8];
                var10 = ((sr) this).field_z[var8];
                if (var2 <= var9) {
                  break L2;
                } else {
                  var2 = var9;
                  break L2;
                }
              }
              L3: {
                if (var9 > var5) {
                  var5 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var6 >= var10) {
                  break L4;
                } else {
                  var6 = var10;
                  break L4;
                }
              }
              L5: {
                if (var10 < var3) {
                  var3 = var10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var11 = ((sr) this).field_f[var8];
                if (var4 <= var11) {
                  break L6;
                } else {
                  var4 = var11;
                  break L6;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var6 = 0; var6 < ((sr) this).field_x; var6++) {
            ((sr) this).field_w[var6] = (short)(param2 * ((sr) this).field_w[var6] / param4);
            ((sr) this).field_z[var6] = (short)(((sr) this).field_z[var6] * param3 / param4);
            ((sr) this).field_f[var6] = (short)(((sr) this).field_f[var6] * param0 / param4);
        }
        this.a(103);
        if (param1 != -226) {
            ((sr) this).a(true);
        }
    }

    final static boolean a(int param0, String param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        de var2 = (de) (Object) aj.field_a.d(0);
        while (var2 != null) {
            if (!(!param1.equalsIgnoreCase(var2.field_l))) {
                return true;
            }
            var2 = (de) (Object) aj.field_a.a((byte) -71);
        }
        var2 = (de) (Object) qi.field_h.d(param0);
        while (var2 != null) {
            if (param1.equalsIgnoreCase(var2.field_l)) {
                return true;
            }
            var2 = (de) (Object) qi.field_h.a((byte) -71);
        }
        return false;
    }

    final static int a(int param0, byte param1, boolean param2, int param3) {
        if (param1 != 0) {
            field_F = null;
        }
        return uo.a((byte) -75);
    }

    sr() {
        ((sr) this).field_d = false;
        ((sr) this).field_o = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = true;
        field_N = "Showing production, projects and fleet movements.";
    }
}
