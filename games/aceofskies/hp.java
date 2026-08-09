/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends eq {
    static al[] field_i;
    static java.math.BigInteger field_j;
    static int field_h;

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -110) {
                break L1;
              } else {
                field_j = (java.math.BigInteger) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("hp.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
