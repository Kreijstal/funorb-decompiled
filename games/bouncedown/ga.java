/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends RuntimeException {
    Throwable field_e;
    String field_a;
    static uf field_c;
    static we[] field_d;
    static lj field_f;
    static String[] field_g;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 != 72) {
            ga.a((byte) 101);
        }
    }

    ga(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_e = param0;
    }

    static {
        field_c = new uf();
        field_g = new String[16];
        field_f = new lj();
        field_b = "OK";
    }
}
