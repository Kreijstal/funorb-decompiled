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
          if (!TombRacer.field_G) {
            if (param4) {
              return;
            } else {
              return;
            }
          } else {
            nra.a((byte) -55, param1, param0, vaa.field_a[param2], param3);
            if (param4) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean s(int param0) {
        boolean discarded$0 = false;
        if (param0 != -15254) {
            discarded$0 = this.z(71);
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
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uca[] var4 = null;
        int var5 = 0;
        uca var6_ref_uca = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        uca[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        boolean stackOut_6_0 = false;
        uca[] stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 44, 8);
            if (var2_int <= 0) {
              var3 = param0.b((byte) 44, 12);
              var4 = new uca[var3];
              var5 = 0;
              L1: while (true) {
                L2: {
                  if (var3 <= var5) {
                    stackOut_11_0 = 64 % ((param1 - -52) / 37);
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_6_0 = uha.a(5907, param0);
                    stackIn_12_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            var6_ref_uca = new uca();
                            discarded$12 = param0.b((byte) 44, 24);
                            discarded$13 = param0.b((byte) 44, 24);
                            var6_ref_uca.field_e = param0.b((byte) 44, 24);
                            discarded$14 = param0.b((byte) 44, 9);
                            discarded$15 = param0.b((byte) 44, 12);
                            discarded$16 = param0.b((byte) 44, 12);
                            discarded$17 = param0.b((byte) 44, 12);
                            var4[var5] = var6_ref_uca;
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var6 = param0.b((byte) 44, nma.b(false, var5 + -1));
                        var4[var5] = var4[var6];
                        break L3;
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
                var6 = stackIn_12_0;
                stackOut_12_0 = (uca[]) (var4);
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("uea.SB(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uca[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_13_0;
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
        int discarded$0 = 0;
        if (param0 != 555277520) {
            discarded$0 = this.t(7);
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
            stackOut_0_0 = (fsa) (var9);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("uea.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
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
