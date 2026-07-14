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
        ((kda) this).field_id[param1] = (og) (Object) param2;
        if (param0 >= -124) {
            ((kda) this).field_Xc = 121L;
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
        int var8 = 0;
        int var9 = 0;
        una var10 = null;
        sf var11 = null;
        int var12 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (io.field_c == param4) {
            var9 = param6 * 2;
            var8 = 1;
            break L0;
          } else {
            if (di.field_d == param4) {
              var8 = 3;
              var9 = 1 + param6;
              break L0;
            } else {
              if (fma.field_f != param4) {
                if (param4 != vs.field_T) {
                  if (param4 == nb.field_b) {
                    var9 = param6 + 2;
                    var8 = 5;
                    break L0;
                  } else {
                    var9 = param6;
                    var8 = 0;
                    break L0;
                  }
                } else {
                  var8 = 6;
                  var9 = param6 - -2;
                  break L0;
                }
              } else {
                var9 = 3 * param6;
                var8 = 4;
                break L0;
              }
            }
          }
        }
        L1: {
          var10 = param0.b(param1 ^ 13611);
          var11 = (sf) (Object) param0;
          var11.c(-3);
          jaggl.OpenGL.glDrawElements(var8, var9, lr.a(var10, 5126), var11.b(true) - -(long)(param3 * var10.field_e));
          if (param1 == -19394) {
            break L1;
          } else {
            ((kda) this).N(76);
            break L1;
          }
        }
    }

    final gf a(int[] param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        hm var9 = null;
        int var8 = 82 / ((param6 - 13) / 46);
        if (!((kda) this).field_Wc) {
            if (cla.a(9181, param3)) {
                // ifne L117
            }
            if (!((kda) this).field_sd) {
                var9 = new hm((kda) this, gpa.field_a, una.field_g, lla.a(false, param3), lla.a(false, param5));
                var9.a(param1, param5, param4, 113, 0, param0, param3, 0);
                return (gf) (Object) var9;
            }
            return (gf) (Object) new pe((kda) this, param3, param5, param0, param1, param4);
        }
        return (gf) (Object) new hm((kda) this, param3, param5, param2, param0, param1, param4);
    }

    final qm c(int param0, boolean param1) {
        if (param0 != 6) {
            ((kda) this).field_dd = null;
        }
        return (qm) (Object) new og((kda) this, param1);
    }

    final mna a(ne[] param0, int param1) {
        if (param1 != 0) {
            ((kda) this).a(-57, 53, 67);
        }
        return (mna) (Object) new dqa(param0);
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
        if (param0 < 7) {
            field_hd = 36;
        }
        return (na) (Object) new dma((kda) this, param3, param2, param1);
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
            dia.field_r[1] = var6 * (float)sea.c(255, var4 >> -805411576);
            dia.field_r[2] = var6 * (float)sea.c(var4, 255);
            dia.field_r[0] = (float)sea.c(255, var4 >> -572539088) * var6;
            jaggl.OpenGL.glLightfv(var5, 4609, dia.field_r, 0);
            jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.a((byte) -23) * var3.a((byte) -84)));
            jaggl.OpenGL.glEnable(var5);
            var2++;
            continue L0;
          }
        }
    }

    final jca a(nha param0, mw param1) {
        return null;
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
        if (param3 != -63) {
            ((kda) this).field_Uc = false;
        }
        if (!((kda) this).field_Wc) {
            if (cla.a(9181, param0)) {
                // ifne L88
            }
            if (((kda) this).field_sd) {
                return (gf) (Object) new pe((kda) this, param2, param4, param0, param1);
            }
            return (gf) (Object) new hm((kda) this, param2, param4, lla.a(false, param0), lla.a(false, param1));
        }
        return (gf) (Object) new hm((kda) this, param2, param4, param0, param1);
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
        if (param0) {
            ((kda) this).i(102);
        }
        return true;
    }

    final gf a(boolean param0, byte[] param1, int param2, int param3, int param4, int param5, ft param6, int param7) {
        hm var10 = null;
        L0: {
          if (param4 == 1) {
            break L0;
          } else {
            ((kda) this).field_id = null;
            break L0;
          }
        }
        L1: {
          if (((kda) this).field_Wc) {
            break L1;
          } else {
            L2: {
              if (!cla.a(9181, param7)) {
                break L2;
              } else {
                if (!cla.a(9181, param3)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (!((kda) this).field_sd) {
              var10 = new hm((kda) this, param6, una.field_g, lla.a(false, param7), lla.a(false, param3));
              var10.a(0, (byte) -124, param3, param1, param5, param2, param6, param7, 0);
              return (gf) (Object) var10;
            } else {
              return (gf) (Object) new pe((kda) this, param6, param7, param3, param1, param2, param5);
            }
          }
        }
        return (gf) (Object) new hm((kda) this, param6, param7, param3, param0, param1, param2, param5);
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
        if (param0 != -102) {
            return;
        }
        if (((kda) this).field_l) {
            // ifne L30
            jaggl.OpenGL.glEnable(2896);
        } else {
            jaggl.OpenGL.glDisable(2896);
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (io.field_c == param1) {
            var6 = param0 * 2;
            var5 = 1;
            break L0;
          } else {
            if (param1 != di.field_d) {
              if (param1 != fma.field_f) {
                if (param1 == vs.field_T) {
                  var5 = 6;
                  var6 = param0 - -2;
                  break L0;
                } else {
                  if (nb.field_b == param1) {
                    var6 = param0 + 2;
                    var5 = 5;
                    break L0;
                  } else {
                    var5 = 0;
                    var6 = param0;
                    break L0;
                  }
                }
              } else {
                var6 = 3 * param0;
                var5 = 4;
                break L0;
              }
            } else {
              var6 = param0 + 1;
              var5 = 3;
              break L0;
            }
          }
        }
        L1: {
          if (param3 == 0) {
            break L1;
          } else {
            this.i(false);
            break L1;
          }
        }
        jaggl.OpenGL.glDrawArrays(var5, param2, var6);
    }

    final void d() {
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        ((kda) this).J(19822);
        ((kda) this).a(true, (iva) null);
        ((kda) this).c(0, 1);
        ((kda) this).i((byte) 126);
        jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
        jaggl.OpenGL.glRasterPos2i(param0, param1);
        jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((kda) this).field_od, param4, param5);
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        int var4 = 0;
        al var5 = null;
        al var6 = null;
        al var7 = null;
        al var8 = null;
        al var9 = null;
        al var9_ref = null;
        vg var10 = null;
        vg var11 = null;
        al var12 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((kda) this).field_dd.d((byte) 14)) {
            L1: {
              if (-1 < var2) {
                jaggl.OpenGL.glDeleteBuffersARB(var2, csa.field_i, 0);
                var2 = 0;
                L2: while (true) {
                  if (((kda) this).field_Rc.d((byte) 14)) {
                    break L1;
                  } else {
                    var6 = (al) (Object) ((kda) this).field_Rc.c(-96);
                    var2++;
                    csa.field_i[var2] = (int)var6.field_d;
                    ((kda) this).field_Xb = ((kda) this).field_Xb - var6.field_i;
                    if (-1001 != (var2 ^ -1)) {
                      continue L2;
                    } else {
                      jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
                      var2 = 0;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: while (true) {
                  if (((kda) this).field_Rc.d((byte) 14)) {
                    break L1;
                  } else {
                    var6 = (al) (Object) ((kda) this).field_Rc.c(-96);
                    var2++;
                    csa.field_i[var2] = (int)var6.field_d;
                    ((kda) this).field_Xb = ((kda) this).field_Xb - var6.field_i;
                    if (-1001 != (var2 ^ -1)) {
                      continue L3;
                    } else {
                      jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
                      var2 = 0;
                      continue L3;
                    }
                  }
                }
              }
            }
            L4: {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      if (var2 > 0) {
                        jaggl.OpenGL.glDeleteTextures(var2, csa.field_i, 0);
                        var2 = 0;
                        L9: while (true) {
                          if (((kda) this).field_Oc.d((byte) 14)) {
                            break L8;
                          } else {
                            var7 = (al) (Object) ((kda) this).field_Oc.c(62);
                            var2++;
                            csa.field_i[var2] = var7.field_i;
                            if (-1001 != (var2 ^ -1)) {
                              continue L9;
                            } else {
                              jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                              var2 = 0;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        if (((kda) this).field_Oc.d((byte) 14)) {
                          break L8;
                        } else {
                          var7 = (al) (Object) ((kda) this).field_Oc.c(62);
                          var2++;
                          csa.field_i[var2] = var7.field_i;
                          if (-1001 == (var2 ^ -1)) {
                            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                            var2 = 0;
                            break L6;
                          } else {
                            L10: while (true) {
                              if (((kda) this).field_bd.d((byte) 14)) {
                                break L7;
                              } else {
                                var9 = (al) (Object) ((kda) this).field_bd.c(-101);
                                jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                                continue L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    L11: {
                      if (0 < var2) {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, csa.field_i, 0);
                        var2 = 0;
                        L12: while (true) {
                          if (((kda) this).field_ad.d((byte) 14)) {
                            break L11;
                          } else {
                            var8 = (al) (Object) ((kda) this).field_ad.c(30);
                            var2++;
                            csa.field_i[var2] = (int)var8.field_d;
                            ((kda) this).field_Fb = ((kda) this).field_Fb - var8.field_i;
                            if (1000 != var2) {
                              continue L12;
                            } else {
                              jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                              var2 = 0;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        if (((kda) this).field_ad.d((byte) 14)) {
                          break L11;
                        } else {
                          var8 = (al) (Object) ((kda) this).field_ad.c(30);
                          var2++;
                          csa.field_i[var2] = (int)var8.field_d;
                          ((kda) this).field_Fb = ((kda) this).field_Fb - var8.field_i;
                          if (1000 == var2) {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                            var2 = 0;
                            break L6;
                          } else {
                            L13: while (true) {
                              if (((kda) this).field_bd.d((byte) 14)) {
                                break L7;
                              } else {
                                var9 = (al) (Object) ((kda) this).field_bd.c(-101);
                                jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var2 > 0) {
                      jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, csa.field_i, 0);
                      var2 = 0;
                      L14: while (true) {
                        if (!((kda) this).field_bd.d((byte) 14)) {
                          var9_ref = (al) (Object) ((kda) this).field_bd.c(-101);
                          jaggl.OpenGL.glDeleteLists((int)var9_ref.field_d, var9_ref.field_i);
                          continue L14;
                        } else {
                          L15: while (true) {
                            if (!((kda) this).field_nd.d((byte) 14)) {
                              var10 = ((kda) this).field_nd.c(-120);
                              jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                              continue L15;
                            } else {
                              L16: while (true) {
                                if (((kda) this).field_kd.d((byte) 14)) {
                                  break L5;
                                } else {
                                  var11 = ((kda) this).field_kd.c(61);
                                  jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                                  continue L16;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  L17: while (true) {
                    if (!((kda) this).field_nd.d((byte) 14)) {
                      var10 = ((kda) this).field_nd.c(-120);
                      jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                      continue L17;
                    } else {
                      L18: while (true) {
                        if (!((kda) this).field_kd.d((byte) 14)) {
                          var11 = ((kda) this).field_kd.c(61);
                          jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                          continue L18;
                        } else {
                          L19: while (true) {
                            if (!((kda) this).field_bd.d((byte) 14)) {
                              var12 = (al) (Object) ((kda) this).field_bd.c(-99);
                              jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
                              continue L19;
                            } else {
                              if (((kda) this).Q(10) <= 100663296) {
                                break L4;
                              } else {
                                if (bva.b((byte) -107) <= ((kda) this).field_Xc + 60000L) {
                                  break L4;
                                } else {
                                  System.gc();
                                  ((kda) this).field_Xc = bva.b((byte) -107);
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L20: while (true) {
                  if (!((kda) this).field_bd.d((byte) 14)) {
                    var9 = (al) (Object) ((kda) this).field_bd.c(-101);
                    jaggl.OpenGL.glDeleteLists((int)var9.field_d, var9.field_i);
                    continue L20;
                  } else {
                    L21: while (true) {
                      if (!((kda) this).field_nd.d((byte) 14)) {
                        var10 = ((kda) this).field_nd.c(-120);
                        jaggl.OpenGL.glDeleteProgramARB((int)var10.field_d);
                        continue L21;
                      } else {
                        L22: while (true) {
                          if (((kda) this).field_kd.d((byte) 14)) {
                            break L5;
                          } else {
                            var11 = ((kda) this).field_kd.c(61);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_d);
                            continue L22;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L23: while (true) {
                if (!((kda) this).field_bd.d((byte) 14)) {
                  var12 = (al) (Object) ((kda) this).field_bd.c(-99);
                  jaggl.OpenGL.glDeleteLists((int)var12.field_d, var12.field_i);
                  continue L23;
                } else {
                  if (((kda) this).Q(10) <= 100663296) {
                    break L4;
                  } else {
                    if (bva.b((byte) -107) <= ((kda) this).field_Xc + 60000L) {
                      break L4;
                    } else {
                      System.gc();
                      ((kda) this).field_Xc = bva.b((byte) -107);
                      break L4;
                    }
                  }
                }
              }
            }
            super.c(param0);
            return;
          } else {
            var5 = (al) (Object) ((kda) this).field_dd.c(61);
            var2++;
            csa.field_i[var2] = (int)var5.field_d;
            ((kda) this).field_X = ((kda) this).field_X - var5.field_i;
            if (-1001 == var2) {
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
        if (param0 != 32885) {
            return;
        }
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
        dia.field_r[3] = (float)(((kda) this).field_bc >>> -888217896) / 255.0f;
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
        if (param1 != -1) {
            return false;
        }
        return true;
    }

    final gf a(ft param0, int param1, int param2, boolean param3, int param4, int param5, float[] param6, int param7) {
        hm var10 = null;
        if (param2 != 0) {
            return null;
        }
        if (!((kda) this).field_Wc) {
            if (cla.a(9181, param4)) {
                // ifne L114
            }
            if (!((kda) this).field_sd) {
                var10 = new hm((kda) this, param0, una.field_h, lla.a(false, param4), lla.a(false, param7));
                var10.a(0, param6, 0, param4, param7, param5, param1, param0, true);
                return (gf) (Object) var10;
            }
            return (gf) (Object) new pe((kda) this, param0, param4, param7, param6, param5, param1);
        }
        return (gf) (Object) new hm((kda) this, param0, param4, param7, param3, param6, param5, param1);
    }

    final void a(mna param0, int param1) {
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
        boolean stackIn_23_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_25_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        boolean stackOut_22_0 = false;
        boolean stackOut_24_0 = false;
        int stackOut_24_1 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_23_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          var18 = ((dqa) (Object) param0).field_f;
          var4 = 0;
          var5 = 0;
          if (param1 == -32) {
            break L0;
          } else {
            ((kda) this).field_id = null;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        var8 = 0;
        L1: while (true) {
          if (var18.length <= var8) {
            L2: {
              stackOut_22_0 = ((kda) this).field_Vc;
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (var7 != 0) {
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L2;
              } else {
                stackOut_23_0 = stackIn_23_0;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L2;
              }
            }
            L3: {
              if ((stackIn_25_0 ? 1 : 0) != stackIn_25_1) {
                break L3;
              } else {
                L4: {
                  if (var7 == 0) {
                    jaggl.OpenGL.glDisableClientState(32884);
                    break L4;
                  } else {
                    jaggl.OpenGL.glEnableClientState(32884);
                    break L4;
                  }
                }
                L5: {
                  stackOut_29_0 = this;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_30_0 = stackOut_29_0;
                  if (var7 == 0) {
                    stackOut_31_0 = this;
                    stackOut_31_1 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    break L5;
                  } else {
                    stackOut_30_0 = this;
                    stackOut_30_1 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    break L5;
                  }
                }
                ((kda) this).field_Vc = stackIn_32_1 != 0;
                break L3;
              }
            }
            L6: {
              if (var6 != 0) {
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L6;
              } else {
                stackOut_34_0 = 1;
                stackIn_36_0 = stackOut_34_0;
                break L6;
              }
            }
            L7: {
              if (stackIn_36_0 != (((kda) this).field_Yc ? 1 : 0)) {
                break L7;
              } else {
                L8: {
                  if (var6 != 0) {
                    jaggl.OpenGL.glEnableClientState(32885);
                    break L8;
                  } else {
                    jaggl.OpenGL.glDisableClientState(32885);
                    break L8;
                  }
                }
                L9: {
                  stackOut_40_0 = this;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_41_0 = stackOut_40_0;
                  if (var6 == 0) {
                    stackOut_42_0 = this;
                    stackOut_42_1 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    break L9;
                  } else {
                    stackOut_41_0 = this;
                    stackOut_41_1 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    break L9;
                  }
                }
                ((kda) this).field_Yc = stackIn_43_1 != 0;
                break L7;
              }
            }
            L10: {
              if (((kda) this).field_ld) {
                stackOut_46_0 = 0;
                stackIn_47_0 = stackOut_46_0;
                break L10;
              } else {
                stackOut_45_0 = 1;
                stackIn_47_0 = stackOut_45_0;
                break L10;
              }
            }
            L11: {
              stackOut_47_0 = stackIn_47_0;
              stackIn_49_0 = stackOut_47_0;
              stackIn_48_0 = stackOut_47_0;
              if (var5 != 0) {
                stackOut_49_0 = stackIn_49_0;
                stackOut_49_1 = 0;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                break L11;
              } else {
                stackOut_48_0 = stackIn_48_0;
                stackOut_48_1 = 1;
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                break L11;
              }
            }
            L12: {
              if (stackIn_50_0 == stackIn_50_1) {
                break L12;
              } else {
                L13: {
                  if (var5 == 0) {
                    jaggl.OpenGL.glDisableClientState(32886);
                    break L13;
                  } else {
                    jaggl.OpenGL.glEnableClientState(32886);
                    break L13;
                  }
                }
                L14: {
                  stackOut_54_0 = this;
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_55_0 = stackOut_54_0;
                  if (var5 == 0) {
                    stackOut_56_0 = this;
                    stackOut_56_1 = 0;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    break L14;
                  } else {
                    stackOut_55_0 = this;
                    stackOut_55_1 = 1;
                    stackIn_57_0 = stackOut_55_0;
                    stackIn_57_1 = stackOut_55_1;
                    break L14;
                  }
                }
                ((kda) this).field_ld = stackIn_57_1 != 0;
                break L12;
              }
            }
            L15: {
              if (((kda) this).field_ed < var4) {
                var8 = ((kda) this).field_ed;
                L16: while (true) {
                  if (var4 <= var8) {
                    ((kda) this).field_ed = var4;
                    break L15;
                  } else {
                    jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                    jaggl.OpenGL.glEnableClientState(32888);
                    var8++;
                    continue L16;
                  }
                }
              } else {
                if (var4 >= ((kda) this).field_ed) {
                  break L15;
                } else {
                  var8 = var4;
                  L17: while (true) {
                    if (var8 >= ((kda) this).field_ed) {
                      ((kda) this).field_ed = var4;
                      break L15;
                    } else {
                      jaggl.OpenGL.glClientActiveTexture(33984 - -var8);
                      jaggl.OpenGL.glDisableClientState(32888);
                      var8++;
                      continue L17;
                    }
                  }
                }
              }
            }
            return;
          } else {
            var9 = var18[var8];
            var10 = ((kda) this).field_id[var8];
            var11 = 0;
            var12 = var10.a((byte) -111);
            var13 = var10.b(true);
            var10.c(-3);
            var15 = 0;
            L18: while (true) {
              if (var9.b((byte) -77) <= var15) {
                var8++;
                continue L1;
              } else {
                L19: {
                  var16 = var9.b(0, var15);
                  if (var16 == gj.field_p) {
                    jaggl.OpenGL.glVertexPointer(3, 5126, var12, var13 + (long)var11);
                    var7 = 1;
                    break L19;
                  } else {
                    if (gj.field_e == var16) {
                      jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                      var6 = 1;
                      break L19;
                    } else {
                      if (var16 != gj.field_b) {
                        if (var16 != gj.field_m) {
                          if (var16 == gj.field_n) {
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(var4 + 33984);
                            jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                            break L19;
                          } else {
                            if (gj.field_k == var16) {
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(33984 + var4);
                              jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 - -(long)var11);
                              break L19;
                            } else {
                              if (gj.field_j != var16) {
                                break L19;
                              } else {
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(33984 + var4);
                                jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 + (long)var11);
                                break L19;
                              }
                            }
                          }
                        } else {
                          var4++;
                          jaggl.OpenGL.glClientActiveTexture(var4 + 33984);
                          jaggl.OpenGL.glTexCoordPointer(1, 5126, var12, (long)var11 + var13);
                          break L19;
                        }
                      } else {
                        var5 = 1;
                        jaggl.OpenGL.glColorPointer(4, 5121, var12, (long)var11 + var13);
                        break L19;
                      }
                    }
                  }
                }
                var11 = var11 + var16.field_l;
                var15++;
                continue L18;
              }
            }
          }
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
        long var3 = ((kda) this).field_Mc.prepareSurface(param1);
        if (!(var3 != -1L)) {
            throw new RuntimeException();
        }
        if (param0) {
            ((kda) this).v(42);
        }
        return (Object) (Object) new Long(var3);
    }

    final void a(dn param0, byte param1) {
        int var3 = 0;
        if (param0 == kga.field_o) {
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
        } else {
            var3 = dk.a(param0, 0);
            jaggl.OpenGL.glTexGeni(8192, 9472, var3);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glTexGeni(8193, 9472, var3);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glTexGeni(8194, 9472, var3);
            jaggl.OpenGL.glEnable(3170);
        }
        if (param1 != 0) {
            ((kda) this).v(82);
        }
    }

    final lv a(byte[] param0, ft param1, byte param2, int param3, int param4, int param5) {
        if (param2 > -1) {
            this.i(true);
        }
        return (lv) (Object) new jd((kda) this, param1, param4, param3, param5, param0);
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
          if (-5 != var3) {
            if (-9 != var3) {
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
        String var16 = null;
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
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        var21_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
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
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((kda) this).field_Mc = param0;
                        boolean discarded$3 = ((kda) this).field_Mc.a();
                        ((kda) this).field_Nc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                        ((kda) this).field_jd = jaggl.OpenGL.glGetString(7937).toLowerCase();
                        if (((kda) this).field_Nc.indexOf("microsoft") != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 != ((kda) this).field_Nc.indexOf("brian paul")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0 == ((kda) this).field_Nc.indexOf("mesa")) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
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
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10_int = jb.a((CharSequence) (Object) var9[0], (byte) 70);
                        var11_int = jb.a((CharSequence) (Object) var9[1], (byte) 70);
                        ((kda) this).field_md = var10_int * 10 + var11_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof NumberFormatException ? 9 : 57);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = (NumberFormatException) (Object) caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((kda) this).field_md ^ -1) <= -13) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((kda) this).field_Mc.a("GL_ARB_multitexture")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((kda) this).field_Mc.a("GL_ARB_texture_env_combine")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var26 = new int[1];
                        jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                        ((kda) this).field_Vb = var26[0];
                        if (-3 >= (((kda) this).field_Vb ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
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
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
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
                        statePc = 57;
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
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((kda) this).field_od = stackIn_21_1;
                        if (((kda) this).field_jd.indexOf("radeon") == -1) {
                            statePc = 52;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11_int = 0;
                        var12 = 0;
                        var13 = 0;
                        var14_array = rga.a(32287, ((kda) this).field_jd.replace('/', ' '), ' ');
                        var15 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var14_array.length <= var15) {
                            statePc = 43;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var21_ref = var14_array[var15];
                        var16 = var21_ref;
                        var16 = var21_ref;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (0 >= var21_ref.length()) {
                            statePc = 42;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (120 != var21_ref.charAt(0)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (3 > var21_ref.length()) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var31 = (CharSequence) (Object) var21_ref.substring(1, 3);
                        if (!sqa.a(var31, -3)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var13 = 1;
                        var16 = var21_ref.substring(1);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!var16.equals((Object) (Object) "hd")) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var12 = 1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!var16.startsWith("hd")) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var12 = 1;
                        var16 = var16.substring(2);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var16.length() < 4) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var32 = (CharSequence) (Object) var16.substring(0, 4);
                        if (!sqa.a(var32, -3)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var33 = (CharSequence) (Object) var16.substring(0, 4);
                        var11_int = jb.a(var33, (byte) 70);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof Exception ? 41 : 57);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var17 = (Exception) (Object) caughtException;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var15++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var13 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var12 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var11_int < 7000) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (9250 < var11_int) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ((kda) this).field_x = false;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var11_int ^ -1) > -7001) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var11_int ^ -1) < -8000) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((kda) this).field_fd = false;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((kda) this).field_sd = ((kda) this).field_sd & ((kda) this).field_Mc.a("GL_ARB_half_float_pixel");
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (0 != (((kda) this).field_Nc.indexOf("intel") ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!((kda) this).field_fd) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var27 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var11 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var8 = caughtException;
                    var8.printStackTrace();
                    ((kda) this).a(true);
                    throw new RuntimeException("");
                }
                case 58: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        jaggl.OpenGL.glTexEnvi(8960, param1 + 34176, bma.a(param0, true));
        if (param2 != -6219) {
            ((kda) this).field_Tc = null;
        }
        if (param3) {
            jaggl.OpenGL.glTexEnvi(8960, param1 + 34192, !param4 ? 770 : 771);
        } else {
            jaggl.OpenGL.glTexEnvi(8960, param1 + 34192, !param4 ? 768 : 769);
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
        if (param1 != 15802) {
            ((kda) this).N(120);
        }
        jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, bma.a(param0, true));
        jaggl.OpenGL.glTexEnvi(8960, 34200 - -param3, !param2 ? 770 : 771);
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
        Long var4 = (Long) param0;
        ((kda) this).field_Mc.releaseSurface(param2, var4.longValue());
        if (param1) {
            ((kda) this).I(-84);
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
