/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static sl field_a;
    static String field_e;
    static String field_b;
    static String field_c;
    static Boolean field_d;

    final static void a(int param0, int param1, byte param2, int param3, bi param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = gf.field_a;
            if (param2 > 71) {
              L1: {
                var7 = gf.field_f;
                var8 = gf.field_i;
                var9 = gf.field_l;
                if (param0 >= param3) {
                  gf.i(param1, var6_int, -param3 + param1 + param0, var7);
                  param4.c(param1, param5, 256);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var10 = var9 - var8 + -1;
                if (param0 < param3) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = param0 + -param3;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var11 = stackIn_9_0;
                var12 = param0;
                if (var11 < -param1 + var8) {
                  var11 = var8 - param1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var10 < var12) {
                  var12 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              var13 = var11;
              L5: while (true) {
                if (var13 >= var12) {
                  gf.d(var8, var6_int, var9, var7);
                  break L0;
                } else {
                  var14 = (param0 + -var13 << 8) / param3;
                  gf.d(var13 + param1, var6_int, var13 + (param1 + 1), var7);
                  param4.c(param1, param5, var14);
                  var13++;
                  continue L5;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("sa.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param5 + 41);
        }
    }

    final static int a(int param0) {
        return ho.field_a + -db.field_f;
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        return 1 + (int)(((double)param0 - 50.0 * rh.field_d) / (rh.field_d * 150.0));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has dropped out.";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = "To return to the menu, press <%key>'ESC'</col> and select 'End Tutorial' from the menu.";
    }
}
