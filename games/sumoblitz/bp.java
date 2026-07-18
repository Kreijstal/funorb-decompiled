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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= param4) {
                break L1;
              } else {
                if (rm.a(param1, -108)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (-1 >= param0) {
                break L2;
              } else {
                if (!rm.a(param0, -127)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            if (((bp) this).field_c != nl.field_p) {
              throw new IllegalArgumentException("");
            } else {
              L3: {
                var6_int = 0;
                if (param0 <= param1) {
                  stackOut_13_0 = param0;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = param1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var7 = stackIn_14_0;
              var8 = param1 >> 1;
              var9 = param0 >> 1;
              var10 = param2;
              var11 = new int[var9 * var8];
              L4: while (true) {
                jaggl.OpenGL.glTexImage2Di(param3, var6_int, ((bp) this).e(param4 + 101), param1, param0, 0, 32993, ((bp) this).field_e.field_Ec, var10, 0);
                if (var7 > 1) {
                  var13 = 0;
                  var22 = 0;
                  var23 = var22 - -param1;
                  var12 = var11;
                  var24 = 0;
                  L5: while (true) {
                    if (var9 <= var24) {
                      var11 = var10;
                      param0 = var9;
                      param1 = var8;
                      var10 = var12;
                      var6_int++;
                      var7 = var7 >> 1;
                      var8 = var8 >> 1;
                      var9 = var9 >> 1;
                      continue L4;
                    } else {
                      var25 = 0;
                      L6: while (true) {
                        if (var8 <= var25) {
                          var22 = var22 + param1;
                          var23 = var23 + param1;
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
                          var21 = 255 & var14 >> 24;
                          var18 = 255 & var14 >> 16;
                          var20 = 255 & var14;
                          int incrementValue$8 = var23;
                          var23++;
                          var17 = var10[incrementValue$8];
                          var19 = (65493 & var14) >> 8;
                          var20 = var20 + (255 & var15);
                          var18 = var18 + ((16770131 & var15) >> 16);
                          var21 = var21 + (var15 >> 24 & 255);
                          var19 = var19 + (var15 >> 8 & 255);
                          var18 = var18 + (var16 >> 16 & 255);
                          var21 = var21 + (255 & var16 >> 24);
                          var20 = var20 + (255 & var16);
                          var19 = var19 + (255 & var16 >> 8);
                          var20 = var20 + (255 & var17);
                          var19 = var19 + ((var17 & 65361) >> 8);
                          var18 = var18 + ((var17 & 16719727) >> 16);
                          var21 = var21 + (var17 >> 24 & 255);
                          int incrementValue$9 = var13;
                          var13++;
                          var11[incrementValue$9] = ic.a(eb.a(1020, var20) >> 2, ic.a(eb.a(1020, var19) << 6, ic.a(eb.a(16711680, var18 << 14), eb.a(var21, 1020) << 22)));
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6;
            stackOut_25_1 = new StringBuilder().append("bp.A(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int g(int param0) {
        if (2 <= mp.field_a) {
          L0: {
            if (dk.field_c == 0) {
              if (!wd.field_j.b((byte) 127)) {
                return 20;
              } else {
                if (wd.field_j.a("commonui", 100)) {
                  if (eb.field_f.b((byte) 127)) {
                    if (eb.field_f.a("commonui", 100)) {
                      if (!hw.field_a.b((byte) 127)) {
                        return 70;
                      } else {
                        if (hw.field_a.a(true)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              }
            } else {
              L1: {
                if (null == hd.field_H) {
                  break L1;
                } else {
                  if (hd.field_H.b((byte) 127)) {
                    if (hd.field_H.b((byte) -98, "")) {
                      if (!hd.field_H.a("", 100)) {
                        return 29;
                      } else {
                        break L1;
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 14;
                  }
                }
              }
              if (!wd.field_j.b((byte) 127)) {
                return 43;
              } else {
                if (wd.field_j.a("commonui", 100)) {
                  if (!eb.field_f.b((byte) 127)) {
                    return 71;
                  } else {
                    if (eb.field_f.a("commonui", 100)) {
                      if (!hw.field_a.b((byte) 127)) {
                        return 82;
                      } else {
                        if (hw.field_a.a(true)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  }
                } else {
                  return 57;
                }
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, float[] param4) {
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
        int stackIn_12_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= 0) {
                break L1;
              } else {
                if (!rm.a(param3, -102)) {
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
                if (!rm.a(param1, -102)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var6_int = ((bp) this).field_c.field_c;
              var7 = 0;
              if (param1 <= param3) {
                stackOut_11_0 = param1;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = param3;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            var8 = stackIn_12_0;
            var9 = param3 >> 1;
            if (param2 < -115) {
              var10 = param1 >> 1;
              var11 = param4;
              var12 = new float[var6_int * (var9 * var10)];
              L4: while (true) {
                jaggl.OpenGL.glTexImage2Df(param0, var7, ((bp) this).e(-107), param3, param1, 0, te.a(-21339, ((bp) this).field_c), 5126, var11, 0);
                if (var8 > 1) {
                  var15 = var6_int * param3;
                  var13 = var12;
                  var16 = 0;
                  L5: while (true) {
                    if (var6_int <= var16) {
                      var12 = var11;
                      param1 = var10;
                      var11 = var13;
                      param3 = var9;
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
                              var14 = param4[var18];
                              var18 = var18 + var6_int;
                              var14 = var14 + param4[var18];
                              var18 = var18 + var6_int;
                              var14 = var14 + param4[var19];
                              var19 = var19 + var6_int;
                              var14 = var14 + param4[var19];
                              var12[var17] = var14 * 0.25f;
                              var19 = var19 + var6_int;
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
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("bp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3, int param4) {
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
        Object var23 = null;
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
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (rm.a(param1, -102)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if (param3 <= 0) {
                break L2;
              } else {
                if (!rm.a(param3, -116)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var6_int = ((bp) this).field_c.field_c;
              if (param4 >= 33) {
                break L3;
              } else {
                var23 = null;
                ((bp) this).a(30, -125, (int[]) null, 92, 74);
                break L3;
              }
            }
            L4: {
              var7 = 0;
              if (param3 <= param1) {
                stackOut_12_0 = param3;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = param1;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            var8 = stackIn_13_0;
            var9 = param1 >> 1;
            var10 = param3 >> 1;
            var11 = param0;
            var12 = new byte[var6_int * (var10 * var9)];
            L5: while (true) {
              jaggl.OpenGL.glTexImage2Dub(param2, var7, ((bp) this).e(-89), param1, param3, 0, te.a(-21339, ((bp) this).field_c), 5121, var11, 0);
              if (1 < var8) {
                var15 = var6_int * param1;
                var16 = 0;
                L6: while (true) {
                  if (~var6_int >= ~var16) {
                    var13 = var12;
                    var12 = var11;
                    var11 = var13;
                    param1 = var9;
                    param3 = var10;
                    var9 = var9 >> 1;
                    var7++;
                    var8 = var8 >> 1;
                    var10 = var10 >> 1;
                    continue L5;
                  } else {
                    var17 = var16;
                    var18 = var16;
                    var19 = var18 - -var15;
                    var20 = 0;
                    L7: while (true) {
                      if (var20 >= var10) {
                        var16++;
                        continue L6;
                      } else {
                        var21 = 0;
                        L8: while (true) {
                          if (~var21 <= ~var9) {
                            var19 = var19 + var15;
                            var18 = var18 + var15;
                            var20++;
                            continue L7;
                          } else {
                            var14 = param0[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + param0[var18];
                            var14 = var14 + param0[var19];
                            var18 = var18 + var6_int;
                            var19 = var19 + var6_int;
                            var14 = var14 + param0[var19];
                            var12[var17] = (byte)(var14 >> 2);
                            var19 = var19 + var6_int;
                            var17 = var17 + var6_int;
                            var21++;
                            continue L8;
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("bp.L(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.d(22989);
        super.finalize();
    }

    private final void b(int param0, int param1) {
        ((bp) this).field_e.field_Cb = ((bp) this).field_e.field_Cb;
        ((bp) this).field_e.field_Cb = ((bp) this).field_e.field_Cb + this.f(3);
    }

    public void a(ji param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (param1 == 15149) {
                break L1;
              } else {
                var4 = null;
                ((bp) this).a((ji) null, 12);
                break L1;
              }
            }
            L2: {
              if (((bp) this).field_a != param0) {
                ((bp) this).field_a = param0;
                this.b((byte) -122);
                break L2;
              } else {
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
            stackOut_6_1 = new StringBuilder().append("bp.J(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
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
        if (!(((bp) this).field_f <= 0)) {
            ((bp) this).field_e.a(this.f(3), ((bp) this).field_f, (byte) 23);
            ((bp) this).field_f = 0;
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
        try {
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
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int f(int param0) {
        int var2 = ((bp) this).field_g.field_j * ((bp) this).field_c.field_c * ((bp) this).field_b;
        return ((bp) this).field_d ? 4 * var2 / 3 : var2;
    }

    static {
    }
}
