/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vg {
    vg field_e;
    static String field_b;
    vg field_a;
    long field_d;
    static String[] field_c;

    final void p(int param0) {
        if (this.field_e != null) {
          if (param0 < 0) {
            return;
          } else {
            this.field_e.field_a = this.field_a;
            this.field_a.field_e = this.field_e;
            this.field_a = null;
            this.field_e = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void o(int param0) {
        if (param0 < 67) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    final static void q(int param0) {
        pr.a(param0 + -30497, faa.field_g, (String) null);
        if (param0 != 30497) {
            field_c = (String[]) null;
        }
    }

    final boolean l(byte param0) {
        if (this.field_e == null) {
            return false;
        }
        int var2 = -24 / ((-27 - param0) / 56);
        return true;
    }

    static {
        field_b = "Feng";
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
