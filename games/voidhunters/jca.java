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
        int var3 = param1 >> 1817716304;
        int var4 = 65535 & param1;
        int var5 = param0 >> -31148048;
        int var6 = -127 % ((param2 - -4) / 62);
        int var7 = 65535 & param0;
        return var3 * param0 - (-(var5 * var4) + -(var7 * var4 >> -446832592));
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              stackIn_4_0 = new nc(frb.a(205, 86));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jca.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
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
