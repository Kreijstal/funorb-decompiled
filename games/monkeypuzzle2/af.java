/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static int field_d;
    static String field_b;
    static le field_e;
    static int field_c;
    static pj field_a;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              mh.a(-104, (java.awt.Component) (Object) param1);
              o.a((java.awt.Component) (Object) param1, true);
              if (eb.field_A == null) {
                break L1;
              } else {
                eb.field_A.a((java.awt.Component) (Object) param1, -8206);
                break L1;
              }
            }
            if (param0 == 20) {
              break L0;
            } else {
              var3 = null;
              af.a(-123, (java.awt.Canvas) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("af.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, le[] param1, int param2, int param3) {
        try {
            hh.field_u = new gg(param1);
            wg.field_h = -67;
            rb.field_cb = -37;
            int var4_int = -69;
            vj.a((byte) -123);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "af.C(" + -67 + ',' + (param1 != null ? "{...}" : "null") + ',' + -37 + ',' + -110 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_b = "Cancel";
        field_a = new pj();
    }
}
