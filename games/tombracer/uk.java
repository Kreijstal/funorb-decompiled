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
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 15) {
                break L1;
              } else {
                uk.s((byte) 58);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param2 <= 0) {
                    break L4;
                  } else {
                    var3_int = 1 & param0 | var3_int << -193105279;
                    param2--;
                    stackOut_5_0 = param0 >>> 1;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      param0 = stackIn_6_0;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_7_0 = var3_int;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "uk.TB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
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
            field_M = (su) null;
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
            var12.b((byte) -11, this.field_k, this.field_l);
            var12.h(0, param1 ^ param1);
            var12.a(4, (byte) -12, true);
            var12.a((byte) -3, 0);
            var12.b((byte) 17, true);
            var5 = this.a((byte) 125, param2, param0);
            var12.a(var5, 0);
            var6 = new fra(param2, param0);
            var7 = new up(0, 10);
            var7.b(1, 15);
            var6.a(true, var7);
            var6.a((byte) -24, true);
            var12.a((byte) 83, (nv) (var6));
            var8 = new fsa(param2, param0);
            var8.b((byte) -11, 1048576, 1048576);
            var8.h(3, param1 ^ 3);
            var8.a(3, (byte) -12, true);
            var8.a((byte) -3, 0);
            var8.b((byte) 17, true);
            var9 = new eq(param2, param0);
            var8.a((byte) 83, (nv) (var9));
            var12.a(-128, var8);
            var10 = rm.field_a;
            var11 = (fu) ((Object) var10.a(8, param1 + 119));
            var11.a(false, 1);
            var12.a(var6, (byte) 124, var11);
            stackOut_0_0 = (fsa) (var12);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("uk.AC(").append(param0).append(',').append(param1).append(',');
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

    final boolean C(int param0) {
        if (param0 != 1760) {
            return false;
        }
        return true;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_O = (char[]) null;
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
            throw tba.a((Throwable) ((Object) runtimeException), "uk.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean A(int param0) {
        int var2 = 16 % ((0 - param0) / 60);
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(66, 4194304, 4194304);
    }

    uk(la param0, int param1) {
        super(param0, param1);
    }

    final boolean n(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -122) {
            discarded$0 = this.A(-19);
            return false;
        }
        return false;
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = -102 / ((-92 - param1) / 34);
        return false;
    }

    public static void s(byte param0) {
        boolean discarded$0 = false;
        field_M = null;
        field_O = null;
        if (param0 < 112) {
            discarded$0 = uk.a(27, (byte) 64, 114);
        }
    }

    static {
        field_O = new char[128];
        field_M = new su(0, 2, 2, 1);
    }
}
