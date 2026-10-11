/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bsa extends rqa {
    static String field_p;
    static llb field_q;
    static boolean field_o;

    public static void e(byte param0) {
        field_p = null;
        if (param0 != -7) {
          return;
        }
        field_q = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          qaa.field_a = param0[0].d(0);
          if (param1 >= -119) {
            bsa.e((byte) -82);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bsa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    bsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "<%0> connected";
    }
}
