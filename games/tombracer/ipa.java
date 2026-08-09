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
        if (param0 != -122) {
            this.v(-100);
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
        fla var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
                L2: {
                  var2.c(-97);
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_11_0 = laa.field_x.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = paa.field_z.field_c;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_6_0 = kra.field_a.field_c;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              if (param0 == baa.field_e) {
                stackIn_15_0 = nj.field_t.field_c;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (tia.field_d != param0) {
                  stackIn_20_0 = daa.field_d.field_c;
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  stackIn_18_0 = vea.field_c.field_c;
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
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("ipa.TB(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
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
        if (param0 != 0) {
            this.C(8);
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_1_0 = (fsa) (var8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("ipa.AC(").append(param0).append(',').append(param1).append(',');

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
