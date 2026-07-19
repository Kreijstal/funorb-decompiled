/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static int field_d;
    int field_c;
    static String field_e;
    static ee[] field_b;
    static String field_a;

    final static void a(byte param0) {
        if (param0 >= 121) {
          if (nb.field_b != null) {
            nb.field_b.h((byte) -126);
            rd.field_s = new ae();
            bj.field_f.a(rd.field_s, -24);
            return;
          } else {
            rd.field_s = new ae();
            bj.field_f.a(rd.field_s, -24);
            return;
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 > -47) {
            return;
        }
        field_e = null;
    }

    final static boolean b(byte param0) {
        if (param0 < -8) {
          L0: {
            if ((qh.field_d ^ -1) != 0) {
              break L0;
            } else {
              if (vc.a(-127, 1)) {
                qh.field_d = mk.field_j.a(-16384);
                mk.field_j.field_k = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
          if ((qh.field_d ^ -1) == 1) {
            if (!vc.a(-104, 2)) {
              return false;
            } else {
              qh.field_d = mk.field_j.i(-25578);
              mk.field_j.field_k = 0;
              return vc.a(-122, qh.field_d);
            }
          } else {
            return vc.a(-122, qh.field_d);
          }
        } else {
          L1: {
            cm.c((byte) 60);
            if ((qh.field_d ^ -1) != 0) {
              break L1;
            } else {
              if (vc.a(-127, 1)) {
                qh.field_d = mk.field_j.a(-16384);
                mk.field_j.field_k = 0;
                break L1;
              } else {
                return false;
              }
            }
          }
          if ((qh.field_d ^ -1) == 1) {
            if (!vc.a(-104, 2)) {
              return false;
            } else {
              qh.field_d = mk.field_j.i(-25578);
              mk.field_j.field_k = 0;
              return vc.a(-122, qh.field_d);
            }
          } else {
            return vc.a(-122, qh.field_d);
          }
        }
    }

    cm(int param0) {
        this.field_c = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0) {
        if (param0 > -116) {
            field_a = (String) null;
            return nf.field_c;
        }
        return nf.field_c;
    }

    static {
        field_e = "    Ground level";
        field_a = "Right click to return to move mode";
    }
}
