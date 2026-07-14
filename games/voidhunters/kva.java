/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kva implements ura {
    private int field_a;
    kb field_f;
    jp field_h;
    private int field_d;
    private boolean field_c;
    mj field_b;
    private tu field_i;
    static int field_g;
    int field_e;

    protected final void finalize() throws Throwable {
        this.d(3);
        super.finalize();
    }

    private final void d(int param0) {
        if (param0 != 3) {
            return;
        }
        if (-1 > (((kva) this).field_a ^ -1)) {
            ((kva) this).field_h.b(((kva) this).field_a, 117, this.c((byte) 61));
            ((kva) this).field_a = 0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, int param4) {
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
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var22 = VoidHunters.field_G;
          if (0 >= param4) {
            break L0;
          } else {
            if (!bd.a(param4, (byte) -95)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1 <= (param1 ^ -1)) {
            break L1;
          } else {
            if (bd.a(param1, (byte) -95)) {
              break L1;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L2: {
          var6 = ((kva) this).field_f.field_a;
          var7 = param3;
          if (param4 < param1) {
            stackOut_9_0 = param4;
            stackIn_10_0 = stackOut_9_0;
            break L2;
          } else {
            stackOut_8_0 = param1;
            stackIn_10_0 = stackOut_8_0;
            break L2;
          }
        }
        var8 = stackIn_10_0;
        var9 = param4 >> -972922015;
        var10 = param1 >> 1575933473;
        var11 = param2;
        var12 = new byte[var6 * var9 * var10];
        L3: while (true) {
          jaggl.OpenGL.glTexImage2Dub(param0, var7, ((kva) this).e((byte) -31), param4, param1, 0, una.a(param3 + -29328, ((kva) this).field_f), 5121, var11, 0);
          if (var8 <= 1) {
            return;
          } else {
            var15 = param4 * var6;
            var13 = var12;
            var16 = 0;
            L4: while (true) {
              if (var6 <= var16) {
                var12 = var11;
                param1 = var10;
                param4 = var9;
                var11 = var13;
                var10 = var10 >> 1;
                var9 = var9 >> 1;
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
                      if (var9 <= var21) {
                        var18 = var18 + var15;
                        var19 = var19 + var15;
                        var20++;
                        continue L5;
                      } else {
                        var14 = param2[var18];
                        var18 = var18 + var6;
                        var14 = var14 + param2[var18];
                        var14 = var14 + param2[var19];
                        var18 = var18 + var6;
                        var19 = var19 + var6;
                        var14 = var14 + param2[var19];
                        var19 = var19 + var6;
                        var12[var17] = (byte)(var14 >> -1751429886);
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
    }

    final int e(byte param0) {
        Object var3 = null;
        L0: {
          if (param0 == -31) {
            break L0;
          } else {
            var3 = null;
            ((kva) this).a((tu) null, 94);
            break L0;
          }
        }
        L1: {
          if (mj.field_f == ((kva) this).field_b) {
            if (((kva) this).field_f != ep.field_o) {
              if (qua.field_d == ((kva) this).field_f) {
                return 6408;
              } else {
                if (((kva) this).field_f != nw.field_p) {
                  if (((kva) this).field_f != gka.field_p) {
                    if (wh.field_o != ((kva) this).field_f) {
                      if (qf.field_o != ((kva) this).field_f) {
                        break L1;
                      } else {
                        return 6145;
                      }
                    } else {
                      return 6410;
                    }
                  } else {
                    return 6409;
                  }
                } else {
                  return 6406;
                }
              }
            } else {
              return 6407;
            }
          } else {
            if (((kva) this).field_b == mj.field_b) {
              if (((kva) this).field_f != ep.field_o) {
                if (((kva) this).field_f == qua.field_d) {
                  return 34842;
                } else {
                  if (nw.field_p != ((kva) this).field_f) {
                    if (((kva) this).field_f == gka.field_p) {
                      return 34846;
                    } else {
                      if (((kva) this).field_f != wh.field_o) {
                        if (qf.field_o == ((kva) this).field_f) {
                          return 6145;
                        } else {
                          break L1;
                        }
                      } else {
                        return 34847;
                      }
                    }
                  } else {
                    return 34844;
                  }
                }
              } else {
                return 34843;
              }
            } else {
              if (mj.field_d == ((kva) this).field_b) {
                if (ep.field_o == ((kva) this).field_f) {
                  return 34837;
                } else {
                  if (qua.field_d != ((kva) this).field_f) {
                    if (nw.field_p != ((kva) this).field_f) {
                      if (((kva) this).field_f == gka.field_p) {
                        return 34840;
                      } else {
                        if (((kva) this).field_f == wh.field_o) {
                          return 34841;
                        } else {
                          if (((kva) this).field_f == qf.field_o) {
                            return 6145;
                          } else {
                            break L1;
                          }
                        }
                      }
                    } else {
                      return 34838;
                    }
                  } else {
                    return 34836;
                  }
                }
              } else {
                break L1;
              }
            }
          }
        }
        throw new IllegalStateException();
    }

    public void a(tu param0, int param1) {
        if (param1 != -28798) {
            return;
        }
        if (((kva) this).field_i != param0) {
            ((kva) this).field_i = param0;
            this.c(0);
        }
    }

    private final int c(byte param0) {
        int var2 = ((kva) this).field_f.field_a * ((kva) this).field_b.field_h * ((kva) this).field_d;
        if (param0 != 61) {
            return -71;
        }
        return !((kva) this).field_c ? var2 : 4 * var2 / 3;
    }

    private final void c(int param0) {
        if (param0 != 0) {
            return;
        }
        ((kva) this).field_h.a((ura) this, -114);
        if (cs.field_a == ((kva) this).field_i) {
            jaggl.OpenGL.glTexParameteri(((kva) this).field_e, 10241, !((kva) this).field_c ? 9729 : 9987);
            jaggl.OpenGL.glTexParameteri(((kva) this).field_e, 10240, 9729);
        } else {
            jaggl.OpenGL.glTexParameteri(((kva) this).field_e, 10241, ((kva) this).field_c ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(((kva) this).field_e, 10240, 9728);
        }
    }

    final void a(int param0, float[] param1, int param2, int param3, byte param4) {
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
          var22 = VoidHunters.field_G;
          if (param4 == -67) {
            break L0;
          } else {
            ((kva) this).field_d = -65;
            break L0;
          }
        }
        L1: {
          if ((param3 ^ -1) >= -1) {
            break L1;
          } else {
            if (bd.a(param3, (byte) -95)) {
              break L1;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L2: {
          if (param2 <= 0) {
            break L2;
          } else {
            if (!bd.a(param2, (byte) -95)) {
              throw new IllegalArgumentException("");
            } else {
              break L2;
            }
          }
        }
        L3: {
          var6 = ((kva) this).field_f.field_a;
          var7 = 0;
          if (param3 < param2) {
            stackOut_11_0 = param3;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = param2;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = param3 >> 612311169;
        var10 = param2 >> 1160696641;
        var11 = param1;
        var12 = new float[var6 * (var9 * var10)];
        L4: while (true) {
          jaggl.OpenGL.glTexImage2Df(param0, var7, ((kva) this).e((byte) -31), param3, param2, 0, una.a(param4 + -29261, ((kva) this).field_f), 5126, var11, 0);
          if (var8 <= 1) {
            return;
          } else {
            var15 = param3 * var6;
            var13 = var12;
            var16 = 0;
            L5: while (true) {
              if (var16 >= var6) {
                var12 = var11;
                param2 = var10;
                var11 = var13;
                param3 = var9;
                var7++;
                var10 = var10 >> 1;
                var9 = var9 >> 1;
                var8 = var8 >> 1;
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
                      if (var9 <= var21) {
                        var19 = var19 + var15;
                        var18 = var18 + var15;
                        var20++;
                        continue L6;
                      } else {
                        var14 = param1[var18];
                        var18 = var18 + var6;
                        var14 = var14 + param1[var18];
                        var18 = var18 + var6;
                        var14 = var14 + param1[var19];
                        var19 = var19 + var6;
                        var14 = var14 + param1[var19];
                        var19 = var19 + var6;
                        var12[var17] = 0.25f * var14;
                        var17 = var17 + var6;
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
    }

    private final void a(int param0, byte param1) {
        if (param1 > -12) {
            ((kva) this).b(-102);
        }
        ((kva) this).field_h.field_Nb = ((kva) this).field_h.field_Nb - param0;
        ((kva) this).field_h.field_Nb = ((kva) this).field_h.field_Nb + this.c((byte) 61);
    }

    final static void d(byte param0) {
        dp.field_a = null;
        fhb.field_q = null;
        if (!(lsa.field_e == null)) {
            fgb.field_l = umb.field_d;
            bpa.field_c = lsa.field_e;
            lsa.field_e = null;
            umb.field_d = null;
            bpa.field_c.field_qb = -1;
            bpa.field_c.field_ib = -1;
        }
        hp.field_b = null;
        gba.field_p = null;
        if (param0 > -15) {
            kva.d((byte) -19);
        }
        qw.field_l = null;
        fva.field_p = true;
    }

    final void a(byte param0, int param1, int param2, int param3, int[] param4) {
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
          var26 = VoidHunters.field_G;
          if (-1 <= (param3 ^ -1)) {
            break L0;
          } else {
            if (bd.a(param3, (byte) -95)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if (param2 <= 0) {
            break L1;
          } else {
            if (!bd.a(param2, (byte) -95)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        if (qua.field_d != ((kva) this).field_f) {
          throw new IllegalArgumentException("");
        } else {
          L2: {
            var6 = 0;
            if (param2 > param3) {
              stackOut_12_0 = param3;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            } else {
              stackOut_11_0 = param2;
              stackIn_13_0 = stackOut_11_0;
              break L2;
            }
          }
          L3: {
            var7 = stackIn_13_0;
            var8 = param3 >> 238496993;
            if (param0 == 14) {
              break L3;
            } else {
              ((kva) this).field_c = true;
              break L3;
            }
          }
          var9 = param2 >> 1515896609;
          var10 = param4;
          var11 = new int[var9 * var8];
          L4: while (true) {
            jaggl.OpenGL.glTexImage2Di(param1, var6, ((kva) this).e((byte) -31), param3, param2, 0, 32993, ((kva) this).field_h.field_Nc, var10, 0);
            if ((var7 ^ -1) < -2) {
              var13 = 0;
              var22 = 0;
              var23 = var22 + param3;
              var12 = var11;
              var24 = 0;
              L5: while (true) {
                if (var24 >= var9) {
                  var11 = var10;
                  param3 = var8;
                  var10 = var12;
                  param2 = var9;
                  var9 = var9 >> 1;
                  var7 = var7 >> 1;
                  var8 = var8 >> 1;
                  var6++;
                  continue L4;
                } else {
                  var25 = 0;
                  L6: while (true) {
                    if (var25 >= var8) {
                      var23 = var23 + param3;
                      var22 = var22 + param3;
                      var24++;
                      continue L5;
                    } else {
                      var22++;
                      var14 = var10[var22];
                      var22++;
                      var15 = var10[var22];
                      var23++;
                      var16 = var10[var23];
                      var19 = (var14 & 65483) >> 1407788200;
                      var18 = var14 >> -244070896 & 255;
                      var21 = var14 >> 1317818200 & 255;
                      var23++;
                      var17 = var10[var23];
                      var20 = var14 & 255;
                      var18 = var18 + ((var15 & 16720391) >> -1126560912);
                      var20 = var20 + (255 & var15);
                      var21 = var21 + (255 & var15 >> -656182344);
                      var19 = var19 + (var15 >> -828132888 & 255);
                      var20 = var20 + (255 & var16);
                      var19 = var19 + ((var16 & 65325) >> -680736280);
                      var21 = var21 + (var16 >> -1786598696 & 255);
                      var18 = var18 + (255 & var16 >> 2139943088);
                      var20 = var20 + (var17 & 255);
                      var19 = var19 + (255 & var17 >> 1087795048);
                      var18 = var18 + (var17 >> 1100364304 & 255);
                      var21 = var21 + (255 & var17 >> 1362358424);
                      var13++;
                      var11[var13] = knb.a(dla.a(255, var20 >> -491805886), knb.a(dla.a(1020, var19) << 1886946630, knb.a(dla.a(var21, 1020) << -1210041578, dla.a(16711680, var18 << -1832933618))));
                      var25++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public void b(int param0) {
        if (param0 != -27445) {
            return;
        }
        int var2 = ((kva) this).field_h.t((byte) 9);
        int var3 = ((kva) this).field_h.field_Wc[var2];
        if (var3 != ((kva) this).field_e) {
            if (!(var3 == 0)) {
                jaggl.OpenGL.glBindTexture(var3, 0);
                jaggl.OpenGL.glDisable(var3);
            }
            jaggl.OpenGL.glEnable(((kva) this).field_e);
            ((kva) this).field_h.field_Wc[var2] = ((kva) this).field_e;
        }
        jaggl.OpenGL.glBindTexture(((kva) this).field_e, ((kva) this).field_a);
    }

    kva(jp param0, int param1, kb param2, mj param3, int param4, boolean param5) {
        ((kva) this).field_i = cs.field_a;
        ((kva) this).field_h = param0;
        ((kva) this).field_d = param4;
        ((kva) this).field_b = param3;
        ((kva) this).field_e = param1;
        ((kva) this).field_c = param5 ? true : false;
        ((kva) this).field_f = param2;
        jaggl.OpenGL.glGenTextures(1, uqa.field_o, 0);
        ((kva) this).field_a = uqa.field_o[0];
        this.c(0);
        this.a(0, (byte) -118);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 512;
    }
}
