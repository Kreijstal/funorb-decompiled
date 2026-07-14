/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends kna {
    static efa field_F;

    final void a(boolean param0, kh param1) {
        if (param0) {
            return;
        }
        super.a(param0, param1);
    }

    final void q(byte param0) {
        super.q(param0);
        ((md) this).b(param0 + 213, 2097152, 2097152);
        ((md) this).a((byte) 80, new mka[1]);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = null;
            return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_F = null;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = new fsa(param2, param0);
        var4.b((byte) -11, ((md) this).field_k, ((md) this).field_l);
        var4.a((byte) -3, 4);
        var4.h(param1, param1 ^ 3);
        var4.e(true, 122);
        var4.g(112, 1);
        var4.b((byte) 17, false);
        var4.a(1, (byte) -12, true);
        eq var5 = new eq(param2, param0);
        var4.a((byte) 83, (nv) (Object) var5);
        mfa var6 = rm.field_a;
        boa var7 = (boa) (Object) var6.a(7, 103);
        var7.b(125, 0);
        var4.a((gr) null, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    final int t(int param0) {
        if (param0 != 8) {
            int discarded$0 = ((md) this).t(100);
            return 7;
        }
        return 7;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            md.A(-92);
            return false;
        }
        return false;
    }

    public static void A(int param0) {
        if (param0 < 96) {
            md.A(19);
            field_F = null;
            return;
        }
        field_F = null;
    }

    md(la param0, int param1) {
        super(param0, param1);
    }

    md(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_F = null;
            return false;
        }
        return false;
    }

    static {
    }
}
