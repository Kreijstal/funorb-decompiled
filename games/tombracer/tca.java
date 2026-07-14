/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tca extends ra {
    static String field_M;
    static vna field_N;

    final fsa a(boolean param0, int param1, la param2) {
        fsa var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((tca) this).field_k, ((tca) this).field_l);
        var9.h(param1, 0);
        var9.a(1, (byte) -12, true);
        var9.g(param1 ^ 109, 2);
        var9.a((byte) -3, 20);
        var9.b((byte) 17, true);
        eq var5 = new eq(param2, param0);
        var9.a((byte) 83, (nv) (Object) var5);
        ro var6 = ((tca) this).a((byte) 124, param2, param0);
        var9.a((wda) (Object) var6, param1 ^ 3);
        mfa var7 = rm.field_a;
        lma var8 = (lma) (Object) var7.a(15, 111);
        var9.a((gr) null, (byte) 124, (dg) (Object) var8);
        return var9;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    public static void D(int param0) {
        field_N = null;
        if (param0 != 15) {
            tca.D(-122);
            field_M = null;
            return;
        }
        field_M = null;
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -24;
        }
        return 7;
    }

    final boolean A(int param0) {
        int var2 = 103 % ((param0 - 0) / 60);
        return true;
    }

    tca(la param0, int param1) {
        super(param0, param1);
    }

    tca(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            boolean discarded$0 = ((tca) this).z(95);
            return true;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
            boolean discarded$0 = ((tca) this).v(46);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            boolean discarded$0 = ((tca) this).s(-76);
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((tca) this).v(-96);
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_N = null;
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "To server list";
        field_N = new vna();
    }
}
