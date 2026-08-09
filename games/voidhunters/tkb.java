/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tkb extends rqa {
    static int field_p;
    static String field_o;

    final static void a(ml param0, int param1) {
        ml var4 = null;
        ml var3 = null;
        try {
            param0.a(1, 1, new ml(13));
            param0.a(1, 3, new ml(13));
            param0.a(1, 23, new ml(13));
            param0.a(1, 25, new ml(13));
            param0.a(1, 11, new ml(15));
            param0.a(1, 15, new ml(15));
            param0.a(1, 10, new ml(42));
            param0.a(1, 13, new ml(42));
            param0.a(1, 16, new ml(42));
            var4 = new ml(31);
            var4.a(1, 1, new ml(13));
            var4.a(1, 2, new ml(13));
            var4.a(1, 3, new ml(13));
            var4.a(1, 0, new ml(15));
            param0.a(1, 7, var4);
            int var2_int = 13 % ((param1 - 61) / 42);
            var3 = new ml(31);
            var3.a(1, 0, new ml(13));
            var3.a(1, 2, new ml(13));
            var3.a(1, 3, new ml(13));
            var3.a(1, 1, new ml(15));
            param0.a(1, 19, var3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tkb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 3) {
            ml var2 = (ml) null;
            tkb.a((ml) null, 113);
        }
    }

    tkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
              stackIn_4_0 = new nc(frb.a(206, 122));
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

            stackIn_7_1 = new StringBuilder().append("tkb.A(");

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
        field_p = 1;
    }
}
