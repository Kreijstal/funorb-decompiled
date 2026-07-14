/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private String field_a;
    static boolean field_b;
    static md field_g;
    static gd field_d;
    private boolean field_c;
    static String field_h;
    static int field_e;
    static rg field_f;

    final boolean a(byte param0) {
        int var2 = -99 % ((param0 - 83) / 38);
        return ((cd) this).field_c;
    }

    cd(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != -1) {
            cd.a(96);
            return ((cd) this).field_a;
        }
        return ((cd) this).field_a;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_h = null;
        field_d = null;
        field_f = null;
        field_g = null;
    }

    cd(String param0, boolean param1) {
        ((cd) this).field_a = param0;
        if (null == ((cd) this).field_a) {
            ((cd) this).field_a = "";
        }
        ((cd) this).field_c = param1 ? true : false;
        if (((cd) this).field_a.length() == 0) {
            ((cd) this).field_c = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_h = "Quit";
        field_g = new md();
    }
}
