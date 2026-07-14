/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends rqa {
    static int field_q;
    static ij field_p;
    static phb field_o;
    static int field_r;

    public static void b(boolean param0) {
        field_o = null;
        field_p = null;
        if (param0) {
            field_p = null;
        }
    }

    final static String a(int param0) {
        if (param0 != 27158) {
            cg.b(false);
            return wg.field_p;
        }
        return wg.field_p;
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 < -63) {
          if (!pla.a(param1, -4)) {
            if (13 == param1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_p = null;
          if (pla.a(param1, -4)) {
            return true;
          } else {
            L0: {
              if (13 != param1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_q = 1;
            return new nc(ak.field_o);
        }
        return new nc(ak.field_o);
    }

    cg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 0;
        field_p = new ij();
        field_r = 5;
    }
}
