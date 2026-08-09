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
            field_e = (int[][]) null;
        }
        int var2 = this.field_f.field_b * this.field_a.field_e * this.field_h;
        return !this.field_b ? var2 : var2 * 4 / 3;
    }

    final void a(int param0, float[] param1, int param2, int param3, int param4) {
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
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param4 ^ -1) >= param0) {
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
              if (0 >= param2) {
                break L2;
              } else {
                if (cla.a(param0 + 9182, param2)) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L3: {
              var6_int = this.field_f.field_b;
              var7 = 0;
              if (param2 <= param4) {
                stackIn_11_0 = param2;
                break L3;
              } else {
                stackIn_11_0 = param4;
                break L3;
              }
            }
            var8 = stackIn_11_0;
            var9 = param4 >> 1442846369;
            var10 = param2 >> -1113822015;
            var11 = param1;
            var12 = new float[var9 * (var10 * var6_int)];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Df(param3, var7, this.d(124), param4, param2, 0, waa.a(this.field_f, param0 + 1384), 5126, var11, 0);
              if (var8 <= 1) {
                break L0;
              } else {
                var15 = param4 * var6_int;
                var13 = var12;
                var16 = 0;
                L5: while (true) {
                  if (var16 >= var6_int) {
                    var12 = var11;
                    param2 = var10;
                    param4 = var9;
                    var11 = var13;
                    var7++;
                    var8 = var8 >> 1;
                    var9 = var9 >> 1;
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
                            var12[var17] = 0.25f * var14;
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

            stackIn_26_1 = new StringBuilder().append("tfa.S(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void f(byte param0) {
        if (!(0 >= this.field_c)) {
            this.field_j.a(this.field_c, this.c((byte) -120), 2);
            this.field_c = 0;
        }
        int var2 = -75 % ((16 - param0) / 61);
    }

    public void a(int param0, hs param1) {
        float[] var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 != this.field_g) {
                this.field_g = param1;
                this.d((byte) -114);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 7672) {
                break L2;
              } else {
                var4 = (float[]) null;
                this.a(-102, (float[]) null, -122, 31, 81);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("tfa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.f((byte) 114);
        super.finalize();
    }

    public void b(byte param0) {
        int var2 = this.field_j.o((byte) 106);
        if (param0 < 32) {
            return;
        }
        int var3 = this.field_j.field_Sc[var2];
        if (this.field_i != var3) {
            if (var3 != 0) {
                jaggl.OpenGL.glBindTexture(var3, 0);
                jaggl.OpenGL.glDisable(var3);
            }
            jaggl.OpenGL.glEnable(this.field_i);
            this.field_j.field_Sc[var2] = this.field_i;
        }
        jaggl.OpenGL.glBindTexture(this.field_i, this.field_c);
    }

    final int d(int param0) {
        L0: {
          if (una.field_g == this.field_a) {
            if (it.field_b == this.field_f) {
              return 6407;
            } else {
              if (this.field_f == gpa.field_a) {
                return 6408;
              } else {
                if (rp.field_g == this.field_f) {
                  return 6406;
                } else {
                  if (qr.field_w == this.field_f) {
                    return 6409;
                  } else {
                    if (wo.field_i == this.field_f) {
                      return 6410;
                    } else {
                      if (js.field_g != this.field_f) {
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
            if (una.field_l != this.field_a) {
              if (this.field_a != una.field_h) {
                break L0;
              } else {
                if (this.field_f == it.field_b) {
                  return 34837;
                } else {
                  if (this.field_f != gpa.field_a) {
                    if (rp.field_g != this.field_f) {
                      if (qr.field_w != this.field_f) {
                        if (wo.field_i != this.field_f) {
                          if (this.field_f != js.field_g) {
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
              if (this.field_f == it.field_b) {
                return 34843;
              } else {
                if (gpa.field_a == this.field_f) {
                  return 34842;
                } else {
                  if (rp.field_g != this.field_f) {
                    if (this.field_f == qr.field_w) {
                      return 34846;
                    } else {
                      if (wo.field_i != this.field_f) {
                        if (js.field_g != this.field_f) {
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
            RuntimeException var4_ref2 = null;
            ija var5 = null;
            iga var5_ref = null;
            ija stackIn_3_0 = null;
            iga stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param3 == 0) {
                        break L2;
                      } else {
                        field_d = (int[]) null;
                        break L2;
                      }
                    }
                    var4 = Class.forName("ec");
                    var5 = (ija) (var4.newInstance());
                    var5.a(param2, param1, 11329, param0);
                    stackIn_3_0 = (ija) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new iga();
                  ((ija) ((Object) var5_ref)).a(param2, param1, 11329, param0);
                  stackIn_5_0 = (iga) (var5_ref);
                  return (ija) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("tfa.R(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        this.field_j.a(true, (iva) (this));
        if (this.field_g != aw.field_G) {
            jaggl.OpenGL.glTexParameteri(this.field_i, 10241, !this.field_b ? 9728 : 9984);
            jaggl.OpenGL.glTexParameteri(this.field_i, 10240, 9728);
        } else {
            jaggl.OpenGL.glTexParameteri(this.field_i, 10241, this.field_b ? 9987 : 9729);
            jaggl.OpenGL.glTexParameteri(this.field_i, 10240, 9729);
        }
        if (param0 > -34) {
            this.field_h = -50;
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = (int[][]) null;
        if (param0 != 0) {
            field_e = (int[][]) null;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, int param4) {
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
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) >= -1) {
                break L1;
              } else {
                if (!cla.a(9181, param1)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if ((param4 ^ -1) >= -1) {
                break L2;
              } else {
                if (!cla.a(9181, param4)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var6_int = this.field_f.field_b;
              var7 = 0;
              if (param3 <= -113) {
                break L3;
              } else {
                this.field_i = 5;
                break L3;
              }
            }
            L4: {
              if (param1 < param4) {
                stackIn_14_0 = param1;
                break L4;
              } else {
                stackIn_14_0 = param4;
                break L4;
              }
            }
            var8 = stackIn_14_0;
            var9 = param1 >> 522184481;
            var10 = param4 >> -460770975;
            var11 = param2;
            var12 = new byte[var10 * var9 * var6_int];
            L5: while (true) {
              jaggl.OpenGL.glTexImage2Dub(param0, var7, this.d(115), param1, param4, 0, waa.a(this.field_f, 1383), 5121, var11, 0);
              if ((var8 ^ -1) >= -2) {
                break L0;
              } else {
                var15 = param1 * var6_int;
                var13 = var12;
                var16 = 0;
                L6: while (true) {
                  if (var6_int <= var16) {
                    var12 = var11;
                    var11 = var13;
                    param4 = var10;
                    param1 = var9;
                    var8 = var8 >> 1;
                    var10 = var10 >> 1;
                    var9 = var9 >> 1;
                    var7++;
                    continue L5;
                  } else {
                    var17 = var16;
                    var18 = var16;
                    var19 = var18 + var15;
                    var20 = 0;
                    L7: while (true) {
                      if (var20 >= var10) {
                        var16++;
                        continue L6;
                      } else {
                        var21 = 0;
                        L8: while (true) {
                          if (var21 >= var9) {
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
                            var12[var17] = (byte)(var14 >> -379400350);
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
            stackIn_29_0 = (RuntimeException) (var6);

            stackIn_29_1 = new StringBuilder().append("tfa.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int stackIn_17_0 = 0;
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
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
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
              if (0 >= param2) {
                break L2;
              } else {
                if (!cla.a(9181, param2)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            if (this.field_f != gpa.field_a) {
              throw new IllegalArgumentException("");
            } else {
              L3: {
                if (param0 == 99) {
                  break L3;
                } else {
                  this.field_b = true;
                  break L3;
                }
              }
              L4: {
                var6_int = 0;
                if (param4 < param2) {
                  stackIn_17_0 = param4;
                  break L4;
                } else {
                  stackIn_17_0 = param2;
                  break L4;
                }
              }
              var7 = stackIn_17_0;
              var8 = param4 >> 439440193;
              var9 = param2 >> 1282280385;
              var10 = param3;
              var11 = new int[var8 * var9];
              L5: while (true) {
                jaggl.OpenGL.glTexImage2Di(param1, var6_int, this.d(param0 ^ 94), param4, param2, 0, 32993, this.field_j.field_od, var10, 0);
                if (1 >= var7) {
                  break L0;
                } else {
                  var13 = 0;
                  var22 = 0;
                  var23 = param4 + var22;
                  var12 = var11;
                  var24 = 0;
                  L6: while (true) {
                    if (var9 <= var24) {
                      var11 = var10;
                      param2 = var9;
                      param4 = var8;
                      var10 = var12;
                      var8 = var8 >> 1;
                      var7 = var7 >> 1;
                      var9 = var9 >> 1;
                      var6_int++;
                      continue L5;
                    } else {
                      var25 = 0;
                      L7: while (true) {
                        if (var25 >= var8) {
                          var23 = var23 + param4;
                          var22 = var22 + param4;
                          var24++;
                          continue L6;
                        } else {
                          incrementValue$0 = var22;
                          var22++;
                          var14 = var10[incrementValue$0];
                          incrementValue$1 = var23;
                          var23++;
                          var16 = var10[incrementValue$1];
                          incrementValue$2 = var22;
                          var22++;
                          var15 = var10[incrementValue$2];
                          var21 = 255 & var14 >> -647629608;
                          var20 = 255 & var14;
                          incrementValue$3 = var23;
                          var23++;
                          var17 = var10[incrementValue$3];
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
                          incrementValue$4 = var13;
                          var13++;
                          var11[incrementValue$4] = fh.a(sea.c(255, var20 >> 1580663362), fh.a(fh.a(sea.c(var18, 1020) << -552166674, sea.c(1020, var21) << 1886030454), sea.c(var19 << -15456538, 65280)));
                          var25++;
                          continue L7;
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
            stackIn_29_0 = (RuntimeException) (var6);

            stackIn_29_1 = new StringBuilder().append("tfa.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param4 + ')');
        }
    }

    final static void e(byte param0) {
        if (param0 > -113) {
            return;
        }
        ko.c((byte) 57);
    }

    private final void a(byte param0, int param1) {
        this.field_j.field_Xb = this.field_j.field_Xb - param1;
        this.field_j.field_Xb = this.field_j.field_Xb + this.c((byte) -120);
        if (param0 > -88) {
            this.b((byte) 93);
        }
    }

    tfa(kda param0, int param1, ft param2, una param3, int param4, boolean param5) {
        this.field_g = aw.field_G;
        try {
            this.field_a = param3;
            this.field_j = param0;
            this.field_b = param5 ? true : false;
            this.field_i = param1;
            this.field_h = param4;
            this.field_f = param2;
            jaggl.OpenGL.glGenTextures(1, pra.field_a, 0);
            this.field_c = pra.field_a[0];
            this.d((byte) -97);
            this.a((byte) -128, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "tfa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_d = new int[]{0, 512, 0};
    }
}
