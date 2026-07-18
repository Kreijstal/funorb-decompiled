/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static String field_b;
    static boolean field_f;
    static gr field_h;
    static String field_e;
    static hd field_a;
    static boolean field_i;
    static String field_c;
    static String field_g;
    static String field_j;
    static java.awt.Canvas field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, String param1, boolean param2, String param3, int param4, boolean param5, boolean param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var8_int = param0 - 30;
              var9 = 16 + pb.field_C.c(param1, var8_int, 16);
              if (param6) {
                param4 = param4 - (var9 >> 1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var10 = 15 + param7;
              var11 = 8 + param4;
              if (param3 != null) {
                var9 += 34;
                var11 += 30;
                break L2;
              } else {
                break L2;
              }
            }
            var12 = 10;
            L3: while (true) {
              if (var9 > var12 << 1) {
                on.a(param7, param4, param0, var9, var12, 65793, 140);
                int discarded$1 = pb.field_C.a(param1, var10, var11, var8_int, var9, 16777215, -1, 0, 0, 16);
                if (param3 == null) {
                  break L0;
                } else {
                  un.field_d.a(param3, var10, -10 + var11, 16777215, -1);
                  return;
                }
              } else {
                var12 = var12 >> 1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("ic.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(false).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ',' + false + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_h = null;
        field_c = null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_b = null;
        field_d = null;
    }

    final static void a(float param0, float param1, float param2, float param3, float param4, byte param5, float param6) {
        jj var7 = null;
        if (!(nm.field_k != null)) {
            var7 = sk.field_d;
            nm.field_k = new dp((lq) (Object) var7);
            cb.field_d.a((lq) (Object) nm.field_k);
        }
        nm.field_k.a(param3);
        nm.field_k.f(param6);
        nm.field_k.c(param4);
        nm.field_k.b(param2);
        nm.field_k.e(param0);
        nm.field_k.d(param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "League Point Thresholds";
        field_e = "Error connecting to server. Please try using a different server.";
        field_i = false;
        field_g = "Return to Main Menu";
        field_c = "You need a rating of <%1> to play with the current options.";
        field_j = "search";
        field_h = new gr();
    }
}
