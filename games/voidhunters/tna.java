/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tna extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_o = -101;
          }
          si.a(49, 62, param0[0].a(58));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tna.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String[] args, int param1) {
        try {
          if (param1 != 29141) {
            String[] var3 = (String[]) null;
            tna.a((String[]) null, -79);
          }
          gp.field_q = args;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "tna.B(" + (args != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    tna(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 0;
    }
}
