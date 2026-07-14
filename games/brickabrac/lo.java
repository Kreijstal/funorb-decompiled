/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String[] field_c;
    static int[] field_b;
    static int[] field_a;
    static boolean field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 < 13) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, j param7) {
        String var8 = null;
        String stackIn_9_0 = null;
        String stackOut_8_0;
        String stackOut_7_0;
        L0: {
          var8 = null;
          if (-1 == (param7.field_V ^ -1)) {
            break L0;
          } else {
            if (1 != param4) {
              L1: {
                if ((param7.field_V ^ -1) > -1) {
                  stackOut_8_0 = Integer.toString(param7.field_V);
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = rd.a(hh.field_e, new String[1], (byte) 103);
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              var8 = (String) (Object) stackIn_9_0;
              ce.field_e.b(var8, param3 + param0 / (param4 * 2), 60 / param4 + (param5 + (param6 / (param4 * 2) - -ce.field_e.field_F)), 2, -1, param1);
              break L0;
            } else {
              if (param2 == 60) {
                return;
              } else {
                lo.a((byte) 126);
                return;
              }
            }
          }
        }
        if (param2 != 60) {
          lo.a((byte) 126);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"levels_icons"};
        field_a = new int[]{7, 38};
        field_b = new int[128];
    }
}
