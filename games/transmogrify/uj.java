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
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Transmogrify.field_A ? 1 : 0;
        ti[] var1 = new ti[ih.field_b];
        for (var2 = 0; ih.field_b > var2; var2++) {
          var3 = ql.field_b[var2] * wk.field_b[var2];
          var4 = re.field_K[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = rg.field_D[vg.c((int) var4[var6], 255)];
          }
          var1[var2] = new ti(pj.field_y, ll.field_U, gj.field_j[var2], re.field_a[var2], ql.field_b[var2], wk.field_b[var2], var5);
        }
        wd.d(-9);
        if (param0 == 31151) {
          return var1;
        }
        field_e = (ti) null;
        return var1;
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 == -1) {
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
        field_e = (ti) null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    uj(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_i = -1;
        field_c = new qj();
    }
}
