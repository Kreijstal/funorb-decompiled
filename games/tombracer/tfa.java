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
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -120) {
          L0: {
            field_e = (int[][]) null;
            var2 = this.field_f.field_b * this.field_a.field_e * this.field_h;
            if (this.field_b) {
              stackOut_7_0 = var2 * 4 / 3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = var2;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            var2 = this.field_f.field_b * this.field_a.field_e * this.field_h;
            if (this.field_b) {
              stackOut_3_0 = var2 * 4 / 3;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = var2;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
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
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
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
            var9 = param4 >> 1442846369;
            var10 = param2 >> -1113822015;
            var11 = param1;
            var12 = new float[var9 * (var10 * var6_int)];
            L4: while (true) {
              L5: {
                jaggl.OpenGL.glTexImage2Df(param3, var7, this.d(124), param4, param2, 0, waa.a(this.field_f, param0 + 1384), 5126, var11, 0);
                if (var8 <= 1) {
                  break L5;
                } else {
                  var15 = param4 * var6_int;
                  var13 = var12;
                  if (var22 == 0) {
                    var16 = 0;
                    L6: while (true) {
                      stackOut_16_0 = var16;
                      stackIn_17_0 = stackOut_16_0;
                      L7: while (true) {
                        L8: {
                          if (stackIn_17_0 >= var6_int) {
                            var12 = var11;
                            param2 = var10;
                            param4 = var9;
                            var11 = var13;
                            var7++;
                            var8 = var8 >> 1;
                            var9 = var9 >> 1;
                            stackOut_30_0 = var10 >> 1;
                            stackIn_31_0 = stackOut_30_0;
                            break L8;
                          } else {
                            var17 = var16;
                            var18 = var16;
                            var19 = var18 - -var15;
                            stackOut_18_0 = 0;
                            stackIn_31_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (var22 != 0) {
                              break L8;
                            } else {
                              var20 = stackIn_19_0;
                              L9: while (true) {
                                if (var20 >= var10) {
                                  var16++;
                                  continue L6;
                                } else {
                                  stackOut_21_0 = 0;
                                  stackIn_17_0 = stackOut_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var22 != 0) {
                                    continue L7;
                                  } else {
                                    var21 = stackIn_22_0;
                                    L10: while (true) {
                                      L11: {
                                        if (var9 <= var21) {
                                          var18 = var18 + var15;
                                          var19 = var19 + var15;
                                          var20++;
                                          break L11;
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
                                          if (var22 != 0) {
                                            break L11;
                                          } else {
                                            continue L10;
                                          }
                                        }
                                      }
                                      continue L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var10 = stackIn_31_0;
                        if (var22 == 0) {
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var6);
            stackOut_33_1 = new StringBuilder().append("tfa.S(").append(param0).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        RuntimeException var3 = null;
        float[] var4 = null;
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
              if (param1 != this.field_g) {
                this.field_g = param1;
                this.d((byte) -114);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 7672) {
              break L0;
            } else {
              var4 = (float[]) null;
              this.a(-102, (float[]) null, -122, 31, 81);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("tfa.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
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
        int var2 = 0;
        int var3 = 0;
        var2 = this.field_j.o((byte) 106);
        if (param0 >= 32) {
          var3 = this.field_j.field_Sc[var2];
          if (this.field_i != var3) {
            if (var3 == 0) {
              jaggl.OpenGL.glEnable(this.field_i);
              this.field_j.field_Sc[var2] = this.field_i;
              jaggl.OpenGL.glBindTexture(this.field_i, this.field_c);
              return;
            } else {
              jaggl.OpenGL.glBindTexture(var3, 0);
              jaggl.OpenGL.glDisable(var3);
              jaggl.OpenGL.glEnable(this.field_i);
              this.field_j.field_Sc[var2] = this.field_i;
              jaggl.OpenGL.glBindTexture(this.field_i, this.field_c);
              return;
            }
          } else {
            jaggl.OpenGL.glBindTexture(this.field_i, this.field_c);
            return;
          }
        } else {
          return;
        }
    }

    final int d(int param0) {
        if (una.field_g == this.field_a) {
          if (it.field_b != this.field_f) {
            if (this.field_f != gpa.field_a) {
              if (rp.field_g != this.field_f) {
                if (qr.field_w != this.field_f) {
                  if (wo.field_i != this.field_f) {
                    if (js.field_g != this.field_f) {
                      if (param0 <= 43) {
                        return -92;
                      } else {
                        throw new IllegalStateException();
                      }
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
            } else {
              return 6408;
            }
          } else {
            return 6407;
          }
        } else {
          if (una.field_l != this.field_a) {
            if (this.field_a == una.field_h) {
              if (this.field_f != it.field_b) {
                if (this.field_f != gpa.field_a) {
                  if (rp.field_g != this.field_f) {
                    if (qr.field_w != this.field_f) {
                      if (wo.field_i != this.field_f) {
                        if (this.field_f != js.field_g) {
                          if (param0 > 43) {
                            throw new IllegalStateException();
                          } else {
                            return -92;
                          }
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
              } else {
                return 34837;
              }
            } else {
              if (param0 <= 43) {
                return -92;
              } else {
                throw new IllegalStateException();
              }
            }
          } else {
            if (this.field_f != it.field_b) {
              if (gpa.field_a != this.field_f) {
                if (rp.field_g != this.field_f) {
                  if (this.field_f != qr.field_w) {
                    if (wo.field_i != this.field_f) {
                      if (js.field_g != this.field_f) {
                        if (param0 <= 43) {
                          return -92;
                        } else {
                          throw new IllegalStateException();
                        }
                      } else {
                        return 6145;
                      }
                    } else {
                      return 34847;
                    }
                  } else {
                    return 34846;
                  }
                } else {
                  return 34844;
                }
              } else {
                return 34842;
              }
            } else {
              return 34843;
            }
          }
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
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            ija stackOut_2_0 = null;
            iga stackOut_4_0 = null;
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
                    stackOut_2_0 = (ija) (var5);
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new iga();
                  ((ija) ((Object) var5_ref)).a(param2, param1, 11329, param0);
                  stackOut_4_0 = (iga) (var5_ref);
                  stackIn_5_0 = stackOut_4_0;
                  return (ija) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var4_ref2);
                stackOut_6_1 = new StringBuilder().append("tfa.R(").append(param0).append(',').append(param1).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param2 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
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
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        L0: {
          L1: {
            this.field_j.a(true, (iva) (this));
            if (this.field_g == aw.field_G) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = this.field_i;
                stackOut_1_1 = 10241;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                if (this.field_b) {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 9984;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  break L2;
                } else {
                  stackOut_2_0 = stackIn_2_0;
                  stackOut_2_1 = stackIn_2_1;
                  stackOut_2_2 = 9728;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  break L2;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_4_2);
              jaggl.OpenGL.glTexParameteri(this.field_i, 10240, 9728);
              if (!TombRacer.field_G) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L3: {
            stackOut_5_0 = this.field_i;
            stackOut_5_1 = 10241;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (!this.field_b) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 9729;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 9987;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_8_2);
          jaggl.OpenGL.glTexParameteri(this.field_i, 10240, 9729);
          break L0;
        }
        if (param0 > -34) {
          this.field_h = -50;
          return;
        } else {
          return;
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
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
            var9 = param1 >> 522184481;
            var10 = param4 >> -460770975;
            var11 = param2;
            var12 = new byte[var10 * var9 * var6_int];
            L5: while (true) {
              L6: {
                jaggl.OpenGL.glTexImage2Dub(param0, var7, this.d(115), param1, param4, 0, waa.a(this.field_f, 1383), 5121, var11, 0);
                if ((var8 ^ -1) >= -2) {
                  break L6;
                } else {
                  var15 = param1 * var6_int;
                  var13 = var12;
                  if (var22 == 0) {
                    var16 = 0;
                    L7: while (true) {
                      stackOut_19_0 = var6_int ^ -1;
                      stackIn_20_0 = stackOut_19_0;
                      L8: while (true) {
                        L9: {
                          L10: {
                            if (stackIn_20_0 >= (var16 ^ -1)) {
                              break L10;
                            } else {
                              var17 = var16;
                              var18 = var16;
                              var19 = var18 + var15;
                              stackOut_21_0 = 0;
                              stackIn_34_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if (var22 != 0) {
                                break L9;
                              } else {
                                var20 = stackIn_22_0;
                                L11: while (true) {
                                  if (var20 >= var10) {
                                    var16++;
                                    if (var22 == 0) {
                                      continue L7;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    stackOut_24_0 = 0;
                                    stackIn_20_0 = stackOut_24_0;
                                    stackIn_25_0 = stackOut_24_0;
                                    if (var22 != 0) {
                                      continue L8;
                                    } else {
                                      var21 = stackIn_25_0;
                                      L12: while (true) {
                                        L13: {
                                          if (var21 >= var9) {
                                            var19 = var19 + var15;
                                            var18 = var18 + var15;
                                            var20++;
                                            break L13;
                                          } else {
                                            var14 = param2[var18];
                                            var18 = var18 + var6_int;
                                            var14 = var14 + param2[var18];
                                            var18 = var18 + var6_int;
                                            var14 = var14 + param2[var19];
                                            var19 = var19 + var6_int;
                                            var14 = var14 + param2[var19];
                                            var19 = var19 + var6_int;
                                            var12[var17] = (byte)(var14 >> -379400350);
                                            var17 = var17 + var6_int;
                                            var21++;
                                            if (var22 != 0) {
                                              break L13;
                                            } else {
                                              continue L12;
                                            }
                                          }
                                        }
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = var11;
                          var11 = var13;
                          param4 = var10;
                          param1 = var9;
                          var8 = var8 >> 1;
                          var10 = var10 >> 1;
                          stackOut_33_0 = var9 >> 1;
                          stackIn_34_0 = stackOut_33_0;
                          break L9;
                        }
                        var9 = stackIn_34_0;
                        var7++;
                        if (var22 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var6 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var6);
            stackOut_36_1 = new StringBuilder().append("tfa.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int[] param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
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
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
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
              var8 = param4 >> 439440193;
              var9 = param2 >> 1282280385;
              var10 = param3;
              var11 = new int[var8 * var9];
              L5: while (true) {
                L6: {
                  jaggl.OpenGL.glTexImage2Di(param1, var6_int, this.d(param0 ^ 94), param4, param2, 0, 32993, this.field_j.field_od, var10, 0);
                  if (1 >= var7) {
                    break L6;
                  } else {
                    var13 = 0;
                    var22 = 0;
                    var23 = param4 + var22;
                    var12 = var11;
                    if (var26 == 0) {
                      var24 = 0;
                      L7: while (true) {
                        L8: {
                          if (var9 <= var24) {
                            var11 = var10;
                            param2 = var9;
                            param4 = var8;
                            var10 = var12;
                            var8 = var8 >> 1;
                            var7 = var7 >> 1;
                            stackOut_31_0 = var9 >> 1;
                            stackIn_32_0 = stackOut_31_0;
                            break L8;
                          } else {
                            stackOut_23_0 = 0;
                            stackIn_32_0 = stackOut_23_0;
                            stackIn_24_0 = stackOut_23_0;
                            if (var26 != 0) {
                              break L8;
                            } else {
                              var25 = stackIn_24_0;
                              L9: while (true) {
                                L10: {
                                  if (var25 >= var8) {
                                    var23 = var23 + param4;
                                    var22 = var22 + param4;
                                    var24++;
                                    break L10;
                                  } else {
                                    incrementValue$5 = var22;
                                    var22++;
                                    var14 = var10[incrementValue$5];
                                    incrementValue$6 = var23;
                                    var23++;
                                    var16 = var10[incrementValue$6];
                                    incrementValue$7 = var22;
                                    var22++;
                                    var15 = var10[incrementValue$7];
                                    var21 = 255 & var14 >> -647629608;
                                    var20 = 255 & var14;
                                    incrementValue$8 = var23;
                                    var23++;
                                    var17 = var10[incrementValue$8];
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
                                    incrementValue$9 = var13;
                                    var13++;
                                    var11[incrementValue$9] = fh.a(sea.c(255, var20 >> 1580663362), fh.a(fh.a(sea.c(var18, 1020) << -552166674, sea.c(1020, var21) << 1886030454), sea.c(var19 << -15456538, 65280)));
                                    var25++;
                                    if (var26 != 0) {
                                      break L10;
                                    } else {
                                      continue L9;
                                    }
                                  }
                                }
                                continue L7;
                              }
                            }
                          }
                        }
                        var9 = stackIn_32_0;
                        var6_int++;
                        if (var26 == 0) {
                          continue L5;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var6);
            stackOut_34_1 = new StringBuilder().append("tfa.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param4 + ')');
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
