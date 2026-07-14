/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wfa extends kna {
    static String field_G;
    static byte[] field_F;

    final boolean s(int param0) {
        if (param0 != -15254) {
            int discarded$0 = ((wfa) this).t(13);
            return true;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            wfa.r((byte) -56);
            return 7;
        }
        return 7;
    }

    wfa(la param0, int param1) {
        super(param0, param1);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public static void r(byte param0) {
        field_G = null;
        field_F = null;
        if (param0 >= -97) {
            field_G = null;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
            Object var4 = null;
            ((wfa) this).a(true, (kh) null);
        }
    }

    final void q(byte param0) {
        super.q(param0);
        ((wfa) this).b(117, 4194304, 4194304);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = new fsa(param2, param0);
        var4.b((byte) -11, ((wfa) this).field_k, ((wfa) this).field_l);
        var4.a((byte) -3, 20);
        var4.h(param1, param1 ^ 3);
        var4.b((byte) 17, true);
        var4.a(4, (byte) -12, true);
        rea var5 = new rea(param2, param0);
        var5.a(50, 8, param1 ^ 2, 25, 6);
        var5.b((byte) 72, true);
        var4.a((byte) 83, (nv) (Object) var5);
        mfa var6 = rm.field_a;
        dc var7 = (dc) (Object) var6.a(11, 114);
        var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    final static boolean a(boolean param0, int param1, kh param2) {
        param2.a((byte) -128, !param0 ? 0 : 1, 1);
        int var3 = -96 % ((param1 - 62) / 35);
        return param0;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    wfa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Walk into these mirrors holding <img=8><img=9> to drag them around. Reflect carefully before handling dangerous laser beams.";
        field_F = new byte[520];
    }
}
