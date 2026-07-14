/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends pm {
    static int field_k;
    static String field_i;
    static int field_h;
    static rh field_g;
    static int field_f;
    static String field_j;

    mc(tb param0) {
        super(param0);
    }

    final rh a(String param0, int param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 == 2) {
          L0: {
            if (la.a(param0, (byte) -103) != null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          var3 = stackIn_5_0;
          if (var3 == 0) {
            return uc.field_b;
          } else {
            return field_g;
          }
        } else {
          return null;
        }
    }

    final static boolean a(String param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param1) {
          L0: {
            field_g = null;
            if (null == hg.a(120, param0)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == hg.a(120, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void e(byte param0) {
        if (param0 > -3) {
          mc.e((byte) 2);
          field_g = null;
          field_i = null;
          field_j = null;
          return;
        } else {
          field_g = null;
          field_i = null;
          field_j = null;
          return;
        }
    }

    final String a(String param0, byte param1) {
        if (((mc) this).a(param0, 2) == uc.field_b) {
            return ge.field_d;
        }
        if (param1 >= -94) {
            return null;
        }
        return sd.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_h = 0;
        field_j = "UK Expansion Installed";
        field_g = new rh();
    }
}
