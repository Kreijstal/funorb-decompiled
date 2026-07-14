/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ob {
    static nl field_L;
    static String field_H;
    static int[] field_J;
    static dd[] field_K;
    static int field_I;

    og(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    public static void f(byte param0) {
        if (param0 >= -85) {
          og.f((byte) -111);
          field_K = null;
          field_L = null;
          field_J = null;
          field_H = null;
          return;
        } else {
          field_K = null;
          field_L = null;
          field_J = null;
          field_H = null;
          return;
        }
    }

    final static void a(java.awt.Frame param0, sj param1, int param2) {
        le var3 = null;
        Object var4 = null;
        if (param2 == 24442) {
          L0: while (true) {
            var3 = param1.a(param0, false);
            L1: while (true) {
              if (-1 != var3.field_f) {
                if (-2 == var3.field_f) {
                  param0.setVisible(false);
                  param0.dispose();
                  return;
                } else {
                  cf.a(-96, 100L);
                  continue L0;
                }
              } else {
                cf.a(-108, 10L);
                continue L1;
              }
            }
          }
        } else {
          var4 = null;
          og.a((java.awt.Frame) null, (sj) null, 107);
          L2: while (true) {
            var3 = param1.a(param0, false);
            L3: while (true) {
              if (-1 != var3.field_f) {
                if (-2 == var3.field_f) {
                  param0.setVisible(false);
                  param0.dispose();
                  return;
                } else {
                  cf.a(-96, 100L);
                  continue L2;
                }
              } else {
                cf.a(-108, 10L);
                continue L3;
              }
            }
          }
        }
    }

    final int b(byte param0, int param1) {
        if (param0 == 6) {
          if (((og) this).field_h.length + -1 <= param1) {
            return ((og) this).field_x + param1 * ((og) this).field_s;
          } else {
            return ((og) this).field_x + param1 * (-8 + ((og) this).field_s);
          }
        } else {
          field_H = null;
          if (((og) this).field_h.length + -1 <= param1) {
            return ((og) this).field_x + param1 * ((og) this).field_s;
          } else {
            return ((og) this).field_x + param1 * (-8 + ((og) this).field_s);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Offer unrated rematch";
        field_J = new int[]{62, 20, 21, 49, 5, 3, 61};
        field_L = new nl();
    }
}
