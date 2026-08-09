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
        try {
            this.field_b.a(33, param2);
            this.field_b.c(param1, true);
            if (param0 != 35) {
                this.a((byte) 46, 96, -43);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wt.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        int var3 = Sumoblitz.field_L ? 1 : 0;
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
        if (!this.field_j) {
            this.field_b.a(20685, 8448, 7681);
            this.field_b.b(34168, 768, 0, 30);
            this.field_b.g(2, 123);
            this.field_b.a(20685, 7681, 260);
            this.field_b.b(34168, 768, 0, 4);
            this.field_b.b(34168, 770, 1, 20);
            this.field_b.a(125, 0, 34167, 770);
        } else {
            this.field_b.a(20685, 7681, 260);
            this.field_b.b(5890, 770, 0, -20);
            this.field_b.a(117, 0, 34167, 770);
        }
        this.field_b.g(0, 83);
        this.field_f.a(true);
        this.field_f.a(1, 4864);
        if (param0 > -116) {
            field_i = (rj) null;
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
        } else {
            this.field_b.a(20685, 8448, 8448);
            this.field_b.b(5890, 768, 0, -118);
            this.field_b.a(122, 0, 5890, 770);
        }
        this.field_b.g(0, 81);
        this.field_f.a(true);
    }

    wt(fr param0) {
        super(param0);
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        byte[][] var27 = null;
        byte[][] var28 = null;
        byte[][] var29 = null;
        this.field_g = false;
        try {
          L0: {
            L1: {
              if (!param0.field_Ob) {
                break L1;
              } else {
                L2: {
                  stackIn_4_0 = this;

                  if ((param0.field_T ^ -1) <= -4) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((wt) (this)).field_j = stackIn_5_1 != 0;
                  if (this.field_j) {
                    stackIn_8_0 = 48;
                    break L3;
                  } else {
                    stackIn_8_0 = 127;
                    break L3;
                  }
                }
                var2_int = stackIn_8_0;
                var29 = new byte[6][4096];
                var27 = new byte[6][4096];
                var28 = new byte[6][4096];
                var9 = 0;
                var14 = 0;
                L4: while (true) {
                  if (64 <= var14) {
                    this.field_e = new hp[3];
                    this.field_e[0] = new hp(this.field_b, 6406, 64, false, var27, 6406);
                    this.field_e[1] = new hp(this.field_b, 6406, 64, false, var28, 6406);
                    this.field_e[2] = new hp(this.field_b, 6406, 64, false, var29, 6406);
                    this.d(-125);
                    break L1;
                  } else {
                    var15 = 0;
                    L5: while (true) {
                      if ((var15 ^ -1) <= -65) {
                        var14++;
                        continue L4;
                      } else {
                        var12 = 2.0f * (float)var14 / 64.0f - 1.0f;
                        var11 = -1.0f + 2.0f * (float)var15 / 64.0f;
                        var13 = (float)(1.0 / Math.sqrt((double)(var11 * var11 + 1.0f + var12 * var12)));
                        var12 = var12 * var13;
                        var11 = var11 * var13;
                        var16 = 0;
                        L6: while (true) {
                          if (-7 >= (var16 ^ -1)) {
                            var9++;
                            var15++;
                            continue L5;
                          } else {
                            L7: {
                              if ((var16 ^ -1) != -1) {
                                if (-2 == (var16 ^ -1)) {
                                  var10 = var11;
                                  break L7;
                                } else {
                                  if ((var16 ^ -1) != -3) {
                                    if (3 == var16) {
                                      var10 = -var12;
                                      break L7;
                                    } else {
                                      if ((var16 ^ -1) == -5) {
                                        var10 = var13;
                                        break L7;
                                      } else {
                                        var10 = -var13;
                                        break L7;
                                      }
                                    }
                                  } else {
                                    var10 = var12;
                                    break L7;
                                  }
                                }
                              } else {
                                var10 = -var11;
                                break L7;
                              }
                            }
                            L8: {
                              if (0.0f >= var10) {
                                var8 = 0;
                                var7 = 0;
                                var6 = 0;
                                break L8;
                              } else {
                                var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                                var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                                var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                                break L8;
                              }
                            }
                            var27[var16][var9] = (byte)var6;
                            var28[var16][var9] = (byte)var7;
                            var29[var16][var9] = (byte)var8;
                            var16++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var2);

            stackIn_35_1 = new StringBuilder().append("wt.<init>(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L9;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
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
        if (this.field_g) {
            if (!(this.field_j)) {
                this.field_b.g(2, 124);
                this.field_b.a(39, (ht) null);
            }
            this.field_b.g(1, 91);
            this.field_b.a(59, (ht) null);
            this.field_b.g(0, 92);
            this.field_f.a((byte) 121, '');
            this.field_g = false;
        } else {
            this.field_b.a(118, 0, 5890, 770);
        }
        this.field_b.a(20685, 8448, 8448);
        if (param0 > -125) {
            this.field_e = (hp[]) null;
        }
    }

    final void a(byte param0, boolean param1) {
        L0: {
          if (param0 > 33) {
            break L0;
          } else {
            wt.c(-77);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_f == null) {
              break L2;
            } else {
              if (!param1) {
                break L2;
              } else {
                L3: {
                  if (!this.field_j) {
                    this.field_b.g(2, 89);
                    this.field_b.a(101, this.field_b.field_n);
                    this.field_b.g(0, 105);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                this.field_f.a((byte) 121, ' ');
                this.field_g = true;
                break L1;
              }
            }
          }
          this.field_b.a(124, 0, 34168, 770);
          break L1;
        }
    }

    final static void a(int param0, byte param1) {
        ut.a(8, (byte) -55, nt.field_m[param0], true);
        if (param1 < 27) {
            field_i = (rj) null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (this.field_g) {
            this.field_b.g(1, 122);
            this.field_b.a(107, this.field_e[param1 + -1]);
            this.field_b.g(0, 95);
        }
        if (param0 < 39) {
            wt.c(-83);
        }
    }

    static {
        field_h = new int[]{1, 1, 1};
    }
}
