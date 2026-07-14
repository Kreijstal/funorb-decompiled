/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends uf {
    static bg[] field_l;
    int[] field_i;
    static int field_o;
    static int field_k;
    static String field_h;
    static int[] field_m;
    int field_j;
    static String field_n;

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) th.field_g);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) th.field_g);
        dj.field_e = -1;
        if (param1 < 110) {
            Object var3 = null;
            boolean discarded$0 = me.a(54, (String) null);
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 70 % ((param0 - 34) / 55);
        CharSequence var3 = (CharSequence) (Object) param1;
        return jj.field_e.equals((Object) (Object) hm.a((byte) 6, var3));
    }

    public static void a(boolean param0) {
        field_l = null;
        field_h = null;
        if (!param0) {
          field_k = -102;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_m = null;
          field_n = null;
          return;
        }
    }

    private me() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Waiting for sound effects";
        field_n = "Save Game";
    }
}
