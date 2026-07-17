/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static fa field_d;
    private boolean field_c;
    private String field_b;
    private boolean field_a;

    public static void a(byte param0) {
        if (param0 != 84) {
            ve.a((byte) 97);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 > -16) {
            ((ve) this).field_b = null;
            return ((ve) this).field_c;
        }
        return ((ve) this).field_c;
    }

    final String c(int param0) {
        if (param0 != -16955) {
            return null;
        }
        return ((ve) this).field_b;
    }

    final void a(boolean param0, int param1) {
        if (param1 != 10518) {
            return;
        }
        ((ve) this).field_a = param0 ? true : false;
        ((ve) this).field_c = true;
    }

    final boolean b(int param0) {
        if (param0 != 27937) {
            ((ve) this).field_b = null;
            return ((ve) this).field_a;
        }
        return ((ve) this).field_a;
    }

    ve(String param0) {
        ((ve) this).field_c = false;
        ((ve) this).field_a = false;
        try {
            ((ve) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ve.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
