/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bp implements ed {
    private ji field_a;
    private boolean field_d;
    int field_h;
    on field_e;
    private int field_f;
    io field_g;
    iw field_c;
    private int field_b;

    final void a(int param0, int param1, int[] param2, int param3, int param4) {
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
          var26 = Sumoblitz.field_L ? 1 : 0;
          if (param1 >= param4) {
            break L0;
          } else {
            if (rm.a(param1, -108)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if (-1 >= param0) {
            break L1;
          } else {
            if (!rm.a(param0, -127)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        if (((bp) this).field_c != nl.field_p) {
          throw new IllegalArgumentException("");
        } else {
          L2: {
            var6 = 0;
            if (param0 <= param1) {
              stackOut_12_0 = param0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            } else {
              stackOut_11_0 = param1;
              stackIn_13_0 = stackOut_11_0;
              break L2;
            }
          }
          var7 = stackIn_13_0;
          var8 = param1 >> -1527941855;
          var9 = param0 >> -1750721919;
          var10 = param2;
          var11 = new int[var9 * var8];
          L3: while (true) {
            jaggl.OpenGL.glTexImage2Di(param3, var6, ((bp) this).e(param4 + 101), param1, param0, 0, 32993, ((bp) this).field_e.field_Ec, var10, 0);
            if (var7 > 1) {
              var13 = 0;
              var22 = 0;
              var23 = var22 - -param1;
              var12 = var11;
              var24 = 0;
              L4: while (true) {
                if (var9 <= var24) {
                  var11 = var10;
                  param0 = var9;
                  param1 = var8;
                  var10 = var12;
                  var6++;
                  var7 = var7 >> 1;
                  var8 = var8 >> 1;
                  var9 = var9 >> 1;
                  continue L3;
                } else {
                  var25 = 0;
                  L5: while (true) {
                    if (var8 <= var25) {
                      var22 = var22 + param1;
                      var23 = var23 + param1;
                      var24++;
                      continue L4;
                    } else {
                      var22++;
                      var14 = var10[var22];
                      var23++;
                      var16 = var10[var23];
                      var22++;
                      var15 = var10[var22];
                      var21 = 255 & var14 >> -579678952;
                      var18 = 255 & var14 >> 370863056;
                      var20 = 255 & var14;
                      var23++;
                      var17 = var10[var23];
                      var19 = (65493 & var14) >> 2074770600;
                      var20 = var20 + (255 & var15);
                      var18 = var18 + ((16770131 & var15) >> -585212752);
                      var21 = var21 + (var15 >> 263869080 & 255);
                      var19 = var19 + (var15 >> -1359596440 & 255);
                      var18 = var18 + (var16 >> 269135280 & 255);
                      var21 = var21 + (255 & var16 >> 1619277144);
                      var20 = var20 + (255 & var16);
                      var19 = var19 + (255 & var16 >> 917921640);
                      var20 = var20 + (255 & var17);
                      var19 = var19 + ((var17 & 65361) >> 882928968);
                      var18 = var18 + ((var17 & 16719727) >> 843582288);
                      var21 = var21 + (var17 >> -1688071080 & 255);
                      var13++;
                      var11[var13] = ic.a(eb.a(1020, var20) >> -1739142110, ic.a(eb.a(1020, var19) << 597537094, ic.a(eb.a(16711680, var18 << -1199202834), eb.a(var21, 1020) << -491897674)));
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
        }
    }

    final static int g(int param0) {
        if (2 > mp.field_a) {
            return 0;
        }
        if (param0 != 14296) {
            return -117;
        }
        if (dk.field_c != 0) {
            if (null != hd.field_H) {
                if (!hd.field_H.b((byte) 127)) {
                    return 14;
                }
                if (!hd.field_H.b((byte) -98, "")) {
                    return 29;
                }
                if (!(hd.field_H.a("", 100))) {
                    return 29;
                }
            }
            if (!(wd.field_j.b((byte) 127))) {
                return 43;
            }
            if (!wd.field_j.a("commonui", param0 ^ 14268)) {
                return 57;
            }
            if (!(eb.field_f.b((byte) 127))) {
                return 71;
            }
            if (!eb.field_f.a("commonui", 100)) {
                return 80;
            }
            if (!(hw.field_a.b((byte) 127))) {
                return 82;
            }
            // ifne L273
            return 86;
        }
        if (!(wd.field_j.b((byte) 127))) {
            return 20;
        }
        if (!wd.field_j.a("commonui", 100)) {
            return 40;
        }
        if (!eb.field_f.b((byte) 127)) {
            return 50;
        }
        if (!eb.field_f.a("commonui", 100)) {
            return 60;
        }
        if (!(hw.field_a.b((byte) 127))) {
            return 70;
        }
        if (!hw.field_a.a(true)) {
            return 80;
        }
        return 100;
    }

    final void a(int param0, int param1, int param2, int param3, float[] param4) {
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
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var22 = Sumoblitz.field_L ? 1 : 0;
          if (param3 <= 0) {
            break L0;
          } else {
            if (!rm.a(param3, -102)) {
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
            if (!rm.a(param1, -102)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        L2: {
          var6 = ((bp) this).field_c.field_c;
          var7 = 0;
          if (param1 <= param3) {
            stackOut_10_0 = param1;
            stackIn_11_0 = stackOut_10_0;
            break L2;
          } else {
            stackOut_9_0 = param3;
            stackIn_11_0 = stackOut_9_0;
            break L2;
          }
        }
        var8 = stackIn_11_0;
        var9 = param3 >> -1590570239;
        if (param2 < -115) {
          var10 = param1 >> -1865914367;
          var11 = param4;
          var12 = new float[var6 * (var9 * var10)];
          L3: while (true) {
            jaggl.OpenGL.glTexImage2Df(param0, var7, ((bp) this).e(-107), param3, param1, 0, te.a(-21339, ((bp) this).field_c), 5126, var11, 0);
            if (var8 > 1) {
              var15 = var6 * param3;
              var13 = var12;
              var16 = 0;
              L4: while (true) {
                if (var6 <= var16) {
                  var12 = var11;
                  param1 = var10;
                  var11 = var13;
                  param3 = var9;
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
                    if (var20 >= var10) {
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
                          var14 = param4[var18];
                          var18 = var18 + var6;
                          var14 = var14 + param4[var18];
                          var18 = var18 + var6;
                          var14 = var14 + param4[var19];
                          var19 = var19 + var6;
                          var14 = var14 + param4[var19];
                          var12[var17] = var14 * 0.25f;
                          var19 = var19 + var6;
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

    final void a(byte[] param0, int param1, int param2, int param3, int param4) {
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
        Object var23 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var22 = Sumoblitz.field_L ? 1 : 0;
          if (-1 <= param1) {
            break L0;
          } else {
            if (rm.a(param1, -102)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if (-1 >= param3) {
            break L1;
          } else {
            if (!rm.a(param3, -116)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        L2: {
          var6 = ((bp) this).field_c.field_c;
          if (param4 >= 33) {
            break L2;
          } else {
            var23 = null;
            ((bp) this).a(30, -125, (int[]) null, 92, 74);
            break L2;
          }
        }
        L3: {
          var7 = 0;
          if (param3 <= param1) {
            stackOut_11_0 = param3;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = param1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var8 = stackIn_12_0;
        var9 = param1 >> 1356208065;
        var10 = param3 >> -681452095;
        var11 = param0;
        var12 = new byte[var6 * (var10 * var9)];
        L4: while (true) {
          jaggl.OpenGL.glTexImage2Dub(param2, var7, ((bp) this).e(-89), param1, param3, 0, te.a(-21339, ((bp) this).field_c), 5121, var11, 0);
          if (1 < var8) {
            var15 = var6 * param1;
            var16 = 0;
            L5: while (true) {
              if (var6 <= var16) {
                var13 = var12;
                var12 = var11;
                var11 = var13;
                param1 = var9;
                param3 = var10;
                var9 = var9 >> 1;
                var7++;
                var8 = var8 >> 1;
                var10 = var10 >> 1;
                continue L4;
              } else {
                var17 = var16;
                var18 = var16;
                var19 = var18 - -var15;
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
                        var18 = var18 + var6;
                        var14 = var14 + param0[var18];
                        var14 = var14 + param0[var19];
                        var18 = var18 + var6;
                        var19 = var19 + var6;
                        var14 = var14 + param0[var19];
                        var12[var17] = (byte)(var14 >> 1544912706);
                        var19 = var19 + var6;
                        var17 = var17 + var6;
                        var21++;
                        continue L7;
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
    }

    protected final void finalize() throws Throwable {
        this.d(22989);
        super.finalize();
    }

    private final void b(int param0, int param1) {
        ((bp) this).field_e.field_Cb = ((bp) this).field_e.field_Cb - param0;
        if (param1 != 25109) {
            ((bp) this).field_c = null;
        }
        ((bp) this).field_e.field_Cb = ((bp) this).field_e.field_Cb + this.f(3);
    }

    public void a(ji param0, int param1) {
        if (param1 != 15149) {
            Object var4 = null;
            ((bp) this).a((ji) null, 12);
        }
        if (!(((bp) this).field_a == param0)) {
            ((bp) this).field_a = param0;
            this.b((byte) -122);
        }
    }

    private final void b(byte param0) {
        ((bp) this).field_e.a((ed) this, 112);
        if (ao.field_y == ((bp) this).field_a) {
            jaggl.OpenGL.glTexParameteri(((bp) this).field_h, 10241, ((bp) this).field_d ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(((bp) this).field_h, 10240, 9729);
        } else {
            jaggl.OpenGL.glTexParameteri(((bp) this).field_h, 10241, !((bp) this).field_d ? 9728 : 9984);
            jaggl.OpenGL.glTexParameteri(((bp) this).field_h, 10240, 9728);
        }
        int var2 = 110 / ((param0 - -69) / 49);
    }

    final int e(int param0) {
        int var2 = 0;
        L0: {
          var2 = -58 / ((param0 - 57) / 34);
          if (((bp) this).field_g == io.field_g) {
            if (((bp) this).field_c != m.field_X) {
              if (((bp) this).field_c == nl.field_p) {
                return 6408;
              } else {
                if (te.field_f != ((bp) this).field_c) {
                  if (kd.field_b == ((bp) this).field_c) {
                    return 6409;
                  } else {
                    if (ps.field_c == ((bp) this).field_c) {
                      return 6410;
                    } else {
                      if (rg.field_A != ((bp) this).field_c) {
                        break L0;
                      } else {
                        return 6145;
                      }
                    }
                  }
                } else {
                  return 6406;
                }
              }
            } else {
              return 6407;
            }
          } else {
            if (io.field_e == ((bp) this).field_g) {
              if (m.field_X == ((bp) this).field_c) {
                return 34843;
              } else {
                if (nl.field_p == ((bp) this).field_c) {
                  return 34842;
                } else {
                  if (((bp) this).field_c != te.field_f) {
                    if (kd.field_b == ((bp) this).field_c) {
                      return 34846;
                    } else {
                      if (ps.field_c == ((bp) this).field_c) {
                        return 34847;
                      } else {
                        if (((bp) this).field_c == rg.field_A) {
                          return 6145;
                        } else {
                          break L0;
                        }
                      }
                    }
                  } else {
                    return 34844;
                  }
                }
              }
            } else {
              if (((bp) this).field_g != io.field_d) {
                break L0;
              } else {
                if (((bp) this).field_c != m.field_X) {
                  if (nl.field_p == ((bp) this).field_c) {
                    return 34836;
                  } else {
                    if (((bp) this).field_c != te.field_f) {
                      if (kd.field_b == ((bp) this).field_c) {
                        return 34840;
                      } else {
                        if (((bp) this).field_c == ps.field_c) {
                          return 34841;
                        } else {
                          if (((bp) this).field_c == rg.field_A) {
                            return 6145;
                          } else {
                            break L0;
                          }
                        }
                      }
                    } else {
                      return 34838;
                    }
                  }
                } else {
                  return 34837;
                }
              }
            }
          }
        }
        throw new IllegalStateException();
    }

    private final void d(int param0) {
        if (!((((bp) this).field_f ^ -1) >= -1)) {
            ((bp) this).field_e.a(this.f(3), ((bp) this).field_f, (byte) 23);
            ((bp) this).field_f = 0;
        }
        if (param0 != 22989) {
            Object var3 = null;
            ((bp) this).a(-4, 71, (int[]) null, -10, -31);
        }
    }

    public void a(int param0) {
        int var2 = ((bp) this).field_e.t(param0 + -8983);
        int var3 = ((bp) this).field_e.field_Hc[var2];
        if (((bp) this).field_h != var3) {
            if (var3 != 0) {
                jaggl.OpenGL.glBindTexture(var3, 0);
                jaggl.OpenGL.glDisable(var3);
            }
            jaggl.OpenGL.glEnable(((bp) this).field_h);
            ((bp) this).field_e.field_Hc[var2] = ((bp) this).field_h;
        }
        jaggl.OpenGL.glBindTexture(((bp) this).field_h, ((bp) this).field_f);
        if (param0 != 8905) {
            ((bp) this).a(-104);
        }
    }

    final static void a(int param0, int param1) {
        pj.field_p = 1000000000L / (long)param0;
        if (param1 != 26175) {
            bp.a(92, -56);
        }
    }

    bp(on param0, int param1, iw param2, io param3, int param4, boolean param5) {
        ((bp) this).field_a = ao.field_y;
        ((bp) this).field_g = param3;
        ((bp) this).field_d = param5 ? true : false;
        ((bp) this).field_h = param1;
        ((bp) this).field_e = param0;
        ((bp) this).field_c = param2;
        ((bp) this).field_b = param4;
        jaggl.OpenGL.glGenTextures(1, dq.field_s, 0);
        ((bp) this).field_f = dq.field_s[0];
        this.b((byte) 78);
        this.b(0, 25109);
    }

    private final int f(int param0) {
        int var2 = ((bp) this).field_g.field_j * ((bp) this).field_c.field_c * ((bp) this).field_b;
        if (param0 != 3) {
            ((bp) this).field_c = null;
        }
        return ((bp) this).field_d ? 4 * var2 / 3 : var2;
    }

    static {
    }
}
