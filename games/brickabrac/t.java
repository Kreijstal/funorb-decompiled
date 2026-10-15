/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_h;
    static String field_b;
    static jp[] field_d;
    static String field_e;
    static String field_c;
    static jp field_a;
    static mh field_f;
    static boolean field_g;

    public static void a(int param0) {
        field_e = null;
        if (param0 == -11470) {
          field_f = null;
          field_b = null;
          field_d = null;
          field_h = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ge.a(-2846, (java.awt.Component) ((Object) param1));
          b.a(20616, (java.awt.Component) ((Object) param1));
          if (param0) {
            return;
          }
          if (null == qa.field_x) {
            return;
          }
          qa.field_x.a((java.awt.Component) ((Object) param1), -117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("t.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_b = "Offer draw";
        field_h = "Resigned";
        field_c = "Continue";
        field_e = "Clan";
        field_g = false;
    }
}
