/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt extends bq {
    private boolean field_j;
    private hp[] field_e;
    static rj field_i;
    private tq field_f;
    private boolean field_g;
    static int[] field_h;

    final boolean b(byte param0) {
        if (param0 >= -64) {
            return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_b.a(33, param2);
              this.field_b.c(param1, true);
              if (param0 == 35) {
                break L1;
              } else {
                this.a((byte) 46, 96, -43);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wt.A(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void c(int param0) {
        if (param0 != 8193) {
            field_h = (int[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_b.a(20685, 7681, 8448);
        if (param0 >= -30) {
            field_h = (int[]) null;
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        this.field_f = new tq(this.field_b, 2);
        this.field_f.a(0, 4864);
        this.field_b.g(1, 98);
        jaggl.OpenGL.glTexGeni(8192, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8193, 9472, 34065);
        jaggl.OpenGL.glTexGeni(8194, 9472, 34065);
        jaggl.OpenGL.glEnable(3168);
        jaggl.OpenGL.glEnable(3169);
        jaggl.OpenGL.glEnable(3170);
        jaggl.OpenGL.glMatrixMode(5890);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glRotatef(22.5f, 1.0f, 0.0f, 0.0f);
        jaggl.OpenGL.glMatrixMode(5888);
        if (this.field_j) {
          this.field_b.a(20685, 7681, 260);
          this.field_b.b(5890, 770, 0, -20);
          this.field_b.a(117, 0, 34167, 770);
          this.field_b.g(0, 83);
          this.field_f.a(true);
          this.field_f.a(1, 4864);
          if (param0 > -116) {
            field_i = (rj) null;
            this.field_b.g(1, 102);
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            if (this.field_j) {
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, -118);
              this.field_b.a(122, 0, 5890, 770);
              this.field_b.g(0, 81);
              this.field_f.a(true);
              return;
            } else {
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, -120);
              this.field_b.g(2, 111);
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, 20);
              this.field_b.b(34168, 768, 1, -126);
              this.field_b.a(114, 0, 5890, 770);
              if (var3 != 0) {
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, -118);
                this.field_b.a(122, 0, 5890, 770);
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              } else {
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              }
            }
          } else {
            this.field_b.g(1, 102);
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            if (this.field_j) {
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, -118);
              this.field_b.a(122, 0, 5890, 770);
              this.field_b.g(0, 81);
              this.field_f.a(true);
              return;
            } else {
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, -120);
              this.field_b.g(2, 111);
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, 20);
              this.field_b.b(34168, 768, 1, -126);
              this.field_b.a(114, 0, 5890, 770);
              if (var3 != 0) {
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, -118);
                this.field_b.a(122, 0, 5890, 770);
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              } else {
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              }
            }
          }
        } else {
          this.field_b.a(20685, 8448, 7681);
          this.field_b.b(34168, 768, 0, 30);
          this.field_b.g(2, 123);
          this.field_b.a(20685, 7681, 260);
          this.field_b.b(34168, 768, 0, 4);
          this.field_b.b(34168, 770, 1, 20);
          this.field_b.a(125, 0, 34167, 770);
          if (var3 == 0) {
            this.field_b.g(0, 83);
            this.field_f.a(true);
            this.field_f.a(1, 4864);
            if (param0 <= -116) {
              this.field_b.g(1, 102);
              jaggl.OpenGL.glDisable(3168);
              jaggl.OpenGL.glDisable(3169);
              jaggl.OpenGL.glDisable(3170);
              jaggl.OpenGL.glMatrixMode(5890);
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glMatrixMode(5888);
              if (this.field_j) {
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, -118);
                this.field_b.a(122, 0, 5890, 770);
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              } else {
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, -120);
                this.field_b.g(2, 111);
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, 20);
                this.field_b.b(34168, 768, 1, -126);
                this.field_b.a(114, 0, 5890, 770);
                if (var3 != 0) {
                  this.field_b.a(20685, 8448, 8448);
                  this.field_b.b(5890, 768, 0, -118);
                  this.field_b.a(122, 0, 5890, 770);
                  this.field_b.g(0, 81);
                  this.field_f.a(true);
                  return;
                } else {
                  this.field_b.g(0, 81);
                  this.field_f.a(true);
                  return;
                }
              }
            } else {
              field_i = (rj) null;
              this.field_b.g(1, 102);
              jaggl.OpenGL.glDisable(3168);
              jaggl.OpenGL.glDisable(3169);
              jaggl.OpenGL.glDisable(3170);
              jaggl.OpenGL.glMatrixMode(5890);
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glMatrixMode(5888);
              if (this.field_j) {
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, -118);
                this.field_b.a(122, 0, 5890, 770);
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              } else {
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, -120);
                this.field_b.g(2, 111);
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, 20);
                this.field_b.b(34168, 768, 1, -126);
                this.field_b.a(114, 0, 5890, 770);
                if (var3 != 0) {
                  this.field_b.a(20685, 8448, 8448);
                  this.field_b.b(5890, 768, 0, -118);
                  this.field_b.a(122, 0, 5890, 770);
                  this.field_b.g(0, 81);
                  this.field_f.a(true);
                  return;
                } else {
                  this.field_b.g(0, 81);
                  this.field_f.a(true);
                  return;
                }
              }
            }
          } else {
            L0: {
              this.field_b.a(20685, 7681, 260);
              this.field_b.b(5890, 770, 0, -20);
              this.field_b.a(117, 0, 34167, 770);
              this.field_b.g(0, 83);
              this.field_f.a(true);
              this.field_f.a(1, 4864);
              if (param0 <= -116) {
                break L0;
              } else {
                field_i = (rj) null;
                break L0;
              }
            }
            this.field_b.g(1, 102);
            jaggl.OpenGL.glDisable(3168);
            jaggl.OpenGL.glDisable(3169);
            jaggl.OpenGL.glDisable(3170);
            jaggl.OpenGL.glMatrixMode(5890);
            jaggl.OpenGL.glLoadIdentity();
            jaggl.OpenGL.glMatrixMode(5888);
            if (!this.field_j) {
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, -120);
              this.field_b.g(2, 111);
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, 20);
              this.field_b.b(34168, 768, 1, -126);
              this.field_b.a(114, 0, 5890, 770);
              if (var3 == 0) {
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              } else {
                this.field_b.a(20685, 8448, 8448);
                this.field_b.b(5890, 768, 0, -118);
                this.field_b.a(122, 0, 5890, 770);
                this.field_b.g(0, 81);
                this.field_f.a(true);
                return;
              }
            } else {
              this.field_b.a(20685, 8448, 8448);
              this.field_b.b(5890, 768, 0, -118);
              this.field_b.a(122, 0, 5890, 770);
              this.field_b.g(0, 81);
              this.field_f.a(true);
              return;
            }
          }
        }
    }

    wt(fr param0) {
        super(param0);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        byte[][] var27 = null;
        byte[][] var28 = null;
        byte[][] var29 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var17 = Sumoblitz.field_L ? 1 : 0;
        this.field_g = false;
        try {
          L0: {
            if (param0.field_Ob) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if ((param0.field_T ^ -1) <= -4) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              L2: {
                ((wt) (this)).field_j = stackIn_6_1 != 0;
                if (this.field_j) {
                  stackOut_8_0 = 48;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 127;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              var2_int = stackIn_9_0;
              var29 = new byte[6][4096];
              var27 = new byte[6][4096];
              var28 = new byte[6][4096];
              var9 = 0;
              var14 = 0;
              L3: while (true) {
                stackOut_10_0 = 64;
                stackIn_11_0 = stackOut_10_0;
                L4: while (true) {
                  L5: {
                    if (stackIn_11_0 <= var14) {
                      this.field_e = new hp[3];
                      this.field_e[0] = new hp(this.field_b, 6406, 64, false, var27, 6406);
                      this.field_e[1] = new hp(this.field_b, 6406, 64, false, var28, 6406);
                      this.field_e[2] = new hp(this.field_b, 6406, 64, false, var29, 6406);
                      break L5;
                    } else {
                      if (var17 != 0) {
                        break L5;
                      } else {
                        var15 = 0;
                        L6: while (true) {
                          stackOut_14_0 = var15 ^ -1;
                          stackOut_14_1 = -65;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          L7: while (true) {
                            if (stackIn_15_0 <= stackIn_15_1) {
                              var14++;
                              continue L3;
                            } else {
                              var12 = 2.0f * (float)var14 / 64.0f - 1.0f;
                              var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                              var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                              var12 = var12 * var13;
                              var11 = var11 * var13;
                              stackOut_16_0 = 0;
                              stackIn_11_0 = stackOut_16_0;
                              stackIn_17_0 = stackOut_16_0;
                              if (var17 != 0) {
                                continue L4;
                              } else {
                                var16 = stackIn_17_0;
                                L8: while (true) {
                                  if (-7 >= (var16 ^ -1)) {
                                    var9++;
                                    var15++;
                                    continue L6;
                                  } else {
                                    stackOut_19_0 = var16 ^ -1;
                                    stackOut_19_1 = -1;
                                    stackIn_15_0 = stackOut_19_0;
                                    stackIn_15_1 = stackOut_19_1;
                                    stackIn_20_0 = stackOut_19_0;
                                    stackIn_20_1 = stackOut_19_1;
                                    if (var17 != 0) {
                                      continue L7;
                                    } else {
                                      L9: {
                                        L10: {
                                          if (stackIn_20_0 != stackIn_20_1) {
                                            break L10;
                                          } else {
                                            var10 = -var11;
                                            if (var17 == 0) {
                                              break L9;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (-2 == (var16 ^ -1)) {
                                            break L11;
                                          } else {
                                            L12: {
                                              if ((var16 ^ -1) != -3) {
                                                break L12;
                                              } else {
                                                var10 = var12;
                                                if (var17 == 0) {
                                                  break L9;
                                                } else {
                                                  break L12;
                                                }
                                              }
                                            }
                                            L13: {
                                              if (3 == var16) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  if ((var16 ^ -1) == -5) {
                                                    break L14;
                                                  } else {
                                                    var10 = -var13;
                                                    if (var17 == 0) {
                                                      break L9;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                var10 = var13;
                                                if (var17 == 0) {
                                                  break L9;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            var10 = -var12;
                                            if (var17 == 0) {
                                              break L9;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        var10 = var11;
                                        break L9;
                                      }
                                      L15: {
                                        L16: {
                                          if (0.0f >= var10) {
                                            break L16;
                                          } else {
                                            var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                                            var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                                            var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                                            if (var17 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var8 = 0;
                                        var7 = 0;
                                        var6 = 0;
                                        break L15;
                                      }
                                      var27[var16][var9] = (byte)var6;
                                      var28[var16][var9] = (byte)var7;
                                      var29[var16][var9] = (byte)var8;
                                      var16++;
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
                  }
                  this.d(-125);
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var2);
            stackOut_40_1 = new StringBuilder().append("wt.<init>(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L17;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L17;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 > -17) {
            return;
        }
        field_i = null;
        field_h = null;
    }

    final void b(int param0) {
        L0: {
          if (!this.field_g) {
            break L0;
          } else {
            L1: {
              if (!this.field_j) {
                this.field_b.g(2, 124);
                this.field_b.a(39, (ht) null);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_b.g(1, 91);
            this.field_b.a(59, (ht) null);
            this.field_b.g(0, 92);
            this.field_f.a((byte) 121, '');
            this.field_g = false;
            if (!Sumoblitz.field_L) {
              this.field_b.a(20685, 8448, 8448);
              if (param0 > -125) {
                this.field_e = (hp[]) null;
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        this.field_b.a(118, 0, 5890, 770);
        this.field_b.a(20685, 8448, 8448);
        if (param0 <= -125) {
          return;
        } else {
          this.field_e = (hp[]) null;
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 > 33) {
          if (this.field_f != null) {
            if (param1) {
              L0: {
                if (!this.field_j) {
                  this.field_b.g(2, 89);
                  this.field_b.a(101, this.field_b.field_n);
                  this.field_b.g(0, 105);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_f.a((byte) 121, ' ');
              this.field_g = true;
              if (Sumoblitz.field_L) {
                this.field_b.a(124, 0, 34168, 770);
                return;
              } else {
                return;
              }
            } else {
              this.field_b.a(124, 0, 34168, 770);
              return;
            }
          } else {
            this.field_b.a(124, 0, 34168, 770);
            return;
          }
        } else {
          wt.c(-77);
          if (this.field_f != null) {
            if (param1) {
              L1: {
                if (!this.field_j) {
                  this.field_b.g(2, 89);
                  this.field_b.a(101, this.field_b.field_n);
                  this.field_b.g(0, 105);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_f.a((byte) 121, ' ');
              this.field_g = true;
              if (Sumoblitz.field_L) {
                this.field_b.a(124, 0, 34168, 770);
                return;
              } else {
                return;
              }
            } else {
              this.field_b.a(124, 0, 34168, 770);
              return;
            }
          } else {
            this.field_b.a(124, 0, 34168, 770);
            return;
          }
        }
    }

    final static void a(int param0, byte param1) {
        ut.a(8, (byte) -55, nt.field_m[param0], true);
        if (param1 < 27) {
            field_i = (rj) null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (!this.field_g) {
          if (param0 < 39) {
            wt.c(-83);
            return;
          } else {
            return;
          }
        } else {
          this.field_b.g(1, 122);
          this.field_b.a(107, this.field_e[param1 + -1]);
          this.field_b.g(0, 95);
          if (param0 >= 39) {
            return;
          } else {
            wt.c(-83);
            return;
          }
        }
    }

    static {
        field_h = new int[]{1, 1, 1};
    }
}
