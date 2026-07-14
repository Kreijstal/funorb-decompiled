/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends ve {
    static String field_p;
    static ri[] field_o;
    static int[] field_q;

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -8111) {
          if (((gq) this).field_m.field_xc) {
            if (!((gq) this).field_m.field_wb) {
              return false;
            } else {
              L0: {
                if (!((gq) this).field_m.field_Hb) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((gq) this).c(-104);
          if (((gq) this).field_m.field_xc) {
            if (!((gq) this).field_m.field_wb) {
              return false;
            } else {
              L1: {
                if (!((gq) this).field_m.field_Hb) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        if (param0 != 50) {
            field_p = null;
        }
    }

    public static void c(boolean param0) {
        field_q = null;
        field_p = null;
        field_o = null;
        if (param0) {
            gq.c(true);
        }
    }

    gq(fr param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "This entry doesn't match";
        field_q = new int[]{0, 50, 75, 75, 100, 150};
    }
}
