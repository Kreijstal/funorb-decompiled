/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pua extends rqa {
    static int field_p;
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 80) {
          field_p = -59;
        }
    }

    pua(String param0, Class[] param1, String param2) {
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
          if (param1 >= -119) {
            field_o = (String) null;
          }
          stackIn_3_0 = new nc(frb.a(80, 89));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pua.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        vna discarded$0 = new vna();
        field_o = "The '<%0>' setting needs to be changed.";
    }
}
