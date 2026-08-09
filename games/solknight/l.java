/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    static String field_b;
    static String field_d;
    static int field_c;
    static int[] field_a;

    final static boolean a(int param0, int param1, int param2, da param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = param3.b(param2, 12257, param1);
            var4 = var6;
            if (var6 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = -92 / ((param0 - 11) / 39);
              ua.a(0, var6);
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4_ref);

            stackIn_8_1 = new StringBuilder().append("l.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0 != 0;
        }
    }

    final static void a(int param0, int param1, m param2) {
        jd var3 = null;
        try {
            int var4 = 89 / ((-22 - param1) / 49);
            var3 = id.field_c;
            var3.e(param0, -2147483648);
            var3.c(109, param2.field_j);
            var3.a(true, param2.field_i);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "l.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 95) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                param0 = ml.a("", -30614, '_', param0);
                var3 = ji.a(param2 + 21762, param0);
                if (0 != (param1.indexOf(param0) ^ -1)) {
                  break L3;
                } else {
                  if ((param1.indexOf(var3) ^ -1) == 0) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("l.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0, int param1) {
        int var2;
        L0: {
          la.field_k = param1;
          if (null != ua.field_I) {
            ua.field_I.d(1349013231, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (null != ah.field_a) {
          ah.field_a.b(-15705, param1);
          var2 = 103 % ((param0 - 50) / 46);
          return;
        } else {
          var2 = 103 % ((param0 - 50) / 46);
          return;
        }
    }

    final static int a(byte param0) {
        if (param0 <= 94) {
            return -103;
        }
        return (int)(1000000000L / ta.field_a);
    }

    static {
        field_b = "Loading sound effects";
        field_d = "OVER <%0>";
    }
}
