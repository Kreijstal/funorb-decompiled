/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wob extends rqa {
    static int field_p;
    static int field_o;

    wob(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 1) {
            return -53;
        }
        return param3 + param0 * (-param3 + param1) / param4;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            var3_int = param2;
            L1: while (true) {
              if ((param1 ^ -1) >= -2) {
                if (-2 == (param1 ^ -1)) {
                  stackIn_11_0 = var3_int * param0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackIn_13_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L2: {
                  if (-1 == (param1 & 1 ^ -1)) {
                    break L2;
                  } else {
                    var3_int = var3_int * param0;
                    break L2;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "wob.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            if (param1 != -18209) {
                wob.a(91, -87, 12, -41, -105);
            }
            wva.a(param0, (byte) 56, "");
            kr.a(param0, param1 ^ -20973);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "wob.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
            si.a(203, 62, param0[0].a(37));
            if (param1 <= -119) {
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

            stackIn_7_1 = new StringBuilder().append("wob.A(");

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
        field_p = -1;
        field_o = 500;
    }
}
