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
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (ah.a(-97, var3) != 0L) {
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
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("vk.A(").append(true).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int[] a(int param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int var12 = MinerDisturbance.field_ab;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (16760123 & param1) >> 16;
        int var5 = (param1 & 65356) >> 8;
        int var6 = param1 & 255;
        int var7 = (param0 & 16713763) >> 16;
        int var8 = 255 & param0 >> 8;
        int var9 = param0 & 255;
        for (var10 = 0; var10 < 256; var10++) {
            var11 = -var10 + 256;
            var13[var10] = ((var10 * var5 >> 8) + (var8 * var11 >> 8) << 8) + ((var10 * var4 >> 8) + (var11 * var7 >> 8) << 16) - (-(var11 * var9 >> 8) + -(var6 * var10 >> 8));
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Played with Science";
    }
}
