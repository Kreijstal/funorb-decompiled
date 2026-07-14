/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int[] field_e;
    private nh field_d;
    static int field_a;
    private nh field_b;
    private eg field_c;

    final nf a(int param0, int param1) {
        byte[] var4 = null;
        nf var3 = (nf) ((gb) this).field_c.a(-70, (long)param0);
        if (var3 != null) {
            return var3;
        }
        if ((param0 ^ -1) > -32769) {
            var4 = ((gb) this).field_b.b(5, 1, param0);
        } else {
            var4 = ((gb) this).field_d.b(5, 1, param0 & 32767);
        }
        if (param1 != -19256) {
            return null;
        }
        nf var3_ref = new nf();
        if (!(var4 == null)) {
            var3_ref.a(new ec(var4), param1 + 19255);
        }
        if (!(32768 > param0)) {
            var3_ref.d((byte) -74);
        }
        ((gb) this).field_c.a(true, (Object) (Object) var3_ref, (long)param0);
        return var3_ref;
    }

    final static ba a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        ba var5 = null;
        int var6 = DungeonAssault.field_K;
        String var2 = en.a("jagex-last-login-method", (byte) 121, param0);
        if (var2 == null) {
            return rl.field_j;
        }
        if (param1 >= -74) {
            Object var7 = null;
            ba discarded$0 = gb.a((java.applet.Applet) null, 18);
        }
        ba[] var3 = jg.b((byte) 24);
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(var2, 20886))) {
                return var5;
            }
        }
        return rl.field_j;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 32767) {
            field_a = 79;
        }
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{10};
    }
}
