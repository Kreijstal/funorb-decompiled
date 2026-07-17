/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends kna {
    private int field_J;
    private int field_O;
    private int field_L;
    static int field_H;
    private int field_I;
    static jpa[] field_F;
    static String field_K;
    private tl field_G;
    private int field_M;
    private boolean field_N;

    final lj u(int param0) {
        if (param0 > -60) {
            ((ga) this).field_M = -115;
            return (lj) (Object) ((ga) this).field_G;
        }
        return (lj) (Object) ((ga) this).field_G;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    ga(la param0, int param1) {
        super(param0, param1);
        ((ga) this).field_M = 131072;
        ((ga) this).field_J = 524288;
        ((ga) this).field_I = 262144;
        ((ga) this).field_O = 65536;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        eq var5 = null;
        wi var6 = null;
        wi var7 = null;
        int[] var8 = null;
        mg var9 = null;
        int var10 = 0;
        jma var11 = null;
        mfa var12 = null;
        lma var13 = null;
        fsa var14 = null;
        fsa stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var14 = new fsa(param2, param0);
              var14.b((byte) -11, ((ga) this).field_k, ((ga) this).field_l);
              var14.h(3, 0);
              var14.a(1, (byte) -12, true);
              var14.g(param1 + 122, 2);
              var14.a((byte) -3, 20);
              var14.b((byte) 17, true);
              var5 = new eq(param2, param0);
              var14.a((byte) 83, (nv) (Object) var5);
              var6 = new wi(param2, param0);
              var6.c(((ga) this).field_J, 26621);
              var14.a((wda) (Object) var6, 0);
              var7 = new wi(param2, param0);
              var7.c(((ga) this).field_I, 26621);
              var7.d(4, 4096);
              var7.m(112);
              var14.a((wda) (Object) var7, param1 ^ param1);
              ((ga) this).field_G = new tl(param2, param0);
              var8 = new int[]{((ga) this).field_O * 50 >> 16, ((ga) this).field_M * 50 >> 16};
              var9 = new mg(var8);
              if (!((ga) this).field_N) {
                var10 = ((ga) this).field_L;
                break L1;
              } else {
                var10 = param2.q(-86).a(16, 0);
                break L1;
              }
            }
            L2: {
              var10 = var10 * var9.a((byte) -94) / 16;
              var9.a(false, var10);
              if (var10 > 50 * ((ga) this).field_O) {
                var6.m(-24);
                var7.m(-70);
                break L2;
              } else {
                break L2;
              }
            }
            ((ga) this).field_G.a(var9, (byte) -120);
            var11 = ((ga) this).field_G.k((byte) -91);
            var11.b(0, 55);
            var11.h(param1 + -2).a(9, new lj[2]);
            var14.a((byte) 83, (nv) (Object) ((ga) this).field_G);
            var12 = rm.field_a;
            var13 = (lma) (Object) var12.a(15, 93);
            var14.a((gr) null, (byte) 124, (dg) (Object) var13);
            stackOut_6_0 = (fsa) var14;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ga.AC(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    ga(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((ga) this).field_M = 131072;
        ((ga) this).field_J = 524288;
        ((ga) this).field_I = 262144;
        ((ga) this).field_O = 65536;
        try {
          L0: {
            L1: {
              ((ga) this).field_O = ji.a(param2.b((byte) 44, 4), 116, 2);
              ((ga) this).field_J = ji.a(param2.b((byte) 44, 8), 100, 4);
              ((ga) this).field_M = ji.a(param2.b((byte) 44, 4), 88, 2);
              ((ga) this).field_I = ji.a(param2.b((byte) 44, 8), 107, 4);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (1 != param2.b((byte) 44, 1)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((ga) this).field_N = stackIn_4_1 != 0;
            if (((ga) this).field_N) {
              break L0;
            } else {
              ((ga) this).field_L = param2.b((byte) 44, 4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ga.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static boolean r() {
        return hb.field_t instanceof qh;
    }

    final void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        kh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              param1.a((byte) -128, wma.a((byte) 8, 2, ((ga) this).field_O), 4);
              param1.a((byte) -127, wma.a((byte) 8, 4, ((ga) this).field_J), 8);
              param1.a((byte) -4, wma.a((byte) 8, 2, ((ga) this).field_M), 4);
              param1.a((byte) -17, wma.a((byte) 8, 4, ((ga) this).field_I), 8);
              stackOut_0_0 = (kh) param1;
              stackOut_0_1 = -127;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (((ga) this).field_N) {
                stackOut_2_0 = (kh) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (kh) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
              if (((ga) this).field_N) {
                break L2;
              } else {
                param1.a((byte) -33, ((ga) this).field_L, 4);
                break L2;
              }
            }
            if (!param0) {
              break L0;
            } else {
              ((ga) this).field_J = -119;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ga.V(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    public static void A() {
        field_K = null;
        field_F = null;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            Object var3 = null;
            fsa discarded$0 = ((ga) this).a(false, -124, (la) null);
            return true;
        }
        return true;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            boolean discarded$0 = ((ga) this).z(41);
            return true;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return true;
        }
        return true;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((ga) this).t(108);
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((ga) this).v(-115);
            return 7;
        }
        return 7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Won <%0> round(s)";
        field_H = 0;
    }
}
