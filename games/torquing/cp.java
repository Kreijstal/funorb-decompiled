/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends kj {
    private int field_m;
    private int field_n;
    private int field_k;
    private int field_o;
    private int field_p;
    private int field_l;
    private int field_j;
    static String field_i;
    static String field_h;
    private int field_g;

    public static void b(int param0) {
        field_h = null;
        field_i = null;
        if (param0 != 2092666604) {
            Object var2 = null;
            int discarded$0 = cp.a(-67, 118, -41, -44, -77, (double[][]) null, (int[]) null);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = ((cp) this).field_n * param1 >> -1803631060;
        int var5 = param0 * ((cp) this).field_g >> 459677452;
        int var6 = param1 * ((cp) this).field_k >> 800781612;
        int var7 = param0 * ((cp) this).field_m >> 2092666604;
        int var8 = param1 * ((cp) this).field_l >> 293845516;
        int var9 = ((cp) this).field_p * param0 >> 516529196;
        int var10 = param1 * ((cp) this).field_j >> -1849527732;
        if (param2 != 106) {
            ((cp) this).field_g = -74;
        }
        int var11 = param0 * ((cp) this).field_o >> 790401356;
        qh.a(var10, 7503, var4, var11, var5, var6, var7, var9, ((cp) this).field_c, var8);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 7) {
            ((cp) this).a(-123, 3, -45);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= -101) {
            ((cp) this).a(-52, -40, -79);
        }
    }

    cp(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        ((cp) this).field_l = param4;
        ((cp) this).field_g = param1;
        ((cp) this).field_k = param2;
        ((cp) this).field_n = param0;
        ((cp) this).field_j = param6;
        ((cp) this).field_m = param3;
        ((cp) this).field_o = param7;
        ((cp) this).field_p = param5;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, double[][] param5, int[] param6) {
        double var7 = 0.0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        var13 = Torquing.field_u;
        var7 = param5[param1][param3];
        var9 = 0;
        L0: while (true) {
          if (param0 <= var9) {
            L1: {
              if (param2 < -19) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            var9 = 0;
            L2: while (true) {
              if (param4 <= var9) {
                var9 = param6[param1];
                param6[param1] = param3;
                return var9;
              } else {
                if (var9 != param1) {
                  var10 = param5[var9][param3];
                  var12 = 0;
                  L3: while (true) {
                    if (var12 < param0) {
                      param5[var9][var12] = param5[var9][var12] - var10 * param5[param1][var12];
                      var12++;
                      continue L3;
                    } else {
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          } else {
            param5[param1][var9] = param5[param1][var9] / var7;
            var9++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Torquing";
        field_h = "Email is valid";
    }
}
