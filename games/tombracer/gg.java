/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    boolean field_g;
    boolean field_a;
    eja field_c;
    eja field_d;
    static kta field_b;
    static nh field_f;
    static vna field_e;

    final void a(int param0) {
        if (this.field_d != null) {
          this.field_d.a(12574);
        }
        this.field_a = false;
        if (param0 == -17253) {
          return;
        }
        this.field_d = (eja) null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          gg.a((byte) 69);
          if (!this.field_a) {
            return false;
          }
          if (!this.field_g) {
            return true;
          }
          return false;
        }
        if (!this.field_a) {
          return false;
        }
        if (!this.field_g) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_f = null;
        field_b = null;
        if (param0 >= -70) {
          gg.a((byte) -71);
          field_e = null;
          return;
        }
        field_e = null;
    }

    gg(boolean param0) {
        this.field_g = param0 ? true : false;
    }

    static {
        field_e = new vna();
    }
}
