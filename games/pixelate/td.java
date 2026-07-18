/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_a;
    static String field_c;
    static String field_d;
    static oj field_b;

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -97) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            stackOut_2_0 = si.a(-26629, 10, param1, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("td.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 != 6) {
            Object var2 = null;
            td.a(72, -37, -11, (tf[]) null, (byte) -29, -65);
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, tf[] param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (0 < param2) {
                  var6_int = param3[0].field_A;
                  var7 = param3[2].field_A;
                  var8 = param3[1].field_A;
                  param3[0].d(param0, param1, param5);
                  param3[2].d(param2 + param0 + -var7, param1, param5);
                  if (param4 == 121) {
                    t.a(wg.field_c);
                    t.d(var6_int + param0, param1, -var7 + param2 + param0, param1 - -param3[1].field_B);
                    var9 = param0 + var6_int;
                    var10 = -var7 + (param0 + param2);
                    param0 = var9;
                    L2: while (true) {
                      if (var10 <= param0) {
                        t.b(wg.field_c);
                        break L0;
                      } else {
                        param3[1].d(param0, param1, param5);
                        param0 = param0 + var8;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("td.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, hh[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            lk.field_o = new hh[param1.length];
            var2_int = 0;
            L1: while (true) {
              if (lk.field_o.length <= var2_int) {
                li.field_d = new tf(48, 48);
                li.field_d.c();
                var2_int = 0;
                L2: while (true) {
                  if (8 <= var2_int) {
                    t.d(8, 8, 32, 32, 6, 16777215);
                    t.c(2, 2, 0, 0, t.field_j, t.field_d);
                    qa.field_f.a(19692);
                    break L0;
                  } else {
                    var3 = (var2_int << 8) / 8;
                    t.d(var2_int, var2_int, 32 - -((-var2_int + 8) * 2), -(2 * var2_int) + 48, 6, var3 * 65793);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                var3 = gd.field_e[var2_int].field_m;
                var4 = gd.field_e[var2_int].field_k;
                lk.field_o[var2_int] = new hh(var3, var4, 2);
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    var2_int++;
                    continue L1;
                  } else {
                    var6 = 0;
                    L4: while (true) {
                      if (var3 <= var6) {
                        var5++;
                        continue L3;
                      } else {
                        lk.field_o[var2_int].field_n[var6 + var5 * var3] = param1[var2_int].field_n[var6 + var5 * 5];
                        var6++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("td.A(").append(127).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in / Create account";
        field_c = "It's a draw!";
    }
}
