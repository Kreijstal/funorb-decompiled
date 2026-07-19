/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static String field_b;
    static cg field_a;
    private static long[] field_c;
    static int field_d;

    final static void a(int param0, int param1, byte param2, de param3, int param4) {
        try {
            param3.i(12, 55);
            if (param2 != -114) {
                field_c = (long[]) null;
            }
            param3.a(17, (byte) 105);
            param3.a(param4, (byte) 105);
            param3.a(param0, (byte) 105);
            param3.i(param1, param2 + 218);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "uj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 256) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit: {
            long var0 = 0L;
            int var2 = 0;
            int var3 = 0;
            field_b = "Paused";
            field_a = new cg(6, 0, 4, 2);
            field_c = new long[256];
            var2 = 0;
            L0: while (true) {
              if (-257 >= (var2 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if ((var3 ^ -1) <= -9) {
                    field_c[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0 ^ -1L) != -2L) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = -3932672073523589310L ^ var0 >>> -1050490239;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
