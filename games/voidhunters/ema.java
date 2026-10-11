/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema extends rqa {
    static String field_q;
    static dja field_p;
    static mfb[] field_o;
    static String field_r;

    public static void a(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 != 0) {
          field_q = (String) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    ema(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lcb.field_o = param0[0].a(false);
          if (param1 >= -119) {
            field_o = (mfb[]) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ema.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "Accept draw";
        field_p = (dja) ((Object) new wla());
        field_r = "Passwords must be between 5 and 20 characters long";
    }
}
