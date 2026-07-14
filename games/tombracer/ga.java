/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends kna {
    private int field_J;
    private int field_O;
    private int field_L;
    static int field_H;
    private int field_I;
    static jpa[] field_F;
    static String field_K;
    private tl field_G;
    private int field_M;
    private boolean field_N;

    final lj u(int param0) {
        if (param0 > -60) {
            ((ga) this).field_M = -115;
            return (lj) (Object) ((ga) this).field_G;
        }
        return (lj) (Object) ((ga) this).field_G;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    ga(la param0, int param1) {
        super(param0, param1);
        ((ga) this).field_M = 131072;
        ((ga) this).field_J = 524288;
        ((ga) this).field_I = 262144;
        ((ga) this).field_O = 65536;
    }

    final fsa a(boolean param0, int param1, la param2) {
        eq var5 = null;
        wi var6 = null;
        wi var7 = null;
        int[] var8 = null;
        mg var9 = null;
        int var10 = 0;
        jma var11 = null;
        mfa var12 = null;
        lma var13 = null;
        fsa var14 = null;
        L0: {
          var14 = new fsa(param2, param0);
          var14.b((byte) -11, ((ga) this).field_k, ((ga) this).field_l);
          var14.h(3, 0);
          var14.a(1, (byte) -12, true);
          var14.g(param1 + 122, 2);
          var14.a((byte) -3, 20);
          var14.b((byte) 17, true);
          var5 = new eq(param2, param0);
          var14.a((byte) 83, (nv) (Object) var5);
          var6 = new wi(param2, param0);
          var6.c(((ga) this).field_J, 26621);
          var14.a((wda) (Object) var6, 0);
          var7 = new wi(param2, param0);
          var7.c(((ga) this).field_I, 26621);
          var7.d(4, 4096);
          var7.m(112);
          var14.a((wda) (Object) var7, param1 ^ param1);
          ((ga) this).field_G = new tl(param2, param0);
          var8 = new int[]{((ga) this).field_O * 50 >> 937036240, ((ga) this).field_M * 50 >> -496487984};
          var9 = new mg(var8);
          if (!((ga) this).field_N) {
            var10 = ((ga) this).field_L;
            break L0;
          } else {
            var10 = param2.q(-86).a(16, 0);
            break L0;
          }
        }
        L1: {
          var10 = var10 * var9.a((byte) -94) / 16;
          var9.a(false, var10);
          if (var10 > 50 * ((ga) this).field_O) {
            var6.m(-24);
            var7.m(-70);
            break L1;
          } else {
            break L1;
          }
        }
        ((ga) this).field_G.a(var9, (byte) -120);
        var11 = ((ga) this).field_G.k((byte) -91);
        var11.b(0, 55);
        var11.h(param1 + -2).a(9, new lj[2]);
        var14.a((byte) 83, (nv) (Object) ((ga) this).field_G);
        var12 = rm.field_a;
        var13 = (lma) (Object) var12.a(15, 93);
        var14.a((gr) null, (byte) 124, (dg) (Object) var13);
        return var14;
    }

    ga(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((ga) this).field_M = 131072;
        ((ga) this).field_J = 524288;
        ((ga) this).field_I = 262144;
        ((ga) this).field_O = 65536;
        ((ga) this).field_O = ji.a(param2.b((byte) 44, 4), 116, 2);
        ((ga) this).field_J = ji.a(param2.b((byte) 44, 8), 100, 4);
        ((ga) this).field_M = ji.a(param2.b((byte) 44, 4), 88, 2);
        ((ga) this).field_I = ji.a(param2.b((byte) 44, 8), 107, 4);
        ((ga) this).field_N = 1 == param2.b((byte) 44, 1) ? true : false;
        if (!((ga) this).field_N) {
            ((ga) this).field_L = param2.b((byte) 44, 4);
        }
    }

    final static boolean r(byte param0) {
        if (param0 > -14) {
            ga.A(-59);
            return hb.field_t instanceof qh;
        }
        return hb.field_t instanceof qh;
    }

    final void a(boolean param0, kh param1) {
        kh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        kh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        L0: {
          super.a(param0, param1);
          param1.a((byte) -128, wma.a((byte) 8, 2, ((ga) this).field_O), 4);
          param1.a((byte) -127, wma.a((byte) 8, 4, ((ga) this).field_J), 8);
          param1.a((byte) -4, wma.a((byte) 8, 2, ((ga) this).field_M), 4);
          param1.a((byte) -17, wma.a((byte) 8, 4, ((ga) this).field_I), 8);
          stackOut_0_0 = (kh) param1;
          stackOut_0_1 = -127;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (((ga) this).field_N) {
            stackOut_2_0 = (kh) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (kh) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
        if (((ga) this).field_N) {
          if (param0) {
            ((ga) this).field_J = -119;
            return;
          } else {
            return;
          }
        } else {
          param1.a((byte) -33, ((ga) this).field_L, 4);
          if (!param0) {
            return;
          } else {
            ((ga) this).field_J = -119;
            return;
          }
        }
    }

    public static void A(int param0) {
        field_K = null;
        field_F = null;
        if (param0 != 4096) {
            field_F = null;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            Object var3 = null;
            fsa discarded$0 = ((ga) this).a(false, -124, (la) null);
            return true;
        }
        return true;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            boolean discarded$0 = ((ga) this).z(41);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((ga) this).t(108);
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((ga) this).v(-115);
            return 7;
        }
        return 7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Won <%0> round(s)";
        field_H = 0;
    }
}
