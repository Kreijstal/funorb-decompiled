/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_a;

    final static int a(int param0, boolean param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        if (!param1) {
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
        field_a = (String) null;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        he.field_m[lg.field_d] = param0;
        sj.field_m[lg.field_d] = lg.field_d;
        if (param3 > -77) {
          rd.a(58, -125, 62, 83, 51, -33);
          ug.field_I[lg.field_d] = param4;
          if (param4 <= rb.field_e) {
            if (param4 < dg.field_d) {
              gf.field_W = param4;
            }
            sk.field_B[lg.field_d] = param1;
            tf.field_c[lg.field_d] = param2;
            mk.field_c[lg.field_d] = param5;
            var6 = param2 + param1 + param5;
            if (var6 == 0) {
              stackIn_21_0 = 0;
            } else {
              stackIn_21_0 = param1 * 1000 / var6;
            }
            var7 = stackIn_21_0;
          } else {
            dj.field_b = param4;
            if (param4 < dg.field_d) {
              gf.field_W = param4;
            }
            sk.field_B[lg.field_d] = param1;
            tf.field_c[lg.field_d] = param2;
            mk.field_c[lg.field_d] = param5;
            var6 = param2 + param1 + param5;
            if (var6 == 0) {
              stackIn_8_0 = 0;
            } else {
              stackIn_8_0 = param1 * 1000 / var6;
            }
            var7 = stackIn_8_0;
          }
          td.field_c[lg.field_d] = var7;
          if (gf.field_W > var7) {
            gf.field_W = var7;
          }
          if (dj.field_b < var7) {
            dj.field_b = var7;
          }
          lg.field_d = lg.field_d + 1;
          return;
        }
        ug.field_I[lg.field_d] = param4;
        if (param4 <= rb.field_e) {
          if (param4 < dg.field_d) {
            gf.field_W = param4;
          }
          sk.field_B[lg.field_d] = param1;
          tf.field_c[lg.field_d] = param2;
          mk.field_c[lg.field_d] = param5;
          var6Lifetime1 = param2 + param1 + param5;
          if (var6Lifetime1 == 0) {
            stackIn_36_0 = 0;
          } else {
            stackIn_36_0 = param1 * 1000 / var6Lifetime1;
          }
          var7Lifetime1 = stackIn_36_0;
          td.field_c[lg.field_d] = var7Lifetime1;
          if (gf.field_W > var7Lifetime1) {
            gf.field_W = var7Lifetime1;
          }
          if (dj.field_b < var7Lifetime1) {
            dj.field_b = var7Lifetime1;
          }
          lg.field_d = lg.field_d + 1;
          return;
        }
        dj.field_b = param4;
        if (param4 < dg.field_d) {
          gf.field_W = param4;
        }
        sk.field_B[lg.field_d] = param1;
        tf.field_c[lg.field_d] = param2;
        mk.field_c[lg.field_d] = param5;
        var6Lifetime2 = param2 + param1 + param5;
        if (var6Lifetime2 == 0) {
          stackIn_49_0 = 0;
        } else {
          stackIn_49_0 = param1 * 1000 / var6Lifetime2;
        }
        var7Lifetime2 = stackIn_49_0;
        td.field_c[lg.field_d] = var7Lifetime2;
        if (gf.field_W > var7Lifetime2) {
          gf.field_W = var7Lifetime2;
        }
        if (dj.field_b < var7Lifetime2) {
          dj.field_b = var7Lifetime2;
        }
        lg.field_d = lg.field_d + 1;
        return;
    }

    public static void a(byte param0) {
        if (param0 != -63) {
          rd.a(-6, false);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "High score service unavailable";
    }
}
