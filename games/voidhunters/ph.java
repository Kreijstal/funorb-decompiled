/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends rqa {
    static int field_o;

    ph(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        String var5;
        var2 = param1 % 1000;
        if (param0 == 10) {
          L0: {
            var3 = param1 / 1000;
            var4 = var3 / 60;
            var3 = var3 % 60;
            var5 = "";
            if (var4 <= 0) {
              break L0;
            } else {
              var5 = var5 + var4 + iw.field_D + ":";
              break L0;
            }
          }
          if (0 >= var4) {
            if (0 < var3) {
              var5 = var5 + var3 + htb.field_v;
              return var5;
            } else {
              var5 = var5 + var2 + scb.field_p;
              return var5;
            }
          } else {
            var5 = var5 + var3 + htb.field_v;
            return var5;
          }
        } else {
          return (String) null;
        }
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
            si.a(128, 62, param0[0].a(28));
            if (param1 < -119) {
              stackIn_4_0 = new nc("void");
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

            stackIn_7_1 = new StringBuilder().append("ph.A(");

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

    static {
        field_o = 0;
    }
}
