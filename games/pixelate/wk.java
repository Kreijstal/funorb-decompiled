/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends rg {
    static fm field_j;
    private String field_k;
    static String[] field_i;
    static bb field_g;
    private String field_h;
    static String field_f;

    final static tf[] a(int param0, int param1, int param2) {
        if (param2 != 1) {
            wk.c(-57);
            return tk.a(1, param1, true, param0);
        }
        return tk.a(1, param1, true, param0);
    }

    public static void c(int param0) {
        if (param0 != -19101) {
          field_g = null;
          field_j = null;
          field_f = null;
          field_g = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_g = null;
          field_i = null;
          return;
        }
    }

    final ea b(int param0) {
        if (param0 != -27096) {
            tf[] discarded$0 = wk.a(45, 71, -79);
            return l.field_r;
        }
        return l.field_r;
    }

    wk(String param0, String param1) {
        ((wk) this).field_k = param1;
        ((wk) this).field_h = param0;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, byte param6, boolean param7, int param8, int param9, int param10, int param11) {
        sk.a(param4, 16777215, param0, param2, param11, param10, param1, (byte) -119, param7, 16777215, param3, param8, param5, param9);
        int var12 = -97 % ((param6 - -37) / 37);
    }

    final void a(byte param0, we param1) {
        param1.a((byte) -66, ((wk) this).field_h);
        param1.a(-129, ((wk) this).field_k);
        if (param0 != -12) {
            Object var4 = null;
            ((wk) this).a((byte) -114, (we) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"The single-player challenge is simple - make as many pictures as you can for points and Achievements!", "The <col=FF9900>timer bar</col> is slowly draining at the bottom of the screen. Complete pictures quickly to <col=FF9900>bump</col> it back up. If it disappears completely the game is over."};
        field_f = "Fullscreen";
        field_g = new bb();
    }
}
