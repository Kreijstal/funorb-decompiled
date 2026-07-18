/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lda extends kna {
    static jea field_F;
    private int field_H;
    static String field_I;
    static String field_G;

    final int t(int param0) {
        if (param0 != 8) {
            ((lda) this).field_H = 63;
            return 7;
        }
        return 7;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return false;
        }
        return false;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return true;
    }

    lda(la param0, int param1) {
        super(param0, param1);
    }

    lda(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        try {
            ((lda) this).field_H = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((lda) this).field_H = -119;
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, ((lda) this).field_H, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "lda.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        fsa var4_ref = null;
        lpa var5 = null;
        fsa var6 = null;
        fsa var7 = null;
        eq var8 = null;
        eq var9 = null;
        mfa var10 = null;
        vsa var11 = null;
        int var12 = 0;
        fsa var13 = null;
        fsa stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new fsa(param2, param0);
              var4_ref = var13;
              if (((lda) this).field_m != 46) {
                var13.b((byte) -11, ((lda) this).field_k, 4194304);
                break L1;
              } else {
                var13.b((byte) -11, 4194304, ((lda) this).field_l);
                break L1;
              }
            }
            L2: {
              var5 = new lpa(param2, param0);
              var5.b(-5, ((lda) this).field_H);
              var13.a((byte) 83, (nv) (Object) var5);
              var6 = new fsa(param2, param0);
              var7 = new fsa(param2, param0);
              if (((lda) this).field_m == 46) {
                var6.b((byte) -11, 524288, ((lda) this).field_l);
                var6.b(437453352, -1835008, 0);
                var7.b((byte) -11, 524288, ((lda) this).field_l);
                var7.b(437453352, 1835008, 0);
                break L2;
              } else {
                var6.b((byte) -11, ((lda) this).field_k, 524288);
                var6.b(437453352, 0, -1835008);
                var7.b((byte) -11, ((lda) this).field_k, 524288);
                var7.b(437453352, 0, 1835008);
                break L2;
              }
            }
            var6.b((byte) 17, false);
            var6.h(3, param1 + -3);
            var8 = new eq(param2, param0);
            var8.a(true, -45);
            var8.a(-28592, true);
            var6.a((byte) 83, (nv) (Object) var8);
            var7.b((byte) 17, false);
            var7.h(param1, 0);
            var9 = new eq(param2, param0);
            var9.a(true, -128);
            var9.a(-28592, true);
            var7.a((byte) 83, (nv) (Object) var9);
            var13.a(-107, var6);
            var13.a(param1 ^ -61, var7);
            var10 = rm.field_a;
            var11 = (vsa) (Object) var10.a(19, param1 ^ 106);
            var11.b((byte) 80, 0);
            var13.a((gr) (Object) var5, (byte) 124, (dg) (Object) var11);
            stackOut_7_0 = (fsa) var13;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("lda.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    public static void r() {
        field_G = null;
        field_F = null;
        field_I = null;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((lda) this).s(26);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Offer draw";
        field_G = "Moving platforms";
    }
}
