/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends lm {
    static String field_L;
    private int field_O;
    boolean field_R;
    static ph field_E;
    static String[] field_K;
    private cn field_D;
    private int field_H;
    int field_S;
    private int field_B;
    private cn field_P;
    static String field_Q;
    static String field_C;
    static nh field_I;
    private int field_J;
    private int field_F;
    private cn[] field_M;
    private int field_G;
    private cn field_T;

    private final cn b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = DungeonAssault.field_K;
        int var2 = this.field_s >> 857005409;
        cn var3 = new cn(var2, this.field_s);
        lm.a(var3, (byte) 66);
        for (var4 = 0; var4 < this.field_s; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((this.field_s + -var4) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
                }
                gf.a(var5, var4, var8 << 560628456 | var8 | var8 << 1718940400);
            }
        }
        ti.c(param0);
        return var3;
    }

    private final cn b(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 0;
        int var13 = DungeonAssault.field_K;
        cn var14 = new cn(2 * this.field_B, this.field_s);
        lm.a(var14, (byte) -94);
        int var5 = this.field_s >> 430698689;
        for (var6 = 0; var6 < this.field_s; var6++) {
            var7 = (var6 >> -413031327) * (this.field_B * 2 + -1) % (this.field_B * 2);
            var8 = 16711935 & param2;
            var9 = param2 & 65280;
            var10 = var6 + -var5;
            var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
            var12 = 256 > var11 ? (var11 * var9 & 16711680 | var11 * var8 & -16711936) >>> -370091864 : var9 | var8;
            gf.b(var7, var6, this.field_B, var12);
            gf.b(var7 + -(this.field_B * 2), var6, this.field_B, var12);
            var9 = param0 & 65280;
            var8 = 16711935 & param0;
            var12 = (var11 ^ -1) <= -257 ? var9 | var8 : (var11 * var9 & 16711680 | var8 * var11 & -16711936) >>> -854857176;
            gf.b(this.field_B + var7, var6, this.field_B, var12);
            gf.b(var7 - this.field_B, var6, this.field_B, var12);
        }
        ti.c(true);
        var6 = 87 / ((15 - param1) / 57);
        return var14;
    }

    private final void a(int param0, int param1, int param2, cn param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = param2 + this.field_x;
            d.a(this.field_D.field_y + param2, this.field_s + param1, var5_int - this.field_D.field_y, param1, false);
            var6 = param2 - this.field_O;
            var7 = -26 / ((-35 - param0) / 41);
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  ti.c(true);
                  if (gf.field_j > param2 - -this.field_D.field_y) {
                    break L2;
                  } else {
                    lm.a(this.field_P, (byte) -107);
                    param3.h(-this.field_O, 0);
                    param3.h(-this.field_O + 2 * this.field_B, 0);
                    this.field_T.d(0, 0);
                    ti.c(true);
                    this.field_P.h(param2, param1);
                    break L2;
                  }
                }
                L3: {
                  if (gf.field_h >= var5_int + -this.field_D.field_y) {
                    lm.a(this.field_P, (byte) -94);
                    var7 = this.field_x + (-this.field_D.field_y + this.field_O);
                    L4: while (true) {
                      if (var7 <= this.field_B * 2) {
                        param3.h(-var7, 0);
                        param3.h(2 * this.field_B + -var7, 0);
                        this.field_D.d(0, 0);
                        ti.c(true);
                        this.field_P.h(var5_int - this.field_D.field_y, param1);
                        break L3;
                      } else {
                        var7 = var7 - this.field_B * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param3.h(var6, param1);
                var6 = var6 + param3.field_y;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("uc.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static boolean g(int param0) {
        int var1 = -39 % ((56 - param0) / 38);
        return so.field_b != null ? true : false;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0 ^ param0, param1, param2, param3, param4);
        this.a(param0 ^ -370091864);
    }

    final static void a(int param0, int param1, int param2, cn param3, int param4, int param5, int param6, boolean param7) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        cn var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (gf.field_j > param4) {
                param2 = param2 - (-param4 + gf.field_j);
                param4 = gf.field_j;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (gf.field_f > param6) {
                param5 = param5 - (-param6 + gf.field_f);
                param6 = gf.field_f;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 + param4 > gf.field_h) {
                param2 = gf.field_h - param4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param6 - -param5 > gf.field_e) {
                param5 = -param6 + gf.field_e;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 >= param2) {
                break L5;
              } else {
                if (param5 <= 0) {
                  break L5;
                } else {
                  var21 = param3.d();
                  var30 = gf.field_b;
                  var10 = gf.field_i;
                  var11 = gf.field_c;
                  var29 = new int[4];
                  gf.a(var29);
                  param3.e();
                  gf.a(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param3.field_y * param6 + param4;
                  var14 = -param2 + param3.field_y;
                  var25 = var21.field_B;
                  var22 = var25;
                  var15 = var22;
                  if (!param7) {
                    var16 = param6;
                    L6: while (true) {
                      if (param5 - -param6 <= var16) {
                        var21.h(-param3.field_w, -param3.field_A);
                        gf.a(var30, var10, var11);
                        gf.b(var29);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var17 = param4;
                        L7: while (true) {
                          if (var17 >= param4 + param2) {
                            var13 = var13 + var14;
                            var16++;
                            continue L6;
                          } else {
                            L8: {
                              var18 = var25[var13];
                              if (-1 != (var18 ^ -1)) {
                                L9: {
                                  L10: {
                                    if (-1 <= (var17 ^ -1)) {
                                      break L10;
                                    } else {
                                      if (var15[var13 - 1] == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (0 >= var16) {
                                      break L11;
                                    } else {
                                      if (var15[-param3.field_y + var13] == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (-1 + param3.field_y <= var17) {
                                      break L12;
                                    } else {
                                      if (var15[var13 - -1] == 0) {
                                        break L9;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var16 < param3.field_v + -1) {
                                    if (-1 == (var15[param3.field_y + var13] ^ -1)) {
                                      break L9;
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    var13++;
                                    var17++;
                                    continue L7;
                                  }
                                }
                                gf.f(var17, var16, param1, param0);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var13++;
                            var17++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var8);

            stackIn_45_1 = new StringBuilder().append("uc.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L13;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L13;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void c(boolean param0) {
        field_Q = null;
        field_E = null;
        field_K = null;
        field_C = null;
        field_I = null;
        if (param0) {
            uc.c(true);
        }
        field_L = null;
    }

    final void a(int param0, int param1, lm param2, boolean param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                uc.g(-103);
                break L1;
              }
            }
            L2: {
              if (!this.field_R) {
                break L2;
              } else {
                this.field_O = this.field_O + 1;
                if (2 * this.field_B < this.field_O) {
                  this.field_O = this.field_O - 2 * this.field_B;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("uc.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
            return;
        }
        int var5 = this.field_q + param1;
        int var6 = param3 - -this.field_v;
        this.a(param2 ^ -97, var6, var5, this.field_M[param2]);
        if (!(-65537 >= (this.field_S ^ -1))) {
            d.a(var5 - -(this.field_x * this.field_S >> -920444752), var6 + this.field_s, this.field_x + var5, var6, false);
            this.a(-99, var6, var5, this.field_M[1]);
            ti.c(true);
        }
    }

    uc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 88572673 & 8355711, 8355711 & param6 >> -834222655);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        if (param0 == -854857176) {
          L0: {
            L1: {
              L2: {
                if (param1 < 65) {
                  break L2;
                } else {
                  if (90 >= param1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 97) {
                  break L3;
                } else {
                  if (param1 > 122) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L0;
            }
            stackIn_10_0 = 1;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    final void b(int param0, byte param1, int param2) {
        this.field_G = param0;
        this.field_J = param2 >> -289702815 & 8355711;
        this.field_F = param2;
        this.field_H = 8355711 & param0 >> -1074205471;
        if (param1 != 94) {
            this.field_P = (cn) null;
        }
        this.a(-370091864);
    }

    private uc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_G = param6;
        this.field_H = param8;
        this.field_B = param4;
        this.field_F = param5;
        this.field_J = param7;
        this.b(0, param2, param1, param0, param3);
    }

    private final void a(int param0) {
        if (param0 != -370091864) {
            field_Q = (String) null;
        }
        this.field_M = new cn[]{this.b(this.field_G, -123, this.field_F), this.b(this.field_H, -88, this.field_J)};
        this.field_D = this.b(true);
        this.field_T = this.field_D.b();
        this.field_P = new cn(this.field_s >> 737668833, this.field_s);
    }

    static {
        field_L = "Waiting for animations";
        field_Q = "Aged by goblin standards, the goblin scout didn't get that way through reckless bravery, but though cowardly, he can generally find a way out of any situation.";
        field_C = "My Dungeon";
    }
}
