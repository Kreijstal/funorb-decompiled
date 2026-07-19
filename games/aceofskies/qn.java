/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    static java.awt.Image field_d;
    static ob field_c;
    static st field_a;
    static tp field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -119 % ((param0 - -44) / 62);
        field_d = null;
        field_c = null;
    }

    final static String b(int param0) {
        if (2 <= bl.field_c) {
          if (ij.field_h != null) {
            if (!ij.field_h.b((byte) 94)) {
              return gm.field_w;
            } else {
              return dt.field_b;
            }
          } else {
            if (!oi.field_a.b((byte) 86)) {
              return co.field_j;
            } else {
              if (!oi.field_a.c("commonui", -14012)) {
                return lm.field_b + " - " + oi.field_a.a("commonui", (byte) -79) + "%";
              } else {
                if (!uj.field_b.b((byte) -21)) {
                  return bk.field_g;
                } else {
                  if (!uj.field_b.c("commonui", -14012)) {
                    return ks.field_c + " - " + uj.field_b.a("commonui", (byte) -79) + "%";
                  } else {
                    if (cf.field_f.b((byte) 106)) {
                      if (param0 < -88) {
                        if (!cf.field_f.b(0)) {
                          return bo.field_g + " - " + cf.field_f.a(-82) + "%";
                        } else {
                          return jr.field_r;
                        }
                      } else {
                        qn.a(82);
                        if (!cf.field_f.b(0)) {
                          return bo.field_g + " - " + cf.field_f.a(-82) + "%";
                        } else {
                          return jr.field_r;
                        }
                      }
                    } else {
                      return bd.field_I;
                    }
                  }
                }
              }
            }
          }
        } else {
          return ji.field_a;
        }
    }

    static {
        field_a = new st();
    }
}
