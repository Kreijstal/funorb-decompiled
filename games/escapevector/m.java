/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends wg {
    volatile int field_l;
    static int field_k;
    static String field_n;
    volatile int field_o;
    private int field_m;
    static int field_q;
    private int field_p;

    final int a() {
        int var1 = (((m) this).field_l >> -2061900408) * ((m) this).field_o >> -584304528;
        if (var1 != 0) {
            return 1;
        }
        return 0;
    }

    final wg b() {
        return null;
    }

    public static void e(int param0) {
        field_n = null;
        if (param0 != -1600199832) {
            m.e(1);
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        if (-3 == (param2 ^ -1)) {
            return param1 * dk.field_h[param0 & 32767] >> 1572164099;
        }
        if (param3 > -6) {
            return 63;
        }
        if (-4 != (param2 ^ -1)) {
            return 0;
        }
        return -param1 + (param1 * (32767 & param0) >> 920049710);
    }

    final static dk a(dk[] param0, int param1, int param2) {
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        dk[] var7 = null;
        var6 = EscapeVector.field_A;
        var7 = param0;
        var3 = var7;
        var4 = param2;
        L0: while (true) {
          if (var4 < var7.length) {
            var5 = var7[var4];
            if (param1 == var5.field_c) {
              return var5;
            } else {
              var4++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void d(int param0) {
    }

    final wg c() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = EscapeVector.field_A;
        var4 = ((m) this).field_o;
        var5 = (((m) this).field_l >> -1600199832) * var4 >> -2070607696;
        if (0 != var5) {
          L0: {
            var6 = (double)ie.field_q / 1000.0;
            var8 = (int)(25460.736 / var6);
            var9 = var5;
            var10 = (int)(196509.696 / var6);
            param2 = param2 + param1;
            var11 = (int)(98.304 / var6);
            if (ie.field_o) {
              param2 = param2 << 1;
              param1 = param1 << 1;
              break L0;
            } else {
              break L0;
            }
          }
          var12 = param1;
          L1: while (true) {
            if (param2 <= var12) {
              return;
            } else {
              L2: {
                var13 = 16384 - -(var4 >> -119195775);
                var14 = var9;
                var15 = 32768;
                var16 = 65536 - var13;
                var13 = var13 + (this.a(((m) this).field_m, var16, 3, -60) >> 1316450241);
                ((m) this).field_m = ((m) this).field_m + (var15 * var8 >> -1223166896);
                var17 = this.a(((m) this).field_p, var14, 2, -68);
                var12++;
                param0[var12] = param0[var12] + var17;
                if (ie.field_o) {
                  var12++;
                  param0[var12] = param0[var12] + var17;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((m) this).field_p = ((m) this).field_p + (var11 + (var13 * var10 >> 1661764592));
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    m() {
        ((m) this).field_m = 0;
        ((m) this).field_p = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Press M to see the mini-map";
        field_k = 0;
        field_q = 0;
    }
}
