/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hra extends rqa {
    static bs field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        lta var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            var4 = (lta) null;
            hra.a((lta) null, 62);
          }
          stackIn_3_0 = new nc(oma.field_i);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hra.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    hra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(lta param0, int param1) {
        if (param1 != -8077) {
          return;
        }
        try {
          kba.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hra.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 9839) {
          field_o = (bs) null;
        }
    }

    static {
    }
}
