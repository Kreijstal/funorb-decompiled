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
            this.field_H = 63;
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
            this.field_H = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            this.field_H = -119;
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, this.field_H, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lda.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        lpa var5 = null;
        fsa var6 = null;
        fsa var7 = null;
        eq var8 = null;
        eq var9 = null;
        mfa var10 = null;
        vsa var11 = null;
        int var12 = 0;
        fsa var13 = null;
        fsa stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = new fsa(param2, param0);
              if ((this.field_m ^ -1) != -47) {
                var13.b((byte) -11, this.field_k, 4194304);
                break L1;
              } else {
                var13.b((byte) -11, 4194304, this.field_l);
                if (var12 == 0) {
                  break L1;
                } else {
                  var13.b((byte) -11, this.field_k, 4194304);
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var5 = new lpa(param2, param0);
                var5.b(-5, this.field_H);
                var13.a((byte) 83, (nv) (var5));
                var6 = new fsa(param2, param0);
                var7 = new fsa(param2, param0);
                if (-47 == (this.field_m ^ -1)) {
                  break L3;
                } else {
                  var6.b((byte) -11, this.field_k, 524288);
                  var6.b(437453352, 0, -1835008);
                  var7.b((byte) -11, this.field_k, 524288);
                  var7.b(437453352, 0, 1835008);
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6.b((byte) -11, 524288, this.field_l);
              var6.b(437453352, -1835008, 0);
              var7.b((byte) -11, 524288, this.field_l);
              var7.b(437453352, 1835008, 0);
              break L2;
            }
            var6.b((byte) 17, false);
            var6.h(3, param1 + -3);
            var8 = new eq(param2, param0);
            var8.a(true, -45);
            var8.a(-28592, true);
            var6.a((byte) 83, (nv) (var8));
            var7.b((byte) 17, false);
            var7.h(param1, 0);
            var9 = new eq(param2, param0);
            var9.a(true, -128);
            var9.a(-28592, true);
            var7.a((byte) 83, (nv) (var9));
            var13.a(-107, var6);
            var13.a(param1 ^ -61, var7);
            var10 = rm.field_a;
            var11 = (vsa) ((Object) var10.a(19, param1 ^ 106));
            var11.b((byte) 80, 0);
            var13.a(var5, (byte) 124, var11);
            stackOut_10_0 = (fsa) (var13);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("lda.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    public static void r(byte param0) {
        field_G = null;
        if (param0 >= -38) {
            field_G = (String) null;
            field_F = null;
            field_I = null;
            return;
        }
        field_F = null;
        field_I = null;
    }

    final boolean z(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.s(26);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        field_I = "Offer draw";
        field_G = "Moving platforms";
    }
}
