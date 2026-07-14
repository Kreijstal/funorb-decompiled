/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu extends rqa {
    static jra field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            fu.e((byte) -53);
            return new nc(ew.field_o);
        }
        return new nc(ew.field_o);
    }

    final static boolean a(int param0) {
        if (param0 >= 43) {
          if (ef.field_z >= 20) {
            if (eu.a(true)) {
              if (-1 > (jl.field_p ^ -1)) {
                if (nua.b(true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_o = null;
          if (ef.field_z >= 20) {
            if (eu.a(true)) {
              if (-1 > (jl.field_p ^ -1)) {
                if (nua.b(true)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    fu(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 >= -121) {
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new jra();
    }
}
