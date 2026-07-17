/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    int field_a;
    static qm field_c;
    static String field_d;
    static w field_b;
    static kn field_e;
    static String field_f;

    final static void a(boolean param0) {
        if (hc.field_d != 10) {
          if (!bd.d((byte) -124)) {
            ne.e(-5);
            hc.field_d = 11;
            tf.field_bb = true;
            return;
          } else {
            tf.field_bb = true;
            return;
          }
        } else {
          ne.e(-5);
          hc.field_d = 11;
          tf.field_bb = true;
          return;
        }
    }

    gh(int param0) {
        ((gh) this).field_a = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_b = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new qm(15, 0, 1, 0);
        field_d = "Macroing or use of bots";
        field_e = null;
        field_f = "Public chat is unavailable while setting up a rated game.";
    }
}
