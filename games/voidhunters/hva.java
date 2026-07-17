/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hva extends RuntimeException {
    Throwable field_b;
    String field_a;
    static String[] field_c;

    public static void a() {
        field_c = null;
        int var1 = 0;
    }

    hva(Throwable param0, String param1) {
        ((hva) this).field_b = param0;
        ((hva) this).field_a = param1;
    }
}
