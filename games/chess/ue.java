/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_b;
    static String field_a;
    static boolean field_c;
    static int field_e;
    static ci field_d;

    final static void a(int param0, hh param1) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var3 = qn.field_U;
          var3.f(2, -94);
          var3.c(param1.field_l, (byte) -88);
          var3.b(param1.field_n, 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ue.C(").append(2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 126 + ')');
        }
    }

    final static void a(long param0, int param1, int param2) {
        nk var4 = qn.field_U;
        var4.f(param2, -75);
        var4.field_l = var4.field_l + 1;
        int var5 = var4.field_l;
        var4.c(6, (byte) 92);
        var4.a(-99, param0);
        var4.a(var4.field_l - var5, -1);
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Cancel";
        field_a = "You are offering to draw.";
    }
}
