/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends kna {
    static boolean field_F;

    ve(la param0, int param1) {
        super(param0, param1);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = new fsa(param2, param0);
        var4.b((byte) -11, ((ve) this).field_k, ((ve) this).field_l);
        var4.a((byte) -3, 5);
        mfa var5 = rm.field_a;
        am var6 = (am) (Object) var5.a(4, 80);
        var6.b(1, (byte) 77);
        var4.a((gr) null, (byte) 124, (dg) (Object) var6);
        gaa var7 = (gaa) (Object) var5.a(5, 88);
        var7.a(64, 119);
        var7.a(true, 16633231);
        var7.b(1, 96);
        var7.a(0, param1, 1, true);
        var4.a((gr) null, (byte) 124, (dg) (Object) var7);
        return var4;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
            field_F = true;
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -121;
        }
        return 7;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_F = false;
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((ve) this).b(param0 + 29, 2097152, 2097152);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((ve) this).a(true, (kh) null);
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            Object var3 = null;
            fsa discarded$0 = ((ve) this).a(true, 119, (la) null);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            Object var3 = null;
            fsa discarded$0 = ((ve) this).a(false, -64, (la) null);
            return false;
        }
        return false;
    }

    ve(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = false;
    }
}
