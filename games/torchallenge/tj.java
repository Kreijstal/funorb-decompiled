/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int[] field_c;
    static int field_b;
    static sl field_e;
    static ll field_d;
    static int[] field_a;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var4Lifetime1;
        int var4Lifetime1Lifetime1;
        ub.field_e.g(param3, param2);
        if (param1 != 5106) {
          tj.a(false, 10, 113, 16);
          if (!param0) {
            return;
          }
          var4 = 2 * (ub.field_h % ub.field_e.field_u);
          if (var4 >= ub.field_e.field_u) {
            var4 = ub.field_e.field_u - var4 + ub.field_e.field_u;
          }
          if (var4 < 10) {
            var4 = 10;
          } else {
            if (-40 + ub.field_e.field_u < var4) {
              var4 = ub.field_e.field_u - 40;
            }
          }
          vg.a(80, var4, ub.field_e, param3, param2, 0, 30, 0, 65);
          return;
        }
        if (param0) {
          var4Lifetime1 = 2 * (ub.field_h % ub.field_e.field_u);
          if (var4Lifetime1 >= ub.field_e.field_u) {
            var4Lifetime1 = ub.field_e.field_u - var4Lifetime1 + ub.field_e.field_u;
          }
          if (var4Lifetime1 < 10) {
            var4Lifetime1 = 10;
            vg.a(80, var4Lifetime1, ub.field_e, param3, param2, 0, 30, 0, 65);
            return;
          }
          if (-40 + ub.field_e.field_u >= var4Lifetime1) {
            vg.a(80, var4Lifetime1, ub.field_e, param3, param2, 0, 30, 0, 65);
            return;
          }
          var4Lifetime1Lifetime1 = ub.field_e.field_u - 40;
          vg.a(80, var4Lifetime1Lifetime1, ub.field_e, param3, param2, 0, 30, 0, 65);
        }
    }

    public static void a(int param0) {
        if (param0 >= 113) {
          field_a = null;
          field_e = null;
          field_c = null;
          field_d = null;
          return;
        }
        field_e = (sl) null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    static {
        field_c = new int[]{13, 11};
        field_e = new sl();
        field_d = new ll();
        field_a = new int[8192];
    }
}
