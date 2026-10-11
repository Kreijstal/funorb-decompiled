/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gcb extends rqa {
    static kba field_q;
    static String field_o;
    static String field_r;
    static String field_s;
    static String field_u;
    static String field_t;
    static boolean field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          jnb.field_o = param0[0].a(7);
          if (param1 > -119) {
            field_t = (String) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gcb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_r = null;
          field_o = null;
          field_u = null;
          field_s = null;
          field_t = null;
          field_q = null;
          return;
        }
        gcb.a(50);
        field_r = null;
        field_o = null;
        field_u = null;
        field_s = null;
        field_t = null;
        field_q = null;
    }

    gcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = new kba();
        field_r = "Long arm";
        field_s = "Add action (Set custom variable)";
        field_o = "Macroing or use of bots";
        field_t = "Your rating is <%0>";
        field_p = true;
        field_u = "Names can only contain letters, numbers, spaces and underscores";
    }
}
