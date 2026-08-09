/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static jn field_c;
    static int[] field_d;
    static int[] field_f;
    static int[] field_e;
    static String field_b;
    static String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -13181) {
                break L1;
              } else {
                jf.a(74, (byte) -66, -15);
                break L1;
              }
            }
            stackIn_3_0 = ra.a(10, param1, -46, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 > -85) {
            return true;
        }
        return 0 != (2048 & param0) ? true : false;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 78) {
          jf.a((byte) 7);
          field_e = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        field_c = new jn();
        field_d = new int[128];
        field_e = new int[8192];
        field_b = "This is a hidden Achievement";
        field_a = "Waiting for instruments";
    }
}
