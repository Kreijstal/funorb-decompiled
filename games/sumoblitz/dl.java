/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends eu {
    private float field_n;
    private float field_j;
    private float field_d;
    private float field_o;
    private float field_k;
    private float field_e;
    static String[] field_h;
    private float field_c;
    static int field_f;
    private float field_l;
    private float field_g;
    private float field_m;
    private float field_i;
    private float field_b;

    final static void a(int param0, int param1, byte param2, int param3, int param4, float[] param5, int param6) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 <= (param0 ^ -1)) {
                break L1;
              } else {
                if (!rm.a(param0, -112)) {
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
                if (rm.a(param1, -102)) {
                  break L2;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L3: {
              var7_int = pc.a(param6, (byte) -107);
              var8 = 0;
              if (param2 == 11) {
                break L3;
              } else {
                field_f = 114;
                break L3;
              }
            }
            L4: {
              if (param0 < param1) {
                stackIn_13_0 = param0;
                break L4;
              } else {
                stackIn_13_0 = param1;
                break L4;
              }
            }
            var9 = stackIn_13_0;
            var10 = param0 >> -1262924575;
            var11 = param1 >> 947159873;
            var12 = param5;
            var13 = new float[var7_int * var11 * var10];
            L5: while (true) {
              jaggl.OpenGL.glTexImage2Df(param3, var8, param4, param0, param1, 0, param6, 5126, var12, 0);
              if (-2 > (var9 ^ -1)) {
                var16 = var7_int * param0;
                var17 = 0;
                L6: while (true) {
                  if (var7_int <= var17) {
                    var14 = var13;
                    var13 = var12;
                    var12 = var14;
                    param0 = var10;
                    param1 = var11;
                    var10 = var10 >> 1;
                    var8++;
                    var11 = var11 >> 1;
                    var9 = var9 >> 1;
                    continue L5;
                  } else {
                    var18 = var17;
                    var19 = var17;
                    var20 = var19 + var16;
                    var21 = 0;
                    L7: while (true) {
                      if (var21 >= var11) {
                        var17++;
                        continue L6;
                      } else {
                        var22 = 0;
                        L8: while (true) {
                          if (var10 <= var22) {
                            var20 = var20 + var16;
                            var19 = var19 + var16;
                            var21++;
                            continue L7;
                          } else {
                            var15 = var12[var19];
                            var19 = var19 + var7_int;
                            var15 = var15 + var12[var19];
                            var15 = var15 + var12[var20];
                            var19 = var19 + var7_int;
                            var20 = var20 + var7_int;
                            var15 = var15 + var12[var20];
                            var13[var18] = 0.25f * var15;
                            var20 = var20 + var7_int;
                            var18 = var18 + var7_int;
                            var22++;
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
            var7 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var7);

            stackIn_29_1 = new StringBuilder().append("dl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param6 + ')');
        }
    }

    final void a(float[] param0, int param1, float param2, float param3, float param4, float param5) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var7_float = 0.0f;
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                param0[2] = this.field_d * param3 + (this.field_l * param5 + param2 * this.field_o);
                param0[1] = this.field_j * param5 + param2 * this.field_e + this.field_k * param3;
                param0[0] = this.field_b * param2 + param5 * this.field_n + param3 * this.field_m;
                if (param5 > 0.00390625f) {
                  break L2;
                } else {
                  if (param5 >= -0.00390625f) {
                    L3: {
                      if (0.00390625f < param2) {
                        break L3;
                      } else {
                        if (param2 >= -0.00390625f) {
                          var10 = -param4 / param3;
                          var7_float = this.field_c + var10 * this.field_m;
                          var9 = this.field_d * var10 + this.field_g;
                          var8 = this.field_i + this.field_k * var10;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var10 = -param4 / param2;
                    var7_float = this.field_c + this.field_b * var10;
                    var8 = this.field_i + var10 * this.field_e;
                    var9 = this.field_o * var10 + this.field_g;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var10 = -param4 / param5;
              var8 = this.field_i + this.field_j * var10;
              var7_float = this.field_n * var10 + this.field_c;
              var9 = this.field_g + var10 * this.field_l;
              break L1;
            }
            L4: {
              if (param1 == 26839) {
                break L4;
              } else {
                this.field_o = -0.34753671288490295f;
                break L4;
              }
            }
            param0[3] = -(param0[2] * var9 + (param0[1] * var8 + var7_float * param0[0]));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("dl.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void c(int param0) {
        if (param0 != 3489) {
            float[] var3 = (float[]) null;
            dl.a(-57, 41, (byte) -108, 122, 88, (float[]) null, -31);
        }
        this.field_l = 0.0f;
        this.field_e = 1.0f;
        this.field_j = 0.0f;
        this.field_k = 0.0f;
        this.field_o = 0.0f;
        this.field_n = 1.0f;
        this.field_g = 0.0f;
        this.field_d = 1.0f;
        this.field_i = 0.0f;
        this.field_c = 0.0f;
        this.field_b = 0.0f;
        this.field_m = 0.0f;
    }

    final static void a(br param0, byte param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (-4 >= (var2_int ^ -1)) {
                var2_int = 0;
                L2: while (true) {
                  if (kb.field_a <= var2_int) {
                    L3: {
                      if (param1 >= 69) {
                        break L3;
                      } else {
                        field_h = (String[]) null;
                        break L3;
                      }
                    }
                    dupTemp$0 = param0.c(-82);
                    vp.field_c[dupTemp$0] = vp.field_c[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (kb.field_a <= var3) {
                        kb.field_a = var2_int;
                        fieldTemp$1 = kb.field_a;
                        kb.field_a = kb.field_a + 1;
                        aj.field_D[fieldTemp$1] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param0.field_g != aj.field_D[var3].field_g) {
                              break L6;
                            } else {
                              var4 = aj.field_D[var3].c(-120);
                              if (ro.field_c >= vp.field_c[var4]) {
                                break L6;
                              } else {
                                vp.field_c[var4] = vp.field_c[var4] - 1;
                                break L5;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          aj.field_D[incrementValue$2] = aj.field_D[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (aj.field_D[var2_int].field_g == param0.field_g) {
                        dupTemp$3 = aj.field_D[var2_int].c(-112);
                        vp.field_c[dupTemp$3] = vp.field_c[dupTemp$3] + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                vp.field_c[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("dl.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final float[] a(int param0) {
        mo.field_n[1] = this.field_j;
        mo.field_n[10] = this.field_d;
        mo.field_n[param0] = this.field_e;
        mo.field_n[8] = this.field_m;
        mo.field_n[6] = this.field_o;
        mo.field_n[2] = this.field_l;
        mo.field_n[12] = 0.0f;
        mo.field_n[14] = 0.0f;
        mo.field_n[0] = this.field_n;
        mo.field_n[9] = this.field_k;
        mo.field_n[13] = 0.0f;
        mo.field_n[4] = this.field_b;
        return mo.field_n;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            dl.b(95);
        }
        field_h = null;
    }

    final float[] b(byte param0) {
        if (param0 <= 50) {
            this.c(-118);
        }
        mo.field_n[0] = this.field_n;
        mo.field_n[6] = this.field_o;
        mo.field_n[8] = this.field_m;
        mo.field_n[14] = this.field_g;
        mo.field_n[13] = this.field_i;
        mo.field_n[1] = this.field_j;
        mo.field_n[12] = this.field_c;
        mo.field_n[4] = this.field_b;
        mo.field_n[10] = this.field_d;
        mo.field_n[2] = this.field_l;
        mo.field_n[9] = this.field_k;
        mo.field_n[5] = this.field_e;
        return mo.field_n;
    }

    dl() {
        this.c(3489);
    }

    static {
        field_h = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
