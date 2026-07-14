/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ra {
    static su field_M;
    static char[] field_O;
    static int field_N;

    final static int c(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 != 15) {
          uk.s((byte) 58);
          var3 = 0;
          L0: while (true) {
            if (param2 <= 0) {
              return var3;
            } else {
              var3 = 1 & param0 | var3 << -193105279;
              param2--;
              param0 = param0 >>> 1;
              continue L0;
            }
          }
        } else {
          var3 = 0;
          L1: while (true) {
            if (param2 <= 0) {
              return var3;
            } else {
              var3 = 1 & param0 | var3 << -193105279;
              param2--;
              param0 = param0 >>> 1;
              continue L1;
            }
          }
        }
    }

    uk(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_M = null;
            return 7;
        }
        return 7;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var12 = new fsa(param2, param0);
        var12.b((byte) -11, ((uk) this).field_k, ((uk) this).field_l);
        var12.h(0, param1 ^ param1);
        var12.a(4, (byte) -12, true);
        var12.a((byte) -3, 0);
        var12.b((byte) 17, true);
        ro var5 = ((uk) this).a((byte) 125, param2, param0);
        var12.a((wda) (Object) var5, 0);
        fra var6 = new fra(param2, param0);
        up var7 = new up(0, 10);
        var7.b(1, 15);
        var6.a(true, var7);
        var6.a((byte) -24, true);
        var12.a((byte) 83, (nv) (Object) var6);
        fsa var8 = new fsa(param2, param0);
        var8.b((byte) -11, 1048576, 1048576);
        var8.h(3, param1 ^ 3);
        var8.a(3, (byte) -12, true);
        var8.a((byte) -3, 0);
        var8.b((byte) 17, true);
        eq var9 = new eq(param2, param0);
        var8.a((byte) 83, (nv) (Object) var9);
        var12.a(-128, var8);
        mfa var10 = rm.field_a;
        fu var11 = (fu) (Object) var10.a(8, param1 + 119);
        var11.a(false, 1);
        var12.a((gr) (Object) var6, (byte) 124, (dg) (Object) var11);
        return var12;
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
            return false;
        }
        return true;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_O = null;
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            uk.s((byte) -72);
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final boolean A(int param0) {
        int var2 = 16 % ((0 - param0) / 60);
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        ((uk) this).b(66, 4194304, 4194304);
    }

    uk(la param0, int param1) {
        super(param0, param1);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            boolean discarded$0 = ((uk) this).A(-19);
            return false;
        }
        return false;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -102 / ((-92 - param1) / 34);
        return false;
    }

    public static void s(byte param0) {
        field_M = null;
        field_O = null;
        if (param0 < 112) {
            boolean discarded$0 = uk.a(27, (byte) 64, 114);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new char[128];
        field_M = new su(0, 2, 2, 1);
    }
}
