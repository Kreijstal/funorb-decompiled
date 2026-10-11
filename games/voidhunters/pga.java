/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pga extends rqa {
    static String field_o;

    final static void a(java.awt.Canvas param0, boolean param1) {
        try {
          if (qmb.field_q == 11) {
            ana.c((byte) 111);
          }
          uob.a(dga.field_a, (byte) 106, mnb.field_g, dkb.field_b);
          if (!param1) {
            pga.a(73);
          }
          dh.a(param0, 0, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pga.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -29417) {
          field_o = (String) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    pga(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(124, 77));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pga.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_o = "Start Game";
    }
}
