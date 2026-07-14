/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jp extends pf {
    static Random field_Jc;
    static int field_Oc;
    private ij field_yc;
    private jaggl.OpenGL field_zc;
    private ij field_Ic;
    private ij field_Uc;
    private ij field_Cc;
    private ij field_bd;
    private ij field_Ec;
    private ij field_Gc;
    private boolean field_cd;
    private boolean field_Kc;
    private long field_Tc;
    jaggl.MapBuffer field_Sc;
    private int field_Rc;
    private boolean field_Lc;
    private boolean field_Yc;
    private esb[] field_Pc;
    private boolean field_Dc;
    jaggl.MapBuffer field_Vc;
    boolean field_Ac;
    private int field_Fc;
    int[] field_Wc;
    private boolean field_Zc;
    private boolean field_Xc;
    private String field_Bc;
    boolean field_Hc;
    boolean field_Qc;
    boolean field_Mc;
    private String field_ad;
    int field_Nc;

    final void a(byte param0, mkb param1, int param2) {
        if (param0 != -6) {
            ((jp) this).field_Bc = null;
        }
        ((jp) this).field_Pc[param2] = (esb) (Object) param1;
    }

    final void a(byte param0, uja param1) {
        int var3 = 0;
        if (param0 != -111) {
            return;
        }
        if (meb.field_d == param1) {
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
        } else {
            var3 = gm.a(param1, 9216);
            jaggl.OpenGL.glTexGeni(8192, 9472, var3);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glTexGeni(8193, 9472, var3);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glTexGeni(8194, 9472, var3);
            jaggl.OpenGL.glEnable(3170);
        }
    }

    final void a(jra param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          var5 = -83 / ((-4 - param3) / 32);
          if (tu.field_b != param0) {
            if (era.field_o != param0) {
              if (di.field_i == param0) {
                var6 = 4;
                var7 = 3 * param2;
                break L0;
              } else {
                if (param0 != bk.field_v) {
                  if (param0 != fu.field_o) {
                    var7 = param2;
                    var6 = 0;
                    break L0;
                  } else {
                    var7 = 2 + param2;
                    var6 = 5;
                    break L0;
                  }
                } else {
                  var6 = 6;
                  var7 = param2 - -2;
                  break L0;
                }
              }
            } else {
              var7 = param2 + 1;
              var6 = 3;
              break L0;
            }
          } else {
            var7 = param2 * 2;
            var6 = 1;
            break L0;
          }
        }
        jaggl.OpenGL.glDrawArrays(var6, param1, var7);
    }

    final void j(byte param0) {
        if (param0 != -56) {
            ((jp) this).field_Lc = false;
        }
        if (!((jp) this).field_zb) {
            jaggl.OpenGL.glDisable(3042);
        } else {
            jaggl.OpenGL.glEnable(3042);
        }
    }

    final void o(byte param0) {
        if (param0 != 81) {
            ((jp) this).ya();
        }
        if (((jp) this).field_ac) {
            jaggl.OpenGL.glEnable(3089);
        } else {
            jaggl.OpenGL.glDisable(3089);
        }
    }

    final vca a(byte param0, boolean param1) {
        if (param0 != -19) {
            return null;
        }
        return (vca) (Object) new mq((jp) this, mj.field_e, param1);
    }

    final boolean b() {
        return false;
    }

    final synchronized void b(int param0, int param1, boolean param2) {
        if (param2) {
            Object var5 = null;
            ((jp) this).a((aja) null, true);
        }
        hua var4 = new hua(param1);
        var4.field_b = (long)param0;
        ((jp) this).field_Ic.b(-10258, (ksa) (Object) var4);
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
            jaggl.OpenGL.glDisable(32925);
        } else {
            jaggl.OpenGL.glEnable(32925);
        }
        if (param0 >= -14) {
            ((jp) this).j((byte) -120);
        }
    }

    final void ya() {
        ((jp) this).b((byte) -74, true);
        jaggl.OpenGL.glClear(256);
    }

    final void o() {
        super.o();
        if (!(((jp) this).field_zc == null)) {
            boolean discarded$0 = ((jp) this).field_zc.b();
            ((jp) this).field_zc.release();
            ((jp) this).field_zc = null;
        }
    }

    final vmb a(int param0, qma[] param1) {
        if (param0 != 10) {
            ((jp) this).field_Yc = true;
        }
        return (vmb) (Object) new bva(param1);
    }

    final void e(boolean param0) {
        if (param0) {
            ((jp) this).field_Cc = null;
        }
        if (((jp) this).field_g) {
            jaggl.OpenGL.glEnable(16384);
            jaggl.OpenGL.glEnable(16385);
        } else {
            jaggl.OpenGL.glDisable(16384);
            jaggl.OpenGL.glDisable(16385);
        }
    }

    final void F(int param0) {
        if (param0 != 12614) {
            ((jp) this).y(-43);
        }
        if (((jp) this).field_nc) {
            jaggl.OpenGL.glEnable(2929);
        } else {
            jaggl.OpenGL.glDisable(2929);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final boolean s() {
        return false;
    }

    public static void K(int param0) {
        field_Jc = null;
        if (param0 != 771) {
            field_Oc = -126;
        }
    }

    final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = VoidHunters.field_G;
        var2 = -1 + ((jp) this).field_L;
        L0: while (true) {
          if (var2 < 0) {
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
            var6 = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                L2: {
                  if (param0 >= 106) {
                    break L2;
                  } else {
                    ((jp) this).field_Gc = null;
                    break L2;
                  }
                }
                jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                jaggl.OpenGL.glFogi(2917, 9729);
                jaggl.OpenGL.glHint(3156, 4353);
                ((jp) this).field_zc.setSwapInterval(0);
                super.n(117);
                return;
              } else {
                var4 = var3 + 16384;
                jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                var3++;
                continue L1;
              }
            }
          } else {
            jaggl.OpenGL.glActiveTexture(var2 + 33984);
            jaggl.OpenGL.glTexEnvi(8960, 8704, 34160);
            jaggl.OpenGL.glTexEnvi(8960, 34161, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34178, 34166);
            jaggl.OpenGL.glTexEnvi(8960, 34162, 8448);
            jaggl.OpenGL.glTexEnvi(8960, 34186, 34166);
            var2--;
            continue L0;
          }
        }
    }

    final hdb a(boolean param0, int param1, int[][] param2, int param3) {
        if (param1 != -5210) {
            ((jp) this).u();
        }
        return (hdb) (Object) new qva((jp) this, param3, param0, param2);
    }

    final void B(int param0) {
        if (((jp) this).field_Xb) {
            // ifne L23
            jaggl.OpenGL.glEnable(2896);
        } else {
            jaggl.OpenGL.glDisable(2896);
        }
        if (param0 >= -15) {
            ((jp) this).field_bd = null;
        }
    }

    final eb a(int param0, boolean param1, int[] param2, int param3, int param4, boolean param5, int param6) {
        ubb var9 = null;
        if (!param5) {
            return null;
        }
        if (!((jp) this).field_Xc) {
            if (bd.a(param0, (byte) -95)) {
                // ifne L113
            }
            if (((jp) this).field_Zc) {
                return (eb) (Object) new gn((jp) this, param0, param3, param2, param6, param4);
            }
            var9 = new ubb((jp) this, qua.field_d, mj.field_f, hj.a(param0, (byte) -100), hj.a(param3, (byte) -121));
            var9.a(0, param3, param0, param6, param4, param2, 0, (byte) -104);
            return (eb) (Object) var9;
        }
        return (eb) (Object) new ubb((jp) this, param0, param3, param1, param2, param6, param4);
    }

    private final void I(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (!((jp) this).field_Dc) {
            break L0;
          } else {
            jaggl.OpenGL.glPopMatrix();
            break L0;
          }
        }
        L1: {
          var2 = -41 % ((param0 - 24) / 42);
          if (!((jp) this).field_pb.a(-12178)) {
            if (((jp) this).field_ec) {
              jaggl.OpenGL.glLoadIdentity();
              ((jp) this).field_Dc = false;
              break L1;
            } else {
              jaggl.OpenGL.glLoadMatrixf(((jp) this).field_O.b(msa.field_q, (byte) 114), 0);
              ((jp) this).field_Dc = false;
              break L1;
            }
          } else {
            L2: {
              if (((jp) this).field_cd) {
                break L2;
              } else {
                jaggl.OpenGL.glLoadMatrixf(((jp) this).field_gb.b(msa.field_q, (byte) 114), 0);
                ((jp) this).field_cd = true;
                ((jp) this).m(3);
                ((jp) this).f(73);
                break L2;
              }
            }
            if (!((jp) this).field_ec) {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glMultMatrixf(((jp) this).field_O.b(msa.field_q, (byte) 114), 0);
              ((jp) this).field_Dc = true;
              break L1;
            } else {
              ((jp) this).field_Dc = false;
              break L1;
            }
          }
        }
    }

    final void a(hf param0) {
    }

    final void h(boolean param0) {
        lva.field_o[2] = ((jp) this).field_Rb * ((jp) this).field_x;
        lva.field_o[1] = ((jp) this).field_Rb * ((jp) this).field_u;
        lva.field_o[0] = ((jp) this).field_Rb * ((jp) this).field_Sb;
        if (!param0) {
            field_Oc = -95;
        }
        lva.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightModelfv(2899, lva.field_o, 0);
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param1 <= 89) {
            ((jp) this).field_Gc = null;
        }
        hua var4 = new hua(param2);
        var4.field_b = (long)param0;
        ((jp) this).field_Uc.b(-10258, (ksa) (Object) var4);
    }

    final hf a(ekb param0, wib param1) {
        return null;
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(param0 & 16711680) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 648860920) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        ((jp) this).h((byte) 101);
        ((jp) this).a((ura) null, -111);
        ((jp) this).c(71, 0);
        ((jp) this).c(true);
        jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
        jaggl.OpenGL.glRasterPos2i(param0, param1);
        jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((jp) this).field_Nc, param4, param5);
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
    }

    final mkb a(boolean param0, int param1) {
        if (param1 != 3) {
            return null;
        }
        return (mkb) (Object) new esb((jp) this, param0);
    }

    final void I(int param0) {
        if (!((jp) this).field_eb) {
            jaggl.OpenGL.glDisable(3008);
        } else {
            jaggl.OpenGL.glEnable(3008);
        }
        if (param0 != 17634) {
            ((jp) this).o();
        }
    }

    final uda a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var3 = -123 / ((-34 - param0) / 63);
        var4 = param1;
        if (3 != var4) {
          if ((var4 ^ -1) != -5) {
            if ((var4 ^ -1) != -9) {
              return super.a((byte) 54, param1);
            } else {
              return (uda) (Object) new fib((jp) this, ((jp) this).field_Ab, ((jp) this).field_Mb);
            }
          } else {
            return (uda) (Object) new vsb((jp) this, ((jp) this).field_Ab, ((jp) this).field_Mb);
          }
        } else {
          return (uda) (Object) new bma((jp) this, ((jp) this).field_Ab);
        }
    }

    final void a(boolean param0, int param1, boolean param2, slb param3, int param4) {
        jaggl.OpenGL.glTexEnvi(8960, param4 + 34176, qg.a(param3, false));
        if (param1 != -21115) {
            ((jp) this).j(71);
        }
        if (param0) {
            jaggl.OpenGL.glTexEnvi(8960, 34192 + param4, param2 ? 771 : 770);
        } else {
            jaggl.OpenGL.glTexEnvi(8960, 34192 - -param4, !param2 ? 768 : 769);
        }
    }

    final void y(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -41) {
            break L0;
          } else {
            ((jp) this).field_Cc = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((jp) this).field_M) {
              break L2;
            } else {
              if (!((jp) this).field_X) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        jaggl.OpenGL.glDepthMask(stackIn_6_0 != 0);
    }

    final void a(boolean param0, byte param1, slb param2, int param3) {
        jaggl.OpenGL.glTexEnvi(8960, param3 + 34184, qg.a(param2, false));
        jaggl.OpenGL.glTexEnvi(8960, param3 + 34200, !param0 ? 770 : 771);
        if (param1 != 94) {
            Object var6 = null;
            ((jp) this).a(-51, (vmb) null);
        }
    }

    final boolean a(int param0, kb param1, mj param2) {
        int var4 = 43 % ((-77 - param0) / 49);
        return true;
    }

    final void w(int param0) {
        if (param0 != 1) {
            ((jp) this).a(0.3592780530452728f, 1.5894063711166382f, 0.25299444794654846f);
        }
        if (((jp) this).field_cc) {
            // ifeq L54
            // if_icmpgt L54
            jaggl.OpenGL.glEnable(2912);
        } else {
            jaggl.OpenGL.glDisable(2912);
        }
    }

    final void a(aja param0, boolean param1) {
    }

    final float f(byte param0) {
        if (param0 > -90) {
            ((jp) this).field_Yc = false;
        }
        return 0.0f;
    }

    final void G(byte param0) {
        lva.field_o[2] = ((jp) this).field_x * ((jp) this).field_oc;
        lva.field_o[1] = ((jp) this).field_oc * ((jp) this).field_u;
        lva.field_o[0] = ((jp) this).field_Sb * ((jp) this).field_oc;
        lva.field_o[3] = 1.0f;
        jaggl.OpenGL.glLightfv(16384, 4609, lva.field_o, 0);
        lva.field_o[1] = ((jp) this).field_u * -((jp) this).field_tc;
        if (param0 <= 4) {
            return;
        }
        lva.field_o[2] = -((jp) this).field_tc * ((jp) this).field_x;
        lva.field_o[3] = 1.0f;
        lva.field_o[0] = ((jp) this).field_Sb * -((jp) this).field_tc;
        jaggl.OpenGL.glLightfv(16385, 4609, lva.field_o, 0);
    }

    final void G(int param0) {
        ((jp) this).field_cd = false;
        this.I((byte) -105);
        if (param0 != 17891) {
            ((jp) this).j();
        }
    }

    final void y(byte param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        if (param0 >= -17) {
            ((jp) this).s((byte) -2);
        }
        jaggl.OpenGL.glLoadMatrixf(((jp) this).field_Fb, 0);
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final static float[] a(float[] param0, int param1, int param2) {
        float[] var4 = new float[param1];
        float[] var3 = var4;
        cua.a(param0, 0, var4, 0, param1);
        if (param2 != 7353) {
            field_Oc = -20;
        }
        return var4;
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        int var4 = 0;
        hua var5 = null;
        hua var6 = null;
        hua var7 = null;
        hua var8 = null;
        hua var9 = null;
        ksa var10 = null;
        ksa var11 = null;
        hua var12 = null;
        var4 = VoidHunters.field_G;
        var2 = 0;
        param0 = param0 & 2147483647;
        L0: while (true) {
          if (((jp) this).field_Ic.b(112)) {
            L1: {
              if ((var2 ^ -1) >= -1) {
                break L1;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, tgb.field_c, 0);
                var2 = 0;
                break L1;
              }
            }
            L2: while (true) {
              if (((jp) this).field_Uc.b(120)) {
                L3: {
                  if (var2 <= 0) {
                    break L3;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, tgb.field_c, 0);
                    var2 = 0;
                    break L3;
                  }
                }
                L4: while (true) {
                  if (((jp) this).field_Cc.b(112)) {
                    L5: {
                      if (-1 <= (var2 ^ -1)) {
                        break L5;
                      } else {
                        jaggl.OpenGL.glDeleteFramebuffersEXT(var2, tgb.field_c, 0);
                        var2 = 0;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      if (((jp) this).field_bd.b(123)) {
                        L7: {
                          if ((var2 ^ -1) >= -1) {
                            break L7;
                          } else {
                            jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, tgb.field_c, 0);
                            var2 = 0;
                            break L7;
                          }
                        }
                        L8: while (true) {
                          if (((jp) this).field_yc.b(-94)) {
                            L9: while (true) {
                              if (((jp) this).field_Ec.b(-96)) {
                                L10: while (true) {
                                  if (((jp) this).field_Gc.b(127)) {
                                    L11: while (true) {
                                      if (((jp) this).field_yc.b(-126)) {
                                        L12: {
                                          if (100663296 >= ((jp) this).g(3554)) {
                                            break L12;
                                          } else {
                                            if ((((jp) this).field_Tc - -60000L ^ -1L) <= (wt.a(false) ^ -1L)) {
                                              break L12;
                                            } else {
                                              System.gc();
                                              ((jp) this).field_Tc = wt.a(false);
                                              break L12;
                                            }
                                          }
                                        }
                                        super.c(param0);
                                        return;
                                      } else {
                                        var12 = (hua) (Object) ((jp) this).field_yc.a(true);
                                        jaggl.OpenGL.glDeleteLists((int)var12.field_b, var12.field_d);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var11 = ((jp) this).field_Gc.a(true);
                                    jaggl.OpenGL.glDeleteObjectARB(var11.field_b);
                                    continue L10;
                                  }
                                }
                              } else {
                                var10 = ((jp) this).field_Ec.a(true);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_b);
                                continue L9;
                              }
                            }
                          } else {
                            var9 = (hua) (Object) ((jp) this).field_yc.a(true);
                            jaggl.OpenGL.glDeleteLists((int)var9.field_b, var9.field_d);
                            continue L8;
                          }
                        }
                      } else {
                        var8 = (hua) (Object) ((jp) this).field_bd.a(true);
                        var2++;
                        tgb.field_c[var2] = (int)var8.field_b;
                        ((jp) this).field_mb = ((jp) this).field_mb - var8.field_d;
                        if (-1001 == (var2 ^ -1)) {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, tgb.field_c, 0);
                          var2 = 0;
                          continue L6;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var7 = (hua) (Object) ((jp) this).field_Cc.a(true);
                    var2++;
                    tgb.field_c[var2] = var7.field_d;
                    if (1000 == var2) {
                      jaggl.OpenGL.glDeleteFramebuffersEXT(var2, tgb.field_c, 0);
                      var2 = 0;
                      continue L4;
                    } else {
                      continue L4;
                    }
                  }
                }
              } else {
                var6 = (hua) (Object) ((jp) this).field_Uc.a(true);
                var2++;
                tgb.field_c[var2] = (int)var6.field_b;
                ((jp) this).field_Nb = ((jp) this).field_Nb - var6.field_d;
                if (var2 == 1000) {
                  jaggl.OpenGL.glDeleteTextures(var2, tgb.field_c, 0);
                  var2 = 0;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          } else {
            var5 = (hua) (Object) ((jp) this).field_Ic.a(true);
            var2++;
            tgb.field_c[var2] = (int)var5.field_b;
            ((jp) this).field_ob = ((jp) this).field_ob - var5.field_d;
            if (1000 != var2) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, tgb.field_c, 0);
              var2 = 0;
              continue L0;
            }
          }
        }
    }

    final gf a(int param0, int param1, byte[] param2, kb param3, int param4, int param5) {
        if (param5 != -16539) {
            return null;
        }
        return (gf) (Object) new rab((jp) this, param3, param4, param0, param1, param2);
    }

    final eb a(kb param0, float[] param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7) {
        Object var10 = null;
        ubb var11 = null;
        L0: {
          if (param6) {
            break L0;
          } else {
            var10 = null;
            ((jp) this).a((byte) -46, (uja) null);
            break L0;
          }
        }
        L1: {
          if (((jp) this).field_Xc) {
            break L1;
          } else {
            L2: {
              if (!bd.a(param7, (byte) -95)) {
                break L2;
              } else {
                if (!bd.a(param4, (byte) -95)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (((jp) this).field_Zc) {
              return (eb) (Object) new gn((jp) this, param0, param7, param4, param1, param3, param5);
            } else {
              var11 = new ubb((jp) this, param0, mj.field_d, hj.a(param7, (byte) -125), hj.a(param4, (byte) -101));
              var11.a(param4, param0, (byte) -51, param5, param1, 0, 0, param7, param3);
              return (eb) (Object) var11;
            }
          }
        }
        return (eb) (Object) new ubb((jp) this, param0, param7, param4, param2, param1, param3, param5);
    }

    final wib b(int param0, int param1) {
        return null;
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        Long var4 = (Long) param1;
        ((jp) this).field_zc.releaseSurface(param0, var4.longValue());
        if (param2 != 0) {
            ((jp) this).e(false);
        }
    }

    final void f(int param0) {
        int var2 = 0;
        fsb var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        ((jp) this).c(true);
        var2 = 0;
        if (param0 > 66) {
          L0: while (true) {
            if (((jp) this).field_Kb <= var2) {
              L1: while (true) {
                if (((jp) this).field_bb <= var2) {
                  super.f(75);
                  return;
                } else {
                  jaggl.OpenGL.glDisable(var2 + 16386);
                  var2++;
                  continue L1;
                }
              }
            } else {
              var3 = ((jp) this).field_Lb[var2];
              var4 = var3.a(-118);
              var5 = 16386 - -var2;
              var6 = var3.d(-392138175) / 255.0f;
              lva.field_o[0] = (float)var3.c((byte) -79);
              lva.field_o[1] = (float)var3.a(true);
              lva.field_o[2] = (float)var3.d((byte) 62);
              lva.field_o[3] = 1.0f;
              jaggl.OpenGL.glLightfv(var5, 4611, lva.field_o, 0);
              lva.field_o[0] = (float)dla.a(255, var4 >> -1366000368) * var6;
              lva.field_o[2] = (float)dla.a(255, var4) * var6;
              lva.field_o[1] = var6 * (float)(dla.a(var4, 65382) >> 1747844744);
              lva.field_o[3] = 1.0f;
              jaggl.OpenGL.glLightfv(var5, 4609, lva.field_o, 0);
              jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.c(16777215) * var3.c(16777215)));
              jaggl.OpenGL.glEnable(var5);
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void a(long param0, int param1) {
        ksa var4 = new ksa();
        var4.field_b = param0;
        if (param1 != 0) {
            return;
        }
        ((jp) this).field_Gc.b(-10258, var4);
    }

    final Object a(byte param0, java.awt.Canvas param1) {
        long var3 = ((jp) this).field_zc.prepareSurface(param1);
        if (param0 > -21) {
            return null;
        }
        if (!(-1L != var3)) {
            throw new RuntimeException();
        }
        return (Object) (Object) new Long(var3);
    }

    final void C(int param0) {
        if (param0 != 0) {
            return;
        }
        jaggl.OpenGL.glMatrixMode(5890);
        if (fsa.field_o == ((jp) this).field_A[((jp) this).field_ab]) {
            jaggl.OpenGL.glLoadIdentity();
        } else {
            jaggl.OpenGL.glLoadMatrixf(((jp) this).field_Eb[((jp) this).field_ab].b(msa.field_q, (byte) 114), 0);
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void v(byte param0) {
        lva.field_o[3] = (float)(((jp) this).field_jb >>> -786604744) / 255.0f;
        lva.field_o[2] = (float)dla.a(255, ((jp) this).field_jb) / 255.0f;
        lva.field_o[1] = (float)dla.a(65280, ((jp) this).field_jb) / 65280.0f;
        if (param0 != -109) {
            Object var3 = null;
            ((jp) this).a((byte) -64, (uja) null);
        }
        lva.field_o[0] = (float)dla.a(((jp) this).field_jb, 16711680) / 16711680.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, lva.field_o, 0);
    }

    final void l(byte param0) {
        if (param0 < 109) {
            return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34162, tc.a(8448, ((jp) this).field_U[((jp) this).field_ab]));
    }

    final void a(float param0, float param1, float param2) {
    }

    final void v() {
        if (0 >= ((jp) this).field_db) {
            if (!(0 < ((jp) this).field_i)) {
                return;
            }
        }
        int var1 = ((jp) this).field_H;
        int var2 = ((jp) this).field_F;
        int var3 = ((jp) this).field_xc;
        int var4 = ((jp) this).field_Bb;
        ((jp) this).v(-107);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((jp) this).w((byte) -101);
        ((jp) this).d(false, -30305);
        ((jp) this).c((byte) -73, false);
        ((jp) this).b(false, -1700);
        ((jp) this).b((byte) -74, false);
        ((jp) this).a((ura) null, -116);
        ((jp) this).a(false, (byte) -124, false, -2);
        ((jp) this).h(45, 1);
        ((jp) this).c(84, 0);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, ((jp) this).field_db, ((jp) this).field_i, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((jp) this).KA(var1, var3, var2, var4);
    }

    final eb a(int param0, byte[] param1, kb param2, int param3, int param4, int param5, boolean param6, int param7) {
        ubb var10 = null;
        L0: {
          if (param7 == 11) {
            break L0;
          } else {
            hdb discarded$2 = ((jp) this).a(true, 116, (int[][]) null, -28);
            break L0;
          }
        }
        L1: {
          if (((jp) this).field_Xc) {
            break L1;
          } else {
            L2: {
              if (!bd.a(param4, (byte) -95)) {
                break L2;
              } else {
                if (!bd.a(param5, (byte) -95)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (!((jp) this).field_Zc) {
              var10 = new ubb((jp) this, param2, mj.field_f, hj.a(param4, (byte) -107), hj.a(param5, (byte) -127));
              var10.a(param3, param1, param5, param4, param0, 0, 3314, 0, param2);
              return (eb) (Object) var10;
            } else {
              return (eb) (Object) new gn((jp) this, param2, param4, param5, param1, param0, param3);
            }
          }
        }
        return (eb) (Object) new ubb((jp) this, param2, param4, param5, param6, param1, param0, param3);
    }

    final void m(byte param0) {
        jaggl.OpenGL.glViewport(((jp) this).field_Y, ((jp) this).field_Cb, ((jp) this).field_db, ((jp) this).field_i);
        int var2 = 105 / ((param0 - -40) / 57);
    }

    final void p(byte param0) {
        if (param0 <= 84) {
            return;
        }
        this.I((byte) 92);
    }

    final void i(byte param0) {
        int var2 = -60 % ((-45 - param0) / 51);
    }

    jp(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, asb param4, int param5) {
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
                    ((jp) this).field_yc = new ij();
                    ((jp) this).field_Ic = new ij();
                    ((jp) this).field_Uc = new ij();
                    ((jp) this).field_Cc = new ij();
                    ((jp) this).field_bd = new ij();
                    ((jp) this).field_Ec = new ij();
                    ((jp) this).field_Gc = new ij();
                    ((jp) this).field_Pc = new esb[16];
                    ((jp) this).field_Sc = new jaggl.MapBuffer();
                    ((jp) this).field_Vc = new jaggl.MapBuffer();
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((jp) this).field_zc = param0;
                        boolean discarded$2 = ((jp) this).field_zc.a();
                        ((jp) this).field_Bc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                        ((jp) this).field_ad = jaggl.OpenGL.glGetString(7937).toLowerCase();
                        if (((jp) this).field_Bc.indexOf("microsoft") != -1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 != ((jp) this).field_Bc.indexOf("brian paul")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (0 == ((jp) this).field_Bc.indexOf("mesa")) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        var9 = up.a((byte) -67, ' ', var20.replace('.', ' '));
                        if ((var9.length ^ -1) > -3) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10_int = lob.a(-102, (CharSequence) (Object) var9[0]);
                        var11_int = lob.a(38, (CharSequence) (Object) var9[1]);
                        ((jp) this).field_Fc = var10_int * 10 + var11_int;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof NumberFormatException ? 8 : 58);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = (NumberFormatException) (Object) caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((((jp) this).field_Fc ^ -1) <= -13) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (((jp) this).field_zc.a("GL_ARB_multitexture")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((jp) this).field_zc.a("GL_ARB_texture_env_combine")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var26 = new int[1];
                        jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                        ((jp) this).field_L = var26[0];
                        if (2 <= ((jp) this).field_L) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((jp) this).field_qb = 8;
                        ((jp) this).field_Hc = ((jp) this).field_zc.a("GL_ARB_vertex_buffer_object");
                        ((jp) this).field_sc = ((jp) this).field_zc.a("GL_ARB_multisample");
                        ((jp) this).field_Zc = ((jp) this).field_zc.a("GL_ARB_texture_rectangle");
                        ((jp) this).field_vb = ((jp) this).field_zc.a("GL_ARB_texture_cube_map");
                        ((jp) this).field_Xc = ((jp) this).field_zc.a("GL_ARB_texture_non_power_of_two");
                        ((jp) this).field_uc = ((jp) this).field_zc.a("GL_EXT_texture3D");
                        ((jp) this).field_Mc = ((jp) this).field_zc.a("GL_ARB_vertex_shader");
                        ((jp) this).field_Ac = ((jp) this).field_zc.a("GL_ARB_vertex_program");
                        ((jp) this).field_Qc = ((jp) this).field_zc.a("GL_ARB_fragment_shader");
                        boolean discarded$3 = ((jp) this).field_zc.a("GL_ARB_fragment_program");
                        ((jp) this).field_Wc = new int[((jp) this).field_L];
                        stackOut_18_0 = this;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (!jaclib.memory.Stream.a()) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 58;
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
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((jp) this).field_Nc = stackIn_21_1;
                        if (((jp) this).field_ad.indexOf("radeon") == -1) {
                            statePc = 53;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11_int = 0;
                        var12 = 0;
                        var13 = 0;
                        var14_array = up.a((byte) -67, ' ', ((jp) this).field_ad.replace('/', ' '));
                        var15 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var14_array.length <= var15) {
                            statePc = 44;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var21_ref.length() <= 0) {
                            statePc = 43;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = (stateCaught_26 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var21_ref.charAt(0) != 120) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var21_ref.length() < 3) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var31 = (CharSequence) (Object) var21_ref.substring(1, 3);
                        if (!hwa.a(var31, 10)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 42 : 58);
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
                        statePc = (stateCaught_31 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var16.equals((Object) (Object) "hd")) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 42 : 58);
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
                        statePc = (stateCaught_34 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (!var16.startsWith("hd")) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var16 = var16.substring(2);
                        var12 = 1;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var16.length() ^ -1) > -5) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var32 = (CharSequence) (Object) var16.substring(0, 4);
                        if (!hwa.a(var32, 10)) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var33 = (CharSequence) (Object) var16.substring(0, 4);
                        var11_int = lob.a(63, var33);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof Exception ? 42 : 58);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var17 = (Exception) (Object) caughtException;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var15++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var13 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var12 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var11_int < 7000) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-8000 > (var11_int ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((jp) this).field_Hc = false;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (7000 > var11_int) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((var11_int ^ -1) < -9251) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((jp) this).field_uc = false;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((jp) this).field_Zc = ((jp) this).field_Zc & ((jp) this).field_zc.a("GL_ARB_half_float_pixel");
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (0 == (((jp) this).field_Bc.indexOf("intel") ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!((jp) this).field_Hc) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var27 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var11 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    var8 = caughtException;
                    var8.printStackTrace();
                    ((jp) this).a((byte) 30);
                    throw new RuntimeException("");
                }
                case 59: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int[] na(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int[] var8 = new int[param3 * param2];
        int[] var5 = var8;
        for (var6 = 0; param3 > var6; var6++) {
            jaggl.OpenGL.glReadPixelsi(param0, -1 + (-param1 + (((jp) this).field_i - var6)), param2, 1, 32993, ((jp) this).field_Nc, var8, param2 * var6);
        }
        return var8;
    }

    final void A(byte param0) {
        int var2 = -28 % ((param0 - -6) / 45);
        jaggl.OpenGL.glScissor(((jp) this).field_H + ((jp) this).field_Y, ((jp) this).field_i + (((jp) this).field_Cb - ((jp) this).field_Bb), ((jp) this).field_F + -((jp) this).field_H, -((jp) this).field_xc + ((jp) this).field_Bb);
    }

    final void t(int param0) {
        jaggl.OpenGL.glActiveTexture(33984 + ((jp) this).field_ab);
        if (param0 != 12) {
            ((jp) this).e(false);
        }
    }

    final synchronized void a(int param0, byte param1) {
        ksa var3 = new ksa();
        var3.field_b = (long)param0;
        if (param1 <= 94) {
            return;
        }
        ((jp) this).field_Ec.b(-10258, var3);
    }

    final void m(int param0) {
        if (param0 != 3) {
            return;
        }
        jaggl.OpenGL.glLightfv(16384, 4611, ((jp) this).field_wc, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, ((jp) this).field_cb, 0);
    }

    final void j(int param0) {
        ((jp) this).field_r = (float)(-((jp) this).field_Qb + ((jp) this).field_Wb);
        ((jp) this).field_p = (float)(-((jp) this).field_j) + ((jp) this).field_r;
        if (((jp) this).field_p < (float)((jp) this).field_h) {
            ((jp) this).field_p = (float)((jp) this).field_h;
        }
        jaggl.OpenGL.glFogf(2915, ((jp) this).field_p);
        jaggl.OpenGL.glFogf(2916, ((jp) this).field_r);
        lva.field_o[0] = (float)dla.a(((jp) this).field_lc, 16711680) / 16711680.0f;
        lva.field_o[1] = (float)dla.a(((jp) this).field_lc, 65280) / 65280.0f;
        if (param0 != 8) {
            ((jp) this).field_Cc = null;
        }
        lva.field_o[2] = (float)dla.a(255, ((jp) this).field_lc) / 255.0f;
        jaggl.OpenGL.glFogfv(2918, lva.field_o, 0);
    }

    final void u() {
    }

    final eb a(int param0, int param1, int param2, kb param3, mj param4) {
        if (param0 < 115) {
            return null;
        }
        if (!((jp) this).field_Xc) {
            if (bd.a(param1, (byte) -95)) {
                // ifne L86
            }
            if (!((jp) this).field_Zc) {
                return (eb) (Object) new ubb((jp) this, param3, param4, hj.a(param1, (byte) -102), hj.a(param2, (byte) -127));
            }
            return (eb) (Object) new gn((jp) this, param3, param4, param1, param2);
        }
        return (eb) (Object) new ubb((jp) this, param3, param4, param1, param2);
    }

    final void j() {
    }

    final void o(int param0) {
        if (param0 > -64) {
            return;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, tc.a(8448, ((jp) this).field_z[((jp) this).field_ab]));
    }

    final void d(int param0, int param1) {
        int var3 = 5 % ((36 - param0) / 33);
    }

    final boolean a(mj param0, kb param1, int param2) {
        int var4 = 112 % ((-32 - param2) / 50);
        return true;
    }

    final void r(int param0) {
        int var2 = ((jp) this).field_Wc[((jp) this).field_ab];
        if (param0 != 3) {
            ((jp) this).field_Mc = false;
        }
        if (!(var2 == 0)) {
            ((jp) this).field_Wc[((jp) this).field_ab] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
    }

    final void a(int param0, int param1) throws jkb {
        ((jp) this).field_zc.swapBuffers();
    }

    final void a(int param0, vmb param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qma var9_ref_qma = null;
        int var9 = 0;
        esb var10 = null;
        int var11 = 0;
        int var12 = 0;
        long var13 = 0L;
        int var15 = 0;
        pb var16 = null;
        int var17 = 0;
        qma[] var18 = null;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        boolean stackIn_52_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_54_0 = false;
        int stackIn_54_1 = 0;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        boolean stackOut_51_0 = false;
        boolean stackOut_53_0 = false;
        int stackOut_53_1 = 0;
        boolean stackOut_52_0 = false;
        int stackOut_52_1 = 0;
        Object stackOut_59_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        var17 = VoidHunters.field_G;
        var18 = ((bva) (Object) param1).field_f;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        L0: while (true) {
          if (var18.length <= var8) {
            L1: {
              if (var7 != 0) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L1;
              } else {
                stackOut_22_0 = 1;
                stackIn_24_0 = stackOut_22_0;
                break L1;
              }
            }
            L2: {
              stackOut_24_0 = stackIn_24_0;
              stackIn_26_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (((jp) this).field_Lc) {
                stackOut_26_0 = stackIn_26_0;
                stackOut_26_1 = 0;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                break L2;
              } else {
                stackOut_25_0 = stackIn_25_0;
                stackOut_25_1 = 1;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_27_0 != stackIn_27_1) {
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
                  stackOut_32_0 = this;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (var7 == 0) {
                    stackOut_34_0 = this;
                    stackOut_34_1 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L5;
                  } else {
                    stackOut_33_0 = this;
                    stackOut_33_1 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L5;
                  }
                }
                ((jp) this).field_Lc = stackIn_35_1 != 0;
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (var6 != 0) {
                stackOut_38_0 = 0;
                stackIn_39_0 = stackOut_38_0;
                break L6;
              } else {
                stackOut_37_0 = 1;
                stackIn_39_0 = stackOut_37_0;
                break L6;
              }
            }
            L7: {
              stackOut_39_0 = stackIn_39_0;
              stackIn_41_0 = stackOut_39_0;
              stackIn_40_0 = stackOut_39_0;
              if (((jp) this).field_Yc) {
                stackOut_41_0 = stackIn_41_0;
                stackOut_41_1 = 0;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                break L7;
              } else {
                stackOut_40_0 = stackIn_40_0;
                stackOut_40_1 = 1;
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                break L7;
              }
            }
            L8: {
              if (stackIn_42_0 != stackIn_42_1) {
                L9: {
                  if (var6 == 0) {
                    jaggl.OpenGL.glDisableClientState(32885);
                    break L9;
                  } else {
                    jaggl.OpenGL.glEnableClientState(32885);
                    break L9;
                  }
                }
                L10: {
                  stackOut_47_0 = this;
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_48_0 = stackOut_47_0;
                  if (var6 == 0) {
                    stackOut_49_0 = this;
                    stackOut_49_1 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    break L10;
                  } else {
                    stackOut_48_0 = this;
                    stackOut_48_1 = 1;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    break L10;
                  }
                }
                ((jp) this).field_Yc = stackIn_50_1 != 0;
                break L8;
              } else {
                break L8;
              }
            }
            L11: {
              stackOut_51_0 = ((jp) this).field_Kc;
              stackIn_53_0 = stackOut_51_0;
              stackIn_52_0 = stackOut_51_0;
              if (var5 != 0) {
                stackOut_53_0 = stackIn_53_0;
                stackOut_53_1 = 0;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                break L11;
              } else {
                stackOut_52_0 = stackIn_52_0;
                stackOut_52_1 = 1;
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                break L11;
              }
            }
            L12: {
              if ((stackIn_54_0 ? 1 : 0) == stackIn_54_1) {
                L13: {
                  if (var5 != 0) {
                    jaggl.OpenGL.glEnableClientState(32886);
                    break L13;
                  } else {
                    jaggl.OpenGL.glDisableClientState(32886);
                    break L13;
                  }
                }
                L14: {
                  stackOut_59_0 = this;
                  stackIn_61_0 = stackOut_59_0;
                  stackIn_60_0 = stackOut_59_0;
                  if (var5 == 0) {
                    stackOut_61_0 = this;
                    stackOut_61_1 = 0;
                    stackIn_62_0 = stackOut_61_0;
                    stackIn_62_1 = stackOut_61_1;
                    break L14;
                  } else {
                    stackOut_60_0 = this;
                    stackOut_60_1 = 1;
                    stackIn_62_0 = stackOut_60_0;
                    stackIn_62_1 = stackOut_60_1;
                    break L14;
                  }
                }
                ((jp) this).field_Kc = stackIn_62_1 != 0;
                break L12;
              } else {
                break L12;
              }
            }
            L15: {
              var8 = -72 % ((55 - param0) / 44);
              if (var4 > ((jp) this).field_Rc) {
                var9 = ((jp) this).field_Rc;
                L16: while (true) {
                  if (var9 >= var4) {
                    ((jp) this).field_Rc = var4;
                    break L15;
                  } else {
                    jaggl.OpenGL.glClientActiveTexture(33984 + var9);
                    jaggl.OpenGL.glEnableClientState(32888);
                    var9++;
                    continue L16;
                  }
                }
              } else {
                if (var4 < ((jp) this).field_Rc) {
                  var9 = var4;
                  L17: while (true) {
                    if (var9 >= ((jp) this).field_Rc) {
                      ((jp) this).field_Rc = var4;
                      break L15;
                    } else {
                      jaggl.OpenGL.glClientActiveTexture(33984 - -var9);
                      jaggl.OpenGL.glDisableClientState(32888);
                      var9++;
                      continue L17;
                    }
                  }
                } else {
                  break L15;
                }
              }
            }
            return;
          } else {
            var9_ref_qma = var18[var8];
            var10 = ((jp) this).field_Pc[var8];
            var11 = 0;
            var12 = var10.b((byte) 125);
            var13 = var10.c(2);
            var10.a((byte) 54);
            var15 = 0;
            L18: while (true) {
              if (var9_ref_qma.a(86) <= var15) {
                var8++;
                continue L0;
              } else {
                L19: {
                  var16 = var9_ref_qma.b(var15, 71);
                  if (pb.field_k == var16) {
                    jaggl.OpenGL.glVertexPointer(3, 5126, var12, (long)var11 + var13);
                    var7 = 1;
                    break L19;
                  } else {
                    if (var16 != pb.field_g) {
                      if (pb.field_d != var16) {
                        if (var16 != pb.field_e) {
                          if (var16 == pb.field_l) {
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(var4 + 33984);
                            jaggl.OpenGL.glTexCoordPointer(2, 5126, var12, (long)var11 + var13);
                            break L19;
                          } else {
                            if (pb.field_h == var16) {
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(33984 - -var4);
                              jaggl.OpenGL.glTexCoordPointer(3, 5126, var12, var13 - -(long)var11);
                              break L19;
                            } else {
                              if (var16 == pb.field_b) {
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(33984 - -var4);
                                jaggl.OpenGL.glTexCoordPointer(4, 5126, var12, var13 - -(long)var11);
                                break L19;
                              } else {
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
                        jaggl.OpenGL.glColorPointer(4, 5121, var12, var13 - -(long)var11);
                        var5 = 1;
                        break L19;
                      }
                    } else {
                      var6 = 1;
                      jaggl.OpenGL.glNormalPointer(5126, var12, (long)var11 + var13);
                      break L19;
                    }
                  }
                }
                var11 = var11 + var16.field_i;
                var15++;
                continue L18;
              }
            }
          }
        }
    }

    final void s(byte param0) {
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (param0 == -39) {
          L0: {
            if (to.field_o != ((jp) this).field_fc) {
              if (((jp) this).field_fc == oj.field_b) {
                jaggl.OpenGL.glBlendFunc(1, 1);
                break L0;
              } else {
                if (ub.field_e == ((jp) this).field_fc) {
                  jaggl.OpenGL.glBlendFunc(774, 1);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              jaggl.OpenGL.glBlendFunc(770, 771);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Oc = 4;
    }
}
