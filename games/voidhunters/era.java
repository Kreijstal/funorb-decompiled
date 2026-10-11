/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class era extends rqa {
    static jra field_o;
    static int field_p;
    static boolean field_r;
    static String field_q;
    static String field_s;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            field_p = 118;
          }
          stackIn_3_0 = new nc(frb.a(42, 119));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("era.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_q = null;
        field_o = null;
        if (param0 != 42) {
          field_p = -66;
        }
    }

    era(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = new jra();
        field_p = 1;
        field_q = "Log in / Create account";
        field_s = "Scavengers";
    }
}
