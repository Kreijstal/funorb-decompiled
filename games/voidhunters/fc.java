/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc extends rqa {
    static String field_o;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        var2 = 34 / ((param1 - -19) / 38);
        if (param0 > -4097) {
          L0: {
            if (-2049 > param0) {
              stackOut_7_0 = kra.field_a[-param0 + 2048];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -kra.field_a[-2048 + param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((param0 ^ -1) > -6145) {
              stackOut_3_0 = -kra.field_a[6144 - param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = kra.field_a[param0 - 6144];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_o = null;
            return new nc(hbb.field_z);
        }
        return new nc(hbb.field_z);
    }

    fc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        int var1 = 95 % ((param0 - -41) / 63);
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "No options available";
    }
}
