/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aeb {
    static boolean field_a;

    final static void a(int param0, int param1, ik param2) {
        faa var5 = null;
        int var4 = 0;
        try {
            var5 = dpa.field_p;
            var5.h(24335, param0);
            var5.field_e = var5.field_e + 1;
            var4 = var5.field_e;
            var5.c(0, 1);
            var5.c(0, param2.field_f);
            var5.b(param2.field_g, 120);
            var5.d(param2.field_h, param1 ^ -332603336);
            var5.d(param2.field_d, param1 ^ -332603336);
            var5.d(param2.field_e, 332614536);
            var5.d(param2.field_i, 332614536);
            int discarded$59 = var5.g(param1 ^ -21109, var4);
            if (param1 != -21584) {
                aeb.a(47, -32);
            }
            var5.e(var5.field_e - var4, -129);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aeb.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 1) {
          field_a = false;
          tdb.field_p = qqa.field_i[param0];
          ocb.field_i = gib.field_b[param0];
          lo.field_d = twa.field_b[param0];
          return;
        } else {
          tdb.field_p = qqa.field_i[param0];
          ocb.field_i = gib.field_b[param0];
          lo.field_d = twa.field_b[param0];
          return;
        }
    }

    static {
    }
}
