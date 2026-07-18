/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kda extends eo {
    static String field_gd;
    static boolean field_pd;
    private vna field_bd;
    static int field_hd;
    private jaggl.OpenGL field_Mc;
    static String field_cd;
    static char field_td;
    private vna field_dd;
    private vna field_Rc;
    private vna field_Oc;
    private vna field_ad;
    private vna field_nd;
    private vna field_kd;
    private boolean field_rd;
    private boolean field_ld;
    jaggl.MapBuffer field_Qc;
    private og[] field_id;
    private boolean field_Vc;
    private long field_Xc;
    private int field_ed;
    private boolean field_Zc;
    private boolean field_Yc;
    jaggl.MapBuffer field_Tc;
    boolean field_Uc;
    int[] field_Sc;
    private boolean field_Wc;
    private boolean field_sd;
    boolean field_qd;
    boolean field_Pc;
    int field_od;
    boolean field_fd;
    private String field_Nc;
    private String field_jd;
    private int field_md;

    final void a(int param0, int param1, qm param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((kda) this).field_id[param1] = (og) (Object) param2;
              if (param0 < -124) {
                break L1;
              } else {
                ((kda) this).field_Xc = 121L;
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
            stackOut_3_1 = new StringBuilder().append("kda.QD(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void k() {
        super.k();
        if (null != ((kda) this).field_Mc) {
            boolean discarded$0 = ((kda) this).field_Mc.b();
            ((kda) this).field_Mc.release();
            ((kda) this).field_Mc = null;
        }
    }

    final void f(int param0) {
        if (param0 != -3485) {
            Object var3 = null;
            ((kda) this).a((Object) null, false, (java.awt.Canvas) null);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, oj.a((byte) 126, ((kda) this).field_mc[((kda) this).field_Cc]));
    }

    final boolean f() {
        return false;
    }

    final void a(eja param0, int param1, int param2, int param3, iw param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        una var10 = null;
        sf var11 = null;
        int var12 = 0;
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
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (io.field_c == param4) {
                var9 = param6 * 2;
                var8_int = 1;
                break L1;
              } else {
                if (di.field_d == param4) {
                  var8_int = 3;
                  var9 = 1 + param6;
                  break L1;
                } else {
                  if (fma.field_f != param4) {
                    if (param4 != vs.field_T) {
                      if (param4 == nb.field_b) {
                        var9 = param6 + 2;
                        var8_int = 5;
                        break L1;
                      } else {
                        var9 = param6;
                        var8_int = 0;
                        break L1;
                      }
                    } else {
                      var8_int = 6;
                      var9 = param6 - -2;
                      break L1;
                    }
                  } else {
                    var9 = 3 * param6;
                    var8_int = 4;
                    break L1;
                  }
                }
              }
            }
            L2: {
              var10 = param0.b(param1 ^ 13611);
              var11 = (sf) (Object) param0;
              var11.c(-3);
              jaggl.OpenGL.glDrawElements(var8_int, var9, lr.a(var10, 5126), var11.b(true) - -(long)(param3 * var10.field_e));
              if (param1 == -19394) {
                break L2;
              } else {
                ((kda) this).N(76);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("kda.MD(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final gf a(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        hm var9 = null;
        hm stackIn_6_0 = null;
        pe stackIn_8_0 = null;
        hm stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_7_0 = null;
        hm stackOut_5_0 = null;
        hm stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var8_int = 82 / ((param6 - 13) / 46);
              if (((kda) this).field_Wc) {
                break L1;
              } else {
                L2: {
                  if (!cla.a(9181, param3)) {
                    break L2;
                  } else {
                    if (cla.a(9181, param5)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((kda) this).field_sd) {
                  stackOut_7_0 = new pe((kda) this, param3, param5, param0, param1, param4);
                  stackIn_8_0 = stackOut_7_0;
                  return (gf) (Object) stackIn_8_0;
                } else {
                  var9 = new hm((kda) this, gpa.field_a, una.field_g, lla.a(false, param3), lla.a(false, param5));
                  var9.a(param1, param5, param4, 113, 0, param0, param3, 0);
                  stackOut_5_0 = (hm) var9;
                  stackIn_6_0 = stackOut_5_0;
                  return (gf) (Object) stackIn_6_0;
                }
              }
            }
            stackOut_9_0 = new hm((kda) this, param3, param5, param2, param0, param1, param4);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var8;
            stackOut_11_1 = new StringBuilder().append("kda.FC(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return (gf) (Object) stackIn_10_0;
    }

    final qm c(int param0, boolean param1) {
        if (param0 != 6) {
            ((kda) this).field_dd = null;
        }
        return (qm) (Object) new og((kda) this, param1);
    }

    final mna a(ne[] param0, int param1) {
        RuntimeException var3 = null;
        dqa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dqa stackOut_2_0 = null;
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
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((kda) this).a(-57, 53, 67);
                break L1;
              }
            }
            stackOut_2_0 = new dqa(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("kda.WD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return (mna) (Object) stackIn_3_0;
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        for (var2 = -1 + ((kda) this).field_Vb; var2 >= 0; var2--) {
            jaggl.OpenGL.glActiveTexture(var2 + 33984);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
            jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34186, 34168);
        jaggl.OpenGL.glShadeModel(7425);
        jaggl.OpenGL.glClearDepth(1.0f);
        jaggl.OpenGL.glDepthFunc(515);
        jaggl.OpenGL.glPolygonMode(1028, 6914);
        jaggl.OpenGL.glEnable(2884);
        jaggl.OpenGL.glCullFace(1029);
        jaggl.OpenGL.glAlphaFunc(516, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glColorMaterial(1028, 5634);
        jaggl.OpenGL.glEnable(2903);
        float[] var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
        for (var3 = 0; 8 > var3; var3++) {
            var4 = var3 + 16384;
            jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
            jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
            jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
        }
        jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
        jaggl.OpenGL.glFogi(2917, 9729);
        jaggl.OpenGL.glHint(3156, 4353);
        ((kda) this).field_Mc.setSwapInterval(0);
        super.h(param0);
    }

    final void I(int param0) {
        ((kda) this).field_Hc = (float)(-((kda) this).field_Ac + ((kda) this).field_k);
        ((kda) this).field_B = (float)(-((kda) this).field_J) + ((kda) this).field_Hc;
        if (((kda) this).field_B < (float)((kda) this).field_D) {
            ((kda) this).field_B = (float)((kda) this).field_D;
        }
        jaggl.OpenGL.glFogf(2915, ((kda) this).field_B);
        jaggl.OpenGL.glFogf(2916, ((kda) this).field_Hc);
        dia.field_r[2] = (float)sea.c(((kda) this).field_g, 255) / 255.0f;
        dia.field_r[param0] = (float)sea.c(65280, ((kda) this).field_g) / 65280.0f;
        dia.field_r[0] = (float)sea.c(16711680, ((kda) this).field_g) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, dia.field_r, 0);
    }

    final na a(byte param0, int[][] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        dma stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dma stackOut_2_0 = null;
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
            L1: {
              if (param0 >= 7) {
                break L1;
              } else {
                field_hd = 36;
                break L1;
              }
            }
            stackOut_2_0 = new dma((kda) this, param3, param2, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("kda.VC(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (na) (Object) stackIn_3_0;
    }

    final void a() {
        if (-1 <= ((kda) this).field_Hb) {
            if (-1 >= ((kda) this).field_jc) {
                return;
            }
        }
        int var1 = ((kda) this).field_A;
        int var2 = ((kda) this).field_C;
        int var3 = ((kda) this).field_K;
        int var4 = ((kda) this).field_jb;
        ((kda) this).la();
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((kda) this).O(256);
        ((kda) this).b(false, -70);
        ((kda) this).d(0, false);
        ((kda) this).f(0, false);
        ((kda) this).b(false, (byte) 81);
        ((kda) this).a(true, (iva) null);
        ((kda) this).a((byte) -80, false, false, -2);
        ((kda) this).a((byte) 118, 1);
        ((kda) this).c(0, 1);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, ((kda) this).field_Hb, ((kda) this).field_jc, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((kda) this).KA(var1, var3, var2, var4);
    }

    final void B(byte param0) {
        if (param0 != -116) {
            ((kda) this).field_id = null;
        }
        jaggl.OpenGL.glViewport(((kda) this).field_i, ((kda) this).field_Kc, ((kda) this).field_Hb, ((kda) this).field_jc);
    }

    final eja a(int param0, boolean param1) {
        if (param0 != 26) {
            ((kda) this).field_rd = true;
        }
        return (eja) (Object) new sf((kda) this, una.field_f, param1);
    }

    final void g(byte param0) {
        int var2 = 0;
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        ((kda) this).i((byte) 123);
        var2 = 0;
        L0: while (true) {
          if (((kda) this).field_Bc <= var2) {
            L1: while (true) {
              if (var2 >= ((kda) this).field_S) {
                super.g(param0);
                return;
              } else {
                jaggl.OpenGL.glDisable(var2 + 16386);
                var2++;
                continue L1;
              }
            }
          } else {
            var3 = ((kda) this).field_ib[var2];
            var4 = var3.c(param0 ^ -43);
            var5 = 16386 + var2;
            var6 = var3.b(0) / 255.0f;
            dia.field_r[0] = (float)var3.d(13437);
            dia.field_r[1] = (float)var3.a(19848);
            dia.field_r[2] = (float)var3.b((byte) 11);
            dia.field_r[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var5, 4611, dia.field_r, 0);
            dia.field_r[3] = 1.0f;
            dia.field_r[1] = var6 * (float)sea.c(255, var4 >> 8);
            dia.field_r[2] = var6 * (float)sea.c(var4, 255);
            dia.field_r[0] = (float)sea.c(255, var4 >> 16) * var6;
            jaggl.OpenGL.glLightfv(var5, 4609, dia.field_r, 0);
            jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.a((byte) -23) * var3.a((byte) -84)));
            jaggl.OpenGL.glEnable(var5);
            var2++;
            continue L0;
          }
        }
    }

    final jca a(nha param0, mw param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("kda.NB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (jca) (Object) stackIn_1_0;
    }

    final void r(int param0) {
        dia.field_r[3] = 1.0f;
        dia.field_r[param0] = ((kda) this).field_fc * ((kda) this).field_sc;
        dia.field_r[2] = ((kda) this).field_Kb * ((kda) this).field_fc;
        dia.field_r[1] = ((kda) this).field_yb * ((kda) this).field_fc;
        jaggl.OpenGL.glLightModelfv(2899, dia.field_r, 0);
    }

    final boolean h() {
        return false;
    }

    final gf a(int param0, int param1, ft param2, byte param3, una param4) {
        RuntimeException var6 = null;
        pe stackIn_8_0 = null;
        hm stackIn_10_0 = null;
        hm stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hm stackOut_9_0 = null;
        pe stackOut_7_0 = null;
        hm stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -63) {
                break L1;
              } else {
                ((kda) this).field_Uc = false;
                break L1;
              }
            }
            L2: {
              if (((kda) this).field_Wc) {
                break L2;
              } else {
                L3: {
                  if (!cla.a(9181, param0)) {
                    break L3;
                  } else {
                    if (cla.a(9181, param1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((kda) this).field_sd) {
                  stackOut_9_0 = new hm((kda) this, param2, param4, lla.a(false, param0), lla.a(false, param1));
                  stackIn_10_0 = stackOut_9_0;
                  return (gf) (Object) stackIn_10_0;
                } else {
                  stackOut_7_0 = new pe((kda) this, param2, param4, param0, param1);
                  stackIn_8_0 = stackOut_7_0;
                  return (gf) (Object) stackIn_8_0;
                }
              }
            }
            stackOut_11_0 = new hm((kda) this, param2, param4, param0, param1);
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("kda.SC(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return (gf) (Object) stackIn_12_0;
    }

    final void M(int param0) {
        if (!((kda) this).field_Yb) {
            jaggl.OpenGL.glDisable(3042);
        } else {
            jaggl.OpenGL.glEnable(3042);
        }
        if (param0 != -27581) {
            ((kda) this).field_Nc = null;
        }
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void b(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -30 % ((param0 - -67) / 53);
            if (!((kda) this).field_Nb) {
              break L1;
            } else {
              if (!((kda) this).field_qc) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        jaggl.OpenGL.glDepthMask(stackIn_4_0 != 0);
    }

    final boolean a(boolean param0, una param1, ft param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((kda) this).i(102);
                break L1;
              }
            }
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("kda.VD(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final gf a(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, ft param6, int param7) {
        RuntimeException var9 = null;
        hm var10 = null;
        hm stackIn_7_0 = null;
        pe stackIn_10_0 = null;
        hm stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hm stackOut_11_0 = null;
        pe stackOut_9_0 = null;
        hm stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 1) {
                break L1;
              } else {
                ((kda) this).field_id = null;
                break L1;
              }
            }
            L2: {
              if (((kda) this).field_Wc) {
                break L2;
              } else {
                L3: {
                  if (!cla.a(9181, param7)) {
                    break L3;
                  } else {
                    if (!cla.a(9181, param3)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!((kda) this).field_sd) {
                  var10 = new hm((kda) this, param6, una.field_g, lla.a(false, param7), lla.a(false, param3));
                  var10.a(0, (byte) -124, param3, param1, param5, param2, param6, param7, 0);
                  stackOut_11_0 = (hm) var10;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = new pe((kda) this, param6, param7, param3, param1, param2, param5);
                  stackIn_10_0 = stackOut_9_0;
                  return (gf) (Object) stackIn_10_0;
                }
              }
            }
            stackOut_6_0 = new hm((kda) this, param6, param7, param3, param0, param1, param2, param5);
            stackIn_7_0 = stackOut_6_0;
            return (gf) (Object) stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("kda.VB(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param7 + ')');
        }
        return (gf) (Object) stackIn_12_0;
    }

    final void z(int param0) {
        if (param0 != 0) {
            field_cd = null;
        }
        jaggl.OpenGL.glMatrixMode(5890);
        if (od.field_h == ((kda) this).field_v[((kda) this).field_Cc]) {
            jaggl.OpenGL.glLoadIdentity();
        } else {
            jaggl.OpenGL.glLoadMatrixf(((kda) this).field_hc[((kda) this).field_Cc].a(jba.field_k, (byte) -37), 0);
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final synchronized void a(long param0, int param1) {
        vg var4 = new vg();
        if (param1 != -6115) {
            ((kda) this).field_ad = null;
        }
        var4.field_d = param0;
        ((kda) this).field_kd.b((byte) -65, var4);
    }

    final void d(int param0) {
        if (param0 != 1) {
            na discarded$0 = ((kda) this).a((byte) 9, (int[][]) null, false, -5);
        }
        int var2 = ((kda) this).field_Sc[((kda) this).field_Cc];
        if (!(var2 == 0)) {
            ((kda) this).field_Sc[((kda) this).field_Cc] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
    }

    final void v(int param0) {
        dia.field_r[3] = 1.0f;
        dia.field_r[2] = ((kda) this).field_j * ((kda) this).field_Kb;
        dia.field_r[1] = ((kda) this).field_j * ((kda) this).field_yb;
        dia.field_r[0] = ((kda) this).field_j * ((kda) this).field_sc;
        jaggl.OpenGL.glLightfv(16384, 4609, dia.field_r, 0);
        dia.field_r[0] = -((kda) this).field_pc * ((kda) this).field_sc;
        dia.field_r[3] = 1.0f;
        dia.field_r[2] = -((kda) this).field_pc * ((kda) this).field_Kb;
        if (param0 <= 19) {
            return;
        }
        dia.field_r[1] = ((kda) this).field_yb * -((kda) this).field_pc;
        jaggl.OpenGL.glLightfv(16385, 4609, dia.field_r, 0);
    }

    final void a(jca param0) {
    }

    final void a(float param0, float param1, float param2) {
    }

    final void d(byte param0) {
        if (!((kda) this).field_Wb) {
            jaggl.OpenGL.glDisable(3089);
        } else {
            jaggl.OpenGL.glEnable(3089);
        }
        int var2 = 43 % ((param0 - 69) / 50);
    }

    final void h(byte param0) {
        if (param0 == -102) {
          L0: {
            L1: {
              if (!((kda) this).field_l) {
                break L1;
              } else {
                if (((kda) this).field_yc) {
                  break L1;
                } else {
                  jaggl.OpenGL.glEnable(2896);
                  break L0;
                }
              }
            }
            jaggl.OpenGL.glDisable(2896);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void z(byte param0) {
        if (param0 != -73) {
            ((kda) this).a();
        }
        this.i(false);
    }

    final void f(byte param0) {
        if (param0 != -69) {
            ((kda) this).field_ed = -103;
        }
        if (!((kda) this).field_wc) {
            jaggl.OpenGL.glDisable(2929);
        } else {
            jaggl.OpenGL.glEnable(2929);
        }
    }

    final void a(int param0, int param1) throws qva {
        ((kda) this).field_Mc.swapBuffers();
    }

    final void a(int param0, iw param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (io.field_c == param1) {
                var6 = param0 * 2;
                var5_int = 1;
                break L1;
              } else {
                if (param1 != di.field_d) {
                  if (param1 != fma.field_f) {
                    if (param1 == vs.field_T) {
                      var5_int = 6;
                      var6 = param0 - -2;
                      break L1;
                    } else {
                      if (nb.field_b == param1) {
                        var6 = param0 + 2;
                        var5_int = 5;
                        break L1;
                      } else {
                        var5_int = 0;
                        var6 = param0;
                        break L1;
                      }
                    }
                  } else {
                    var6 = 3 * param0;
                    var5_int = 4;
                    break L1;
                  }
                } else {
                  var6 = param0 + 1;
                  var5_int = 3;
                  break L1;
                }
              }
            }
            L2: {
              if (param3 == 0) {
                break L2;
              } else {
                this.i(false);
                break L2;
              }
            }
            jaggl.OpenGL.glDrawArrays(var5_int, param2, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("kda.HC(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void d() {
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            ((kda) this).J(19822);
            ((kda) this).a(true, (iva) null);
            ((kda) this).c(0, 1);
            ((kda) this).i((byte) 126);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((kda) this).field_od, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kda.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        int var4 = 0;
        al var5 = null;
        al var6 = null;
        al var7 = null;
        al var8 = null;
        al var9 = null;
        vg var10 = null;
        vg var11 = null;
        al var12 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((kda) this).field_dd.d((byte) 14)) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, csa.field_i, 0);
                var2 = 0;
                break L1;
              }
            }
            L2: while (true) {
              if (((kda) this).field_Rc.d((byte) 14)) {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (var2 > 0) {
                          jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
                          var2 = 0;
                          L7: while (true) {
                            if (((kda) this).field_Oc.d((byte) 14)) {
                              break L6;
                            } else {
                              L8: {
                                var7 = (al) (Object) ((kda) this).field_Oc.c(62);
                                int incrementValue$6 = var2;
                                var2++;
                                csa.field_i[incrementValue$6] = var7.field_i;
                                if (var2 != 1000) {
                                  break L8;
                                } else {
                                  jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                                  var2 = 0;
                                  break L8;
                                }
                              }
                              continue L7;
                            }
                          }
                        } else {
                          if (((kda) this).field_Oc.d((byte) 14)) {
                            break L6;
                          } else {
                            var7 = (al) (Object) ((kda) this).field_Oc.c(62);
                            int incrementValue$7 = var2;
                            var2++;
                            csa.field_i[incrementValue$7] = var7.field_i;
                            if (var2 != 1000) {
                              break L5;
                            } else {
                              jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                              var2 = 0;
                              break L4;
                            }
                          }
                        }
                      }
                      L9: {
                        if (0 < var2) {
                          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                          var2 = 0;
                          L10: while (true) {
                            if (((kda) this).field_ad.d((byte) 14)) {
                              break L9;
                            } else {
                              L11: {
                                var8 = (al) (Object) ((kda) this).field_ad.c(30);
                                int incrementValue$8 = var2;
                                var2++;
                                csa.field_i[incrementValue$8] = (int)var8.field_d;
                                ((kda) this).field_Fb = ((kda) this).field_Fb - var8.field_i;
                                if (1000 != var2) {
                                  break L11;
                                } else {
                                  jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                                  var2 = 0;
                                  break L11;
                                }
                              }
                              continue L10;
                            }
                          }
                        } else {
                          if (((kda) this).field_ad.d((byte) 14)) {
                            break L9;
                          } else {
                            var8 = (al) (Object) ((kda) this).field_ad.c(30);
                            int incrementValue$9 = var2;
                            var2++;
                            csa.field_i[incrementValue$9] = (int)var8.field_d;
                            ((kda) this).field_Fb = ((kda) this).field_Fb - var8.field_i;
                            if (1000 != var2) {
                              break L5;
                            } else {
                              jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                              var2 = 0;
                              break L5;
                            }
                          }
                        }
                      }
                      if (var2 > 0) {
                        jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                        var2 = 0;
                        L12: while (true) {
                          if (((kda) this).field_bd.d((byte) 14)) {
                            break L3;
                          } else {
                            var9 = (al) (Object) ((kda) this).field_bd.c(-101);
                            jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                            continue L12;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    break L4;
                  }
                  L13: while (true) {
                    if (((kda) this).field_bd.d((byte) 14)) {
                      break L3;
                    } else {
                      var9 = (al) (Object) ((kda) this).field_bd.c(-101);
                      jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                      continue L13;
                    }
                  }
                }
                L14: while (true) {
                  if (((kda) this).field_nd.d((byte) 14)) {
                    L15: while (true) {
                      if (((kda) this).field_kd.d((byte) 14)) {
                        L16: while (true) {
                          if (((kda) this).field_bd.d((byte) 14)) {
                            L17: {
                              if (((kda) this).Q(10) <= 100663296) {
                                break L17;
                              } else {
                                if (bva.b((byte) -107) <= ((kda) this).field_Xc + 60000L) {
                                  break L17;
                                } else {
                                  System.gc();
                                  ((kda) this).field_Xc = bva.b((byte) -107);
                                  break L17;
                                }
                              }
                            }
                            super.c(param0);
                            return;
                          } else {
                            var12 = (al) (Object) ((kda) this).field_bd.c(-99);
                            jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
                            continue L16;
                          }
                        }
                      } else {
                        var11 = ((kda) this).field_kd.c(61);
                        jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                        continue L15;
                      }
                    }
                  } else {
                    var10 = ((kda) this).field_nd.c(-120);
                    jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                    continue L14;
                  }
                }
              } else {
                L18: {
                  var6 = (al) (Object) ((kda) this).field_Rc.c(-96);
                  int incrementValue$10 = var2;
                  var2++;
                  csa.field_i[incrementValue$10] = (int)var6.field_d;
                  ((kda) this).field_Xb = ((kda) this).field_Xb - var6.field_i;
                  if (var2 != 1000) {
                    break L18;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
                    var2 = 0;
                    break L18;
                  }
                }
                continue L2;
              }
            }
          } else {
            var5 = (al) (Object) ((kda) this).field_dd.c(61);
            int incrementValue$11 = var2;
            var2++;
            csa.field_i[incrementValue$11] = (int)var5.field_d;
            ((kda) this).field_X = ((kda) this).field_X - var5.field_i;
            if (var2 == 1000) {
              jaggl.OpenGL.glDeleteBuffersARB(var2, csa.field_i, 0);
              var2 = 0;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final void q(byte param0) {
        if (param0 != -78) {
            ((kda) this).field_Vc = true;
        }
    }

    final void ya() {
        ((kda) this).b(true, (byte) 81);
        jaggl.OpenGL.glClear(256);
    }

    final void h(boolean param0) {
        ((kda) this).field_Zc = param0 ? true : false;
        this.i(param0);
    }

    public static void T(int param0) {
        field_cd = null;
        field_gd = null;
    }

    final void u(byte param0) {
        if (param0 != -23) {
            ((kda) this).f(47);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, oj.a((byte) 101, ((kda) this).field_db[((kda) this).field_Cc]));
    }

    final mw b(int param0, int param1) {
        return null;
    }

    final void N(int param0) {
        if (param0 >= -10) {
            ((kda) this).b(20, (byte) 35);
        }
        dia.field_r[3] = (float)(((kda) this).field_bc >>> 24) / 255.0f;
        dia.field_r[2] = (float)sea.c(((kda) this).field_bc, 255) / 255.0f;
        dia.field_r[1] = (float)sea.c(65280, ((kda) this).field_bc) / 65280.0f;
        dia.field_r[0] = (float)sea.c(16711680, ((kda) this).field_bc) / 16711680.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, dia.field_r, 0);
    }

    final float c(byte param0) {
        if (param0 >= -39) {
            ((kda) this).field_Oc = null;
        }
        return 0.0f;
    }

    final boolean a(una param0, int param1, ft param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            if (param1 == -1) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kda.FD(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final gf a(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7) {
        RuntimeException var9 = null;
        hm var10 = null;
        Object stackIn_2_0 = null;
        hm stackIn_9_0 = null;
        pe stackIn_11_0 = null;
        hm stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_10_0 = null;
        hm stackOut_8_0 = null;
        hm stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (param2 == 0) {
              L1: {
                if (((kda) this).field_Wc) {
                  break L1;
                } else {
                  L2: {
                    if (!cla.a(9181, param4)) {
                      break L2;
                    } else {
                      if (cla.a(9181, param7)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((kda) this).field_sd) {
                    stackOut_10_0 = new pe((kda) this, param0, param4, param7, param6, param5, param1);
                    stackIn_11_0 = stackOut_10_0;
                    return (gf) (Object) stackIn_11_0;
                  } else {
                    var10 = new hm((kda) this, param0, una.field_h, lla.a(false, param4), lla.a(false, param7));
                    var10.a(0, param6, 0, param4, param7, param5, param1, param0, true);
                    stackOut_8_0 = (hm) var10;
                    stackIn_9_0 = stackOut_8_0;
                    return (gf) (Object) stackIn_9_0;
                  }
                }
              }
              stackOut_12_0 = new hm((kda) this, param0, param4, param7, param3, param6, param5, param1);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (gf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var9;
            stackOut_14_1 = new StringBuilder().append("kda.UC(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param6 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param7 + ')');
        }
        return (gf) (Object) stackIn_13_0;
    }

    final void a(mna param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ne var9 = null;
        og var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        int var15 = 0;
        gj var16 = null;
        int var17 = 0;
        ne[] var18 = null;
        boolean stackIn_24_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackIn_26_0 = false;
        int stackIn_26_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_37_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0 = false;
        boolean stackOut_25_0 = false;
        int stackOut_25_1 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_24_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        Object stackOut_55_0 = null;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = ((dqa) (Object) param0).field_f;
              var4 = 0;
              var5 = 0;
              if (param1 == -32) {
                break L1;
              } else {
                ((kda) this).field_id = null;
                break L1;
              }
            }
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              if (var18.length <= var8) {
                L3: {
                  stackOut_23_0 = ((kda) this).field_Vc;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_24_0 = stackOut_23_0;
                  if (var7 != 0) {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L3;
                  } else {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    break L3;
                  }
                }
                L4: {
                  if ((stackIn_26_0 ? 1 : 0) != stackIn_26_1) {
                    break L4;
                  } else {
                    L5: {
                      if (var7 == 0) {
                        jaggl.OpenGL.glDisableClientState(32884);
                        break L5;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32884);
                        break L5;
                      }
                    }
                    L6: {
                      stackOut_30_0 = this;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (var7 == 0) {
                        stackOut_32_0 = this;
                        stackOut_32_1 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        break L6;
                      } else {
                        stackOut_31_0 = this;
                        stackOut_31_1 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        break L6;
                      }
                    }
                    ((kda) this).field_Vc = stackIn_33_1 != 0;
                    break L4;
                  }
                }
                L7: {
                  if (var6 != 0) {
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L7;
                  } else {
                    stackOut_35_0 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    break L7;
                  }
                }
                L8: {
                  if (stackIn_37_0 != (((kda) this).field_Yc ? 1 : 0)) {
                    break L8;
                  } else {
                    L9: {
                      if (var6 != 0) {
                        jaggl.OpenGL.glEnableClientState(32885);
                        break L9;
                      } else {
                        jaggl.OpenGL.glDisableClientState(32885);
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_41_0 = this;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_42_0 = stackOut_41_0;
                      if (var6 == 0) {
                        stackOut_43_0 = this;
                        stackOut_43_1 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        break L10;
                      } else {
                        stackOut_42_0 = this;
                        stackOut_42_1 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        break L10;
                      }
                    }
                    ((kda) this).field_Yc = stackIn_44_1 != 0;
                    break L8;
                  }
                }
                L11: {
                  if (((kda) this).field_ld) {
                    stackOut_47_0 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    break L11;
                  } else {
                    stackOut_46_0 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    break L11;
                  }
                }
                L12: {
                  stackOut_48_0 = stackIn_48_0;
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_49_0 = stackOut_48_0;
                  if (var5 != 0) {
                    stackOut_50_0 = stackIn_50_0;
                    stackOut_50_1 = 0;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    break L12;
                  } else {
                    stackOut_49_0 = stackIn_49_0;
                    stackOut_49_1 = 1;
                    stackIn_51_0 = stackOut_49_0;
                    stackIn_51_1 = stackOut_49_1;
                    break L12;
                  }
                }
                L13: {
                  if (stackIn_51_0 == stackIn_51_1) {
                    break L13;
                  } else {
                    L14: {
                      if (var5 == 0) {
                        jaggl.OpenGL.glDisableClientState(32886);
                        break L14;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32886);
                        break L14;
                      }
                    }
                    L15: {
                      stackOut_55_0 = this;
                      stackIn_57_0 = stackOut_55_0;
                      stackIn_56_0 = stackOut_55_0;
                      if (var5 == 0) {
                        stackOut_57_0 = this;
                        stackOut_57_1 = 0;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        break L15;
                      } else {
                        stackOut_56_0 = this;
                        stackOut_56_1 = 1;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        break L15;
                      }
                    }
                    ((kda) this).field_ld = stackIn_58_1 != 0;
                    break L13;
                  }
                }
                L16: {
                  if (((kda) this).field_ed < var4) {
                    var8 = ((kda) this).field_ed;
                    L17: while (true) {
                      if (var4 <= var8) {
                        ((kda) this).field_ed = var4;
                        break L16;
                      } else {
                        jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                        jaggl.OpenGL.glEnableClientState(32888);
                        var8++;
                        continue L17;
                      }
                    }
                  } else {
                    if (var4 >= ((kda) this).field_ed) {
                      break L16;
                    } else {
                      var8 = var4;
                      L18: while (true) {
                        if (var8 >= ((kda) this).field_ed) {
                          ((kda) this).field_ed = var4;
                          break L16;
                        } else {
                          jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                          jaggl.OpenGL.glDisableClientState(32888);
                          var8++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                var9 = var18[var8];
                var10 = ((kda) this).field_id[var8];
                var11 = 0;
                var12 = var10.a((byte) -111);
                var13 = var10.b(true);
                var10.c(-3);
                var15 = 0;
                L19: while (true) {
                  if (var9.b((byte) -77) <= var15) {
                    var8++;
                    continue L2;
                  } else {
                    L20: {
                      var16 = var9.b(0, var15);
                      if (var16 == gj.field_p) {
                        jaggl.OpenGL.glVertexPointer(3, 5126, var12, var13 + (long)var11);
                        var7 = 1;
                        break L20;
                      } else {
                        if (gj.field_e == var16) {
                          jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                          var6 = 1;
                          break L20;
                        } else {
                          if (var16 != gj.field_b) {
                            if (var16 != gj.field_m) {
                              if (var16 == gj.field_n) {
                                int incrementValue$4 = var4;
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(incrementValue$4 + 33984);
                                jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                                break L20;
                              } else {
                                if (gj.field_k == var16) {
                                  int incrementValue$5 = var4;
                                  var4++;
                                  jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$5);
                                  jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 - -(long)var11);
                                  break L20;
                                } else {
                                  if (gj.field_j != var16) {
                                    break L20;
                                  } else {
                                    int incrementValue$6 = var4;
                                    var4++;
                                    jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$6);
                                    jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 + (long)var11);
                                    break L20;
                                  }
                                }
                              }
                            } else {
                              int incrementValue$7 = var4;
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(incrementValue$7 + 33984);
                              jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, (long)var11 + var13);
                              break L20;
                            }
                          } else {
                            var5 = 1;
                            jaggl.OpenGL.glColorPointer(4, 5121, var12, (long)var11 + var13);
                            break L20;
                          }
                        }
                      }
                    }
                    var11 = var11 + var16.field_l;
                    var15++;
                    continue L19;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var3;
            stackOut_70_1 = new StringBuilder().append("kda.OC(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L21;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L21;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param1 + ')');
        }
    }

    final void b(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((kda) this).field_Vc = true;
            break L0;
          }
        }
        L1: {
          if (((kda) this).field_lb != dfa.field_b) {
            if (((kda) this).field_lb == mp.field_a) {
              jaggl.OpenGL.glBlendFunc(1, 1);
              break L1;
            } else {
              if (bma.field_w == ((kda) this).field_lb) {
                jaggl.OpenGL.glBlendFunc(774, 1);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            jaggl.OpenGL.glBlendFunc(770, 771);
            break L1;
          }
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = -91 / ((-67 - param1) / 47);
        return 0 != (32 & param0) ? true : false;
    }

    final void e(boolean param0) {
        jaggl.OpenGL.glActiveTexture(((kda) this).field_Cc + 33984);
        if (param0) {
            ((kda) this).field_Mc = null;
        }
    }

    final synchronized void b(int param0, byte param1) {
        vg var3 = new vg();
        var3.field_d = (long)param0;
        if (param1 != 18) {
            return;
        }
        ((kda) this).field_nd.b((byte) -124, var3);
    }

    final Object a(boolean param0, java.awt.Canvas param1) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        Long stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Long stackOut_5_0 = null;
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
            var3_long = ((kda) this).field_Mc.prepareSurface(param1);
            if (var3_long == -1L) {
              throw new RuntimeException();
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((kda) this).v(42);
                  break L1;
                }
              }
              stackOut_5_0 = new Long(var3_long);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("kda.DE(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return (Object) (Object) stackIn_6_0;
    }

    final void a(dn param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 != kga.field_o) {
                var3_int = dk.a(param0, 0);
                jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
                jaggl.OpenGL.glEnable(3168);
                jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
                jaggl.OpenGL.glEnable(3169);
                jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
                jaggl.OpenGL.glEnable(3170);
                break L1;
              } else {
                jaggl.OpenGL.glDisable(3168);
                jaggl.OpenGL.glDisable(3169);
                jaggl.OpenGL.glDisable(3170);
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                ((kda) this).v(82);
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
            stackOut_6_1 = new StringBuilder().append("kda.EC(");
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final lv a(byte[] param0, ft param1, byte param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        jd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              if (param2 <= -1) {
                break L1;
              } else {
                this.i(true);
                break L1;
              }
            }
            stackOut_2_0 = new jd((kda) this, param1, param4, param3, param5, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("kda.TD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (lv) (Object) stackIn_3_0;
    }

    final vw e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param1 >= 37) {
            break L0;
          } else {
            var5 = null;
            ((kda) this).a((dn) null, (byte) 83);
            break L0;
          }
        }
        var3 = param0;
        if (var3 == 3) {
          return (vw) (Object) new bta((kda) this, ((kda) this).field_I);
        } else {
          if (var3 != 4) {
            if (var3 != 8) {
              return super.e(param0, 115);
            } else {
              return (vw) (Object) new dp((kda) this, ((kda) this).field_I, ((kda) this).field_Mb);
            }
          } else {
            return (vw) (Object) new pja((kda) this, ((kda) this).field_I, ((kda) this).field_Mb);
          }
        }
    }

    final void w(byte param0) {
        if (!((kda) this).field_Zb) {
            jaggl.OpenGL.glDisable(16384);
            jaggl.OpenGL.glDisable(16385);
        } else {
            jaggl.OpenGL.glEnable(16384);
            jaggl.OpenGL.glEnable(16385);
        }
        if (param0 != -21) {
            ((kda) this).field_id = null;
        }
    }

    final void w(int param0) {
        if (param0 > -30) {
            return;
        }
        if (!((kda) this).field_m) {
            jaggl.OpenGL.glDisable(3008);
        } else {
            jaggl.OpenGL.glEnable(3008);
        }
    }

    kda(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, cn param4, int param5) {
        super(param1, (Object) (Object) new Long(param2), param3, param4, param5, 1);
        String var21_ref = null;
        Throwable var8 = null;
        RuntimeException var8_ref = null;
        String[] var9 = null;
        NumberFormatException var10 = null;
        int var10_int = 0;
        Throwable var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        Object[] var14 = null;
        String[] var14_array = null;
        int var15 = 0;
        Object var16 = null;
        String var16_ref = null;
        Exception var17 = null;
        String var20 = null;
        Object var21 = null;
        int[] var26 = null;
        int[] var27 = null;
        Object var28 = null;
        Object var29 = null;
        Object var30 = null;
        CharSequence var31 = null;
        CharSequence var32 = null;
        CharSequence var33 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var21_ref = null;
        var28 = null;
        var29 = null;
        var30 = null;
        ((kda) this).field_bd = new vna();
        ((kda) this).field_dd = new vna();
        ((kda) this).field_Rc = new vna();
        ((kda) this).field_Oc = new vna();
        ((kda) this).field_ad = new vna();
        ((kda) this).field_nd = new vna();
        ((kda) this).field_kd = new vna();
        ((kda) this).field_id = new og[16];
        ((kda) this).field_Qc = new jaggl.MapBuffer();
        ((kda) this).field_Tc = new jaggl.MapBuffer();
        try {
          L0: {
            try {
              L1: {
                L2: {
                  ((kda) this).field_Mc = param0;
                  boolean discarded$3 = ((kda) this).field_Mc.a();
                  ((kda) this).field_Nc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                  ((kda) this).field_jd = jaggl.OpenGL.glGetString(7937).toLowerCase();
                  if (((kda) this).field_Nc.indexOf("microsoft") != 0) {
                    break L2;
                  } else {
                    if (-1 != ((kda) this).field_Nc.indexOf("brian paul")) {
                      break L2;
                    } else {
                      if (0 == ((kda) this).field_Nc.indexOf("mesa")) {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        var9 = rga.a(32287, var20.replace('.', ' '), ' ');
                        if (2 <= var9.length) {
                          try {
                            L3: {
                              var10_int = jb.a((CharSequence) (Object) var9[0], (byte) 70);
                              var11_int = jb.a((CharSequence) (Object) var9[1], (byte) 70);
                              ((kda) this).field_md = var10_int * 10 + var11_int;
                              break L3;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            var10 = (NumberFormatException) (Object) decompiledCaughtException;
                            throw new RuntimeException("");
                          }
                          if (((kda) this).field_md >= 12) {
                            if (((kda) this).field_Mc.a("GL_ARB_multitexture")) {
                              if (((kda) this).field_Mc.a("GL_ARB_texture_env_combine")) {
                                var26 = new int[1];
                                jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                                ((kda) this).field_Vb = var26[0];
                                if (((kda) this).field_Vb >= 2) {
                                  L4: {
                                    ((kda) this).field_e = 8;
                                    ((kda) this).field_fd = ((kda) this).field_Mc.a("GL_ARB_vertex_buffer_object");
                                    boolean discarded$4 = ((kda) this).field_Mc.a("GL_ARB_multisample");
                                    ((kda) this).field_sd = ((kda) this).field_Mc.a("GL_ARB_texture_rectangle");
                                    ((kda) this).field_Ob = ((kda) this).field_Mc.a("GL_ARB_texture_cube_map");
                                    ((kda) this).field_Wc = ((kda) this).field_Mc.a("GL_ARB_texture_non_power_of_two");
                                    ((kda) this).field_x = ((kda) this).field_Mc.a("GL_EXT_texture3D");
                                    ((kda) this).field_Uc = ((kda) this).field_Mc.a("GL_ARB_vertex_shader");
                                    ((kda) this).field_qd = ((kda) this).field_Mc.a("GL_ARB_vertex_program");
                                    ((kda) this).field_Pc = ((kda) this).field_Mc.a("GL_ARB_fragment_shader");
                                    boolean discarded$5 = ((kda) this).field_Mc.a("GL_ARB_fragment_program");
                                    ((kda) this).field_Sc = new int[((kda) this).field_Vb];
                                    stackOut_18_0 = this;
                                    stackIn_20_0 = stackOut_18_0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (!jaclib.memory.Stream.b()) {
                                      stackOut_20_0 = this;
                                      stackOut_20_1 = 5121;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      break L4;
                                    } else {
                                      stackOut_19_0 = this;
                                      stackOut_19_1 = 33639;
                                      stackIn_21_0 = stackOut_19_0;
                                      stackIn_21_1 = stackOut_19_1;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    ((kda) this).field_od = stackIn_21_1;
                                    if (((kda) this).field_jd.indexOf("radeon") == -1) {
                                      break L5;
                                    } else {
                                      var11_int = 0;
                                      var12 = 0;
                                      var13 = 0;
                                      var14_array = rga.a(32287, ((kda) this).field_jd.replace('/', ' '), ' ');
                                      var15 = 0;
                                      L6: while (true) {
                                        L7: {
                                          if (var14_array.length <= var15) {
                                            break L7;
                                          } else {
                                            var21_ref = var14_array[var15];
                                            var16_ref = var21_ref;
                                            var16_ref = var21_ref;
                                            try {
                                              L8: {
                                                L9: {
                                                  if (0 >= var21_ref.length()) {
                                                    break L9;
                                                  } else {
                                                    L10: {
                                                      if (120 != var21_ref.charAt(0)) {
                                                        break L10;
                                                      } else {
                                                        if (3 > var21_ref.length()) {
                                                          break L10;
                                                        } else {
                                                          var31 = (CharSequence) (Object) var21_ref.substring(1, 3);
                                                          if (!sqa.a(var31, -3)) {
                                                            break L10;
                                                          } else {
                                                            var13 = 1;
                                                            var16_ref = var21_ref.substring(1);
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (!var16_ref.equals((Object) (Object) "hd")) {
                                                      L11: {
                                                        if (!var16_ref.startsWith("hd")) {
                                                          break L11;
                                                        } else {
                                                          var12 = 1;
                                                          var16_ref = var16_ref.substring(2);
                                                          break L11;
                                                        }
                                                      }
                                                      if (var16_ref.length() < 4) {
                                                        break L9;
                                                      } else {
                                                        var32 = (CharSequence) (Object) var16_ref.substring(0, 4);
                                                        if (!sqa.a(var32, -3)) {
                                                          break L9;
                                                        } else {
                                                          var33 = (CharSequence) (Object) var16_ref.substring(0, 4);
                                                          var11_int = jb.a(var33, (byte) 70);
                                                          decompiledRegionSelector0 = 1;
                                                          break L8;
                                                        }
                                                      }
                                                    } else {
                                                      var12 = 1;
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                decompiledRegionSelector0 = 0;
                                                break L8;
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter1) {
                                              decompiledCaughtException = decompiledCaughtParameter1;
                                              L12: {
                                                var17 = (Exception) (Object) decompiledCaughtException;
                                                decompiledRegionSelector0 = 0;
                                                break L12;
                                              }
                                            }
                                            if (decompiledRegionSelector0 == 0) {
                                              var15++;
                                              continue L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (var13 != 0) {
                                            break L13;
                                          } else {
                                            if (var12 != 0) {
                                              break L13;
                                            } else {
                                              L14: {
                                                if (var11_int < 7000) {
                                                  break L14;
                                                } else {
                                                  if (9250 < var11_int) {
                                                    break L14;
                                                  } else {
                                                    ((kda) this).field_x = false;
                                                    break L14;
                                                  }
                                                }
                                              }
                                              if (var11_int < 7000) {
                                                break L13;
                                              } else {
                                                if (var11_int > 7999) {
                                                  break L13;
                                                } else {
                                                  ((kda) this).field_fd = false;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((kda) this).field_sd = ((kda) this).field_sd & ((kda) this).field_Mc.a("GL_ARB_half_float_pixel");
                                        break L5;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (((kda) this).field_Nc.indexOf("intel") != -1) {
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (!((kda) this).field_fd) {
                                      break L16;
                                    } else {
                                      try {
                                        L17: {
                                          var27 = new int[1];
                                          jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                                          break L17;
                                        }
                                      } catch (java.lang.Throwable decompiledCaughtParameter2) {
                                        decompiledCaughtException = decompiledCaughtParameter2;
                                        var11 = decompiledCaughtException;
                                        throw new RuntimeException("");
                                      }
                                      break L16;
                                    }
                                  }
                                  break L1;
                                } else {
                                  throw new RuntimeException("");
                                }
                              } else {
                                throw new RuntimeException("");
                              }
                            } else {
                              throw new RuntimeException("");
                            }
                          } else {
                            throw new RuntimeException("");
                          }
                        } else {
                          throw new RuntimeException("");
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var8 = decompiledCaughtException;
              var8.printStackTrace();
              ((kda) this).a(true);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L18: {
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var8_ref;
            stackOut_58_1 = new StringBuilder().append("kda.<init>(");
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param0 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L18;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L18;
            }
          }
          L19: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L19;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L19;
            }
          }
          L20: {
            stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',').append(param2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param3 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L20;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L20;
            }
          }
          L21: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param4 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param5 + ')');
        }
    }

    final void S(int param0) {
        jaggl.OpenGL.glScissor(((kda) this).field_A + ((kda) this).field_i, -((kda) this).field_jb + ((kda) this).field_Kc + ((kda) this).field_jc, ((kda) this).field_C - ((kda) this).field_A, -((kda) this).field_K + ((kda) this).field_jb);
        if (param0 != -3335) {
            field_pd = false;
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        al var4 = new al(param0);
        var4.field_d = (long)param1;
        if (param2 <= 41) {
            return;
        }
        ((kda) this).field_dd.b((byte) -80, (vg) (Object) var4);
    }

    final void a(int param0, byte param1) {
        if (param1 < 27) {
            ((kda) this).a(-22, 75, 26, 3);
        }
    }

    final void a(nh param0, boolean param1) {
    }

    private final void i(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (!((kda) this).field_rd) {
            break L0;
          } else {
            jaggl.OpenGL.glPopMatrix();
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            ((kda) this).field_ld = true;
            break L1;
          }
        }
        L2: {
          if (((kda) this).field_r.a(-43)) {
            L3: {
              if (((kda) this).field_Zc) {
                break L3;
              } else {
                jaggl.OpenGL.glLoadMatrixf(((kda) this).field_Qb.a(jba.field_k, (byte) -37), 0);
                ((kda) this).field_Zc = true;
                ((kda) this).i(70);
                ((kda) this).g((byte) 92);
                break L3;
              }
            }
            if (((kda) this).field_gb) {
              ((kda) this).field_rd = false;
              break L2;
            } else {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glMultMatrixf(((kda) this).field_q.a(jba.field_k, (byte) -37), 0);
              ((kda) this).field_rd = true;
              break L2;
            }
          } else {
            if (((kda) this).field_gb) {
              jaggl.OpenGL.glLoadIdentity();
              ((kda) this).field_rd = false;
              break L2;
            } else {
              jaggl.OpenGL.glLoadMatrixf(((kda) this).field_q.a(jba.field_k, (byte) -37), 0);
              ((kda) this).field_rd = false;
              break L2;
            }
          }
        }
    }

    final void D(int param0) {
        L0: {
          L1: {
            if (!((kda) this).field_U) {
              break L1;
            } else {
              if (!((kda) this).field_Bb) {
                break L1;
              } else {
                if (0 <= ((kda) this).field_J) {
                  jaggl.OpenGL.glEnable(2912);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          jaggl.OpenGL.glDisable(2912);
          break L0;
        }
        L2: {
          if (param0 == 2) {
            break L2;
          } else {
            ((kda) this).field_Zc = true;
            break L2;
          }
        }
    }

    final void a(fp param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glTexEnvi(8960, param1 + 34176, bma.a(param0, true));
              if (param2 == -6219) {
                break L1;
              } else {
                ((kda) this).field_Tc = null;
                break L1;
              }
            }
            L2: {
              if (!param3) {
                L3: {
                  stackOut_7_0 = 8960;
                  stackOut_7_1 = param1 + 34192;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (param4) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = 769;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L3;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 768;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L3;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_10_0, stackIn_10_1, stackIn_10_2);
                break L2;
              } else {
                L4: {
                  stackOut_3_0 = 8960;
                  stackOut_3_1 = param1 + 34192;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (param4) {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = 771;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    break L4;
                  } else {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 770;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    break L4;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_6_0, stackIn_6_1, stackIn_6_2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("kda.TC(");
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        if (!param1) {
            jaggl.OpenGL.glDisable(32925);
        } else {
            jaggl.OpenGL.glEnable(32925);
        }
        if (param0 != 1) {
            field_cd = null;
        }
    }

    final void a(fp param0, int param1, boolean param2, int param3) {
        try {
            if (param1 != 15802) {
                ((kda) this).N(120);
            }
            jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, bma.a(param0, true));
            jaggl.OpenGL.glTexEnvi(8960, 34200 - -param3, !param2 ? 770 : 771);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kda.AC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, ((kda) this).field_Gb, 0);
        int var2 = 73 / ((-11 - param0) / 56);
        jaggl.OpenGL.glLightfv(16385, 4611, ((kda) this).field_M, 0);
    }

    final void c() {
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param2 != 2) {
            return;
        }
        al var4 = new al(param1);
        var4.field_d = (long)param0;
        ((kda) this).field_Rc.b((byte) -67, (vg) (Object) var4);
    }

    final void a(Object param0, boolean param1, java.awt.Canvas param2) {
        Long var4 = null;
        RuntimeException var4_ref = null;
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
        try {
          L0: {
            L1: {
              var4 = (Long) param0;
              ((kda) this).field_Mc.releaseSurface(param2, var4.longValue());
              if (!param1) {
                break L1;
              } else {
                ((kda) this).I(-84);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var4_ref;
            stackOut_3_1 = new StringBuilder().append("kda.SB(");
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
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void e(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(((kda) this).field_T, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 < 26) {
            ((kda) this).d();
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pd = false;
        field_cd = "Invite only";
        field_hd = 48;
        field_gd = "Go Back";
    }
}
