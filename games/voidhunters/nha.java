/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nha extends rqa {
    static String field_p;
    static dja field_o;

    nha(String param0, Class[] param1, String param2) {
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
            field_o = (dja) null;
          }
          rfa.field_p = param0[0].a(false);
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nha.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 <= 18) {
          nha.e((byte) 115);
          field_p = null;
          return;
        }
        field_p = null;
    }

    static {
        bab discarded$0 = new bab();
        field_p = "(<%0> players want to join)";
        field_o = (dja) ((Object) new av());
    }
}
