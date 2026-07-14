/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga {
    static faa field_b;
    static long field_a;

    final static void a(String param0, int param1, byte param2, String[] param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = VoidHunters.field_G;
        if (param2 > 34) {
          lrb.field_b = gka.field_o;
          if (param1 != 255) {
            if (-101 <= param1) {
              if ((param1 ^ -1) >= -106) {
                var8 = param3;
                mfb.a(var8, 11113);
                jra.field_a = wm.a(param3, (byte) -123);
                return;
              } else {
                jra.field_a = tma.a(param1, param0, (byte) -124);
                return;
              }
            } else {
              jra.field_a = tma.a(param1, param0, (byte) -124);
              return;
            }
          } else {
            L0: {
              if (-14 >= iua.field_p) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            jra.field_a = rv.a(stackIn_16_0 != 0, 1);
            var6 = null;
            mfb.a((String[]) null, 11113);
            return;
          }
        } else {
          field_a = -92L;
          lrb.field_b = gka.field_o;
          if (param1 != 255) {
            if (-101 <= param1) {
              if ((param1 ^ -1) >= -106) {
                var7 = param3;
                mfb.a(var7, 11113);
                jra.field_a = wm.a(param3, (byte) -123);
                return;
              } else {
                jra.field_a = tma.a(param1, param0, (byte) -124);
                return;
              }
            } else {
              jra.field_a = tma.a(param1, param0, (byte) -124);
              return;
            }
          } else {
            L1: {
              if (-14 >= iua.field_p) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            jra.field_a = rv.a(stackIn_5_0 != 0, 1);
            var6 = null;
            mfb.a((String[]) null, 11113);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 94 / ((param0 - 55) / 45);
    }

    static {
    }
}
