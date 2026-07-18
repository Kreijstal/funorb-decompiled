/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ra {
    static su field_M;
    static char[] field_O;
    static int field_N;

    final static int c(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param2 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = 1 & param0 | var3_int << 1;
                param2--;
                param0 = param0 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "uk.TB(" + param0 + ',' + 15 + ',' + param2 + ')');
        }
        return stackIn_5_0;
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
        RuntimeException var4 = null;
        ro var5 = null;
        fra var6 = null;
        up var7 = null;
        fsa var8 = null;
        eq var9 = null;
        mfa var10 = null;
        fu var11 = null;
        fsa var12 = null;
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
            var12 = new fsa(param2, param0);
            var12.b((byte) -11, ((uk) this).field_k, ((uk) this).field_l);
            var12.h(0, param1 ^ param1);
            var12.a(4, (byte) -12, true);
            var12.a((byte) -3, 0);
            var12.b((byte) 17, true);
            var5 = ((uk) this).a((byte) 125, param2, param0);
            var12.a((wda) (Object) var5, 0);
            var6 = new fra(param2, param0);
            var7 = new up(0, 10);
            var7.b(1, 15);
            var6.a(true, var7);
            var6.a((byte) -24, true);
            var12.a((byte) 83, (nv) (Object) var6);
            var8 = new fsa(param2, param0);
            var8.b((byte) -11, 1048576, 1048576);
            var8.h(3, param1 ^ 3);
            var8.a(3, (byte) -12, true);
            var8.a((byte) -3, 0);
            var8.b((byte) 17, true);
            var9 = new eq(param2, param0);
            var8.a((byte) 83, (nv) (Object) var9);
            var12.a(-128, var8);
            var10 = rm.field_a;
            var11 = (fu) (Object) var10.a(8, param1 + 119);
            var11.a(false, 1);
            var12.a((gr) (Object) var6, (byte) 124, (dg) (Object) var11);
            stackOut_0_0 = (fsa) var12;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("uk.AC(").append(param0).append(',').append(param1).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
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
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uk.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
