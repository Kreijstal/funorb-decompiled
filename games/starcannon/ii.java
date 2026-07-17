/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends RuntimeException {
    static String field_c;
    Throwable field_a;
    String field_b;

    final static ig a() {
        if (cl.field_k == uh.field_k) {
            throw new IllegalStateException();
        }
        if (!(s.field_f != uh.field_k)) {
            uh.field_k = cl.field_k;
            return gj.field_a;
        }
        return null;
    }

    public static void b() {
        field_c = null;
    }

    ii(Throwable param0, String param1) {
        ((ii) this).field_b = param1;
        ((ii) this).field_a = param0;
    }

    final static int a(int param0) {
        if (param0 != 6940) {
            field_c = null;
            return -p.field_g + kl.field_d;
        }
        return -p.field_g + kl.field_d;
    }

    static {
    }
}
