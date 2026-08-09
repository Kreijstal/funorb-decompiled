/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static byte[][] field_c;
    static ej field_d;
    static eg field_a;
    static String field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            wl.a((java.awt.Component) ((Object) param0), (byte) -3);
            var2_int = 59 / ((9 - param1) / 59);
            g.a((java.awt.Component) ((Object) param0), 0);
            if (null == jd.field_c) {
              break L0;
            } else {
              jd.field_c.a((java.awt.Component) ((Object) param0), false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("pg.C(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
          field_a = (eg) null;
          field_b = null;
          field_c = (byte[][]) null;
          return;
        } else {
          field_b = null;
          field_c = (byte[][]) null;
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_c = new byte[1000][];
        field_d = new ej(4, 1, 1, 1);
        field_b = "Creating your account";
        field_a = new eg();
    }
}
