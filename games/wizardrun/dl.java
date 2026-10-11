/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 11052) {
          dl.a(true);
        }
    }

    final static int a(boolean param0) {
        if (ri.field_a < 2) {
          return 0;
        }
        if (param0) {
          if (mh.field_tb == 0) {
            if (!ub.field_x.b(17820)) {
              return 20;
            }
            if (!ub.field_x.a((byte) 29, "commonui")) {
              return 40;
            }
            if (!vj.field_b.b(17820)) {
              return 50;
            }
            if (!vj.field_b.a((byte) 29, "commonui")) {
              return 60;
            }
            if (!cc.field_a.b(17820)) {
              return 70;
            }
            if (!cc.field_a.d(-64)) {
              return 80;
            }
            return 100;
          }
        } else {
          field_a = (int[]) null;
          if (mh.field_tb == 0) {
            if (!ub.field_x.b(17820)) {
              return 20;
            }
            if (!ub.field_x.a((byte) 29, "commonui")) {
              return 40;
            }
            if (!vj.field_b.b(17820)) {
              return 50;
            }
            if (!vj.field_b.a((byte) 29, "commonui")) {
              return 60;
            }
            if (!cc.field_a.b(17820)) {
              return 70;
            }
            if (cc.field_a.d(-64)) {
              return 100;
            }
            return 80;
          }
        }
        if (qh.field_c != null) {
          if (!qh.field_c.b(17820)) {
            return 14;
          }
          if (!qh.field_c.c(-1, "")) {
            return 29;
          }
          if (!qh.field_c.a((byte) 29, "")) {
            return 29;
          }
        }
        if (!ub.field_x.b(17820)) {
          return 43;
        }
        if (!ub.field_x.a((byte) 29, "commonui")) {
          return 57;
        }
        if (!vj.field_b.b(17820)) {
          return 71;
        }
        if (!vj.field_b.a((byte) 29, "commonui")) {
          return 80;
        }
        if (!cc.field_a.b(17820)) {
          return 82;
        }
        if (!cc.field_a.d(49)) {
          return 86;
        }
        return 100;
    }

    static {
        field_a = new int[8192];
    }
}
