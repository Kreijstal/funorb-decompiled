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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 45 / ((12 - param1) / 44);
          stackIn_1_0 = tf.field_a.a("", (byte) -105, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("rd.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "SCORE:";
        field_n = "Resume Game";
    }
}
