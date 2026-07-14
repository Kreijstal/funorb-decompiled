/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ahb extends rqa {
    static ij field_o;
    static int field_p;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            field_o = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          si.a(139, 62, param0[0].a(54));
          return new nc((Object) (Object) "void");
        } else {
          si.a(139, 62, param0[0].a(54));
          return new nc((Object) (Object) "void");
        }
    }

    final static boolean a(rsb param0, byte param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 < -3) {
          if (-1 != qmb.field_p) {
            if (param0.field_e.e(8) == -1) {
              if (-2 < param0.field_c.length) {
                if ((param0.a(-5358) ^ -1) < -2) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_p = -63;
          if (-1 != (qmb.field_p ^ -1)) {
            if (param0.field_e.e(8) == -1) {
              if (-2 < param0.field_c.length) {
                if (param0.a(-5358) < -2) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    ahb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ij();
    }
}
