/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class acb extends rqa {
    static boolean field_p;
    static String field_r;
    static String field_q;
    static String field_o;

    acb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
          acb.b(false);
          field_o = null;
          field_r = null;
          return;
        }
        field_o = null;
        field_r = null;
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
            field_q = (String) null;
          }
          si.a(13, 62, param0[0].a(36));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("acb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "One team has a base, the other team wants to destroy it";
        field_r = "Try changing the following settings:  ";
        field_o = "<%0> has declined the invitation.";
    }
}
