/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rf {
    rf field_d;
    long field_b;
    rf field_a;
    static o field_e;
    static int field_c;

    final static String c(int param0) {
        if (param0 != 1) {
            rf.b(false);
            return se.field_p.a(param0 ^ -14);
        }
        return se.field_p.a(param0 ^ -14);
    }

    final boolean a(byte param0) {
        int var2 = -51 / ((-50 - param0) / 46);
        if (this.field_d == null) {
            return false;
        }
        return true;
    }

    final void b(int param0) {
        if (null != this.field_d) {
          this.field_d.field_a = this.field_a;
          if (param0 != 4) {
            field_c = 114;
            this.field_a.field_d = this.field_d;
            this.field_a = null;
            this.field_d = null;
            return;
          } else {
            this.field_a.field_d = this.field_d;
            this.field_a = null;
            this.field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            rf.b(false);
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        field_e = new o(4, 1, 1, 1);
    }
}
