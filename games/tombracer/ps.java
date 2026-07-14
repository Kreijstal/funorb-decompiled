/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps extends ra {
    static String field_P;
    private int field_M;
    static jpa[] field_O;
    static int field_N;

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ps.s((byte) 71);
            return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            int discarded$0 = ((ps) this).t(7);
            return true;
        }
        return true;
    }

    final boolean A(int param0) {
        int var2 = 88 % ((0 - param0) / 60);
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
            field_P = null;
            return true;
        }
        return true;
    }

    ps(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((ps) this).field_M = param2.b((byte) 44, 4);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            boolean discarded$0 = ((ps) this).A(105);
            return true;
        }
        return true;
    }

    ps(la param0, int param1) {
        super(param0, param1);
    }

    final int t(int param0) {
        if (param0 != 8) {
            ((ps) this).q((byte) -40);
            return 3;
        }
        return 3;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        lpa var5 = null;
        ro var6 = null;
        mfa var7 = null;
        ce var8 = null;
        var4 = new fsa(param2, param0);
        var4.b((byte) -11, ((ps) this).field_k, ((ps) this).field_l);
        var5 = new lpa(param2, false);
        var5.b(-5, ((ps) this).field_M);
        var5.a((byte) -24, true);
        if (param1 != 3) {
          return null;
        } else {
          var4.a((byte) 83, (nv) (Object) var5);
          var6 = ((ps) this).a((byte) -104, param2, param0);
          var4.a((wda) (Object) var6, 0);
          var7 = rm.field_a;
          var8 = (ce) (Object) var7.a(17, 88);
          var8.b(2, (byte) 23);
          var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
          return var4;
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 84, ((ps) this).field_M, 4);
    }

    public static void s(byte param0) {
        field_O = null;
        int var1 = -40 % ((3 - param0) / 35);
        field_P = null;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Bronze Medal Award";
    }
}
