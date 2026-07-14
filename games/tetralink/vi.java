/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int field_d;
    static String field_b;
    static int field_c;
    static qe field_a;

    final static String a(int param0) {
        if (2 <= vd.field_a) {
          if (d.field_i != null) {
            if (!d.field_i.c(param0 ^ -31281)) {
              return eg.field_N;
            } else {
              return nj.field_e;
            }
          } else {
            if (!rm.field_i.c(param0 ^ -31275)) {
              return qa.field_C;
            } else {
              if (rm.field_i.a("commonui", (byte) -106)) {
                if (param0 == -31307) {
                  if (!ib.field_a.c(113)) {
                    return nd.field_Kb;
                  } else {
                    if (ib.field_a.a("commonui", (byte) -119)) {
                      if (!q.field_b.c(param0 ^ -31270)) {
                        return fl.field_a;
                      } else {
                        if (!q.field_b.a(false)) {
                          return v.field_w + " - " + q.field_b.b(22300) + "%";
                        } else {
                          return dg.field_m;
                        }
                      }
                    } else {
                      return hh.field_a + " - " + ib.field_a.a("commonui", true) + "%";
                    }
                  }
                } else {
                  field_b = null;
                  if (!ib.field_a.c(113)) {
                    return nd.field_Kb;
                  } else {
                    if (ib.field_a.a("commonui", (byte) -119)) {
                      if (!q.field_b.c(param0 ^ -31270)) {
                        return fl.field_a;
                      } else {
                        if (!q.field_b.a(false)) {
                          return v.field_w + " - " + q.field_b.b(22300) + "%";
                        } else {
                          return dg.field_m;
                        }
                      }
                    } else {
                      return hh.field_a + " - " + ib.field_a.a("commonui", true) + "%";
                    }
                  }
                }
              } else {
                return nc.field_c + " - " + rm.field_i.a("commonui", true) + "%";
              }
            }
          }
        } else {
          return pb.field_b;
        }
    }

    public static void b(int param0) {
        if (param0 < 12) {
            field_a = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_b = "Show players in <%0>'s game";
        field_a = new qe();
    }
}
