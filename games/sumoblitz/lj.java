/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    private boolean field_d;
    private String field_c;
    static int[] field_a;
    static int field_b;

    lj(String param0) {
        this(param0, false);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 108) {
            field_a = null;
        }
    }

    lj(String param0, boolean param1) {
        ((lj) this).field_c = param0;
        ((lj) this).field_d = param1 ? true : false;
        if (null == ((lj) this).field_c) {
            ((lj) this).field_c = "";
        }
        if (0 == ((lj) this).field_c.length()) {
            ((lj) this).field_d = false;
        }
    }

    final boolean a(int param0) {
        if (param0 <= 86) {
            ((lj) this).field_c = null;
            return ((lj) this).field_d;
        }
        return ((lj) this).field_d;
    }

    final String a(boolean param0) {
        if (!param0) {
            lj.a((byte) 48);
            return ((lj) this).field_c;
        }
        return ((lj) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 640;
    }
}
