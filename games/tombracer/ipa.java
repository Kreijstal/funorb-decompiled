/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ipa extends ra {
    static kta field_P;
    static String field_N;
    static String field_O;
    static int[] field_M;
    private int field_Q;

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -122) {
            discarded$0 = this.v(-100);
            return true;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(104, 2097152, 2097152);
        this.a((byte) 125, new mka[]{new mka(0, 0, 2097152, 0, 40)});
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_N = (String) null;
            return true;
        }
        return true;
    }

    final static void s(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        fla var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            so.n(-16310);
            var1_int = -106 / ((-7 - param0) / 37);
            var2 = (fla) ((Object) nl.field_f.f(-80));
            L1: while (true) {
              if (var2 == null) {
                break L0;
              } else {
                var2.c(-97);
                if (var3 == 0) {
                  L2: {
                    if (-1 > (var2.field_h ^ -1)) {
                      break L2;
                    } else {
                      bca.a(var2.field_i, (byte) -42);
                      var2.p(25);
                      break L2;
                    }
                  }
                  var2 = (fla) ((Object) nl.field_f.e(107));
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ipa.UB(" + param0 + ')');
        }
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
            return false;
        }
        return true;
    }

    final static boolean a(kea param0, boolean param1, kia param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_14_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_17_0 = false;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ipa.D(8);
                break L1;
              }
            }
            if (param2 == ska.field_r) {
              if (param0 != baa.field_e) {
                if (tia.field_d != param0) {
                  stackOut_10_0 = laa.field_x.field_c;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_8_0 = paa.field_z.field_c;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_5_0 = kra.field_a.field_c;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              if (param0 == baa.field_e) {
                stackOut_14_0 = nj.field_t.field_c;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (tia.field_d != param0) {
                  stackOut_19_0 = daa.field_d.field_c;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  stackOut_17_0 = vea.field_c.field_c;
                  stackIn_18_0 = stackOut_17_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("ipa.TB(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          L3: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  return stackIn_20_0;
                }
              }
            }
          }
        }
    }

    ipa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        this.field_Q = 4;
        try {
            this.field_Q = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ipa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean z(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.C(8);
            return false;
        }
        return false;
    }

    public static void D(int param0) {
        field_P = null;
        field_M = null;
        field_O = null;
        field_N = null;
        if (param0 != 4) {
            field_O = (String) null;
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        ro var5 = null;
        mfa var6 = null;
        nq var7 = null;
        fsa var8 = null;
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
            var8 = new fsa(param2, param0);
            var8.b((byte) -11, this.field_k, this.field_l);
            var8.h(param1, 0);
            var8.a(1, (byte) -12, true);
            var8.a((byte) -3, 6);
            var8.b((byte) 17, false);
            var8.g(126, 2);
            var8.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = this.a((byte) -41, param2, param0);
            var5.a(true, -606738686);
            var5.b(4, true);
            var5.c(this.field_Q * 8, -60);
            var8.a(var5, 0);
            var6 = rm.field_a;
            var7 = (nq) ((Object) var6.a(16, param1 + 71));
            var7.b(8022, 0);
            var8.a((gr) null, (byte) 124, var7);
            stackOut_0_0 = (fsa) (var8);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("ipa.AC(").append(param0).append(',').append(param1).append(',');
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

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -19, this.field_Q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ipa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            this.field_Q = 41;
            return 7;
        }
        return 7;
    }

    ipa(la param0, int param1) {
        super(param0, param1);
        this.field_Q = 4;
    }

    final boolean A(int param0) {
        int var2 = 21 / ((0 - param0) / 60);
        return true;
    }

    static {
        field_O = "Tips";
        field_M = new int[8192];
        field_N = "You have declined the invitation.";
    }
}
