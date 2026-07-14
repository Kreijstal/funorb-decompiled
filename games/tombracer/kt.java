/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends kna {
    static ta field_F;
    private int field_G;
    static String field_H;

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_F = null;
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        if (param0) {
          field_F = null;
          super.a(param0, param1);
          param1.a((byte) 72, ((kt) this).field_G, 4);
          return;
        } else {
          super.a(param0, param1);
          param1.a((byte) 72, ((kt) this).field_G, 4);
          return;
        }
    }

    kt(la param0, int param1) {
        super(param0, param1);
        ((kt) this).field_G = 4;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var8 = new fsa(param2, param0);
        var8.b((byte) -11, ((kt) this).field_k, ((kt) this).field_l);
        var8.h(param1, 0);
        var8.a(1, (byte) -12, true);
        var8.a((byte) -3, 6);
        var8.b((byte) 17, false);
        var8.g(126, 2);
        var8.a((byte) 83, (nv) (Object) new eq(param2, param0));
        pt var5 = new pt(param2, param0);
        var5.a(8 * ((kt) this).field_G, (byte) 127);
        var8.a((wda) (Object) var5, 0);
        mfa var6 = rm.field_a;
        nq var7 = (nq) (Object) var6.a(16, param1 ^ 82);
        var7.b(8022, 2);
        var8.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
        return var8;
    }

    final void q(byte param0) {
        super.q(param0);
        ((kt) this).b(62, 2097152, 2097152);
        ((kt) this).a((byte) 109, new mka[1]);
    }

    final int t(int param0) {
        if (param0 != 8) {
            Object var3 = null;
            ((kt) this).a(true, (kh) null);
            return 7;
        }
        return 7;
    }

    kt(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((kt) this).field_G = 4;
        ((kt) this).field_G = param2.b((byte) 44, 4);
    }

    public static void A(int param0) {
        field_H = null;
        field_F = null;
        if (param0 > -74) {
            field_F = null;
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            Object var3 = null;
            ((kt) this).a(true, (kh) null);
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Service unavailable";
    }
}
