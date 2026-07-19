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
        super(new ul());
        this.field_p = (ta) ((Object) new ql());
    }

    final l b(boolean param0) {
        if (param0) {
            return (l) null;
        }
        return (l) ((Object) new o(60, this.field_p));
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
          if (19 != this.field_p.field_g) {
            lc.a(-1);
            this.field_g = this.field_g - 1;
            this.field_p.field_g = this.field_p.field_g - 1;
            return 4;
          } else {
            this.field_p = this.field_p.d((byte) -120);
            return this.field_p.field_e.a((byte) -102, false);
          }
        } else {
          field_o = (String[]) null;
          if (19 != this.field_p.field_g) {
            lc.a(-1);
            this.field_g = this.field_g - 1;
            this.field_p.field_g = this.field_p.field_g - 1;
            return 4;
          } else {
            this.field_p = this.field_p.d((byte) -120);
            return this.field_p.field_e.a((byte) -102, false);
          }
        }
    }

    static {
    }
}
