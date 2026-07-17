/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ci field_h;
    boolean field_a;
    static volatile int field_i;
    String[] field_j;
    String field_b;
    static ti field_e;
    static int[] field_d;
    boolean field_f;
    int field_g;
    static qj field_c;

    final static ti[] a(int param0) {
        ti[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        var1 = new ti[ih.field_b];
        var2 = 0;
        L0: while (true) {
          if (ih.field_b <= var2) {
            wd.d(-9);
            return var1;
          } else {
            var3 = ql.field_b[var2] * wk.field_b[var2];
            var4 = re.field_K[var2];
            var5 = new int[var3];
            var6 = 0;
            L1: while (true) {
              if (var3 <= var6) {
                var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var5);
                var2++;
                continue L0;
              } else {
                var5[var6] = rg.field_D[vg.c((int) var4[var6], 255)];
                var6++;
                continue L1;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    uj(boolean param0) {
        ((uj) this).field_f = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
        field_c = new qj();
    }
}
