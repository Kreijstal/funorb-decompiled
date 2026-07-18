/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw implements wwa {
    static int field_b;
    static int[] field_a;
    static dfa field_c;

    public static void a() {
        field_a = null;
        field_c = null;
    }

    public final void a(int param0, shb param1, int param2, int param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        phb var8 = null;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param1.field_g + param2;
              var7 = param3 - -param1.field_r;
              npa.a(var7, (byte) 115, param1.field_f, param1.field_h, var6_int);
              var8 = ps.field_a[1];
              if (!(param1 instanceof htb)) {
                break L1;
              } else {
                if (!((htb) (Object) param1).field_u) {
                  break L1;
                } else {
                  var8.c((-var8.field_m + param1.field_h >> 1) + (1 + var6_int), 1 + (var7 + (-var8.field_n + param1.field_f >> 1)), 256);
                  break L1;
                }
              }
            }
            L2: {
              if (param1.e((byte) -120)) {
                aha.a(var7 + 2, param1.field_h - 4, var6_int + 2, -4 + param1.field_f, (byte) -62);
                break L2;
              } else {
                break L2;
              }
            }
            var9 = -1 / ((-27 - param0) / 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("dw.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 10;
        field_c = new dfa();
    }
}
