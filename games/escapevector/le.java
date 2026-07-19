/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static om field_a;
    static String field_b;
    static long field_c;

    public static void a(int param0) {
        if (param0 < 40) {
            field_b = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static String b(int param0) {
        if ((fc.field_a ^ -1) > -3) {
          return ee.field_a;
        } else {
          if (nk.field_p == null) {
            if (!ii.field_a.b(0)) {
              return ah.field_l;
            } else {
              if (!ii.field_a.a(0, "commonui")) {
                return sm.field_d + " - " + ii.field_a.a("commonui", 0) + "%";
              } else {
                if (!w.field_ab.b(0)) {
                  return c.field_o;
                } else {
                  if (!w.field_ab.a(0, "commonui")) {
                    return qf.field_h + " - " + w.field_ab.a("commonui", param0 ^ 1) + "%";
                  } else {
                    if (param0 == 1) {
                      if (pl.field_j.b(0)) {
                        if (!pl.field_j.a((byte) -119)) {
                          return wf.field_b + " - " + pl.field_j.a(-67) + "%";
                        } else {
                          return field_b;
                        }
                      } else {
                        return ff.field_a;
                      }
                    } else {
                      field_a = (om) null;
                      if (pl.field_j.b(0)) {
                        if (!pl.field_j.a((byte) -119)) {
                          return wf.field_b + " - " + pl.field_j.a(-67) + "%";
                        } else {
                          return field_b;
                        }
                      } else {
                        return ff.field_a;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (!nk.field_p.b(0)) {
              return md.field_H;
            } else {
              return gj.field_g;
            }
          }
        }
    }

    static {
        field_a = new om(12, 0, 1, 0);
        field_b = "Please wait...";
    }
}
