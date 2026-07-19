/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends kna {
    static jpa field_F;
    static jea field_I;
    static int[] field_H;
    static hs field_G;

    final static boolean c(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -17275) {
          L0: {
            field_F = (jpa) null;
            if ((55 & param2) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((55 & param2) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_H = (int[]) null;
            return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(param0 ^ -66, 2097152, 2097152);
    }

    final static boolean d(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -26571) {
          L0: {
            field_G = (hs) null;
            if ((384 & param1) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((384 & param1) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void A(int param0) {
        field_H = null;
        field_F = null;
        if (param0 != 4) {
          field_F = (jpa) null;
          field_G = null;
          field_I = null;
          return;
        } else {
          field_G = null;
          field_I = null;
          return;
        }
    }

    final boolean z(int param0) {
        ci discarded$0 = null;
        if (param0 != 0) {
            uia var3 = (uia) null;
            discarded$0 = aw.a((uia) null, -27);
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_H = (int[]) null;
            return 7;
        }
        return 7;
    }

    aw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final static ci a(uia param0, int param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        ci var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ci stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ci stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            discarded$2 = param0.h(255);
            var2_int = param0.h(param1 + 255);
            var3 = gu.a((byte) -62, var2_int);
            var3.field_f = param0.h(param1 + 255);
            var4 = param0.h(param1 ^ 255);
            var5 = param1;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  var3.b((byte) 116);
                  break L2;
                } else {
                  var6 = param0.h(param1 + 255);
                  var3.a((byte) 107, param0, var6);
                  var5++;
                  if (var7 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_7_0 = (ci) (var3);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("aw.TB(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    aw(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aw.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eq var5 = null;
        fsa var6 = null;
        mc var7 = null;
        mfa var8 = null;
        int var10 = 0;
        fsa var11 = null;
        nq var12 = null;
        nq var13 = null;
        boa var14 = null;
        fsa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = new fsa(param2, param0);
              var11.b((byte) -11, this.field_k, this.field_l);
              var11.a((byte) -3, 4);
              var11.h(param1, param1 + -3);
              if ((this.field_m ^ -1) != -20) {
                var11.e(false, 120);
                break L1;
              } else {
                var11.e(true, 117);
                if (var10 == 0) {
                  break L1;
                } else {
                  var11.e(false, 120);
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var11.g(104, 1);
                var11.b((byte) 17, false);
                var11.a(1, (byte) -12, true);
                var5 = new eq(param2, param0);
                var5.a(-28592, true);
                var11.a((byte) 83, (nv) (var5));
                var6 = new fsa(param2, param0);
                var6.b((byte) -11, this.field_k, this.field_l);
                var6.a((byte) -3, 0);
                var7 = new mc(param2, param0);
                var6.a((byte) 83, (nv) (var7));
                var11.a(-98, var6);
                var8 = rm.field_a;
                if (this.field_m != 19) {
                  break L3;
                } else {
                  var12 = (nq) ((Object) var8.a(16, 127));
                  var12.b(param1 + 8019, 1);
                  var11.a((gr) null, (byte) 124, var12);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var13 = (nq) ((Object) var8.a(16, param1 ^ 105));
              var13.b(8022, 4);
              var11.a((gr) null, (byte) 124, var13);
              break L2;
            }
            var14 = (boa) ((Object) var8.a(7, 125));
            var14.b(param1 + 116, 9);
            var11.a(var7, (byte) 124, var14);
            stackOut_9_0 = (fsa) (var11);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("aw.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    static {
        field_H = new int[]{0};
        field_G = new hs();
    }
}
