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
        int var4 = 0;
        L0: {
          ub.field_e.g(param3, param2);
          if (param1 == 5106) {
            break L0;
          } else {
            tj.a(false, 10, 113, 16);
            break L0;
          }
        }
        if (param0) {
          L1: {
            var4 = 2 * (ub.field_h % ub.field_e.field_u);
            if (var4 < ub.field_e.field_u) {
              break L1;
            } else {
              var4 = ub.field_e.field_u + -var4 + ub.field_e.field_u;
              break L1;
            }
          }
          if (var4 < 10) {
            var4 = 10;
            int discarded$8 = 65;
            int discarded$9 = 0;
            int discarded$10 = 30;
            int discarded$11 = 0;
            vg.a(80, var4, ub.field_e, param3, param2);
            return;
          } else {
            L2: {
              if (-40 + ub.field_e.field_u >= var4) {
                break L2;
              } else {
                var4 = ub.field_e.field_u + -40;
                break L2;
              }
            }
            int discarded$12 = 65;
            int discarded$13 = 0;
            int discarded$14 = 30;
            int discarded$15 = 0;
            vg.a(80, var4, ub.field_e, param3, param2);
            return;
          }
        } else {
          return;
        }
    }

    public static void a() {
        field_a = null;
        field_e = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{13, 11};
        field_e = new sl();
        field_d = new ll();
        field_a = new int[8192];
    }
}
