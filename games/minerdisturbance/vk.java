/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    int field_c;
    static int field_a;
    int field_b;
    static ea[] field_e;
    static ed field_g;
    static String field_d;
    int field_h;
    int field_f;

    final static void a(boolean param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) ((Object) var2);
                if (-1L != (ah.a(-97, var3) ^ -1L)) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      field_g = (ed) null;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("vk.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = MinerDisturbance.field_ab;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (16760123 & param1) >> 1969188272;
        int var5 = (param1 & 65356) >> -1244788696;
        int var6 = param1 & 255;
        int var7 = (param0 & 16713763) >> 1598666416;
        int var8 = 255 & param0 >> -1113870872;
        int var9 = param0 & 255;
        if (param2 != 105) {
            vk.a(114);
        }
        for (var10 = 0; var10 < 256; var10++) {
            var11 = -var10 + 256;
            var13[var10] = ((var10 * var5 >> -382591704) + (var8 * var11 >> 269155784) << -2114810712) + ((var10 * var4 >> -739619256) + (var11 * var7 >> -1645797528) << 266930096) - (-(var11 * var9 >> -1585132504) + -(var6 * var10 >> 1024688968));
        }
        return var3;
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_d = null;
        if (param0 <= 5) {
            vk.a(-78);
        }
    }

    static {
        field_d = "Played with Science";
    }
}
