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
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          L0: {
            var7 = 0;
            var6_int = param0;
            L1: while (true) {
              if (param4 <= var6_int) {
                L2: {
                  if (param3 <= -49) {
                    break L2;
                  } else {
                    this.field_M = (int[][]) null;
                    break L2;
                  }
                }
                stackIn_10_0 = var7;
                break L0;
              } else {
                var8 = -param0 + var6_int;
                param1[var8] = jd.a(91, this.field_O[var6_int]);
                var7 = var7 + param1[var8].length;
                param2[var8] = new int[param1[var8].length][3];
                var9 = 0;
                L3: while (true) {
                  if (param1[var8].length <= var9) {
                    var6_int++;
                    continue L1;
                  } else {
                    ln.a(param2[var8][var9], 0, param1[var8][var9]);
                    nd.a(param1[var8][var9], (byte) -37);
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("vc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_10_0;
    }

    final void e(boolean param0) {
        int var2;
        int var3;
        java.awt.Canvas var4;
        int var5;
        L0: {
          var3 = Pool.field_O;
          if (!this.field_h) {
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
            var4 = (java.awt.Canvas) null;
            vc.a(true, (java.awt.Canvas) null);
            break L3;
          }
        }
    }

    final void d(int param0) {
        int var4 = 0;
        int var2 = 0;
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
            this.field_M = (int[][]) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, p[] param6) {
        int[] var13 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var8 = null;
        int[] var14 = null;
        int[] var12 = null;
        int[] var10 = null;
        try {
            var13 = mj.a(-31121);
            var11 = var13;
            var9 = var11;
            var8 = var9;
            var9[param0] = param4 + this.field_M[param5][0];
            var9[1] = param2 + this.field_M[param5][1];
            var9[2] = param3 + this.field_M[param5][2];
            param6[param1 - 0] = new p((nc) ((Object) this.a(var13, this.field_O[param5], -97)), var13);
            var14 = dq.a((byte) 78, f.a((byte) 69, var13));
            var12 = var14;
            var10 = var12;
            var8 = var10;
            param6[1 + param1] = new p((nc) ((Object) this.a(var14, this.field_O[param5], -82)), var14);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vc.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void c(boolean param0);

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
            if (fk.field_ab == 11) {
                bi.b(-125);
            }
            a.a(am.field_n, param0, uh.field_o, kk.field_w);
            if (!param0) {
                field_N = (String) null;
            }
            fe.a(0, 0, (byte) -118, param1);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vc.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(p[] param0, int param1, int param2, boolean param3, eg param4, int param5, int[] param6, int param7) {
        eg var10 = null;
        int[] var15 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var16 = null;
        int[] var12 = null;
        int[] var17 = null;
        int[] var13 = null;
        int[] var18 = null;
        int[] var14 = null;
        try {
            var10 = a.a(!param3 ? true : false, new eg(param4, false, param3, false, false));
            var15 = mj.a(-31121);
            var11 = var15;
            var9 = var11;
            var9[2] = param6[2] + param1;
            var9[1] = param2 + param6[1];
            var9[0] = param6[0] + param7;
            param0[0 + param5] = new p((nc) ((Object) this.a(var15, param4, -115)), var15);
            var16 = mj.a(-31121);
            var12 = var16;
            var9 = var12;
            var9[2] = param6[2] - -param1;
            var9[1] = -param6[1] - param2;
            var9[0] = param6[0] + param7;
            param0[param5 - -1] = new p((nc) ((Object) this.a(var16, var10, -56)), var16);
            var17 = mj.a(-31121);
            var13 = var17;
            var9 = var13;
            var9[1] = param2 + param6[1];
            var9[2] = param6[2] - -param1;
            var9[0] = param7 + param6[0];
            dq.a((byte) 114, var17);
            param0[param5 - -2] = new p((nc) ((Object) this.a(var17, param4, -85)), var17);
            var18 = mj.a(-31121);
            var14 = var18;
            var9 = var14;
            var9[2] = param1 + param6[2];
            var9[0] = param6[0] + param7;
            var9[1] = -param2 + -param6[1];
            dq.a((byte) -116, var18);
            param0[param5 + 3] = new p((nc) ((Object) this.a(var18, var10, -76)), var18);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2, java.awt.Color param3, int param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = pa.field_K.getGraphics();
                  if (cl.field_c == null) {
                    cl.field_c = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param0) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, ml.field_d, ad.field_c);
                    break L3;
                  }
                }
                L4: {
                  if (param3 != null) {
                    break L4;
                  } else {
                    param3 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (wf.field_c == null) {
                        wf.field_c = pa.field_K.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
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
                    var9.drawImage(wf.field_c, ml.field_d / 2 + -152, ad.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
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
                    break L7;
                  }
                }
                L8: {
                  if (null != jf.field_o) {
                    var9.setFont(cl.field_c);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(jf.field_o, ml.field_d / 2 - jf.field_o.length() * 6 / 2, ad.field_c / 2 - 26);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                pa.field_K.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("vc.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L11;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L11;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 < 95) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            vc.a(false, (java.awt.Canvas) null);
        }
        field_J = null;
        field_P = null;
        field_N = null;
    }

    vc() {
    }

    void a(al param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1 ^ 0);
              this.c(true);
              this.d(16);
              if (param1 == 21894) {
                break L1;
              } else {
                var4 = (int[]) null;
                this.a((p[]) null, 81, -71, false, (eg) null, -4, (int[]) null, -24);
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

            stackIn_5_1 = new StringBuilder().append("vc.B(");

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_J = "Press TAB to chat or F10 to open Quick Chat.";
        field_N = "Options Menu";
        field_L = 100;
        field_P = "Potting a ball for you: you are now <%0>";
    }
}
