/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int[] field_f;
    static int field_e;
    static boolean field_d;
    private String field_g;
    static String[] field_h;
    static String field_a;
    static sna field_c;
    static String field_b;

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        field_c = null;
        if (!param0) {
          field_b = null;
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static kv[] a(String param0, vr param1, int param2, String param3) {
        int var5 = 119 / ((-3 - param2) / 39);
        kv[] var6 = gw.a(param3, param0, param1, -43);
        kv[] var4 = var6;
        var6[3].field_o = var6[3].field_p;
        var6[1].field_n = var6[1].field_q;
        var6[5].field_o = var6[5].field_p;
        var6[7].field_n = var6[7].field_q;
        return var4;
    }

    hk(String param0) {
        ((hk) this).field_g = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(String param0, int param1) {
        if (param1 <= 0) {
            field_d = true;
            return ((hk) this).field_g.equals((Object) (Object) param0);
        }
        return ((hk) this).field_g.equals((Object) (Object) param0);
    }

    final void a(int param0, java.applet.Applet param1) {
        int var3 = 12 % ((-16 - param0) / 61);
        oc.a(param1, "jagex-last-login-method", 31536000L, 123, ((hk) this).field_g);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This game option is not available in rated games.";
        field_h = new String[]{"Idle.bin", "Walk.bin", "Jump.bin", "Happy.bin", "Attack.bin", "React.bin", "Death.bin", "Kick.bin", "Range.bin", "Climb.bin", "Eat.bin", "Sleep.bin"};
        field_b = "Cancel";
    }
}
