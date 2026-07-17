/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends hn {
    static String field_K;
    static boolean field_L;

    final void a(boolean param0, kh param1) {
        try {
            if (param0) {
                field_K = null;
            }
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uc.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    uc(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean D(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((uc) this).a(false, (kh) null);
            return true;
        }
        return true;
    }

    final fsa a(la param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
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
            if (param1) {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("uc.VB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (fsa) (Object) stackIn_3_0;
    }

    final fsa a(int param0, boolean param1, la param2) {
        RuntimeException var4 = null;
        eq var5 = null;
        cu var6 = null;
        kpa var7 = null;
        mfa var8 = null;
        boa var9 = null;
        fsa var10 = null;
        fsa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var10 = new fsa(param2, param1);
              var10.b((byte) -11, 2097152, 2097152);
              var10.a((byte) -3, 4);
              var10.h(3, 0);
              var10.e(true, param0 + 116);
              var10.g(124, 1);
              var10.b((byte) 17, false);
              var10.b(false, 11468);
              var10.a(1, (byte) -12, true);
              var5 = new eq(param2, param1);
              var10.a((byte) 83, (nv) (Object) var5);
              var10.d(25, -1);
              var6 = new cu(param2, param1);
              var6.b((byte) 0, true);
              var6.b(1, 50, param0 + -5);
              var7 = var6.j((byte) -112);
              var7.a(false, 67);
              var7.a(0, -17075, true);
              var10.a((byte) 83, (nv) (Object) var6);
              if (param0 == 5) {
                break L1;
              } else {
                field_L = true;
                break L1;
              }
            }
            var8 = rm.field_a;
            var9 = (boa) (Object) var8.a(7, 75);
            var9.b(124, 0);
            var10.a((gr) null, (byte) 124, (dg) (Object) var9);
            stackOut_2_0 = (fsa) var10;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("uc.SB(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final boolean C(int param0) {
        if (param0 != 1) {
            uc.E(94);
            return true;
        }
        return true;
    }

    uc(la param0, int param1) {
        super(param0, param1);
    }

    public static void E(int param0) {
        if (param0 != 7) {
            uc.E(126);
            field_K = null;
            return;
        }
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Hold to grab and drag objects. Press to drop a carried object.";
    }
}
