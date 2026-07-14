/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kd {
    static java.security.SecureRandom field_e;
    static int[] field_b;
    kd field_f;
    long field_d;
    static int field_a;
    static int[] field_g;
    kd field_c;

    final boolean a(boolean param0) {
        if (null == ((kd) this).field_c) {
            return false;
        }
        if (param0) {
            return true;
        }
        return true;
    }

    final void b(byte param0) {
        if (((kd) this).field_c == null) {
          return;
        } else {
          ((kd) this).field_c.field_f = ((kd) this).field_f;
          ((kd) this).field_f.field_c = ((kd) this).field_c;
          ((kd) this).field_c = null;
          if (param0 >= -115) {
            return;
          } else {
            ((kd) this).field_f = null;
            return;
          }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          kd.b(false);
          field_g = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_g = new int[8192];
    }
}
