/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends eq {
    static al[] field_i;
    static java.math.BigInteger field_j;
    static int field_h;

    final static void a(byte param0, String param1) {
        try {
            if (param0 >= -110) {
                field_j = (java.math.BigInteger) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "hp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        if (param0 == 0) {
          if (this.field_g.field_A) {
            if (!this.field_g.field_lc) {
              return false;
            } else {
              L0: {
                if (!this.field_g.field_J) {
                  stackIn_8_0 = 0;
                  break L0;
                } else {
                  stackIn_8_0 = 1;
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
        field_j = new java.math.BigInteger("65537");
        field_h = 0;
    }
}
