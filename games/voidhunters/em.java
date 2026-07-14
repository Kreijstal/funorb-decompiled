/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends rqa {
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = true;
          si.a(11, 62, param0[0].a(120));
          return new nc((Object) (Object) "void");
        } else {
          si.a(11, 62, param0[0].a(120));
          return new nc((Object) (Object) "void");
        }
    }

    em(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 == 5220) {
          if (param4 >= param5) {
            if (param1 >= param4) {
              if (param2 >= param6) {
                if (param2 > param3) {
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
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
        fob discarded$0 = new fob();
    }
}
