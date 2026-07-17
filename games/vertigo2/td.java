/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td implements ur {
    private int field_f;
    static cr field_c;
    private int field_e;
    private int field_h;
    private int field_k;
    private int field_j;
    private cc field_d;
    static int field_g;
    private int field_b;
    private int field_i;
    static mp field_a;
    static String[] field_l;

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ao var14 = null;
        iq stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        iq stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof ao) {
                stackOut_2_0 = (iq) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (iq) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (ao) (Object) stackIn_3_0;
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              bi.b(param1 + param3.field_o, param4 + param3.field_t, param3.field_n, param3.field_s, ((td) this).field_h);
              var7 = var14.field_J + param3.field_o + param1;
              var8 = param3.field_t + param4 - -var14.field_M;
              bi.f(var7, var8, var14.field_L, ((td) this).field_e);
              if (var14.field_I != -1) {
                var9 = 2.0 * ((double)var14.field_I * 3.141592653589793) / (double)var14.field_S;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_L);
                var12 = (int)(Math.cos(var9) * (double)var14.field_L);
                bi.f(var11 + var7, var12 + var8, 1, ((td) this).field_i);
                break L3;
              } else {
                break L3;
              }
            }
            bi.f(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_T) / (double)var14.field_S;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_L);
            var12 = (int)(Math.cos(var9) * (double)var14.field_L);
            bi.a(var7, var8, var7 - -var11, var8 - -var12, 1);
            if (param2) {
              L4: {
                if (null != ((td) this).field_d) {
                  var13 = ((td) this).field_f + (var14.field_J + var14.field_L);
                  int discarded$1 = ((td) this).field_d.a(param3.field_w, var13 + (param1 - -param3.field_o), param3.field_t + param4 + ((td) this).field_b, -var13 - ((td) this).field_f + param3.field_n, -(((td) this).field_f << 1) + param3.field_s, ((td) this).field_k, ((td) this).field_j, 1, 1, 0);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("td.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    final static qr a(boolean param0, ed param1) {
        RuntimeException var2 = null;
        qr stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = new qr(param1.n(2), param1.n(2), param1.n(2), param1.n(2), param1.m(0), param1.m(0), param1.h(-11));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("td.E(").append(0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a() {
        field_a = null;
        field_l = null;
        field_c = null;
    }

    final static er a(int param0) {
        int[] var15 = null;
        int[] var8 = null;
        int var5_int = 0;
        Object var3 = null;
        byte[] var20 = null;
        int[] var21 = null;
        int[] var17 = null;
        int[] var13 = null;
        int[] var11 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var19 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        int var1 = vi.field_w[0] * mh.field_c[0];
        byte[] var18 = se.field_y[0];
        if (!vl.field_j[0]) {
            var19 = new int[var1];
            var15 = var19;
            var8 = var15;
            for (var5_int = 0; var5_int < var1; var5_int++) {
                var8[var5_int] = in.field_c[b.a((int) var18[var5_int], 255)];
            }
            var3 = (Object) (Object) new er(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], var19);
        } else {
            var20 = ej.field_c[0];
            var21 = new int[var1];
            var17 = var21;
            var13 = var17;
            var11 = var13;
            var5 = var11;
            for (var6 = 0; var1 > var6; var6++) {
                var5[var6] = om.a(b.a((int) var20[var6], 255) << 24, in.field_c[b.a(255, (int) var18[var6])]);
            }
            var3 = (Object) (Object) new fe(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], var21);
        }
        la.a((byte) 37);
        return (er) var3;
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            bi.b(0, 0, bi.field_e, bi.field_j, 0, 192);
        } else {
            bi.c();
        }
        mh.a(param1, false);
    }

    td(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((td) this).field_f = param1;
            ((td) this).field_e = param5;
            ((td) this).field_j = param4;
            ((td) this).field_k = param3;
            ((td) this).field_i = param6;
            ((td) this).field_b = param2;
            ((td) this).field_d = param0;
            ((td) this).field_h = param7;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "td.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 10;
    }
}
