/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends RuntimeException {
    static String field_c;
    static String field_a;
    String field_h;
    static aa[] field_e;
    static dk field_f;
    static java.security.SecureRandom field_j;
    static String field_d;
    static String field_i;
    static int field_k;
    static km[][] field_b;
    Throwable field_g;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        field_j = null;
        field_i = null;
        if (param0 < 108) {
          ae.a(83);
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    ae(Throwable param0, String param1) {
        ((ae) this).field_g = param0;
        ((ae) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking sound effects";
        field_e = new aa[12];
        field_d = "Show all lobby chat";
        field_k = 10;
        field_c = "Play rated game";
        field_i = "Players: ";
    }
}
