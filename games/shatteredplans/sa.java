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
        int stackIn_9_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
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
                  stackIn_9_0 = 0;
                  break L2;
                } else {
                  stackIn_9_0 = param0 + -param3;
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var14 = (param0 + -var13 << 2029303720) / param3;
                  gf.d(var13 + param1, var6_int, var13 + (param1 + 1), var7);
                  param4.c(param1, param5, var14);
                  var13++;
                  continue L5;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("sa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0) {
        if (param0 != -27572) {
            field_a = (sl) null;
        }
        return ho.field_a + -db.field_f;
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 2029303720) {
            field_d = (Boolean) null;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        if (param1 >= -102) {
            field_a = (sl) null;
        }
        return 1 + (int)(((double)param0 - 50.0 * rh.field_d) / (rh.field_d * 150.0));
    }

    static {
        field_c = "<%0> has dropped out.";
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = "To return to the menu, press <%key>'ESC'</col> and select 'End Tutorial' from the menu.";
    }
}
