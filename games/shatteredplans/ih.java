/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static ob field_c;
    static int field_d;
    static int field_b;
    static am field_g;
    static fg field_f;
    static String field_a;
    static String field_e;

    final static void a(String param0, int param1, int param2, int param3, String param4, int param5) {
        sl var8 = null;
        int var7 = 0;
        int discarded$0 = 0;
        try {
            var8 = js.field_f;
            sl var6 = var8;
            var8.h(param5, 255);
            var8.field_j = var8.field_j + 1;
            var7 = var8.field_j;
            var8.c(param3, (byte) -80);
            if (!(param3 != param1)) {
                var8.a(param0, (byte) 0);
            }
            if (param4 == null) {
                var8.d(param2, 255);
            } else {
                discarded$0 = ee.a(var8, (byte) -87, param4);
            }
            var8.b(-var7 + var8.field_j, (byte) 122);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ih.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = pd.a((byte) 102, oq.a(5722, param0));
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            var3 = 114 / ((-15 - param1) / 49);
            stackOut_3_0 = (String) (var2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("ih.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_g = null;
        field_c = null;
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(int param0) {
        int var1 = 1 % ((-61 - param0) / 56);
        return lg.field_e != null ? true : false;
    }

    static {
        field_d = -1;
        field_a = "Victory";
        field_f = new fg();
        field_e = "Maximum total fleet size";
    }
}
