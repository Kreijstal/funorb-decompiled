/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qtb extends rqa {
    static int field_o;
    static int field_p;
    static String[] field_q;

    qtb(String param0, Class[] param1, String param2) {
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
          if (param1 > -119) {
            qtb.a(-28);
          }
          stackIn_3_0 = new nc(frb.a(222, 109));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qtb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 16407) {
          qtb.a(68);
          field_q = null;
          return;
        }
        field_q = null;
    }

    static {
        field_o = 0;
        iaa discarded$0 = new iaa();
        field_q = new String[]{"By rating", "By win percentage"};
    }
}
