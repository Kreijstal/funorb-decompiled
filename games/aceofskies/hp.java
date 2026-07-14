/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends eq {
    static al[] field_i;
    static java.math.BigInteger field_j;
    static int field_h;

    final static void a(byte param0, String param1) {
        if (param0 >= -110) {
            field_j = (java.math.BigInteger) null;
        }
    }

    final void a(byte param0) {
        int var2 = -21 / ((param0 - 63) / 61);
    }

    public static void c(byte param0) {
        field_i = null;
        field_j = null;
        int var1 = -45 % ((param0 - 2) / 40);
    }

    final boolean e(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 0) {
          if (((hp) this).field_g.field_A) {
            if (!((hp) this).field_g.field_lc) {
              return false;
            } else {
              L0: {
                if (!((hp) this).field_g.field_J) {
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
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    hp(wl param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new java.math.BigInteger("65537");
        field_h = 0;
    }
}
