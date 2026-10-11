/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class opb extends rqa {
    static int field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            opb.a(-89, 5, (byte) -112, -51, 115, 72, 68);
          }
          stackIn_3_0 = new nc(frb.a(13, 103));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("opb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        if (param2 != -128) {
          field_o = -36;
          if (!li.field_i) {
            dma.d(param0, param1, param6, param3, param5, param4);
            return;
          }
          if (fua.field_o) {
            og.field_r.a(72, param1, param6, param4 << 24 | param5, param0, param3);
            return;
          }
          return;
        }
        if (!li.field_i) {
          dma.d(param0, param1, param6, param3, param5, param4);
          return;
        }
        if (!fua.field_o) {
          return;
        }
        og.field_r.a(72, param1, param6, param4 << 24 | param5, param0, param3);
    }

    public static void e(byte param0) {
        if (param0 <= 57) {
          opb.a(-77, 127, (byte) 35, -88, 55, 91, -105);
          field_p = null;
          return;
        }
        field_p = null;
    }

    opb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Show lobby chat from my friends";
        field_o = 25;
    }
}
