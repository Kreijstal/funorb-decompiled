/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iha extends rqa {
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -101) {
          field_o = (String) null;
        }
    }

    final static boolean e(int param0) {
        if (param0 != 0) {
          iha.a(-11);
          return bm.field_o.field_k;
        }
        return bm.field_o.field_k;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(188, 62, param0[0].a(124));
          if (param1 >= -119) {
            iha.e(117);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("iha.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    iha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Connecting to<br>friend server...";
    }
}
