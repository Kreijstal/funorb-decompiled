/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static od field_c;
    static bi field_b;
    static String[] field_a;

    public static void a() {
        int var1 = -117;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (var1 < ci.field_c) {
            im.field_d = im.field_d + (ci.field_c + -var1);
        }
        ci.field_c = var1;
        if (param0 != -3) {
            field_a = null;
        }
        return im.field_d + var1;
    }

    final static void a(rk param0, int param1, rk param2) {
        try {
            if (null != param2.field_a) {
                param2.a(true);
            }
            param2.field_a = param0.field_a;
            param2.field_h = param0;
            if (param1 != 0) {
            }
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ri.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b() {
        qh.c(4);
        if (fb.field_b != null) {
            fa.a(fb.field_b, -122);
        }
        int discarded$12 = -58;
        hl.b();
        int discarded$25 = 18;
        vd.b();
        int discarded$32 = 37;
        vm.h();
        if (!(!pa.a(false))) {
            vh.field_a.b(true, 1);
            tb.a(0, 125);
        }
        dc.d(115);
    }

    final static int a(String[] args, int param1, String param2, ok param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var14 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.c(param2);
              if (param4 < var5_int) {
                break L1;
              } else {
                if (param2.indexOf("<br>") == -1) {
                  args[0] = (String) (Object) args;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (var5_int - -param4 - 1) / param4;
            param4 = var5_int / var6;
            var7 = -45 / ((-40 - param1) / 37);
            var6 = 0;
            var8 = 0;
            var9 = param2.length();
            var10 = 0;
            L2: while (true) {
              if (var10 >= var9) {
                L3: {
                  if (var8 < var9) {
                    int incrementValue$2 = var6;
                    var6++;
                    args[incrementValue$2] = param2.substring(var8, var9).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_20_0 = var6;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param2.charAt(var10);
                    if (var11 == 32) {
                      break L5;
                    } else {
                      if (45 == var11) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var12 = param2.substring(var8, var10 - -1).trim();
                  var13 = param3.c(var12);
                  if (param4 <= var13) {
                    var8 = var10 - -1;
                    int incrementValue$3 = var6;
                    var6++;
                    args[incrementValue$3] = var12;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var11 != 62) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("ri.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (args == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param4 + 41);
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
