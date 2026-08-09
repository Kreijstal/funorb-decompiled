/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hlb extends rqa {
    static int field_p;
    static String field_o;

    final static int a(int param0, int param1) {
        int var2;
        if (param1 != 255) {
          hlb.a(75, 111);
          var2 = param0 + -50;
          return Math.min(255 * var2 / 50, 255);
        } else {
          var2 = param0 + -50;
          return Math.min(255 * var2 / 50, 255);
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
            if (param1 <= -119) {
              stackIn_4_0 = new nc(frb.a(58, 90));
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

            stackIn_7_1 = new StringBuilder().append("hlb.A(");

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

    final static void a(int param0, boolean param1, int param2, int param3) {
        if (param3 <= 44) {
          field_o = (String) null;
          qea.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
          return;
        } else {
          qea.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
          return;
        }
    }

    hlb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 66) {
            hlb.e((byte) 9);
        }
    }

    static {
        field_o = "Left wing";
        field_p = 256;
    }
}
