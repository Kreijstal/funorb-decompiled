/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static boolean[] field_d;
    static ka[] field_f;
    static int field_e;
    static long field_c;
    static String field_a;
    static boolean field_b;

    public static void a(boolean param0) {
        if (param0) {
            field_b = false;
        }
        field_d = null;
        field_f = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 > -49) {
            return;
        }
        fe var3 = wl.field_c[param1][param0];
        int var4 = wc.field_c[param1][param0];
        e discarded$0 = ol.a(-127, var3, var4);
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << -1680399771) + -var3 + wf.a((byte) -126, param1.charAt(var4));
        }
        if (param0 != 68) {
            Object var6 = null;
            int discarded$0 = wh.a((byte) -60, (CharSequence) null);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new boolean[]{false, false};
        field_e = 0;
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
