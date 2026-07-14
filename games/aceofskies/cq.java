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
        this.b(-1);
        this.finalize();
    }

    private final int c(int param0) {
        if (param0 > -1) {
            ((cq) this).field_d = 80;
        }
        int var2 = ((cq) this).field_b * (((cq) this).field_h.field_b * ((cq) this).field_c.field_c);
        return ((cq) this).field_f ? 4 * var2 / 3 : var2;
    }

    private final void a(int param0, int param1) {
        ((cq) this).field_g.field_jc = ((cq) this).field_g.field_jc - param0;
        ((cq) this).field_g.field_jc = ((cq) this).field_g.field_jc + this.c(-19);
        if (param1 != 4) {
            int discarded$0 = ((cq) this).a(false);
        }
    }

    public void a(byte param0) {
        if (param0 != -50) {
            ((cq) this).field_c = (la) null;
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
        int var6 = 0;
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
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var22 = AceOfSkies.field_G ? 1 : 0;
          if (-1 <= (param2 ^ -1)) {
            break L0;
          } else {
            if (!mg.a(param2, (byte) 0)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param3 <= 0) {
            break L1;
          } else {
            if (mg.a(param3, (byte) 103)) {
              break L1;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        if (param1) {
          L2: {
            var6 = ((cq) this).field_h.field_b;
            var7 = 0;
            if (param3 <= param2) {
              stackOut_11_0 = param3;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = param2;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          var8 = stackIn_12_0;
          var9 = param2 >> 2104898433;
          var10 = param3 >> -1557392031;
          var11 = param0;
          var12 = new float[var6 * var9 * var10];
          L3: while (true) {
            jaggl.OpenGL.glTexImage2Df(param4, var7, ((cq) this).a(false), param2, param3, 0, gq.a(((cq) this).field_h, -29824), 5126, var11, 0);
            if (1 >= var8) {
              return;
            } else {
              var15 = var6 * param2;
              var13 = var12;
              var16 = 0;
              L4: while (true) {
                if (var16 >= var6) {
                  var12 = var11;
                  param2 = var9;
                  param3 = var10;
                  var11 = var13;
                  var10 = var10 >> 1;
                  var8 = var8 >> 1;
                  var7++;
                  var9 = var9 >> 1;
                  continue L3;
                } else {
                  var17 = var16;
                  var18 = var16;
                  var19 = var18 + var15;
                  var20 = 0;
                  L5: while (true) {
                    if (var20 >= var10) {
                      var16++;
                      continue L4;
                    } else {
                      var21 = 0;
                      L6: while (true) {
                        if (var21 >= var9) {
                          var19 = var19 + var15;
                          var18 = var18 + var15;
                          var20++;
                          continue L5;
                        } else {
                          var14 = param0[var18];
                          var18 = var18 + var6;
                          var14 = var14 + param0[var18];
                          var14 = var14 + param0[var19];
                          var18 = var18 + var6;
                          var19 = var19 + var6;
                          var14 = var14 + param0[var19];
                          var19 = var19 + var6;
                          var12[var17] = var14 * 0.25f;
                          var17 = var17 + var6;
                          var21++;
                          continue L6;
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

    private final void d(byte param0) {
        ((cq) this).field_g.a((jj) this, -9135);
        int var2 = 122 / ((param0 - 86) / 39);
        if (fg.field_A == ((cq) this).field_a) {
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10241, ((cq) this).field_f ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10240, 9729);
        } else {
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10241, ((cq) this).field_f ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(((cq) this).field_e, 10240, 9728);
        }
    }

    private final void b(int param0) {
        if (!(param0 <= (((cq) this).field_d ^ -1))) {
            ((cq) this).field_g.b(param0 + 4, this.c(-88), ((cq) this).field_d);
            ((cq) this).field_d = 0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, byte param4) {
        int var6 = 0;
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
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var22 = AceOfSkies.field_G ? 1 : 0;
          if (0 >= param3) {
            break L0;
          } else {
            if (mg.a(param3, (byte) 114)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if ((param1 ^ -1) >= -1) {
            break L1;
          } else {
            if (!mg.a(param1, (byte) -117)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        var6 = ((cq) this).field_h.field_b;
        var7 = 0;
        if (param4 == 107) {
          L2: {
            if (param3 < param1) {
              stackOut_11_0 = param3;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = param1;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          var8 = stackIn_12_0;
          var9 = param3 >> -1238162815;
          var10 = param1 >> -86365791;
          var11 = param2;
          var12 = new byte[var10 * (var9 * var6)];
          L3: while (true) {
            jaggl.OpenGL.glTexImage2Dub(param0, var7, ((cq) this).a(false), param3, param1, 0, gq.a(((cq) this).field_h, -29824), 5121, var11, 0);
            if ((var8 ^ -1) < -2) {
              var15 = param3 * var6;
              var16 = 0;
              L4: while (true) {
                if (var6 <= var16) {
                  var13 = var12;
                  var12 = var11;
                  param3 = var9;
                  param1 = var10;
                  var11 = var13;
                  var9 = var9 >> 1;
                  var10 = var10 >> 1;
                  var8 = var8 >> 1;
                  var7++;
                  continue L3;
                } else {
                  var17 = var16;
                  var18 = var16;
                  var19 = var15 + var18;
                  var20 = 0;
                  L5: while (true) {
                    if (var10 <= var20) {
                      var16++;
                      continue L4;
                    } else {
                      var21 = 0;
                      L6: while (true) {
                        if (var21 >= var9) {
                          var18 = var18 + var15;
                          var19 = var19 + var15;
                          var20++;
                          continue L5;
                        } else {
                          var14 = param2[var18];
                          var18 = var18 + var6;
                          var14 = var14 + param2[var18];
                          var18 = var18 + var6;
                          var14 = var14 + param2[var19];
                          var19 = var19 + var6;
                          var14 = var14 + param2[var19];
                          var19 = var19 + var6;
                          var12[var17] = (byte)(var14 >> -2027735838);
                          var17 = var17 + var6;
                          var21++;
                          continue L6;
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
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int[] param3, int param4) {
        int var6 = 0;
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
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var26 = AceOfSkies.field_G ? 1 : 0;
          if (-1 <= (param2 ^ -1)) {
            break L0;
          } else {
            if (!mg.a(param2, (byte) -12)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((param1 ^ -1) >= -1) {
            break L1;
          } else {
            if (!mg.a(param1, (byte) 118)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        if (lc.field_g == ((cq) this).field_h) {
          L2: {
            var6 = 0;
            if (param1 > param2) {
              stackOut_12_0 = param2;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            } else {
              stackOut_11_0 = param1;
              stackIn_13_0 = stackOut_11_0;
              break L2;
            }
          }
          var7 = stackIn_13_0;
          var8 = param2 >> -1296413247;
          var9 = param1 >> -1433903551;
          var10 = param3;
          var11 = new int[var8 * var9];
          if (param0 == -110) {
            L3: while (true) {
              jaggl.OpenGL.glTexImage2Di(param4, var6, ((cq) this).a(false), param2, param1, 0, 32993, ((cq) this).field_g.field_Bc, var10, 0);
              if (-2 > (var7 ^ -1)) {
                var13 = 0;
                var22 = 0;
                var23 = param2 + var22;
                var24 = 0;
                L4: while (true) {
                  if (var24 >= var9) {
                    var12 = var11;
                    var11 = var10;
                    var10 = var12;
                    param1 = var9;
                    param2 = var8;
                    var9 = var9 >> 1;
                    var6++;
                    var8 = var8 >> 1;
                    var7 = var7 >> 1;
                    continue L3;
                  } else {
                    var25 = 0;
                    L5: while (true) {
                      if (var8 <= var25) {
                        var23 = var23 + param2;
                        var22 = var22 + param2;
                        var24++;
                        continue L4;
                      } else {
                        var22++;
                        var14 = var10[var22];
                        var23++;
                        var16 = var10[var23];
                        var22++;
                        var15 = var10[var22];
                        var20 = var14 & 255;
                        var19 = 255 & var14 >> -1008674104;
                        var21 = var14 >> -825216584 & 255;
                        var18 = 255 & var14 >> -1205755408;
                        var23++;
                        var17 = var10[var23];
                        var18 = var18 + (var15 >> 263809488 & 255);
                        var19 = var19 + (255 & var15 >> -1170739256);
                        var21 = var21 + (var15 >> 1561325624 & 255);
                        var20 = var20 + (var15 & 255);
                        var18 = var18 + ((16731470 & var16) >> -959158672);
                        var19 = var19 + ((65356 & var16) >> 1467464712);
                        var20 = var20 + (var16 & 255);
                        var21 = var21 + (var16 >> -317689480 & 255);
                        var21 = var21 + (255 & var17 >> -1690508456);
                        var20 = var20 + (255 & var17);
                        var19 = var19 + (var17 >> 2031080136 & 255);
                        var18 = var18 + (255 & var17 >> -1944694064);
                        var13++;
                        var11[var13] = vo.a(pg.a(255, var20 >> -1923393182), vo.a(vo.a(pg.a(1020, var18) << -51469618, pg.a(var21, 1020) << 2002769718), pg.a(var19 << -841166074, 65280)));
                        var25++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          throw new IllegalArgumentException("");
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
        ((cq) this).field_e = param1;
        ((cq) this).field_h = param2;
        ((cq) this).field_g = param0;
        ((cq) this).field_f = param5 ? true : false;
        ((cq) this).field_b = param4;
        ((cq) this).field_c = param3;
        jaggl.OpenGL.glGenTextures(1, tn.field_w, 0);
        ((cq) this).field_d = tn.field_w[0];
        this.d((byte) 127);
        this.a(0, 4);
    }

    public void a(ke param0, int param1) {
        if (((cq) this).field_a != param0) {
            ((cq) this).field_a = param0;
            this.d((byte) 127);
        }
        if (param1 != -31662) {
            ke var4 = (ke) null;
            ((cq) this).a((ke) null, 89);
        }
    }

    static {
    }
}
