/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends lea {
    static cn field_H;
    static String field_G;
    static ka[] field_J;
    static String field_I;

    public static void s(byte param0) {
        field_H = null;
        field_J = null;
        field_I = null;
        if (param0 != -18) {
            field_J = null;
            field_G = null;
            return;
        }
        field_G = null;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = super.a(param0, 3, param2);
        ef var5 = new ef(param2, param0);
        var5.a(ci.a(4, -1), 5);
        var4.a((byte) 83, (nv) (Object) var5);
        var4.l(param1, 146366800);
        mfa var6 = rm.field_a;
        kga var7 = (kga) (Object) var6.a(12, 104);
        var7.b((byte) 74, 4);
        var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    df(la param0, int param1) {
        super(param0, param1);
    }

    df(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Type your password again to make sure it's correct";
        field_I = "Cancel rematch";
    }
}
