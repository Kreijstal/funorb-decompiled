/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ta {
    static int field_l;
    static String[] field_o;
    static mk field_k;
    static int field_n;
    static uj field_m;
    private ta field_p;

    gj() {
        super((pb) (Object) new ul());
        ((gj) this).field_p = (ta) (Object) new ql();
    }

    final l b(boolean param0) {
        if (param0) {
            return null;
        }
        return (l) (Object) new o(60, (l) (Object) ((gj) this).field_p);
    }

    public static void d(int param0) {
        field_k = null;
        field_o = null;
        if (param0 != 19) {
            gj.d(-48);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final int c(int param0) {
        if (param0 == -1) {
          if (19 != ((gj) this).field_p.field_g) {
            lc.a(-1);
            ((gj) this).field_g = ((gj) this).field_g - 1;
            ((gj) this).field_p.field_g = ((gj) this).field_p.field_g - 1;
            return 4;
          } else {
            ((gj) this).field_p = ((gj) this).field_p.d((byte) -120);
            return ((gj) this).field_p.field_e.a((byte) -102, false);
          }
        } else {
          field_o = null;
          if (19 != ((gj) this).field_p.field_g) {
            lc.a(-1);
            ((gj) this).field_g = ((gj) this).field_g - 1;
            ((gj) this).field_p.field_g = ((gj) this).field_p.field_g - 1;
            return 4;
          } else {
            ((gj) this).field_p = ((gj) this).field_p.d((byte) -120);
            return ((gj) this).field_p.field_e.a((byte) -102, false);
          }
        }
    }

    static {
    }
}
