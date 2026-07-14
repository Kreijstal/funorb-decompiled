/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tfa implements iva {
    una field_a;
    static int[][] field_e;
    private hs field_g;
    private boolean field_b;
    kda field_j;
    private int field_h;
    private int field_c;
    ft field_f;
    static int[] field_d;
    int field_i;

    private final int c(byte param0) {
        if (param0 != -120) {
            field_e = null;
        }
        int var2 = ((tfa) this).field_f.field_b * ((tfa) this).field_a.field_e * ((tfa) this).field_h;
        return !((tfa) this).field_b ? var2 : var2 * 4 / 3;
    }

    final void a(int param0, float[] param1, int param2, int param3, int param4) {
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
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var22 = TombRacer.field_G ? 1 : 0;
          if ((param4 ^ -1) >= param0) {
            break L0;
          } else {
            if (!cla.a(9181, param4)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (0 >= param2) {
            break L1;
          } else {
            if (cla.a(param0 + 9182, param2)) {
              break L1;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L2: {
          var6 = ((tfa) this).field_f.field_b;
          var7 = 0;
          if (param2 <= param4) {
            stackOut_9_0 = param2;
            stackIn_10_0 = stackOut_9_0;
            break L2;
          } else {
            stackOut_8_0 = param4;
            stackIn_10_0 = stackOut_8_0;
            break L2;
          }
        }
        var8 = stackIn_10_0;
        var9 = param4 >> 1442846369;
        var10 = param2 >> -1113822015;
        var11 = param1;
        var12 = new float[var9 * (var10 * var6)];
        L3: while (true) {
          jaggl.OpenGL.glTexImage2Df(param3, var7, ((tfa) this).d(124), param4, param2, 0, waa.a(((tfa) this).field_f, param0 + 1384), 5126, var11, 0);
          if (var8 <= 1) {
            return;
          } else {
            var15 = param4 * var6;
            var13 = var12;
            var16 = 0;
            L4: while (true) {
              if (var16 >= var6) {
                var12 = var11;
                param2 = var10;
                param4 = var9;
                var11 = var13;
                var7++;
                var8 = var8 >> 1;
                var9 = var9 >> 1;
                var10 = var10 >> 1;
                continue L3;
              } else {
                var17 = var16;
                var18 = var16;
                var19 = var18 - -var15;
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
                        var14 = param1[var18];
                        var18 = var18 + var6;
                        var14 = var14 + param1[var18];
                        var14 = var14 + param1[var19];
                        var18 = var18 + var6;
                        var19 = var19 + var6;
                        var14 = var14 + param1[var19];
                        var19 = var19 + var6;
                        var12[var17] = 0.25f * var14;
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

    private final void f(byte param0) {
        if (!(0 >= ((tfa) this).field_c)) {
            ((tfa) this).field_j.a(((tfa) this).field_c, this.c((byte) -120), 2);
            ((tfa) this).field_c = 0;
        }
        int var2 = -75 % ((16 - param0) / 61);
    }

    public void a(int param0, hs param1) {
        if (!(param1 == ((tfa) this).field_g)) {
            ((tfa) this).field_g = param1;
            this.d((byte) -114);
        }
        if (param0 != 7672) {
            Object var4 = null;
            ((tfa) this).a(-102, (float[]) null, -122, 31, 81);
        }
    }

    protected final void finalize() throws Throwable {
        this.f((byte) 114);
        super.finalize();
    }

    public void b(byte param0) {
        int var2 = ((tfa) this).field_j.o((byte) 106);
        if (param0 < 32) {
            return;
        }
        int var3 = ((tfa) this).field_j.field_Sc[var2];
        if (((tfa) this).field_i != var3) {
            if (var3 != 0) {
                jaggl.OpenGL.glBindTexture(var3, 0);
                jaggl.OpenGL.glDisable(var3);
            }
            jaggl.OpenGL.glEnable(((tfa) this).field_i);
            ((tfa) this).field_j.field_Sc[var2] = ((tfa) this).field_i;
        }
        jaggl.OpenGL.glBindTexture(((tfa) this).field_i, ((tfa) this).field_c);
    }

    final int d(int param0) {
        L0: {
          if (una.field_g == ((tfa) this).field_a) {
            if (it.field_b == ((tfa) this).field_f) {
              return 6407;
            } else {
              if (((tfa) this).field_f == gpa.field_a) {
                return 6408;
              } else {
                if (rp.field_g == ((tfa) this).field_f) {
                  return 6406;
                } else {
                  if (qr.field_w == ((tfa) this).field_f) {
                    return 6409;
                  } else {
                    if (wo.field_i == ((tfa) this).field_f) {
                      return 6410;
                    } else {
                      if (js.field_g != ((tfa) this).field_f) {
                        break L0;
                      } else {
                        return 6145;
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (una.field_l != ((tfa) this).field_a) {
              if (((tfa) this).field_a != una.field_h) {
                break L0;
              } else {
                if (((tfa) this).field_f == it.field_b) {
                  return 34837;
                } else {
                  if (((tfa) this).field_f != gpa.field_a) {
                    if (rp.field_g != ((tfa) this).field_f) {
                      if (qr.field_w != ((tfa) this).field_f) {
                        if (wo.field_i != ((tfa) this).field_f) {
                          if (((tfa) this).field_f != js.field_g) {
                            break L0;
                          } else {
                            return 6145;
                          }
                        } else {
                          return 34841;
                        }
                      } else {
                        return 34840;
                      }
                    } else {
                      return 34838;
                    }
                  } else {
                    return 34836;
                  }
                }
              }
            } else {
              if (((tfa) this).field_f == it.field_b) {
                return 34843;
              } else {
                if (gpa.field_a == ((tfa) this).field_f) {
                  return 34842;
                } else {
                  if (rp.field_g != ((tfa) this).field_f) {
                    if (((tfa) this).field_f == qr.field_w) {
                      return 34846;
                    } else {
                      if (wo.field_i != ((tfa) this).field_f) {
                        if (js.field_g != ((tfa) this).field_f) {
                          break L0;
                        } else {
                          return 6145;
                        }
                      } else {
                        return 34847;
                      }
                    }
                  } else {
                    return 34844;
                  }
                }
              }
            }
          }
        }
        if (param0 > 43) {
          throw new IllegalStateException();
        } else {
          return -92;
        }
    }

    final static ija a(int param0, int param1, java.awt.Canvas param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            ija var5 = null;
            iga var5_ref = null;
            ija stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ija stackOut_2_0 = null;
            try {
              L0: {
                if (param3 == 0) {
                  break L0;
                } else {
                  field_d = null;
                  break L0;
                }
              }
              var4 = Class.forName("ec");
              var5 = (ija) var4.newInstance();
              var5.a(param2, param1, 11329, param0);
              stackOut_2_0 = (ija) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    private final void d(byte param0) {
        ((tfa) this).field_j.a(true, (iva) this);
        if (((tfa) this).field_g != aw.field_G) {
            jaggl.OpenGL.glTexParameteri(((tfa) this).field_i, 10241, !((tfa) this).field_b ? 9728 : 9984);
            jaggl.OpenGL.glTexParameteri(((tfa) this).field_i, 10240, 9728);
        } else {
            jaggl.OpenGL.glTexParameteri(((tfa) this).field_i, 10241, ((tfa) this).field_b ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(((tfa) this).field_i, 10240, 9729);
        }
        if (param0 > -34) {
            ((tfa) this).field_h = -50;
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 0) {
            field_e = null;
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
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var22 = TombRacer.field_G ? 1 : 0;
          if ((param1 ^ -1) >= -1) {
            break L0;
          } else {
            if (!cla.a(9181, param1)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if ((param4 ^ -1) >= -1) {
            break L1;
          } else {
            if (!cla.a(9181, param4)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        L2: {
          var6 = ((tfa) this).field_f.field_b;
          var7 = 0;
          if (param3 <= -113) {
            break L2;
          } else {
            ((tfa) this).field_i = 5;
            break L2;
          }
        }
        L3: {
          if (param1 < param4) {
            stackOut_12_0 = param1;
            stackIn_13_0 = stackOut_12_0;
            break L3;
          } else {
            stackOut_11_0 = param4;
            stackIn_13_0 = stackOut_11_0;
            break L3;
          }
        }
        var8 = stackIn_13_0;
        var9 = param1 >> 522184481;
        var10 = param4 >> -460770975;
        var11 = param2;
        var12 = new byte[var10 * var9 * var6];
        L4: while (true) {
          jaggl.OpenGL.glTexImage2Dub(param0, var7, ((tfa) this).d(115), param1, param4, 0, waa.a(((tfa) this).field_f, 1383), 5121, var11, 0);
          if ((var8 ^ -1) >= -2) {
            return;
          } else {
            var15 = param1 * var6;
            var13 = var12;
            var16 = 0;
            L5: while (true) {
              if (var6 <= var16) {
                var12 = var11;
                var11 = var13;
                param4 = var10;
                param1 = var9;
                var8 = var8 >> 1;
                var10 = var10 >> 1;
                var9 = var9 >> 1;
                var7++;
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
                        var14 = param2[var18];
                        var18 = var18 + var6;
                        var14 = var14 + param2[var18];
                        var18 = var18 + var6;
                        var14 = var14 + param2[var19];
                        var19 = var19 + var6;
                        var14 = var14 + param2[var19];
                        var19 = var19 + var6;
                        var12[var17] = (byte)(var14 >> -379400350);
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
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          if ((param4 ^ -1) >= -1) {
            break L0;
          } else {
            if (!cla.a(9181, param4)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (0 >= param2) {
            break L1;
          } else {
            if (!cla.a(9181, param2)) {
              throw new IllegalArgumentException("");
            } else {
              break L1;
            }
          }
        }
        if (((tfa) this).field_f != gpa.field_a) {
          throw new IllegalArgumentException("");
        } else {
          L2: {
            if (param0 == 99) {
              break L2;
            } else {
              ((tfa) this).field_b = true;
              break L2;
            }
          }
          L3: {
            var6 = 0;
            if (param4 < param2) {
              stackOut_15_0 = param4;
              stackIn_16_0 = stackOut_15_0;
              break L3;
            } else {
              stackOut_14_0 = param2;
              stackIn_16_0 = stackOut_14_0;
              break L3;
            }
          }
          var7 = stackIn_16_0;
          var8 = param4 >> 439440193;
          var9 = param2 >> 1282280385;
          var10 = param3;
          var11 = new int[var8 * var9];
          L4: while (true) {
            jaggl.OpenGL.glTexImage2Di(param1, var6, ((tfa) this).d(param0 ^ 94), param4, param2, 0, 32993, ((tfa) this).field_j.field_od, var10, 0);
            if (1 >= var7) {
              return;
            } else {
              var13 = 0;
              var22 = 0;
              var23 = param4 + var22;
              var12 = var11;
              var24 = 0;
              L5: while (true) {
                if (var9 <= var24) {
                  var11 = var10;
                  param2 = var9;
                  param4 = var8;
                  var10 = var12;
                  var8 = var8 >> 1;
                  var7 = var7 >> 1;
                  var9 = var9 >> 1;
                  var6++;
                  continue L4;
                } else {
                  var25 = 0;
                  L6: while (true) {
                    if (var25 >= var8) {
                      var23 = var23 + param4;
                      var22 = var22 + param4;
                      var24++;
                      continue L5;
                    } else {
                      var22++;
                      var14 = var10[var22];
                      var23++;
                      var16 = var10[var23];
                      var22++;
                      var15 = var10[var22];
                      var21 = 255 & var14 >> -647629608;
                      var20 = 255 & var14;
                      var23++;
                      var17 = var10[var23];
                      var19 = 255 & var14 >> 1949804424;
                      var18 = 255 & var14 >> -494732944;
                      var19 = var19 + (var15 >> 1669032840 & 255);
                      var18 = var18 + (255 & var15 >> -337123472);
                      var20 = var20 + (255 & var15);
                      var21 = var21 + (var15 >> -1482824136 & 255);
                      var18 = var18 + (255 & var16 >> -1511347504);
                      var20 = var20 + (255 & var16);
                      var19 = var19 + ((65420 & var16) >> -224298392);
                      var21 = var21 + (var16 >> 1167196440 & 255);
                      var20 = var20 + (255 & var17);
                      var18 = var18 + ((var17 & 16738139) >> -1641226416);
                      var21 = var21 + (var17 >> -367333256 & 255);
                      var19 = var19 + ((var17 & 65316) >> -2093676472);
                      var13++;
                      var11[var13] = fh.a(sea.c(255, var20 >> 1580663362), fh.a(fh.a(sea.c(var18, 1020) << -552166674, sea.c(1020, var21) << 1886030454), sea.c(var19 << -15456538, 65280)));
                      var25++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void e(byte param0) {
        if (param0 > -113) {
            return;
        }
        ko.c((byte) 57);
    }

    private final void a(byte param0, int param1) {
        ((tfa) this).field_j.field_Xb = ((tfa) this).field_j.field_Xb - param1;
        ((tfa) this).field_j.field_Xb = ((tfa) this).field_j.field_Xb + this.c((byte) -120);
        if (param0 > -88) {
            ((tfa) this).b((byte) 93);
        }
    }

    tfa(kda param0, int param1, ft param2, una param3, int param4, boolean param5) {
        ((tfa) this).field_g = aw.field_G;
        ((tfa) this).field_a = param3;
        ((tfa) this).field_j = param0;
        ((tfa) this).field_b = param5 ? true : false;
        ((tfa) this).field_i = param1;
        ((tfa) this).field_h = param4;
        ((tfa) this).field_f = param2;
        jaggl.OpenGL.glGenTextures(1, pra.field_a, 0);
        ((tfa) this).field_c = pra.field_a[0];
        this.d((byte) -97);
        this.a((byte) -128, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{0, 512, 0};
    }
}
