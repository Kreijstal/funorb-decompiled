/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class knb extends rqa {
    static String field_q;
    static String field_p;
    static String field_r;
    static boolean field_o;

    knb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 > -96) {
          knb.e((byte) -119);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            field_r = (String) null;
          }
          si.a(178, 62, param0[0].a(55));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("knb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        field_q = "Accept";
        field_p = "Type your password again to make sure it's correct";
        field_r = "Add <%0> to friend list";
        field_o = false;
    }
}
