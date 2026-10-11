/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class job extends rqa {
    static String field_q;
    static String field_o;
    static int[] field_p;

    public static void e(byte param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 != -16) {
          field_p = (int[]) null;
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
            field_p = (int[]) null;
          }
          si.a(113, 62, param0[0].a(50));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("job.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    job(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = "<%0> exploded";
        field_p = new int[1];
        field_o = "Player";
    }
}
