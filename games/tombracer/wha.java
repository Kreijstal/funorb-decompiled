/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wha extends kna {
    static String field_H;
    static dd field_J;
    private int field_F;
    static String field_G;
    static String field_I;
    static String[] field_K;

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_I = null;
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var9 = new fsa(param2, param0);
        var9.b((byte) -11, ((wha) this).field_k, ((wha) this).field_l);
        var9.h(3, 0);
        var9.a(1, (byte) -12, true);
        var9.a((byte) -3, 6);
        var9.b((byte) 17, false);
        var9.g(119, 2);
        var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
        hia var5 = new hia(param2, param0);
        int var6 = 34 == ((wha) this).r(12) ? 1 : 0;
        var5.b(11050, var6 != 0);
        var5.c(param1 + -3, var6 == 0 ? true : false);
        var5.a(false, ((wha) this).field_F);
        var9.a((wda) (Object) var5, param1 ^ param1);
        mfa var7 = rm.field_a;
        nq var8 = (nq) (Object) var7.a(16, param1 + 119);
        var8.b(param1 ^ 8021, 0);
        var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
        return var9;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 28, wma.a((byte) 8, 4, ((wha) this).field_F), 8);
    }

    wha(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((wha) this).field_F = 131072;
        ((wha) this).field_F = ji.a(param2.b((byte) 44, 8), 104, 4);
    }

    wha(la param0, int param1) {
        super(param0, param1);
        ((wha) this).field_F = 131072;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_J = null;
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((wha) this).v(-48);
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -65;
        }
        return 7;
    }

    final void q(byte param0) {
        super.q(param0);
        ((wha) this).b(param0 + 250, 2097152, 2097152);
        ((wha) this).a((byte) 112, new mka[1]);
    }

    public static void r(byte param0) {
        field_J = null;
        field_H = null;
        field_I = null;
        field_K = null;
        field_G = null;
        int var1 = -80 / ((param0 - -32) / 57);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_H = null;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<%0> cannot join; the game has started.";
        field_J = new dd(64);
        field_I = "<%0> has not yet unlocked this option for use.";
        field_G = "To <%0>: ";
        field_K = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
