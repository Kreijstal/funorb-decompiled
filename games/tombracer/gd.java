/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends lea {
    static String field_G;
    static String field_J;
    static dn field_H;
    static String field_I;
    static int field_L;
    static String field_K;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = super.a(param0, param1, param2);
        var4.a((byte) -3, 2);
        ue var5 = new ue(param2, param0);
        var5.a(3, false);
        var4.a((byte) 83, (nv) (Object) var5);
        mfa var6 = rm.field_a;
        kga var7 = (kga) (Object) var6.a(12, param1 ^ 117);
        var7.b((byte) 98, 2);
        var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    gd(la param0, int param1) {
        super(param0, param1);
    }

    public static void e(boolean param0) {
        field_K = null;
        field_I = null;
        field_H = null;
        if (!param0) {
            return;
        }
        field_J = null;
        field_G = null;
    }

    gd(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_J = "Show players in <%0>'s game";
        field_I = "Try changing the '<%0>' setting.";
        field_H = new dn();
        field_K = "Offline";
    }
}
