/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends wf {
    static String field_l;
    static int[] field_k;
    static int field_j;
    static boolean field_g;
    byte[] field_h;
    static String field_i;

    public static void a(byte param0) {
        field_i = null;
        field_k = null;
        field_l = null;
        if (param0 < 117) {
            field_j = -94;
        }
    }

    final static void a(int param0, boolean param1, pl param2) {
        if (param0 != 17099) {
            field_j = -73;
            am.a(param1, 256, param2, (byte) 125);
            return;
        }
        am.a(param1, 256, param2, (byte) 125);
    }

    final static void d(int param0) {
        ql.field_b = null;
        gj.field_j = null;
        re.field_a = null;
        re.field_K = null;
        int var1 = -77 % ((param0 - 71) / 46);
        rg.field_D = null;
        wk.field_b = null;
    }

    wd(byte[] param0) {
        ((wd) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Unfortunately you are not eligible to create an account.";
        field_k = new int[]{2, 3, 3, 5, 3, 5, 2, 5, 5, 10, 3, 3, 2, 3, 3, 3};
        field_i = "Accept";
    }
}
