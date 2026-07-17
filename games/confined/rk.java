/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rk {
    rk field_a;
    long field_i;
    static e field_g;
    static int field_j;
    rk field_h;
    static qe field_k;
    static boolean field_f;
    static byte[][] field_c;
    static int field_d;
    static double[] field_l;
    static int field_e;
    static String field_b;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void d(byte param0) {
        rg.field_K = false;
        lc.field_J = null;
        ra.field_c = new mn();
        i.field_o = 0;
        oj.field_B = 0;
    }

    final static void a(mi param0, int param1, mi param2, mi param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        nf var5 = null;
        bm[] var6 = null;
        bm[][] var7 = null;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        bm[] var11 = null;
        nf var12 = null;
        int var12_int = 0;
        nf var13 = null;
        int var14 = 0;
        bm[] var15 = null;
        nf var16 = null;
        int[][] var17 = null;
        nf var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var14 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            wc.field_nc = nm.a(param3, "frame_top", 1, "commonui");
            fi.field_d = nm.a(param3, "frame_bottom", 1, "commonui");
            rh.field_Z = dh.a(false, "jagex_logo_grey", "commonui", param3);
            em.field_d = nm.a(param3, "button", 1, "commonui");
            gg.field_q = ua.a("commonui", -563, param3, "validation");
            fa.field_Q = (ok) (Object) ej.a("arezzo12", param3, param2, "commonui", 0);
            gm.field_cb = (ok) (Object) ej.a("arezzo14", param3, param2, "commonui", 0);
            var4_int = -4 % ((68 - param1) / 50);
            fd.field_k = (ok) (Object) ej.a("arezzo14bold", param3, param2, "commonui", 0);
            var5 = new nf(param0.a(110, "button.gif", ""), (java.awt.Component) (Object) fb.field_b);
            bm discarded$1 = pm.a(param3, "commonui", "dropdown", (byte) 112);
            var6 = ql.a("commonui", (byte) 90, "screen_options", param3);
            qm.field_B = new bm[4];
            jg.field_d = new bm[4];
            qd.field_b = new bm[4];
            var7 = new bm[][]{qd.field_b, qm.field_B, jg.field_d};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var17 = var19;
            var8 = var17;
            var8[0] = var6[0].field_m;
            var9 = 1;
            L1: while (true) {
              if (var21.length <= var9) {
                var9 = var6[0].field_n[0];
                var21[2][var9] = 16777215;
                var21[1][var9] = 2394342;
                var21[3][var9] = 4767999;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= 3) {
                    var10 = var5.field_w;
                    mk.b(128);
                    var5.d();
                    fn.c(0, 0, fn.field_g, fn.field_l);
                    var16 = new nf(var10, var10);
                    var18 = var16;
                    var18.d();
                    var5.c(0, 0);
                    var12 = new nf(var10, var10);
                    var12.d();
                    var5.c(var10 - var5.field_u, 0);
                    var13 = new nf(var5.field_u - 2 * var10, var10);
                    var13.d();
                    var5.c(-var10, 0);
                    ib.b(false);
                    em.field_d = new nf[]{var16, var13, var12};
                    break L0;
                  } else {
                    var15 = var7[var10];
                    var11 = var15;
                    var12_int = 0;
                    L3: while (true) {
                      if (var15.length <= var12_int) {
                        var10++;
                        continue L2;
                      } else {
                        var15[var12_int] = jl.a(var21[var12_int], var6[var10], 0);
                        var12_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var8[var9] = (int[]) var21[0].clone();
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("rk.AD(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_k = null;
        field_g = null;
        field_c = null;
        field_l = null;
    }

    final void a(boolean param0) {
        if (!(((rk) this).field_a != null)) {
            return;
        }
        ((rk) this).field_a.field_h = ((rk) this).field_h;
        ((rk) this).field_h.field_a = ((rk) this).field_a;
        ((rk) this).field_a = null;
        if (!param0) {
            return;
        }
        ((rk) this).field_h = null;
    }

    final static void b(byte param0) {
        Object var2 = null;
        tj.a(-1, "", (String) null);
        int var1 = -49 / ((82 - param0) / 34);
    }

    final boolean c(byte param0) {
        if (!(null != ((rk) this).field_a)) {
            return false;
        }
        if (param0 < 98) {
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new e(14, 0, 4, 1);
        field_c = new byte[250][];
        field_b = "Setting course for Earth.";
        field_l = new double[]{0.0, 0.0, 0.0, 0.25, 0.45, 0.55, 0.6, 0.65};
    }
}
