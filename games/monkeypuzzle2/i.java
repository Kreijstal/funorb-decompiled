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

    final static int a(int param0, boolean param1) {
        param0--;
        param0 = param0 | param0 >>> 2057585217;
        if (!param1) {
          field_i = false;
          param0 = param0 | param0 >>> -1685109982;
          param0 = param0 | param0 >>> -1857878044;
          param0 = param0 | param0 >>> -144818200;
          param0 = param0 | param0 >>> -1962002192;
          return 1 + param0;
        } else {
          param0 = param0 | param0 >>> -1685109982;
          param0 = param0 | param0 >>> -1857878044;
          param0 = param0 | param0 >>> -144818200;
          param0 = param0 | param0 >>> -1962002192;
          return 1 + param0;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_r = null;
        if (!param0) {
            return;
        }
        field_j = null;
        field_p = null;
        field_m = null;
    }

    i() {
    }

    static {
        field_m = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_j = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_n = 0;
        field_r = new int[11];
    }
}
