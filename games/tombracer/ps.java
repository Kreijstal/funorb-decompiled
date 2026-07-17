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
        try {
            ((ps) this).field_M = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ps.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
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
        RuntimeException var4_ref = null;
        lpa var5 = null;
        ro var6 = null;
        mfa var7 = null;
        ce var8 = null;
        Object stackIn_2_0 = null;
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new fsa(param2, param0);
            var4.b((byte) -11, ((ps) this).field_k, ((ps) this).field_l);
            var5 = new lpa(param2, false);
            var5.b(-5, ((ps) this).field_M);
            var5.a((byte) -24, true);
            if (param1 == 3) {
              var4.a((byte) 83, (nv) (Object) var5);
              var6 = ((ps) this).a((byte) -104, param2, param0);
              var4.a((wda) (Object) var6, 0);
              var7 = rm.field_a;
              var8 = (ce) (Object) var7.a(17, 88);
              var8.b(2, (byte) 23);
              var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
              stackOut_3_0 = (fsa) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fsa) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("ps.AC(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 84, ((ps) this).field_M, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ps.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
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
