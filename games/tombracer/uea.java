/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends kna {
    uea(la param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param3 > param0) {
          nra.a((byte) -55, param1, param3, vaa.field_a[param2], param0);
          return;
        } else {
          nra.a((byte) -55, param1, param0, vaa.field_a[param2], param3);
          return;
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            boolean discarded$0 = ((uea) this).z(71);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        ((uea) this).b(param0 + 174, 2097152, 2097152);
    }

    uea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static uca[] a(kh param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uca[] var4 = null;
        int var5 = 0;
        uca var6_ref_uca = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        uca[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        uca[] stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 44, 8);
            if (var2_int <= 0) {
              var3 = param0.b((byte) 44, 12);
              var4 = new uca[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  var6 = 0;
                  stackOut_13_0 = (uca[]) var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  L2: {
                    if (!uha.a(5907, param0)) {
                      var6 = param0.b((byte) 44, nma.b(false, var5 + -1));
                      var4[var5] = var4[var6];
                      var5++;
                      break L2;
                    } else {
                      var6_ref_uca = new uca();
                      int discarded$126 = param0.b((byte) 44, 24);
                      int discarded$127 = param0.b((byte) 44, 24);
                      var6_ref_uca.field_e = param0.b((byte) 44, 24);
                      int discarded$128 = param0.b((byte) 44, 9);
                      int discarded$129 = param0.b((byte) 44, 12);
                      int discarded$130 = param0.b((byte) 44, 12);
                      int discarded$131 = param0.b((byte) 44, 12);
                      var4[var5] = var6_ref_uca;
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (uca[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("uea.SB(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 8 + 41);
        }
        return stackIn_14_0;
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -20;
        }
        return 7;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uea.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            int discarded$0 = ((uea) this).t(7);
            return false;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((uea) this).q((byte) 37);
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eq var5 = null;
        mfa var6 = null;
        am var7 = null;
        gaa var8 = null;
        fsa var9 = null;
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
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, ((uea) this).field_k, ((uea) this).field_l);
            var9.a((byte) -3, 5);
            var5 = new eq(param2, param0);
            var9.a((byte) 83, (nv) (Object) var5);
            var9.b((byte) 17, false);
            var9.a(1, (byte) -12, false);
            var9.h(3, param1 + -3);
            var6 = rm.field_a;
            var7 = (am) (Object) var6.a(4, 91);
            var7.b(0, (byte) 77);
            var9.a((gr) null, (byte) 124, (dg) (Object) var7);
            var8 = (gaa) (Object) var6.a(5, 74);
            var8.a(64, 122);
            var8.a(true, 16633231);
            var8.b(1, 128);
            var8.a(0, param1, 1, true);
            var9.a((gr) null, (byte) 124, (dg) (Object) var8);
            stackOut_0_0 = (fsa) var9;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("uea.AC(").append(param0).append(44).append(param1).append(44);
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

    static {
    }
}
