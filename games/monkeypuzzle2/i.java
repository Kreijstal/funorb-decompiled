/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends ug {
    ic[] field_s;
    static mj field_p;
    static boolean field_i;
    ic[] field_k;
    byte[][][] field_f;
    static String field_h;
    static int field_n;
    static String[] field_m;
    static String[] field_j;
    int[] field_g;
    int[] field_q;
    int field_e;
    int field_l;
    int[] field_o;
    static int[] field_r;

    final static int a(int param0) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return 1 + param0;
    }

    public static void a() {
        field_h = null;
        field_r = null;
        field_j = null;
        field_p = null;
        field_m = null;
    }

    i() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_j = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_n = 0;
        field_r = new int[11];
    }
}
