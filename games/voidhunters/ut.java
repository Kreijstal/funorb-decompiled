/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ut {
    static String field_a;

    final static void a(int param0, long param1, int param2) {
        faa var4 = dpa.field_p;
        var4.h(24335, param2);
        var4.field_e = var4.field_e + 1;
        int var5 = var4.field_e;
        var4.c(0, param0);
        var4.a(param1, 105);
        var4.e(var4.field_e + -var5, -129);
    }

    public static void a(int param0) {
        if (param0 > -36) {
            ut.a(7);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = "Cancel draw";
    }
}
