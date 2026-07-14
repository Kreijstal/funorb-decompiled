/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends rqa {
    static llb field_q;
    static int field_o;
    static String field_p;

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param0 == 11) {
          if (param5 == param1) {
            fl.a(param6, param7, param2, param5, param0 + 1512, param4, param3);
            return;
          } else {
            if (ob.field_j <= -param5 + param6) {
              if (param6 - -param5 <= mt.field_o) {
                if (-param1 + param7 >= lua.field_c) {
                  if (hab.field_i < param1 + param7) {
                    vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
                    return;
                  } else {
                    sab.a(param2, param1, param5, param7, param6, param3, param4, 21601);
                    return;
                  }
                } else {
                  vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
                  return;
                }
              } else {
                vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
                return;
              }
            } else {
              vbb.a(2051507073, param4, param7, param3, param2, param5, param6, param1);
              return;
            }
          }
        } else {
          return;
        }
    }

    nt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = null;
          return new nc((Object) (Object) frb.a(3, 77));
        } else {
          return new nc((Object) (Object) frb.a(3, 77));
        }
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 2) {
            field_p = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 2;
        field_p = "Try again";
    }
}
