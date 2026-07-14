/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static boolean field_c;
    static int field_b;
    static long field_d;
    static he[] field_a;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        s.field_K = false;
        rk.field_f = false;
        if (param0 >= -58) {
            return;
        }
        vf.a((byte) -117, -1);
        na.field_S = ml.field_a;
        oe.field_Q = ml.field_a;
    }

    final static boolean a(String param0, int param1) {
        int var2 = 100 / ((param1 - -63) / 45);
        CharSequence var3 = (CharSequence) (Object) param0;
        return dc.field_J.equals((Object) (Object) hh.a(0, var3));
    }

    final static void b(byte param0) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        nf var1 = new nf(540, 140);
        vm.a(var1, -8409);
        ti.b();
        int var2 = -113 / ((param0 - 32) / 49);
        fn.d();
        tg.field_H = 0;
        of.a(false);
        nf var3 = var1.c();
        for (var4 = 0; var4 < 15; var4++) {
            var3.d(-2, -2, 16777215);
            fn.a(4, 4, 0, 0, 540, 140);
        }
        bg.field_c.d();
        var1.b(0, 0);
        ib.b(false);
    }

    static {
    }
}
