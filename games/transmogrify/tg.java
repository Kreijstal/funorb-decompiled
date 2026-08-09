/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_c;
    static int field_d;
    static int field_a;
    static volatile long field_b;

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_d = -21;
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3 = rb.a((byte) -84, param2, param1);
            var4 = -98 / ((45 - param0) / 35);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                if (var5 < param2.length()) {
                  if (!bc.a(param2.charAt(var5), -161)) {
                    stackIn_11_0 = ff.field_C;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      stackIn_14_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("tg.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return (String) ((Object) stackIn_14_0);
          }
        }
    }

    final static void a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              fd.field_h[param0] = param2;
              fd.field_e[param0] = param5;
              fd.field_c[param0] = param4;
              fd.field_a[param0] = param6;
              fd.field_b[param0] = param1;
              if (param3 > 37) {
                break L1;
              } else {
                field_d = 117;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("tg.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_c = null;
        field_d = 0;
        field_b = 0L;
    }
}
