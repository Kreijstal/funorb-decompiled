/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ug {
    ug field_d;
    long field_a;
    static String field_b;
    ug field_c;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -1733) {
          field_b = (String) null;
        }
    }

    final boolean d(int param0) {
        if (param0 == -3548) {
          return this.field_c != null ? true : false;
        }
        this.field_d = (ug) null;
        if (this.field_c == null) {
          return false;
        }
        return true;
    }

    final void c(int param0) {
        if (null == this.field_c) {
          return;
        }
        this.field_c.field_d = this.field_d;
        if (param0 == -19822) {
          this.field_d.field_c = this.field_c;
          this.field_d = null;
          this.field_c = null;
          return;
        }
        this.field_a = -48L;
        this.field_d.field_c = this.field_c;
        this.field_d = null;
        this.field_c = null;
    }

    static {
    }
}
