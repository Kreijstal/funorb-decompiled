/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dua extends rqa {
    static khb field_p;
    static boolean field_o;

    final nc a(nc[] param0, int param1) {
        si.a(98, 62, param0[0].a(78));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void f(byte param0) {
        if (param0 < 88) {
            field_p = null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    dua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String e(byte param0) {
        if ((ef.field_z ^ -1) > -3) {
          return tdb.field_p;
        } else {
          if (ppb.field_a == null) {
            if (btb.field_b.b((byte) 115)) {
              if (!btb.field_b.a(32171, "commonui")) {
                return drb.field_k + " - " + btb.field_b.a("commonui", -2118) + "%";
              } else {
                if (dt.field_o.b((byte) 122)) {
                  if (dt.field_o.a(32171, "commonui")) {
                    if (param0 < -18) {
                      if (gdb.field_i.b((byte) -41)) {
                        if (!gdb.field_i.a(35)) {
                          return lwa.field_vb + " - " + gdb.field_i.b(-115) + "%";
                        } else {
                          return neb.field_p;
                        }
                      } else {
                        return ltb.field_q;
                      }
                    } else {
                      field_o = true;
                      if (gdb.field_i.b((byte) -41)) {
                        if (!gdb.field_i.a(35)) {
                          return lwa.field_vb + " - " + gdb.field_i.b(-115) + "%";
                        } else {
                          return neb.field_p;
                        }
                      } else {
                        return ltb.field_q;
                      }
                    }
                  } else {
                    return am.field_p + " - " + dt.field_o.a("commonui", -2118) + "%";
                  }
                } else {
                  return wqb.field_b;
                }
              }
            } else {
              return wea.field_o;
            }
          } else {
            if (!ppb.field_a.b((byte) -37)) {
              return ocb.field_i;
            } else {
              return lo.field_d;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new khb("");
    }
}
