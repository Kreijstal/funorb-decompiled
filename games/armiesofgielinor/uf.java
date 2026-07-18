/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static je field_i;
    int field_c;
    static String field_g;
    int field_b;
    static int field_a;
    int field_k;
    static String field_l;
    static int field_e;
    static wk field_j;
    int field_d;
    static kl field_f;
    private String field_h;

    final static void a(ls[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ls var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            var3 = 1;
            L1: while (true) {
              if (var3 >= var2_int) {
                break L0;
              } else {
                var4 = param0[var3];
                var5 = var3 + -1;
                L2: while (true) {
                  L3: {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      int discarded$9 = 30549;
                      if (!nf.a(var4, param0[var5])) {
                        break L3;
                      } else {
                        param0[1 + var5] = param0[var5];
                        var5--;
                        continue L2;
                      }
                    }
                  }
                  param0[1 + var5] = var4;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("uf.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 1680474497 + ')');
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = so.field_b.field_a;
        int var5 = so.field_b.field_g;
        int var6 = 30 + (rs.field_n.a(((uf) this).field_h, 200, 0) + 5);
        if (!(!wg.a(-33, var4 / 2 - 100, -2 + var4 / 2, var5 / 2 + ((var6 >> 1) - 30), (var6 >> 1) + var5 / 2))) {
            return param2;
        }
        if (!(!wg.a(-33, var4 / 2 + 2, var4 / 2 - -100, -30 + ((var6 >> 1) + var5 / 2), var5 / 2 - -(var6 >> 1)))) {
            return param0;
        }
        if (param1 < 41) {
            field_i = null;
        }
        return -1;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 <= 18) {
            return;
        }
        field_l = null;
        field_f = null;
        field_i = null;
        field_j = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_8_0 = null;
        int[] stackOut_4_0 = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_6_0 = null;
        var2 = so.field_b.field_a;
        var3 = so.field_b.field_g;
        if (param0 == 1619620993) {
          L0: {
            qn.b(0, 0, var2, var3, 0, 128);
            var4 = 5 + (rs.field_n.a(((uf) this).field_h, 200, 0) + 30);
            fe.b(212, -(var4 >> 1) + (-8 + var3 / 2), 216, 16 + var4, io.field_m, nd.field_b, 0, 128);
            int discarded$3 = rs.field_n.a(((uf) this).field_h, var2 / 2 - 100, -(var4 >> 1) + var3 / 2, 200, var4, 16777215, 0, 1, 0, 0);
            if (!wg.a(param0 + -1619621026, var2 / 2 + -100, 318, -30 + var3 / 2 - -(var4 >> 1), (var4 >> 1) + var3 / 2)) {
              stackOut_4_0 = nd.field_b;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = ci.field_e;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var14 = stackIn_5_0;
            var12 = var14;
            var10 = var12;
            var8 = var10;
            var6 = var8;
            var5 = var6;
            fe.a(-100 + var2 / 2, (var4 >> 1) + (var3 / 2 - 30), 98, 30, il.field_s, var14, 0, 128, true);
            if (!wg.a(-33, 2 + var2 / 2, var2 / 2 + 100, var3 / 2 - (-(var4 >> 1) - -30), var3 / 2 - -(var4 >> 1))) {
              stackOut_7_0 = nd.field_b;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = ci.field_e;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          var15 = stackIn_8_0;
          var13 = var15;
          var11 = var13;
          var9 = var11;
          var7 = var9;
          var5 = var7;
          fe.a(var2 / 2 + 2, -30 + (var3 / 2 - -(var4 >> 1)), 98, 30, il.field_s, var15, 0, 128, true);
          int discarded$4 = 1;
          fe.c(nt.field_p, 50 + (-100 + var2 / 2), 17 + (var4 >> 1) + var3 / 2 - 15, 0);
          int discarded$5 = 1;
          fe.c(oa.field_G, -50 + var2 / 2 + 100, 2 + (var3 / 2 + (var4 >> 1)), 0);
          return;
        } else {
          return;
        }
    }

    uf(int param0, int param1, int param2, int param3, String param4, ic param5) {
        try {
            ((uf) this).field_c = param3;
            ((uf) this).field_k = param1;
            ((uf) this).field_b = param2;
            ((uf) this).field_h = param4;
            ((uf) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "uf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Open <%0> portal";
        field_l = "Reject";
        field_j = new wk(150, 150);
    }
}
