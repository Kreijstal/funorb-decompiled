/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static od field_c;
    static bi field_b;
    static String[] field_a;

    public static void a(byte param0) {
        int var1 = -117 / ((param0 - -52) / 52);
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
            field_a = (String[]) null;
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
                ri.a(-89);
            }
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ri.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        qh.c(4);
        if (fb.field_b != null) {
            fa.a(fb.field_b, -122);
        }
        hl.b((byte) -58);
        vd.b((byte) 18);
        vm.h((byte) 37);
        if (param0 <= 101) {
            return;
        }
        if (!(!pa.a(false))) {
            vh.field_a.b(true, 1);
            tb.a(0, 125);
        }
        dc.d(115);
    }

    final static int a(String[] args, int param1, String param2, ok param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        var14 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.c(param2);
              if (param4 < var5_int) {
                break L1;
              } else {
                if ((param2.indexOf("<br>") ^ -1) == 0) {
                  args[0] = param2;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                    incrementValue$0 = var6;
                    var6++;
                    args[incrementValue$0] = param2.substring(var8, var9).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_23_0 = var6;
                decompiledRegionSelector0 = 1;
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
                    incrementValue$1 = var6;
                    var6++;
                    args[incrementValue$1] = var12;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (var11 == 62) {
                  if (param2.regionMatches(var10 + -3, "<br>", 0, 4)) {
                    incrementValue$2 = var6;
                    var6++;
                    args[incrementValue$2] = param2.substring(var8, -3 + var10).trim();
                    var8 = var10 + 1;
                    var10++;
                    continue L2;
                  } else {
                    var10++;
                    continue L2;
                  }
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("ri.A(");

            if (args == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_23_0;
        }
    }

    static {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
