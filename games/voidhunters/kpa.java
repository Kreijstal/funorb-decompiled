/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kpa extends rqa {
    static String field_o;

    kpa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param5 < ob.field_j) {
          qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
          if (param7 == 0) {
            return;
          } else {
            kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
            return;
          }
        } else {
          if (mt.field_o < param1) {
            qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
            if (param7 == 0) {
              return;
            } else {
              kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
              return;
            }
          } else {
            if (lua.field_c > param3) {
              qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
              if (param7 != 0) {
                kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
                return;
              } else {
                return;
              }
            } else {
              if (param6 <= hab.field_i) {
                ul.a(param3, param5, param2, param6, param4, param1, param7 + 7, param0);
                if (param7 != 0) {
                  kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
                  return;
                } else {
                  return;
                }
              } else {
                qdb.a(param1, param0, 0, param2, param5, param3, param4, param6);
                if (param7 != 0) {
                  kpa.a(-123, 19, -27, 40, -88, 106, 33, 78);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 146) {
            kpa.a(59);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          si.a(146, 62, param0[0].a(112));
          return new nc((Object) (Object) "void");
        } else {
          si.a(146, 62, param0[0].a(112));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        jja discarded$0 = new jja();
        field_o = "win";
    }
}
