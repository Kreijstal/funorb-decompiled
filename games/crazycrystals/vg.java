/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static sj field_a;
    static int[] field_b;
    static String field_c;

    final static void a(byte param0) {
        if (0 - lc.field_a != sn.field_c) {
          if (250 + -lc.field_a == sn.field_c) {
            if (param0 != -82) {
              return;
            } else {
              sn.field_c = sn.field_c + 1;
              return;
            }
          } else {
            if (param0 != -82) {
              return;
            } else {
              sn.field_c = sn.field_c + 1;
              return;
            }
          }
        } else {
          if (param0 != -82) {
            return;
          } else {
            sn.field_c = sn.field_c + 1;
            return;
          }
        }
    }

    final static String b(byte param0) {
        String discarded$3 = null;
        if (param0 != -29) {
            discarded$3 = vg.b((byte) 15);
            if (lc.field_c == l.field_b) {
                return ji.field_x;
            }
            if (l.field_b == sg.field_b) {
                return ne.field_h;
            }
            if (!(gk.field_e.b(-82))) {
                return ne.field_h;
            }
            return jd.field_G;
        }
        if (lc.field_c == l.field_b) {
            return ji.field_x;
        }
        if (l.field_b == sg.field_b) {
            return ne.field_h;
        }
        if (!(gk.field_e.b(-82))) {
            return ne.field_h;
        }
        return jd.field_G;
    }

    final static String c(byte param0) {
        int var2 = -3 / ((param0 - 52) / 52);
        String var1 = "";
        if (!(null == mk.field_b)) {
            var1 = mk.field_b.i(-1);
        }
        if (!(0 != var1.length())) {
            var1 = bm.b((byte) 89);
        }
        if (!(var1.length() != 0)) {
            var1 = ck.field_eb;
        }
        return var1;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 8877) {
            field_a = (sj) null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_b = new int[8192];
        field_a = new sj(12, 0, 1, 0);
        field_c = "Names can only contain letters, numbers, spaces and underscores";
    }
}
