/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static boolean field_b;
    static String field_c;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ii[] a(byte param0) {
        ii[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        var1 = new ii[ih.field_b];
        var2 = 0;
        L0: while (true) {
          if (ih.field_b <= var2) {
            if (param0 <= 96) {
              field_c = null;
              wd.d(121);
              return var1;
            } else {
              wd.d(121);
              return var1;
            }
          } else {
            var1[var2] = new ii(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], re.field_K[var2], rg.field_D);
            var2++;
            continue L0;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -74) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Continue";
    }
}
