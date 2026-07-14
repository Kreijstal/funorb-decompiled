/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends vg {
    static li field_u;
    static ej field_v;
    static int field_w;
    static String field_x;

    final static void a(int param0, String param1) {
        if (param0 != 7110) {
            Object var3 = null;
            il.a(-21, (String) null);
        }
    }

    il(int param0) {
        this(si.field_V, param0);
    }

    final String b(rj param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return la.a(124, '*', param0.field_m.length());
    }

    private il(bd param0, int param1) {
        super(param0, param1);
    }

    final static boolean e(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 32525) {
          if ((eg.field_d ^ -1) <= -11) {
            if (cg.field_a) {
              return false;
            } else {
              L0: {
                if (ih.b(12871)) {
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
          field_x = null;
          if ((eg.field_d ^ -1) <= -11) {
            if (cg.field_a) {
              return false;
            } else {
              L1: {
                if (ih.b(12871)) {
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

    public static void d(int param0) {
        if (param0 != -5758) {
          field_w = -104;
          field_x = null;
          field_u = null;
          field_v = null;
          return;
        } else {
          field_x = null;
          field_u = null;
          field_v = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new li(2, 4, 4, 0);
        field_x = "Quit";
    }
}
