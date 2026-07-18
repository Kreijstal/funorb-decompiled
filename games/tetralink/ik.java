/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static uf field_d;
    static double field_b;
    static int field_e;
    static int field_a;
    static java.applet.Applet field_c;
    static String field_f;

    final static sj a(int param0) {
        if (fk.field_Q == ma.field_d) {
            throw new IllegalStateException();
        }
        if (field_d != ma.field_d) {
            return null;
        }
        ma.field_d = fk.field_Q;
        return va.field_n;
    }

    public static void b(int param0) {
        field_f = null;
        field_d = null;
        field_c = null;
    }

    final static Object a(byte[] param0, boolean param1, int param2) {
        la var3 = null;
        RuntimeException var3_ref = null;
        la stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        la stackOut_4_0 = null;
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
            if (param0 != null) {
              if (param0.length <= 136) {
                stackOut_6_0 = (byte[]) param0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = new la();
                ((jd) (Object) var3).a(-10543, param0);
                stackOut_4_0 = (la) var3;
                stackIn_5_0 = stackOut_4_0;
                return (Object) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ik.A(");
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + false + ',' + -137 + ')');
        }
        return (Object) (Object) stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new uf();
        field_b = Math.atan2(1.0, 0.0);
    }
}
