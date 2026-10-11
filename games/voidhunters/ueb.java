/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ueb extends rqa {
    static String field_o;

    public static void a(int param0) {
        if (param0 != 0) {
          field_o = (String) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hb.field_a = param0[0].a(107);
          if (param1 > -119) {
            ueb.a(-49);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ueb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ueb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "New Game";
    }
}
