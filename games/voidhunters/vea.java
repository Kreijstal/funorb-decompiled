/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vea extends rqa {
    private static long[] field_o;
    static soa field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = (long[]) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(ceb.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vea.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 0) {
            field_o = (long[]) null;
        }
    }

    vea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_o = new long[256];
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (-9 >= (var3 ^ -1)) {
                    field_o[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (1L != (var0 & 1L)) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 885506881 ^ -3932672073523589310L;
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
