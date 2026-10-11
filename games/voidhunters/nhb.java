/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nhb extends rqa {
    static int[] field_o;
    static boolean field_p;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        int var8 = param3 / 2;
        if (var8 < 2 &&
          var8 < param3) {
          var8 = param3;
        }
        int var9 = param1 * param5 >> 8;
        int var10 = rmb.a(-16777216, param0);
        int var11 = dib.a((byte) 95, param0, param1, var10);
        paa.a(12124934, -98, -var9 + param5, param2 + (-var8 + param3) / 2, var8, param6 + var9);
        ci.a(param2, param3, var10, var9, param6, var11, param7 ^ param7);
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
          si.a(65, 62, param0[0].a(24));
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nhb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    nhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 12124934) {
          return;
        }
        field_o = null;
    }

    static {
    }
}
