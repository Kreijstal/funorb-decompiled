/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class thb extends rqa {
    static String field_o;

    thb(String param0, Class[] param1, String param2) {
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
          if (param1 >= -119) {
            thb.a(69, 32, 84);
          }
          si.a(200, 62, param0[0].a(110));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("thb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 200) {
          field_o = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        gwa.a(param0, -1, (double)param2, param0, (double)param2);
        if (param1 != 0) {
          field_o = (String) null;
        }
    }

    static {
        field_o = "Hold this to win the game";
    }
}
