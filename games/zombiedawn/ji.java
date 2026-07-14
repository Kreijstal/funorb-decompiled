/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String[] field_f;
    static long[] field_c;
    private boolean field_e;
    private String field_b;
    static String field_d;
    static String field_a;

    ji(String param0) {
        this(param0, false);
    }

    final boolean b(int param0) {
        if (param0 != 32) {
            String discarded$0 = ((ji) this).a(-113);
            return ((ji) this).field_e;
        }
        return ((ji) this).field_e;
    }

    ji(String param0, boolean param1) {
        ((ji) this).field_b = param0;
        ((ji) this).field_e = param1 ? true : false;
        if (((ji) this).field_b == null) {
            ((ji) this).field_b = "";
        }
        if (((ji) this).field_b.length() == 0) {
            ((ji) this).field_e = false;
        }
    }

    final String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return ((ji) this).field_b;
    }

    public static void c(int param0) {
        field_a = null;
        int var1 = 78 % ((-75 - param0) / 36);
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static vn[] a(dj param0, int param1, int param2, int param3) {
        if (param1 != -1) {
            return null;
        }
        if (!ph.a(param2, 31043, param3, param0)) {
            return null;
        }
        return ro.a((byte) 110);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"By rating", "By win percentage"};
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = new long[32];
        field_a = "Unpacking levels";
    }
}
