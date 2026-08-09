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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              jnb.field_o = param0[0].a(7);
              if (param1 <= -119) {
                break L1;
              } else {
                field_t = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gcb.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          gcb.a(50);
          field_r = null;
          field_o = null;
          field_u = null;
          field_s = null;
          field_t = null;
          field_q = null;
          return;
        } else {
          field_r = null;
          field_o = null;
          field_u = null;
          field_s = null;
          field_t = null;
          field_q = null;
          return;
        }
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
