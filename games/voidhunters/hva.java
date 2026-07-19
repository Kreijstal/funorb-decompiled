/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hva extends RuntimeException {
    Throwable field_b;
    String field_a;
    static String[] field_c;

    public static void a(int param0) {
        field_c = null;
        int var1 = 23 % ((79 - param0) / 46);
    }

    hva(Throwable param0, String param1) {
        this.field_b = param0;
        this.field_a = param1;
    }
}
