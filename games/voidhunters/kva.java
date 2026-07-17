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
        if (((kva) this).field_a > 0) {
            ((kva) this).field_h.b(((kva) this).field_a, 117, this.c((byte) 61));
            ((kva) this).field_a = 0;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3, int param4) {
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
        int stackIn_11_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
              if (param1 <= 0) {
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
              var6_int = ((kva) this).field_f.field_a;
              var7 = param3;
              if (param4 < param1) {
                stackOut_10_0 = param4;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = param1;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            var8 = stackIn_11_0;
            var9 = param4 >> 1;
            var10 = param1 >> 1;
            var11 = param2;
            var12 = new byte[var6_int * var9 * var10];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Dub(param0, var7, ((kva) this).e((byte) -31), param4, param1, 0, una.a(param3 + -29328, ((kva) this).field_f), 5121, var11, 0);
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
                            var14 = param2[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + param2[var18];
                            var14 = var14 + param2[var19];
                            var18 = var18 + var6_int;
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
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("kva.U(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param3 + 44 + param4 + 41);
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
        RuntimeException runtimeException = null;
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
            if (param1 == -28798) {
              L1: {
                if (((kva) this).field_i == param0) {
                  break L1;
                } else {
                  ((kva) this).field_i = param0;
                  this.c(0);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("kva.H(");
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    private final int c(byte param0) {
        int var2 = ((kva) this).field_f.field_a * ((kva) this).field_b.field_h * ((kva) this).field_d;
        return !((kva) this).field_c ? var2 : 4 * var2 / 3;
    }

    private final void c(int param0) {
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
        var22 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == -67) {
                break L1;
              } else {
                ((kva) this).field_d = -65;
                break L1;
              }
            }
            L2: {
              if (param3 <= 0) {
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
              var6_int = ((kva) this).field_f.field_a;
              var7 = 0;
              if (param3 < param2) {
                stackOut_12_0 = param3;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = param2;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            var8 = stackIn_13_0;
            var9 = param3 >> 1;
            var10 = param2 >> 1;
            var11 = param1;
            var12 = new float[var6_int * (var9 * var10)];
            L5: while (true) {
              jaggl.OpenGL.glTexImage2Df(param0, var7, ((kva) this).e((byte) -31), param3, param2, 0, una.a(param4 + -29261, ((kva) this).field_f), 5126, var11, 0);
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
                            var14 = param1[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + param1[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + param1[var19];
                            var19 = var19 + var6_int;
                            var14 = var14 + param1[var19];
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
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("kva.P(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(int param0, byte param1) {
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var26 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param3 <= 0) {
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
            if (qua.field_d != ((kva) this).field_f) {
              throw new IllegalArgumentException("");
            } else {
              L3: {
                var6_int = 0;
                if (param2 > param3) {
                  stackOut_13_0 = param3;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = param2;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_14_0;
                var8 = param3 >> 1;
                if (param0 == 14) {
                  break L4;
                } else {
                  ((kva) this).field_c = true;
                  break L4;
                }
              }
              var9 = param2 >> 1;
              var10 = param4;
              var11 = new int[var9 * var8];
              L5: while (true) {
                jaggl.OpenGL.glTexImage2Di(param1, var6_int, ((kva) this).e((byte) -31), param3, param2, 0, 32993, ((kva) this).field_h.field_Nc, var10, 0);
                if (var7 > 1) {
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
                          int incrementValue$5 = var22;
                          var22++;
                          var14 = var10[incrementValue$5];
                          int incrementValue$6 = var22;
                          var22++;
                          var15 = var10[incrementValue$6];
                          int incrementValue$7 = var23;
                          var23++;
                          var16 = var10[incrementValue$7];
                          var19 = (var14 & 65483) >> 8;
                          var18 = var14 >> 16 & 255;
                          var21 = var14 >> 24 & 255;
                          int incrementValue$8 = var23;
                          var23++;
                          var17 = var10[incrementValue$8];
                          var20 = var14 & 255;
                          var18 = var18 + ((var15 & 16720391) >> 16);
                          var20 = var20 + (255 & var15);
                          var21 = var21 + (255 & var15 >> 24);
                          var19 = var19 + (var15 >> 8 & 255);
                          var20 = var20 + (255 & var16);
                          var19 = var19 + ((var16 & 65325) >> 8);
                          var21 = var21 + (var16 >> 24 & 255);
                          var18 = var18 + (255 & var16 >> 16);
                          var20 = var20 + (var17 & 255);
                          var19 = var19 + (255 & var17 >> 8);
                          var18 = var18 + (var17 >> 16 & 255);
                          var21 = var21 + (255 & var17 >> 24);
                          int incrementValue$9 = var13;
                          var13++;
                          var11[incrementValue$9] = knb.a(dla.a(255, var20 >> 2), knb.a(dla.a(1020, var19) << 6, knb.a(dla.a(var21, 1020) << 22, dla.a(16711680, var18 << 14))));
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
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("kva.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
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
        try {
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
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kva.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 512;
    }
}
