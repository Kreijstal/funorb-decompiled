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
        this.k(1);
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (this.field_ub <= var2) {
                  break L3;
                } else {
                  var3 = this.field_pb[var2];
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
                  if (var7 != 0) {
                    break L2;
                  } else {
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: while (true) {
                if ((var2 ^ -1) <= (this.field_Ab ^ -1)) {
                  break L2;
                } else {
                  jaggl.OpenGL.glDisable(16386 + var2);
                  var2++;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    if (var7 == 0) {
                      continue L4;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L5: {
              if (param0 < -83) {
                break L5;
              } else {
                this.field_Ac = true;
                break L5;
              }
            }
            super.Y(-120);
            break L1;
          }
          return;
        }
    }

    final Object a(java.awt.Canvas param0, int param1) {
        ru discarded$2 = null;
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
            L1: {
              var3_long = this.field_Yc.prepareSurface(param0);
              if (param1 == 3) {
                break L1;
              } else {
                discarded$2 = this.a((io) null, (iw) null, -119, -113, (byte) -97);
                break L1;
              }
            }
            if ((var3_long ^ -1L) == 0L) {
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
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("on.EA(");
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte param0, int param1, boolean param2, boolean param3, mi param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
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
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
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
              L2: {
                jaggl.OpenGL.glTexEnvi(8960, 34176 - -param1, kq.a(81, param4));
                var6_int = 45 / ((16 - param0) / 56);
                if (!param2) {
                  break L2;
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
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
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
                  break L4;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 768;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L4;
                }
              }
              jaggl.OpenGL.glTexEnvi(stackIn_8_0, stackIn_8_1, stackIn_8_2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("on.ED(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final void db(int param0) {
        fv.field_v[3] = 1.0f;
        fv.field_v[1] = this.field_jb * this.field_S;
        fv.field_v[0] = this.field_S * this.field_J;
        fv.field_v[2] = this.field_Xb * this.field_S;
        jaggl.OpenGL.glLightfv(16384, 4609, fv.field_v, 0);
        fv.field_v[3] = 1.0f;
        fv.field_v[1] = -this.field_hb * this.field_jb;
        fv.field_v[0] = this.field_J * -this.field_hb;
        fv.field_v[2] = this.field_Xb * -this.field_hb;
        jaggl.OpenGL.glLightfv(16385, 4609, fv.field_v, param0);
    }

    final void X(int param0) {
        jaggl.OpenGL.glTexEnvi(8960, 34162, rq.a(-9267, this.field_B[this.field_mc]));
        if (param0 >= -80) {
            this.b(true);
        }
    }

    final synchronized void a(int param0, long param1) {
        ms var4 = new ms();
        if (param0 != 33984) {
            this.SA(-105, -54, 124, -38, (int[]) null, -85, -29);
        }
        var4.field_h = param1;
        this.field_Fc.a(var4, (byte) 39);
    }

    final void i(byte param0) {
        L0: {
          L1: {
            L2: {
              if (!this.field_Rb) {
                break L2;
              } else {
                if (!this.field_Bb) {
                  break L2;
                } else {
                  if (-1 >= (this.field_Kb ^ -1)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            jaggl.OpenGL.glDisable(2912);
            if (!Sumoblitz.field_L) {
              break L0;
            } else {
              break L1;
            }
          }
          jaggl.OpenGL.glEnable(2912);
          break L0;
        }
        L3: {
          if (param0 == -119) {
            break L3;
          } else {
            this.field_Uc = true;
            break L3;
          }
        }
    }

    final synchronized void f(int param0) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        param0 = param0 & 2147483647;
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_Gc.a((byte) -100)) {
                break L2;
              } else {
                var5 = (ge) ((Object) this.field_Gc.c(9));
                incrementValue$6 = var2;
                var2++;
                gw.field_A[incrementValue$6] = (int)var5.field_h;
                this.field_o = this.field_o - var5.field_m;
                stackOut_2_0 = var2 ^ -1;
                stackOut_2_1 = -1001;
                stackIn_7_0 = stackOut_2_0;
                stackIn_7_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                      break L3;
                    } else {
                      jaggl.OpenGL.glDeleteBuffersARB(var2, gw.field_A, 0);
                      var2 = 0;
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
            stackOut_6_0 = var2 ^ -1;
            stackOut_6_1 = -1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L1;
          }
          L4: {
            if (stackIn_7_0 < stackIn_7_1) {
              jaggl.OpenGL.glDeleteBuffersARB(var2, gw.field_A, 0);
              var2 = 0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: while (true) {
            L6: {
              L7: {
                if (this.field_Zc.a((byte) -105)) {
                  break L7;
                } else {
                  var6 = (ge) ((Object) this.field_Zc.c(9));
                  incrementValue$7 = var2;
                  var2++;
                  gw.field_A[incrementValue$7] = (int)var6.field_h;
                  this.field_Cb = this.field_Cb - var6.field_m;
                  stackOut_11_0 = -1001;
                  stackOut_11_1 = var2 ^ -1;
                  stackIn_35_0 = stackOut_11_0;
                  stackIn_35_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (var4 != 0) {
                    break L6;
                  } else {
                    L8: {
                      if (stackIn_12_0 != stackIn_12_1) {
                        break L8;
                      } else {
                        jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
                        var2 = 0;
                        break L8;
                      }
                    }
                    if (var4 == 0) {
                      continue L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L9: {
                L10: {
                  if (var2 > 0) {
                    jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
                    var2 = 0;
                    L11: while (true) {
                      if (this.field_Xc.a((byte) -73)) {
                        break L9;
                      } else {
                        var7 = (ge) ((Object) this.field_Xc.c(9));
                        incrementValue$8 = var2;
                        var2++;
                        gw.field_A[incrementValue$8] = var7.field_m;
                        stackOut_24_0 = 1000;
                        stackOut_24_1 = var2;
                        stackIn_35_0 = stackOut_24_0;
                        stackIn_35_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (var4 != 0) {
                          break L6;
                        } else {
                          L12: {
                            if (stackIn_25_0 != stackIn_25_1) {
                              break L12;
                            } else {
                              jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                              var2 = 0;
                              break L12;
                            }
                          }
                          if (var4 == 0) {
                            continue L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  } else {
                    L13: while (true) {
                      if (this.field_Xc.a((byte) -73)) {
                        break L9;
                      } else {
                        var7 = (ge) ((Object) this.field_Xc.c(9));
                        incrementValue$9 = var2;
                        var2++;
                        gw.field_A[incrementValue$9] = var7.field_m;
                        stackOut_17_0 = 1000;
                        stackOut_17_1 = var2;
                        stackIn_35_0 = stackOut_17_0;
                        stackIn_35_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (var4 != 0) {
                          break L6;
                        } else {
                          L14: {
                            if (stackIn_18_0 != stackIn_18_1) {
                              break L14;
                            } else {
                              jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                              var2 = 0;
                              break L14;
                            }
                          }
                          if (var4 == 0) {
                            continue L13;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                jaggl.OpenGL.glDeleteTextures(var2, gw.field_A, 0);
                var2 = 0;
                L15: while (true) {
                  if (this.field_Xc.a((byte) -73)) {
                    break L9;
                  } else {
                    var7 = (ge) ((Object) this.field_Xc.c(9));
                    incrementValue$10 = var2;
                    var2++;
                    gw.field_A[incrementValue$10] = var7.field_m;
                    stackOut_30_0 = 1000;
                    stackOut_30_1 = var2;
                    stackIn_35_0 = stackOut_30_0;
                    stackIn_35_1 = stackOut_30_1;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    if (var4 != 0) {
                      break L6;
                    } else {
                      L16: {
                        if (stackIn_31_0 != stackIn_31_1) {
                          break L16;
                        } else {
                          jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                          var2 = 0;
                          break L16;
                        }
                      }
                      if (var4 == 0) {
                        continue L15;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              stackOut_34_0 = -1;
              stackOut_34_1 = var2 ^ -1;
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              break L6;
            }
            L17: {
              if (stackIn_35_0 <= stackIn_35_1) {
                break L17;
              } else {
                jaggl.OpenGL.glDeleteFramebuffersEXT(var2, gw.field_A, 0);
                var2 = 0;
                break L17;
              }
            }
            L18: while (true) {
              L19: {
                L20: {
                  if (this.field_Vc.a((byte) -123)) {
                    break L20;
                  } else {
                    var8 = (ge) ((Object) this.field_Vc.c(9));
                    incrementValue$11 = var2;
                    var2++;
                    gw.field_A[incrementValue$11] = (int)var8.field_h;
                    this.field_pc = this.field_pc - var8.field_m;
                    stackOut_39_0 = var2 ^ -1;
                    stackOut_39_1 = -1001;
                    stackIn_44_0 = stackOut_39_0;
                    stackIn_44_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (var4 != 0) {
                      break L19;
                    } else {
                      L21: {
                        if (stackIn_40_0 != stackIn_40_1) {
                          break L21;
                        } else {
                          jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
                          var2 = 0;
                          break L21;
                        }
                      }
                      if (var4 == 0) {
                        continue L18;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                stackOut_43_0 = -1;
                stackOut_43_1 = var2 ^ -1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                break L19;
              }
              L22: {
                if (stackIn_44_0 <= stackIn_44_1) {
                  break L22;
                } else {
                  jaggl.OpenGL.glDeleteRenderbuffersEXT(var2, gw.field_A, 0);
                  var2 = 0;
                  break L22;
                }
              }
              L23: while (true) {
                L24: {
                  L25: {
                    L26: {
                      L27: {
                        L28: {
                          L29: {
                            L30: {
                              if (this.field_Kc.a((byte) -88)) {
                                break L30;
                              } else {
                                var9 = (ge) ((Object) this.field_Kc.c(9));
                                jaggl.OpenGL.glDeleteLists((int)var9.field_h, var9.field_m);
                                if (var4 != 0) {
                                  break L29;
                                } else {
                                  if (var4 == 0) {
                                    continue L23;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            L31: while (true) {
                              if (this.field_Pc.a((byte) -68)) {
                                break L29;
                              } else {
                                var10 = this.field_Pc.c(9);
                                jaggl.OpenGL.glDeleteProgramARB((int)var10.field_h);
                                if (var4 != 0) {
                                  break L27;
                                } else {
                                  if (var4 == 0) {
                                    continue L31;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                            }
                          }
                          break L28;
                        }
                        L32: while (true) {
                          if (this.field_Fc.a((byte) -95)) {
                            break L27;
                          } else {
                            var11 = this.field_Fc.c(9);
                            jaggl.OpenGL.glDeleteObjectARB(var11.field_h);
                            if (var4 != 0) {
                              break L25;
                            } else {
                              if (var4 == 0) {
                                continue L32;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      break L26;
                    }
                    L33: while (true) {
                      if (this.field_Kc.a((byte) -68)) {
                        break L25;
                      } else {
                        var12 = (ge) ((Object) this.field_Kc.c(9));
                        jaggl.OpenGL.glDeleteLists((int)var12.field_h, var12.field_m);
                        if (var4 != 0) {
                          break L24;
                        } else {
                          if (var4 == 0) {
                            continue L33;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                  }
                  L34: {
                    if ((this.h(64) ^ -1) >= -100663297) {
                      break L34;
                    } else {
                      if (wq.a(-117) <= 60000L + this.field_Cc) {
                        break L34;
                      } else {
                        System.gc();
                        this.field_Cc = wq.a(-39);
                        break L34;
                      }
                    }
                  }
                  super.f(param0);
                  break L24;
                }
                return;
              }
            }
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
        int decompiledRegionSelector0 = 0;
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
                this.a(66, false);
                break L1;
              }
            }
            L2: {
              if (this.field_Ic) {
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
                if (!this.field_bd) {
                  var10 = new sa((on) (this), param7, io.field_d, hn.a(false, param1), hn.a(false, param5));
                  var10.a(0, param7, param5, 0, 14137, param0, param1, param4, param3);
                  stackOut_11_0 = (sa) (var10);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_9_0 = new or((on) (this), param7, param1, param5, param4, param0, param3);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_6_0 = new sa((on) (this), param7, param1, param5, param2, param4, param0, param3);
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var9);
            stackOut_13_1 = new StringBuilder().append("on.SC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param7 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ru) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ru) ((Object) stackIn_10_0);
          } else {
            return (ru) ((Object) stackIn_12_0);
          }
        }
    }

    final void b(boolean param0) {
        this.field_Tb = (float)(-this.field_Nb + this.field_Yb);
        this.field_E = this.field_Tb - (float)this.field_Kb;
        if (this.field_E < (float)this.field_oc) {
            this.field_E = (float)this.field_oc;
        }
        jaggl.OpenGL.glFogf(2915, this.field_E);
        jaggl.OpenGL.glFogf(2916, this.field_Tb);
        fv.field_v[1] = (float)eb.a(65280, this.field_C) / 65280.0f;
        if (!param0) {
            return;
        }
        fv.field_v[2] = (float)eb.a(255, this.field_C) / 255.0f;
        fv.field_v[0] = (float)eb.a(this.field_C, 16711680) / 16711680.0f;
        jaggl.OpenGL.glFogfv(2918, fv.field_v, 0);
    }

    final void GA(int param0) {
        jaggl.OpenGL.glClearColor((float)(16711680 & param0) / 16711680.0f, (float)(param0 & 65280) / 65280.0f, (float)(param0 & 255) / 255.0f, (float)(param0 >>> 1737369080) / 255.0f);
        jaggl.OpenGL.glClear(16384);
    }

    final void i(int param0) {
        if (param0 != 0) {
            this.a(-111, -93, -40, (ck) null);
        }
        jaggl.OpenGL.glViewport(this.field_r, this.field_y, this.field_rb, this.field_Sb);
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
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("on.HC(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, boolean param1) {
        ru discarded$2 = null;
        L0: {
          L1: {
            if (param1) {
              break L1;
            } else {
              jaggl.OpenGL.glDisable(32925);
              if (!Sumoblitz.field_L) {
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
            discarded$2 = this.a((iw) null, -18, -125, 65, (byte[]) null, (byte) -115, -5, true);
            break L2;
          }
        }
    }

    final void I(int param0) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.field_Ic = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_Z) {
              break L2;
            } else {
              jaggl.OpenGL.glDisable(16384);
              jaggl.OpenGL.glDisable(16385);
              if (!Sumoblitz.field_L) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          jaggl.OpenGL.glEnable(16384);
          jaggl.OpenGL.glEnable(16385);
          break L1;
        }
    }

    final void a(int param0, hq param1) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        RuntimeException var3 = null;
        hu[] var3_array = null;
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
        int stackIn_4_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_28_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        Object stackOut_52_0 = null;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_61_0 = null;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var18 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var19 = ((fq) ((Object) param1)).field_g;
            var3_array = var19;
            var4 = 0;
            var6 = 82 / ((param0 - 71) / 45);
            var5 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var9 ^ -1) <= (var19.length ^ -1)) {
                    break L3;
                  } else {
                    var10 = var19[var9];
                    var11 = this.field_zc[var9];
                    var12 = 0;
                    var13 = var11.g(34962);
                    var14 = var11.c(-24168);
                    var11.e(1175993800);
                    stackOut_3_0 = 0;
                    stackIn_29_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      var16 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var10.a(44115) <= var16) {
                              break L6;
                            } else {
                              var17 = var10.a(-80, var16);
                              if (var18 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  L8: {
                                    if (var17 == ls.field_b) {
                                      break L8;
                                    } else {
                                      L9: {
                                        if (ls.field_c == var17) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (var17 != ls.field_g) {
                                              break L10;
                                            } else {
                                              jaggl.OpenGL.glColorPointer(4, 5121, var13, var14 + (long)var12);
                                              var5 = 1;
                                              if (var18 == 0) {
                                                break L7;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (ls.field_j == var17) {
                                              break L11;
                                            } else {
                                              L12: {
                                                if (var17 == ls.field_e) {
                                                  break L12;
                                                } else {
                                                  L13: {
                                                    if (ls.field_d != var17) {
                                                      break L13;
                                                    } else {
                                                      incrementValue$4 = var4;
                                                      var4++;
                                                      jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$4);
                                                      jaggl.OpenGL.glTexCoordPointer(3, 5126, var13, var14 - -(long)var12);
                                                      if (var18 == 0) {
                                                        break L7;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                  if (var17 != ls.field_a) {
                                                    break L7;
                                                  } else {
                                                    incrementValue$5 = var4;
                                                    var4++;
                                                    jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$5);
                                                    jaggl.OpenGL.glTexCoordPointer(4, 5126, var13, (long)var12 + var14);
                                                    if (var18 == 0) {
                                                      break L7;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              incrementValue$6 = var4;
                                              var4++;
                                              jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$6);
                                              jaggl.OpenGL.glTexCoordPointer(2, 5126, var13, var14 + (long)var12);
                                              if (var18 == 0) {
                                                break L7;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          incrementValue$7 = var4;
                                          var4++;
                                          jaggl.OpenGL.glClientActiveTexture(33984 + incrementValue$7);
                                          jaggl.OpenGL.glTexCoordPointer(1, 5126, var13, var14 - -(long)var12);
                                          if (var18 == 0) {
                                            break L7;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var7 = 1;
                                      jaggl.OpenGL.glNormalPointer(5126, var13, (long)var12 + var14);
                                      if (var18 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  jaggl.OpenGL.glVertexPointer(3, 5126, var13, var14 - -(long)var12);
                                  var8 = 1;
                                  break L7;
                                }
                                var12 = var12 + var17.field_k;
                                var16++;
                                if (var18 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var9++;
                          break L5;
                        }
                        if (var18 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_28_0 = this.field_Lc;
                stackIn_29_0 = stackOut_28_0 ? 1 : 0;
                break L2;
              }
              L14: {
                if (stackIn_29_0 != 0) {
                  stackOut_31_0 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  break L14;
                } else {
                  stackOut_30_0 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L14;
                }
              }
              L15: {
                if (stackIn_32_0 != var8) {
                  break L15;
                } else {
                  L16: {
                    L17: {
                      if (var8 != 0) {
                        break L17;
                      } else {
                        jaggl.OpenGL.glDisableClientState(32884);
                        if (var18 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    jaggl.OpenGL.glEnableClientState(32884);
                    break L16;
                  }
                  L18: {
                    stackOut_37_0 = this;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var8 == 0) {
                      stackOut_39_0 = this;
                      stackOut_39_1 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L18;
                    } else {
                      stackOut_38_0 = this;
                      stackOut_38_1 = 1;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      break L18;
                    }
                  }
                  ((on) (this)).field_Lc = stackIn_40_1 != 0;
                  break L15;
                }
              }
              L19: {
                if (var7 != 0) {
                  stackOut_43_0 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  break L19;
                } else {
                  stackOut_42_0 = 1;
                  stackIn_44_0 = stackOut_42_0;
                  break L19;
                }
              }
              L20: {
                stackOut_44_0 = stackIn_44_0;
                stackIn_46_0 = stackOut_44_0;
                stackIn_45_0 = stackOut_44_0;
                if (this.field_Sc) {
                  stackOut_46_0 = stackIn_46_0;
                  stackOut_46_1 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  break L20;
                } else {
                  stackOut_45_0 = stackIn_45_0;
                  stackOut_45_1 = 1;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  break L20;
                }
              }
              L21: {
                if (stackIn_47_0 == stackIn_47_1) {
                  break L21;
                } else {
                  L22: {
                    L23: {
                      if (var7 == 0) {
                        break L23;
                      } else {
                        jaggl.OpenGL.glEnableClientState(32885);
                        if (var18 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    jaggl.OpenGL.glDisableClientState(32885);
                    break L22;
                  }
                  L24: {
                    stackOut_52_0 = this;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_53_0 = stackOut_52_0;
                    if (var7 == 0) {
                      stackOut_54_0 = this;
                      stackOut_54_1 = 0;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      break L24;
                    } else {
                      stackOut_53_0 = this;
                      stackOut_53_1 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_55_1 = stackOut_53_1;
                      break L24;
                    }
                  }
                  ((on) (this)).field_Sc = stackIn_55_1 != 0;
                  break L21;
                }
              }
              L25: {
                if (var5 == (this.field_Tc ? 1 : 0)) {
                  break L25;
                } else {
                  L26: {
                    L27: {
                      if (var5 != 0) {
                        break L27;
                      } else {
                        jaggl.OpenGL.glDisableClientState(32886);
                        if (var18 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    jaggl.OpenGL.glEnableClientState(32886);
                    break L26;
                  }
                  L28: {
                    stackOut_61_0 = this;
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_62_0 = stackOut_61_0;
                    if (var5 == 0) {
                      stackOut_63_0 = this;
                      stackOut_63_1 = 0;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      break L28;
                    } else {
                      stackOut_62_0 = this;
                      stackOut_62_1 = 1;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_64_1 = stackOut_62_1;
                      break L28;
                    }
                  }
                  ((on) (this)).field_Tc = stackIn_64_1 != 0;
                  break L25;
                }
              }
              L29: {
                L30: {
                  L31: {
                    if (this.field_ad < var4) {
                      break L31;
                    } else {
                      if ((var4 ^ -1) > (this.field_ad ^ -1)) {
                        var9 = var4;
                        L32: while (true) {
                          L33: {
                            L34: {
                              if ((var9 ^ -1) <= (this.field_ad ^ -1)) {
                                break L34;
                              } else {
                                jaggl.OpenGL.glClientActiveTexture(var9 + 33984);
                                jaggl.OpenGL.glDisableClientState(32888);
                                var9++;
                                if (var18 != 0) {
                                  break L33;
                                } else {
                                  if (var18 == 0) {
                                    continue L32;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                            this.field_ad = var4;
                            break L33;
                          }
                          if (var18 == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      } else {
                        break L29;
                      }
                    }
                  }
                  var9 = this.field_ad;
                  L35: while (true) {
                    L36: {
                      if (var4 <= var9) {
                        break L36;
                      } else {
                        jaggl.OpenGL.glClientActiveTexture(var9 + 33984);
                        jaggl.OpenGL.glEnableClientState(32888);
                        var9++;
                        if (var18 != 0) {
                          break L30;
                        } else {
                          if (var18 == 0) {
                            continue L35;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    this.field_ad = var4;
                    break L30;
                  }
                }
                break L29;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var3 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) (var3);
            stackOut_82_1 = new StringBuilder().append("on.AE(").append(param0).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param1 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L37;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L37;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ')');
        }
    }

    final void q(byte param0) {
        if (param0 >= -74) {
            this.field_ad = 99;
        }
        jaggl.OpenGL.glTexEnvi(8960, 34161, rq.a(-9267, this.field_K[this.field_mc]));
    }

    final void b() {
    }

    final void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        try {
            this.L(-25);
            this.a((ed) null, 126);
            this.e(0, 13);
            this.k(1);
            jaggl.OpenGL.glPixelZoom(1.0f, -1.0f);
            jaggl.OpenGL.glRasterPos2i(param0, param1);
            jaggl.OpenGL.glDrawPixelsi(param2, param3, 32993, this.field_Ec, param4, param5);
            jaggl.OpenGL.glRasterPos2i(0, 0);
            jaggl.OpenGL.glPixelZoom(1.0f, 1.0f);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "on.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean a() {
        return false;
    }

    final void V(int param0) {
        L0: {
          jaggl.OpenGL.glMatrixMode(5890);
          if (param0 == 26803) {
            break L0;
          } else {
            this.field_Zc = (jn) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (ar.field_L == this.field_wb[this.field_mc]) {
              break L2;
            } else {
              jaggl.OpenGL.glLoadMatrixf(this.field_V[this.field_mc].b(-107, pq.field_y), 0);
              if (!Sumoblitz.field_L) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          jaggl.OpenGL.glLoadIdentity();
          break L1;
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
            stackOut_0_0 = new rc((on) (this), param0, param3, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5);
            stackOut_2_1 = new StringBuilder().append("on.SD(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param3 + ')');
        }
        return (ef) ((Object) stackIn_1_0);
    }

    on(jaggl.OpenGL param0, java.awt.Canvas param1, long param2, d param3, ki param4, int param5) {
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
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        String var21_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = Sumoblitz.field_L ? 1 : 0;
                    var28 = null;
                    var29 = null;
                    var30 = null;
                    this.field_Kc = new jn();
                    this.field_Gc = new jn();
                    this.field_Zc = new jn();
                    this.field_Xc = new jn();
                    this.field_Vc = new jn();
                    this.field_Pc = new jn();
                    this.field_Fc = new jn();
                    this.field_zc = new sc[16];
                    this.field_Qc = new jaggl.MapBuffer();
                    this.field_Bc = new jaggl.MapBuffer();
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_Yc = param0;
                        discarded$3 = this.field_Yc.b();
                        this.field_Wc = jaggl.OpenGL.glGetString(7936).toLowerCase();
                        this.field_Rc = jaggl.OpenGL.glGetString(7937).toLowerCase();
                        if (this.field_Wc.indexOf("microsoft") != -1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 != this.field_Wc.indexOf("brian paul")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-1 == this.field_Wc.indexOf("mesa")) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 61;
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
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10_int = no.a((byte) -128, (CharSequence) ((Object) var9[0]));
                        var11_int = no.a((byte) -128, (CharSequence) ((Object) var9[1]));
                        this.field_Oc = var11_int + 10 * var10_int;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof NumberFormatException ? 8 : 61);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = (NumberFormatException) ((Object) caughtException);
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-13 >= (this.field_Oc ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_Yc.a("GL_ARB_multitexture")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (this.field_Yc.a("GL_ARB_texture_env_combine")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var26 = new int[1];
                        jaggl.OpenGL.glGetIntegerv(34018, var26, 0);
                        this.field_cc = var26[0];
                        if (2 <= this.field_cc) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_bc = 8;
                        this.field_Nc = this.field_Yc.a("GL_ARB_vertex_buffer_object");
                        discarded$4 = this.field_Yc.a("GL_ARB_multisample");
                        this.field_bd = this.field_Yc.a("GL_ARB_texture_rectangle");
                        this.field_W = this.field_Yc.a("GL_ARB_texture_cube_map");
                        this.field_Ic = this.field_Yc.a("GL_ARB_texture_non_power_of_two");
                        this.field_Eb = this.field_Yc.a("GL_EXT_texture3D");
                        this.field_Jc = this.field_Yc.a("GL_ARB_vertex_shader");
                        this.field_Ac = this.field_Yc.a("GL_ARB_vertex_program");
                        this.field_Mc = this.field_Yc.a("GL_ARB_fragment_shader");
                        discarded$5 = this.field_Yc.a("GL_ARB_fragment_program");
                        this.field_Hc = new int[this.field_cc];
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
                        statePc = 61;
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
                        statePc = 61;
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
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((on) (this)).field_Ec = stackIn_21_1;
                        if ((this.field_Rc.indexOf("radeon") ^ -1) == 0) {
                            statePc = 54;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11_int = 0;
                        var12 = 0;
                        var13 = 0;
                        var14_array = cn.a(' ', this.field_Rc.replace('/', ' '), -27224);
                        var15 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 61;
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
                        statePc = 61;
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
                        statePc = 61;
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
                        statePc = ((Object) stateCaught_25 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 < stackIn_26_1) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = ((Object) stateCaught_26 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var18 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 61;
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
                        statePc = ((Object) stateCaught_28 instanceof Exception ? 43 : 61);
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
                        statePc = ((Object) stateCaught_29 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var31 = (CharSequence) ((Object) var21_ref.substring(1, 3));
                        if (!jf.a(-13181, var31)) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = ((Object) stateCaught_30 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16_ref = var21_ref.substring(1);
                        var13 = 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = ((Object) stateCaught_31 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var16_ref.equals("hd")) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = ((Object) stateCaught_32 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = ((Object) stateCaught_33 instanceof Exception ? 43 : 61);
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
                        statePc = ((Object) stateCaught_34 instanceof Exception ? 43 : 61);
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
                        statePc = 61;
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
                        statePc = ((Object) stateCaught_36 instanceof Exception ? 43 : 61);
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
                        statePc = ((Object) stateCaught_37 instanceof Exception ? 43 : 61);
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
                        statePc = ((Object) stateCaught_38 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var32 = (CharSequence) ((Object) var16_ref.substring(0, 4));
                        if (!jf.a(-13181, var32)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = ((Object) stateCaught_39 instanceof Exception ? 43 : 61);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var33 = (CharSequence) ((Object) var16_ref.substring(0, 4));
                        var11_int = no.a((byte) -127, var33);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = ((Object) stateCaught_40 instanceof Exception ? 43 : 61);
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
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 61;
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
                        statePc = 61;
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
                        statePc = 61;
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
                        statePc = 61;
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
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if ((var11_int ^ -1) > -7001) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-8000 > (var11_int ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_Nc = false;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var11_int < 7000) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var11_int > 9250) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_Eb = false;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.field_bd = this.field_bd & this.field_Yc.a("GL_ARB_half_float_pixel");
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = -1;
                        stackOut_54_1 = this.field_Wc.indexOf("intel");
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 61;
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
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (this.field_Nc) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var27 = new int[1];
                        jaggl.OpenGL.glGenBuffersARB(1, var27, 0);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var11 = caughtException;
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var8 = caughtException;
                        var8.printStackTrace();
                        this.a((byte) -98);
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackOut_62_0 = (RuntimeException) (var8_ref);
                    stackOut_62_1 = new StringBuilder().append("on.<init>(");
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_64_1 = stackOut_62_1;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    if (param0 == null) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackOut_63_2 = "{...}";
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    stackIn_65_2 = stackOut_63_2;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
                    stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
                    stackOut_64_2 = "null";
                    stackIn_65_0 = stackOut_64_0;
                    stackIn_65_1 = stackOut_64_1;
                    stackIn_65_2 = stackOut_64_2;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    if (param1 == null) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackOut_66_2 = "{...}";
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_68_2 = stackOut_66_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackOut_67_2 = "null";
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    stackIn_68_2 = stackOut_67_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param2).append(',');
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    if (param3 == null) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackOut_69_2 = "{...}";
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    stackIn_71_2 = stackOut_69_2;
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackOut_70_2 = "null";
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    stackIn_71_2 = stackOut_70_2;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_73_1 = stackOut_71_1;
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    if (param4 == null) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackOut_72_2 = "{...}";
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackOut_73_2 = "null";
                    stackIn_74_0 = stackOut_73_0;
                    stackIn_74_1 = stackOut_73_1;
                    stackIn_74_2 = stackOut_73_2;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    throw qo.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param5 + ')');
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void q(int param0) {
        L0: {
          L1: {
            if (!this.field_p) {
              break L1;
            } else {
              jaggl.OpenGL.glEnable(2929);
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glDisable(2929);
          break L0;
        }
        L2: {
          if (param0 > 19) {
            break L2;
          } else {
            this.field_Fc = (jn) null;
            break L2;
          }
        }
    }

    final void a(hr param0, boolean param1) {
    }

    final void J(int param0) {
        if (param0 != 0) {
            this.field_Oc = 37;
        }
    }

    final void a(int param0, mp param1) {
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
                if (param1 != lf.field_c) {
                  break L2;
                } else {
                  jaggl.OpenGL.glDisable(3168);
                  jaggl.OpenGL.glDisable(3169);
                  jaggl.OpenGL.glDisable(3170);
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = ka.a(param1, -116);
              jaggl.OpenGL.glTexGeni(8192, 9472, var3_int);
              jaggl.OpenGL.glEnable(3168);
              jaggl.OpenGL.glTexGeni(8193, 9472, var3_int);
              jaggl.OpenGL.glEnable(3169);
              jaggl.OpenGL.glTexGeni(8194, 9472, var3_int);
              jaggl.OpenGL.glEnable(3170);
              break L1;
            }
            L3: {
              if (param0 == 13754) {
                break L3;
              } else {
                this.eb(122);
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
            stackOut_7_1 = new StringBuilder().append("on.B(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        ge var4 = new ge(param1);
        var4.field_h = (long)param2;
        this.field_Gc.a((ms) (var4), (byte) 39);
        if (param0 != -99) {
            this.GA(-33);
        }
    }

    final void ab(int param0) {
        fv.field_v[3] = 1.0f;
        fv.field_v[2] = this.field_T * this.field_Xb;
        fv.field_v[1] = this.field_T * this.field_jb;
        fv.field_v[0] = this.field_J * this.field_T;
        jaggl.OpenGL.glLightModelfv(2899, fv.field_v, 0);
        if (param0 != 7) {
            this.SA(-42, 12, 8, 123, (int[]) null, 81, 90);
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
        int decompiledRegionSelector0 = 0;
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
                this.b();
                break L1;
              }
            }
            L2: {
              if (this.field_Ic) {
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
                if (!this.field_bd) {
                  stackOut_9_0 = new sa((on) (this), param1, param0, hn.a(false, param3), hn.a(false, param2));
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_7_0 = new or((on) (this), param1, param0, param3, param2);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackOut_11_0 = new sa((on) (this), param1, param0, param3, param2);
            stackIn_12_0 = stackOut_11_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("on.NB(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ru) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ru) ((Object) stackIn_10_0);
          } else {
            return (ru) ((Object) stackIn_12_0);
          }
        }
    }

    final void A(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (!this.field_wc) {
              break L1;
            } else {
              jaggl.OpenGL.glEnable(3089);
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glDisable(3089);
          break L0;
        }
        var2 = 104 / ((0 - param0) / 55);
    }

    final void f(boolean param0) {
        if (!param0) {
          L0: {
            L1: {
              if (!this.field_I) {
                break L1;
              } else {
                if (this.field_tb) {
                  break L1;
                } else {
                  jaggl.OpenGL.glEnable(2896);
                  if (!Sumoblitz.field_L) {
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

    final pv a(byte param0, boolean param1) {
        rq discarded$0 = null;
        if (param0 != 51) {
            discarded$0 = this.d(83, -4);
        }
        return (pv) ((Object) new sc((on) (this), param1));
    }

    final void F(int param0) {
        jaggl.OpenGL.glScissor(this.field_v + this.field_r, -this.field_yc + (this.field_y + this.field_Sb), this.field_F + -this.field_v, this.field_yc + -this.field_vb);
        if (param0 != 4) {
            this.field_Oc = -14;
        }
    }

    final void D(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        float[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.field_cc + -1;
        L0: while (true) {
          L1: {
            L2: {
              if ((var2 ^ -1) > -1) {
                break L2;
              } else {
                jaggl.OpenGL.glActiveTexture(33984 + var2);
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
                if (-9 >= (var3 ^ -1)) {
                  break L5;
                } else {
                  var4 = 16384 + var3;
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
              this.field_Yc.setSwapInterval(0);
              super.D(param0);
              break L4;
            }
            return;
          }
        }
    }

    final synchronized void a(int param0, byte param1) {
        float discarded$0 = 0.0f;
        ms var3 = new ms();
        var3.field_h = (long)param0;
        if (param1 != -96) {
            discarded$0 = this.b((byte) -39);
        }
        this.field_Pc.a(var3, (byte) 39);
    }

    final void c(int param0, int param1) {
        if (param1 < 83) {
            this.field_Jc = false;
        }
    }

    final void a(int param0, int param1, int param2, ck param3) {
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
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_Pc = (jn) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3 == tc.field_g) {
                  break L3;
                } else {
                  L4: {
                    if (rv.field_b != param3) {
                      break L4;
                    } else {
                      var5_int = 3;
                      var6 = param2 + 1;
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (np.field_h == param3) {
                      break L5;
                    } else {
                      L6: {
                        if (an.field_d == param3) {
                          break L6;
                        } else {
                          L7: {
                            if (fq.field_d != param3) {
                              break L7;
                            } else {
                              var5_int = 5;
                              var6 = param2 - -2;
                              if (var7 == 0) {
                                break L2;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var6 = param2;
                          var5_int = 0;
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5_int = 6;
                      var6 = param2 - -2;
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6 = 3 * param2;
                  var5_int = 4;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = 2 * param2;
              var5_int = 1;
              break L2;
            }
            jaggl.OpenGL.glDrawArrays(var5_int, param0, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("on.UC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
              this.field_Dc = false;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("on.SE(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 23) {
            return;
        }
        ge var4 = new ge(param0);
        var4.field_h = (long)param1;
        this.field_Zc.a((ms) (var4), (byte) 39);
    }

    final void x(int param0) {
        this.t((byte) 68);
        if (param0 != 0) {
            this.field_Gc = (jn) null;
        }
    }

    final cr e(int param0, boolean param1) {
        ef discarded$0 = null;
        if (param0 != 3) {
            discarded$0 = this.a(-106, (byte) -119, (int[][]) null, false);
        }
        return (cr) ((Object) new ju((on) (this), io.field_k, param1));
    }

    final void r(int param0) {
        fv.field_v[3] = (float)(this.field_Ub >>> 1960188920) / 255.0f;
        fv.field_v[2] = (float)eb.a(255, this.field_Ub) / 255.0f;
        fv.field_v[0] = (float)eb.a(16711680, this.field_Ub) / 16711680.0f;
        fv.field_v[param0] = (float)eb.a(this.field_Ub, 65280) / 65280.0f;
        jaggl.OpenGL.glTexEnvfv(8960, 8705, fv.field_v, 0);
    }

    final void a(int param0, boolean param1, byte param2, mi param3) {
        try {
            jaggl.OpenGL.glTexEnvi(8960, 34184 + param0, kq.a(127, param3));
            jaggl.OpenGL.glTexEnvi(8960, param0 + 34200, !param1 ? 770 : 771);
            int var5_int = -37 % ((param2 - 1) / 45);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "on.BF(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(java.awt.Canvas param0, Object param1, int param2) {
        Long var4 = null;
        try {
            if (param2 != 0) {
                this.s(30);
            }
            var4 = (Long) (param1);
            this.field_Yc.releaseSurface(param0, var4.longValue());
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "on.JE(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final nr a(int param0, int param1) {
        return null;
    }

    final float b(byte param0) {
        if (param0 < 125) {
            this.field_Yc = (jaggl.OpenGL) null;
        }
        return 0.0f;
    }

    final void l(byte param0) {
        int var2 = this.field_Hc[this.field_mc];
        if (!(0 == var2)) {
            this.field_Hc[this.field_mc] = 0;
            jaggl.OpenGL.glBindTexture(var2, 0);
            jaggl.OpenGL.glDisable(var2);
        }
        if (param0 != 9) {
            this.field_bd = false;
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
                this.field_Kc = (jn) null;
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
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("on.V(");
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (hq) ((Object) stackIn_3_0);
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
        int decompiledRegionSelector0 = 0;
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
                this.l((byte) 14);
                break L1;
              }
            }
            L2: {
              if (this.field_Ic) {
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
                if (!this.field_bd) {
                  var9 = new sa((on) (this), nl.field_p, io.field_g, hn.a(false, param3), hn.a(false, param6));
                  var9.a(param6, false, param5, param3, param1, param2, 0, 0);
                  stackOut_11_0 = (sa) (var9);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_9_0 = new or((on) (this), param3, param6, param2, param5, param1);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_6_0 = new sa((on) (this), param3, param6, param0, param2, param5, param1);
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var8);
            stackOut_13_1 = new StringBuilder().append("on.WD(").append(param0).append(',').append(param1).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ru) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ru) ((Object) stackIn_10_0);
          } else {
            return (ru) ((Object) stackIn_12_0);
          }
        }
    }

    final void p(byte param0) {
        if (param0 == -4) {
          L0: {
            L1: {
              if (!this.field_ob) {
                break L1;
              } else {
                jaggl.OpenGL.glEnable(3042);
                if (!Sumoblitz.field_L) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            jaggl.OpenGL.glDisable(3042);
            break L0;
          }
          return;
        } else {
          return;
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
        int decompiledRegionSelector0 = 0;
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
              if (this.field_Ic) {
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
                if (!this.field_bd) {
                  var10 = new sa((on) (this), param0, io.field_g, hn.a(false, param1), hn.a(false, param2));
                  var10.a(param0, 0, (byte) 77, param6, param4, param2, param1, 0, param3);
                  stackOut_9_0 = (sa) (var10);
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_7_0 = new or((on) (this), param0, param1, param2, param4, param6, param3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_4_0 = new sa((on) (this), param0, param1, param2, param7, param4, param6, param3);
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var9);
            stackOut_11_1 = new StringBuilder().append("on.UA(");
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
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ru) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ru) ((Object) stackIn_8_0);
          } else {
            return (ru) ((Object) stackIn_10_0);
          }
        }
    }

    final void cb(int param0) {
        if (param0 > -7) {
            this.field_zc = (sc[]) null;
        }
        jaggl.OpenGL.glActiveTexture(this.field_mc + 33984);
    }

    final void E(int param0) {
        if (param0 >= -47) {
            this.I(-20);
        }
        jaggl.OpenGL.glLightfv(16384, 4611, this.field_G, 0);
        jaggl.OpenGL.glLightfv(16385, 4611, this.field_U, 0);
    }

    final void a(int param0, int param1, pv param2) {
        try {
            this.field_zc[param0] = (sc) ((Object) param2);
            if (param1 < 62) {
                this.A(-86);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "on.BE(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void s(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (this.field_u) {
              break L1;
            } else {
              jaggl.OpenGL.glDisable(3008);
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          jaggl.OpenGL.glEnable(3008);
          break L0;
        }
        var2 = -24 / ((-6 - param0) / 54);
    }

    final rq d(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.field_Pc = (jn) null;
            break L0;
          }
        }
        var3 = param1;
        if (var3 == 3) {
          return (rq) ((Object) new pn((on) (this), this.field_ab));
        } else {
          if ((var3 ^ -1) == -5) {
            return (rq) ((Object) new wj((on) (this), this.field_ab, this.field_Mb));
          } else {
            if (-9 == (var3 ^ -1)) {
              return (rq) ((Object) new ej((on) (this), this.field_ab, this.field_Mb));
            } else {
              return super.d(0, param1);
            }
          }
        }
    }

    final void N(int param0) {
        this.field_Uc = false;
        if (param0 != -26911) {
            this.field_Wc = (String) null;
        }
        this.t((byte) 68);
    }

    final void o(int param0) {
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadMatrixf(this.field_A, 0);
        if (param0 != -2) {
            this.field_Wc = (String) null;
        }
        jaggl.OpenGL.glMatrixMode(5888);
    }

    final void bb(int param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = Sumoblitz.field_L ? 1 : 0;
            if (this.field_l != sr.field_a) {
              break L1;
            } else {
              jaggl.OpenGL.glBlendFunc(770, 771);
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_l != lh.field_n) {
              break L2;
            } else {
              jaggl.OpenGL.glBlendFunc(1, 1);
              if (var3 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          if (gb.field_t == this.field_l) {
            jaggl.OpenGL.glBlendFunc(774, 1);
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == -19519) {
            break L3;
          } else {
            this.field_ad = -66;
            break L3;
          }
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
            this.field_Tc = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_db) {
              break L2;
            } else {
              if (!this.field_i) {
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
          if (!this.field_Dc) {
            break L0;
          } else {
            jaggl.OpenGL.glPopMatrix();
            break L0;
          }
        }
        if (param0 == 68) {
          L1: {
            L2: {
              L3: {
                if (!this.field_s.a(-20011)) {
                  break L3;
                } else {
                  L4: {
                    if (!this.field_Uc) {
                      jaggl.OpenGL.glLoadMatrixf(this.field_Gb.b(-63, pq.field_y), 0);
                      this.field_Uc = true;
                      this.E(-114);
                      this.Y(param0 ^ -25);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (!this.field_Db) {
                      break L5;
                    } else {
                      this.field_Dc = false;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glMultMatrixf(this.field_Lb.b(-79, pq.field_y), 0);
                  this.field_Dc = true;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (!this.field_Db) {
                  break L6;
                } else {
                  jaggl.OpenGL.glLoadIdentity();
                  this.field_Dc = false;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L6;
                  }
                }
              }
              jaggl.OpenGL.glLoadMatrixf(this.field_Lb.b(-110, pq.field_y), 0);
              this.field_Dc = false;
              break L1;
            }
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    final void d() {
        boolean discarded$0 = false;
        super.d();
        if (!(this.field_Yc == null)) {
            discarded$0 = this.field_Yc.a();
            this.field_Yc.release();
            this.field_Yc = null;
        }
    }

    final void b(int param0, int param1) throws rf {
        this.field_Yc.swapBuffers();
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
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("on.OF(");
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
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return (vc) ((Object) stackIn_1_0);
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
                this.field_Wc = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = new go((on) (this), param1, param5, param3, param2, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7);
            stackOut_4_1 = new StringBuilder().append("on.PE(").append(param0).append(',');
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ')');
        }
        return (nh) ((Object) stackIn_3_0);
    }

    final void e() {
        if (this.field_rb <= 0) {
            if (!((this.field_Sb ^ -1) < -1)) {
                return;
            }
        }
        int var1 = this.field_v;
        int var2 = this.field_F;
        int var3 = this.field_vb;
        int var4 = this.field_yc;
        this.m(-16088);
        jaggl.OpenGL.glReadBuffer(1028);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.d(false);
        this.c(false, -32);
        this.d(101, false);
        this.c(47, false);
        this.b(false, 4);
        this.a((ed) null, 120);
        this.a(-2, false, 50, false);
        this.h(40, 1);
        this.e(0, 13);
        jaggl.OpenGL.glMatrixMode(5889);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
        jaggl.OpenGL.glMatrixMode(5888);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRasterPos2i(0, 0);
        jaggl.OpenGL.glCopyPixels(0, 0, this.field_rb, this.field_Sb, 6144);
        jaggl.OpenGL.glFlush();
        jaggl.OpenGL.glReadBuffer(1029);
        jaggl.OpenGL.glDrawBuffer(1029);
        this.KA(var1, var3, var2, var4);
    }

    static {
    }
}
