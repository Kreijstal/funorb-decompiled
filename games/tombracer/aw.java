/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends kna {
    static jpa field_F;
    static jea field_I;
    static int[] field_H;
    static hs field_G;

    final static boolean c(int param0, int param1, int param2) {
        if (param0 != -17275) {
            field_F = null;
        }
        return (55 & param2) != 0 ? true : false;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_H = null;
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((aw) this).b(param0 ^ -66, 2097152, 2097152);
    }

    final static boolean d(int param0, int param1, int param2) {
        if (param0 != -26571) {
            field_G = null;
        }
        return (384 & param1 ^ -1) != -1 ? true : false;
    }

    public static void A(int param0) {
        field_H = null;
        field_F = null;
        if (param0 != 4) {
            field_F = null;
        }
        field_G = null;
        field_I = null;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ci discarded$0 = aw.a((uia) null, -27);
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_H = null;
        }
        return 7;
    }

    aw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static ci a(uia param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int discarded$0 = param0.h(255);
        int var2 = param0.h(param1 + 255);
        ci var3 = gu.a((byte) -62, var2);
        var3.field_f = param0.h(param1 + 255);
        int var4 = param0.h(param1 ^ 255);
        for (var5 = param1; var5 < var4; var5++) {
            var6 = param0.h(param1 + 255);
            var3.a((byte) 107, param0, var6);
        }
        var3.b((byte) 116);
        return var3;
    }

    aw(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = null;
        eq var5 = null;
        fsa var6 = null;
        mc var7 = null;
        mfa var8 = null;
        int var10 = 0;
        fsa var11 = null;
        nq var12 = null;
        nq var13 = null;
        boa var14 = null;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          var11 = new fsa(param2, param0);
          var4 = var11;
          var11.b((byte) -11, ((aw) this).field_k, ((aw) this).field_l);
          var11.a((byte) -3, 4);
          var11.h(param1, param1 + -3);
          if ((((aw) this).field_m ^ -1) != -20) {
            var11.e(false, 120);
            break L0;
          } else {
            var11.e(true, 117);
            break L0;
          }
        }
        L1: {
          var11.g(104, 1);
          var11.b((byte) 17, false);
          var11.a(1, (byte) -12, true);
          var5 = new eq(param2, param0);
          var5.a(-28592, true);
          var11.a((byte) 83, (nv) (Object) var5);
          var6 = new fsa(param2, param0);
          var6.b((byte) -11, ((aw) this).field_k, ((aw) this).field_l);
          var6.a((byte) -3, 0);
          var7 = new mc(param2, param0);
          var6.a((byte) 83, (nv) (Object) var7);
          var11.a(-98, var6);
          var8 = rm.field_a;
          if (((aw) this).field_m != 19) {
            var13 = (nq) (Object) var8.a(16, param1 ^ 105);
            var13.b(8022, 4);
            var11.a((gr) null, (byte) 124, (dg) (Object) var13);
            break L1;
          } else {
            var12 = (nq) (Object) var8.a(16, 127);
            var12.b(param1 + 8019, 1);
            var11.a((gr) null, (byte) 124, (dg) (Object) var12);
            break L1;
          }
        }
        var14 = (boa) (Object) var8.a(7, 125);
        var14.b(param1 + 116, 9);
        var11.a((gr) (Object) var7, (byte) 124, (dg) (Object) var14);
        return var11;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[]{0};
        field_G = new hs();
    }
}
