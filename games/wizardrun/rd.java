/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_a;

    final static int a(int param0, boolean param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 - -1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        he.field_m[lg.field_d] = param0;
        sj.field_m[lg.field_d] = lg.field_d;
        if (param3 <= -77) {
          ug.field_I[lg.field_d] = param4;
          if (param4 > rb.field_e) {
            L0: {
              dj.field_b = param4;
              if (param4 < dg.field_d) {
                gf.field_W = param4;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              sk.field_B[lg.field_d] = param1;
              tf.field_c[lg.field_d] = param2;
              mk.field_c[lg.field_d] = param5;
              var6 = param2 + param1 - -param5;
              if (var6 == 0) {
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L1;
              } else {
                stackOut_47_0 = param1 * 1000 / var6;
                stackIn_49_0 = stackOut_47_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_49_0;
              td.field_c[lg.field_d] = var7;
              if (gf.field_W > var7) {
                gf.field_W = var7;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (dj.field_b < var7) {
                dj.field_b = var7;
                break L3;
              } else {
                break L3;
              }
            }
            lg.field_d = lg.field_d + 1;
            return;
          } else {
            L4: {
              if (param4 < dg.field_d) {
                gf.field_W = param4;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              sk.field_B[lg.field_d] = param1;
              tf.field_c[lg.field_d] = param2;
              mk.field_c[lg.field_d] = param5;
              var6 = param2 + param1 - -param5;
              if (var6 == 0) {
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L5;
              } else {
                stackOut_34_0 = param1 * 1000 / var6;
                stackIn_36_0 = stackOut_34_0;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_36_0;
              td.field_c[lg.field_d] = var7;
              if (gf.field_W > var7) {
                gf.field_W = var7;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (dj.field_b < var7) {
                dj.field_b = var7;
                break L7;
              } else {
                break L7;
              }
            }
            lg.field_d = lg.field_d + 1;
            return;
          }
        } else {
          rd.a(58, -125, 62, 83, 51, -33);
          ug.field_I[lg.field_d] = param4;
          if (param4 <= rb.field_e) {
            L8: {
              if (param4 < dg.field_d) {
                gf.field_W = param4;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              sk.field_B[lg.field_d] = param1;
              tf.field_c[lg.field_d] = param2;
              mk.field_c[lg.field_d] = param5;
              var6 = param2 + param1 - -param5;
              if (var6 == 0) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L9;
              } else {
                stackOut_19_0 = param1 * 1000 / var6;
                stackIn_21_0 = stackOut_19_0;
                break L9;
              }
            }
            L10: {
              var7 = stackIn_21_0;
              td.field_c[lg.field_d] = var7;
              if (gf.field_W > var7) {
                gf.field_W = var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (dj.field_b < var7) {
                dj.field_b = var7;
                break L11;
              } else {
                break L11;
              }
            }
            lg.field_d = lg.field_d + 1;
            return;
          } else {
            L12: {
              dj.field_b = param4;
              if (param4 < dg.field_d) {
                gf.field_W = param4;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              sk.field_B[lg.field_d] = param1;
              tf.field_c[lg.field_d] = param2;
              mk.field_c[lg.field_d] = param5;
              var6 = param2 + param1 - -param5;
              if (var6 == 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L13;
              } else {
                stackOut_6_0 = param1 * 1000 / var6;
                stackIn_8_0 = stackOut_6_0;
                break L13;
              }
            }
            L14: {
              var7 = stackIn_8_0;
              td.field_c[lg.field_d] = var7;
              if (gf.field_W > var7) {
                gf.field_W = var7;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (dj.field_b < var7) {
                dj.field_b = var7;
                break L15;
              } else {
                break L15;
              }
            }
            lg.field_d = lg.field_d + 1;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "High score service unavailable";
    }
}
