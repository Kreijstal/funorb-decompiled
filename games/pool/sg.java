/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends ob {
    static jj field_J;
    static dd[] field_M;
    static String field_N;
    static int field_P;
    static String field_Q;
    static int field_O;
    static int field_K;
    static String field_H;
    static String field_L;
    static String field_I;
    static int field_S;
    private static int field_R;

    final int d(int param0, int param1) {
        if (param0 != 0) {
            int discarded$0 = ((sg) this).a(true, -54);
        }
        if (this.g(1) > param1) {
            if (param1 < 2) {
                return 152 * (param1 % 3) + 173;
            }
            return 98 + (-2 + param1) * 152;
        }
        return super.d(param0, param1);
    }

    final static byte[] a(int param0, int param1, byte[] param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            var8 = new byte[param1 + param2.length];
            var4 = var8;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param2.length) {
                var6 = 22;
                L2: while (true) {
                  if (var5 >= var8.length) {
                    stackOut_7_0 = (byte[]) var4;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    var8[var5] = (byte) 0;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var8[var5] = param2[var5];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4_ref;
            stackOut_9_1 = new StringBuilder().append("sg.IB(").append(-116).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 0 + ')');
        }
        return stackIn_8_0;
    }

    private final int g(int param0) {
        return ((sg) this).field_h.length - 1;
    }

    final boolean a(int param0, boolean param1) {
        if (!param1) {
            int discarded$0 = ((sg) this).a(-39, -95);
        }
        if (!(this.g(1) != param0)) {
            return true;
        }
        return param0 < 5 ? true : false;
    }

    public static void f(int param0) {
        field_H = null;
        field_L = null;
        field_I = null;
        field_Q = null;
        field_J = null;
        field_N = null;
        field_M = null;
        if (param0 != 506724193) {
            dd[] discarded$0 = sg.h(89);
        }
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            int discarded$0 = ((sg) this).a(112, -81);
        }
        if (this.g(1) > param1) {
            return ((sg) this).d(0, param1) + 140;
        }
        return super.a(false, param1);
    }

    final int b(byte param0, int param1) {
        if (param1 < 2) {
            return 130;
        }
        if (param1 < this.g(1)) {
            return 260;
        }
        if (param0 != 6) {
            Object var4 = null;
            sg.a((java.awt.Component) null, (vk) null, -11, (sj) null, -109, true);
        }
        return 390;
    }

    final static dd[] h(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        dd[] var1 = new dd[wf.field_d];
        if (param0 != 152) {
            Object var7 = null;
            sg.a((java.awt.Component) null, (vk) null, -111, (sj) null, -54, true);
        }
        for (var2 = 0; var2 < wf.field_d; var2++) {
            var3 = pd.field_a[var2] * rc.field_f[var2];
            var10 = v.field_b[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = ma.field_h[rb.b((int) var10[var6], 255)];
            }
            var1[var2] = new dd(vd.field_c, tq.field_r, el.field_I[var2], ih.field_d[var2], pd.field_a[var2], rc.field_f[var2], var11);
        }
        sh.h(-1);
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        dd var7 = null;
        int var8 = 0;
        if (!(this.g(1) <= param0)) {
            var7 = !((sg) this).a(param0, true) ? ne.field_t[param0] : og.field_K[param0];
            var8 = -var7.field_z + (-param2 + param1) >> 1;
            var7.a(param2 + var8, var8 + param5);
        }
        if (((sg) this).a(param0, true)) {
        }
        if (param4 != -24267) {
            field_K = 78;
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 6402) {
            return 118;
        }
        if (param0 != ((sg) this).field_h.length + -1) {
            return 80;
        }
        return 0;
    }

    final int a(byte param0, int param1) {
        if (param0 != 69) {
            return -22;
        }
        if (this.g(1) > param1) {
            return 120;
        }
        return 36;
    }

    final static void a(java.awt.Component param0, vk param1, int param2, sj param3, int param4, boolean param5) {
        RuntimeException runtimeException = null;
        Object var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              nq.a(param1, param3, param0, param2, false, 1024, param5, param2);
              if (param4 == 10282) {
                break L1;
              } else {
                var7 = null;
                sg.a((java.awt.Component) null, (vk) null, 11, (sj) null, -77, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sg.HB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    sg(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(im.field_Lb, param0, param1, param2, param3, param4, param5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Private";
        field_Q = "<%0> is not on your ignore list.";
        field_H = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_I = "<%0> has withdrawn the request to join.";
        field_L = "Please enter your age in years";
        field_R = 2;
        field_O = 1 << field_R;
    }
}
