/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tta extends lea {
    static int field_G;

    final static void e(boolean param0) {
        if (!(qga.field_m)) {
            throw new IllegalStateException();
        }
        sra.field_t = param0;
        jda.a(false, 262144);
        gda.field_c = 0;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = super.a(param0, 3, param2);
        var4.a((byte) -3, 1);
        ue var5 = new ue(param2, param0);
        var5.a(0, false);
        var4.a((byte) 83, (nv) (Object) var5);
        mfa var6 = rm.field_a;
        kga var7 = (kga) (Object) var6.a(12, param1 + 94);
        var7.b((byte) 123, param1);
        var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    tta(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    tta(la param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
    }
}
