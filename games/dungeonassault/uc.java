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
        int var2 = ((uc) this).field_s >> 857005409;
        cn var3 = new cn(var2, ((uc) this).field_s);
        lm.a(var3, (byte) 66);
        for (var4 = 0; var4 < ((uc) this).field_s; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((uc) this).field_s + -var4) * var4);
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cn var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = DungeonAssault.field_K;
        var14 = new cn(2 * ((uc) this).field_B, ((uc) this).field_s);
        lm.a(var14, (byte) -94);
        var5 = ((uc) this).field_s >> 430698689;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((uc) this).field_s) {
            ti.c(true);
            var6 = 87 / ((15 - param1) / 57);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> -413031327) * (((uc) this).field_B * 2 + -1) % (((uc) this).field_B * 2);
              var8 = 16711935 & param2;
              var9 = param2 & 65280;
              var10 = var6 + -var5;
              var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
              if (256 <= var11) {
                stackOut_4_0 = var9 | var8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (var11 * var9 & 16711680 | var11 * var8 & -16711936) >>> -370091864;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              gf.b(var7, var6, ((uc) this).field_B, var12);
              gf.b(var7 + -(((uc) this).field_B * 2), var6, ((uc) this).field_B, var12);
              var9 = param0 & 65280;
              var8 = 16711935 & param0;
              if ((var11 ^ -1) > -257) {
                stackOut_7_0 = (var11 * var9 & 16711680 | var8 * var11 & -16711936) >>> -854857176;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            gf.b(((uc) this).field_B + var7, var6, ((uc) this).field_B, var12);
            gf.b(var7 - ((uc) this).field_B, var6, ((uc) this).field_B, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, cn param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        var5 = param2 + ((uc) this).field_x;
        d.a(((uc) this).field_D.field_y + param2, ((uc) this).field_s + param1, var5 - ((uc) this).field_D.field_y, param1, false);
        var6 = param2 - ((uc) this).field_O;
        var7 = -26 / ((-35 - param0) / 41);
        L0: while (true) {
          if (var5 <= var6) {
            L1: {
              ti.c(true);
              if (gf.field_j > param2 - -((uc) this).field_D.field_y) {
                break L1;
              } else {
                lm.a(((uc) this).field_P, (byte) -107);
                param3.h(-((uc) this).field_O, 0);
                param3.h(-((uc) this).field_O + 2 * ((uc) this).field_B, 0);
                ((uc) this).field_T.d(0, 0);
                ti.c(true);
                ((uc) this).field_P.h(param2, param1);
                break L1;
              }
            }
            L2: {
              if (gf.field_h >= var5 + -((uc) this).field_D.field_y) {
                lm.a(((uc) this).field_P, (byte) -94);
                var7 = ((uc) this).field_x + (-((uc) this).field_D.field_y + ((uc) this).field_O);
                L3: while (true) {
                  if (var7 <= ((uc) this).field_B * 2) {
                    param3.h(-var7, 0);
                    param3.h(2 * ((uc) this).field_B + -var7, 0);
                    ((uc) this).field_D.d(0, 0);
                    ti.c(true);
                    ((uc) this).field_P.h(var5 - ((uc) this).field_D.field_y, param1);
                    break L2;
                  } else {
                    var7 = var7 - ((uc) this).field_B * 2;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          } else {
            param3.h(var6, param1);
            var6 = var6 + param3.field_y;
            continue L0;
          }
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
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = DungeonAssault.field_K;
          if (gf.field_j > param4) {
            param2 = param2 - (-param4 + gf.field_j);
            param4 = gf.field_j;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (gf.field_f > param6) {
            param5 = param5 - (-param6 + gf.field_f);
            param6 = gf.field_f;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param2 + param4 > gf.field_h) {
            param2 = gf.field_h - param4;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param6 - -param5 > gf.field_e) {
            param5 = -param6 + gf.field_e;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 >= param2) {
            break L4;
          } else {
            if (param5 <= 0) {
              break L4;
            } else {
              var21 = param3.d();
              var32 = gf.field_b;
              var10 = gf.field_i;
              var11 = gf.field_c;
              var30 = new int[4];
              gf.a(var30);
              param3.e();
              gf.a(var30[0], var30[1], var30[2], var30[3]);
              var13 = param3.field_y * param6 + param4;
              var14 = -param2 + param3.field_y;
              var31 = var21.field_B;
              var28 = var31;
              var25 = var28;
              var22 = var25;
              var15 = var22;
              if (!param7) {
                var16 = param6;
                L5: while (true) {
                  if (param5 - -param6 <= var16) {
                    var21.h(-param3.field_w, -param3.field_A);
                    gf.a(var32, var10, var11);
                    gf.b(var30);
                    return;
                  } else {
                    var17 = param4;
                    L6: while (true) {
                      if (var17 >= param4 + param2) {
                        var13 = var13 + var14;
                        var16++;
                        continue L5;
                      } else {
                        var18 = var31[var13];
                        if (-1 != var18) {
                          L7: {
                            L8: {
                              if (-1 >= var17) {
                                break L8;
                              } else {
                                if (var15[var13 - 1] == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (0 >= var16) {
                                break L9;
                              } else {
                                if (var15[-param3.field_y + var13] == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (-1 + param3.field_y <= var17) {
                                break L10;
                              } else {
                                if (var15[var13 - -1] == 0) {
                                  break L7;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (var16 < param3.field_v + -1) {
                              if (-1 == (var15[param3.field_y + var13] ^ -1)) {
                                break L7;
                              } else {
                                var13++;
                                var17++;
                                continue L6;
                              }
                            } else {
                              var13++;
                              var17++;
                              continue L6;
                            }
                          }
                          gf.f(var17, var16, param1, param0);
                          var13++;
                          var17++;
                          continue L6;
                        } else {
                          var13++;
                          var17++;
                          continue L6;
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
        if (!param3) {
            boolean discarded$0 = uc.g(-103);
        }
        if (((uc) this).field_R) {
            ((uc) this).field_O = ((uc) this).field_O + 1;
            if (!(2 * ((uc) this).field_B >= ((uc) this).field_O)) {
                ((uc) this).field_O = ((uc) this).field_O - 2 * ((uc) this).field_B;
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
            return;
        }
        int var5 = ((uc) this).field_q + param1;
        int var6 = param3 - -((uc) this).field_v;
        this.a(param2 ^ -97, var6, var5, ((uc) this).field_M[param2]);
        if (!(-65537 >= (((uc) this).field_S ^ -1))) {
            d.a(var5 - -(((uc) this).field_x * ((uc) this).field_S >> -920444752), var6 + ((uc) this).field_s, ((uc) this).field_x + var5, var6, false);
            this.a(-99, var6, var5, ((uc) this).field_M[1]);
            ti.c(true);
        }
    }

    uc(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 88572673 & 8355711, 8355711 & param6 >> -834222655);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    final void b(int param0, byte param1, int param2) {
        ((uc) this).field_G = param0;
        ((uc) this).field_J = param2 >> -289702815 & 8355711;
        ((uc) this).field_F = param2;
        ((uc) this).field_H = 8355711 & param0 >> -1074205471;
        if (param1 != 94) {
            ((uc) this).field_P = null;
        }
        this.a(-370091864);
    }

    private uc(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((uc) this).field_G = param6;
        ((uc) this).field_H = param8;
        ((uc) this).field_B = param4;
        ((uc) this).field_F = param5;
        ((uc) this).field_J = param7;
        ((uc) this).b(0, param2, param1, param0, param3);
    }

    private final void a(int param0) {
        if (param0 != -370091864) {
            field_Q = null;
        }
        ((uc) this).field_M = new cn[]{this.b(((uc) this).field_G, -123, ((uc) this).field_F), this.b(((uc) this).field_H, -88, ((uc) this).field_J)};
        ((uc) this).field_D = this.b(true);
        ((uc) this).field_T = ((uc) this).field_D.b();
        ((uc) this).field_P = new cn(((uc) this).field_s >> 737668833, ((uc) this).field_s);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Waiting for animations";
        field_Q = "Aged by goblin standards, the goblin scout didn't get that way through reckless bravery, but though cowardly, he can generally find a way out of any situation.";
        field_C = "My Dungeon";
    }
}
