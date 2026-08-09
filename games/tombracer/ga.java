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
            this.field_M = -115;
            return (lj) ((Object) this.field_G);
        }
        return (lj) ((Object) this.field_G);
    }

    final void q(byte param0) {
        super.q(param0);
    }

    ga(la param0, int param1) {
        super(param0, param1);
        this.field_M = 131072;
        this.field_J = 524288;
        this.field_I = 262144;
        this.field_O = 65536;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var14 = new fsa(param2, param0);
              var14.b((byte) -11, this.field_k, this.field_l);
              var14.h(3, 0);
              var14.a(1, (byte) -12, true);
              var14.g(param1 + 122, 2);
              var14.a((byte) -3, 20);
              var14.b((byte) 17, true);
              var5 = new eq(param2, param0);
              var14.a((byte) 83, (nv) (var5));
              var6 = new wi(param2, param0);
              var6.c(this.field_J, 26621);
              var14.a(var6, 0);
              var7 = new wi(param2, param0);
              var7.c(this.field_I, 26621);
              var7.d(4, 4096);
              var7.m(112);
              var14.a(var7, param1 ^ param1);
              this.field_G = new tl(param2, param0);
              var8 = new int[]{this.field_O * 50 >> 937036240, this.field_M * 50 >> -496487984};
              var9 = new mg(var8);
              if (!this.field_N) {
                var10 = this.field_L;
                break L1;
              } else {
                var10 = param2.q(-86).a(16, 0);
                break L1;
              }
            }
            L2: {
              var10 = var10 * var9.a((byte) -94) / 16;
              var9.a(false, var10);
              if (var10 > 50 * this.field_O) {
                var6.m(-24);
                var7.m(-70);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_G.a(var9, (byte) -120);
            var11 = this.field_G.k((byte) -91);
            var11.b(0, 55);
            var11.h(param1 + -2).a(9, new lj[]{(lj) ((Object) var6), (lj) ((Object) var7)});
            var14.a((byte) 83, (nv) (this.field_G));
            var12 = rm.field_a;
            var13 = (lma) ((Object) var12.a(15, 93));
            var14.a((gr) null, (byte) 124, var13);
            stackIn_7_0 = (fsa) (var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ga.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    ga(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        RuntimeException var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_M = 131072;
        this.field_J = 524288;
        this.field_I = 262144;
        this.field_O = 65536;
        try {
          L0: {
            L1: {
              this.field_O = ji.a(param2.b((byte) 44, 4), 116, 2);
              this.field_J = ji.a(param2.b((byte) 44, 8), 100, 4);
              this.field_M = ji.a(param2.b((byte) 44, 4), 88, 2);
              this.field_I = ji.a(param2.b((byte) 44, 8), 107, 4);
              stackIn_3_0 = this;

              if (1 != param2.b((byte) 44, 1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((ga) (this)).field_N = stackIn_4_1 != 0;
            if (this.field_N) {
              break L0;
            } else {
              this.field_L = param2.b((byte) 44, 4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ga.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
    }

    final static boolean r(byte param0) {
        if (param0 > -14) {
            ga.A(-59);
            return hb.field_t instanceof qh;
        }
        return hb.field_t instanceof qh;
    }

    final void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              param1.a((byte) -128, wma.a((byte) 8, 2, this.field_O), 4);
              param1.a((byte) -127, wma.a((byte) 8, 4, this.field_J), 8);
              param1.a((byte) -4, wma.a((byte) 8, 2, this.field_M), 4);
              param1.a((byte) -17, wma.a((byte) 8, 4, this.field_I), 8);
              stackIn_2_0 = (kh) (param1);

              stackIn_2_1 = -127;

              if (this.field_N) {
                stackIn_3_0 = (kh) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              } else {
                stackIn_3_0 = (kh) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
              if (this.field_N) {
                break L2;
              } else {
                param1.a((byte) -33, this.field_L, 4);
                break L2;
              }
            }
            if (!param0) {
              break L0;
            } else {
              this.field_J = -119;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ga.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void A(int param0) {
        field_K = null;
        field_F = null;
        if (param0 != 4096) {
            field_F = (jpa[]) null;
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            la var3 = (la) null;
            this.a(false, -124, (la) null);
            return true;
        }
        return true;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.z(41);
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
            this.t(108);
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            this.v(-115);
            return 7;
        }
        return 7;
    }

    static {
        field_K = "Won <%0> round(s)";
        field_H = 0;
    }
}
