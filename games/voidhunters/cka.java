/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cka extends rqa {
    static int field_p;
    static hqb field_o;

    cka(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, String param1, int param2, int param3, int param4, int param5) {
        if (param5 != 4266) {
          return;
        }
        try {
          pm.a(param4, param0, param3, param1, nua.field_p, param2, (byte) -108);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cka.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -2) {
          String var2 = (String) null;
          cka.a(127, (String) null, 30, -1, -91, -95);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(oaa.b((byte) -51));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cka.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = -2;
        sl discarded$0 = new sl();
    }
}
