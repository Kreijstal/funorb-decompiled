/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cq implements jj {
    private boolean field_f;
    private int field_d;
    jc field_g;
    hd field_h;
    la field_c;
    private int field_b;
    int field_e;
    private ke field_a;

    protected final void finalize() throws Throwable {
        int discarded$0 = -1;
        this.b();
        super.finalize();
    }

    private final int c(int param0) {
        if (param0 > -1) {
            ((cq) this).field_d = 80;
        }
        int var2 = ((cq) this).field_b * (((cq) this).field_h.field_b * ((cq) this).field_c.field_c);
        return ((cq) this).field_f ? 4 * var2 / 3 : var2;
    }

    private final void a() {
        ((cq) this).field_g.field_jc = ((cq) this).field_g.field_jc;
        ((cq) this).field_g.field_jc = ((cq) this).field_g.field_jc + this.c(-19);
    }

    public void a(byte param0) {
        if (param0 != -50) {
            ((cq) this).field_c = null;
        }
        int var2 = ((cq) this).field_g.M(7693);
        int var3 = ((cq) this).field_g.field_Hc[var2];
        if (!(var3 == ((cq) this).field_e)) {
            if (!(var3 == 0)) {
                jaggl.OpenGL.glBindTexture(var3, 0);
                jaggl.OpenGL.glDisable(var3);
            }
            jaggl.OpenGL.glEnable(((cq) this).field_e);
            ((cq) this).field_g.field_Hc[var2] = ((cq) this).field_e;
        }
        jaggl.OpenGL.glBindTexture(((cq) this).field_e, ((cq) this).field_d);
    }

    final void a(float[] param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= 0) {
                break L1;
              } else {
                if (!mg.a(param2, (byte) 0)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param3 <= 0) {
                break L2;
              } else {
                if (mg.a(param3, (byte) 103)) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            if (param1) {
              L3: {
                var6_int = ((cq) this).field_h.field_b;
                var7 = 0;
                if (param3 <= param2) {
                  stackOut_12_0 = param3;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = param2;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              var8 = stackIn_13_0;
              var9 = param2 >> 1;
              var10 = param3 >> 1;
              var11 = param0;
              var12 = new float[var6_int * var9 * var10];
              L4: while (true) {
                int discarded$1 = -29824;
                jaggl.OpenGL.glTexImage2Df(param4, var7, ((cq) this).a(false), param2, param3, 0, gq.a(((cq) this).field_h), 5126, var11, 0);
                if (1 >= var8) {
                  break L0;
                } else {
                  var15 = var6_int * param2;
                  var13 = var12;
                  var16 = 0;
                  L5: while (true) {
                    if (var16 >= var6_int) {
                      var12 = var11;
                      param2 = var9;
                      param3 = var10;
                      var11 = var13;
                      var10 = var10 >> 1;
                      var8 = var8 >> 1;
                      var7++;
                      var9 = var9 >> 1;
                      continue L4;
                    } else {
                      var17 = var16;
                      var18 = var16;
                      var19 = var18 + var15;
                      var20 = 0;
                      L6: while (true) {
                        if (var20 >= var10) {
                          var16++;
                          continue L5;
                        } else {
                          var21 = 0;
                          L7: while (true) {
                            if (var21 >= var9) {
                              var19 = var19 + var15;
                              var18 = var18 + var15;
                              var20++;
                              continue L6;
                            } else {
                              var14 = param0[var18];
                              var18 = var18 + var6_int;
                              var14 = var14 + param0[var18];
                              var14 = var14 + param0[var19];
                              var18 = var18 + var6_int;
                              var19 = var19 + var6_int;
                              var14 = var14 + param0[var19];
                              var19 = var19 + var6_int;
                              var12[var17] = var14 * 0.25f;
                              var17 = var17 + var6_int;
                              var21++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("cq.H(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void d() {
        ((cq) this).field_g.a((jj) this, -9135);
        int var2 = 122;
        if (fg.field_A == ((cq) this).field_a) {
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10241, ((cq) this).field_f ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10240, 9729);
        } else {
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10241, ((cq) this).field_f ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10240, 9728);
        }
    }

    private final void b() {
        if (!(((cq) this).field_d <= 0)) {
            ((cq) this).field_g.b(3, this.c(-88), ((cq) this).field_d);
            ((cq) this).field_d = 0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param3) {
                break L1;
              } else {
                if (mg.a(param3, (byte) 114)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (param1 <= 0) {
                break L2;
              } else {
                if (!mg.a(param1, (byte) -117)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            var6_int = ((cq) this).field_h.field_b;
            var7 = 0;
            if (param4 == 107) {
              L3: {
                if (param3 < param1) {
                  stackOut_12_0 = param3;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = param1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              var8 = stackIn_13_0;
              var9 = param3 >> 1;
              var10 = param1 >> 1;
              var11 = param2;
              var12 = new byte[var10 * (var9 * var6_int)];
              L4: while (true) {
                int discarded$1 = -29824;
                jaggl.OpenGL.glTexImage2Dub(param0, var7, ((cq) this).a(false), param3, param1, 0, gq.a(((cq) this).field_h), 5121, var11, 0);
                if (var8 > 1) {
                  var15 = param3 * var6_int;
                  var16 = 0;
                  L5: while (true) {
                    if (var6_int <= var16) {
                      var13 = var12;
                      var12 = var11;
                      param3 = var9;
                      param1 = var10;
                      var11 = var13;
                      var9 = var9 >> 1;
                      var10 = var10 >> 1;
                      var8 = var8 >> 1;
                      var7++;
                      continue L4;
                    } else {
                      var17 = var16;
                      var18 = var16;
                      var19 = var15 + var18;
                      var20 = 0;
                      L6: while (true) {
                        if (var10 <= var20) {
                          var16++;
                          continue L5;
                        } else {
                          var21 = 0;
                          L7: while (true) {
                            if (var21 >= var9) {
                              var18 = var18 + var15;
                              var19 = var19 + var15;
                              var20++;
                              continue L6;
                            } else {
                              var14 = param2[var18];
                              var18 = var18 + var6_int;
                              var14 = var14 + param2[var18];
                              var18 = var18 + var6_int;
                              var14 = var14 + param2[var19];
                              var19 = var19 + var6_int;
                              var14 = var14 + param2[var19];
                              var19 = var19 + var6_int;
                              var12[var17] = (byte)(var14 >> 2);
                              var17 = var17 + var6_int;
                              var21++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("cq.D(").append(param0).append(44).append(param1).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(byte param0, int param1, int param2, int[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var26 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= 0) {
                break L1;
              } else {
                if (!mg.a(param2, (byte) -12)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 <= 0) {
                break L2;
              } else {
                if (!mg.a(param1, (byte) 118)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            if (lc.field_g == ((cq) this).field_h) {
              L3: {
                var6_int = 0;
                if (param1 > param2) {
                  stackOut_13_0 = param2;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = param1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var7 = stackIn_14_0;
              var8 = param2 >> 1;
              var9 = param1 >> 1;
              var10 = param3;
              var11 = new int[var8 * var9];
              if (param0 == -110) {
                L4: while (true) {
                  jaggl.OpenGL.glTexImage2Di(param4, var6_int, ((cq) this).a(false), param2, param1, 0, 32993, ((cq) this).field_g.field_Bc, var10, 0);
                  if (var7 > 1) {
                    var13 = 0;
                    var22 = 0;
                    var23 = param2 + var22;
                    var24 = 0;
                    L5: while (true) {
                      if (var24 >= var9) {
                        var12 = var11;
                        var11 = var10;
                        var10 = var12;
                        param1 = var9;
                        param2 = var8;
                        var9 = var9 >> 1;
                        var6_int++;
                        var8 = var8 >> 1;
                        var7 = var7 >> 1;
                        continue L4;
                      } else {
                        var25 = 0;
                        L6: while (true) {
                          if (var8 <= var25) {
                            var23 = var23 + param2;
                            var22 = var22 + param2;
                            var24++;
                            continue L5;
                          } else {
                            int incrementValue$5 = var22;
                            var22++;
                            var14 = var10[incrementValue$5];
                            int incrementValue$6 = var23;
                            var23++;
                            var16 = var10[incrementValue$6];
                            int incrementValue$7 = var22;
                            var22++;
                            var15 = var10[incrementValue$7];
                            var20 = var14 & 255;
                            var19 = 255 & var14 >> 8;
                            var21 = var14 >> 24 & 255;
                            var18 = 255 & var14 >> 16;
                            int incrementValue$8 = var23;
                            var23++;
                            var17 = var10[incrementValue$8];
                            var18 = var18 + (var15 >> 16 & 255);
                            var19 = var19 + (255 & var15 >> 8);
                            var21 = var21 + (var15 >> 24 & 255);
                            var20 = var20 + (var15 & 255);
                            var18 = var18 + ((16731470 & var16) >> 16);
                            var19 = var19 + ((65356 & var16) >> 8);
                            var20 = var20 + (var16 & 255);
                            var21 = var21 + (var16 >> 24 & 255);
                            var21 = var21 + (255 & var17 >> 24);
                            var20 = var20 + (255 & var17);
                            var19 = var19 + (var17 >> 8 & 255);
                            var18 = var18 + (255 & var17 >> 16);
                            int incrementValue$9 = var13;
                            var13++;
                            var11[incrementValue$9] = vo.a(pg.a(255, var20 >> 2), vo.a(vo.a(pg.a(1020, var18) << 14, pg.a(var21, 1020) << 22), pg.a(var19 << 6, 65280)));
                            var25++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                return;
              }
            } else {
              throw new IllegalArgumentException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("cq.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param4 + 41);
        }
    }

    final int a(boolean param0) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            int discarded$1 = ((cq) this).a(true);
            break L0;
          }
        }
        L1: {
          if (((cq) this).field_c != la.field_h) {
            if (((cq) this).field_c == la.field_d) {
              if (((cq) this).field_h == wo.field_n) {
                return 34843;
              } else {
                if (((cq) this).field_h == lc.field_g) {
                  return 34842;
                } else {
                  if (((cq) this).field_h != ro.field_o) {
                    if (((cq) this).field_h == wf.field_d) {
                      return 34846;
                    } else {
                      if (hh.field_c == ((cq) this).field_h) {
                        return 34847;
                      } else {
                        if (((cq) this).field_h == aj.field_r) {
                          return 6145;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    return 34844;
                  }
                }
              }
            } else {
              if (((cq) this).field_c != la.field_i) {
                break L1;
              } else {
                if (((cq) this).field_h != wo.field_n) {
                  if (lc.field_g == ((cq) this).field_h) {
                    return 34836;
                  } else {
                    if (ro.field_o == ((cq) this).field_h) {
                      return 34838;
                    } else {
                      if (wf.field_d == ((cq) this).field_h) {
                        return 34840;
                      } else {
                        if (hh.field_c != ((cq) this).field_h) {
                          if (((cq) this).field_h == aj.field_r) {
                            return 6145;
                          } else {
                            break L1;
                          }
                        } else {
                          return 34841;
                        }
                      }
                    }
                  }
                } else {
                  return 34837;
                }
              }
            }
          } else {
            if (wo.field_n != ((cq) this).field_h) {
              if (lc.field_g != ((cq) this).field_h) {
                if (((cq) this).field_h != ro.field_o) {
                  if (((cq) this).field_h != wf.field_d) {
                    if (((cq) this).field_h == hh.field_c) {
                      return 6410;
                    } else {
                      if (((cq) this).field_h != aj.field_r) {
                        break L1;
                      } else {
                        return 6145;
                      }
                    }
                  } else {
                    return 6409;
                  }
                } else {
                  return 6406;
                }
              } else {
                return 6408;
              }
            } else {
              return 6407;
            }
          }
        }
        throw new IllegalStateException();
    }

    cq(jc param0, int param1, hd param2, la param3, int param4, boolean param5) {
        ((cq) this).field_a = fg.field_A;
        try {
            ((cq) this).field_e = param1;
            ((cq) this).field_h = param2;
            ((cq) this).field_g = param0;
            ((cq) this).field_f = param5 ? true : false;
            ((cq) this).field_b = param4;
            ((cq) this).field_c = param3;
            jaggl.OpenGL.glGenTextures(1, tn.field_w, 0);
            ((cq) this).field_d = tn.field_w[0];
            int discarded$0 = 127;
            this.d();
            int discarded$1 = 4;
            int discarded$2 = 0;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "cq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    public void a(ke param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (((cq) this).field_a == param0) {
                break L1;
              } else {
                ((cq) this).field_a = param0;
                int discarded$2 = 127;
                this.d();
                break L1;
              }
            }
            L2: {
              if (param1 == -31662) {
                break L2;
              } else {
                var4 = null;
                ((cq) this).a((ke) null, 89);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("cq.A(");
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    static {
    }
}
