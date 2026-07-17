/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wma {
    private boolean field_F;
    int field_u;
    short[] field_K;
    int[] field_l;
    short[] field_i;
    short field_y;
    int[] field_g;
    short[] field_w;
    short field_L;
    short[] field_I;
    short[] field_n;
    int[] field_C;
    int field_s;
    int field_q;
    int[] field_e;
    short[] field_m;
    int[] field_H;
    short[] field_p;
    int[] field_t;
    short[] field_b;
    short[] field_D;
    short[] field_v;
    int[] field_x;
    int[] field_h;
    short[] field_o;
    static String field_M;
    short[] field_N;
    int field_B;
    byte[] field_E;
    byte field_z;
    short[] field_c;
    short field_J;
    short[] field_r;
    int[] field_A;
    short[] field_f;
    int field_a;
    short[] field_k;
    int field_d;
    short[] field_j;
    short[] field_G;

    public static void b() {
        field_M = null;
    }

    final void a(int param0) {
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
        var12 = VoidHunters.field_G;
        if (((wma) this).field_F) {
          return;
        } else {
          L0: {
            ((wma) this).field_F = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            if (param0 > 75) {
              break L0;
            } else {
              ((wma) this).field_p = null;
              break L0;
            }
          }
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (((wma) this).field_J <= var8) {
              ((wma) this).field_B = var5;
              ((wma) this).field_q = var7;
              ((wma) this).field_u = var3;
              ((wma) this).field_s = var4;
              ((wma) this).field_a = var6;
              ((wma) this).field_d = var2;
              return;
            } else {
              L2: {
                var9 = ((wma) this).field_r[var8];
                var10 = ((wma) this).field_o[var8];
                if (var10 <= var6) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var5 >= var9) {
                  break L3;
                } else {
                  var5 = var9;
                  break L3;
                }
              }
              L4: {
                if (var3 <= var10) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                var11 = ((wma) this).field_p[var8];
                if (var2 > var9) {
                  var2 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var11 <= var7) {
                  break L6;
                } else {
                  var7 = var11;
                  break L6;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = VoidHunters.field_G;
        int var6 = 0;
        if (param0 != -21227) {
            return;
        }
        while (var6 < ((wma) this).field_J) {
            ((wma) this).field_r[var6] = (short)(param3 * ((wma) this).field_r[var6] / param4);
            ((wma) this).field_o[var6] = (short)(((wma) this).field_o[var6] * param2 / param4);
            ((wma) this).field_p[var6] = (short)(((wma) this).field_p[var6] * param1 / param4);
            var6++;
        }
        this.a((byte) -61);
    }

    private final void a(byte param0) {
        ((wma) this).field_F = false;
        if (param0 > -21) {
            ((wma) this).field_B = -74;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int var5 = -12 / ((param0 - 49) / 52);
        for (var6 = 0; ((wma) this).field_J > var6; var6++) {
            ((wma) this).field_r[var6] = (short)(((wma) this).field_r[var6] + param2);
            ((wma) this).field_o[var6] = (short)(((wma) this).field_o[var6] + param3);
            ((wma) this).field_p[var6] = (short)(((wma) this).field_p[var6] + param1);
        }
        this.a((byte) -103);
    }

    wma() {
        ((wma) this).field_F = false;
        ((wma) this).field_z = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
