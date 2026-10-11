/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends rqa {
    static int field_q;
    static int field_p;
    static float field_o;

    final static sw a(int param0, int param1) {
        if (param1 != 300) {
          phb var3 = (phb) null;
          de.a(86, (phb) null);
          return ok.field_b[param0];
        }
        return ok.field_b[param0];
    }

    final static void a(int param0, phb param1) {
        try {
          vbb.e(3);
          dma.a(param1.field_r, param1.field_m, param1.field_n);
          if (param0 <= 22) {
            field_q = -37;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "de.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    de(String param0, Class[] param1, String param2) {
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
            field_q = -123;
          }
          si.a(160, 62, param0[0].a(60));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("de.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = 500;
        field_o = 0.0f;
        field_p = 300;
    }
}
