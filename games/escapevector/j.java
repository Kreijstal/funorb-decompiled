/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        int var1 = 26 % ((65 - param0) / 59);
    }

    final static void a(String[] args, String param1, byte param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var5 = EscapeVector.field_A;
        dn.field_q = ia.field_y;
        if (-256 == (param3 ^ -1)) {
          L0: {
            if (13 <= gf.field_a) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_16_0 = 1;
              stackIn_18_0 = stackOut_16_0;
              break L0;
            }
          }
          nf.field_y = fc.a(stackIn_18_0 != 0, (byte) -82);
          if (param2 != -72) {
            var6 = null;
            j.a((String[]) null, (String) null, (byte) -30, 62);
            return;
          } else {
            return;
          }
        } else {
          if ((param3 ^ -1) > -101) {
            nf.field_y = bm.a(param1, param3, 4);
            if (param2 == -72) {
              return;
            } else {
              var6 = null;
              j.a((String[]) null, (String) null, (byte) -30, 62);
              return;
            }
          } else {
            if (105 < param3) {
              nf.field_y = bm.a(param1, param3, 4);
              if (param2 != -72) {
                var6 = null;
                j.a((String[]) null, (String) null, (byte) -30, 62);
                return;
              } else {
                return;
              }
            } else {
              nf.field_y = rg.a(args, (byte) -103);
              if (param2 == -72) {
                return;
              } else {
                var6 = null;
                j.a((String[]) null, (String) null, (byte) -30, 62);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Creating your account";
    }
}
