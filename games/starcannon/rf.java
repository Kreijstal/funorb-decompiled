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
        return se.field_p.a(-13);
    }

    final boolean a(byte param0) {
        int var2 = -51 / ((-50 - param0) / 46);
        if (((rf) this).field_d == null) {
            return false;
        }
        return true;
    }

    final void b(int param0) {
        if (null != ((rf) this).field_d) {
          ((rf) this).field_d.field_a = ((rf) this).field_a;
          if (param0 != 4) {
            field_c = 114;
            ((rf) this).field_a.field_d = ((rf) this).field_d;
            ((rf) this).field_a = null;
            ((rf) this).field_d = null;
            return;
          } else {
            ((rf) this).field_a.field_d = ((rf) this).field_d;
            ((rf) this).field_a = null;
            ((rf) this).field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new o(4, 1, 1, 1);
    }
}
