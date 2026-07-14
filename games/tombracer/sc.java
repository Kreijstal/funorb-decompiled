/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends cg {
    private cg field_j;
    private int field_l;
    static int field_k;

    final void a(int param0) {
        if (((sc) this).field_l > param0) {
          ((sc) this).field_l = ((sc) this).field_l - param0;
          return;
        } else {
          param0 = param0 - ((sc) this).field_l;
          ((sc) this).field_j.field_a = ((sc) this).field_a;
          ((sc) this).field_l = 0;
          ((sc) this).field_j.field_e = ((sc) this).field_e;
          ((sc) this).field_e.field_a = (vg) (Object) ((sc) this).field_j;
          ((sc) this).field_a.field_e = (vg) (Object) ((sc) this).field_j;
          ((sc) this).field_e = null;
          ((sc) this).field_a = null;
          if (param0 > 0) {
            ((sc) this).field_j.a(param0);
            return;
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        if (param2 < ((sc) this).field_l) {
          ((sc) this).field_l = ((sc) this).field_l - param2;
          return;
        } else {
          L0: {
            param2 = param2 - ((sc) this).field_l;
            param1 = param1 + ((sc) this).field_l;
            ((sc) this).field_l = 0;
            ((sc) this).field_j.field_a = ((sc) this).field_a;
            ((sc) this).field_j.field_e = ((sc) this).field_e;
            ((sc) this).field_e.field_a = (vg) (Object) ((sc) this).field_j;
            ((sc) this).field_a.field_e = (vg) (Object) ((sc) this).field_j;
            ((sc) this).field_a = null;
            ((sc) this).field_e = null;
            if (param2 > 0) {
              ((sc) this).field_j.b(param0, param1, param2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final cg b() {
        return null;
    }

    final int d() {
        return ((sc) this).field_j.d();
    }

    final int a() {
        return 0;
    }

    sc(cg param0, int param1) {
        ((sc) this).field_j = param0;
        ((sc) this).field_l = param1;
        ((sc) this).field_i = ((sc) this).field_j.field_i;
    }

    final cg c() {
        return null;
    }

    static {
    }
}
