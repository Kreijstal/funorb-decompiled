/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uea extends kna {
    uea(la param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param3 <= param0) {
          nra.a((byte) -55, param1, param0, vaa.field_a[param2], param3);
          if (param4) {
            return;
          } else {
            return;
          }
        } else {
          nra.a((byte) -55, param1, param3, vaa.field_a[param2], param0);
          if (param4) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.z(71);
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 + 174, 2097152, 2097152);
    }

    uea(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static uca[] a(kh param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        uca[] var4 = null;
        int var5 = 0;
        uca var6_ref_uca = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        uca[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
                  var6 = 64 % ((param1 - -52) / 37);
                  stackIn_12_0 = (uca[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (!uha.a(5907, param0)) {
                      var6 = param0.b((byte) 44, nma.b(false, var5 + -1));
                      var4[var5] = var4[var6];
                      break L2;
                    } else {
                      var6_ref_uca = new uca();
                      param0.b((byte) 44, 24);
                      param0.b((byte) 44, 24);
                      var6_ref_uca.field_e = param0.b((byte) 44, 24);
                      param0.b((byte) 44, 9);
                      param0.b((byte) 44, 12);
                      param0.b((byte) 44, 12);
                      param0.b((byte) 44, 12);
                      var4[var5] = var6_ref_uca;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("uea.SB(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uca[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_12_0;
        }
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
            throw tba.a((Throwable) ((Object) runtimeException), "uea.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            this.t(7);
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
            this.q((byte) 37);
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, this.field_k, this.field_l);
            var9.a((byte) -3, 5);
            var5 = new eq(param2, param0);
            var9.a((byte) 83, (nv) (var5));
            var9.b((byte) 17, false);
            var9.a(1, (byte) -12, false);
            var9.h(3, param1 + -3);
            var6 = rm.field_a;
            var7 = (am) ((Object) var6.a(4, 91));
            var7.b(0, (byte) 77);
            var9.a((gr) null, (byte) 124, var7);
            var8 = (gaa) ((Object) var6.a(5, 74));
            var8.a(64, 122);
            var8.a(true, 16633231);
            var8.b(1, 128);
            var8.a(0, param1, 1, true);
            var9.a((gr) null, (byte) 124, var8);
            stackIn_1_0 = (fsa) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("uea.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
    }
}
