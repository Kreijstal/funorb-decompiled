/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    private int field_b;
    static dg field_d;
    static String field_g;
    static double[][] field_a;
    static int field_f;
    private int field_e;
    private ut field_c;
    static String field_h;

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -14954) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (op.field_y == null) {
              break L2;
            } else {
              if (jn.field_rb != un.field_c) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(sr param0, int param1, Object[] param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var10 = 0;
        L0: {
          var10 = Kickabout.field_G;
          if (param3 == 29921) {
            break L0;
          } else {
            ((long[]) param2[4])[5] = -61L;
            break L0;
          }
        }
        L1: {
          if (param1 > param4) {
            var5 = (param4 - -param1) / 2;
            var6 = param4;
            var7 = param2[var5];
            param2[var5] = param2[param1];
            param2[param1] = var7;
            var8 = param4;
            L2: while (true) {
              if (var8 >= param1) {
                param2[param1] = param2[var6];
                param2[var6] = var7;
                oh.a(param0, -1 + var6, param2, param3 ^ 0, param4);
                oh.a(param0, param1, param2, 29921, var6 - -1);
                break L1;
              } else {
                if ((param0.a(2, param2[var8], var7) ^ -1) >= -1) {
                  var9 = param2[var8];
                  param2[var8] = param2[var6];
                  int incrementValue$1 = var6;
                  var6++;
                  param2[incrementValue$1] = var9;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    final static void a(int param0) {
        ql.a(true, wn.field_i, ld.field_a, 3960);
        is.field_a = true;
        if (param0 > -63) {
            field_a = null;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (256 == hw.field_i) {
            ((oh) this).field_c.c(b.c(-62, ((oh) this).field_b), go.a(((oh) this).field_e, (byte) -56));
        } else {
            var2 = ((oh) this).field_c.field_o * hw.field_i >> 359249000;
            var3 = hw.field_i * ((oh) this).field_c.field_v >> -574934456;
            ((oh) this).field_c.a(b.c(-109, ((oh) this).field_b), go.a(((oh) this).field_e, (byte) -56), var2, var3);
        }
        if (param0 < 106) {
            field_a = null;
        }
    }

    oh(ut param0, int param1, int param2) {
        ((oh) this).field_b = param1;
        ((oh) this).field_c = param0;
        ((oh) this).field_e = param2;
    }

    public static void b(byte param0) {
        if (param0 >= -43) {
            return;
        }
        field_h = null;
        field_d = null;
        field_g = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Team Results";
        field_a = new double[][]{new double[3], new double[3], new double[3]};
        field_h = "Name";
    }
}
