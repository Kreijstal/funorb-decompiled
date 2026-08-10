/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static String field_c;
    static int field_b;
    static boolean field_a;
    static sh field_d;

    final static void a(int param0, db param1, int param2, int param3, String param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = param4.length();
            var7 = param3;
            L1: while (true) {
              if (var6_int <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = param4.charAt(var7);
                  if (var8 != 32) {
                    cg.a(bi.field_a, param1, param0, param5, (byte) -98, pa.field_d, param2, (char) var8);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param2 = param2 + param1.field_p;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("eh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 84 % ((param0 - -10) / 56);
        field_c = null;
        field_d = null;
    }

    final static void a(vb param0, int param1, byte param2) {
        if (param2 != -4) {
            return;
        }
        try {
            jl.field_a.b(param2 + 105, param0);
            vi.a(param1, param0, 1);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "eh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Connection lost - attempting to reconnect";
        field_a = false;
    }
}
