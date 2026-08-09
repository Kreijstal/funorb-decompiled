/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static String field_f;
    static um field_c;
    static int field_g;
    static String field_d;
    static String field_b;
    static String field_e;
    static bk field_i;
    static int[] field_a;
    static java.applet.Applet field_h;

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -14) {
                break L1;
              } else {
                kb.a(95);
                break L1;
              }
            }
            stackIn_3_0 = pc.field_b.a(0, param1, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("kb.B(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 > -85) {
          field_g = -67;
          field_f = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_h = null;
          field_i = null;
          field_e = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_h = null;
          field_i = null;
          field_e = null;
          return;
        }
    }

    static {
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_c = new um();
        field_b = "Your request to join has been declined.";
        field_a = new int[8192];
        field_e = "You can get other special items by popping two or more shapes in one go.";
        field_d = "Close";
    }
}
