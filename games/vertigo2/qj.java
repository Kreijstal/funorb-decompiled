/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    private String field_e;
    static int field_c;
    static String field_a;
    private boolean field_d;
    static int[] field_b;

    qj(String param0, boolean param1) {
        ((qj) this).field_e = param0;
        if (((qj) this).field_e == null) {
            ((qj) this).field_e = "";
        }
        ((qj) this).field_d = param1 ? true : false;
        if (0 == ((qj) this).field_e.length()) {
            ((qj) this).field_d = false;
        }
    }

    final boolean a(int param0) {
        if (param0 <= 57) {
            return false;
        }
        return ((qj) this).field_d;
    }

    final String a(boolean param0) {
        if (param0) {
            ((qj) this).field_e = null;
            return ((qj) this).field_e;
        }
        return ((qj) this).field_e;
    }

    public static void a(byte param0) {
        if (param0 != 56) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    qj(String param0) {
        this(param0, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Ask to join <%0>'s game";
        field_b = new int[4096];
    }
}
