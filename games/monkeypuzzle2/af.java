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
        if (param0 > 116) {
          field_e = null;
          field_b = null;
          return;
        }
        le[] var2 = (le[]) null;
        af.a(-67, (le[]) null, -37, -110);
        field_e = null;
        field_b = null;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          mh.a(-104, (java.awt.Component) ((Object) param1));
          o.a((java.awt.Component) ((Object) param1), true);
          if (eb.field_A != null) {
            eb.field_A.a((java.awt.Component) ((Object) param1), -8206);
          }
          if (param0 == 20) {
            return;
          }
          var3 = (java.awt.Canvas) null;
          af.a(-123, (java.awt.Canvas) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("af.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, le[] param1, int param2, int param3) {
        try {
          hh.field_u = new gg(param1);
          wg.field_h = param0;
          rb.field_cb = param2;
          int var4_int = 69 / ((param3 + 60) / 41);
          vj.a((byte) -123);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "af.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_d = 20;
        field_b = "Cancel";
        field_a = new pj();
    }
}
