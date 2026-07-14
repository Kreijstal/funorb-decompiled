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
        L0: {
          if (((gg) this).field_d != null) {
            ((gg) this).field_d.a(12574);
            break L0;
          } else {
            break L0;
          }
        }
        ((gg) this).field_a = false;
        if (param0 != -17253) {
          ((gg) this).field_d = null;
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          if (((gg) this).field_a) {
            if (((gg) this).field_g) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          gg.a((byte) 69);
          if (((gg) this).field_a) {
            if (((gg) this).field_g) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
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
        ((gg) this).field_g = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new vna();
    }
}
