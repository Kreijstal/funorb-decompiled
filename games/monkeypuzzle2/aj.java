/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static le field_e;
    static pj field_b;
    static String field_d;
    private String field_a;
    private boolean field_g;
    static volatile boolean field_c;
    static int field_f;

    final boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        return ((aj) this).field_g;
    }

    aj(String param0) {
        this(param0, false);
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -14958) {
            aj.a(-119);
        }
    }

    final String a(byte param0) {
        if (param0 >= -75) {
            field_f = -96;
            return ((aj) this).field_a;
        }
        return ((aj) this).field_a;
    }

    aj(String param0, boolean param1) {
        ((aj) this).field_a = param0;
        ((aj) this).field_g = param1 ? true : false;
        if (null == ((aj) this).field_a) {
            ((aj) this).field_a = "";
        }
        if (((aj) this).field_a.length() == 0) {
            ((aj) this).field_g = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Go Back";
        field_c = false;
        field_f = 4;
        field_b = new pj();
    }
}
