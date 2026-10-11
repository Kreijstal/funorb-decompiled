/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends rqa {
    static ha field_r;
    static String field_s;
    static int field_q;
    static String field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_s = (String) null;
          }
          stackIn_3_0 = new nc(btb.field_a);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("og.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    og(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_r = null;
        field_o = null;
        field_p = null;
        if (param0 != 23969) {
          og.a(-24);
          field_s = null;
          return;
        }
        field_s = null;
    }

    static {
        field_o = "You are invited to <%0>'s game.";
        field_s = "<%0> has left the lobby.";
        field_q = 4;
        field_p = "RuneScape clan";
    }
}
