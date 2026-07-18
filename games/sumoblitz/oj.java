/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj implements mh {
    static int field_a;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
    }

    final static boolean b(int param0, int param1, int param2) {
        return (34 & param0) != 0;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wb var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param4 - -param0.field_r;
              if (param2 == 5592405) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var7 = param1 - -param0.field_v;
              nn.a(param0.field_p, var6_int, param0.field_q, (byte) -84, var7);
              var8 = fw.field_m[1];
              if (!(param0 instanceof wp)) {
                break L2;
              } else {
                if (!((wp) (Object) param0).field_C) {
                  break L2;
                } else {
                  var8.d((-var8.field_z + param0.field_q >> 1) + (var6_int + 1), (-var8.field_w + param0.field_p >> 1) + (var7 + 1), 256);
                  break L2;
                }
              }
            }
            if (param0.d(param2 + -5592406)) {
              pp.a(var7 - -2, -4 + param0.field_q, param2 + -5605586, var6_int - -2, -4 + param0.field_p);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("oj.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        return 0 != (2048 & param0);
    }

    final static boolean b(int param0) {
        int var1 = -55;
        return dv.field_b;
    }

    final static boolean a(boolean param0) {
        if (pu.field_e == null) {
            return false;
        }
        if (null == pu.field_e.e((byte) 54)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email address is unavailable";
    }
}
