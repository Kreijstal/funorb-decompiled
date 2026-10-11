/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oqa extends rqa {
    static phb[] field_q;
    static int field_p;
    static int field_o;

    public static void e(byte param0) {
        if (param0 != 53) {
          field_o = -42;
          field_q = null;
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
          si.a(31, 62, param0[0].a(65));
          if (param1 > -119) {
            field_o = -106;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oqa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    oqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = 64;
        field_o = 0;
    }
}
