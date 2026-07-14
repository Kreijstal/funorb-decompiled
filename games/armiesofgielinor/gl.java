/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    private String field_a;
    static ka field_e;
    private boolean field_d;
    static int field_c;
    static boolean field_b;

    final String a(int param0) {
        int var2 = 87 % ((param0 - 53) / 55);
        return ((gl) this).field_a;
    }

    final boolean a(byte param0) {
        int var2 = -118 / ((param0 - 29) / 41);
        return ((gl) this).field_d;
    }

    final static void a(int param0, int param1) {
        if (param0 < 119) {
            return;
        }
        cn.field_r = param1;
    }

    gl(String param0) {
        this(param0, false);
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            gl.a(-75, -111);
        }
    }

    gl(String param0, boolean param1) {
        ((gl) this).field_a = param0;
        ((gl) this).field_d = param1 ? true : false;
        if (null == ((gl) this).field_a) {
            ((gl) this).field_a = "";
        }
        if (0 == ((gl) this).field_a.length()) {
            ((gl) this).field_d = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
