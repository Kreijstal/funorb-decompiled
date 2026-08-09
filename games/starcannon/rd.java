/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rd extends uh {
    static String field_n;
    static hl[] field_p;
    static String field_o;
    static String[] field_q;

    public static void e(int param0) {
        field_q = null;
        if (param0 != -29826) {
            return;
        }
        field_n = null;
        field_o = null;
        field_p = null;
    }

    final static vi d(int param0) {
        if (param0 >= -8) {
            field_q = (String[]) null;
            return hh.field_d;
        }
        return hh.field_d;
    }

    rd() {
    }

    final static byte[] a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 45 / ((12 - param1) / 44);
            stackIn_1_0 = tf.field_a.a("", (byte) -105, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("rd.A(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_o = "SCORE:";
        field_n = "Resume Game";
    }
}
