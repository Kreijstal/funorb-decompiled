/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends o {
    int field_n;
    static ci field_l;
    int field_r;
    int field_o;
    static String field_p;
    static int field_k;
    int field_q;
    int field_m;
    int field_s;
    static nb field_j;

    public static void c(byte param0) {
        field_p = null;
        int var1 = -105 % ((7 - param0) / 45);
        field_l = null;
        field_j = null;
    }

    ac(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ac) this).field_n = param5;
        ((ac) this).field_q = param0;
        ((ac) this).field_m = param1;
        ((ac) this).field_o = param4;
        ((ac) this).field_r = param2;
        ((ac) this).field_s = param3;
    }

    final static em a(nk param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        em var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        var2 = param0.e(117, 8);
        if (var2 > 0) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            var3 = r.a(true, param0) ? 1 : 0;
            var4 = r.a(true, param0) ? 1 : 0;
            var5 = new em();
            var5.field_d = (short)param0.e(-58, 16);
            var5.field_z = ml.a(var5.field_z, 16, param0, 119);
            var5.field_a = ml.a(var5.field_a, 16, param0, 78);
            var5.field_H = ml.a(var5.field_H, 16, param0, 50);
            var5.field_e = (short)param0.e(119, 16);
            var5.field_g = ml.a(var5.field_g, 16, param0, 63);
            var5.field_A = ml.a(var5.field_A, 16, param0, 118);
            var5.field_J = ml.a(var5.field_J, 16, param0, 62);
            if (var3 == 0) {
              break L0;
            } else {
              var5.field_t = (short)param0.e(-88, 16);
              var5.field_b = ml.a(var5.field_b, 16, param0, 106);
              var5.field_f = ml.a(var5.field_f, 16, param0, 42);
              var5.field_F = ml.a(var5.field_F, 16, param0, 83);
              var5.field_l = ml.a(var5.field_l, 16, param0, 54);
              var5.field_C = ml.a(var5.field_C, 16, param0, 52);
              var5.field_E = ml.a(var5.field_E, 16, param0, 64);
              break L0;
            }
          }
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              int discarded$1 = param0.e(-32, 16);
              var5.field_B = ml.a(var5.field_B, 16, param0, 70);
              var5.field_N = ml.a(var5.field_N, 16, param0, 89);
              var5.field_o = ml.a(var5.field_o, 16, param0, 74);
              var5.field_i = ml.a(var5.field_i, 16, param0, 99);
              var5.field_R = ml.a(var5.field_R, 16, param0, 116);
              break L1;
            }
          }
          L2: {
            if (r.a(true, param0)) {
              var5.field_G = ml.a(var5.field_G, 16, param0, 107);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!r.a(param1, param0)) {
              break L3;
            } else {
              var5.field_y = rb.a(var5.field_y, (byte) -105, param0, 16);
              var6 = 0;
              var7 = 0;
              L4: while (true) {
                if (var7 >= var5.field_y.length) {
                  if (var6 == 0) {
                    var5.field_y = null;
                    break L3;
                  } else {
                    var5.field_j = (byte)(1 + var6);
                    break L3;
                  }
                } else {
                  if ((255 & var5.field_y[var7]) > var6) {
                    var6 = var5.field_y[var7] & 255;
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "King";
        field_k = -1;
    }
}
