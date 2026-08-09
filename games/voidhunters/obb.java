/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class obb extends rqa {
    static String[] field_o;

    public static void a(int param0) {
        if (param0 != 21942) {
            obb.a(7, -102, -66);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -18644) {
                break L1;
              } else {
                field_o = (String[]) null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (param0 <= 0) {
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = 1 & param2 | var3_int << 1288312641;
                param0--;
                param2 = param2 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "obb.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
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
            si.a(184, 62, param0[0].a(73));
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

            stackIn_7_1 = new StringBuilder().append("obb.A(");

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

    obb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
