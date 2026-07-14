/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class seb extends rqa {
    static int field_o;
    static String field_p;

    final static boolean a(String param0, String param1, int param2) {
        if (ws.a((byte) 122, param1)) {
          return false;
        } else {
          if (!mea.a(121, param1)) {
            if (hcb.a(param1, 15)) {
              return false;
            } else {
              if (0 == param0.length()) {
                return true;
              } else {
                if (param2 < -25) {
                  if (!qnb.a(param1, -1, param0)) {
                    if (!njb.a(param0, 95, param1)) {
                      if (!wg.a(param1, param0, true)) {
                        return true;
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
                  return true;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            seb.b(false);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static int a(int param0) {
        if (param0 != 27546) {
            field_o = 127;
            return 62;
        }
        return 62;
    }

    final static void b(int param0, int param1, int param2, int param3) {
        ss.field_p.field_e = 0;
        ss.field_p.c(0, 12);
        ss.field_p.d(jeb.field_b.nextInt(), 332614536);
        ss.field_p.d(jeb.field_b.nextInt(), 332614536);
        ss.field_p.c(param0, param1);
        ss.field_p.c(0, param2);
        ss.field_p.a(param3, true);
        ss.field_p.a(jnb.field_p, bib.field_g, param0 + 16711680);
        dpa.field_p.h(param0 ^ 24335, 18);
        dpa.field_p.field_e = dpa.field_p.field_e + 1;
        int var4 = dpa.field_p.field_e + 1;
        dpa.field_p.a(0, ss.field_p.field_h, -1, ss.field_p.field_e);
        dpa.field_p.e(-var4 + dpa.field_p.field_e, -129);
    }

    seb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = -103;
          si.a(61, 62, param0[0].a(38));
          return new nc((Object) (Object) "void");
        } else {
          si.a(61, 62, param0[0].a(38));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Right wing";
        field_o = 0;
    }
}
