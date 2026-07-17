/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends ee {
    static dd field_R;
    static int[] field_V;
    tf field_Z;
    ek field_ab;
    static int field_W;
    private int field_bb;
    static od field_Y;
    double[] field_T;
    kh field_Q;
    private int field_U;
    hm field_X;

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (param1.f(-107)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("h.CB(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (((h) this).field_N) {
            return;
        }
        ((h) this).a(512, true, param1, (byte) 44, di.field_d, ((h) this).field_A.field_B.field_jb, param3, param4, param0, ((h) this).field_U);
        if (param2 >= -5) {
            return;
        }
        try {
            ((h) this).field_ab.a(param3, param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "h.QA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return true;
    }

    final void a(mn param0, byte param1) {
        try {
            int var3_int = 61 / ((-2 - param1) / 62);
            ((h) this).field_ab.a(-117, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "h.OA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(cl param0, byte param1) {
        try {
            int var3_int = 53 % ((param1 - -35) / 60);
            param0.a((byte) -77, ((h) this).field_A.field_B);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "h.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 8) {
            break L0;
          } else {
            ((h) this).field_U = -15;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((h) this).field_A.field_K == null) {
              break L2;
            } else {
              if (((h) this).field_D > ((h) this).field_A.field_x.field_r[-1 + ((h) this).field_A.field_x.field_a]) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final double[] e(int param0) {
        if (param0 != 3008) {
            boolean discarded$0 = ((h) this).c(-47);
        }
        return ((h) this).field_Z.a(param0 + 16774207);
    }

    final static void a(byte param0, boolean param1) {
        ac.a(false);
        lc.field_J = null;
        oj.field_B = 0;
        hc.field_u = hk.field_f;
        bg.field_f = 0;
        ef.field_tb = 3001;
        qn.field_v.field_J.field_o = 1;
        qn.field_v.field_y = false;
        rm.field_f = null;
        qn.field_v.field_J.a(12631, true);
        qn.field_v.field_l = -qn.field_v.field_x.field_r[qn.field_v.field_x.field_t];
    }

    final void a(double param0, byte param1, double param2, double param3) {
        super.a(param0, param1, param2, param3);
        ((h) this).field_Z.a(param0, param3, param2, 70);
    }

    final void a(pm param0, int param1) {
        if (param1 >= -81) {
            return;
        }
        try {
            param0.a(640, (h) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "h.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            return true;
        }
        return true;
    }

    h(hn param0, dj param1, int param2) {
        super(param0, param1.field_E, param1.field_t, -0.1 + (-param1.field_C + param1.field_D), 0.1, 0.01);
        RuntimeException var4 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        ((h) this).field_Z = new tf((ee) this);
        ((h) this).field_U = 0;
        ((h) this).field_T = new double[3];
        ((h) this).field_X = new hm((pm) this, ki.field_a);
        try {
          L0: {
            L1: {
              ((h) this).field_Q = new kh((pm) this, (bi) null, 0);
              ((h) this).field_L = param1.field_L;
              ((h) this).field_G = param1.field_G;
              ((h) this).field_bb = param2;
              ((h) this).field_K = param1.field_K;
              ((h) this).field_Z.b(118);
              ((h) this).field_ab = new ek((ee) this, true, false, param1.field_Bb.field_b - 4);
              if (param1.field_Bb.field_b > 8) {
                break L1;
              } else {
                ((h) this).field_ab.field_d = 0;
                break L1;
              }
            }
            L2: {
              ((h) this).field_ab.field_l = param1.field_Bb.field_l;
              if (param1.field_Gb <= 0) {
                break L2;
              } else {
                ((h) this).field_U = 256;
                break L2;
              }
            }
            new gk((pm) this, d.field_b).field_w = ((h) this).field_C * 2.0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("h.<init>(");
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
    }

    final static l a(boolean param0, byte[] param1) {
        l var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        Object stackIn_2_0 = null;
        l stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        l stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new l(param1, jl.field_p, ij.field_r, rg.field_I, sd.field_f, an.field_p, rj.field_f);
                ql.a(param0);
                if (!param0) {
                  break L1;
                } else {
                  var3 = null;
                  l discarded$2 = h.a(true, (byte[]) null);
                  break L1;
                }
              }
              stackOut_5_0 = (l) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (l) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("h.B(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            return -0.6423134079966774;
        }
        return ((h) this).field_ab.a(param0 ^ 14170, false, param1, param2);
    }

    final static void m() {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Confined.field_J ? 1 : 0;
          s.field_K = false;
          cb.field_b = null;
          if (rk.field_f) {
            ki.field_c.i((byte) 92);
            break L0;
          } else {
            var1 = oi.field_q;
            if (var1 <= 0) {
              ki.field_c.n(10);
              int discarded$57 = 0;
              bn.c();
              break L0;
            } else {
              if (var1 == 1) {
                cb.field_b = jc.field_b;
                cb.field_b = pf.a(11739, new CharSequence[3]);
                ki.field_c.n(10);
                int discarded$58 = 0;
                bn.c();
                break L0;
              } else {
                cb.field_b = b.a(new String[1], gj.field_g, 1177);
                cb.field_b = pf.a(11739, new CharSequence[3]);
                ki.field_c.n(10);
                int discarded$59 = 0;
                bn.c();
                break L0;
              }
            }
          }
        }
    }

    final void g(int param0) {
        if (param0 != 26402) {
            Object var3 = null;
            ((h) this).a((mn) null, -0.7945570901746162, -12, (vg) null, (oi) null);
        }
        ka var2 = ((h) this).a((byte) -116, ck.field_a, 2.0);
        var2.field_M.field_w = ((h) this).field_C * 4.0;
        ((h) this).field_A.field_B.field_Nb[((h) this).field_bb] = null;
        kc.a(db.field_u, (pm) this, param0 + -26281, false);
    }

    public static void l() {
        field_Y = null;
        field_V = null;
        field_R = null;
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 72) {
                break L1;
              } else {
                ((h) this).field_Q = null;
                break L1;
              }
            }
            L2: {
              if (param0.f(-94)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("h.WA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1) {
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        h var14 = null;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        int var29 = 0;
        dj var30 = null;
        double[] var34 = null;
        var29 = Confined.field_J ? 1 : 0;
        var30 = ((h) this).field_A.field_B;
        var34 = new double[12];
        var30.field_jb.a((byte) 122, var34);
        var5 = var34[9];
        var7 = var34[10];
        var9 = var34[11];
        var11 = 0.01;
        var13_int = 0;
        L0: while (true) {
          if (var13_int >= 5) {
            L1: {
              var13 = -var30.field_E + ((h) this).field_E;
              var15 = ((h) this).field_t - var30.field_t;
              var13 = var13 + 8.0 * (((h) this).field_K - var30.field_K);
              var15 = var15 + (((h) this).field_G - var30.field_G) * 8.0;
              var17 = -var30.field_D + ((h) this).field_D;
              var17 = var17 + (-var30.field_L + ((h) this).field_L) * 8.0;
              var19 = var17 * var9 + (var13 * var5 + var15 * var7);
              var15 = var15 - var19 * var7;
              var17 = var17 - var9 * var19;
              var13 = var13 - var5 * var19;
              var21 = (var30.field_C * 2.0 - Math.sqrt(var17 * var17 + (var15 * var15 + var13 * var13))) * 0.07;
              ((h) this).field_L = ((h) this).field_L + var21 * var17;
              ((h) this).field_K = ((h) this).field_K + var13 * var21;
              ((h) this).field_G = ((h) this).field_G + var15 * var21;
              var23 = -(var17 * var7) + var9 * var15;
              var25 = -(var13 * var9) + var5 * var17;
              ((h) this).field_G = ((h) this).field_G + 0.005 * var25;
              var27 = var13 * var7 - var15 * var5;
              ((h) this).field_K = ((h) this).field_K + var23 * 0.005;
              ((h) this).field_L = ((h) this).field_L + var27 * 0.005;
              var11 = -((h) this).field_E + var30.field_E;
              var13 = var30.field_t - ((h) this).field_t;
              var15 = -((h) this).field_D + var30.field_D;
              var17 = var9 * var15 + (var7 * var13 + var5 * var11);
              var19 = 0.01 + 0.05 * (-0.1 + (-var30.field_C + var17));
              ((h) this).field_L = 0.95 * (var19 * var9 + ((h) this).field_L);
              ((h) this).field_G = 0.95 * (var19 * var7 + ((h) this).field_G);
              ((h) this).field_K = 0.95 * (var19 * var5 + ((h) this).field_K);
              var11 = ((h) this).field_K * ((h) this).field_K + ((h) this).field_G * ((h) this).field_G + ((h) this).field_L * ((h) this).field_L;
              if (0.09 < var11) {
                var11 = 0.3 / Math.sqrt(var11);
                ((h) this).field_L = ((h) this).field_L * var11;
                ((h) this).field_K = ((h) this).field_K * var11;
                ((h) this).field_G = ((h) this).field_G * var11;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              super.a(param0, param1);
              ((h) this).field_Z.c(16777215);
              ((h) this).field_ab.a(((h) this).field_Z, 3);
              if (((h) this).field_A.field_B.field_Gb <= 0) {
                if (((h) this).field_U <= 0) {
                  break L2;
                } else {
                  ((h) this).field_U = ((h) this).field_U - 16;
                  break L2;
                }
              } else {
                if (256 <= ((h) this).field_U) {
                  break L2;
                } else {
                  ((h) this).field_U = ((h) this).field_U + 16;
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: {
              var14 = var30.field_Nb[var13_int];
              if (var14 != null) {
                if (this == (Object) (Object) var14) {
                  var11 = -0.01;
                  break L3;
                } else {
                  L4: {
                    var15 = var14.field_E - ((h) this).field_E;
                    var17 = var14.field_t - ((h) this).field_t;
                    var15 = var15 + 8.0 * (var14.field_K - ((h) this).field_K);
                    var17 = var17 + 8.0 * (var14.field_G - ((h) this).field_G);
                    var19 = -((h) this).field_D + var14.field_D;
                    var19 = var19 + 8.0 * (var14.field_L - ((h) this).field_L);
                    var21 = var15 * var5 + var7 * var17 + var19 * var9;
                    var19 = var19 - var9 * var21;
                    var17 = var17 - var7 * var21;
                    var15 = var15 - var5 * var21;
                    var23 = var19 * var19 + (var15 * var15 + var17 * var17);
                    if (var23 >= 0.1) {
                      var23 = 0.01 / var23;
                      var17 = var17 * var23;
                      var19 = var19 * var23;
                      var15 = var15 * var23;
                      break L4;
                    } else {
                      var15 = var11;
                      var19 = 0.0;
                      var17 = 0.0;
                      break L4;
                    }
                  }
                  ((h) this).field_K = ((h) this).field_K - var15;
                  ((h) this).field_G = ((h) this).field_G - var17;
                  ((h) this).field_L = ((h) this).field_L - var19;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            var13_int++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = new int[]{1, 1, 1, 1, 3, 0, 0, 0, 3, 2, 2, 2, 4, 3, 2, 3, 4, 0, 2, 4, 5, 3, 5, 4, 5};
    }
}
