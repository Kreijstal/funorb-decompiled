/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static vo field_a;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static boolean a() {
        if (ld.field_j < 20) {
            return true;
        }
        int discarded$2 = 18840;
        if (!bj.d()) {
            return true;
        }
        if (sd.field_b <= 0) {
            return false;
        }
        int discarded$6 = -23022;
        if (nm.c()) {
            return false;
        }
        return true;
    }

    final static void a(boolean param0) {
        ce.field_r = fj.field_g.a(true);
        CharSequence var2 = (CharSequence) (Object) ce.field_r;
        kf.field_T = fm.a(var2, -122);
    }

    final static String a(int param0, byte param1, int param2) {
        int var3 = -1;
        return param0 + "/" + param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new vo();
        field_b = "Instructions";
        field_c = "Discard";
    }
}
