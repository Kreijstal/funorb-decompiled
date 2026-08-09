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
            this.a(true, -54);
        }
        if (this.g(1) > param1) {
            if (-3 < (param1 ^ -1)) {
                return 152 * (param1 % 3) + 173;
            }
            return 98 + (-2 + param1) * 152;
        }
        return super.d(param0 ^ 0, param1);
    }

    final static byte[] a(int param0, int param1, byte[] param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            var8 = new byte[param1 + param2.length];
            var4 = var8;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param2.length) {
                var6 = 45 / ((44 - param0) / 56);
                L2: while (true) {
                  if (var5 >= var8.length) {
                    stackIn_8_0 = (byte[]) (var4);
                    break L0;
                  } else {
                    var8[var5] = (byte)param3;
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
            stackIn_11_0 = (RuntimeException) (var4_ref);

            stackIn_11_1 = new StringBuilder().append("sg.IB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    private final int g(int param0) {
        if (param0 != 1) {
            this.a(31, 61, 50, -68, 43, 50);
        }
        return this.field_h.length - 1;
    }

    final boolean a(int param0, boolean param1) {
        if (!param1) {
            this.a(-39, -95);
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
            sg.h(89);
        }
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            this.a(112, -81);
        }
        if (this.g(1) > param1) {
            return this.d(0, param1) + 140;
        }
        return super.a(false, param1);
    }

    final int b(byte param0, int param1) {
        if ((param1 ^ -1) > -3) {
            return 130;
        }
        if (param1 < this.g(1)) {
            return 260;
        }
        if (param0 != 6) {
            sj var4 = (sj) null;
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
            sj var7 = (sj) null;
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
            var7 = !this.a(param0, true) ? ne.field_t[param0] : og.field_K[param0];
            var8 = -var7.field_z + (-param2 + param1) >> 506724193;
            var7.a(param2 + var8, var8 + param5);
        }
        if (this.a(param0, true)) {
        }
        if (param4 != -24267) {
            field_K = 78;
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 6402) {
            return 118;
        }
        if (param0 != this.field_h.length + -1) {
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
        sj var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              nq.a(param1, param3, param0, param2, false, 1024, param5, param2);
              if (param4 == 10282) {
                break L1;
              } else {
                var7 = (sj) null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sg.HB(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    sg(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(im.field_Lb, param0, param1, param2, param3, param4, param5);
    }

    static {
        field_N = "Private";
        field_Q = "<%0> is not on your ignore list.";
        field_H = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_I = "<%0> has withdrawn the request to join.";
        field_L = "Please enter your age in years";
        field_R = 2;
        field_O = 1 << field_R;
    }
}
