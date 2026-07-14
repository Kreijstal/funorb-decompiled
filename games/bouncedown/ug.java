/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ug extends ai {
    ug field_l;
    static java.security.SecureRandom field_g;
    static tg[] field_h;
    ug field_i;
    long field_j;
    static ph field_k;

    public static void b(byte param0) {
        field_g = null;
        if (param0 != 115) {
            field_h = null;
            field_k = null;
            field_h = null;
            return;
        }
        field_k = null;
        field_h = null;
    }

    final void a(int param0) {
        int var2 = 0;
        if (((ug) this).field_i == null) {
          return;
        } else {
          var2 = -31 % ((param0 - -57) / 61);
          ((ug) this).field_i.field_l = ((ug) this).field_l;
          ((ug) this).field_l.field_i = ((ug) this).field_i;
          ((ug) this).field_i = null;
          ((ug) this).field_l = null;
          return;
        }
    }

    protected ug() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new ph("");
    }
}
