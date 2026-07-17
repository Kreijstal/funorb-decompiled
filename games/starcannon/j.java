/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static s field_d;
    static int[] field_b;
    static hl[] field_c;
    static vc field_a;
    static int field_e;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static String b(int param0) {
        if (rk.field_d >= 2) {
          if (null == kl.field_b) {
            if (!bf.field_y.b((byte) 110)) {
              return n.field_f;
            } else {
              if (bf.field_y.a("commonui", -9883)) {
                if (!fk.field_k.b((byte) 106)) {
                  return s.field_g;
                } else {
                  if (fk.field_k.a("commonui", -9883)) {
                    if (!li.field_b.b((byte) 105)) {
                      return q.field_i;
                    } else {
                      if (param0 <= -125) {
                        if (!li.field_b.a(29741)) {
                          return gj.field_b + " - " + li.field_b.a((byte) 116) + "%";
                        } else {
                          return ba.field_a;
                        }
                      } else {
                        String discarded$1 = j.b(69);
                        if (!li.field_b.a(29741)) {
                          return gj.field_b + " - " + li.field_b.a((byte) 116) + "%";
                        } else {
                          return ba.field_a;
                        }
                      }
                    }
                  } else {
                    return sj.field_D + " - " + fk.field_k.a("commonui", (byte) 116) + "%";
                  }
                }
              } else {
                return ae.field_a + " - " + bf.field_y.a("commonui", (byte) 98) + "%";
              }
            }
          } else {
            if (!kl.field_b.b((byte) 125)) {
              return lb.field_L;
            } else {
              return b.field_e;
            }
          }
        } else {
          return pf.field_c;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new s(3);
        field_b = new int[4];
    }
}
