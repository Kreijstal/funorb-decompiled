/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static ci field_d;
    static vn field_i;
    static int field_h;
    static int field_j;
    static vn[] field_c;
    static dh field_f;
    static int field_g;
    static vn[] field_a;
    static String[] field_e;
    static la field_b;

    final static sn[] b(int param0) {
        if (param0 == 31114) {
          return new sn[]{em.field_J, wn.field_a, u.field_e};
        }
        return (sn[]) null;
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var3 = ZombieDawn.field_J;
        if (be.field_j <= 0) {
          if (po.w(13296)) {
            var2 = 0;
            if (param1) {
              field_g = 58;
            }
            if (rn.field_b == null) {
              if (!em.field_H) {
                return;
              }
              ti.a(var2, 113, param0);
            }
            return;
          }
          var2Lifetime3 = 1;
          if (param1) {
            field_g = 58;
          }
          if (rn.field_b == null) {
            if (!em.field_H) {
              return;
            }
            ti.a(var2Lifetime3, 113, param0);
          }
          return;
        }
        if (null == rn.field_b) {
          field_b = nf.a(480, 640, vh.field_a, 0, param1, 0);
          if (null == field_b) {
            var2Lifetime1 = 3;
          } else {
            se.a(20922, field_b);
            var2Lifetime1 = 2;
          }
          if (param1) {
            field_g = 58;
          }
          if (rn.field_b != null) {
            return;
          }
          if (em.field_H) {
            ti.a(var2Lifetime1, 113, param0);
          }
          return;
        }
        field_b = rn.field_b.a(true);
        p.b(2, 27102);
        if (null == field_b) {
          var2Lifetime2 = 3;
        } else {
          se.a(20922, field_b);
          var2Lifetime2 = 2;
        }
        if (param1) {
          field_g = 58;
        }
        if (rn.field_b != null) {
          return;
        }
        if (!em.field_H) {
          return;
        }
        ti.a(var2Lifetime2, 113, param0);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
        field_i = null;
        field_d = null;
        if (param0 < 54) {
          cn.a((byte) -37);
        }
    }

    final static void a(byte param0) {
        ic.field_U = false;
        if (param0 <= 40) {
          return;
        }
        pn.field_R = null;
        hl.field_b = null;
        bp.field_a = null;
        dl.field_h = null;
    }

    static {
        field_d = new ci();
        field_g = 1;
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
