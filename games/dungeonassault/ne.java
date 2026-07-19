/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ne {
    ne field_a;
    static hh field_b;
    ne field_e;
    static long field_g;
    static gp field_c;
    long field_h;
    static String[] field_f;
    static cn field_d;

    final void a(boolean param0) {
        if (this.field_a == null) {
          return;
        } else {
          L0: {
            this.field_a.field_e = this.field_e;
            this.field_e.field_a = this.field_a;
            this.field_e = null;
            this.field_a = null;
            if (!param0) {
              break L0;
            } else {
              field_d = (cn) null;
              break L0;
            }
          }
          return;
        }
    }

    final boolean c(int param0) {
        if (!(null != this.field_a)) {
            return false;
        }
        if (param0 >= -15) {
            field_f = (String[]) null;
            return true;
        }
        return true;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -18880) {
          field_c = (gp) null;
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    static {
        field_f = new String[]{"Pit Immunity", "Success against all pit traps."};
    }
}
