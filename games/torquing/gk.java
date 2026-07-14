/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static java.math.BigInteger field_b;
    static boolean field_a;

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = Torquing.field_u;
        if (param0 == -5006) {
          bh.field_a = ag.field_c;
          if (255 != param3) {
            if (-101 >= (param3 ^ -1)) {
              if (param3 > 105) {
                ua.field_b = pg.a(param3, param1, -1);
                return;
              } else {
                ua.field_b = di.a(0, param2);
                return;
              }
            } else {
              ua.field_b = pg.a(param3, param1, -1);
              return;
            }
          } else {
            L0: {
              stackOut_13_0 = 90;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (13 <= oh.field_d) {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L0;
              } else {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L0;
              }
            }
            ua.field_b = pa.b(stackIn_16_0, stackIn_16_1 != 0);
            return;
          }
        } else {
          field_a = true;
          bh.field_a = ag.field_c;
          if (255 != param3) {
            if (-101 >= (param3 ^ -1)) {
              if (param3 <= 105) {
                ua.field_b = di.a(0, param2);
                return;
              } else {
                ua.field_b = pg.a(param3, param1, -1);
                return;
              }
            } else {
              ua.field_b = pg.a(param3, param1, -1);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = 90;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (13 <= oh.field_d) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            ua.field_b = pa.b(stackIn_5_0, stackIn_5_1 != 0);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -55 / ((53 - param0) / 58);
    }

    final static t[] a(int param0, int param1, la param2, int param3) {
        Object var5 = null;
        if (nd.a(param1, param2, -1, param3)) {
          if (param0 != 105) {
            var5 = null;
            t[] discarded$2 = gk.a(-107, 81, (la) null, 37);
            return tb.a(true);
          } else {
            return tb.a(true);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new java.math.BigInteger("65537");
    }
}
