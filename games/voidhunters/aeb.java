/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aeb {
    static boolean field_a;

    final static void a(int param0, int param1, ik param2) {
        faa var3 = null;
        int var4 = 0;
        try {
            var3 = dpa.field_p;
            var3.h(24335, 5);
            var3.field_e = var3.field_e + 1;
            var4 = var3.field_e;
            var3.c(0, 1);
            var3.c(0, param2.field_f);
            var3.b(param2.field_g, 120);
            var3.d(param2.field_h, 332614536);
            var3.d(param2.field_d, 332614536);
            var3.d(param2.field_e, 332614536);
            var3.d(param2.field_i, 332614536);
            int discarded$0 = var3.g(1595, var4);
            var3.e(var3.field_e - var4, -129);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aeb.B(" + 5 + ',' + -21584 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        tdb.field_p = qqa.field_i[param0];
        ocb.field_i = gib.field_b[param0];
        lo.field_d = twa.field_b[param0];
    }

    static {
    }
}
