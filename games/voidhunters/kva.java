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
        if (-1 > (this.field_a ^ -1)) {
            this.field_h.b(this.field_a, 117, this.c((byte) 61));
            this.field_a = 0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, int param4) {
        int stackIn_11_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var22 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (0 >= param4) {
                break L1;
              } else {
                if (!bd.a(param4, (byte) -95)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (-1 <= (param1 ^ -1)) {
                break L2;
              } else {
                if (bd.a(param1, (byte) -95)) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L3: {
              var6_int = this.field_f.field_a;
              var7 = param3;
              if (param4 < param1) {
                stackIn_11_0 = param4;
                break L3;
              } else {
                stackIn_11_0 = param1;
                break L3;
              }
            }
            var8 = stackIn_11_0;
            var9 = param4 >> -972922015;
            var10 = param1 >> 1575933473;
            var11 = param2;
            var12 = new byte[var6_int * var9 * var10];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Dub(param0, var7, this.e((byte) -31), param4, param1, 0, una.a(param3 + -29328, this.field_f), 5121, var11, 0);
              if (var8 <= 1) {
                break L0;
              } else {
                var15 = param4 * var6_int;
                var13 = var12;
                var16 = 0;
                L5: while (true) {
                  if (var6_int <= var16) {
                    var12 = var11;
                    param1 = var10;
                    param4 = var9;
                    var11 = var13;
                    var10 = var10 >> 1;
                    var9 = var9 >> 1;
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
                          if (var9 <= var21) {
                            var18 = var18 + var15;
                            var19 = var19 + var15;
                            var20++;
                            continue L6;
                          } else {
                            var14 = var11[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + var11[var18];
                            var14 = var14 + var11[var19];
                            var18 = var18 + var6_int;
                            var19 = var19 + var6_int;
                            var14 = var14 + var11[var19];
                            var19 = var19 + var6_int;
                            var12[var17] = (byte)(var14 >> -1751429886);
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var6);

            stackIn_26_1 = new StringBuilder().append("kva.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int e(byte param0) {
        tu var3;
        L0: {
          if (param0 == -31) {
            break L0;
          } else {
            var3 = (tu) null;
            this.a((tu) null, 94);
            break L0;
          }
        }
        L1: {
          if (mj.field_f == this.field_b) {
            if (this.field_f != ep.field_o) {
              if (qua.field_d == this.field_f) {
                return 6408;
              } else {
                if (this.field_f != nw.field_p) {
                  if (this.field_f != gka.field_p) {
                    if (wh.field_o != this.field_f) {
                      if (qf.field_o != this.field_f) {
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
            if (this.field_b == mj.field_b) {
              if (this.field_f != ep.field_o) {
                if (this.field_f == qua.field_d) {
                  return 34842;
                } else {
                  if (nw.field_p != this.field_f) {
                    if (this.field_f == gka.field_p) {
                      return 34846;
                    } else {
                      if (this.field_f != wh.field_o) {
                        if (qf.field_o == this.field_f) {
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
              if (mj.field_d == this.field_b) {
                if (ep.field_o == this.field_f) {
                  return 34837;
                } else {
                  if (qua.field_d != this.field_f) {
                    if (nw.field_p != this.field_f) {
                      if (this.field_f == gka.field_p) {
                        return 34840;
                      } else {
                        if (this.field_f == wh.field_o) {
                          return 34841;
                        } else {
                          if (this.field_f == qf.field_o) {
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
        try {
            if (this.field_i != param0) {
                this.field_i = param0;
                this.c(0);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kva.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int c(byte param0) {
        int var2 = this.field_f.field_a * this.field_b.field_h * this.field_d;
        if (param0 != 61) {
            return -71;
        }
        return !this.field_c ? var2 : 4 * var2 / 3;
    }

    private final void c(int param0) {
        if (param0 != 0) {
            return;
        }
        this.field_h.a((ura) (this), -114);
        if (cs.field_a == this.field_i) {
            jaggl.OpenGL.glTexParameteri(this.field_e, 10241, !this.field_c ? 9729 : 9987);
            jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9729);
        } else {
            jaggl.OpenGL.glTexParameteri(this.field_e, 10241, this.field_c ? 9984 : 9728);
            jaggl.OpenGL.glTexParameteri(this.field_e, 10240, 9728);
        }
    }

    final void a(int param0, float[] param1, int param2, int param3, byte param4) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var22 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == -67) {
                break L1;
              } else {
                this.field_d = -65;
                break L1;
              }
            }
            L2: {
              if ((param3 ^ -1) >= -1) {
                break L2;
              } else {
                if (bd.a(param3, (byte) -95)) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L3: {
              if (param2 <= 0) {
                break L3;
              } else {
                if (!bd.a(param2, (byte) -95)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var6_int = this.field_f.field_a;
              var7 = 0;
              if (param3 < param2) {
                stackIn_13_0 = param3;
                break L4;
              } else {
                stackIn_13_0 = param2;
                break L4;
              }
            }
            var8 = stackIn_13_0;
            var9 = param3 >> 612311169;
            var10 = param2 >> 1160696641;
            var11 = param1;
            var12 = new float[var6_int * (var9 * var10)];
            L5: while (true) {
              jaggl.OpenGL.glTexImage2Df(param0, var7, this.e((byte) -31), param3, param2, 0, una.a(param4 + -29261, this.field_f), 5126, var11, 0);
              if (var8 <= 1) {
                break L0;
              } else {
                var15 = param3 * var6_int;
                var13 = var12;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= var6_int) {
                    var12 = var11;
                    param2 = var10;
                    var11 = var13;
                    param3 = var9;
                    var7++;
                    var10 = var10 >> 1;
                    var9 = var9 >> 1;
                    var8 = var8 >> 1;
                    continue L5;
                  } else {
                    var17 = var16;
                    var18 = var16;
                    var19 = var15 + var18;
                    var20 = 0;
                    L7: while (true) {
                      if (var10 <= var20) {
                        var16++;
                        continue L6;
                      } else {
                        var21 = 0;
                        L8: while (true) {
                          if (var9 <= var21) {
                            var19 = var19 + var15;
                            var18 = var18 + var15;
                            var20++;
                            continue L7;
                          } else {
                            var14 = var11[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + var11[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + var11[var19];
                            var19 = var19 + var6_int;
                            var14 = var14 + var11[var19];
                            var19 = var19 + var6_int;
                            var12[var17] = 0.25f * var14;
                            var17 = var17 + var6_int;
                            var21++;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("kva.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        if (param1 > -12) {
            this.b(-102);
        }
        this.field_h.field_Nb = this.field_h.field_Nb - param0;
        this.field_h.field_Nb = this.field_h.field_Nb + this.c((byte) 61);
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        var26 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (-1 <= (param3 ^ -1)) {
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
            if (qua.field_d != this.field_f) {
              throw new IllegalArgumentException("");
            } else {
              L3: {
                var6_int = 0;
                if (param2 > param3) {
                  stackIn_14_0 = param3;
                  break L3;
                } else {
                  stackIn_14_0 = param2;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_14_0;
                var8 = param3 >> 238496993;
                if (param0 == 14) {
                  break L4;
                } else {
                  this.field_c = true;
                  break L4;
                }
              }
              var9 = param2 >> 1515896609;
              var10 = param4;
              var11 = new int[var9 * var8];
              L5: while (true) {
                jaggl.OpenGL.glTexImage2Di(param1, var6_int, this.e((byte) -31), param3, param2, 0, 32993, this.field_h.field_Nc, var10, 0);
                if ((var7 ^ -1) < -2) {
                  var13 = 0;
                  var22 = 0;
                  var23 = var22 + param3;
                  var12 = var11;
                  var24 = 0;
                  L6: while (true) {
                    if (var24 >= var9) {
                      var11 = var10;
                      param3 = var8;
                      var10 = var12;
                      param2 = var9;
                      var9 = var9 >> 1;
                      var7 = var7 >> 1;
                      var8 = var8 >> 1;
                      var6_int++;
                      continue L5;
                    } else {
                      var25 = 0;
                      L7: while (true) {
                        if (var25 >= var8) {
                          var23 = var23 + param3;
                          var22 = var22 + param3;
                          var24++;
                          continue L6;
                        } else {
                          incrementValue$0 = var22;
                          var22++;
                          var14 = var10[incrementValue$0];
                          incrementValue$1 = var22;
                          var22++;
                          var15 = var10[incrementValue$1];
                          incrementValue$2 = var23;
                          var23++;
                          var16 = var10[incrementValue$2];
                          var19 = (var14 & 65483) >> 1407788200;
                          var18 = var14 >> -244070896 & 255;
                          var21 = var14 >> 1317818200 & 255;
                          incrementValue$3 = var23;
                          var23++;
                          var17 = var10[incrementValue$3];
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
                          incrementValue$4 = var13;
                          var13++;
                          var11[incrementValue$4] = knb.a(dla.a(255, var20 >> -491805886), knb.a(dla.a(1020, var19) << 1886946630, knb.a(dla.a(var21, 1020) << -1210041578, dla.a(16711680, var18 << -1832933618))));
                          var25++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var6);

            stackIn_29_1 = new StringBuilder().append("kva.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    public void b(int param0) {
        if (param0 != -27445) {
            return;
        }
        int var2 = this.field_h.t((byte) 9);
        int var3 = this.field_h.field_Wc[var2];
        if (var3 != this.field_e) {
            if (!(var3 == 0)) {
                jaggl.OpenGL.glBindTexture(var3, 0);
                jaggl.OpenGL.glDisable(var3);
            }
            jaggl.OpenGL.glEnable(this.field_e);
            this.field_h.field_Wc[var2] = this.field_e;
        }
        jaggl.OpenGL.glBindTexture(this.field_e, this.field_a);
    }

    kva(jp param0, int param1, kb param2, mj param3, int param4, boolean param5) {
        this.field_i = cs.field_a;
        try {
            this.field_h = param0;
            this.field_d = param4;
            this.field_b = param3;
            this.field_e = param1;
            this.field_c = param5 ? true : false;
            this.field_f = param2;
            jaggl.OpenGL.glGenTextures(1, uqa.field_o, 0);
            this.field_a = uqa.field_o[0];
            this.c(0);
            this.a(0, (byte) -118);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "kva.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_g = 512;
    }
}
