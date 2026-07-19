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
        try {
            this.field_id[param1] = (og) ((Object) param2);
            if (param0 >= -124) {
                this.field_Xc = 121L;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kda.QD(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void k() {
        boolean discarded$0 = false;
        super.k();
        if (null != this.field_Mc) {
            discarded$0 = this.field_Mc.b();
            this.field_Mc.release();
            this.field_Mc = null;
        }
    }

    final void f(int param0) {
        if (param0 != -3485) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            this.a((Object) null, false, (java.awt.Canvas) null);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, oj.a((byte) 126, this.field_mc[this.field_Cc]));
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
              L2: {
                if (io.field_c == param4) {
                  break L2;
                } else {
                  L3: {
                    if (di.field_d == param4) {
                      break L3;
                    } else {
                      L4: {
                        if (fma.field_f != param4) {
                          break L4;
                        } else {
                          var9 = 3 * param6;
                          var8_int = 4;
                          if (var12 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (param4 != vs.field_T) {
                          break L5;
                        } else {
                          var8_int = 6;
                          var9 = param6 - -2;
                          if (var12 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (param4 == nb.field_b) {
                          break L6;
                        } else {
                          var9 = param6;
                          var8_int = 0;
                          if (var12 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var9 = param6 + 2;
                      var8_int = 5;
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var8_int = 3;
                  var9 = 1 + param6;
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var9 = param6 * 2;
              var8_int = 1;
              break L1;
            }
            L7: {
              var10 = param0.b(param1 ^ 13611);
              var11 = (sf) ((Object) param0);
              var11.c(-3);
              jaggl.OpenGL.glDrawElements(var8_int, var9, lr.a(var10, 5126), var11.b(true) - -(long)(param3 * var10.field_e));
              if (param1 == -19394) {
                break L7;
              } else {
                this.N(76);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var8);
            stackOut_15_1 = new StringBuilder().append("kda.MD(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param5 + ',' + param6 + ')');
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
        int decompiledRegionSelector0 = 0;
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
              if (this.field_Wc) {
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
                if (this.field_sd) {
                  stackOut_7_0 = new pe((kda) (this), param3, param5, param0, param1, param4);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var9 = new hm((kda) (this), gpa.field_a, una.field_g, lla.a(false, param3), lla.a(false, param5));
                  var9.a(param1, param5, param4, 113, 0, param0, param3, 0);
                  stackOut_5_0 = (hm) (var9);
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackOut_9_0 = new hm((kda) (this), param3, param5, param2, param0, param1, param4);
            stackIn_10_0 = stackOut_9_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var8);
            stackOut_11_1 = new StringBuilder().append("kda.FC(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gf) ((Object) stackIn_6_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gf) ((Object) stackIn_8_0);
          } else {
            return (gf) ((Object) stackIn_10_0);
          }
        }
    }

    final qm c(int param0, boolean param1) {
        if (param0 != 6) {
            this.field_dd = (vna) null;
        }
        return (qm) ((Object) new og((kda) (this), param1));
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
                this.a(-57, 53, 67);
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
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("kda.WD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (mna) ((Object) stackIn_3_0);
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = -1 + this.field_Vb;
        L0: while (true) {
          L1: {
            L2: {
              if (var2 < 0) {
                break L2;
              } else {
                jaggl.OpenGL.glActiveTexture(var2 + 33984);
                jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
                jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
                jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
                jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
                jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
                var2--;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
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
            break L1;
          }
          var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
          var3 = 0;
          L3: while (true) {
            L4: {
              L5: {
                if (8 <= var3) {
                  break L5;
                } else {
                  var4 = var3 + 16384;
                  jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                  jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                  jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                  var3++;
                  if (var5 != 0) {
                    break L4;
                  } else {
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
              jaggl.OpenGL.glFogi(2917, 9729);
              jaggl.OpenGL.glHint(3156, 4353);
              this.field_Mc.setSwapInterval(0);
              super.h(param0);
              break L4;
            }
            return;
          }
        }
    }

    final void I(int param0) {
        this.field_Hc = (float)(-this.field_Ac + this.field_k);
        this.field_B = (float)(-this.field_J) + this.field_Hc;
        if (this.field_B < (float)this.field_D) {
            this.field_B = (float)this.field_D;
        }
        jaggl.OpenGL.glFogf(2915, this.field_B);
        jaggl.OpenGL.glFogf(2916, this.field_Hc);
        dia.field_r[2] = (float)sea.c(this.field_g, 255) / 255.0f;
        dia.field_r[param0] = (float)sea.c(65280, this.field_g) / 65280.0f;
        dia.field_r[0] = (float)sea.c(16711680, this.field_g) / 16711680.0f;
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
            stackOut_2_0 = new dma((kda) (this), param3, param2, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("kda.VC(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (na) ((Object) stackIn_3_0);
    }

    final void a() {
        if (-1 <= (this.field_Hb ^ -1)) {
            if (-1 <= (this.field_jc ^ -1)) {
                return;
            }
        }
        int var1 = this.field_A;
        int var2 = this.field_C;
        int var3 = this.field_K;
        int var4 = this.field_jb;
        this.la();
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.O(256);
        this.b(false, -70);
        this.d(0, false);
        this.f(0, false);
        this.b(false, (byte) 81);
        this.a(true, (iva) null);
        this.a((byte) -80, false, false, -2);
        this.a((byte) 118, 1);
        this.c(0, 1);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, this.field_Hb, this.field_jc, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.KA(var1, var3, var2, var4);
    }

    final void B(byte param0) {
        if (param0 != -116) {
            this.field_id = (og[]) null;
        }
        jaggl.OpenGL.glViewport(this.field_i, this.field_Kc, this.field_Hb, this.field_jc);
    }

    final eja a(int param0, boolean param1) {
        if (param0 != 26) {
            this.field_rd = true;
        }
        return (eja) ((Object) new sf((kda) (this), una.field_f, param1));
    }

    final void g(byte param0) {
        int var2 = 0;
        ob var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        this.i((byte) 123);
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_Bc <= var2) {
                break L2;
              } else {
                var3 = this.field_ib[var2];
                var4 = var3.c(param0 ^ -43);
                var5 = 16386 + var2;
                var6 = var3.b(0) / 255.0f;
                dia.field_r[0] = (float)var3.d(13437);
                dia.field_r[1] = (float)var3.a(19848);
                dia.field_r[2] = (float)var3.b((byte) 11);
                dia.field_r[3] = 1.0f;
                jaggl.OpenGL.glLightfv(var5, 4611, dia.field_r, 0);
                dia.field_r[3] = 1.0f;
                dia.field_r[1] = var6 * (float)sea.c(255, var4 >> -805411576);
                dia.field_r[2] = var6 * (float)sea.c(var4, 255);
                dia.field_r[0] = (float)sea.c(255, var4 >> -572539088) * var6;
                jaggl.OpenGL.glLightfv(var5, 4609, dia.field_r, 0);
                jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.a((byte) -23) * var3.a((byte) -84)));
                jaggl.OpenGL.glEnable(var5);
                var2++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (var2 >= this.field_S) {
                    break L5;
                  } else {
                    jaggl.OpenGL.glDisable(var2 + 16386);
                    var2++;
                    if (var7 != 0) {
                      break L4;
                    } else {
                      if (var7 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                super.g(param0);
                break L4;
              }
              break L1;
            }
          }
          return;
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
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("kda.NB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return (jca) ((Object) stackIn_1_0);
    }

    final void r(int param0) {
        dia.field_r[3] = 1.0f;
        dia.field_r[param0] = this.field_fc * this.field_sc;
        dia.field_r[2] = this.field_Kb * this.field_fc;
        dia.field_r[1] = this.field_yb * this.field_fc;
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
        int decompiledRegionSelector0 = 0;
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
                this.field_Uc = false;
                break L1;
              }
            }
            L2: {
              if (this.field_Wc) {
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
                if (!this.field_sd) {
                  stackOut_9_0 = new hm((kda) (this), param2, param4, lla.a(false, param0), lla.a(false, param1));
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_7_0 = new pe((kda) (this), param2, param4, param0, param1);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackOut_11_0 = new hm((kda) (this), param2, param4, param0, param1);
            stackIn_12_0 = stackOut_11_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("kda.SC(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gf) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gf) ((Object) stackIn_10_0);
          } else {
            return (gf) ((Object) stackIn_12_0);
          }
        }
    }

    final void M(int param0) {
        L0: {
          L1: {
            if (this.field_Yb) {
              break L1;
            } else {
              jaggl.OpenGL.glDisable(3042);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glEnable(3042);
          break L0;
        }
        L2: {
          if (param0 == -27581) {
            break L2;
          } else {
            this.field_Nc = (String) null;
            break L2;
          }
        }
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> -169380072) / 255.0f);
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
            if (!this.field_Nb) {
              break L1;
            } else {
              if (!this.field_qc) {
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
                this.i(102);
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
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("kda.VD(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
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
        int decompiledRegionSelector0 = 0;
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
                this.field_id = (og[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_Wc) {
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
                if (!this.field_sd) {
                  var10 = new hm((kda) (this), param6, una.field_g, lla.a(false, param7), lla.a(false, param3));
                  var10.a(0, (byte) -124, param3, param1, param5, param2, param6, param7, 0);
                  stackOut_11_0 = (hm) (var10);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_9_0 = new pe((kda) (this), param6, param7, param3, param1, param2, param5);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_6_0 = new hm((kda) (this), param6, param7, param3, param0, param1, param2, param5);
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var9);
            stackOut_13_1 = new StringBuilder().append("kda.VB(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param6 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gf) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gf) ((Object) stackIn_10_0);
          } else {
            return (gf) ((Object) stackIn_12_0);
          }
        }
    }

    final void z(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            field_cd = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            jaggl.OpenGL.glMatrixMode(5890);
            if (od.field_h != this.field_v[this.field_Cc]) {
              break L2;
            } else {
              jaggl.OpenGL.glLoadIdentity();
              if (!TombRacer.field_G) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          jaggl.OpenGL.glLoadMatrixf(this.field_hc[this.field_Cc].a(jba.field_k, (byte) -37), 0);
          break L1;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final synchronized void a(long param0, int param1) {
        vg var4 = new vg();
        if (param1 != -6115) {
            this.field_ad = (vna) null;
        }
        var4.field_d = param0;
        this.field_kd.b((byte) -65, var4);
    }

    final void d(int param0) {
        na discarded$0 = null;
        if (param0 != 1) {
            discarded$0 = this.a((byte) 9, (int[][]) null, false, -5);
        }
        int var2 = this.field_Sc[this.field_Cc];
        if (!(var2 == 0)) {
            this.field_Sc[this.field_Cc] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
    }

    final void v(int param0) {
        dia.field_r[3] = 1.0f;
        dia.field_r[2] = this.field_j * this.field_Kb;
        dia.field_r[1] = this.field_j * this.field_yb;
        dia.field_r[0] = this.field_j * this.field_sc;
        jaggl.OpenGL.glLightfv(16384, 4609, dia.field_r, 0);
        dia.field_r[0] = -this.field_pc * this.field_sc;
        dia.field_r[3] = 1.0f;
        dia.field_r[2] = -this.field_pc * this.field_Kb;
        if (param0 <= 19) {
            return;
        }
        dia.field_r[1] = this.field_yb * -this.field_pc;
        jaggl.OpenGL.glLightfv(16385, 4609, dia.field_r, 0);
    }

    final void a(jca param0) {
    }

    final void a(float param0, float param1, float param2) {
    }

    final void d(byte param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (this.field_Wb) {
              break L1;
            } else {
              jaggl.OpenGL.glDisable(3089);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glEnable(3089);
          break L0;
        }
        var2 = 43 % ((param0 - 69) / 50);
    }

    final void h(byte param0) {
        if (param0 == -102) {
          L0: {
            L1: {
              if (!this.field_l) {
                break L1;
              } else {
                if (this.field_yc) {
                  break L1;
                } else {
                  jaggl.OpenGL.glEnable(2896);
                  if (!TombRacer.field_G) {
                    break L0;
                  } else {
                    break L1;
                  }
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
            this.a();
        }
        this.i(false);
    }

    final void f(byte param0) {
        L0: {
          if (param0 == -69) {
            break L0;
          } else {
            this.field_ed = -103;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_wc) {
              break L2;
            } else {
              jaggl.OpenGL.glDisable(2929);
              if (!TombRacer.field_G) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          jaggl.OpenGL.glEnable(2929);
          break L1;
        }
    }

    final void a(int param0, int param1) throws qva {
        this.field_Mc.swapBuffers();
    }

    final void a(int param0, iw param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
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
              L2: {
                if (io.field_c == param1) {
                  break L2;
                } else {
                  L3: {
                    if (param1 != di.field_d) {
                      break L3;
                    } else {
                      var6 = param0 + 1;
                      var5_int = 3;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param1 != fma.field_f) {
                      break L4;
                    } else {
                      var6 = 3 * param0;
                      var5_int = 4;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param1 == vs.field_T) {
                      break L5;
                    } else {
                      L6: {
                        if (nb.field_b == param1) {
                          break L6;
                        } else {
                          var5_int = 0;
                          var6 = param0;
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var6 = param0 + 2;
                      var5_int = 5;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var5_int = 6;
                  var6 = param0 - -2;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6 = param0 * 2;
              var5_int = 1;
              break L1;
            }
            L7: {
              if (param3 == 0) {
                break L7;
              } else {
                this.i(false);
                break L7;
              }
            }
            jaggl.OpenGL.glDrawArrays(var5_int, param2, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("kda.HC(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void d() {
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.J(19822);
            this.a(true, (iva) null);
            this.c(0, 1);
            this.i((byte) 126);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_od, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kda.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final synchronized void c(int param0) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_dd.d((byte) 14)) {
                break L2;
              } else {
                var5 = (al) ((Object) this.field_dd.c(61));
                incrementValue$5 = var2;
                var2++;
                csa.field_i[incrementValue$5] = (int)var5.field_d;
                this.field_X = this.field_X - var5.field_i;
                stackOut_2_0 = -1001;
                stackOut_2_1 = var2 ^ -1;
                stackIn_8_0 = stackOut_2_0;
                stackIn_8_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 == stackIn_3_1) {
                      jaggl.OpenGL.glDeleteBuffersARB(var2, csa.field_i, 0);
                      var2 = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = -1;
            stackOut_7_1 = var2 ^ -1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L1;
          }
          L4: {
            if (stackIn_8_0 <= stackIn_8_1) {
              break L4;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, csa.field_i, 0);
              var2 = 0;
              break L4;
            }
          }
          L5: while (true) {
            L6: {
              L7: {
                L8: {
                  L9: {
                    L10: {
                      L11: {
                        L12: {
                          L13: {
                            L14: {
                              L15: {
                                if (this.field_Rc.d((byte) 14)) {
                                  break L15;
                                } else {
                                  var6 = (al) ((Object) this.field_Rc.c(-96));
                                  incrementValue$6 = var2;
                                  var2++;
                                  csa.field_i[incrementValue$6] = (int)var6.field_d;
                                  this.field_Xb = this.field_Xb - var6.field_i;
                                  stackOut_12_0 = -1001;
                                  stackOut_12_1 = var2 ^ -1;
                                  stackIn_31_0 = stackOut_12_0;
                                  stackIn_31_1 = stackOut_12_1;
                                  stackIn_13_0 = stackOut_12_0;
                                  stackIn_13_1 = stackOut_12_1;
                                  if (var4 != 0) {
                                    break L14;
                                  } else {
                                    L16: {
                                      if (stackIn_13_0 != stackIn_13_1) {
                                        break L16;
                                      } else {
                                        jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
                                        var2 = 0;
                                        break L16;
                                      }
                                    }
                                    if (var4 == 0) {
                                      continue L5;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                              L17: {
                                if (var2 > 0) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (this.field_Oc.d((byte) 14)) {
                                      break L18;
                                    } else {
                                      var7 = (al) ((Object) this.field_Oc.c(62));
                                      incrementValue$7 = var2;
                                      var2++;
                                      csa.field_i[incrementValue$7] = var7.field_i;
                                      stackOut_18_0 = -1001;
                                      stackOut_18_1 = var2 ^ -1;
                                      stackIn_31_0 = stackOut_18_0;
                                      stackIn_31_1 = stackOut_18_1;
                                      stackIn_19_0 = stackOut_18_0;
                                      stackIn_19_1 = stackOut_18_1;
                                      if (var4 != 0) {
                                        break L14;
                                      } else {
                                        L19: {
                                          if (stackIn_19_0 != stackIn_19_1) {
                                            break L19;
                                          } else {
                                            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                                            var2 = 0;
                                            break L19;
                                          }
                                        }
                                        if (var4 == 0) {
                                          break L17;
                                        } else {
                                          jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
                                          var2 = 0;
                                          L20: while (true) {
                                            if (this.field_Oc.d((byte) 14)) {
                                              break L18;
                                            } else {
                                              var7 = (al) ((Object) this.field_Oc.c(62));
                                              incrementValue$8 = var2;
                                              var2++;
                                              csa.field_i[incrementValue$8] = var7.field_i;
                                              stackOut_26_0 = -1001;
                                              stackOut_26_1 = var2 ^ -1;
                                              stackIn_31_0 = stackOut_26_0;
                                              stackIn_31_1 = stackOut_26_1;
                                              stackIn_27_0 = stackOut_26_0;
                                              stackIn_27_1 = stackOut_26_1;
                                              if (var4 != 0) {
                                                break L14;
                                              } else {
                                                L21: {
                                                  if (stackIn_27_0 != stackIn_27_1) {
                                                    break L21;
                                                  } else {
                                                    jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                                                    var2 = 0;
                                                    break L21;
                                                  }
                                                }
                                                if (var4 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_30_0 = 0;
                                  stackOut_30_1 = var2;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  break L14;
                                }
                              }
                              L22: while (true) {
                                if (this.field_bd.d((byte) 14)) {
                                  break L13;
                                } else {
                                  var9 = (al) ((Object) this.field_bd.c(-101));
                                  jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                                  if (var4 != 0) {
                                    break L12;
                                  } else {
                                    if (var4 == 0) {
                                      continue L22;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                            L23: {
                              if (stackIn_31_0 < stackIn_31_1) {
                                jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                                var2 = 0;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            L24: while (true) {
                              L25: {
                                if (this.field_ad.d((byte) 14)) {
                                  break L25;
                                } else {
                                  var8 = (al) ((Object) this.field_ad.c(30));
                                  incrementValue$9 = var2;
                                  var2++;
                                  csa.field_i[incrementValue$9] = (int)var8.field_d;
                                  this.field_Fb = this.field_Fb - var8.field_i;
                                  stackOut_35_0 = 1000;
                                  stackOut_35_1 = var2;
                                  stackIn_69_0 = stackOut_35_0;
                                  stackIn_69_1 = stackOut_35_1;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  if (var4 != 0) {
                                    break L7;
                                  } else {
                                    L26: {
                                      if (stackIn_36_0 != stackIn_36_1) {
                                        break L26;
                                      } else {
                                        jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                                        var2 = 0;
                                        break L26;
                                      }
                                    }
                                    if (var4 == 0) {
                                      continue L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              if (var2 > 0) {
                                jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                                var2 = 0;
                                L27: while (true) {
                                  if (this.field_bd.d((byte) 14)) {
                                    break L13;
                                  } else {
                                    var9 = (al) ((Object) this.field_bd.c(-101));
                                    jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                                    if (var4 != 0) {
                                      break L12;
                                    } else {
                                      if (var4 == 0) {
                                        continue L27;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L28: while (true) {
                                  if (this.field_bd.d((byte) 14)) {
                                    break L13;
                                  } else {
                                    var9 = (al) ((Object) this.field_bd.c(-101));
                                    jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                                    if (var4 != 0) {
                                      break L12;
                                    } else {
                                      if (var4 == 0) {
                                        continue L28;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L29: while (true) {
                            if (this.field_nd.d((byte) 14)) {
                              break L12;
                            } else {
                              var10 = this.field_nd.c(-120);
                              jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                              if (var4 != 0) {
                                break L10;
                              } else {
                                if (var4 == 0) {
                                  continue L29;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                        }
                        break L11;
                      }
                      L30: while (true) {
                        if (this.field_kd.d((byte) 14)) {
                          break L10;
                        } else {
                          var11 = this.field_kd.c(61);
                          jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                          if (var4 != 0) {
                            break L8;
                          } else {
                            if (var4 == 0) {
                              continue L30;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    break L9;
                  }
                  L31: while (true) {
                    if (this.field_bd.d((byte) 14)) {
                      break L8;
                    } else {
                      var12 = (al) ((Object) this.field_bd.c(-99));
                      jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
                      if (var4 != 0) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          continue L31;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                stackOut_68_0 = this.Q(10);
                stackOut_68_1 = 100663296;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                break L7;
              }
              L32: {
                if (stackIn_69_0 <= stackIn_69_1) {
                  break L32;
                } else {
                  if (bva.b((byte) -107) <= this.field_Xc + 60000L) {
                    break L32;
                  } else {
                    System.gc();
                    this.field_Xc = bva.b((byte) -107);
                    break L32;
                  }
                }
              }
              super.c(param0);
              break L6;
            }
            return;
          }
        }
    }

    final void q(byte param0) {
        if (param0 != -78) {
            this.field_Vc = true;
        }
    }

    final void ya() {
        this.b(true, (byte) 81);
        jaggl.OpenGL.glClear(256);
    }

    final void h(boolean param0) {
        this.field_Zc = param0 ? true : false;
        this.i(param0);
    }

    public static void T(int param0) {
        if (param0 != 32885) {
            return;
        }
        field_cd = null;
        field_gd = null;
    }

    final void u(byte param0) {
        if (param0 != -23) {
            this.f(47);
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, oj.a((byte) 101, this.field_db[this.field_Cc]));
    }

    final mw b(int param0, int param1) {
        return null;
    }

    final void N(int param0) {
        if (param0 >= -10) {
            this.b(20, (byte) 35);
        }
        dia.field_r[3] = (float)(this.field_bc >>> -888217896) / 255.0f;
        dia.field_r[2] = (float)sea.c(this.field_bc, 255) / 255.0f;
        dia.field_r[1] = (float)sea.c(65280, this.field_bc) / 65280.0f;
        dia.field_r[0] = (float)sea.c(16711680, this.field_bc) / 16711680.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, dia.field_r, 0);
    }

    final float c(byte param0) {
        if (param0 >= -39) {
            this.field_Oc = (vna) null;
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("kda.FD(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final gf a(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7) {
        RuntimeException var9 = null;
        hm var10 = null;
        gf stackIn_2_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_10_0 = null;
        hm stackOut_8_0 = null;
        hm stackOut_12_0 = null;
        gf stackOut_1_0 = null;
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
                if (this.field_Wc) {
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
                  if (this.field_sd) {
                    stackOut_10_0 = new pe((kda) (this), param0, param4, param7, param6, param5, param1);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var10 = new hm((kda) (this), param0, una.field_h, lla.a(false, param4), lla.a(false, param7));
                    var10.a(0, param6, 0, param4, param7, param5, param1, param0, true);
                    stackOut_8_0 = (hm) (var10);
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackOut_12_0 = new hm((kda) (this), param0, param4, param7, param3, param6, param5, param1);
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_1_0 = (gf) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var9);
            stackOut_14_1 = new StringBuilder().append("kda.UC(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param6 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gf) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (gf) ((Object) stackIn_11_0);
            } else {
              return (gf) ((Object) stackIn_13_0);
            }
          }
        }
    }

    final void a(mna param0, int param1) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException var3 = null;
        ne[] var3_array = null;
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
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_46_0 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_67_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_30_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        Object stackOut_39_0 = null;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        Object stackOut_66_0 = null;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = ((dqa) ((Object) param0)).field_f;
              var3_array = var18;
              var4 = 0;
              var5 = 0;
              if (param1 == -32) {
                break L1;
              } else {
                this.field_id = (og[]) null;
                break L1;
              }
            }
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var18.length ^ -1) >= (var8 ^ -1)) {
                    break L4;
                  } else {
                    var9 = var18[var8];
                    var10 = this.field_id[var8];
                    var11 = 0;
                    var12 = var10.a((byte) -111);
                    var13 = var10.b(true);
                    var10.c(-3);
                    stackOut_5_0 = 0;
                    stackIn_31_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var17 != 0) {
                      break L3;
                    } else {
                      var15 = stackIn_6_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var9.b((byte) -77) <= var15) {
                              break L7;
                            } else {
                              var16 = var9.b(0, var15);
                              if (var17 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  L9: {
                                    if (var16 == gj.field_p) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (gj.field_e == var16) {
                                          break L10;
                                        } else {
                                          L11: {
                                            if (var16 != gj.field_b) {
                                              break L11;
                                            } else {
                                              var5 = 1;
                                              jaggl.OpenGL.glColorPointer(4, 5121, var12, (long)var11 + var13);
                                              if (var17 == 0) {
                                                break L8;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (var16 != gj.field_m) {
                                              break L12;
                                            } else {
                                              incrementValue$4 = var4;
                                              var4++;
                                              jaggl.OpenGL.glClientActiveTexture(incrementValue$4 + 33984);
                                              jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, (long)var11 + var13);
                                              if (var17 == 0) {
                                                break L8;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (var16 == gj.field_n) {
                                              break L13;
                                            } else {
                                              L14: {
                                                if (gj.field_k == var16) {
                                                  break L14;
                                                } else {
                                                  if (gj.field_j != var16) {
                                                    break L8;
                                                  } else {
                                                    incrementValue$5 = var4;
                                                    var4++;
                                                    jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$5);
                                                    jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 + (long)var11);
                                                    if (var17 == 0) {
                                                      break L8;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                              }
                                              incrementValue$6 = var4;
                                              var4++;
                                              jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$6);
                                              jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 - -(long)var11);
                                              if (var17 == 0) {
                                                break L8;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          incrementValue$7 = var4;
                                          var4++;
                                          jaggl.OpenGL.glClientActiveTexture(incrementValue$7 + 33984);
                                          jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                                          if (var17 == 0) {
                                            break L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                                      var6 = 1;
                                      if (var17 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  jaggl.OpenGL.glVertexPointer(3, 5126, var12, var13 + (long)var11);
                                  var7 = 1;
                                  break L8;
                                }
                                var11 = var11 + var16.field_l;
                                var15++;
                                if (var17 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var8++;
                          break L6;
                        }
                        if (var17 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_30_0 = this.field_Vc;
                stackIn_31_0 = stackOut_30_0 ? 1 : 0;
                break L3;
              }
              L15: {
                stackOut_31_0 = stackIn_31_0;
                stackIn_33_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (var7 != 0) {
                  stackOut_33_0 = stackIn_33_0;
                  stackOut_33_1 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L15;
                } else {
                  stackOut_32_0 = stackIn_32_0;
                  stackOut_32_1 = 1;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  break L15;
                }
              }
              L16: {
                if (stackIn_34_0 != stackIn_34_1) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      if (var7 == 0) {
                        break L18;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32884);
                        if (var17 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    jaggl.OpenGL.glDisableClientState(32884);
                    break L17;
                  }
                  L19: {
                    stackOut_39_0 = this;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_40_0 = stackOut_39_0;
                    if (var7 == 0) {
                      stackOut_41_0 = this;
                      stackOut_41_1 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      break L19;
                    } else {
                      stackOut_40_0 = this;
                      stackOut_40_1 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_42_1 = stackOut_40_1;
                      break L19;
                    }
                  }
                  ((kda) (this)).field_Vc = stackIn_42_1 != 0;
                  break L16;
                }
              }
              L20: {
                if (var6 != 0) {
                  stackOut_45_0 = 0;
                  stackIn_46_0 = stackOut_45_0;
                  break L20;
                } else {
                  stackOut_44_0 = 1;
                  stackIn_46_0 = stackOut_44_0;
                  break L20;
                }
              }
              L21: {
                if (stackIn_46_0 != (this.field_Yc ? 1 : 0)) {
                  break L21;
                } else {
                  L22: {
                    L23: {
                      if (var6 != 0) {
                        break L23;
                      } else {
                        jaggl.OpenGL.glDisableClientState(32885);
                        if (var17 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    jaggl.OpenGL.glEnableClientState(32885);
                    break L22;
                  }
                  L24: {
                    stackOut_51_0 = this;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (var6 == 0) {
                      stackOut_53_0 = this;
                      stackOut_53_1 = 0;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      break L24;
                    } else {
                      stackOut_52_0 = this;
                      stackOut_52_1 = 1;
                      stackIn_54_0 = stackOut_52_0;
                      stackIn_54_1 = stackOut_52_1;
                      break L24;
                    }
                  }
                  ((kda) (this)).field_Yc = stackIn_54_1 != 0;
                  break L21;
                }
              }
              L25: {
                if (this.field_ld) {
                  stackOut_57_0 = 0;
                  stackIn_58_0 = stackOut_57_0;
                  break L25;
                } else {
                  stackOut_56_0 = 1;
                  stackIn_58_0 = stackOut_56_0;
                  break L25;
                }
              }
              L26: {
                stackOut_58_0 = stackIn_58_0;
                stackIn_60_0 = stackOut_58_0;
                stackIn_59_0 = stackOut_58_0;
                if (var5 != 0) {
                  stackOut_60_0 = stackIn_60_0;
                  stackOut_60_1 = 0;
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  break L26;
                } else {
                  stackOut_59_0 = stackIn_59_0;
                  stackOut_59_1 = 1;
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_61_1 = stackOut_59_1;
                  break L26;
                }
              }
              L27: {
                if (stackIn_61_0 == stackIn_61_1) {
                  break L27;
                } else {
                  L28: {
                    L29: {
                      if (var5 == 0) {
                        break L29;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32886);
                        if (var17 == 0) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    jaggl.OpenGL.glDisableClientState(32886);
                    break L28;
                  }
                  L30: {
                    stackOut_66_0 = this;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_67_0 = stackOut_66_0;
                    if (var5 == 0) {
                      stackOut_68_0 = this;
                      stackOut_68_1 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      break L30;
                    } else {
                      stackOut_67_0 = this;
                      stackOut_67_1 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      stackIn_69_1 = stackOut_67_1;
                      break L30;
                    }
                  }
                  ((kda) (this)).field_ld = stackIn_69_1 != 0;
                  break L27;
                }
              }
              L31: {
                L32: {
                  if (this.field_ed < var4) {
                    break L32;
                  } else {
                    if (var4 >= this.field_ed) {
                      break L31;
                    } else {
                      var8 = var4;
                      L33: while (true) {
                        L34: {
                          L35: {
                            if (var8 >= this.field_ed) {
                              break L35;
                            } else {
                              jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                              jaggl.OpenGL.glDisableClientState(32888);
                              var8++;
                              if (var17 != 0) {
                                break L34;
                              } else {
                                if (var17 == 0) {
                                  continue L33;
                                } else {
                                  break L35;
                                }
                              }
                            }
                          }
                          this.field_ed = var4;
                          break L34;
                        }
                        if (var17 == 0) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                  }
                }
                var8 = this.field_ed;
                L36: while (true) {
                  L37: {
                    if ((var4 ^ -1) >= (var8 ^ -1)) {
                      break L37;
                    } else {
                      jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                      jaggl.OpenGL.glEnableClientState(32888);
                      var8++;
                      if (var17 != 0) {
                        break L31;
                      } else {
                        if (var17 == 0) {
                          continue L36;
                        } else {
                          break L37;
                        }
                      }
                    }
                  }
                  this.field_ed = var4;
                  break L31;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var3 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) (var3);
            stackOut_86_1 = new StringBuilder().append("kda.OC(");
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L38;
            } else {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L38;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param1 + ')');
        }
    }

    final void b(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            this.field_Vc = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_lb != dfa.field_b) {
              break L2;
            } else {
              jaggl.OpenGL.glBlendFunc(770, 771);
              if (var3 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (this.field_lb == mp.field_a) {
              break L3;
            } else {
              if (bma.field_w == this.field_lb) {
                jaggl.OpenGL.glBlendFunc(774, 1);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glBlendFunc(1, 1);
          break L1;
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = -91 / ((-67 - param1) / 47);
        return 0 != (32 & param0) ? true : false;
    }

    final void e(boolean param0) {
        jaggl.OpenGL.glActiveTexture(this.field_Cc + 33984);
        if (param0) {
            this.field_Mc = (jaggl.OpenGL) null;
        }
    }

    final synchronized void b(int param0, byte param1) {
        vg var3 = new vg();
        var3.field_d = (long)param0;
        if (param1 != 18) {
            return;
        }
        this.field_nd.b((byte) -124, var3);
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
            var3_long = this.field_Mc.prepareSurface(param1);
            if (var3_long == -1L) {
              throw new RuntimeException();
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  this.v(42);
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
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("kda.DE(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(dn param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              L2: {
                if (param0 != kga.field_o) {
                  break L2;
                } else {
                  jaggl.OpenGL.glDisable(3168);
                  jaggl.OpenGL.glDisable(3169);
                  jaggl.OpenGL.glDisable(3170);
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = dk.a(param0, 0);
              jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
              jaggl.OpenGL.glEnable(3168);
              jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
              jaggl.OpenGL.glEnable(3169);
              jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
              jaggl.OpenGL.glEnable(3170);
              break L1;
            }
            L3: {
              if (param1 == 0) {
                break L3;
              } else {
                this.v(82);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("kda.EC(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
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
            stackOut_2_0 = new jd((kda) (this), param1, param4, param3, param5, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("kda.TD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return (lv) ((Object) stackIn_3_0);
    }

    final vw e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        dn var5 = null;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param1 >= 37) {
            break L0;
          } else {
            var5 = (dn) null;
            this.a((dn) null, (byte) 83);
            break L0;
          }
        }
        L1: {
          var3 = param0;
          if (var3 == 3) {
            break L1;
          } else {
            L2: {
              if (-5 != (var3 ^ -1)) {
                break L2;
              } else {
                if (var4 == 0) {
                  return (vw) ((Object) new pja((kda) (this), this.field_I, this.field_Mb));
                } else {
                  break L2;
                }
              }
            }
            if (-9 != (var3 ^ -1)) {
              return super.e(param0, 115);
            } else {
              if (var4 == 0) {
                return (vw) ((Object) new dp((kda) (this), this.field_I, this.field_Mb));
              } else {
                break L1;
              }
            }
          }
        }
        return (vw) ((Object) new bta((kda) (this), this.field_I));
    }

    final void w(byte param0) {
        L0: {
          L1: {
            if (this.field_Zb) {
              break L1;
            } else {
              jaggl.OpenGL.glDisable(16384);
              jaggl.OpenGL.glDisable(16385);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glEnable(16384);
          jaggl.OpenGL.glEnable(16385);
          break L0;
        }
        L2: {
          if (param0 == -21) {
            break L2;
          } else {
            this.field_id = (og[]) null;
            break L2;
          }
        }
    }

    final void w(int param0) {
        if (param0 <= -30) {
          L0: {
            L1: {
              if (this.field_m) {
                break L1;
              } else {
                jaggl.OpenGL.glDisable(3008);
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            jaggl.OpenGL.glEnable(3008);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    kda(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, cn param4, int param5) {
        super(param1, new Long(param2), param3, param4, param5, 1);
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
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
        int var18 = 0;
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
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
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
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var21_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = TombRacer.field_G ? 1 : 0;
                    var28 = null;
                    var29 = null;
                    var30 = null;
                    this.field_bd = new vna();
                    this.field_dd = new vna();
                    this.field_Rc = new vna();
                    this.field_Oc = new vna();
                    this.field_ad = new vna();
                    this.field_nd = new vna();
                    this.field_kd = new vna();
                    this.field_id = new og[16];
                    this.field_Qc = new jaggl.MapBuffer();
                    this.field_Tc = new jaggl.MapBuffer();
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_Mc = param0;
                        discarded$3 = this.field_Mc.a();
                        this.field_Nc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                        this.field_jd = jaggl.OpenGL.glGetString(7937).toLowerCase();
                        if ((this.field_Nc.indexOf("microsoft") ^ -1) != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 != this.field_Nc.indexOf("brian paul")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0 == (this.field_Nc.indexOf("mesa") ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        var9 = rga.a(32287, var20.replace('.', ' '), ' ');
                        if (2 <= var9.length) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10_int = jb.a((CharSequence) ((Object) var9[0]), (byte) 70);
                        var11_int = jb.a((CharSequence) ((Object) var9[1]), (byte) 70);
                        this.field_md = var10_int * 10 + var11_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof NumberFormatException ? 9 : 60);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = (NumberFormatException) ((Object) caughtException);
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((this.field_md ^ -1) <= -13) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_Mc.a("GL_ARB_multitexture")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (this.field_Mc.a("GL_ARB_texture_env_combine")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var26 = new int[1];
                        jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                        this.field_Vb = var26[0];
                        if (-3 >= (this.field_Vb ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_e = 8;
                        this.field_fd = this.field_Mc.a("GL_ARB_vertex_buffer_object");
                        discarded$4 = this.field_Mc.a("GL_ARB_multisample");
                        this.field_sd = this.field_Mc.a("GL_ARB_texture_rectangle");
                        this.field_Ob = this.field_Mc.a("GL_ARB_texture_cube_map");
                        this.field_Wc = this.field_Mc.a("GL_ARB_texture_non_power_of_two");
                        this.field_x = this.field_Mc.a("GL_EXT_texture3D");
                        this.field_Uc = this.field_Mc.a("GL_ARB_vertex_shader");
                        this.field_qd = this.field_Mc.a("GL_ARB_vertex_program");
                        this.field_Pc = this.field_Mc.a("GL_ARB_fragment_shader");
                        discarded$5 = this.field_Mc.a("GL_ARB_fragment_program");
                        this.field_Sc = new int[this.field_Vb];
                        stackOut_18_0 = this;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (!jaclib.memory.Stream.b()) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = this;
                        stackOut_19_1 = 33639;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = this;
                        stackOut_20_1 = 5121;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((kda) (this)).field_od = stackIn_21_1;
                        if (this.field_jd.indexOf("radeon") == -1) {
                            statePc = 54;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11_int = 0;
                        var12 = 0;
                        var13 = 0;
                        var14_array = rga.a(32287, this.field_jd.replace('/', ' '), ' ');
                        var15 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var14_array.length ^ -1) >= (var15 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var21_ref = var14_array[var15];
                        var16_ref = var21_ref;
                        var16_ref = var21_ref;
                        var16_ref = var21_ref;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = 0;
                        stackOut_25_1 = var21_ref.length();
                        stackIn_55_0 = stackOut_25_0;
                        stackIn_55_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (var18 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = ((Object) stateCaught_25 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 >= stackIn_26_1) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = ((Object) stateCaught_27 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var18 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (120 != var21_ref.charAt(0)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = ((Object) stateCaught_29 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (3 > var21_ref.length()) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var31 = (CharSequence) ((Object) var21_ref.substring(1, 3));
                        if (!sqa.a(var31, -3)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var13 = 1;
                        var16_ref = var21_ref.substring(1);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!var16_ref.equals("hd")) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var12 = 1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = ((Object) stateCaught_34 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var18 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!var16_ref.startsWith("hd")) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = ((Object) stateCaught_36 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var12 = 1;
                        var16_ref = var16_ref.substring(2);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = ((Object) stateCaught_37 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var16_ref.length() < 4) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = ((Object) stateCaught_38 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var32 = (CharSequence) ((Object) var16_ref.substring(0, 4));
                        if (!sqa.a(var32, -3)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var33 = (CharSequence) ((Object) var16_ref.substring(0, 4));
                        var11_int = jb.a(var33, (byte) 70);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof Exception ? 43 : 60);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var18 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var17 = (Exception) ((Object) caughtException);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var15++;
                        if (var18 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var13 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var12 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var11_int < 7000) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (9250 < var11_int) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_x = false;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var11_int ^ -1) > -7001) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((var11_int ^ -1) < -8000) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_fd = false;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.field_sd = this.field_sd & this.field_Mc.a("GL_ARB_half_float_pixel");
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = 0;
                        stackOut_54_1 = this.field_Nc.indexOf("intel") ^ -1;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 != stackIn_55_1) {
                            statePc = 56;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!this.field_fd) {
                            statePc = 74;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var27 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var11 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8 = caughtException;
                        var8.printStackTrace();
                        this.a(true);
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackOut_61_0 = (RuntimeException) (var8_ref);
                    stackOut_61_1 = new StringBuilder().append("kda.<init>(");
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_63_1 = stackOut_61_1;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    if (param0 == null) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackOut_62_2 = "{...}";
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    stackIn_64_2 = stackOut_62_2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackOut_63_2 = "null";
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    stackIn_64_2 = stackOut_63_2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
                    stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_66_1 = stackOut_64_1;
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    if (param1 == null) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackOut_65_2 = "{...}";
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_67_2 = stackOut_65_2;
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackOut_66_2 = "null";
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    stackIn_67_2 = stackOut_66_2;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param2).append(',');
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_69_1 = stackOut_67_1;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    if (param3 == null) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackOut_68_2 = "{...}";
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    stackIn_70_2 = stackOut_68_2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackOut_69_2 = "null";
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    stackIn_70_2 = stackOut_69_2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    if (param4 == null) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackOut_71_2 = "{...}";
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_73_1 = stackOut_71_1;
                    stackIn_73_2 = stackOut_71_2;
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackOut_72_2 = "null";
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    stackIn_73_2 = stackOut_72_2;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    throw tba.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param5 + ')');
                }
                case 74: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void S(int param0) {
        jaggl.OpenGL.glScissor(this.field_A + this.field_i, -this.field_jb + this.field_Kc + this.field_jc, this.field_C - this.field_A, -this.field_K + this.field_jb);
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
        this.field_dd.b((byte) -80, var4);
    }

    final void a(int param0, byte param1) {
        if (param1 < 27) {
            this.a(-22, 75, 26, 3);
        }
    }

    final void a(nh param0, boolean param1) {
    }

    private final void i(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (!this.field_rd) {
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
            this.field_ld = true;
            break L1;
          }
        }
        L2: {
          L3: {
            L4: {
              if (this.field_r.a(-43)) {
                break L4;
              } else {
                L5: {
                  if (this.field_gb) {
                    break L5;
                  } else {
                    jaggl.OpenGL.glLoadMatrixf(this.field_q.a(jba.field_k, (byte) -37), 0);
                    this.field_rd = false;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                jaggl.OpenGL.glLoadIdentity();
                this.field_rd = false;
                if (var3 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (this.field_Zc) {
                break L6;
              } else {
                jaggl.OpenGL.glLoadMatrixf(this.field_Qb.a(jba.field_k, (byte) -37), 0);
                this.field_Zc = true;
                this.i(70);
                this.g((byte) 92);
                break L6;
              }
            }
            L7: {
              if (this.field_gb) {
                break L7;
              } else {
                jaggl.OpenGL.glPushMatrix();
                jaggl.OpenGL.glMultMatrixf(this.field_q.a(jba.field_k, (byte) -37), 0);
                this.field_rd = true;
                if (var3 == 0) {
                  break L3;
                } else {
                  break L7;
                }
              }
            }
            this.field_rd = false;
            break L2;
          }
          break L2;
        }
    }

    final void D(int param0) {
        L0: {
          L1: {
            L2: {
              if (!this.field_U) {
                break L2;
              } else {
                if (!this.field_Bb) {
                  break L2;
                } else {
                  if (0 <= this.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            jaggl.OpenGL.glDisable(2912);
            if (!TombRacer.field_G) {
              break L0;
            } else {
              break L1;
            }
          }
          jaggl.OpenGL.glEnable(2912);
          break L0;
        }
        L3: {
          if (param0 == 2) {
            break L3;
          } else {
            this.field_Zc = true;
            break L3;
          }
        }
    }

    final void a(fp param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException runtimeException = null;
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
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
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
                this.field_Tc = (jaggl.MapBuffer) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param3) {
                  break L3;
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
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
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
                  break L5;
                } else {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = 768;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L5;
                }
              }
              jaggl.OpenGL.glTexEnvi(stackIn_10_0, stackIn_10_1, stackIn_10_2);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("kda.TC(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        L0: {
          L1: {
            if (param1) {
              break L1;
            } else {
              jaggl.OpenGL.glDisable(32925);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glEnable(32925);
          break L0;
        }
        L2: {
          if (param0 == 1) {
            break L2;
          } else {
            field_cd = (String) null;
            break L2;
          }
        }
    }

    final void a(fp param0, int param1, boolean param2, int param3) {
        try {
            if (param1 != 15802) {
                this.N(120);
            }
            jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, bma.a(param0, true));
            jaggl.OpenGL.glTexEnvi(8960, 34200 - -param3, !param2 ? 770 : 771);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "kda.AC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void i(int param0) {
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_Gb, 0);
        int var2 = 73 / ((-11 - param0) / 56);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_M, 0);
    }

    final void c() {
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param2 != 2) {
            return;
        }
        al var4 = new al(param1);
        var4.field_d = (long)param0;
        this.field_Rc.b((byte) -67, var4);
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
              var4 = (Long) (param0);
              this.field_Mc.releaseSurface(param2, var4.longValue());
              if (!param1) {
                break L1;
              } else {
                this.I(-84);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4_ref);
            stackOut_3_1 = new StringBuilder().append("kda.SB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void e(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_T, 0);
        jaggl.OpenGL.glMatrixMode(5888);
        if (param0 < 26) {
            this.d();
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    static {
        field_pd = false;
        field_cd = "Invite only";
        field_hd = 48;
        field_gd = "Go Back";
    }
}
