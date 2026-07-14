/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private String field_b;
    private boolean field_c;
    static String field_a;

    dj(String param0) {
        this(param0, false);
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -35 / ((param0 - 60) / 53);
    }

    final String b(byte param0) {
        if (param0 < 40) {
            ((dj) this).field_c = false;
            return ((dj) this).field_b;
        }
        return ((dj) this).field_b;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return ((dj) this).field_c;
    }

    dj(String param0, boolean param1) {
        ((dj) this).field_b = param0;
        if (null == ((dj) this).field_b) {
            ((dj) this).field_b = "";
        }
        ((dj) this).field_c = param1 ? true : false;
        if (((dj) this).field_b.length() == 0) {
            ((dj) this).field_c = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Type your email address again to make sure it's correct";
    }
}
