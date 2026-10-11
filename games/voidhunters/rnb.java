/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rnb extends rqa {
    static String field_o;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        if (param5 != param3) {
          og.field_r.c(param5, 1, param0, param4, param3, param2);
          if (param1 > 1) {
            return;
          }
          rnb.a(59, (byte) -18, 107, 110, 95, -108);
          return;
        }
        if (param2 != param4) {
          og.field_r.c(param5, 1, param0, param4, param3, param2);
          if (param1 > 1) {
            return;
          }
          rnb.a(59, (byte) -18, 107, 110, 95, -108);
          return;
        }
        param5++;
        og.field_r.c(param5, 1, param0, param4, param3, param2);
        if (param1 > 1) {
          return;
        }
        rnb.a(59, (byte) -18, 107, 110, 95, -108);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 127) {
          field_o = (String) null;
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
          si.a(90, 62, param0[0].a(83));
          if (param1 >= -119) {
            rnb.e((byte) -13);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rnb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    rnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          field_o = (String) null;
          return psb.field_b != null ? true : bsa.field_o;
        }
        return psb.field_b != null ? true : bsa.field_o;
    }

    static {
        field_o = "<%0> might change the options - wait and see.";
    }
}
