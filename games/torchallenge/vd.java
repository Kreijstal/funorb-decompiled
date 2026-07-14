/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int[] field_e;
    static ka[] field_d;
    static boolean[] field_c;
    static boolean field_b;
    static int field_f;
    static long field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        int var1 = 35 % ((param0 - 46) / 56);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TorChallenge.field_F ? 1 : 0;
        if (vj.field_d != null) {
          var1 = 0;
          L0: while (true) {
            if (vj.field_d.length > var1) {
              vj.field_d[var1] = null;
              var1++;
              continue L0;
            } else {
              if (param0 != 0) {
                int discarded$4 = vd.c(-60);
                vj.field_d = null;
                cg.field_g = null;
                return;
              } else {
                vj.field_d = null;
                cg.field_g = null;
                return;
              }
            }
          }
        } else {
          if (param0 != 0) {
            int discarded$5 = vd.c(-60);
            vj.field_d = null;
            cg.field_g = null;
            return;
          } else {
            vj.field_d = null;
            cg.field_g = null;
            return;
          }
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
            field_e = null;
            return cf.field_f;
        }
        return cf.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
        field_d = new ka[3];
        field_b = false;
        field_a = 0L;
    }
}
