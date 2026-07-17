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

    private final int c() {
        int var2 = ((tfa) this).field_f.field_b * ((tfa) this).field_a.field_e * ((tfa) this).field_h;
        return !((tfa) this).field_b ? var2 : var2 * 4 / 3;
    }

    final void a(int param0, float[] param1, int param2, int param3, int param4) {
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
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~param4 >= param0) {
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
              var6_int = ((tfa) this).field_f.field_b;
              var7 = 0;
              if (param2 <= param4) {
                stackOut_10_0 = param2;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = param4;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            var8 = stackIn_11_0;
            var9 = param4 >> 1;
            var10 = param2 >> 1;
            var11 = param1;
            var12 = new float[var9 * (var10 * var6_int)];
            L4: while (true) {
              jaggl.OpenGL.glTexImage2Df(param3, var7, ((tfa) this).d(124), param4, param2, 0, waa.a(((tfa) this).field_f, param0 + 1384), 5126, var11, 0);
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
                            var14 = param1[var18];
                            var18 = var18 + var6_int;
                            var14 = var14 + param1[var18];
                            var14 = var14 + param1[var19];
                            var18 = var18 + var6_int;
                            var19 = var19 + var6_int;
                            var14 = var14 + param1[var19];
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
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("tfa.S(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void f() {
        if (!(0 >= ((tfa) this).field_c)) {
            int discarded$0 = -120;
            ((tfa) this).field_j.a(((tfa) this).field_c, this.c(), 2);
            ((tfa) this).field_c = 0;
        }
        int var2 = 0;
    }

    public void a(int param0, hs param1) {
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
              if (param1 != ((tfa) this).field_g) {
                ((tfa) this).field_g = param1;
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
                var4 = null;
                ((tfa) this).a(-102, (float[]) null, -122, 31, 81);
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
            stackOut_6_1 = new StringBuilder().append("tfa.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    protected final void finalize() throws Throwable {
        int discarded$0 = 114;
        this.f();
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

    final static ija a(int param0, int param1, java.awt.Canvas param2) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            ija var5 = null;
            iga var5_ref = null;
            ija stackIn_1_0 = null;
            iga stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            ija stackOut_0_0 = null;
            iga stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var4 = Class.forName("ec");
                var5 = (ija) var4.newInstance();
                var5.a(param2, param1, 11329, param0);
                stackOut_0_0 = (ija) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new iga();
                ((ija) (Object) var5_ref).a(param2, param1, 11329, param0);
                stackOut_2_0 = (iga) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (ija) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("tfa.R(").append(param0).append(44).append(param1).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param2 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
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
              if (param4 <= 0) {
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
              var6_int = ((tfa) this).field_f.field_b;
              var7 = 0;
              if (param3 <= -113) {
                break L3;
              } else {
                ((tfa) this).field_i = 5;
                break L3;
              }
            }
            L4: {
              if (param1 < param4) {
                stackOut_13_0 = param1;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_12_0 = param4;
                stackIn_14_0 = stackOut_12_0;
                break L4;
              }
            }
            var8 = stackIn_14_0;
            var9 = param1 >> 1;
            var10 = param4 >> 1;
            var11 = param2;
            var12 = new byte[var10 * var9 * var6_int];
            L5: while (true) {
              jaggl.OpenGL.glTexImage2Dub(param0, var7, ((tfa) this).d(115), param1, param4, 0, waa.a(((tfa) this).field_f, 1383), 5121, var11, 0);
              if (var8 <= 1) {
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
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("tfa.Q(").append(param0).append(44).append(param1).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 44 + param4 + 41);
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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 <= 0) {
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
            if (((tfa) this).field_f != gpa.field_a) {
              throw new IllegalArgumentException("");
            } else {
              L3: {
                if (param0 == 99) {
                  break L3;
                } else {
                  ((tfa) this).field_b = true;
                  break L3;
                }
              }
              L4: {
                var6_int = 0;
                if (param4 < param2) {
                  stackOut_16_0 = param4;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = param2;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                }
              }
              var7 = stackIn_17_0;
              var8 = param4 >> 1;
              var9 = param2 >> 1;
              var10 = param3;
              var11 = new int[var8 * var9];
              L5: while (true) {
                jaggl.OpenGL.glTexImage2Di(param1, var6_int, ((tfa) this).d(param0 ^ 94), param4, param2, 0, 32993, ((tfa) this).field_j.field_od, var10, 0);
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
                          var20 = 255 & var14;
                          int incrementValue$8 = var23;
                          var23++;
                          var17 = var10[incrementValue$8];
                          var19 = 255 & var14 >> 8;
                          var18 = 255 & var14 >> 16;
                          var19 = var19 + (var15 >> 8 & 255);
                          var18 = var18 + (255 & var15 >> 16);
                          var20 = var20 + (255 & var15);
                          var21 = var21 + (var15 >> 24 & 255);
                          var18 = var18 + (255 & var16 >> 16);
                          var20 = var20 + (255 & var16);
                          var19 = var19 + ((65420 & var16) >> 8);
                          var21 = var21 + (var16 >> 24 & 255);
                          var20 = var20 + (255 & var17);
                          var18 = var18 + ((var17 & 16738139) >> 16);
                          var21 = var21 + (var17 >> 24 & 255);
                          var19 = var19 + ((var17 & 65316) >> 8);
                          int incrementValue$9 = var13;
                          var13++;
                          var11[incrementValue$9] = fh.a(sea.c(255, var20 >> 2), fh.a(fh.a(sea.c(var18, 1020) << 14, sea.c(1020, var21) << 22), sea.c(var19 << 6, 65280)));
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
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("tfa.BA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param4 + 41);
        }
    }

    final static void e(byte param0) {
        ko.c((byte) 57);
    }

    private final void a(byte param0, int param1) {
        ((tfa) this).field_j.field_Xb = ((tfa) this).field_j.field_Xb;
        int discarded$0 = -120;
        ((tfa) this).field_j.field_Xb = ((tfa) this).field_j.field_Xb + this.c();
    }

    tfa(kda param0, int param1, ft param2, una param3, int param4, boolean param5) {
        ((tfa) this).field_g = aw.field_G;
        try {
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
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tfa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{0, 512, 0};
    }
}
