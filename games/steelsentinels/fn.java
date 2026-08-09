/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static boolean field_a;

    final static void a(int param0, int param1, boolean param2, int param3, tg param4) {
        RuntimeException var5 = null;
        tg var6 = null;
        sj stackIn_2_0;
        int stackIn_2_1;
        tg stackIn_2_2;
        int stackIn_2_3;
        int stackIn_2_4;
        sj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        tg stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        int stackIn_3_5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = ja.field_g;

              stackIn_2_1 = param3;

              stackIn_2_2 = (tg) (param4);

              stackIn_2_3 = param1;

              stackIn_2_4 = 1000000;

              if (param2) {
                stackIn_3_0 = (sj) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (tg) ((Object) stackIn_2_2);
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = 0;
                break L1;
              } else {
                stackIn_3_0 = (sj) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = (tg) ((Object) stackIn_2_2);
                stackIn_3_3 = stackIn_2_3;
                stackIn_3_4 = stackIn_2_4;
                stackIn_3_5 = 1;
                break L1;
              }
            }
            ((sj) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5 != 0, param0 ^ -15608);
            if (param0 == -26907) {
              break L0;
            } else {
              var6 = (tg) null;
              fn.a(-18, -98, false, -47, (tg) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("fn.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static ef a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ef stackIn_3_0 = null;
        ef stackIn_7_0 = null;
        ef stackIn_17_0 = null;
        ef stackIn_20_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        tg var6 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = param1.length();
            if (0 != var2_int) {
              if (63 < var2_int) {
                stackIn_7_0 = ma.field_cb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var2_int <= var3) {
                    if (param0 >= -113) {
                      var6 = (tg) null;
                      fn.a(50, -4, true, -63, (tg) null);
                      stackIn_27_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (-1 + var2_int == var3) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_17_0 = ec.field_b;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if ((sa.field_d.indexOf(var4) ^ -1) != 0) {
                          break L2;
                        } else {
                          stackIn_20_0 = ec.field_b;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = ud.field_A;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("fn.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L4;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return (ef) ((Object) stackIn_27_0);
              }
            }
          }
        }
    }

    final static e a(boolean param0, byte param1) {
        e var2;
        tg var3;
        e stackIn_3_0 = null;
        e stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        e stackIn_7_0 = null;
        e stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param1 != 69) {
          L0: {
            var3 = (tg) null;
            fn.a(21, -123, false, -68, (tg) null);
            var2 = new e(true);
            stackIn_7_0 = (e) (var2);

            if (!param0) {
              stackIn_8_0 = (e) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (e) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_f = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new e(true);
            stackIn_3_0 = (e) (var2);

            if (!param0) {
              stackIn_4_0 = (e) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (e) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_f = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        field_a = false;
    }
}
