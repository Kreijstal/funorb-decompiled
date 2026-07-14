/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends aw {
    private jaggl.OpenGL field_Yc;
    private jn field_Kc;
    private jn field_Gc;
    private jn field_Zc;
    private jn field_Xc;
    private jn field_Vc;
    private jn field_Pc;
    private jn field_Fc;
    private boolean field_Dc;
    private boolean field_Lc;
    private sc[] field_zc;
    jaggl.MapBuffer field_Qc;
    private int field_ad;
    private long field_Cc;
    private boolean field_Sc;
    private boolean field_Tc;
    private boolean field_Uc;
    jaggl.MapBuffer field_Bc;
    int[] field_Hc;
    boolean field_Jc;
    private boolean field_bd;
    int field_Ec;
    boolean field_Nc;
    private boolean field_Ic;
    boolean field_Mc;
    private String field_Rc;
    boolean field_Ac;
    private String field_Wc;
    private int field_Oc;

    final void Y(int param0) {
        int var2 = 0;
        ko var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        ((on) this).k(1);
        var2 = 0;
        L0: while (true) {
          if (((on) this).field_ub <= var2) {
            L1: while (true) {
              if (var2 >= ((on) this).field_Ab) {
                L2: {
                  if (param0 < -83) {
                    break L2;
                  } else {
                    ((on) this).field_Ac = true;
                    break L2;
                  }
                }
                super.Y(-120);
                return;
              } else {
                jaggl.OpenGL.glDisable(16386 + var2);
                var2++;
                continue L1;
              }
            }
          } else {
            var3 = ((on) this).field_pb[var2];
            var4 = var3.c((byte) 50);
            var5 = 16386 + var2;
            var6 = var3.a(0) / 255.0f;
            fv.field_v[0] = (float)var3.a((byte) 97);
            fv.field_v[1] = (float)var3.d((byte) 109);
            fv.field_v[2] = (float)var3.c(true);
            fv.field_v[3] = 1.0f;
            jaggl.OpenGL.glLightfv(var5, 4611, fv.field_v, 0);
            fv.field_v[0] = var6 * (float)eb.a(var4 >> -183825072, 255);
            fv.field_v[3] = 1.0f;
            fv.field_v[1] = (float)eb.a(var4 >> 1417919400, 255) * var6;
            fv.field_v[2] = var6 * (float)eb.a(255, var4);
            jaggl.OpenGL.glLightfv(var5, 4609, fv.field_v, 0);
            jaggl.OpenGL.glLightf(var5, 4617, 1.0f / (float)(var3.c(0) * var3.c(0)));
            jaggl.OpenGL.glEnable(var5);
            var2++;
            continue L0;
          }
        }
    }

    final Object a(java.awt.Canvas param0, int param1) {
        long var3 = ((on) this).field_Yc.prepareSurface(param0);
        if (param1 != 3) {
            Object var5 = null;
            ru discarded$0 = ((on) this).a((io) null, (iw) null, -119, -113, (byte) -97);
        }
        if (!((var3 ^ -1L) != 0L)) {
            throw new RuntimeException();
        }
        return (Object) (Object) new Long(var3);
    }

    final void a(byte param0, int param1, boolean param2, boolean param3, mi param4) {
        jaggl.OpenGL.glTexEnvi(8960, 34176 - -param1, kq.a(81, param4));
        int var6 = 45 / ((16 - param0) / 56);
        if (param2) {
            jaggl.OpenGL.glTexEnvi(8960, param1 + 34192, param3 ? 771 : 770);
        } else {
            jaggl.OpenGL.glTexEnvi(8960, param1 + 34192, !param3 ? 768 : 769);
        }
    }

    final void db(int param0) {
        fv.field_v[3] = 1.0f;
        fv.field_v[1] = ((on) this).field_jb * ((on) this).field_S;
        fv.field_v[0] = ((on) this).field_S * ((on) this).field_J;
        fv.field_v[2] = ((on) this).field_Xb * ((on) this).field_S;
        jaggl.OpenGL.glLightfv(16384, 4609, fv.field_v, 0);
        fv.field_v[3] = 1.0f;
        fv.field_v[1] = -((on) this).field_hb * ((on) this).field_jb;
        fv.field_v[0] = ((on) this).field_J * -((on) this).field_hb;
        fv.field_v[2] = ((on) this).field_Xb * -((on) this).field_hb;
        jaggl.OpenGL.glLightfv(16385, 4609, fv.field_v, param0);
    }

    final void X(int param0) {
        jaggl.OpenGL.glTexEnvi(8960, 34162, rq.a(-9267, ((on) this).field_B[((on) this).field_mc]));
        if (param0 >= -80) {
            ((on) this).b(true);
        }
    }

    final synchronized void a(int param0, long param1) {
        ms var4 = new ms();
        if (param0 != 33984) {
            Object var5 = null;
            ((on) this).SA(-105, -54, 124, -38, (int[]) null, -85, -29);
        }
        var4.field_h = param1;
        ((on) this).field_Fc.a(var4, (byte) 39);
    }

    final void i(byte param0) {
        L0: {
          L1: {
            if (!((on) this).field_Rb) {
              break L1;
            } else {
              if (!((on) this).field_Bb) {
                break L1;
              } else {
                if (-1 >= (((on) this).field_Kb ^ -1)) {
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
          if (param0 == -119) {
            break L2;
          } else {
            ((on) this).field_Uc = true;
            break L2;
          }
        }
    }

    final synchronized void f(int param0) {
        int var2 = 0;
        int var4 = 0;
        ge var5 = null;
        ge var6 = null;
        ge var7 = null;
        ge var8 = null;
        ge var9 = null;
        ge var9_ref = null;
        ms var10 = null;
        ms var11 = null;
        ge var12 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((on) this).field_Gc.a((byte) -100)) {
            L1: {
              if ((var2 ^ -1) < -1) {
                jaggl.OpenGL.glDeleteBuffersARB(var2, gw.field_A, 0);
                var2 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: while (true) {
              if (((on) this).field_Zc.a((byte) -105)) {
                L3: {
                  if (var2 > 0) {
                    jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
                    var2 = 0;
                    L4: while (true) {
                      if (((on) this).field_Xc.a((byte) -73)) {
                        break L3;
                      } else {
                        var7 = (ge) (Object) ((on) this).field_Xc.c(9);
                        var2++;
                        gw.field_A[var2] = var7.field_m;
                        if (1000 != var2) {
                          continue L4;
                        } else {
                          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                          var2 = 0;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L5: while (true) {
                      if (((on) this).field_Xc.a((byte) -73)) {
                        break L3;
                      } else {
                        var7 = (ge) (Object) ((on) this).field_Xc.c(9);
                        var2++;
                        gw.field_A[var2] = var7.field_m;
                        if (1000 != var2) {
                          continue L5;
                        } else {
                          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                          var2 = 0;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (-1 > (var2 ^ -1)) {
                    jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                    var2 = 0;
                    L7: while (true) {
                      if (((on) this).field_Vc.a((byte) -123)) {
                        break L6;
                      } else {
                        var8 = (ge) (Object) ((on) this).field_Vc.c(9);
                        var2++;
                        gw.field_A[var2] = (int)var8.field_h;
                        ((on) this).field_pc = ((on) this).field_pc - var8.field_m;
                        if (var2 != -1001) {
                          continue L7;
                        } else {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
                          var2 = 0;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    L8: while (true) {
                      if (((on) this).field_Vc.a((byte) -123)) {
                        break L6;
                      } else {
                        var8 = (ge) (Object) ((on) this).field_Vc.c(9);
                        var2++;
                        gw.field_A[var2] = (int)var8.field_h;
                        ((on) this).field_pc = ((on) this).field_pc - var8.field_m;
                        if ((var2 ^ -1) != -1001) {
                          continue L8;
                        } else {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
                          var2 = 0;
                          continue L8;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (-1 < var2) {
                    jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
                    var2 = 0;
                    L10: while (true) {
                      if (!((on) this).field_Kc.a((byte) -88)) {
                        var9_ref = (ge) (Object) ((on) this).field_Kc.c(9);
                        jaggl.OpenGL.glDeleteLists((int)var9_ref.field_h, var9_ref.field_m);
                        continue L10;
                      } else {
                        L11: while (true) {
                          if (((on) this).field_Pc.a((byte) -68)) {
                            L12: while (true) {
                              if (!((on) this).field_Fc.a((byte) -95)) {
                                var11 = ((on) this).field_Fc.c(9);
                                jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
                                continue L12;
                              } else {
                                L13: while (true) {
                                  if (!((on) this).field_Kc.a((byte) -68)) {
                                    var12 = (ge) (Object) ((on) this).field_Kc.c(9);
                                    jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
                                    continue L13;
                                  } else {
                                    if ((((on) this).h(64) ^ -1) >= -100663297) {
                                      break L9;
                                    } else {
                                      if (wq.a(-117) <= 60000L + ((on) this).field_Cc) {
                                        break L9;
                                      } else {
                                        System.gc();
                                        ((on) this).field_Cc = wq.a(-39);
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var10 = ((on) this).field_Pc.c(9);
                            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
                            continue L11;
                          }
                        }
                      }
                    }
                  } else {
                    L14: while (true) {
                      if (((on) this).field_Kc.a((byte) -88)) {
                        L15: while (true) {
                          if (!((on) this).field_Pc.a((byte) -68)) {
                            var10 = ((on) this).field_Pc.c(9);
                            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
                            continue L15;
                          } else {
                            L16: while (true) {
                              if (((on) this).field_Fc.a((byte) -95)) {
                                L17: while (true) {
                                  if (!((on) this).field_Kc.a((byte) -68)) {
                                    var12 = (ge) (Object) ((on) this).field_Kc.c(9);
                                    jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
                                    continue L17;
                                  } else {
                                    if ((((on) this).h(64) ^ -1) >= -100663297) {
                                      break L9;
                                    } else {
                                      if (wq.a(-117) <= 60000L + ((on) this).field_Cc) {
                                        break L9;
                                      } else {
                                        System.gc();
                                        ((on) this).field_Cc = wq.a(-39);
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var11 = ((on) this).field_Fc.c(9);
                                jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
                                continue L16;
                              }
                            }
                          }
                        }
                      } else {
                        var9 = (ge) (Object) ((on) this).field_Kc.c(9);
                        jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
                        continue L14;
                      }
                    }
                  }
                }
                super.f(param0);
                return;
              } else {
                var6 = (ge) (Object) ((on) this).field_Zc.c(9);
                var2++;
                gw.field_A[var2] = (int)var6.field_h;
                ((on) this).field_Cb = ((on) this).field_Cb - var6.field_m;
                if (-1001 != (var2 ^ -1)) {
                  continue L2;
                } else {
                  jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
                  var2 = 0;
                  continue L2;
                }
              }
            }
          } else {
            var5 = (ge) (Object) ((on) this).field_Gc.c(9);
            var2++;
            gw.field_A[var2] = (int)var5.field_h;
            ((on) this).field_o = ((on) this).field_o - var5.field_m;
            if ((var2 ^ -1) != -1001) {
              continue L0;
            } else {
              jaggl.OpenGL.glDeleteBuffersARB(var2, gw.field_A, 0);
              var2 = 0;
              continue L0;
            }
          }
        }
    }

    final ru a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, iw param7) {
        sa var10 = null;
        L0: {
          if (param6 <= -61) {
            break L0;
          } else {
            ((on) this).a(66, false);
            break L0;
          }
        }
        L1: {
          if (((on) this).field_Ic) {
            break L1;
          } else {
            L2: {
              if (!rm.a(param1, -116)) {
                break L2;
              } else {
                if (!rm.a(param5, -122)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (!((on) this).field_bd) {
              var10 = new sa((on) this, param7, io.field_d, hn.a(false, param1), hn.a(false, param5));
              var10.a(0, param7, param5, 0, 14137, param0, param1, param4, param3);
              return (ru) (Object) var10;
            } else {
              return (ru) (Object) new or((on) this, param7, param1, param5, param4, param0, param3);
            }
          }
        }
        return (ru) (Object) new sa((on) this, param7, param1, param5, param2, param4, param0, param3);
    }

    final void b(boolean param0) {
        ((on) this).field_Tb = (float)(-((on) this).field_Nb + ((on) this).field_Yb);
        ((on) this).field_E = ((on) this).field_Tb - (float)((on) this).field_Kb;
        if (((on) this).field_E < (float)((on) this).field_oc) {
            ((on) this).field_E = (float)((on) this).field_oc;
        }
        jaggl.OpenGL.glFogf(2915, ((on) this).field_E);
        jaggl.OpenGL.glFogf(2916, ((on) this).field_Tb);
        fv.field_v[1] = (float)eb.a(65280, ((on) this).field_C) / 65280.0f;
        if (!param0) {
            return;
        }
        fv.field_v[2] = (float)eb.a(255, ((on) this).field_C) / 255.0f;
        fv.field_v[0] = (float)eb.a(((on) this).field_C, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, fv.field_v, 0);
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(16711680 & param0) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 1737369080) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void i(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            ((on) this).a(-111, -93, -40, (ck) null);
        }
        jaggl.OpenGL.glViewport(((on) this).field_r, ((on) this).field_y, ((on) this).field_rb, ((on) this).field_Sb);
    }

    final boolean a(byte param0, io param1, iw param2) {
        int var4 = -85 / ((70 - param0) / 42);
        return true;
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
            jaggl.OpenGL.glDisable(32925);
        } else {
            jaggl.OpenGL.glEnable(32925);
        }
        if (param0 != 1) {
            Object var4 = null;
            ru discarded$0 = ((on) this).a((iw) null, -18, -125, 65, (byte[]) null, (byte) -115, -5, true);
        }
    }

    final void I(int param0) {
        if (param0 != 0) {
            ((on) this).field_Ic = false;
        }
        if (!((on) this).field_Z) {
            jaggl.OpenGL.glDisable(16384);
            jaggl.OpenGL.glDisable(16385);
        } else {
            jaggl.OpenGL.glEnable(16384);
            jaggl.OpenGL.glEnable(16385);
        }
    }

    final void a(int param0, hq param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hu var10 = null;
        sc var11 = null;
        int var12 = 0;
        int var13 = 0;
        long var14 = 0L;
        int var16 = 0;
        ls var17 = null;
        int var18 = 0;
        hu[] var19 = null;
        int stackIn_23_0 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_49_0 = null;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        var18 = Sumoblitz.field_L ? 1 : 0;
        var19 = ((fq) (Object) param1).field_g;
        var4 = 0;
        var6 = 82 / ((param0 - 71) / 45);
        var5 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        L0: while (true) {
          if (var9 >= var19.length) {
            L1: {
              if (((on) this).field_Lc) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L1;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_23_0 != var8) {
                break L2;
              } else {
                L3: {
                  if (var8 != 0) {
                    jaggl.OpenGL.glEnableClientState(32884);
                    break L3;
                  } else {
                    jaggl.OpenGL.glDisableClientState(32884);
                    break L3;
                  }
                }
                L4: {
                  stackOut_27_0 = this;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (var8 == 0) {
                    stackOut_29_0 = this;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L4;
                  } else {
                    stackOut_28_0 = this;
                    stackOut_28_1 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    break L4;
                  }
                }
                ((on) this).field_Lc = stackIn_30_1 != 0;
                break L2;
              }
            }
            L5: {
              if (var7 != 0) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L5;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L5;
              }
            }
            L6: {
              stackOut_34_0 = stackIn_34_0;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (((on) this).field_Sc) {
                stackOut_36_0 = stackIn_36_0;
                stackOut_36_1 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L6;
              } else {
                stackOut_35_0 = stackIn_35_0;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L6;
              }
            }
            L7: {
              if (stackIn_37_0 == stackIn_37_1) {
                break L7;
              } else {
                L8: {
                  if (var7 == 0) {
                    jaggl.OpenGL.glDisableClientState(32885);
                    break L8;
                  } else {
                    jaggl.OpenGL.glEnableClientState(32885);
                    break L8;
                  }
                }
                L9: {
                  stackOut_41_0 = this;
                  stackIn_43_0 = stackOut_41_0;
                  stackIn_42_0 = stackOut_41_0;
                  if (var7 == 0) {
                    stackOut_43_0 = this;
                    stackOut_43_1 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    break L9;
                  } else {
                    stackOut_42_0 = this;
                    stackOut_42_1 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    stackIn_44_1 = stackOut_42_1;
                    break L9;
                  }
                }
                ((on) this).field_Sc = stackIn_44_1 != 0;
                break L7;
              }
            }
            L10: {
              if (var5 == (((on) this).field_Tc ? 1 : 0)) {
                break L10;
              } else {
                L11: {
                  if (var5 != 0) {
                    jaggl.OpenGL.glEnableClientState(32886);
                    break L11;
                  } else {
                    jaggl.OpenGL.glDisableClientState(32886);
                    break L11;
                  }
                }
                L12: {
                  stackOut_49_0 = this;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_50_0 = stackOut_49_0;
                  if (var5 == 0) {
                    stackOut_51_0 = this;
                    stackOut_51_1 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    break L12;
                  } else {
                    stackOut_50_0 = this;
                    stackOut_50_1 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_52_1 = stackOut_50_1;
                    break L12;
                  }
                }
                ((on) this).field_Tc = stackIn_52_1 != 0;
                break L10;
              }
            }
            L13: {
              if (((on) this).field_ad < var4) {
                var9 = ((on) this).field_ad;
                L14: while (true) {
                  if (var4 <= var9) {
                    ((on) this).field_ad = var4;
                    break L13;
                  } else {
                    jaggl.OpenGL.glClientActiveTexture(var9 + 33984);
                    jaggl.OpenGL.glEnableClientState(32888);
                    var9++;
                    continue L14;
                  }
                }
              } else {
                if (var4 < ((on) this).field_ad) {
                  var9 = var4;
                  L15: while (true) {
                    if (var9 >= ((on) this).field_ad) {
                      ((on) this).field_ad = var4;
                      break L13;
                    } else {
                      jaggl.OpenGL.glClientActiveTexture(var9 + 33984);
                      jaggl.OpenGL.glDisableClientState(32888);
                      var9++;
                      continue L15;
                    }
                  }
                } else {
                  break L13;
                }
              }
            }
            return;
          } else {
            var10 = var19[var9];
            var11 = ((on) this).field_zc[var9];
            var12 = 0;
            var13 = var11.g(34962);
            var14 = var11.c(-24168);
            var11.e(1175993800);
            var16 = 0;
            L16: while (true) {
              if (var10.a(44115) <= var16) {
                var9++;
                continue L0;
              } else {
                L17: {
                  var17 = var10.a(-80, var16);
                  if (var17 == ls.field_b) {
                    jaggl.OpenGL.glVertexPointer(3, 5126, var13, var14 - -(long)var12);
                    var8 = 1;
                    break L17;
                  } else {
                    if (ls.field_c == var17) {
                      var7 = 1;
                      jaggl.OpenGL.glNormalPointer(5126, var13, (long)var12 + var14);
                      break L17;
                    } else {
                      if (var17 != ls.field_g) {
                        if (ls.field_j == var17) {
                          var4++;
                          jaggl.OpenGL.glClientActiveTexture(33984 + var4);
                          jaggl.OpenGL.glTexCoordPointer(1, 5126, var13, var14 - -(long)var12);
                          break L17;
                        } else {
                          if (var17 == ls.field_e) {
                            var4++;
                            jaggl.OpenGL.glClientActiveTexture(33984 + var4);
                            jaggl.OpenGL.glTexCoordPointer(2, 5126, var13, var14 + (long)var12);
                            break L17;
                          } else {
                            if (ls.field_d != var17) {
                              if (var17 != ls.field_a) {
                                break L17;
                              } else {
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(33984 + var4);
                                jaggl.OpenGL.glTexCoordPointer(4, 5126, var13, (long)var12 + var14);
                                break L17;
                              }
                            } else {
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(33984 + var4);
                              jaggl.OpenGL.glTexCoordPointer(3, 5126, var13, var14 - -(long)var12);
                              break L17;
                            }
                          }
                        }
                      } else {
                        jaggl.OpenGL.glColorPointer(4, 5121, var13, var14 + (long)var12);
                        var5 = 1;
                        break L17;
                      }
                    }
                  }
                }
                var12 = var12 + var17.field_k;
                var16++;
                continue L16;
              }
            }
          }
        }
    }

    final void q(byte param0) {
        if (param0 >= -74) {
            ((on) this).field_ad = 99;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, rq.a(-9267, ((on) this).field_K[((on) this).field_mc]));
    }

    final void b() {
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        ((on) this).L(-25);
        ((on) this).a((ed) null, 126);
        ((on) this).e(0, 13);
        ((on) this).k(1);
        jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
        jaggl.OpenGL.glRasterPos2i(param0, param1);
        jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((on) this).field_Ec, param4, param5);
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
    }

    final boolean a() {
        return false;
    }

    final void V(int param0) {
        jaggl.OpenGL.glMatrixMode(5890);
        if (param0 != 26803) {
            ((on) this).field_Zc = null;
        }
        if (ar.field_L != ((on) this).field_wb[((on) this).field_mc]) {
            jaggl.OpenGL.glLoadMatrixf(((on) this).field_V[((on) this).field_mc].b(-107, pq.field_y), 0);
        } else {
            jaggl.OpenGL.glLoadIdentity();
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void a(vc param0) {
    }

    final ef a(int param0, byte param1, int[][] param2, boolean param3) {
        int var5 = 57 % ((-23 - param1) / 48);
        return (ef) (Object) new rc((on) this, param0, param3, param2);
    }

    on(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, ki param4, int param5) {
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
                    ((on) this).field_Kc = new jn();
                    ((on) this).field_Gc = new jn();
                    ((on) this).field_Zc = new jn();
                    ((on) this).field_Xc = new jn();
                    ((on) this).field_Vc = new jn();
                    ((on) this).field_Pc = new jn();
                    ((on) this).field_Fc = new jn();
                    ((on) this).field_zc = new sc[16];
                    ((on) this).field_Qc = new jaggl.MapBuffer();
                    ((on) this).field_Bc = new jaggl.MapBuffer();
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((on) this).field_Yc = param0;
                        boolean discarded$3 = ((on) this).field_Yc.b();
                        ((on) this).field_Wc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                        ((on) this).field_Rc = jaggl.OpenGL.glGetString(7937).toLowerCase();
                        if (((on) this).field_Wc.indexOf("microsoft") != -1) {
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
                        if (-1 != ((on) this).field_Wc.indexOf("brian paul")) {
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
                        if (-1 == ((on) this).field_Wc.indexOf("mesa")) {
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
                        var9 = cn.a(' ', var20.replace('.', ' '), -27224);
                        if (var9.length < 2) {
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
                        var10_int = no.a((byte) -128, (CharSequence) (Object) var9[0]);
                        var11_int = no.a((byte) -128, (CharSequence) (Object) var9[1]);
                        ((on) this).field_Oc = var11_int + 10 * var10_int;
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
                        if (-13 >= (((on) this).field_Oc ^ -1)) {
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
                        if (((on) this).field_Yc.a("GL_ARB_multitexture")) {
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
                        if (((on) this).field_Yc.a("GL_ARB_texture_env_combine")) {
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
                        ((on) this).field_cc = var26[0];
                        if (2 <= ((on) this).field_cc) {
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
                        ((on) this).field_bc = 8;
                        ((on) this).field_Nc = ((on) this).field_Yc.a("GL_ARB_vertex_buffer_object");
                        boolean discarded$4 = ((on) this).field_Yc.a("GL_ARB_multisample");
                        ((on) this).field_bd = ((on) this).field_Yc.a("GL_ARB_texture_rectangle");
                        ((on) this).field_W = ((on) this).field_Yc.a("GL_ARB_texture_cube_map");
                        ((on) this).field_Ic = ((on) this).field_Yc.a("GL_ARB_texture_non_power_of_two");
                        ((on) this).field_Eb = ((on) this).field_Yc.a("GL_EXT_texture3D");
                        ((on) this).field_Jc = ((on) this).field_Yc.a("GL_ARB_vertex_shader");
                        ((on) this).field_Ac = ((on) this).field_Yc.a("GL_ARB_vertex_program");
                        ((on) this).field_Mc = ((on) this).field_Yc.a("GL_ARB_fragment_shader");
                        boolean discarded$5 = ((on) this).field_Yc.a("GL_ARB_fragment_program");
                        ((on) this).field_Hc = new int[((on) this).field_cc];
                        stackOut_18_0 = this;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (jaclib.memory.Stream.b()) {
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
                        stackOut_19_1 = 5121;
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
                        stackOut_20_1 = 33639;
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
                        ((on) this).field_Ec = stackIn_21_1;
                        if ((((on) this).field_Rc.indexOf("radeon") ^ -1) == 0) {
                            statePc = 52;
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
                        var14_array = cn.a(' ', ((on) this).field_Rc.replace('/', ' '), -27224);
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
                            statePc = 43;
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
                        if (0 < var21_ref.length()) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (120 != var21_ref.charAt(0)) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (3 > var21_ref.length()) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var31 = (CharSequence) (Object) var21_ref.substring(1, 3);
                        if (!jf.a(-13181, var31)) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16 = var21_ref.substring(1);
                        var13 = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var16.equals((Object) (Object) "hd")) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 41 : 58);
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
                        statePc = (stateCaught_33 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
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
                        statePc = (stateCaught_35 instanceof Exception ? 41 : 58);
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
                        statePc = (stateCaught_36 instanceof Exception ? 41 : 58);
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
                        statePc = (stateCaught_37 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var32 = (CharSequence) (Object) var16.substring(0, 4);
                        if (!jf.a(-13181, var32)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var33 = (CharSequence) (Object) var16.substring(0, 4);
                        var11_int = no.a((byte) -127, var33);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof Exception ? 41 : 58);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
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
                        statePc = 58;
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
                        statePc = 58;
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
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var11_int > -7001) {
                            statePc = 48;
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
                        if (-8000 < var11_int) {
                            statePc = 48;
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
                        ((on) this).field_Nc = false;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var11_int < 7000) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var11_int > 9250) {
                            statePc = 51;
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
                        ((on) this).field_Eb = false;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((on) this).field_bd = ((on) this).field_bd & ((on) this).field_Yc.a("GL_ARB_half_float_pixel");
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
                        if (-1 != ((on) this).field_Wc.indexOf("intel")) {
                            statePc = 53;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (((on) this).field_Nc) {
                            statePc = 55;
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
                        statePc = 59;
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
                    ((on) this).a((byte) -98);
                    throw new RuntimeException("");
                }
                case 59: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void q(int param0) {
        if (((on) this).field_p) {
            jaggl.OpenGL.glEnable(2929);
        } else {
            jaggl.OpenGL.glDisable(2929);
        }
        if (param0 <= 19) {
            ((on) this).field_Fc = null;
        }
    }

    final void a(hr param0, boolean param1) {
    }

    final void J(int param0) {
        if (param0 != 0) {
            ((on) this).field_Oc = 37;
        }
    }

    final void a(int param0, mp param1) {
        int var3 = 0;
        if (param1 == lf.field_c) {
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
        } else {
            var3 = ka.a(param1, -116);
            jaggl.OpenGL.glTexGeni(8192, 9472, var3);
            jaggl.OpenGL.glEnable(3168);
            jaggl.OpenGL.glTexGeni(8193, 9472, var3);
            jaggl.OpenGL.glEnable(3169);
            jaggl.OpenGL.glTexGeni(8194, 9472, var3);
            jaggl.OpenGL.glEnable(3170);
        }
        if (param0 != 13754) {
            ((on) this).eb(122);
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        ge var4 = new ge(param1);
        var4.field_h = (long)param2;
        ((on) this).field_Gc.a((ms) (Object) var4, (byte) 39);
        if (param0 != -99) {
            ((on) this).GA(-33);
        }
    }

    final void ab(int param0) {
        fv.field_v[3] = 1.0f;
        fv.field_v[2] = ((on) this).field_T * ((on) this).field_Xb;
        fv.field_v[1] = ((on) this).field_T * ((on) this).field_jb;
        fv.field_v[0] = ((on) this).field_J * ((on) this).field_T;
        jaggl.OpenGL.glLightModelfv(2899, fv.field_v, 0);
        if (param0 != 7) {
            Object var3 = null;
            ((on) this).SA(-42, 12, 8, 123, (int[]) null, 81, 90);
        }
    }

    final ru a(io param0, iw param1, int param2, int param3, byte param4) {
        if (param4 > -99) {
            ((on) this).b();
        }
        if (!((on) this).field_Ic) {
            if (rm.a(param3, -124)) {
                // ifne L86
            }
            if (((on) this).field_bd) {
                return (ru) (Object) new or((on) this, param1, param0, param3, param2);
            }
            return (ru) (Object) new sa((on) this, param1, param0, hn.a(false, param3), hn.a(false, param2));
        }
        return (ru) (Object) new sa((on) this, param1, param0, param3, param2);
    }

    final void A(int param0) {
        if (((on) this).field_wc) {
            jaggl.OpenGL.glEnable(3089);
        } else {
            jaggl.OpenGL.glDisable(3089);
        }
        int var2 = 104 / ((0 - param0) / 55);
    }

    final void f(boolean param0) {
        if (param0) {
            return;
        }
        if (((on) this).field_I) {
            // ifne L28
            jaggl.OpenGL.glEnable(2896);
        } else {
            jaggl.OpenGL.glDisable(2896);
        }
    }

    final pv a(byte param0, boolean param1) {
        if (param0 != 51) {
            rq discarded$0 = ((on) this).d(83, -4);
        }
        return (pv) (Object) new sc((on) this, param1);
    }

    final void F(int param0) {
        jaggl.OpenGL.glScissor(((on) this).field_v + ((on) this).field_r, -((on) this).field_yc + (((on) this).field_y + ((on) this).field_Sb), ((on) this).field_F + -((on) this).field_v, ((on) this).field_yc + -((on) this).field_vb);
        if (param0 != 4) {
            ((on) this).field_Oc = -14;
        }
    }

    final void D(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = ((on) this).field_cc + -1;
        L0: while (true) {
          if ((var2 ^ -1) > -1) {
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
              if (-9 >= (var3 ^ -1)) {
                jaggl.OpenGL.glFogf(2914, 0.949999988079071f);
                jaggl.OpenGL.glFogi(2917, 9729);
                jaggl.OpenGL.glHint(3156, 4353);
                ((on) this).field_Yc.setSwapInterval(0);
                super.D(param0);
                return;
              } else {
                var4 = 16384 + var3;
                jaggl.OpenGL.glLightfv(var4, 4608, var6, 0);
                jaggl.OpenGL.glLightf(var4, 4615, 0.0f);
                jaggl.OpenGL.glLightf(var4, 4616, 0.0f);
                var3++;
                continue L1;
              }
            }
          } else {
            jaggl.OpenGL.glActiveTexture(33984 + var2);
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

    final synchronized void a(int param0, byte param1) {
        ms var3 = new ms();
        var3.field_h = (long)param0;
        if (param1 != -96) {
            float discarded$0 = ((on) this).b((byte) -39);
        }
        ((on) this).field_Pc.a(var3, (byte) 39);
    }

    final void c(int param0, int param1) {
        if (param1 < 83) {
            ((on) this).field_Jc = false;
        }
    }

    final void a(int param0, int param1, int param2, ck param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            ((on) this).field_Pc = null;
            break L0;
          }
        }
        L1: {
          if (param3 == tc.field_g) {
            var6 = 2 * param2;
            var5 = 1;
            break L1;
          } else {
            if (rv.field_b != param3) {
              if (np.field_h == param3) {
                var6 = 3 * param2;
                var5 = 4;
                break L1;
              } else {
                if (an.field_d == param3) {
                  var5 = 6;
                  var6 = param2 - -2;
                  break L1;
                } else {
                  if (fq.field_d != param3) {
                    var6 = param2;
                    var5 = 0;
                    break L1;
                  } else {
                    var5 = 5;
                    var6 = param2 - -2;
                    break L1;
                  }
                }
              }
            } else {
              var5 = 3;
              var6 = param2 + 1;
              break L1;
            }
          }
        }
        jaggl.OpenGL.glDrawArrays(var5, param0, var6);
    }

    final boolean a(io param0, iw param1, int param2) {
        if (param2 != 6) {
            ((on) this).field_Dc = false;
            return true;
        }
        return true;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 23) {
            return;
        }
        ge var4 = new ge(param0);
        var4.field_h = (long)param1;
        ((on) this).field_Zc.a((ms) (Object) var4, (byte) 39);
    }

    final void x(int param0) {
        this.t((byte) 68);
        if (param0 != 0) {
            ((on) this).field_Gc = null;
        }
    }

    final cr e(int param0, boolean param1) {
        if (param0 != 3) {
            ef discarded$0 = ((on) this).a(-106, (byte) -119, (int[][]) null, false);
        }
        return (cr) (Object) new ju((on) this, io.field_k, param1);
    }

    final void r(int param0) {
        fv.field_v[3] = (float)(((on) this).field_Ub >>> 1960188920) / 255.0f;
        fv.field_v[2] = (float)eb.a(255, ((on) this).field_Ub) / 255.0f;
        fv.field_v[0] = (float)eb.a(16711680, ((on) this).field_Ub) / 16711680.0f;
        fv.field_v[param0] = (float)eb.a(((on) this).field_Ub, 65280) / 65280.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, fv.field_v, 0);
    }

    final void a(int param0, boolean param1, byte param2, mi param3) {
        jaggl.OpenGL.glTexEnvi(8960, 34184 + param0, kq.a(127, param3));
        jaggl.OpenGL.glTexEnvi(8960, param0 + 34200, !param1 ? 770 : 771);
        int var5 = -37 % ((param2 - 1) / 45);
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        if (param2 != 0) {
            ((on) this).s(30);
        }
        Long var4 = (Long) param1;
        ((on) this).field_Yc.releaseSurface(param0, var4.longValue());
    }

    final nr a(int param0, int param1) {
        return null;
    }

    final float b(byte param0) {
        if (param0 < 125) {
            ((on) this).field_Yc = null;
        }
        return 0.0f;
    }

    final void l(byte param0) {
        int var2 = ((on) this).field_Hc[((on) this).field_mc];
        if (!(0 == var2)) {
            ((on) this).field_Hc[((on) this).field_mc] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
        if (param0 != 9) {
            ((on) this).field_bd = false;
        }
    }

    final hq a(hu[] param0, byte param1) {
        if (param1 < 6) {
            ((on) this).field_Kc = null;
        }
        return (hq) (Object) new fq(param0);
    }

    final ru a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        sa var9 = null;
        L0: {
          if (param4 <= -41) {
            break L0;
          } else {
            ((on) this).l((byte) 14);
            break L0;
          }
        }
        L1: {
          if (((on) this).field_Ic) {
            break L1;
          } else {
            L2: {
              if (!rm.a(param3, -118)) {
                break L2;
              } else {
                if (!rm.a(param6, -113)) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (!((on) this).field_bd) {
              var9 = new sa((on) this, nl.field_p, io.field_g, hn.a(false, param3), hn.a(false, param6));
              var9.a(param6, false, param5, param3, param1, param2, 0, 0);
              return (ru) (Object) var9;
            } else {
              return (ru) (Object) new or((on) this, param3, param6, param2, param5, param1);
            }
          }
        }
        return (ru) (Object) new sa((on) this, param3, param6, param0, param2, param5, param1);
    }

    final void p(byte param0) {
        if (param0 != -4) {
            return;
        }
        if (((on) this).field_ob) {
            jaggl.OpenGL.glEnable(3042);
        } else {
            jaggl.OpenGL.glDisable(3042);
        }
    }

    final ru a(iw param0, int param1, int param2, int param3, byte[] param4, byte param5, int param6, boolean param7) {
        int var9 = 0;
        sa var10 = null;
        L0: {
          var9 = 108 % ((50 - param5) / 44);
          if (((on) this).field_Ic) {
            break L0;
          } else {
            L1: {
              if (!rm.a(param1, -107)) {
                break L1;
              } else {
                if (!rm.a(param2, -111)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (!((on) this).field_bd) {
              var10 = new sa((on) this, param0, io.field_g, hn.a(false, param1), hn.a(false, param2));
              var10.a(param0, 0, (byte) 77, param6, param4, param2, param1, 0, param3);
              return (ru) (Object) var10;
            } else {
              return (ru) (Object) new or((on) this, param0, param1, param2, param4, param6, param3);
            }
          }
        }
        return (ru) (Object) new sa((on) this, param0, param1, param2, param7, param4, param6, param3);
    }

    final void cb(int param0) {
        if (param0 > -7) {
            ((on) this).field_zc = null;
        }
        jaggl.OpenGL.glActiveTexture(((on) this).field_mc + 33984);
    }

    final void E(int param0) {
        if (param0 >= -47) {
            ((on) this).I(-20);
        }
        jaggl.OpenGL.glLightfv(16384, 4611, ((on) this).field_G, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, ((on) this).field_U, 0);
    }

    final void a(int param0, int param1, pv param2) {
        ((on) this).field_zc[param0] = (sc) (Object) param2;
        if (param1 < 62) {
            ((on) this).A(-86);
        }
    }

    final void s(int param0) {
        if (!((on) this).field_u) {
            jaggl.OpenGL.glDisable(3008);
        } else {
            jaggl.OpenGL.glEnable(3008);
        }
        int var2 = -24 / ((-6 - param0) / 54);
    }

    final rq d(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((on) this).field_Pc = null;
            break L0;
          }
        }
        var3 = param1;
        if (var3 == 3) {
          return (rq) (Object) new pn((on) this, ((on) this).field_ab);
        } else {
          if (var3 == -5) {
            return (rq) (Object) new wj((on) this, ((on) this).field_ab, ((on) this).field_Mb);
          } else {
            if (-9 == var3) {
              return (rq) (Object) new ej((on) this, ((on) this).field_ab, ((on) this).field_Mb);
            } else {
              return super.d(0, param1);
            }
          }
        }
    }

    final void N(int param0) {
        ((on) this).field_Uc = false;
        if (param0 != -26911) {
            ((on) this).field_Wc = null;
        }
        this.t((byte) 68);
    }

    final void o(int param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(((on) this).field_A, 0);
        if (param0 != -2) {
            ((on) this).field_Wc = null;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void bb(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (((on) this).field_l == sr.field_a) {
            jaggl.OpenGL.glBlendFunc(770, 771);
        } else {
            if (((on) this).field_l == lh.field_n) {
                jaggl.OpenGL.glBlendFunc(1, 1);
            } else {
                if (!(gb.field_t != ((on) this).field_l)) {
                    jaggl.OpenGL.glBlendFunc(774, 1);
                }
            }
        }
        if (param0 != -19519) {
            ((on) this).field_ad = -66;
        }
    }

    final void eb(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 113) {
            break L0;
          } else {
            ((on) this).field_Tc = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((on) this).field_db) {
              break L2;
            } else {
              if (!((on) this).field_i) {
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

    private final void t(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (!((on) this).field_Dc) {
            break L0;
          } else {
            jaggl.OpenGL.glPopMatrix();
            break L0;
          }
        }
        if (param0 == 68) {
          L1: {
            if (!((on) this).field_s.a(-20011)) {
              if (!((on) this).field_Db) {
                jaggl.OpenGL.glLoadMatrixf(((on) this).field_Lb.b(-110, pq.field_y), 0);
                ((on) this).field_Dc = false;
                break L1;
              } else {
                jaggl.OpenGL.glLoadIdentity();
                ((on) this).field_Dc = false;
                break L1;
              }
            } else {
              L2: {
                if (!((on) this).field_Uc) {
                  jaggl.OpenGL.glLoadMatrixf(((on) this).field_Gb.b(-63, pq.field_y), 0);
                  ((on) this).field_Uc = true;
                  ((on) this).E(-114);
                  ((on) this).Y(param0 ^ -25);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!((on) this).field_Db) {
                jaggl.OpenGL.glPushMatrix();
                jaggl.OpenGL.glMultMatrixf(((on) this).field_Lb.b(-79, pq.field_y), 0);
                ((on) this).field_Dc = true;
                break L1;
              } else {
                ((on) this).field_Dc = false;
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void d() {
        super.d();
        if (!(((on) this).field_Yc == null)) {
            boolean discarded$0 = ((on) this).field_Yc.a();
            ((on) this).field_Yc.release();
            ((on) this).field_Yc = null;
        }
    }

    final void b(int param0, int param1) throws rf {
        ((on) this).field_Yc.swapBuffers();
    }

    final vc a(bu param0, nr param1) {
        return null;
    }

    final nh a(boolean param0, iw param1, int param2, int param3, byte[] param4, int param5) {
        if (!param0) {
            ((on) this).field_Wc = null;
        }
        return (nh) (Object) new go((on) this, param1, param5, param3, param2, param4);
    }

    final void e() {
        if (((on) this).field_rb <= 0) {
            if (!((((on) this).field_Sb ^ -1) < -1)) {
                return;
            }
        }
        int var1 = ((on) this).field_v;
        int var2 = ((on) this).field_F;
        int var3 = ((on) this).field_vb;
        int var4 = ((on) this).field_yc;
        ((on) this).m(-16088);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((on) this).d(false);
        ((on) this).c(false, -32);
        ((on) this).d(101, false);
        ((on) this).c(47, false);
        ((on) this).b(false, 4);
        ((on) this).a((ed) null, 120);
        ((on) this).a(-2, false, 50, false);
        ((on) this).h(40, 1);
        ((on) this).e(0, 13);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, ((on) this).field_rb, ((on) this).field_Sb, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        ((on) this).KA(var1, var3, var2, var4);
    }

    static {
    }
}
