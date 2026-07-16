/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vc extends oo {
    static String field_N;
    static String field_J;
    static int field_K;
    int[][] field_M;
    static String field_P;
    static int field_L;
    eg[] field_O;

    final int a(int param0, eg[][] param1, int[][][] param2, int param3, int param4) {
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Pool.field_O;
        int var7 = 0;
        for (var6 = param0; param4 > var6; var6++) {
            var8 = -param0 + var6;
            param1[var8] = jd.a(91, ((vc) this).field_O[var6]);
            var7 = var7 + param1[var8].length;
            param2[var8] = new int[param1[var8].length][3];
            for (var9 = 0; param1[var8].length > var9; var9++) {
                ln.a(param2[var8][var9], 0, param1[var8][var9]);
                nd.a(param1[var8][var9], (byte) -37);
            }
        }
        if (param3 > -49) {
            ((vc) this).field_M = null;
        }
        return var7;
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var5 = 0;
        L0: {
          var3 = Pool.field_O;
          if (!((vc) this).field_h) {
            var5 = 0;
            var2 = var5;
            L1: while (true) {
              if (ph.field_g.length <= var5) {
                break L0;
              } else {
                pa.field_L[var5] = th.field_l[ph.field_g[var5]].b(oh.field_d, -31);
                sh.field_Q[var5] = th.field_l[var5].a(true, oh.field_d);
                var5++;
                continue L1;
              }
            }
          } else {
            var2 = 0;
            L2: while (true) {
              if (ph.field_g.length <= var2) {
                break L0;
              } else {
                pa.field_L[var2] = th.field_l[ph.field_g[var2]].b(-13025, oh.field_d);
                sh.field_Q[var2] = th.field_l[var2].a(param0, oh.field_d);
                var2++;
                continue L2;
              }
            }
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            var4 = null;
            vc.a(true, (java.awt.Canvas) null);
            break L3;
          }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var3 = Pool.field_O;
        if (th.field_l != null) {
            ph.field_g = new int[th.field_l.length];
            pa.field_L = new int[th.field_l.length];
            sh.field_Q = new boolean[th.field_l.length];
            for (var2 = 0; var2 < ph.field_g.length; var2++) {
                ph.field_g[var2] = var2;
            }
            var4 = 0;
            var2 = var4;
            while (var4 < th.field_l.length) {
                th.field_l[var4].a(288, 576, param0 ^ -113);
                var4++;
            }
        }
        if (param0 != 16) {
            ((vc) this).field_M = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, p[] param6) {
        int[] var13 = mj.a(-31121);
        int[] var11 = var13;
        int[] var9 = var11;
        int[] var8 = var9;
        var9[param0] = param4 + ((vc) this).field_M[param5][0];
        var9[1] = param2 + ((vc) this).field_M[param5][1];
        var9[2] = param3 + ((vc) this).field_M[param5][2];
        param6[param1 - 0] = new p((nc) (Object) ((vc) this).a(var13, ((vc) this).field_O[param5], -97), var13);
        int[] var14 = dq.a((byte) 78, f.a((byte) 69, var13));
        int[] var12 = var14;
        int[] var10 = var12;
        var8 = var10;
        param6[1 + param1] = new p((nc) (Object) ((vc) this).a(var14, ((vc) this).field_O[param5], -82), var14);
    }

    abstract void c(boolean param0);

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (fk.field_ab == 11) {
            bi.b(-125);
        }
        a.a(am.field_n, param0, uh.field_o, kk.field_w);
        if (!param0) {
            field_N = null;
        }
        fe.a(0, 0, (byte) -118, param1);
    }

    final void a(p[] param0, int param1, int param2, boolean param3, eg param4, int param5, int[] param6, int param7) {
        int[] var9 = null;
        eg var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (param3) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var10 = a.a(stackIn_3_0 != 0, new eg(param4, false, param3, false, false));
        var23 = mj.a(-31121);
        var19 = var23;
        var15 = var19;
        var11 = var15;
        var9 = var11;
        var9[2] = param6[2] + param1;
        var9[1] = param2 + param6[1];
        var9[0] = param6[0] + param7;
        param0[0 + param5] = new p((nc) (Object) ((vc) this).a(var23, param4, -115), var23);
        var24 = mj.a(-31121);
        var20 = var24;
        var16 = var20;
        var12 = var16;
        var9 = var12;
        var9[2] = param6[2] - -param1;
        var9[1] = -param6[1] - param2;
        var9[0] = param6[0] + param7;
        param0[param5 - -1] = new p((nc) (Object) ((vc) this).a(var24, var10, -56), var24);
        var25 = mj.a(-31121);
        var21 = var25;
        var17 = var21;
        var13 = var17;
        var9 = var13;
        var9[1] = param2 + param6[1];
        var9[2] = param6[2] - -param1;
        var9[0] = param7 + param6[0];
        int[] discarded$2 = dq.a((byte) 114, var25);
        param0[param5 - -2] = new p((nc) (Object) ((vc) this).a(var25, param4, -85), var25);
        var26 = mj.a(-31121);
        var22 = var26;
        var18 = var22;
        var14 = var18;
        var9 = var14;
        var9[2] = param1 + param6[2];
        var9[0] = param6[0] + param7;
        var9[1] = -param2 + -param6[1];
        int[] discarded$3 = dq.a((byte) -116, var26);
        param0[param5 + 3] = new p((nc) (Object) ((vc) this).a(var26, var10, -76), var26);
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, int param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = pa.field_K.getGraphics();
              if (cl.field_c == null) {
                cl.field_c = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                var9.setColor(java.awt.Color.black);
                var9.fillRect(0, 0, ml.field_d, ad.field_c);
                break L2;
              }
            }
            L3: {
              if (param3 != null) {
                break L3;
              } else {
                param3 = new java.awt.Color(140, 17, 17);
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (wf.field_c == null) {
                    wf.field_c = pa.field_K.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = wf.field_c.getGraphics();
                var10.setColor(param3);
                var10.drawRect(0, 0, 303, 33);
                var10.fillRect(2, 2, param4 * 3, param1);
                var10.setColor(java.awt.Color.black);
                var10.drawRect(1, 1, 301, 31);
                var10.fillRect(param4 * 3 + 2, 2, -(3 * param4) + 300, 30);
                var10.setFont(cl.field_c);
                var10.setColor(java.awt.Color.white);
                var10.drawString(param2, (304 + -(param2.length() * 6)) / 2, 22);
                boolean discarded$1 = var9.drawImage(wf.field_c, ml.field_d / 2 + -152, ad.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var7 = ml.field_d / 2 + -152;
                var8 = ad.field_c / 2 + -18;
                var9.setColor(param3);
                var9.drawRect(var7, var8, 303, 33);
                var9.fillRect(var7 + 2, var8 - -2, 3 * param4, 30);
                var9.setColor(java.awt.Color.black);
                var9.drawRect(1 + var7, 1 + var8, 301, 31);
                var9.fillRect(param4 * 3 + (var7 - -2), 2 + var8, 300 - 3 * param4, 30);
                var9.setFont(cl.field_c);
                var9.setColor(java.awt.Color.white);
                var9.drawString(param2, (-(6 * param2.length()) + 304) / 2 + var7, 22 + var8);
                break L6;
              }
            }
            L7: {
              if (null != jf.field_o) {
                var9.setFont(cl.field_c);
                var9.setColor(java.awt.Color.white);
                var9.drawString(jf.field_o, ml.field_d / 2 - jf.field_o.length() * 6 / 2, ad.field_c / 2 - 26);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var5 = (Exception) (Object) decompiledCaughtException;
            pa.field_K.repaint();
            break L8;
          }
        }
    }

    public static void d(byte param0) {
        if (param0 < 95) {
            Object var2 = null;
            vc.a(false, (java.awt.Canvas) null);
        }
        field_J = null;
        field_P = null;
        field_N = null;
    }

    vc() {
    }

    void a(al param0, int param1) {
        super.a(param0, param1 ^ 0);
        ((vc) this).c(true);
        ((vc) this).d(16);
        if (param1 != 21894) {
            Object var4 = null;
            ((vc) this).a((p[]) null, 81, -71, false, (eg) null, -4, (int[]) null, -24);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Press TAB to chat or F10 to open Quick Chat.";
        field_N = "Options Menu";
        field_L = 100;
        field_P = "Potting a ball for you: you are now <%0>";
    }
}
