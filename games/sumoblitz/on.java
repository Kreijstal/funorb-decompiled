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
            fv.field_v[0] = var6 * (float)eb.a(var4 >> 16, 255);
            fv.field_v[3] = 1.0f;
            fv.field_v[1] = (float)eb.a(var4 >> 8, 255) * var6;
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
        long var3_long = 0L;
        RuntimeException var3 = null;
        Object var5 = null;
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
            L1: {
              var3_long = ((on) this).field_Yc.prepareSurface(param0);
              if (param1 == 3) {
                break L1;
              } else {
                var5 = null;
                ru discarded$2 = ((on) this).a((io) null, (iw) null, -119, -113, (byte) -97);
                break L1;
              }
            }
            if (var3_long == -1L) {
              throw new RuntimeException();
            } else {
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
            stackOut_7_1 = new StringBuilder().append("on.EA(");
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return (Object) (Object) stackIn_6_0;
    }

    final void a(byte param0, int param1, boolean param2, boolean param3, mi param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              jaggl.OpenGL.glTexEnvi(8960, 34176 - -param1, kq.a(81, param4));
              var6_int = 45 / ((16 - param0) / 56);
              if (!param2) {
                L2: {
                  stackOut_5_0 = 8960;
                  stackOut_5_1 = param1 + 34192;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (param3) {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 769;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L2;
                  } else {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = 768;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L2;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_8_0, stackIn_8_1, stackIn_8_2);
                break L1;
              } else {
                L3: {
                  stackOut_1_0 = 8960;
                  stackOut_1_1 = param1 + 34192;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_3_1 = stackOut_1_1;
                  stackIn_2_0 = stackOut_1_0;
                  stackIn_2_1 = stackOut_1_1;
                  if (!param3) {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = 770;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    break L3;
                  } else {
                    stackOut_2_0 = stackIn_2_0;
                    stackOut_2_1 = stackIn_2_1;
                    stackOut_2_2 = 771;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_4_2 = stackOut_2_2;
                    break L3;
                  }
                }
                jaggl.OpenGL.glTexEnvi(stackIn_4_0, stackIn_4_1, stackIn_4_2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("on.ED(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
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
                if (((on) this).field_Kb >= 0) {
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
        ms var10 = null;
        ms var11 = null;
        ge var12 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          if (((on) this).field_Gc.a((byte) -100)) {
            L1: {
              if (var2 > 0) {
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
                        L5: {
                          var7 = (ge) (Object) ((on) this).field_Xc.c(9);
                          int incrementValue$5 = var2;
                          var2++;
                          gw.field_A[incrementValue$5] = var7.field_m;
                          if (1000 != var2) {
                            break L5;
                          } else {
                            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                            var2 = 0;
                            break L5;
                          }
                        }
                        continue L4;
                      }
                    }
                  } else {
                    L6: while (true) {
                      if (((on) this).field_Xc.a((byte) -73)) {
                        break L3;
                      } else {
                        L7: {
                          var7 = (ge) (Object) ((on) this).field_Xc.c(9);
                          int incrementValue$6 = var2;
                          var2++;
                          gw.field_A[incrementValue$6] = var7.field_m;
                          if (1000 != var2) {
                            break L7;
                          } else {
                            jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                            var2 = 0;
                            break L7;
                          }
                        }
                        continue L6;
                      }
                    }
                  }
                }
                L8: {
                  if (var2 <= 0) {
                    break L8;
                  } else {
                    jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                    var2 = 0;
                    break L8;
                  }
                }
                L9: while (true) {
                  if (((on) this).field_Vc.a((byte) -123)) {
                    L10: {
                      if (var2 <= 0) {
                        break L10;
                      } else {
                        jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
                        var2 = 0;
                        break L10;
                      }
                    }
                    L11: while (true) {
                      if (((on) this).field_Kc.a((byte) -88)) {
                        L12: while (true) {
                          if (((on) this).field_Pc.a((byte) -68)) {
                            L13: while (true) {
                              if (((on) this).field_Fc.a((byte) -95)) {
                                L14: while (true) {
                                  if (((on) this).field_Kc.a((byte) -68)) {
                                    L15: {
                                      if (((on) this).h(64) <= 100663296) {
                                        break L15;
                                      } else {
                                        if (wq.a(-117) <= 60000L + ((on) this).field_Cc) {
                                          break L15;
                                        } else {
                                          System.gc();
                                          ((on) this).field_Cc = wq.a(-39);
                                          break L15;
                                        }
                                      }
                                    }
                                    super.f(param0);
                                    return;
                                  } else {
                                    var12 = (ge) (Object) ((on) this).field_Kc.c(9);
                                    jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
                                    continue L14;
                                  }
                                }
                              } else {
                                var11 = ((on) this).field_Fc.c(9);
                                jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
                                continue L13;
                              }
                            }
                          } else {
                            var10 = ((on) this).field_Pc.c(9);
                            jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
                            continue L12;
                          }
                        }
                      } else {
                        var9 = (ge) (Object) ((on) this).field_Kc.c(9);
                        jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
                        continue L11;
                      }
                    }
                  } else {
                    L16: {
                      var8 = (ge) (Object) ((on) this).field_Vc.c(9);
                      int incrementValue$7 = var2;
                      var2++;
                      gw.field_A[incrementValue$7] = (int)var8.field_h;
                      ((on) this).field_pc = ((on) this).field_pc - var8.field_m;
                      if (var2 != 1000) {
                        break L16;
                      } else {
                        jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
                        var2 = 0;
                        break L16;
                      }
                    }
                    continue L9;
                  }
                }
              } else {
                L17: {
                  var6 = (ge) (Object) ((on) this).field_Zc.c(9);
                  int incrementValue$8 = var2;
                  var2++;
                  gw.field_A[incrementValue$8] = (int)var6.field_h;
                  ((on) this).field_Cb = ((on) this).field_Cb - var6.field_m;
                  if (var2 != 1000) {
                    break L17;
                  } else {
                    jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
                    var2 = 0;
                    break L17;
                  }
                }
                continue L2;
              }
            }
          } else {
            L18: {
              var5 = (ge) (Object) ((on) this).field_Gc.c(9);
              int incrementValue$9 = var2;
              var2++;
              gw.field_A[incrementValue$9] = (int)var5.field_h;
              ((on) this).field_o = ((on) this).field_o - var5.field_m;
              if (var2 != 1000) {
                break L18;
              } else {
                jaggl.OpenGL.glDeleteBuffersARB(var2, gw.field_A, 0);
                var2 = 0;
                break L18;
              }
            }
            continue L0;
          }
        }
    }

    final ru a(int param0, int param1, boolean param2, int param3, float[] param4, int param5, byte param6, iw param7) {
        RuntimeException var9 = null;
        sa var10 = null;
        sa stackIn_7_0 = null;
        or stackIn_10_0 = null;
        sa stackIn_12_0 = null;
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
        sa stackOut_11_0 = null;
        or stackOut_9_0 = null;
        sa stackOut_6_0 = null;
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
              if (param6 <= -61) {
                break L1;
              } else {
                ((on) this).a(66, false);
                break L1;
              }
            }
            L2: {
              if (((on) this).field_Ic) {
                break L2;
              } else {
                L3: {
                  if (!rm.a(param1, -116)) {
                    break L3;
                  } else {
                    if (!rm.a(param5, -122)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!((on) this).field_bd) {
                  var10 = new sa((on) this, param7, io.field_d, hn.a(false, param1), hn.a(false, param5));
                  var10.a(0, param7, param5, 0, 14137, param0, param1, param4, param3);
                  stackOut_11_0 = (sa) var10;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = new or((on) this, param7, param1, param5, param4, param0, param3);
                  stackIn_10_0 = stackOut_9_0;
                  return (ru) (Object) stackIn_10_0;
                }
              }
            }
            stackOut_6_0 = new sa((on) this, param7, param1, param5, param2, param4, param0, param3);
            stackIn_7_0 = stackOut_6_0;
            return (ru) (Object) stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var9;
            stackOut_13_1 = new StringBuilder().append("on.SC(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param7 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return (ru) (Object) stackIn_12_0;
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
        jaggl.OpenGL.glClearColor((float)(16711680 & param0) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 24) / 255.0f);
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
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
        int stackOut_0_0 = 0;
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
            var4_int = -85 / ((70 - param0) / 42);
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("on.HC(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0 != 0;
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
        RuntimeException var3 = null;
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
        int stackIn_24_0 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var18 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var19 = ((fq) (Object) param1).field_g;
            var4 = 0;
            var6 = 82 / ((param0 - 71) / 45);
            var5 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var19.length) {
                L2: {
                  if (((on) this).field_Lc) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L2;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L2;
                  }
                }
                L3: {
                  if (stackIn_24_0 != var8) {
                    break L3;
                  } else {
                    L4: {
                      if (var8 != 0) {
                        jaggl.OpenGL.glEnableClientState(32884);
                        break L4;
                      } else {
                        jaggl.OpenGL.glDisableClientState(32884);
                        break L4;
                      }
                    }
                    L5: {
                      stackOut_28_0 = this;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (var8 == 0) {
                        stackOut_30_0 = this;
                        stackOut_30_1 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L5;
                      } else {
                        stackOut_29_0 = this;
                        stackOut_29_1 = 1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        break L5;
                      }
                    }
                    ((on) this).field_Lc = stackIn_31_1 != 0;
                    break L3;
                  }
                }
                L6: {
                  if (var7 != 0) {
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    break L6;
                  } else {
                    stackOut_33_0 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    break L6;
                  }
                }
                L7: {
                  stackOut_35_0 = stackIn_35_0;
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_36_0 = stackOut_35_0;
                  if (((on) this).field_Sc) {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    break L7;
                  } else {
                    stackOut_36_0 = stackIn_36_0;
                    stackOut_36_1 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    break L7;
                  }
                }
                L8: {
                  if (stackIn_38_0 == stackIn_38_1) {
                    break L8;
                  } else {
                    L9: {
                      if (var7 == 0) {
                        jaggl.OpenGL.glDisableClientState(32885);
                        break L9;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32885);
                        break L9;
                      }
                    }
                    L10: {
                      stackOut_42_0 = this;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_43_0 = stackOut_42_0;
                      if (var7 == 0) {
                        stackOut_44_0 = this;
                        stackOut_44_1 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        break L10;
                      } else {
                        stackOut_43_0 = this;
                        stackOut_43_1 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        stackIn_45_1 = stackOut_43_1;
                        break L10;
                      }
                    }
                    ((on) this).field_Sc = stackIn_45_1 != 0;
                    break L8;
                  }
                }
                L11: {
                  if (var5 == (((on) this).field_Tc ? 1 : 0)) {
                    break L11;
                  } else {
                    L12: {
                      if (var5 != 0) {
                        jaggl.OpenGL.glEnableClientState(32886);
                        break L12;
                      } else {
                        jaggl.OpenGL.glDisableClientState(32886);
                        break L12;
                      }
                    }
                    L13: {
                      stackOut_50_0 = this;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_51_0 = stackOut_50_0;
                      if (var5 == 0) {
                        stackOut_52_0 = this;
                        stackOut_52_1 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        break L13;
                      } else {
                        stackOut_51_0 = this;
                        stackOut_51_1 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        break L13;
                      }
                    }
                    ((on) this).field_Tc = stackIn_53_1 != 0;
                    break L11;
                  }
                }
                L14: {
                  if (((on) this).field_ad < var4) {
                    var9 = ((on) this).field_ad;
                    L15: while (true) {
                      if (var4 <= var9) {
                        ((on) this).field_ad = var4;
                        break L14;
                      } else {
                        jaggl.OpenGL.glClientActiveTexture(var9 + 33984);
                        jaggl.OpenGL.glEnableClientState(32888);
                        var9++;
                        continue L15;
                      }
                    }
                  } else {
                    if (var4 < ((on) this).field_ad) {
                      var9 = var4;
                      L16: while (true) {
                        if (var9 >= ((on) this).field_ad) {
                          ((on) this).field_ad = var4;
                          break L14;
                        } else {
                          jaggl.OpenGL.glClientActiveTexture(var9 + 33984);
                          jaggl.OpenGL.glDisableClientState(32888);
                          var9++;
                          continue L16;
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                break L0;
              } else {
                var10 = var19[var9];
                var11 = ((on) this).field_zc[var9];
                var12 = 0;
                var13 = var11.g(34962);
                var14 = var11.c(-24168);
                var11.e(1175993800);
                var16 = 0;
                L17: while (true) {
                  if (var10.a(44115) <= var16) {
                    var9++;
                    continue L1;
                  } else {
                    L18: {
                      var17 = var10.a(-80, var16);
                      if (var17 == ls.field_b) {
                        jaggl.OpenGL.glVertexPointer(3, 5126, var13, var14 - -(long)var12);
                        var8 = 1;
                        break L18;
                      } else {
                        if (ls.field_c == var17) {
                          var7 = 1;
                          jaggl.OpenGL.glNormalPointer(5126, var13, (long)var12 + var14);
                          break L18;
                        } else {
                          if (var17 != ls.field_g) {
                            if (ls.field_j == var17) {
                              int incrementValue$4 = var4;
                              var4++;
                              jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$4);
                              jaggl.OpenGL.glTexCoordPointer(1, 5126, var13, var14 - -(long)var12);
                              break L18;
                            } else {
                              if (var17 == ls.field_e) {
                                int incrementValue$5 = var4;
                                var4++;
                                jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$5);
                                jaggl.OpenGL.glTexCoordPointer(2, 5126, var13, var14 + (long)var12);
                                break L18;
                              } else {
                                if (ls.field_d != var17) {
                                  if (var17 != ls.field_a) {
                                    break L18;
                                  } else {
                                    int incrementValue$6 = var4;
                                    var4++;
                                    jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$6);
                                    jaggl.OpenGL.glTexCoordPointer(4, 5126, var13, (long)var12 + var14);
                                    break L18;
                                  }
                                } else {
                                  int incrementValue$7 = var4;
                                  var4++;
                                  jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$7);
                                  jaggl.OpenGL.glTexCoordPointer(3, 5126, var13, var14 - -(long)var12);
                                  break L18;
                                }
                              }
                            }
                          } else {
                            jaggl.OpenGL.glColorPointer(4, 5121, var13, var14 + (long)var12);
                            var5 = 1;
                            break L18;
                          }
                        }
                      }
                    }
                    var12 = var12 + var17.field_k;
                    var16++;
                    continue L17;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var3;
            stackOut_66_1 = new StringBuilder().append("on.AE(").append(param0).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L19;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
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
        try {
            ((on) this).L(-25);
            ((on) this).a((ed) null, 126);
            ((on) this).e(0, 13);
            ((on) this).k(1);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, ((on) this).field_Ec, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "on.SA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
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
        int var5_int = 0;
        RuntimeException var5 = null;
        rc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5_int = 57 % ((-23 - param1) / 48);
            stackOut_0_0 = new rc((on) this, param0, param3, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("on.SD(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 41);
        }
        return (ef) (Object) stackIn_1_0;
    }

    on(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, ki param4, int param5) {
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
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var21_ref = null;
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
        try {
          L0: {
            try {
              L1: {
                L2: {
                  ((on) this).field_Yc = param0;
                  boolean discarded$5 = ((on) this).field_Yc.b();
                  ((on) this).field_Wc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                  ((on) this).field_Rc = jaggl.OpenGL.glGetString(7937).toLowerCase();
                  if (((on) this).field_Wc.indexOf("microsoft") != -1) {
                    break L2;
                  } else {
                    if (-1 != ((on) this).field_Wc.indexOf("brian paul")) {
                      break L2;
                    } else {
                      if (-1 == ((on) this).field_Wc.indexOf("mesa")) {
                        var20 = jaggl.OpenGL.glGetString(7938);
                        int discarded$6 = -27224;
                        var9 = cn.a(' ', var20.replace('.', ' '));
                        if (var9.length < 2) {
                          throw new RuntimeException("");
                        } else {
                          try {
                            L3: {
                              var10_int = no.a((byte) -128, (CharSequence) (Object) var9[0]);
                              var11_int = no.a((byte) -128, (CharSequence) (Object) var9[1]);
                              ((on) this).field_Oc = var11_int + 10 * var10_int;
                              break L3;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            var10 = (NumberFormatException) (Object) decompiledCaughtException;
                            throw new RuntimeException("");
                          }
                          if (((on) this).field_Oc >= 12) {
                            if (((on) this).field_Yc.a("GL_ARB_multitexture")) {
                              if (((on) this).field_Yc.a("GL_ARB_texture_env_combine")) {
                                var26 = new int[1];
                                jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                                ((on) this).field_cc = var26[0];
                                if (2 <= ((on) this).field_cc) {
                                  L4: {
                                    ((on) this).field_bc = 8;
                                    ((on) this).field_Nc = ((on) this).field_Yc.a("GL_ARB_vertex_buffer_object");
                                    boolean discarded$7 = ((on) this).field_Yc.a("GL_ARB_multisample");
                                    ((on) this).field_bd = ((on) this).field_Yc.a("GL_ARB_texture_rectangle");
                                    ((on) this).field_W = ((on) this).field_Yc.a("GL_ARB_texture_cube_map");
                                    ((on) this).field_Ic = ((on) this).field_Yc.a("GL_ARB_texture_non_power_of_two");
                                    ((on) this).field_Eb = ((on) this).field_Yc.a("GL_EXT_texture3D");
                                    ((on) this).field_Jc = ((on) this).field_Yc.a("GL_ARB_vertex_shader");
                                    ((on) this).field_Ac = ((on) this).field_Yc.a("GL_ARB_vertex_program");
                                    ((on) this).field_Mc = ((on) this).field_Yc.a("GL_ARB_fragment_shader");
                                    boolean discarded$8 = ((on) this).field_Yc.a("GL_ARB_fragment_program");
                                    ((on) this).field_Hc = new int[((on) this).field_cc];
                                    stackOut_18_0 = this;
                                    stackIn_20_0 = stackOut_18_0;
                                    stackIn_19_0 = stackOut_18_0;
                                    if (jaclib.memory.Stream.b()) {
                                      stackOut_20_0 = this;
                                      stackOut_20_1 = 33639;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      break L4;
                                    } else {
                                      stackOut_19_0 = this;
                                      stackOut_19_1 = 5121;
                                      stackIn_21_0 = stackOut_19_0;
                                      stackIn_21_1 = stackOut_19_1;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    ((on) this).field_Ec = stackIn_21_1;
                                    if (((on) this).field_Rc.indexOf("radeon") == -1) {
                                      break L5;
                                    } else {
                                      var11_int = 0;
                                      var12 = 0;
                                      var13 = 0;
                                      int discarded$9 = -27224;
                                      var14_array = cn.a(' ', ((on) this).field_Rc.replace('/', ' '));
                                      var15 = 0;
                                      L6: while (true) {
                                        L7: {
                                          if (~var14_array.length >= ~var15) {
                                            break L7;
                                          } else {
                                            var21_ref = var14_array[var15];
                                            var16_ref = var21_ref;
                                            var16_ref = var21_ref;
                                            try {
                                              L8: {
                                                L9: {
                                                  if (0 < var21_ref.length()) {
                                                    L10: {
                                                      if (120 != var21_ref.charAt(0)) {
                                                        break L10;
                                                      } else {
                                                        if (3 > var21_ref.length()) {
                                                          break L10;
                                                        } else {
                                                          var31 = (CharSequence) (Object) var21_ref.substring(1, 3);
                                                          if (!jf.a(-13181, var31)) {
                                                            break L10;
                                                          } else {
                                                            var16_ref = var21_ref.substring(1);
                                                            var13 = 1;
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var16_ref.equals((Object) (Object) "hd")) {
                                                      var12 = 1;
                                                      break L9;
                                                    } else {
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
                                                        if (!jf.a(-13181, var32)) {
                                                          break L9;
                                                        } else {
                                                          var33 = (CharSequence) (Object) var16_ref.substring(0, 4);
                                                          var11_int = no.a((byte) -127, var33);
                                                          decompiledRegionSelector0 = 1;
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L9;
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
                                                  if (var11_int > 7999) {
                                                    break L14;
                                                  } else {
                                                    ((on) this).field_Nc = false;
                                                    break L14;
                                                  }
                                                }
                                              }
                                              if (var11_int < 7000) {
                                                break L13;
                                              } else {
                                                if (var11_int > 9250) {
                                                  break L13;
                                                } else {
                                                  ((on) this).field_Eb = false;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        ((on) this).field_bd = ((on) this).field_bd & ((on) this).field_Yc.a("GL_ARB_half_float_pixel");
                                        break L5;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (-1 != ((on) this).field_Wc.indexOf("intel")) {
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (((on) this).field_Nc) {
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
                                    } else {
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
              ((on) this).a((byte) -98);
              throw new RuntimeException("");
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          L18: {
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var8_ref;
            stackOut_59_1 = new StringBuilder().append("on.<init>(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L18;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L18;
            }
          }
          L19: {
            stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L19;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L19;
            }
          }
          L20: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(44).append(param2).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param3 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param5 + 41);
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
              if (param1 != lf.field_c) {
                int discarded$2 = -116;
                var3_int = ka.a(param1);
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
              if (param0 == 13754) {
                break L2;
              } else {
                ((on) this).eb(122);
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
            stackOut_6_1 = new StringBuilder().append("on.B(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
        RuntimeException var6 = null;
        or stackIn_8_0 = null;
        sa stackIn_10_0 = null;
        sa stackIn_12_0 = null;
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
        sa stackOut_9_0 = null;
        or stackOut_7_0 = null;
        sa stackOut_11_0 = null;
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
              if (param4 <= -99) {
                break L1;
              } else {
                ((on) this).b();
                break L1;
              }
            }
            L2: {
              if (((on) this).field_Ic) {
                break L2;
              } else {
                L3: {
                  if (!rm.a(param3, -124)) {
                    break L3;
                  } else {
                    if (rm.a(param2, -128)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!((on) this).field_bd) {
                  stackOut_9_0 = new sa((on) this, param1, param0, hn.a(false, param3), hn.a(false, param2));
                  stackIn_10_0 = stackOut_9_0;
                  return (ru) (Object) stackIn_10_0;
                } else {
                  stackOut_7_0 = new or((on) this, param1, param0, param3, param2);
                  stackIn_8_0 = stackOut_7_0;
                  return (ru) (Object) stackIn_8_0;
                }
              }
            }
            stackOut_11_0 = new sa((on) this, param1, param0, param3, param2);
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("on.NB(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return (ru) (Object) stackIn_12_0;
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
        if (!param0) {
          L0: {
            L1: {
              if (!((on) this).field_I) {
                break L1;
              } else {
                if (((on) this).field_tb) {
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
              if (var3 >= 8) {
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((on) this).field_Pc = null;
                break L1;
              }
            }
            L2: {
              if (param3 == tc.field_g) {
                var6 = 2 * param2;
                var5_int = 1;
                break L2;
              } else {
                if (rv.field_b != param3) {
                  if (np.field_h == param3) {
                    var6 = 3 * param2;
                    var5_int = 4;
                    break L2;
                  } else {
                    if (an.field_d == param3) {
                      var5_int = 6;
                      var6 = param2 - -2;
                      break L2;
                    } else {
                      if (fq.field_d != param3) {
                        var6 = param2;
                        var5_int = 0;
                        break L2;
                      } else {
                        var5_int = 5;
                        var6 = param2 - -2;
                        break L2;
                      }
                    }
                  }
                } else {
                  var5_int = 3;
                  var6 = param2 + 1;
                  break L2;
                }
              }
            }
            jaggl.OpenGL.glDrawArrays(var5_int, param0, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("on.UC(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final boolean a(io param0, iw param1, int param2) {
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
            if (param2 == 6) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((on) this).field_Dc = false;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("on.SE(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return stackIn_3_0 != 0;
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
        int discarded$0 = 68;
        this.t();
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
        fv.field_v[3] = (float)(((on) this).field_Ub >>> 24) / 255.0f;
        fv.field_v[2] = (float)eb.a(255, ((on) this).field_Ub) / 255.0f;
        fv.field_v[0] = (float)eb.a(16711680, ((on) this).field_Ub) / 16711680.0f;
        fv.field_v[param0] = (float)eb.a(((on) this).field_Ub, 65280) / 65280.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, fv.field_v, 0);
    }

    final void a(int param0, boolean param1, byte param2, mi param3) {
        try {
            jaggl.OpenGL.glTexEnvi(8960, 34184 + param0, kq.a(127, param3));
            jaggl.OpenGL.glTexEnvi(8960, param0 + 34200, !param1 ? 770 : 771);
            int var5_int = -37 % ((param2 - 1) / 45);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "on.BF(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        Long var4 = null;
        try {
            if (param2 != 0) {
                ((on) this).s(30);
            }
            var4 = (Long) param1;
            ((on) this).field_Yc.releaseSurface(param0, var4.longValue());
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "on.JE(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
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
        RuntimeException var3 = null;
        fq stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fq stackOut_2_0 = null;
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
              if (param1 >= 6) {
                break L1;
              } else {
                ((on) this).field_Kc = null;
                break L1;
              }
            }
            stackOut_2_0 = new fq(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("on.V(");
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
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return (hq) (Object) stackIn_3_0;
    }

    final ru a(boolean param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        sa var9 = null;
        sa stackIn_7_0 = null;
        or stackIn_10_0 = null;
        sa stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_11_0 = null;
        or stackOut_9_0 = null;
        sa stackOut_6_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param4 <= -41) {
                break L1;
              } else {
                ((on) this).l((byte) 14);
                break L1;
              }
            }
            L2: {
              if (((on) this).field_Ic) {
                break L2;
              } else {
                L3: {
                  if (!rm.a(param3, -118)) {
                    break L3;
                  } else {
                    if (!rm.a(param6, -113)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                if (!((on) this).field_bd) {
                  var9 = new sa((on) this, nl.field_p, io.field_g, hn.a(false, param3), hn.a(false, param6));
                  var9.a(param6, false, param5, param3, param1, param2, 0, 0);
                  stackOut_11_0 = (sa) var9;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = new or((on) this, param3, param6, param2, param5, param1);
                  stackIn_10_0 = stackOut_9_0;
                  return (ru) (Object) stackIn_10_0;
                }
              }
            }
            stackOut_6_0 = new sa((on) this, param3, param6, param0, param2, param5, param1);
            stackIn_7_0 = stackOut_6_0;
            return (ru) (Object) stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var8;
            stackOut_13_1 = new StringBuilder().append("on.WD(").append(param0).append(44).append(param1).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return (ru) (Object) stackIn_12_0;
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
        int var9_int = 0;
        RuntimeException var9 = null;
        sa var10 = null;
        sa stackIn_5_0 = null;
        or stackIn_8_0 = null;
        sa stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_9_0 = null;
        or stackOut_7_0 = null;
        sa stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var9_int = 108 % ((50 - param5) / 44);
              if (((on) this).field_Ic) {
                break L1;
              } else {
                L2: {
                  if (!rm.a(param1, -107)) {
                    break L2;
                  } else {
                    if (!rm.a(param2, -111)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!((on) this).field_bd) {
                  var10 = new sa((on) this, param0, io.field_g, hn.a(false, param1), hn.a(false, param2));
                  var10.a(param0, 0, (byte) 77, param6, param4, param2, param1, 0, param3);
                  stackOut_9_0 = (sa) var10;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = new or((on) this, param0, param1, param2, param4, param6, param3);
                  stackIn_8_0 = stackOut_7_0;
                  return (ru) (Object) stackIn_8_0;
                }
              }
            }
            stackOut_4_0 = new sa((on) this, param0, param1, param2, param7, param4, param6, param3);
            stackIn_5_0 = stackOut_4_0;
            return (ru) (Object) stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var9;
            stackOut_11_1 = new StringBuilder().append("on.UA(");
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
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return (ru) (Object) stackIn_10_0;
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
              ((on) this).field_zc[param0] = (sc) (Object) param2;
              if (param1 >= 62) {
                break L1;
              } else {
                ((on) this).A(-86);
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
            stackOut_3_1 = new StringBuilder().append("on.BE(").append(param0).append(44).append(param1).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
          if (var3 == 4) {
            return (rq) (Object) new wj((on) this, ((on) this).field_ab, ((on) this).field_Mb);
          } else {
            if (var3 == 8) {
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
        int discarded$0 = 68;
        this.t();
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

    private final void t() {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (((on) this).field_Dc) {
            jaggl.OpenGL.glPopMatrix();
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
            stackOut_2_1 = new StringBuilder().append("on.OF(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return (vc) (Object) stackIn_1_0;
    }

    final nh a(boolean param0, iw param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        go stackIn_3_0 = null;
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
        go stackOut_2_0 = null;
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
              if (param0) {
                break L1;
              } else {
                ((on) this).field_Wc = null;
                break L1;
              }
            }
            stackOut_2_0 = new go((on) this, param1, param5, param3, param2, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7;
            stackOut_4_1 = new StringBuilder().append("on.PE(").append(param0).append(44);
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param5 + 41);
        }
        return (nh) (Object) stackIn_3_0;
    }

    final void e() {
        if (((on) this).field_rb <= 0) {
            if (!(((on) this).field_Sb > 0)) {
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
