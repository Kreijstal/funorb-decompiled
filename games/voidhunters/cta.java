/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cta extends rqa {
    static String field_r;
    static ij field_q;
    static String field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        si.a(138, 62, param0[0].a(26));
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        if (param4 == -65) {
          if (param5 <= param3) {
            if (param5 + param1 > param3) {
              if (param0 <= param6) {
                if (param6 >= param0 + param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          cta.a(57);
          if (param5 <= param3) {
            if (param5 + param1 > param3) {
              if (param0 <= param6) {
                if (param6 >= param0 + param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    cta(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        field_p = null;
        field_r = null;
        if (param0 != 14675) {
            return;
        }
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "All games";
        field_r = "Destroy the enemy base";
    }
}
