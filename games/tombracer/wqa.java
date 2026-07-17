/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wqa extends kna {
    private int field_I;
    static String field_J;
    static int field_G;
    static String field_F;
    static String field_H;

    wqa(la param0, int param1) {
        super(param0, param1);
        ((wqa) this).field_I = 262144;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            ((wqa) this).field_I = 69;
            return true;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
            Object var3 = null;
            fsa discarded$0 = ((wqa) this).a(false, 31, (la) null);
            return 7;
        }
        return 7;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_J = null;
            return false;
        }
        return false;
    }

    final static boolean r(byte param0) {
        int var1 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var1 = -84 % ((27 - param0) / 45);
        if (hka.field_b == null) {
          if (!pn.h(9807)) {
            if (null == fj.field_c) {
              int discarded$4 = 1;
              if (eba.a()) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            boolean discarded$0 = wqa.r((byte) 71);
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 15, wma.a((byte) 8, 2, ((wqa) this).field_I), 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wqa.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eq var5 = null;
        tl var6 = null;
        fsa var7 = null;
        int var8 = 0;
        int var9 = 0;
        eq var10 = null;
        mfa var11 = null;
        pqa var12 = null;
        fsa var13 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var13 = new fsa(param2, param0);
            var13.b((byte) -11, ((wqa) this).field_k, ((wqa) this).field_l);
            var13.a((byte) -3, 0);
            var13.h(3, param1 ^ param1);
            var13.e(false, param1 + 116);
            var13.b((byte) 17, true);
            var13.a(1, (byte) -12, true);
            var5 = new eq(param2, param0);
            var13.a((byte) 83, (nv) (Object) var5);
            var6 = new tl(param2, param0);
            var6.a(new mg(50 * ((wqa) this).field_I >> 16), (byte) -105);
            var6.k((byte) -91).b(1, 97);
            var13.a((byte) 83, (nv) (Object) var6);
            var7 = new fsa(param2, true);
            var8 = param2.m((byte) -86);
            var9 = param2.s(-127);
            var7.b((byte) -11, var9, var8);
            var7.b(437453352, var9 / 2, var8 / 2);
            var7.a((byte) -3, 0);
            var7.b((byte) 17, true);
            var10 = new eq(param2, true);
            var10.b((byte) -106, true);
            var10.a(16, (byte) -22);
            var7.a((byte) 83, (nv) (Object) var10);
            var7.m(-45);
            param2.a(var7, (byte) 32);
            var6.k((byte) -115).h(1).a(9, new lj[1]);
            var11 = rm.field_a;
            var12 = (pqa) (Object) var11.a(20, 83);
            var13.a((gr) (Object) var6, (byte) 124, (dg) (Object) var12);
            stackOut_0_0 = (fsa) var13;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("wqa.AC(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void e() {
        field_J = null;
        field_F = null;
        field_H = null;
    }

    wqa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((wqa) this).field_I = 262144;
        try {
            ((wqa) this).field_I = ji.a(param2.b((byte) 44, 6), 87, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wqa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((wqa) this).b(82, 4194304, 4194304);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
        field_F = "You can't slay these septic serpents, so steer clear - or hold <img=10><img=11> to sneak over them.";
        field_J = "The game options are not all set.";
        field_H = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
