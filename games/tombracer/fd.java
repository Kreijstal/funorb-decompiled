/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static int field_e;
    int field_c;
    int field_f;
    int field_h;
    int field_g;
    int field_b;
    int field_a;
    static lu field_d;

    final fd a(byte param0) {
        if (param0 != 78) {
          return null;
        } else {
          return new fd(((fd) this).field_c, ((fd) this).field_b, ((fd) this).field_f, ((fd) this).field_h, ((fd) this).field_a, ((fd) this).field_g);
        }
    }

    final void a(int param0, fd param1) {
        try {
            ((fd) this).field_c = param1.field_c;
            ((fd) this).field_f = param1.field_f;
            ((fd) this).field_h = param1.field_h;
            ((fd) this).field_b = param1.field_b;
            if (param0 != 167) {
                field_d = null;
            }
            ((fd) this).field_g = param1.field_g;
            ((fd) this).field_a = param1.field_a;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "fd.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(byte param0) {
        field_d = null;
    }

    fd(int param0) {
        ((fd) this).field_f = 128;
        ((fd) this).field_b = 128;
        ((fd) this).field_c = param0;
    }

    private fd(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((fd) this).field_f = 128;
        ((fd) this).field_b = 128;
        ((fd) this).field_b = param1;
        ((fd) this).field_c = param0;
        ((fd) this).field_h = param3;
        ((fd) this).field_a = param4;
        ((fd) this).field_f = param2;
        ((fd) this).field_g = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
    }
}
