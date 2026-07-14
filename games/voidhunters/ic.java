/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(24, 109));
        } else {
          return new nc((Object) (Object) frb.a(24, 109));
        }
    }

    ic(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 < 114) {
            ic.a(4);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        if (param1 == -9307) {
          if (pma.field_o != 13) {
            if (-103 == (pma.field_o ^ -1)) {
              fkb.field_m.j(param1 ^ -25691);
              return true;
            } else {
              L0: {
                L1: {
                  if (null == fkb.field_m) {
                    break L1;
                  } else {
                    if (!fkb.field_m.a(param0, -122, param2)) {
                      break L1;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L0;
                    }
                  }
                }
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
              return stackIn_19_0 != 0;
            }
          } else {
            fj.b(18444);
            return true;
          }
        } else {
          boolean discarded$1 = ic.a(-44, 13, -90);
          if (pma.field_o != 13) {
            if (-103 != (pma.field_o ^ -1)) {
              if (null != fkb.field_m) {
                if (!fkb.field_m.a(param0, -122, param2)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              fkb.field_m.j(param1 ^ -25691);
              return true;
            }
          } else {
            fj.b(18444);
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Directional energy shield";
    }
}
