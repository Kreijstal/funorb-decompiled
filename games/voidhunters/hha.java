/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hha extends rqa {
    static boolean field_o;
    static khb field_p;

    hha(String param0, Class[] param1, String param2) {
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
          gcb.field_p = param0[0].a(false);
          if (param1 > -119) {
            field_o = true;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hha.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_p = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 == 255) {
          c.a(param5, param2, param0, param3, -16777216, param4);
          return;
        }
        if (param1 != 66) {
          hha.a(38, (byte) -85, -31, 24, 124, 91, -113);
          if (li.field_i) {
            rnb.a(param6 << 24 | param4, (byte) 73, param3, param0, param5, param2);
            return;
          }
          dma.b(param0, param3, param2, param5, param4, param6);
          return;
        }
        if (li.field_i) {
          rnb.a(param6 << 24 | param4, (byte) 73, param3, param0, param5, param2);
          return;
        }
        dma.b(param0, param3, param2, param5, param4, param6);
    }

    static {
        field_p = new khb("usename");
    }
}
