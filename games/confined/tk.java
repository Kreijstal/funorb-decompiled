/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk {
    static int field_b;
    static al field_f;
    static bi[] field_c;
    static String[] field_e;
    static od field_a;
    static String field_d;
    static int field_g;

    final static void a(int param0, String param1) {
        if (param0 != 13) {
            tk.a(-71);
        }
    }

    abstract we a(byte param0);

    abstract int a(int param0, boolean param1);

    abstract byte[] a(int param0, int param1);

    final static void a(byte param0, boolean param1) {
        dl.a(param1, true, true);
        if (param0 >= -89) {
            field_e = null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 != 15866) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_f = new al("");
        field_c = new bi[13];
        field_d = "Level";
        field_g = 0;
    }
}
