/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static tf field_h;
    static double field_f;
    static int field_a;
    static int field_b;
    static boolean field_c;
    static int field_d;
    static int field_g;
    static wm field_e;
    static ak field_i;

    final static int a(double param0, int param1) {
        if (param1 != 65536) {
          field_i = (ak) null;
          return (int)(65536.0 * param0);
        }
        return (int)(65536.0 * param0);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 59) {
          return;
        }
        field_h = null;
        field_i = null;
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            of.a(1.9411644295127344, -72);
          }
          stackIn_3_0 = ui.a(true, param0, 0, param0.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("of.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = Math.atan2(1.0, 0.0);
        field_e = new wm(11, 0, 1, 2);
    }
}
