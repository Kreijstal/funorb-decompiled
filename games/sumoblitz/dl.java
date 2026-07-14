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
        int var7 = 0;
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
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var23 = Sumoblitz.field_L ? 1 : 0;
          if (-1 <= param0) {
            break L0;
          } else {
            if (!rm.a(param0, -112)) {
              throw new IllegalArgumentException("");
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1 >= param1) {
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
          var7 = pc.a(param6, (byte) -107);
          var8 = 0;
          if (param2 == 11) {
            break L2;
          } else {
            field_f = 114;
            break L2;
          }
        }
        L3: {
          if (param0 < param1) {
            stackOut_11_0 = param0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = param1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var9 = stackIn_12_0;
        var10 = param0 >> -1262924575;
        var11 = param1 >> 947159873;
        var12 = param5;
        var13 = new float[var7 * var11 * var10];
        L4: while (true) {
          jaggl.OpenGL.glTexImage2Df(param3, var8, param4, param0, param1, 0, param6, 5126, var12, 0);
          if (-2 > (var9 ^ -1)) {
            var16 = var7 * param0;
            var17 = 0;
            L5: while (true) {
              if (var7 <= var17) {
                var14 = var13;
                var13 = var12;
                var12 = var14;
                param0 = var10;
                param1 = var11;
                var10 = var10 >> 1;
                var8++;
                var11 = var11 >> 1;
                var9 = var9 >> 1;
                continue L4;
              } else {
                var18 = var17;
                var19 = var17;
                var20 = var19 + var16;
                var21 = 0;
                L6: while (true) {
                  if (var21 >= var11) {
                    var17++;
                    continue L5;
                  } else {
                    var22 = 0;
                    L7: while (true) {
                      if (var10 <= var22) {
                        var20 = var20 + var16;
                        var19 = var19 + var16;
                        var21++;
                        continue L6;
                      } else {
                        var15 = param5[var19];
                        var19 = var19 + var7;
                        var15 = var15 + param5[var19];
                        var15 = var15 + param5[var20];
                        var19 = var19 + var7;
                        var20 = var20 + var7;
                        var15 = var15 + param5[var20];
                        var13[var18] = 0.25f * var15;
                        var20 = var20 + var7;
                        var18 = var18 + var7;
                        var22++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(float[] param0, int param1, float param2, float param3, float param4, float param5) {
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        L0: {
          L1: {
            var11 = Sumoblitz.field_L ? 1 : 0;
            param0[2] = ((dl) this).field_d * param3 + (((dl) this).field_l * param5 + param2 * ((dl) this).field_o);
            param0[1] = ((dl) this).field_j * param5 + param2 * ((dl) this).field_e + ((dl) this).field_k * param3;
            param0[0] = ((dl) this).field_b * param2 + param5 * ((dl) this).field_n + param3 * ((dl) this).field_m;
            if (param5 > 0.00390625f) {
              break L1;
            } else {
              if (param5 >= -0.00390625f) {
                L2: {
                  if (0.00390625f < param2) {
                    break L2;
                  } else {
                    if (param2 >= -0.00390625f) {
                      var10 = -param4 / param3;
                      var7 = ((dl) this).field_c + var10 * ((dl) this).field_m;
                      var9 = ((dl) this).field_d * var10 + ((dl) this).field_g;
                      var8 = ((dl) this).field_i + ((dl) this).field_k * var10;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = -param4 / param2;
                var7 = ((dl) this).field_c + ((dl) this).field_b * var10;
                var8 = ((dl) this).field_i + var10 * ((dl) this).field_e;
                var9 = ((dl) this).field_o * var10 + ((dl) this).field_g;
                break L0;
              } else {
                break L1;
              }
            }
          }
          var10 = -param4 / param5;
          var8 = ((dl) this).field_i + ((dl) this).field_j * var10;
          var7 = ((dl) this).field_n * var10 + ((dl) this).field_c;
          var9 = ((dl) this).field_g + var10 * ((dl) this).field_l;
          break L0;
        }
        L3: {
          if (param1 == 26839) {
            break L3;
          } else {
            ((dl) this).field_o = -0.34753671288490295f;
            break L3;
          }
        }
        param0[3] = -(param0[2] * var9 + (param0[1] * var8 + var7 * param0[0]));
    }

    private final void c(int param0) {
        if (param0 != 3489) {
            Object var3 = null;
            dl.a(-57, 41, (byte) -108, 122, 88, (float[]) null, -31);
        }
        ((dl) this).field_l = 0.0f;
        ((dl) this).field_e = 1.0f;
        ((dl) this).field_j = 0.0f;
        ((dl) this).field_k = 0.0f;
        ((dl) this).field_o = 0.0f;
        ((dl) this).field_n = 1.0f;
        ((dl) this).field_g = 0.0f;
        ((dl) this).field_d = 1.0f;
        ((dl) this).field_i = 0.0f;
        ((dl) this).field_c = 0.0f;
        ((dl) this).field_b = 0.0f;
        ((dl) this).field_m = 0.0f;
    }

    final static void a(br param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (kb.field_a <= var2) {
                L2: {
                  if (param1 >= 69) {
                    break L2;
                  } else {
                    field_h = null;
                    break L2;
                  }
                }
                vp.field_c[param0.c(-82)] = vp.field_c[param0.c(-82)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (kb.field_a <= var3) {
                    kb.field_a = var2;
                    kb.field_a = kb.field_a + 1;
                    aj.field_D[kb.field_a] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_g != aj.field_D[var3].field_g) {
                        break L4;
                      } else {
                        var4 = aj.field_D[var3].c(-120);
                        if (ro.field_c >= vp.field_c[var4]) {
                          break L4;
                        } else {
                          vp.field_c[var4] = vp.field_c[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      }
                    }
                    var2++;
                    aj.field_D[var2] = aj.field_D[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (aj.field_D[var2].field_g == param0.field_g) {
                  vp.field_c[aj.field_D[var2].c(-112)] = vp.field_c[aj.field_D[var2].c(-112)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            vp.field_c[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final float[] a(int param0) {
        mo.field_n[1] = ((dl) this).field_j;
        mo.field_n[10] = ((dl) this).field_d;
        mo.field_n[param0] = ((dl) this).field_e;
        mo.field_n[8] = ((dl) this).field_m;
        mo.field_n[6] = ((dl) this).field_o;
        mo.field_n[2] = ((dl) this).field_l;
        mo.field_n[12] = 0.0f;
        mo.field_n[14] = 0.0f;
        mo.field_n[0] = ((dl) this).field_n;
        mo.field_n[9] = ((dl) this).field_k;
        mo.field_n[13] = 0.0f;
        mo.field_n[4] = ((dl) this).field_b;
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
        mo.field_n[0] = ((dl) this).field_n;
        mo.field_n[6] = ((dl) this).field_o;
        mo.field_n[8] = ((dl) this).field_m;
        mo.field_n[14] = ((dl) this).field_g;
        mo.field_n[13] = ((dl) this).field_i;
        mo.field_n[1] = ((dl) this).field_j;
        mo.field_n[12] = ((dl) this).field_c;
        mo.field_n[4] = ((dl) this).field_b;
        mo.field_n[10] = ((dl) this).field_d;
        mo.field_n[2] = ((dl) this).field_l;
        mo.field_n[9] = ((dl) this).field_k;
        mo.field_n[5] = ((dl) this).field_e;
        return mo.field_n;
    }

    dl() {
        this.c(3489);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
