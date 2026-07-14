/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends fqa {
    static af field_K;
    static String field_J;

    final int B(int param0) {
        if (param0 != 31609) {
            return 93;
        }
        return 3;
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            return false;
        }
        return true;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return false;
    }

    final static int a(CharSequence param0, byte param1) {
        if (param1 != 70) {
            field_J = null;
            return fsa.a(57, 10, true, param0);
        }
        return fsa.a(57, 10, true, param0);
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var10 = new fsa(param2, param0);
        var10.b((byte) -11, ((jb) this).field_k, ((jb) this).field_l);
        var10.h(param1, param1 ^ 3);
        var10.a(1, (byte) -12, false);
        var10.e(false, 124);
        var10.b((byte) 17, false);
        var10.a((byte) -3, 6);
        var10.a((byte) 83, (nv) (Object) new eq(param2, param0));
        eia var5 = new eia(param2, param0);
        var5.a(true, 2, (byte) -122);
        var5.a(10, 1, 5, -2029);
        ((jb) this).a((ut) (Object) var5, (byte) -61);
        jma var6 = var5.k((byte) -69);
        int var7 = 25;
        var6.a(var7, 0, 0, 0, param1 ^ 6, 0);
        var10.a((byte) 83, (nv) (Object) var5);
        mfa var8 = rm.field_a;
        cv var9 = (cv) (Object) var8.a(9, 97);
        var9.b(1, (byte) -112);
        var10.a((gr) (Object) var5, (byte) 124, (dg) (Object) var9);
        return var10;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final int t(int param0) {
        if (param0 != 8) {
            return 49;
        }
        return 7;
    }

    public static void s(byte param0) {
        field_K = null;
        if (param0 >= -34) {
            field_J = null;
            field_J = null;
            return;
        }
        field_J = null;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_K = null;
            return false;
        }
        return false;
    }

    jb(la param0, int param1) {
        super(param0, param1);
    }

    jb(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_J = null;
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((jb) this).b(80, 4194304, 4194304);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Please try changing the following settings:  ";
    }
}
