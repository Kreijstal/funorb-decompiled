/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jca extends rqa {
    static String field_o;
    static String field_p;

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        if (param0 <= 55) {
          field_p = (String) null;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = param1 >> 16;
        int var4 = 65535 & param1;
        int var5 = param0 >> 16;
        int var6 = -127 % ((param2 + 4) / 62);
        int var7 = 65535 & param0;
        return var3 * param0 - (-(var5 * var4) - (var7 * var4 >> 16));
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
            stackIn_4_0 = new nc(frb.a(205, 86));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jca.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    jca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "You cannot join this game - it is in progress";
        field_p = "Waiting for instruments";
    }
}
