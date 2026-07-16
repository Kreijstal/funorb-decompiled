/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static td field_b;
    static qk field_c;
    private boolean field_f;
    private String field_e;
    static le field_a;
    static String[] field_d;

    final String a(int param0) {
        if (param0 != 0) {
            jk.a(false);
            return ((jk) this).field_e;
        }
        return ((jk) this).field_e;
    }

    final static void a(boolean param0) {
        db.field_a = new kl();
        vb.field_h.c((lk) (Object) db.field_a, (byte) 48);
        if (param0) {
            jk.a((byte) 87);
        }
    }

    jk(String param0) {
        this(param0, false);
    }

    final boolean b(boolean param0) {
        if (!param0) {
            ((jk) this).field_f = false;
            return ((jk) this).field_f;
        }
        return ((jk) this).field_f;
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != -63) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    jk(String param0, boolean param1) {
        ((jk) this).field_e = param0;
        if (null == ((jk) this).field_e) {
            ((jk) this).field_e = "";
        }
        ((jk) this).field_f = param1 ? true : false;
        if (((jk) this).field_e.length() == 0) {
            ((jk) this).field_f = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new td();
        field_d = new String[]{"All scores", "My scores", "Best each"};
    }
}
