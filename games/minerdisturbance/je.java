/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    private static int[] field_K;
    static double field_l;
    static rb field_O;
    static ea[][] field_j;
    static ea[] field_w;
    private static int field_F;
    static ea[] field_y;
    private static int field_f;
    private static int field_o;
    boolean field_E;
    static ea[] field_L;
    int field_r;
    static ea[][] field_z;
    private static int field_m;
    boolean field_e;
    private int field_Q;
    static ea[] field_c;
    boolean field_S;
    static int field_t;
    private int field_s;
    boolean field_v;
    boolean field_A;
    private static int field_M;
    static boolean field_J;
    int field_U;
    static ea[][] field_p;
    static ea[][] field_x;
    static ea[] field_n;
    private static int field_W;
    static ea[] field_C;
    static ea[][] field_P;
    static ea[] field_g;
    boolean field_b;
    static int field_H;
    static ea[][] field_d;
    static int[] field_N;
    static int field_u;
    boolean field_a;
    private static int field_D;
    static ea[] field_B;
    int field_q;
    static je[][] field_I;
    static ea[] field_k;
    static ea[][] field_R;
    int field_i;
    private static int field_T;
    private static int[][] field_h;
    static ea[] field_G;
    boolean field_V;
    private static String field_X;

    final static boolean c(int param0, int param1, int param2, int param3) {
        return field_O.e((param0 << 2) + param2, (param1 << 2) + param3, 2);
    }

    private final static void f() {
        field_H = 24 * field_N[cm.field_o];
        field_T = -1;
        field_F = (int)(Math.random() * 10000.0) + 100000 ^ 238298623;
    }

    final static boolean i(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var2 = param0 >> 2;
        var3 = param1 >> 2;
        if (var2 < 0) {
          return true;
        }
        if (var3 < 0) {
          return true;
        }
        if (var2 >= 32) {
          return true;
        }
        if (var3 >= field_t) {
          return true;
        }
        var4 = var2 - 16;
        if (var4 < 0) {
          var4 = -var4;
        }
        if (var3 <= var4 / 2 + 1) {
          return true;
        }
        if (!field_I[var2][var3].field_a) {
          return false;
        }
        var5 = param0 & 3;
        var6 = param1 & 3;
        if (var5 == 0 &&
          var2 > 0 &&
          !field_I[var2 - 1][var3].field_a) {
          return false;
        }
        if (var5 == 3 &&
          var2 < 31 &&
          !field_I[var2 + 1][var3].field_a) {
          return false;
        }
        if (var6 == 0 &&
          var3 > 0 &&
          !field_I[var2][var3 - 1].field_a) {
          return false;
        }
        if (var6 == 3 &&
          var3 < field_t - 1 &&
          !field_I[var2][var3 + 1].field_a) {
          return false;
        }
        return true;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        return field_O.a((param0 << 2) + param2, (param1 << 2) + param3, (byte) 61);
    }

    final static void g(int param0, int param1) {
        int var9 = 0;
        int var10 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        je var6;
        int var7;
        int var8;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var2Lifetime1;
        int var3Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        if (field_T >= 0) {
          var2 = field_o * 32 - li.field_c;
          var3 = field_f * 32 - db.field_d;
          je.e().f(var2, var3);
        }
        if (cm.field_o == 0) {
          return;
        }
        var2Lifetime1 = li.field_c / 32;
        var3Lifetime1 = (640 + li.field_c) / 32;
        var4 = db.field_d / 32 - 1;
        var5 = (640 + db.field_d) / 32;
        if (var2Lifetime1 < 1) {
          var2Lifetime1 = 1;
        }
        if (var3Lifetime1 > 30) {
          var3Lifetime1 = 30;
        }
        if (var4 < 1) {
          var4 = 1;
        }
        if (var5 > field_t - 2) {
          var5 = field_t - 2;
        }
        for (var9 = var4 - 1; var9 <= var5 + 1; var9++) {
          for (var10 = var2Lifetime1 - 1; var10 <= var3Lifetime1 + 1; var10++) {
            var7 = var10 * 32 - li.field_c;
            var8 = var9 * 32 - db.field_d;
            if (var7 > -64 &&
              var8 > -64 &&
              var7 < 704 &&
              var8 < 544) {
              var6 = field_I[var10][var9];
              if (!var6.field_a &&
                var6.field_V) {
                if (var10 != 0) {
                  if (!field_I[var10 - 1][var9].field_a) {
                    stackIn_42_0 = (!field_I[var10 - 1][var9].field_V) ? 1 : 0;
                  } else {
                    stackIn_42_0 = 1;
                  }
                } else {
                  stackIn_42_0 = 1;
                }
                var11 = stackIn_42_0;
                if (var10 != 31) {
                  if (!field_I[var10 + 1][var9].field_a) {
                    stackIn_50_0 = (!field_I[var10 + 1][var9].field_V) ? 1 : 0;
                  } else {
                    stackIn_50_0 = 1;
                  }
                } else {
                  stackIn_50_0 = 1;
                }
                var12 = stackIn_50_0;
                if (var9 != 0) {
                  if (!field_I[var10][var9 - 1].field_a) {
                    stackIn_58_0 = (!field_I[var10][var9 - 1].field_V) ? 1 : 0;
                  } else {
                    stackIn_58_0 = 1;
                  }
                } else {
                  stackIn_58_0 = 1;
                }
                var13 = stackIn_58_0;
                if (var9 != field_t - 1) {
                  if (!field_I[var10][var9 + 1].field_a) {
                    stackIn_66_0 = (!field_I[var10][var9 + 1].field_V) ? 1 : 0;
                  } else {
                    stackIn_66_0 = 1;
                  }
                } else {
                  stackIn_66_0 = 1;
                }
                var14 = stackIn_66_0;
                var15 = -1;
                if (var11 == 0 &&
                  var13 == 0) {
                  if (field_I[var10 - 1][var9 - 1].field_a ||
                    !field_I[var10 - 1][var9 - 1].field_V) {
                    var15 = 3;
                  }
                } else {
                  stackIn_74_0 = 3;
                  if (var11 == 0) {
                    stackIn_75_1 = 0;
                  } else {
                    stackIn_75_1 = 1;
                  }
                  stackIn_77_0 = stackIn_74_0 - stackIn_75_1;
                  if (var13 == 0) {
                    stackIn_78_1 = 0;
                  } else {
                    stackIn_78_1 = 2;
                  }
                  var15 = stackIn_77_0 - stackIn_78_1;
                }
                if (var15 >= 0) {
                  pj.field_e[var15].f(var7, var8);
                }
                var15Lifetime1 = -1;
                if (var12 == 0 &&
                  var13 == 0) {
                  if (field_I[var10 + 1][var9 - 1].field_a ||
                    !field_I[var10 + 1][var9 - 1].field_V) {
                    var15Lifetime1 = 7;
                  }
                } else {
                  stackIn_89_0 = 7;
                  if (var12 == 0) {
                    stackIn_90_1 = 0;
                  } else {
                    stackIn_90_1 = 1;
                  }
                  stackIn_92_0 = stackIn_89_0 - stackIn_90_1;
                  if (var13 == 0) {
                    stackIn_93_1 = 0;
                  } else {
                    stackIn_93_1 = 2;
                  }
                  var15Lifetime1 = stackIn_92_0 - stackIn_93_1;
                }
                if (var15Lifetime1 >= 0) {
                  pj.field_e[var15Lifetime1].f(var7 + 16, var8);
                }
                var15Lifetime2 = -1;
                if (var12 == 0 &&
                  var14 == 0) {
                  if (field_I[var10 + 1][var9 + 1].field_a ||
                    !field_I[var10 + 1][var9 + 1].field_V) {
                    var15Lifetime2 = 11;
                  }
                } else {
                  stackIn_104_0 = 11;
                  if (var12 == 0) {
                    stackIn_105_1 = 0;
                  } else {
                    stackIn_105_1 = 1;
                  }
                  stackIn_107_0 = stackIn_104_0 - stackIn_105_1;
                  if (var14 == 0) {
                    stackIn_108_1 = 0;
                  } else {
                    stackIn_108_1 = 2;
                  }
                  var15Lifetime2 = stackIn_107_0 - stackIn_108_1;
                }
                if (var15Lifetime2 >= 0) {
                  pj.field_e[var15Lifetime2].f(var7 + 16, var8 + 16);
                }
                var15Lifetime3 = -1;
                if (var11 == 0 &&
                  var14 == 0) {
                  if (field_I[var10 - 1][var9 + 1].field_a ||
                    !field_I[var10 - 1][var9 + 1].field_V) {
                    var15Lifetime3 = 15;
                  }
                } else {
                  stackIn_119_0 = 15;
                  if (var11 == 0) {
                    stackIn_120_1 = 0;
                  } else {
                    stackIn_120_1 = 1;
                  }
                  stackIn_122_0 = stackIn_119_0 - stackIn_120_1;
                  if (var14 == 0) {
                    stackIn_123_1 = 0;
                  } else {
                    stackIn_123_1 = 2;
                  }
                  var15Lifetime3 = stackIn_122_0 - stackIn_123_1;
                }
                if (var15Lifetime3 >= 0) {
                  pj.field_e[var15Lifetime3].f(var7, var8 + 16);
                }
                if (var11 != 0) {
                  eh.e(var7 - 8, var8, 8, 32, 1642509);
                }
                if (var12 != 0) {
                  eh.e(var7 + 32, var8, 8, 32, 1642509);
                }
                if (var13 != 0) {
                  eh.e(var7, var8 - 11, 32, 11, 1642509);
                }
                if (var14 != 0) {
                  eh.e(var7, var8 + 32, 32, 8, 1642509);
                }
              }
            }
          }
        }
        return;
    }

    private final static void a(int param0, int param1, je param2, je param3) {
        if (param2.field_V &&
          !param2.field_a) {
          field_I[param0 - 1][param1].field_V = true;
          field_I[param0 + 1][param1].field_V = true;
          param3.field_V = true;
          field_I[param0][param1 + 1].field_V = true;
          field_I[param0 - 1][param1 - 1].field_V = true;
          field_I[param0 + 1][param1 - 1].field_V = true;
          field_I[param0 - 1][param1 + 1].field_V = true;
          field_I[param0 + 1][param1 + 1].field_V = true;
          field_I[param0 - 1][param1 - 1].field_V = true;
          field_I[param0 - 1][param1 + 1].field_V = true;
          field_I[param0 + 1][param1 - 1].field_V = true;
          field_I[param0 + 1][param1 + 1].field_V = true;
        }
    }

    private final static void a(int param0) {
        int var1 = (int)(Math.random() * 27.0) + 2;
        int var2 = (int)(Math.random() * 19.0) + param0 + 2;
        field_I[var1][var2].field_a = false;
        field_I[var1][var2].field_b = false;
        uf.field_p[jf.b((byte) 95)] = new gf(var1, var2, 10);
    }

    private final static void a(int param0, int param1, je param2) {
        int incrementValue$0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        if (ba.field_M) {
          var3 = param2.field_i - 4;
          if (param2.field_a ||
            !param2.field_V) {
            var3 = var3 - 64;
          }
          if (je.c(param0, param1, 1, 1) &&
            param2.field_V) {
            var3 = var3 - 32;
          }
          for (var4 = param1 - 1; var4 <= param1 + 1; var4++) {
            for (var5 = param0 - 1; var5 <= param0 + 1; var5++) {
              incrementValue$0 = var3;
              var3++;
              field_I[var5][var4].field_i = incrementValue$0;
            }
          }
        } else {
          var3 = param2.field_i - 16;
          if (param2.field_a ||
            !param2.field_V) {
            var3 = var3 - 64;
          }
          if (je.c(param0, param1, 1, 1) &&
            param2.field_V) {
            var3 = var3 - 32;
          }
          for (var4 = param1 - 1; var4 <= param1 + 1; var4++) {
            if (var4 >= 6) {
              var6 = param0 - 1;
              var5 = var6;
              while (var6 <= param0 + 1) {
                if (field_I[var6][var4].field_i < var3) {
                  field_I[var6][var4].field_i = var3;
                }
                var6++;
              }
            }
          }
        }
    }

    private final static ea e() {
        if (field_T == 0) {
          return il.field_s;
        }
        if (field_T == 1) {
          return pl.field_k;
        }
        if (field_T == 2) {
          return bc.field_b;
        }
        if (field_T == 3) {
          return aa.field_i;
        }
        if (field_T != 4) {
          return null;
        }
        return gh.field_a;
    }

    final static void b(int param0, int param1) {
        int var16 = 0;
        int var32 = 0;
        je dupTemp$0 = null;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int var2;
        ea var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        Object var12;
        Object var13;
        Object var14;
        je var15;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        ea[] var38;
        ea[] var39;
        ea[] var40;
        ea[] var41;
        int var8Lifetime1;
        int var9Lifetime1;
        int var18Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var34Lifetime1;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var23Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        int var29Lifetime1Lifetime1;
        int var30Lifetime1Lifetime1;
        int var35Lifetime1Lifetime1;
        je.b(param0, param1, false);
        stackIn_3_0 = (cm.field_o != 1) ? 0 : 1;
        var2 = stackIn_3_0;
        var3 = je.a(param0, param1, var2 != 0);
        var4 = li.field_c / 32;
        var5 = (640 + li.field_c) / 32;
        var6 = db.field_d / 32 - 1;
        var7 = (640 + db.field_d) / 32;
        if (var4 < 1) {
          var4 = 1;
        }
        if (var5 > 30) {
          var5 = 30;
        }
        if (var6 < 1) {
          var6 = 1;
        }
        if (var7 > field_t - 2) {
          var7 = field_t - 2;
        }
        var8 = 512 - li.field_c;
        var9 = -db.field_d;
        hj.field_h.f(var8, var9);
        field_O.a(var5, var6, var4, var7, 17761, field_I);
        var10 = cm.field_o;
        var11 = null;
        var12 = null;
        var13 = null;
        var14 = null;
        var38 = field_d[var10];
        var39 = field_P[var10];
        var40 = field_R[var10];
        var41 = field_p[var10];
        for (var16 = var6 - 1; var16 <= var7 + 1; var16++) {
          var17 = var16 / 24 % field_h.length;
          var18 = field_h[cm.field_o][var17];
          if (var17 >= field_h.length - 1) {
            stackIn_16_0 = 0;
          } else {
            var17++;
            stackIn_16_0 = var17;
          }
          var19 = stackIn_16_0;
          var20 = field_h[cm.field_o][var19];
          var21 = var18 >> 16 & 255;
          var22 = var18 >> 8 & 255;
          var23 = var18 & 255;
          var24 = var20 >> 16 & 255;
          var25 = var20 >> 8 & 255;
          var26 = var20 & 255;
          var27 = var24 - var21;
          var28 = var25 - var22;
          var29 = var26 - var23;
          var30 = 256 * (var16 % 24) / 24;
          var27 = var27 * var30 >> 8;
          var28 = var28 * var30 >> 8;
          var29 = var29 * var30 >> 8;
          var18Lifetime1 = (var21 + var27 & 255) << 16 | (var22 + var28 & 255) << 8 | var23 + var29 & 255;
          if (!vi.field_h) {
            stackIn_22_0 = (!wm.field_e) ? 1 : 0;
          } else {
            stackIn_22_0 = 0;
          }
          var31 = stackIn_22_0;
          for (var32 = var4 - 1; var32 <= var5 + 1; var32++) {
            var15 = field_I[var32][var16];
            var8Lifetime1 = var32 * 32 - li.field_c;
            var9Lifetime1 = var16 * 32 - db.field_d;
            if (var8Lifetime1 > -64 &&
              var9Lifetime1 > -64 &&
              var8Lifetime1 < 704 &&
              var9Lifetime1 < 544) {
              var33 = var32 - 16;
              if (var33 < 0) {
                var33 = -var33;
              }
              boolean decompiledFrameRemainder0 = true;
              if (var31 != 0 && (var15.field_a ||
                !var15.field_V)) {
                var34 = 0;
                if (var16 > 0) {
                  if (!field_I[var32][var16 - 1].field_a) {
                    if (field_I[var32][var16 - 1].field_V) {
                      var34++;
                      if (var32 < 31 &&
                        !field_I[var32 + 1][var16].field_a &&
                        field_I[var32 + 1][var16].field_V) {
                        var34 += 2;
                      }
                    } else {
                      if (var32 < 31 &&
                        !field_I[var32 + 1][var16].field_a &&
                        field_I[var32 + 1][var16].field_V) {
                        var34 += 2;
                      }
                    }
                  } else {
                    if (var32 < 31 &&
                      !field_I[var32 + 1][var16].field_a &&
                      field_I[var32 + 1][var16].field_V) {
                      var34 += 2;
                    }
                  }
                } else {
                  if (var32 < 31 &&
                    !field_I[var32 + 1][var16].field_a &&
                    field_I[var32 + 1][var16].field_V) {
                    var34 += 2;
                  }
                }
                if (var32 > 0) {
                  if (!field_I[var32 - 1][var16].field_a) {
                    if (field_I[var32 - 1][var16].field_V) {
                      var34 += 4;
                      if (var16 < field_t - 1 &&
                        !field_I[var32][var16 + 1].field_a &&
                        field_I[var32][var16 + 1].field_V) {
                        var34 += 8;
                      }
                    } else {
                      if (var16 < field_t - 1 &&
                        !field_I[var32][var16 + 1].field_a &&
                        field_I[var32][var16 + 1].field_V) {
                        var34 += 8;
                      }
                    }
                  } else {
                    if (var16 < field_t - 1 &&
                      !field_I[var32][var16 + 1].field_a &&
                      field_I[var32][var16 + 1].field_V) {
                      var34 += 8;
                    }
                  }
                } else {
                  if (var16 < field_t - 1 &&
                    !field_I[var32][var16 + 1].field_a &&
                    field_I[var32][var16 + 1].field_V) {
                    var34 += 8;
                  }
                }
                var35 = var18Lifetime1;
                if (var15.field_q > 0) {
                  if (var15.field_q >= 256) {
                    if (var15.field_q < 512) {
                      var22Lifetime1 = 0;
                      var25Lifetime1 = 255;
                      var28Lifetime1 = var25Lifetime1 - var22Lifetime1;
                      var30Lifetime1 = 256 * (var15.field_q - 256) >> 8;
                      var28Lifetime1 = var28Lifetime1 * var30Lifetime1 >> 8;
                      var35 = 16711680 | (var22Lifetime1 + var28Lifetime1 & 255) << 8 | 0;
                    }
                  } else {
                    var21Lifetime1 = var18Lifetime1 >> 16 & 255;
                    var22Lifetime1 = var18Lifetime1 >> 8 & 255;
                    var23Lifetime1 = var18Lifetime1 & 255;
                    var24Lifetime1 = 255;
                    var25Lifetime1 = 0;
                    var26Lifetime1 = 0;
                    var27Lifetime1 = var24Lifetime1 - var21Lifetime1;
                    var28Lifetime1 = var22Lifetime1;
                    var29Lifetime1 = var23Lifetime1;
                    var30Lifetime1 = 256 * var15.field_q >> 8;
                    if (var30Lifetime1 > 256) {
                      var30Lifetime1 = 256;
                    }
                    var27Lifetime1 = var27Lifetime1 * var30Lifetime1 >> 8;
                    var28Lifetime1 = var28Lifetime1 * var30Lifetime1 >> 8;
                    var29Lifetime1 = var29Lifetime1 * var30Lifetime1 >> 8;
                    var35 = (var21Lifetime1 + var27Lifetime1 & 255) << 16 | (var22Lifetime1 - var28Lifetime1 & 255) << 8 | var23Lifetime1 - var29Lifetime1 & 255;
                  }
                  if (var15.field_q >= 512 &&
                    var15.field_q < 768) {
                    var23Lifetime1Lifetime1 = 0;
                    var26Lifetime1Lifetime1 = var15.field_q - 512 & 255;
                    var29Lifetime1Lifetime1 = var26Lifetime1Lifetime1 - var23Lifetime1Lifetime1;
                    var30Lifetime1Lifetime1 = 256 * (var15.field_q - 512) >> 8;
                    var29Lifetime1Lifetime1 = var29Lifetime1Lifetime1 * var30Lifetime1Lifetime1 >> 8;
                    var35 = 16776960 | var23Lifetime1Lifetime1 + var29Lifetime1Lifetime1 & 255;
                  }
                  if (var15.field_q >= 768) {
                    var35 = 16777215;
                  }
                }
                if (var16 <= (var33 + 1) / 2) {
                  field_I[var32][var16].field_i = 256;
                  dupTemp$0 = field_I[var32][var16];
                  dupTemp$0.field_q = dupTemp$0.field_q / 2;
                }
                if (var16 > (var33 + 1) / 2 - 1) {
                  if (!var15.field_E &&
                    var2 != 0 &&
                    var15.field_q < 0) {
                    var36 = 255 * var15.field_q / -200;
                    if (var36 > 255) {
                      var36 = 255;
                    }
                    var37 = var35 & 255;
                    if (var37 < var36) {
                      var35 = var35 & 16776960;
                      var35 = var35 | var36;
                    }
                  }
                  if (var15.field_V && (var15.field_E ||
                    var15.field_v)) {
                    if (!var15.field_E) {
                      if (!var15.field_S) {
                        field_L[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      } else {
                        if (var15.field_r < 500) {
                          field_c[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                        } else {
                          if (var15.field_r < 750) {
                            field_C[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                          } else {
                            field_g[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                            if ((!(var15.field_r <= 950)) &&
                              ((var15.field_r % 2 == 0)) &&
                              (!(field_I[var32][var16 + 1].field_a))) {
                              field_g[var34].a(var8Lifetime1 + param0 + 1, var9Lifetime1 + param1 + 1, var35);
                            }
                          }
                        }
                      }
                    } else {
                      if (!var15.field_S) {
                        field_k[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      } else {
                        if (var15.field_r < 500) {
                          field_y[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                        } else {
                          if (var15.field_r < 750) {
                            field_n[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                          } else {
                            field_G[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                            if ((!(var15.field_r <= 950)) &&
                              ((var15.field_r % 2 == 0)) &&
                              (!(field_I[var32][var16 + 1].field_a))) {
                              field_G[var34].a(var8Lifetime1 + param0 + 1, var9Lifetime1 + param1 + 1, var35);
                            }
                          }
                        }
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var15.field_S) {
                      if (var15.field_r >= 500) {
                        if (var15.field_r >= 750) {
                          var41[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                          if (var15.field_r > 950 &&
                            var15.field_r % 2 == 0 &&
                            !field_I[var32][var16 + 1].field_a) {
                            var41[var34].a(var8Lifetime1 + param0 + 1, var9Lifetime1 + param1 + 1, var35);
                          }
                        } else {
                          var40[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                        }
                      } else {
                        var39[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      }
                    } else {
                      var38[var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                    }
                    if (var10 == 1) {
                      if (var32 > 0 &&
                        field_I[var32 - 1][var16].field_V && (field_I[var32 - 1][var16].field_v ||
                        field_I[var32 - 1][var16].field_E)) {
                        field_z[0][var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      }
                      if (var32 < 31 &&
                        field_I[var32 + 1][var16].field_V && (field_I[var32 + 1][var16].field_v ||
                        field_I[var32 + 1][var16].field_E)) {
                        field_z[2][var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      }
                      if (field_I[var32][var16 + 1].field_V && (field_I[var32][var16 + 1].field_v ||
                        field_I[var32][var16 + 1].field_E)) {
                        field_z[3][var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      }
                      if (var16 > 1 &&
                        field_I[var32][var16 - 1].field_V && (field_I[var32][var16 - 1].field_v ||
                        field_I[var32][var16 - 1].field_E ||
                        !field_I[var32][var16 - 1].field_a)) {
                        field_z[1][var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      }
                    }
                  }
                } else {
                  var34 = 0;
                  var34 = var32 % 2 + var16 * 2;
                  if (var16 > 4) {
                    var34 = var32 % 2 + 8;
                  }
                  var36 = var32 - 16;
                  if (var36 * var36 > 1) {
                    field_j[cm.field_o][var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                  }
                  var34 = 0;
                  if (var16 == (var33 + 1) / 2 - 1) {
                    var34 = var32 % 2 + 1;
                    if (var32 <= 16) {
                      field_x[cm.field_o][var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      if (var34 == 2) {
                        field_x[cm.field_o][0].a(var8Lifetime1 + param0, var9Lifetime1 + param1 - 32, var35);
                      }
                    } else {
                      var34 += 3;
                      field_x[cm.field_o][var34].a(var8Lifetime1 + param0, var9Lifetime1 + param1, var35);
                      if (var34 == 5) {
                        field_x[cm.field_o][3].a(var8Lifetime1 + param0, var9Lifetime1 + param1 - 32, var35);
                      }
                    }
                  }
                }
              }
              if (var31 != 0 &&
                var15.field_b) {
                if (var15.field_U != -1) {
                  var34Lifetime1 = var15.field_U;
                  field_w[var34Lifetime1 + var15.field_Q * 6].f(var8Lifetime1 + param0, var9Lifetime1 + param1);
                }
                if (!var15.field_a) {
                  var34Lifetime1 = 3;
                } else {
                  var34Lifetime1 = (var32 + var16) % 3;
                }
                field_B[var34Lifetime1].f(var8Lifetime1 + param0, var9Lifetime1 + param1);
              } else {
                if (var31 != 0 &&
                  var2 != 0 &&
                  var15.field_V &&
                  !var15.field_a &&
                  var15.field_V &&
                  !var15.field_a &&
                  var15.field_A) {
                  var34Lifetime1 = 0;
                  for (var35Lifetime1 = 3; var35Lifetime1 >= 0; var35Lifetime1--) {
                    if (je.c(var32, var16, 1, var35Lifetime1)) {
                      var34Lifetime1++;
                      continue;
                    }
                    break;
                  }
                  var34Lifetime1 = var34Lifetime1 * 8;
                  eh.a(var8Lifetime1 + param0, var9Lifetime1 + param1 + 32 - var34Lifetime1, var8Lifetime1 + param0 + 32, var9Lifetime1 + param1 + 32);
                  for (var35Lifetime1Lifetime1 = 0; var35Lifetime1Lifetime1 < 3; var35Lifetime1Lifetime1++) {
                    var36Lifetime1 = var8Lifetime1 + param0 + 1 + ll.a((byte) -73, 30);
                    var37Lifetime1 = var9Lifetime1 + param1 + 1 + ll.a((byte) -73, 30);
                    if (var35Lifetime1Lifetime1 == 0) {
                      eh.e(var36Lifetime1 - 1, var37Lifetime1, 3, 16777215);
                      eh.g(var36Lifetime1, var37Lifetime1 - 1, 3, 16777215);
                    } else {
                      eh.d(var36Lifetime1 - 1, var37Lifetime1 - 1, var36Lifetime1 + 1, var37Lifetime1 + 1, 16777215);
                      eh.d(var36Lifetime1 + 1, var37Lifetime1 - 1, var36Lifetime1 - 1, var37Lifetime1 + 1, 16777215);
                    }
                  }
                  eh.a();
                }
              }
            }
          }
        }
        je.b(param0, param1, true);
        nd.field_d.a((byte) -19);
        je.c(param0, param1);
        je.a(param0, param1, var3);
    }

    private final static boolean b(int param0, int param1, int param2, int param3) {
        return field_O.d((param1 << 2) + param3, (param0 << 2) + param2, (byte) -122);
    }

    private final static void b(int param0, int param1, je param2) {
        int var4 = 0;
        if (param2.field_S &&
          param2.field_a &&
          field_I[param0][param1 + 1].field_a) {
          param2.field_r = param2.field_r - 1;
          if (param2.field_r == 999) {
            ne.a(20, -101);
            uf.field_p[jf.b((byte) 96)] = new gf(param0, param1, 8);
            lj.field_r = lj.field_r + 10;
            rg.field_sb = rg.field_sb - 10;
          }
          if (param2.field_r < 0) {
            param2.field_S = false;
          }
        }
        boolean decompiledFrameRemainder1 = true;
        if (param2.field_S) {
          if (param2.field_a) {
            if (!field_I[param0][param1 + 1].field_a) {
              boolean decompiledFrameRemainder0 = true;
              if (param2.field_r >= 1000) {
                if (field_O.a(param0, true, param1)) {
                  ne.a(19, 29);
                }
                param2.field_a = false;
                param2.field_S = false;
                field_I[param0][param1 + 1].field_a = true;
                field_I[param0][param1 + 1].field_S = true;
                field_I[param0][param1 + 1].field_q = param2.field_q;
                field_I[param0][param1 + 1].field_E = param2.field_E;
                field_I[param0][param1 + 1].field_v = param2.field_v;
                param2.field_E = false;
                param2.field_v = false;
                field_I[param0][param1 + 1].field_U = param2.field_U;
                param2.field_U = -1;
                field_I[param0][param1 + 1].field_r = 1000;
                for (var4 = 0; var4 < 1000; var4++) {
                  if (uf.field_p[var4] != null &&
                    uf.field_p[var4].field_n == param0 &&
                    uf.field_p[var4].field_p == param1 &&
                    uf.field_p[var4].field_h != 16 &&
                    uf.field_p[var4].field_h != 8) {
                    uf.field_p[var4].field_p = param1 + 1;
                  }
                }
                if (param0 != ca.field_k) {
                  if ((!(!param2.field_b)) &&
                    (!(field_I[param0][param1 + 1].field_a)) &&
                    (!(param2.field_a))) {
                    param2.field_b = false;
                    field_I[param0][param1 + 1].field_b = true;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (param1 == hf.field_t) {
                    hf.field_t = hf.field_t + 1;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if ((!(!param2.field_b)) &&
                      (!(field_I[param0][param1 + 1].field_a)) &&
                      (!(param2.field_a))) {
                      param2.field_b = false;
                      field_I[param0][param1 + 1].field_b = true;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                param2.field_r = param2.field_r + 1;
              }
              if ((decompiledFrameRemainder1) && (param2.field_b &&
                !field_I[param0][param1 + 1].field_a &&
                !param2.field_a)) {
                param2.field_b = false;
                field_I[param0][param1 + 1].field_b = true;
              }
            } else {
              if (param2.field_b &&
                !field_I[param0][param1 + 1].field_a &&
                !param2.field_a) {
                param2.field_b = false;
                field_I[param0][param1 + 1].field_b = true;
              }
            }
          } else {
            if (param2.field_b &&
              !field_I[param0][param1 + 1].field_a &&
              !param2.field_a) {
              param2.field_b = false;
              field_I[param0][param1 + 1].field_b = true;
            }
          }
        } else {
          if (param2.field_b &&
            !field_I[param0][param1 + 1].field_a &&
            !param2.field_a) {
            param2.field_b = false;
            field_I[param0][param1 + 1].field_b = true;
          }
        }

    }

    final static boolean e(int param0, int param1) {
        int var2 = param0 >> 2;
        int var3 = param1 >> 2;
        if (var2 < 0) {
          return true;
        }
        if (var3 < 0) {
          return true;
        }
        if (var2 >= 32) {
          return true;
        }
        if (var3 >= field_t) {
          return true;
        }
        int var4 = var2 - 16;
        if (var4 < 0) {
          var4 = -var4;
        }
        if (var3 <= var4 / 2 + 1) {
          return true;
        }
        if (!field_I[var2][var3].field_a) {
          return false;
        }
        int var5 = param0 & 3;
        if (var5 == 0 &&
          var2 > 0 &&
          !field_I[var2 - 1][var3].field_a) {
          return false;
        }
        if (var5 == 3 &&
          var2 < 31 &&
          !field_I[var2 + 1][var3].field_a) {
          return false;
        }
        return true;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int var19 = 0;
        int var17 = 0;
        int var18 = 0;
        int var15 = 0;
        int var16 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        for (var19 = 0; var19 < param12; var19++) {
          var17 = param5 * param6 + param4 * param8 >> 8;
          var18 = param5 * param7 + param4 * param9 >> 8;
          var15 = param13 * var18;
          var16 = param14 * var17;
          var17 = var17 * 8;
          var18 = var18 * 8;
          for (var20 = 0; var20 < param11; var20++) {
            param2 = var16 + var15 >> 8;
            param1 = param0[param10];
            incrementValue$0 = param10;
            param10++;
            param0[incrementValue$0] = ((param1 & 16711935) * param2 & -16711936 | (param1 & 65280) * param2 & 16711680) >> 8;
            var15 = var15 + var18;
            var16 = var16 - var17;
          }
          param4 += 8;
          param5 -= 8;
          param10 = param10 + param3;
        }
    }

    private final static void b(int param0, int param1, boolean param2) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int var10 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var4Lifetime1;
        int var4Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        if (qn.field_J != null &&
          field_J) {
          var3 = field_D + param1 - db.field_d;
          var4 = 0;
          var5 = (int)(Math.sin(field_l) * 80.0);
          var6 = te.field_c[0].field_x * 80 / 100;
          var7 = te.field_c[0].field_A * 80 / 100;
          var8 = te.field_c[0].field_A - var7 >> 1;
          if (!param2) {
            for (var9 = var5 - var6; var9 < 640; var9 = var9 + te.field_c[0].field_x) {
              incrementValue$1 = var4;
              var4++;
              nb.field_a[field_K[incrementValue$1 % field_K.length]].c(var9, var3 + var8 * 2, (int)((double)var6 * 0.8), (int)((double)var7 * 0.8));
            }
            return;
          }
          var4Lifetime1 = 0;
          for (var9Lifetime1 = -var5 - var6; var9Lifetime1 < 640; var9Lifetime1 = var9Lifetime1 + var6) {
            incrementValue$0 = var4Lifetime1;
            var4Lifetime1++;
            te.field_c[field_K[incrementValue$0 % field_K.length]].c(var9Lifetime1, var3 + var8, var6, var7);
          }
          var3 = var3 + (60 + (int)(Math.sin(field_l) * 2.0));
          for (var9Lifetime2 = -var5 - qn.field_J.field_x; var9Lifetime2 < 640; var9Lifetime2 = var9Lifetime2 + qn.field_J.field_x) {
            qn.field_J.f(var9Lifetime2, var3);
          }
          var3 += 30;
          var4Lifetime2 = 0;
          while (true) {
            var9Lifetime3 = var3 + (int)(Math.cos(field_l * 1.3) * 4.0 * (double)var4Lifetime2 + Math.cos(field_l * 0.3 + (double)var4Lifetime2 * 1.3));
            if (var9Lifetime3 >= 480) {
              break;
            }
            for (var10 = -(int)(field_l * 10.0 + (double)(var4Lifetime2 * 5)) - ij.field_t.field_x - var4Lifetime2 * 200; var10 < 640; var10 = var10 + ij.field_t.field_x) {
              ij.field_t.f(var10, var9Lifetime3);
            }
            var3 += 70;
            var4Lifetime2++;
          }
        }
    }

    private final static ea a(int param0, int param1, boolean param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        Object var7;
        int var8;
        int var9;
        int var10;
        int var11;
        Object var12;
        ea var12_ref;
        ea var13;
        var3 = ca.field_k * 32 - li.field_c + sk.field_d / 10;
        var4 = hf.field_t * 32 - db.field_d + mf.field_i / 10;
        var5 = ca.c(-2302) ? 1 : 0;
        if (var5 == 0) {
          stackIn_6_0 = (tb.field_c >= 0) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var6 = stackIn_6_0;
        var7 = null;
        stackIn_9_0 = (il.e(-31391)) ? 0 : 1;
        var8 = stackIn_9_0;
        if (var8 != 0) {
          if (param2) {
            stackIn_16_0 = (field_I[ca.field_k][hf.field_t].field_A) ? 1 : 0;
          } else {
            stackIn_16_0 = 0;
          }
          var9 = stackIn_16_0;
          var10 = rf.a(13) ? 1 : 0;
          if (var6 == 0) {
            if (var5 == 0) {
              var7 = ag.field_a[-tb.field_c];
            } else {
              if (var10 == 0) {
                if (!(tb.field_c >= 0) ||
                  !(tb.field_c < rg.field_tb.length)) {
                  tb.field_c = 0;
                }
                var7 = rg.field_tb[tb.field_c];
              } else {
                if (!(tb.field_c >= 0) ||
                  !(tb.field_c < pc.field_f.length)) {
                  tb.field_c = 0;
                }
                var7 = pc.field_f[tb.field_c];
              }
            }
          } else {
            if (ch.field_h == 5) {
              var7 = ob.field_w[tb.field_c];
              var12 = var7;
              var7 = var12;
            } else {
              var7 = a.field_a[tb.field_c];
            }
          }
          if (di.field_K != 1) {
            if (var5 != 0 &&
              var10 != 0) {
              ((ea) (var7)).b(-113, var3 + param0 / 2 - 4 + 20, 4096, 7281, var4 + param1 / 2 - 4 + 20);
            } else {
              ((ea) (var7)).h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
            }
            if (var9 != 0) {
              var13 = ((ea) (var7)).e();
              var7 = var13;
              var13.d(40, 40, 80);
              var13.f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
              if (ce.field_b % 20 < 10) {
                var13.c(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4, 160);
              }
            }
            if (tc.field_s > 0) {
              if (var6 == 0) {
                if (var5 == 0) {
                  fg.field_c[-tb.field_c].h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                }
              } else {
                if (ch.field_h == 5) {
                  tf.field_c[tb.field_c].h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                } else {
                  rd.field_b[tb.field_c].h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                }
              }
            }
          } else {
            if (var5 != 0 &&
              var10 != 0) {
              ((ea) (var7)).b(-127, var3 + param0 / 2 - 4 + 20, 4096, 23665, var4 + param1 / 2 - 4 + 20);
            } else {
              ((ea) (var7)).f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
            }
            if (var9 != 0) {
              var12_ref = ((ea) (var7)).c();
              var7 = var12_ref;
              var12_ref.d(40, 40, 80);
              var12_ref.f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
              if (ce.field_b % 20 < 10) {
                var12_ref.c(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4, 160);
              }
            }
            if (tc.field_s > 0) {
              if (var6 == 0) {
                if (var5 == 0) {
                  fg.field_c[-tb.field_c].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                }
              } else {
                if (ch.field_h == 5) {
                  tf.field_c[tb.field_c].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                } else {
                  rd.field_b[tb.field_c].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                }
              }
            }
          }
          if (tc.field_s > 0 &&
            (field_m & 127) < 30) {
            var11 = (field_m & 127) / 5 % 6;
            pf.field_a[var11].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
          }
          if (var5 == 0 &&
            var10 != 0) {
            eh.f(var3 + ll.a((byte) -73, 32), var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4), 8, 16711680, 110);
            eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 64, 6, re.field_c);
            eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 64, 6, re.field_c);
            eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 80, 4, re.field_c);
            eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 80, 4, re.field_c);
          }
        }
        return (ea) (var7);
    }

    private final static void c(int param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int stackIn_14_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        je var9;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var6Lifetime1;
        int var7Lifetime1;
        int var25Lifetime1;
        var2 = li.field_c / 32;
        var3 = (640 + li.field_c) / 32;
        var4 = db.field_d / 32 - 1;
        var5 = (640 + db.field_d) / 32;
        if (var2 < 1) {
          var2 = 1;
        }
        if (var3 > 30) {
          var3 = 30;
        }
        if (var4 < 1) {
          var4 = 1;
        }
        if (var5 > field_t - 2) {
          var5 = field_t - 2;
        }
        var6 = ca.field_k * 32 - li.field_c + sk.field_d / 10;
        var7 = hf.field_t * 32 - db.field_d + mf.field_i / 10;
        if (!wm.field_e) {
          stackIn_14_0 = (!vi.field_h) ? 1 : 0;
        } else {
          stackIn_14_0 = 0;
        }
        var8 = stackIn_14_0;
        for (var10 = var4 - 1; var10 <= var5 + 1; var10++) {
          for (var11 = var2 - 1; var11 <= var3 + 1; var11++) {
            var9 = field_I[var11][var10];
            var6Lifetime1 = var11 * 32 - li.field_c;
            var7Lifetime1 = var10 * 32 - db.field_d;
            if (var6Lifetime1 > -64 &&
              var7Lifetime1 > -64 &&
              var6Lifetime1 < 704 &&
              var7Lifetime1 < 544) {
              if (var11 > 0 &&
                var10 > 0) {
                stackIn_34_0 = field_I[var11 - 1][var10 - 1].field_i;
              } else {
                stackIn_34_0 = 0;
              }
              var12 = stackIn_34_0;
              if (var10 <= 0) {
                stackIn_37_0 = 0;
              } else {
                stackIn_37_0 = field_I[var11][var10 - 1].field_i;
              }
              var13 = stackIn_37_0;
              if (var10 > 0 &&
                var11 < 31) {
                stackIn_41_0 = field_I[var11 + 1][var10 - 1].field_i;
              } else {
                stackIn_41_0 = 0;
              }
              var14 = stackIn_41_0;
              if (var11 <= 0) {
                stackIn_44_0 = 0;
              } else {
                stackIn_44_0 = field_I[var11 - 1][var10].field_i;
              }
              var15 = stackIn_44_0;
              var16 = field_I[var11][var10].field_i;
              if (var11 >= 31) {
                stackIn_47_0 = 0;
              } else {
                stackIn_47_0 = field_I[var11 + 1][var10].field_i;
              }
              var17 = stackIn_47_0;
              if (var11 > 0 &&
                var10 < field_t - 1) {
                stackIn_51_0 = field_I[var11 - 1][var10 + 1].field_i;
              } else {
                stackIn_51_0 = 0;
              }
              var18 = stackIn_51_0;
              if (var10 >= field_t - 1) {
                stackIn_54_0 = 0;
              } else {
                stackIn_54_0 = field_I[var11][var10 + 1].field_i;
              }
              var19 = stackIn_54_0;
              if (var10 < field_t - 1 &&
                var11 < 31) {
                stackIn_58_0 = field_I[var11 + 1][var10 + 1].field_i;
              } else {
                stackIn_58_0 = 0;
              }
              var20 = stackIn_58_0;
              var21 = var12 + var13 + var15 + var16 >> 2;
              var22 = var13 + var14 + var16 + var17 >> 2;
              var23 = var15 + var16 + var18 + var19 >> 2;
              var24 = var16 + var17 + var19 + var20 >> 2;
              if (var21 == var22 &&
                var22 == var23 &&
                var23 == var24) {
                if (var22 != 0) {
                  eh.b(var6Lifetime1 + param0, var7Lifetime1 + param1, 32, 32, 0, 256 - var21);
                } else {
                  eh.e(var6Lifetime1 + param0, var7Lifetime1 + param1, 32, 32, 0);
                }
              } else {
                var25 = var6Lifetime1 + param0;
                var26 = var7Lifetime1 + param1;
                var27 = var21;
                var28 = var22;
                var29 = var23;
                var30 = var24;
                var31 = 32;
                var32 = 32;
                var33 = 0;
                var34 = 255;
                var35 = 0;
                var36 = 255;
                if (var25 < eh.field_a) {
                  var31 = var31 - (eh.field_a - var25);
                  var35 = 8 * (eh.field_a - var25);
                  var36 = 255 - var35;
                  var25 = eh.field_a;
                }
                if (var26 < eh.field_d) {
                  var32 = var32 - (eh.field_d - var26);
                  var33 = 8 * (eh.field_d - var26);
                  var34 = 255 - var33;
                  var26 = eh.field_d;
                }
                if (var25 + var31 > eh.field_k) {
                  var31 = eh.field_k - var25;
                }
                if (var26 + var32 > eh.field_e) {
                  var32 = eh.field_e - var26;
                }
                var37 = eh.field_g - var31;
                var38 = var25 + eh.field_g * var26;
                je.a(eh.field_f, 0, 0, var37, var33, var34, var27, var28, var29, var30, var38, var31, var32, var35, var36);
              }
              if (var8 != 0 &&
                var9.field_U >= 0 && (!var9.field_b ||
                qe.field_b[9])) {
                var25Lifetime1 = var9.field_U;
                if (!field_J ||
                  !(var7Lifetime1 >= field_D - db.field_d)) {
                  if (var9.field_b) {
                    field_w[var25Lifetime1 + var9.field_Q * 6].f(var6Lifetime1 + param0, var7Lifetime1 + param1, 82);
                  } else {
                    field_w[var25Lifetime1 + var9.field_Q * 6].f(var6Lifetime1 + param0, var7Lifetime1 + param1);
                  }
                }
              }
            }
          }
        }
    }

    private final static void d(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        je var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var13Lifetime3;
        int var14Lifetime3;
        int var13Lifetime1Lifetime1;
        int var13Lifetime2Lifetime1;
        int var14Lifetime1Lifetime1;
        int var14Lifetime2Lifetime1;
        for (var2 = param0; var2 <= param1; var2++) {
          if (var2 < hf.field_t + 16) {
            for (var3 = 1; var3 <= 30; var3++) {
              var4 = field_I[var3][var2];
              if (var4.field_s == -1 &&
                !var4.field_a &&
                je.c(var3, var2, 1, 1) && (!je.c(var3, var2, 1, 0) ||
                !je.c(var3, var2 - 1, 1, 1) ||
                !je.c(var3, var2 - 1, 1, 2) ||
                !je.c(var3, var2 - 1, 1, 3))) {
                var4.field_s = 0;
                var5 = var3;
                var6 = var3;
                var7 = var2;
                var8 = var2;
                var9 = 0;
                while (var9 < 50) {
                  var10 = var5;
                  while (var10 <= var6) {
                    var11 = var7;
                    while (var11 <= var8) {
                      if (field_I[var10][var11].field_s == var9) {
                        boolean decompiledFrameRemainder0 = true;
                        if (var10 == var5) {
                          if (var10 > 1) {
                            var5--;
                            if (var10 != var6) {
                              if (((var11 == var7)) &&
                                (!(var11 <= param0))) {
                                var7--;
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (var10 >= 30) {
                                if (((var11 == var7)) &&
                                  (!(var11 <= param0))) {
                                  var7--;
                                }
                                decompiledFrameRemainder0 = false;
                              }
                              else {
                                var6++;
                              }
                            }
                          } else {
                            if (var10 != var6) {
                              if (((var11 == var7)) &&
                                (!(var11 <= param0))) {
                                var7--;
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (var10 >= 30) {
                                if (((var11 == var7)) &&
                                  (!(var11 <= param0))) {
                                  var7--;
                                }
                                decompiledFrameRemainder0 = false;
                              }
                              else {
                                var6++;
                              }
                            }
                          }
                        } else {
                          if (var10 != var6) {
                            if (((var11 == var7)) &&
                              (!(var11 <= param0))) {
                              var7--;
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (var10 >= 30) {
                              if (((var11 == var7)) &&
                                (!(var11 <= param0))) {
                                var7--;
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              var6++;
                            }
                          }
                        }
                        if ((decompiledFrameRemainder0) && (var11 == var7 &&
                          var11 > param0)) {
                          var7--;
                        }
                        if (var11 == var8 &&
                          var11 < param1) {
                          var8++;
                        }
                        if (field_I[var10 - 1][var11].field_s == -1) {
                          field_I[var10 - 1][var11].field_s = var9 + 1;
                        }
                        if (field_I[var10 + 1][var11].field_s == -1) {
                          field_I[var10 + 1][var11].field_s = var9 + 1;
                        }
                        if (field_I[var10][var11 - 1].field_s == -1) {
                          field_I[var10][var11 - 1].field_s = var9 + 1;
                        }
                        if (field_I[var10][var11 + 1].field_s == -1) {
                          field_I[var10][var11 + 1].field_s = var9 + 1;
                        }
                        if (field_I[var10 - 1][var11 - 1].field_s == -1) {
                          field_I[var10 - 1][var11 - 1].field_s = var9 + 1;
                        }
                        if (field_I[var10 + 1][var11 - 1].field_s == -1) {
                          field_I[var10 + 1][var11 - 1].field_s = var9 + 1;
                        }
                        if (field_I[var10 - 1][var11 + 1].field_s == -1) {
                          field_I[var10 - 1][var11 + 1].field_s = var9 + 1;
                        }
                        if (field_I[var10 + 1][var11 + 1].field_s == -1) {
                          field_I[var10 + 1][var11 + 1].field_s = var9 + 1;
                        }
                        if (!je.c(var10, var11 - 1, 1, 1) &&
                          !field_I[var10][var11 - 1].field_a &&
                          var11 > var2) {
                          var12 = 0;
                          if (je.c(var3, var2, 1, 1) &&
                            !je.c(var10, var11 - 1, 1, 3)) {
                            var13 = var3;
                            var14 = var2;
                            field_O.a((var14 << 2) + 1, false, (var13 << 2) + 1, 74);
                            var13Lifetime3 = var10;
                            var14Lifetime3 = var11 - 1;
                            field_O.a((var14Lifetime3 << 2) + 3, true, (var13Lifetime3 << 2) + 1, 119);
                            var12 = 1;
                          }
                          if (var12 == 0 &&
                            je.c(var3, var2, 1, 1) &&
                            !je.c(var10, var11 - 1, 1, 2)) {
                            var13Lifetime1 = var3;
                            var14Lifetime1 = var2;
                            field_O.a((var14Lifetime1 << 2) + 1, false, (var13Lifetime1 << 2) + 1, 51);
                            var13Lifetime1Lifetime1 = var10;
                            var14Lifetime1Lifetime1 = var11 - 1;
                            field_O.a((var14Lifetime1Lifetime1 << 2) + 2, true, (var13Lifetime1Lifetime1 << 2) + 1, 74);
                            var12 = 1;
                          }
                          if (var12 == 0 &&
                            je.c(var3, var2, 1, 1) &&
                            !je.c(var10, var11 - 1, 1, 1)) {
                            var13Lifetime2 = var3;
                            var14Lifetime2 = var2;
                            field_O.a((var14Lifetime2 << 2) + 1, false, (var13Lifetime2 << 2) + 1, -115);
                            var13Lifetime2Lifetime1 = var10;
                            var14Lifetime2Lifetime1 = var11 - 1;
                            field_O.a((var14Lifetime2Lifetime1 << 2) + 1, true, (var13Lifetime2Lifetime1 << 2) + 1, -74);
                          }
                          var9 = 50;
                          var10 = var6 + 1;
                          var11 = var8 + 1;
                        }
                      }
                      var11++;
                    }
                    var10++;
                  }
                  var9++;
                }
              }
            }
          }
        }
    }

    final static int e(int param0, int param1, int param2, int param3) {
        return field_O.a((byte) -114, (param1 << 2) + param3, (param0 << 2) + param2);
    }

    private final static void a(int param0, int param1, ea param2) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        ea var8_ref_ea;
        int var8;
        int var9;
        int var10;
        int var11;
        ea var12_ref_ea;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var11Lifetime3;
        stackIn_3_0 = (il.e(-31391)) ? 0 : 1;
        var3 = stackIn_3_0;
        var4 = ca.c(-2302) ? 1 : 0;
        if (var4 == 0) {
          stackIn_9_0 = (tb.field_c >= 0) ? 1 : 0;
        } else {
          stackIn_9_0 = 0;
        }
        var5 = stackIn_9_0;
        var6 = ca.field_k * 32 - li.field_c + sk.field_d / 10;
        var7 = hf.field_t * 32 - db.field_d + mf.field_i / 10;
        if (var3 != 0 &&
          var4 == 0) {
          if (fn.a(true)) {
            var8 = ca.field_k * 4 + sk.field_d / 80 - 1;
            var9 = hf.field_t * 4 + mf.field_i / 80 - 1;
            var10 = var8 * 8 - li.field_c;
            var11 = var9 * 8 - db.field_d;
            if (ch.field_h != 5) {
              if (var5 == 0) {
                var12_ref_ea = eg.field_m[-tb.field_c];
              } else {
                var12_ref_ea = pk.field_h[tb.field_c];
              }
            } else {
              var12_ref_ea = lb.field_x[tb.field_c];
            }
            for (var13 = 0; var13 <= 5; var13++) {
              var14 = var9;
              var11Lifetime3 = var9 * 8 - db.field_d;
              for (var15 = 0; var15 <= 5; var15++) {
                if (field_O.a(var8, var14, (byte) 61)) {
                  eh.a(var10, var11Lifetime3, var10 + 8, var11Lifetime3 + 8);
                  if (di.field_K >= 0) {
                    param2.e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 1);
                    var12_ref_ea.e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 11243013);
                  } else {
                    param2.e().e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 1);
                    var12_ref_ea.e().e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 11243013);
                  }
                }
                var14++;
                var11Lifetime3 += 8;
              }
              var10 += 8;
              var8++;
            }
            eh.a();
          } else {
            if (ch.field_h != 5 &&
              var5 != 0 &&
              field_I[ca.field_k][hf.field_t].field_A) {
              if (ch.field_h != 5) {
                var8_ref_ea = pk.field_h[tb.field_c];
              } else {
                var8_ref_ea = lb.field_x[tb.field_c];
              }
              if (di.field_K < 0) {
                var8_ref_ea.e().a(var6 - 4, var7 - 4, 9348351);
              } else {
                var8_ref_ea.a(var6 - 4, var7 - 4, 9348351);
              }
            }
          }
          var8Lifetime1 = var6 - pd.field_a.field_x - 1;
          var9Lifetime1 = var7 - 1;
          var10Lifetime1 = kn.field_E;
          if (!qe.field_b[19]) {
            if (!qe.field_b[2]) {
              if (var10Lifetime1 < 450) {
                var11Lifetime1 = 0;
                if (var10Lifetime1 < 250 &&
                  var10Lifetime1 / 10 % 2 == 0) {
                  var11Lifetime1 = 16711680;
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                }
                if (var10Lifetime1 < 100 &&
                  var10Lifetime1 / 10 % 2 == 1) {
                  var11Lifetime1 = 16776960;
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                }
                if (var10Lifetime1 < 50 &&
                  var10Lifetime1 / 25 % 2 == 0) {
                  var11Lifetime1 = 16777215;
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                }
                var11Lifetime1 = 10341850;
                var12 = var10Lifetime1 * pd.field_a.field_A / 450;
                if (var12 > 0) {
                  eh.a(var8Lifetime1, var9Lifetime1 + (pd.field_a.field_A - var12), var8Lifetime1 + pd.field_a.field_x + 2, var9Lifetime1 + pd.field_a.field_A + 2);
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                  eh.a();
                }
                pd.field_a.f(var8Lifetime1, var9Lifetime1, 100);
              }
            } else {
              if (var10Lifetime1 < 950) {
                var11Lifetime1 = 0;
                if (var10Lifetime1 < 250 &&
                  var10Lifetime1 / 10 % 2 == 0) {
                  var11Lifetime1 = 16711680;
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                }
                if (var10Lifetime1 < 100 &&
                  var10Lifetime1 / 10 % 2 == 1) {
                  var11Lifetime1 = 16776960;
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                }
                if (var10Lifetime1 < 50 &&
                  var10Lifetime1 / 25 % 2 == 0) {
                  var11Lifetime1 = 16777215;
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                }
                var11Lifetime1 = 10341850;
                var12 = var10Lifetime1 * pd.field_a.field_A / 950;
                if (var12 > 0) {
                  eh.a(var8Lifetime1, var9Lifetime1 + (pd.field_a.field_A - var12), var8Lifetime1 + pd.field_a.field_x + 2, var9Lifetime1 + pd.field_a.field_A + 2);
                  eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                  eh.a();
                }
                pd.field_a.f(var8Lifetime1, var9Lifetime1, 100);
              }
            }
          } else {
            if (var10Lifetime1 < 1950) {
              var11Lifetime1 = 0;
              if (var10Lifetime1 < 250 &&
                var10Lifetime1 / 10 % 2 == 0) {
                var11Lifetime1 = 16711680;
                eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
              }
              if (var10Lifetime1 < 100 &&
                var10Lifetime1 / 10 % 2 == 1) {
                var11Lifetime1 = 16776960;
                eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
              }
              if (var10Lifetime1 < 50 &&
                var10Lifetime1 / 25 % 2 == 0) {
                var11Lifetime1 = 16777215;
                eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
              }
              var11Lifetime1 = 10341850;
              var12 = var10Lifetime1 * pd.field_a.field_A / 1950;
              if (var12 > 0) {
                eh.a(var8Lifetime1, var9Lifetime1 + (pd.field_a.field_A - var12), var8Lifetime1 + pd.field_a.field_x + 2, var9Lifetime1 + pd.field_a.field_A + 2);
                eh.c(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11Lifetime1);
                eh.a();
              }
              pd.field_a.f(var8Lifetime1, var9Lifetime1, 100);
              eh.d(var8Lifetime1 + (pd.field_a.field_x >> 1), var9Lifetime1 + (pd.field_a.field_A >> 1), (pd.field_a.field_A >> 1) + 2, 16774927);
            }
          }
          if (!qe.field_b[16]) {
            var11Lifetime2 = cn.field_C;
            if (var11Lifetime2 < 0) {
              var12Lifetime1 = var6 + 28;
              var13Lifetime1 = var7 - 1;
              var14Lifetime1 = var11Lifetime2 * 16 / -300;
              var15Lifetime1 = kc.field_a.field_C;
              var16 = var15Lifetime1 - var14Lifetime1;
              kc.field_a.g();
              eh.d();
              eh.a(0, var14Lifetime1, kc.field_a.field_y, var15Lifetime1);
              eh.c(0, 0, 8, var15Lifetime1, 16722703, 1562103);
              eh.a();
              if (var16 < var15Lifetime1 / 2 &&
                ce.field_b % 10 < 5) {
                rf.field_d.a(0, 0, 16711680);
              } else {
                rf.field_d.f(0, 0);
              }
              bj.field_e.a((byte) -45);
              eh.a(var12Lifetime1, var13Lifetime1, var12Lifetime1 + pn.field_c.field_a, var13Lifetime1 + pn.field_c.field_f);
              kc.field_a.a(pn.field_c, var12Lifetime1, var13Lifetime1);
              eh.a();
            }
          }
        }
    }

    final static void j() {
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var0;
        int var1;
        int var2;
        int var3;
        int var6;
        int var0Lifetime1;
        int var1Lifetime1;
        var0 = li.field_c / 32;
        var1 = (640 + li.field_c) / 32;
        var2 = db.field_d / 32 - field_W;
        var3 = (640 + db.field_d) / 32 + field_M;
        if (var0 < 1) {
          var0 = 1;
        }
        if (var1 > 30) {
          var1 = 30;
        }
        var0Lifetime1 = 1;
        var1Lifetime1 = 30;
        if (var2 < 1) {
          var2 = 1;
        }
        if (var3 > field_t - 2) {
          var3 = field_t - 2;
        }
        for (var4 = var2; var4 <= var3; var4++) {
          if (var4 < hf.field_t + 16) {
            for (var5 = var0Lifetime1; var5 <= var1Lifetime1; var5++) {
              if (field_I[var5][var4].field_i > 128) {
                field_I[var5][var4].field_V = true;
              }
              boolean decompiledFrameRemainder0 = true;
              if (field_I[var5][var4].field_e) {
                if (!field_I[var5][var4].field_a &&
                  !je.c(var5, var4, 1, 1)) {
                  if (!(field_I[var5][var4].field_i >= 80)) {
                    field_I[var5][var4].field_i = 80;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  field_I[var5][var4].field_e = false;
                }
              }
              if (field_I[var5][var4].field_V &&
                !field_I[var5][var4].field_a) {
                field_I[var5 - 1][var4].field_V = true;
                field_I[var5 + 1][var4].field_V = true;
                field_I[var5][var4 - 1].field_V = true;
                field_I[var5 - 1][var4 - 1].field_V = true;
                field_I[var5 + 1][var4 - 1].field_V = true;
                field_I[var5 - 1][var4 + 1].field_V = true;
                field_I[var5 + 1][var4 + 1].field_V = true;
                field_I[var5 - 1][var4 - 1].field_V = true;
                field_I[var5 - 1][var4 + 1].field_V = true;
                field_I[var5 + 1][var4 - 1].field_V = true;
                field_I[var5 + 1][var4 + 1].field_V = true;
              }
              var6 = field_I[var5][var4].field_i - 16;
              if (field_I[var5][var4].field_a ||
                !field_I[var5][var4].field_V) {
                var6 = var6 - 64;
              }
              if (je.c(var5, var4, 1, 1) &&
                field_I[var5][var4].field_V) {
                var6 = var6 - 32;
              }
              for (var7 = var5 - 1; var7 <= var5 + 1; var7++) {
                for (var8 = var4 - 1; var8 <= var4 + 1; var8++) {
                  if (field_I[var7][var8].field_i < var6) {
                    field_I[var7][var8].field_i = var6;
                  }
                }
              }
            }
          }
        }
    }

    private final static void b() {
        field_I[16][0].field_V = true;
        field_I[16][0].field_a = false;
        field_I[16][1].field_V = true;
        field_I[16][1].field_a = false;
        field_I[16][2].field_V = true;
        field_I[16][2].field_a = false;
        field_I[16][3].field_V = true;
        field_I[16][3].field_a = false;
        field_I[16][4].field_V = true;
        field_I[16][4].field_a = false;
        field_I[16][5].field_V = true;
        field_I[16][5].field_a = true;
        field_I[16][5].field_b = true;
        field_I[15][4].field_V = true;
        field_I[15][4].field_a = false;
        field_I[14][4].field_V = true;
        field_I[14][4].field_a = false;
        field_I[17][4].field_V = true;
        field_I[17][4].field_a = false;
        field_I[18][4].field_V = true;
        field_I[18][4].field_a = false;
    }

    final static je[][] i() {
        int var1 = 0;
        int var0 = 0;
        int var0Lifetime1;
        int var0Lifetime1Lifetime1;
        field_t = 0;
        field_H = 0;
        field_I = new je[32][24 * field_N[cm.field_o]];
        for (var0 = 0; var0 < 32; var0++) {
          for (var1 = 0; var1 < 24 * field_N[cm.field_o]; var1++) {
            field_I[var0][var1] = new je();
          }
        }
        field_u = -1;
        je.f();
        field_O = new rb(32, 24 * field_N[cm.field_o]);
        je.k();
        je.k();
        if (qe.field_b[10]) {
          for (var0Lifetime1 = 0; var0Lifetime1 < 5; var0Lifetime1++) {
            je.k();
          }
          for (var0Lifetime1Lifetime1 = 4; var0Lifetime1Lifetime1 < field_t - 1; var0Lifetime1Lifetime1++) {
            field_I[18][var0Lifetime1Lifetime1].field_a = false;
            field_I[18][var0Lifetime1Lifetime1].field_V = true;
          }
        }
        je.b();
        return field_I;
    }

    final static boolean a() {
        return field_O.c(121, (hf.field_t << 2) + (mf.field_i + 160) / 80, (ca.field_k << 2) + (sk.field_d + 160) / 80);
    }

    private final void h() {
        this.field_Q = (int)(Math.random() * 2.0);
        this.field_q = 0;
        this.field_a = true;
        this.field_U = -1;
        this.field_S = false;
        this.field_b = false;
        this.field_V = false;
        this.field_v = false;
        this.field_i = 0;
        this.field_A = false;
        this.field_r = (int)(Math.random() * 1000.0 + 0.0);
    }

    final static void k() {
        int var5 = 0;
        int var6 = 0;
        int var0;
        int var1;
        ea var2;
        int var3;
        int var4;
        var0 = 0;
        if (field_u != field_N[cm.field_o]) {
          if (field_u == -1) {
            field_u = field_u + 1;
          } else {
            field_u = field_u + (int)(Math.random() * 3.0 + 1.0);
            if (field_u < field_N[cm.field_o]) {
              if (cm.field_o == 1 &&
                field_T < 0 &&
                field_u >= field_N[cm.field_o] - 3) {
                field_T = ll.a((byte) -73, 5);
                field_o = 16 - (ll.a((byte) -73, 16) - 8);
                field_f = field_t + ll.a((byte) -73, 24);
                var0 = 1;
              }
            } else {
              field_u = field_N[cm.field_o];
              if (me.field_h < 2000) {
                fn.a(31, 224, 3);
              }
            }
          }
        }
        field_H = field_H + 24;
        if (field_u == field_N[cm.field_o]) {
          me.a(cm.field_o, false);
        }
        if (rg.field_sb > 0 &&
          field_u == field_N[cm.field_o] &&
          ke.field_V) {
          fn.a(10, 245, 3);
          if (a.field_c == 0) {
            fn.a(30, 225, 3);
          }
        }
        var1 = field_t;
        field_t = field_t + 24;
        je.b(var1);
        mh.field_e = field_I;
        q.field_b = field_I;
        if (field_u != field_N[cm.field_o] &&
          d.field_b &&
          ke.field_V) {
          if (field_u > 1) {
            je.c(var1);
            je.a(var1);
          }
          if (field_u > 10) {
            je.a(var1);
          }
        }
        if (var0 != 0) {
          var2 = je.e();
          var3 = var2.field_x / 32;
          var4 = var2.field_A / 32;
          for (var5 = field_o; var5 < field_o + var3; var5++) {
            for (var6 = field_f; var6 < field_f + var4; var6++) {
              field_I[var5][var6].field_a = false;
              field_I[var5][var6].field_E = false;
              field_I[var5][var6].field_v = false;
              field_I[var5][var6].field_b = false;
              field_O.b(124, var5, var6);
            }
          }
        }
    }

    private final static void a(int param0, int param1) {
        int var2 = 0;
        je dupTemp$0 = null;
        je dupTemp$1 = null;
        je dupTemp$2 = null;
        je dupTemp$3 = null;
        je dupTemp$4 = null;
        je dupTemp$5 = null;
        je dupTemp$6 = null;
        je dupTemp$7 = null;
        je dupTemp$8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        for (var2 = param0; var2 <= param1; var2++) {
          if (var2 < hf.field_t + 16) {
            stackIn_8_0 = ((var2 & 1) != 0) ? 0 : 1;
            var3 = stackIn_8_0;
            stackIn_11_0 = (var3 == 0) ? -1 : 1;
            var4 = stackIn_11_0;
            var5 = 0;
            stackIn_14_0 = (var3 == 0) ? 30 : 1;
            var6 = stackIn_14_0;
            while (var5 < 29) {
              if (!field_I[var6][var2].field_A) {
                if (!field_O.b(var6, var2, (byte) 84)) {
                  if (!field_I[var6][var2].field_E &&
                    field_I[var6][var2].field_q < 0) {
                    dupTemp$0 = field_I[var6][var2];
                    dupTemp$0.field_q = dupTemp$0.field_q + 1;
                  }
                } else {
                  if (0 > field_I[var6 + 1][var2].field_q) {
                    dupTemp$1 = field_I[var6 + 1][var2];
                    dupTemp$1.field_q = dupTemp$1.field_q + 4;
                  }
                  if (!field_I[var6 + 1][var2].field_S) {
                    field_I[var6 + 1][var2].field_S = true;
                    field_I[var6 + 1][var2].field_r = 500;
                  }
                  if (0 > field_I[var6 - 1][var2].field_q) {
                    dupTemp$2 = field_I[var6 - 1][var2];
                    dupTemp$2.field_q = dupTemp$2.field_q + 4;
                  }
                  if (!field_I[var6 - 1][var2].field_S) {
                    field_I[var6 - 1][var2].field_S = true;
                    field_I[var6 - 1][var2].field_r = 500;
                  }
                  if (0 > field_I[var6][var2 + 1].field_q) {
                    dupTemp$3 = field_I[var6][var2 + 1];
                    dupTemp$3.field_q = dupTemp$3.field_q + 4;
                  }
                  if (!field_I[var6][var2 - 1].field_S) {
                    field_I[var6][var2 - 1].field_S = true;
                    field_I[var6][var2 - 1].field_r = 500;
                  }
                  if (0 > field_I[var6][var2 - 1].field_q) {
                    dupTemp$4 = field_I[var6][var2 - 1];
                    dupTemp$4.field_q = dupTemp$4.field_q + 4;
                  }
                  if (!field_I[var6][var2 + 1].field_S) {
                    field_I[var6][var2 + 1].field_S = true;
                    field_I[var6][var2 + 1].field_r = 500;
                  }
                }
                if (field_I[var6][var2].field_a) {
                  if (!field_I[var6][var2].field_E) {
                    if (field_I[var6][var2].field_q < -200) {
                      field_I[var6][var2].field_E = true;
                      field_I[var6][var2].field_v = false;
                      field_I[var6][var2].field_S = false;
                    } else {
                      if (field_I[var6][var2].field_E &&
                        field_I[var6][var2].field_q > -50) {
                        field_I[var6][var2].field_E = false;
                      }
                    }
                  } else {
                    if (field_I[var6][var2].field_E &&
                      field_I[var6][var2].field_q > -50) {
                      field_I[var6][var2].field_E = false;
                    }
                  }
                }
              } else {
                if (-400 < field_I[var6 + 1][var2].field_q) {
                  dupTemp$5 = field_I[var6 + 1][var2];
                  dupTemp$5.field_q = dupTemp$5.field_q - 2;
                }
                if (-400 < field_I[var6 - 1][var2].field_q) {
                  dupTemp$6 = field_I[var6 - 1][var2];
                  dupTemp$6.field_q = dupTemp$6.field_q - 2;
                }
                if (-400 < field_I[var6][var2 + 1].field_q) {
                  dupTemp$7 = field_I[var6][var2 + 1];
                  dupTemp$7.field_q = dupTemp$7.field_q - 2;
                }
                if (-400 < field_I[var6][var2 - 1].field_q) {
                  dupTemp$8 = field_I[var6][var2 - 1];
                  dupTemp$8.field_q = dupTemp$8.field_q - 2;
                }
              }
              var6 = var6 + var4;
              var5++;
            }
          }
        }
    }

    private final static void f(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        for (var2 = param0; var2 <= param1; var2++) {
          if (var2 < hf.field_t + 16) {
            for (var3 = 1; var3 <= 30; var3++) {
              boolean decompiledFrameRemainder0 = true;
              if (field_I[var3][var2].field_A) {
                if (!field_I[var3][var2].field_a && (je.c(var3, var2, 1, 3) ||
                  je.b(var3, var2, 1, 3))) {
                  if (je.c(var3 + 1, var2, 1, 3)) {
                    field_I[var3 + 1][var2].field_A = true;
                  }
                  if (je.c(var3 - 1, var2, 1, 3)) {
                    field_I[var3 - 1][var2].field_A = true;
                  }
                  if (je.c(var3, var2 - 1, 1, 3)) {
                    field_I[var3][var2 - 1].field_A = true;
                  }
                  if (je.c(var3, var2 + 1, 1, 3)) {
                    field_I[var3][var2 + 1].field_A = true;
                  }
                  if (je.c(var3 + 1, var2 + 1, 1, 3)) {
                    field_I[var3 + 1][var2 + 1].field_A = true;
                  }
                  if (je.c(var3 + 1, var2 - 1, 1, 3)) {
                    field_I[var3 + 1][var2 - 1].field_A = true;
                  }
                  if (je.c(var3 - 1, var2 + 1, 1, 3)) {
                    field_I[var3 - 1][var2 + 1].field_A = true;
                  }
                  if (!(!je.c(var3 - 1, var2 - 1, 1, 3))) {
                    field_I[var3 - 1][var2 - 1].field_A = true;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  field_I[var3][var2].field_A = false;
                }
              }
            }
          }
        }
    }

    private final static void h(int param0, int param1) {
        int var2 = 0;
        je dupTemp$0 = null;
        je dupTemp$1 = null;
        je dupTemp$2 = null;
        je dupTemp$3 = null;
        je dupTemp$4 = null;
        je dupTemp$5 = null;
        je dupTemp$6 = null;
        je dupTemp$7 = null;
        je dupTemp$8 = null;
        je dupTemp$9 = null;
        je dupTemp$10 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        for (var2 = param0; var2 <= param1; var2++) {
          if (var2 < hf.field_t + 16) {
            stackIn_8_0 = ((var2 & 1) != 0) ? 0 : 1;
            var3 = stackIn_8_0;
            stackIn_11_0 = (var3 == 0) ? -1 : 1;
            var4 = stackIn_11_0;
            var5 = 0;
            stackIn_14_0 = (var3 == 0) ? 30 : 1;
            var6 = stackIn_14_0;
            while (var5 < 29) {
              if (field_I[var6][var2].field_q > 10 &&
                field_I[var6][var2].field_a) {
                var7 = 8;
                var8 = 7;
                if (field_I[var6][var2].field_q > 250 &&
                  je.e(var6, var2, 1, 1) == 0) {
                  dupTemp$0 = field_I[var6][var2];
                  dupTemp$0.field_q = dupTemp$0.field_q - 1;
                }
                if (var3 != 0 &&
                  var6 > 1 &&
                  field_I[var6 - 1][var2].field_q < field_I[var6][var2].field_q * var8 / var7) {
                  var7 = (!field_I[var6][var2].field_a) ? 10 : 4;
                  stackIn_30_0 = var7;
                  if (!field_I[var6 - 1][var2].field_a) {
                    stackIn_31_1 = 10;
                  } else {
                    stackIn_31_1 = 4;
                  }
                  var9 = stackIn_30_0 + stackIn_31_1;
                  dupTemp$1 = field_I[var6 - 1][var2];
                  dupTemp$1.field_q = dupTemp$1.field_q + field_I[var6][var2].field_q / var9;
                  dupTemp$2 = field_I[var6][var2];
                  dupTemp$2.field_q = dupTemp$2.field_q - field_I[var6][var2].field_q / var9;
                }
                if (var6 < 30 &&
                  field_I[var6 + 1][var2].field_q < field_I[var6][var2].field_q * var8 / var7) {
                  var7 = (!field_I[var6][var2].field_a) ? 10 : 4;
                  stackIn_39_0 = var7;
                  if (!field_I[var6 + 1][var2].field_a) {
                    stackIn_40_1 = 10;
                  } else {
                    stackIn_40_1 = 4;
                  }
                  var9Lifetime1 = stackIn_39_0 + stackIn_40_1;
                  dupTemp$3 = field_I[var6 + 1][var2];
                  dupTemp$3.field_q = dupTemp$3.field_q + field_I[var6][var2].field_q / var9Lifetime1;
                  dupTemp$4 = field_I[var6][var2];
                  dupTemp$4.field_q = dupTemp$4.field_q - field_I[var6][var2].field_q / var9Lifetime1;
                }
                if (var3 == 0 &&
                  var6 > 1 &&
                  field_I[var6 - 1][var2].field_q < field_I[var6][var2].field_q * var8 / var7) {
                  var7 = (!field_I[var6][var2].field_a) ? 10 : 4;
                  stackIn_49_0 = var7;
                  if (!field_I[var6 - 1][var2].field_a) {
                    stackIn_50_1 = 10;
                  } else {
                    stackIn_50_1 = 4;
                  }
                  var9Lifetime2 = stackIn_49_0 + stackIn_50_1;
                  dupTemp$5 = field_I[var6 - 1][var2];
                  dupTemp$5.field_q = dupTemp$5.field_q + field_I[var6][var2].field_q / var9Lifetime2;
                  dupTemp$6 = field_I[var6][var2];
                  dupTemp$6.field_q = dupTemp$6.field_q - field_I[var6][var2].field_q / var9Lifetime2;
                }
                if (field_I[var6][var2 - 1].field_q < field_I[var6][var2].field_q * var8 / var7) {
                  var7 = (!field_I[var6][var2].field_a) ? 10 : 4;
                  stackIn_57_0 = var7;
                  if (!field_I[var6][var2 - 1].field_a) {
                    stackIn_58_1 = 10;
                  } else {
                    stackIn_58_1 = 4;
                  }
                  var9Lifetime3 = stackIn_57_0 + stackIn_58_1;
                  dupTemp$7 = field_I[var6][var2 - 1];
                  dupTemp$7.field_q = dupTemp$7.field_q + field_I[var6][var2].field_q / var9Lifetime3;
                  dupTemp$8 = field_I[var6][var2];
                  dupTemp$8.field_q = dupTemp$8.field_q - field_I[var6][var2].field_q / var9Lifetime3;
                }
                if (field_I[var6][var2 + 1].field_q < field_I[var6][var2].field_q * var8 / var7) {
                  var7 = (!field_I[var6][var2].field_a) ? 10 : 4;
                  stackIn_65_0 = var7;
                  if (!field_I[var6][var2 + 1].field_a) {
                    stackIn_66_1 = 10;
                  } else {
                    stackIn_66_1 = 4;
                  }
                  var9Lifetime4 = stackIn_65_0 + stackIn_66_1;
                  dupTemp$9 = field_I[var6][var2 + 1];
                  dupTemp$9.field_q = dupTemp$9.field_q + field_I[var6][var2].field_q / var9Lifetime4;
                  dupTemp$10 = field_I[var6][var2];
                  dupTemp$10.field_q = dupTemp$10.field_q - field_I[var6][var2].field_q / var9Lifetime4;
                }
              }
              var6 = var6 + var4;
              var5++;
            }
          }
        }
    }

    final static void l() {
        int var2 = 0;
        int var3 = 0;
        int var0;
        int var1;
        int var4;
        int var5;
        if (wj.field_j < 2) {
          return;
        }
        var0 = ne.a(false);
        var1 = 0;
        for (var2 = 31; var2 >= 0; var2--) {
          for (var3 = field_t - 1; var3 >= 0; var3--) {
            if (field_I[var2][var3] != null &&
              field_I[var2][var3].field_U >= 0) {
              var4 = 0;
              var5 = field_I[var2][var3].field_U;
              if (var5 == 0) {
                var4 = 100 * var0;
              }
              if (var5 == 1) {
                var4 = 250 * var0;
              }
              if (var5 == 2) {
                var4 = 500 * var0;
              }
              if (var5 == 3) {
                var4 = 750 * var0;
              }
              if (var5 == 4) {
                var4 = 2500 * var0;
              }
              if (var5 == 5) {
                var4 = 1000 * var0;
              }
              var1 = var1 + var4;
            }
          }
        }
        System.out.println(field_X + var1 * 2);
    }

    private final static void b(int param0) {
        int incrementValue$0 = 0;
        je stackIn_49_0 = null;
        boolean stackIn_50_1 = false;
        int var1;
        ql var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var1 = (int)(Math.random() * 32.0);
        var2 = fd.a(cm.field_o, -1, field_u);
        for (var3 = 1; var3 < 31; var3++) {
          for (var4 = 0; var4 < 24; var4++) {
            L27: {
              var5 = var4 + param0;
              field_I[var3][var5].h();
              if (field_u != field_N[cm.field_o]) {
                var6 = 1;
                if (Math.random() * 500.0 < (double)var2.field_d) {
                  var6 = 0;
                }
                if (var2.field_n &&
                  Math.random() * 32.0 / 3.0 + 5.0 > (double)(Math.abs(var3 - var1) + Math.abs(var4 - 4) * 2)) {
                  var6 = 0;
                }
                if (var6 != 0) {
                  if (!(Math.random() * 500.0 / 2.0 < (double)var2.field_j)) {
                    if (Math.random() * 500.0 / 2.0 < (double)var2.field_l) {
                      field_I[var3][var5].field_v = true;
                      field_I[var3][var5].field_E = false;
                    }
                  } else {
                    field_I[var3][var5].field_E = true;
                    field_I[var3][var5].field_v = false;
                    field_I[var3][var5].field_q = -200;
                  }
                  if ((!(field_u <= 0) ||
                    !(var5 <= 5))) {
                    if (Math.random() * 500.0 / 2.0 < (double)var2.field_e) {
                      field_I[var3][var5].field_b = true;
                    }
                    for (var7 = 0; var7 < 6; var7++) {
                      if (var2.field_o[var7] != 0 &&
                        (double)Math.abs(var2.field_o[var7]) >= Math.random() * 500.0) {
                        field_I[var3][var5].field_U = var7;
                        stackIn_49_0 = field_I[var3][var5];
                        stackIn_50_1 = !(var2.field_o[var7] >= 0);
                        stackIn_49_0.field_b = stackIn_50_1;
                        field_I[var3][var5].field_a = true;
                      }
                    }
                  }
                  break L27;
                }
                field_I[var3][var5].field_a = false;
                if (!var2.field_k) {
                  if (var2.field_i) {
                    field_O.a(var4 - field_t / 4, 24, var3, var5, true);
                  }
                } else {
                  field_O.h(var3, 4, var5);
                }
                if (!var2.field_f) {
                  if (var2.field_b) {
                    field_O.a(24, -4, var5, var3, var4 - field_t / 4);
                  }
                } else {
                  field_O.c(var5, var3, (byte) -48);
                }
                if (var2.field_a) {
                  field_O.a(24, 6, var5, (byte) -110, var3);
                }
              } else {
                field_I[var3][var5].field_a = false;
                if (field_H > var5) {
                  field_H = var5;
                }
                field_O.a(false, var3, 1, var5);
              }
            }
          }
        }
        for (var3 = 1; var3 < 31; var3++) {
          for (var4 = 0; var4 < 24; var4++) {
            var5 = var4 + param0;
            if (field_I[var3][var5].field_U == 5) {
              L24: {
                field_I[var3][var5].field_E = false;
                field_I[var3][var5].field_v = true;
                if (var3 > 1) {
                  if (field_I[var3 - 1][var5].field_a) {
                    field_I[var3 - 1][var5].field_v = true;
                    field_I[var3 - 1][var5].field_E = false;
                    if (var3 >= 30) {
                      if ((!(var5 <= 1)) &&
                        (!(!field_I[var3][var5 - 1].field_a))) {
                        field_I[var3][var5 - 1].field_v = true;
                        field_I[var3][var5 - 1].field_E = false;
                      }
                      break L24;
                    }
                    if (!field_I[var3 + 1][var5].field_a) {
                      if ((!(var5 <= 1)) &&
                        (!(!field_I[var3][var5 - 1].field_a))) {
                        field_I[var3][var5 - 1].field_v = true;
                        field_I[var3][var5 - 1].field_E = false;
                      }
                      break L24;
                    }
                    field_I[var3 + 1][var5].field_v = true;
                    field_I[var3 + 1][var5].field_E = false;
                  } else {
                    if (var3 >= 30) {
                      if ((!(var5 <= 1)) &&
                        (!(!field_I[var3][var5 - 1].field_a))) {
                        field_I[var3][var5 - 1].field_v = true;
                        field_I[var3][var5 - 1].field_E = false;
                      }
                      break L24;
                    }
                    if (!field_I[var3 + 1][var5].field_a) {
                      if ((!(var5 <= 1)) &&
                        (!(!field_I[var3][var5 - 1].field_a))) {
                        field_I[var3][var5 - 1].field_v = true;
                        field_I[var3][var5 - 1].field_E = false;
                      }
                      break L24;
                    }
                    field_I[var3 + 1][var5].field_v = true;
                    field_I[var3 + 1][var5].field_E = false;
                  }
                } else {
                  if (var3 >= 30) {
                    if ((!(var5 <= 1)) &&
                      (!(!field_I[var3][var5 - 1].field_a))) {
                      field_I[var3][var5 - 1].field_v = true;
                      field_I[var3][var5 - 1].field_E = false;
                    }
                    break L24;
                  }
                  if (!field_I[var3 + 1][var5].field_a) {
                    if ((!(var5 <= 1)) &&
                      (!(!field_I[var3][var5 - 1].field_a))) {
                      field_I[var3][var5 - 1].field_v = true;
                      field_I[var3][var5 - 1].field_E = false;
                    }
                    break L24;
                  }
                  field_I[var3 + 1][var5].field_v = true;
                  field_I[var3 + 1][var5].field_E = false;
                }
                if (var5 > 1 &&
                  field_I[var3][var5 - 1].field_a) {
                  field_I[var3][var5 - 1].field_v = true;
                  field_I[var3][var5 - 1].field_E = false;
                }
              }
              if (var4 < 22 &&
                field_I[var3][var5 + 1].field_a) {
                field_I[var3][var5 + 1].field_v = true;
                field_I[var3][var5 + 1].field_E = false;
              }
            }
          }
        }
        var3 = 10;
        var4 = 0;
        L3: while (true) {
          if (var4 <= var3) {
            var5 = var4 / 2;
            if ((var4 & 1) != 0) {
              var5++;
            } else {
              var5 = var5 * -1;
            }
            var6 = 16 + var5;
            for (var7 = 0; var7 < 23; var7++) {
              var8 = var7 + param0;
              if (var8 < field_I[var6].length) {
                if (field_I[var6][var8].field_U >= 0 &&
                  field_I[var6][var8].field_U < 3 &&
                  Math.random() < 0.4) {
                  var9 = ll.a((byte) -73, 7) + 5;
                  var10 = 0;
                  do {
                    incrementValue$0 = var9;
                    var9--;
                    if (incrementValue$0 < 0) {
                      break L3;
                    }
                    var11 = ll.a((byte) -73, 3) - 1;
                    if (var10 != 0 &&
                      var11 == 0) {
                      if (var6 > 1 &&
                        Math.random() < 0.5) {
                        var11 = -1;
                      }
                      if (var6 < 30 &&
                        Math.random() < 0.25) {
                        var11 = 1;
                      }
                    }
                    if (var11 < 0 &&
                      var6 > 1) {
                      field_I[var6 - 1][var8 + 1].field_U = field_I[var6][var8].field_U;
                      field_I[var6 - 1][var8 + 1].field_a = true;
                      var6--;
                      var10 = 0;
                    } else if (var11 > 0 &&
                      var6 < 30) {
                      field_I[var6 + 1][var8 + 1].field_U = field_I[var6][var8].field_U;
                      field_I[var6 + 1][var8 + 1].field_a = true;
                      var6++;
                      var10 = 0;
                    } else {
                      if (var10 == 0) {
                        field_I[var6][var8 + 1].field_U = field_I[var6][var8].field_U;
                        field_I[var6][var8 + 1].field_a = true;
                        var10 = 1;
                      }
                    }
                    var8++;
                  } while (var8 < field_I[var6].length - 1);
                  break L3;
                }
                continue;
              }
              break;
            }
            var4++;
            continue;
          }
          break;
        }
        var4 = 0;
        for (var5 = 0; var5 < 24; var5++) {
          var6 = var5 + param0;
          field_I[var4][var6].h();
          field_I[var4][var6].field_b = true;
        }
        var4 = 31;
        for (var5 = 0; var5 < 24; var5++) {
          var6 = var5 + param0;
          field_I[var4][var6].h();
          field_I[var4][var6].field_b = true;
        }
        for (var4 = 0; var4 < 32; var4++) {
          var5 = var4 - 16;
          if (var5 < 0) {
            var5 = -var5;
          }
          for (var6 = 0; var6 < 24; var6++) {
            var7 = var6 + param0;
            if (var7 <= var5 / 2 + 1) {
              if (var7 >= var5 / 2 &&
                var5 != 0) {
                field_I[var4][var7].field_b = true;
                if (cm.field_o == 1) {
                  field_I[var4][var7].field_v = true;
                }
              } else {
                field_I[var4][var7].field_b = false;
              }
              field_I[var4][var7].field_a = true;
              field_I[var4][var7].field_U = -1;
            }
          }
        }
        return;
    }

    final static boolean d(int param0, int param1, int param2, int param3) {
        return field_O.i(98, (param0 << 2) + param2, (param1 << 2) + param3);
    }

    public static void c() {
        field_N = null;
        field_h = (int[][]) null;
        field_d = (ea[][]) null;
        field_P = (ea[][]) null;
        field_R = (ea[][]) null;
        field_p = (ea[][]) null;
        field_k = null;
        field_y = null;
        field_n = null;
        field_G = null;
        field_L = null;
        field_c = null;
        field_C = null;
        field_g = null;
        field_z = (ea[][]) null;
        field_w = null;
        field_B = null;
        field_x = (ea[][]) null;
        field_j = (ea[][]) null;
        field_I = (je[][]) null;
        field_O = null;
        field_K = null;
    }

    final static void d() {
        je dupTemp$0 = null;
        int var7 = 0;
        int stackIn_185_0 = 0;
        int var0;
        int var1;
        int var2;
        ea var2_ref_ea;
        int var3_int;
        je var3;
        int var4;
        je var4_ref_je;
        int var5;
        je var5_ref_je;
        int var6;
        int var8;
        int var9;
        int var0Lifetime1;
        int var1Lifetime1;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var4Lifetime2Lifetime1;
        int var5Lifetime2Lifetime1;
        field_m = field_m + 1;
        field_l = field_l + 0.1;
        if (gj.a(18740, 0) &&
          cm.field_o == 0 &&
          a.field_c >= (field_F ^ 238298623) &&
          !field_J &&
          ke.field_V &&
          hf.field_t > 120 &&
          field_u < 20) {
          field_D = (hf.field_t + 24) * 32;
          field_J = true;
          me.a(cm.field_o, false);
        }
        if (field_J &&
          (field_m & 1) == 0) {
          var0 = (field_D + 20) / 32;
          if (var0 > 9 &&
            !il.e(-31391)) {
            field_D = field_D - 1;
          }
          if (hf.field_t > var0) {
            rj.a((byte) -38, 14);
          }
          var1 = 0;
          for (var2 = 1; var2 <= 30; var2++) {
            if (field_I[var2][var0].field_a ||
              field_I[var2][var0].field_b) {
              field_I[var2][var0].field_a = false;
              field_I[var2][var0].field_b = false;
              field_I[var2][var0].field_S = false;
              field_I[var2][var0].field_U = -1;
              nd.field_d.a((var0 - 1) * 32, var2 * 32, false, var0 * 32, var2 * 32);
              lj.field_r = lj.field_r + 10;
              rg.field_sb = rg.field_sb - 10;
              var1 = 1;
            }
          }
          if (var1 != 0) {
            ne.a(21, 30);
          }
        }
        var0Lifetime1 = db.field_d / 32 - field_W;
        var1Lifetime1 = (640 + db.field_d) / 32 + field_M;
        if (var0Lifetime1 < 1) {
          var0Lifetime1 = 1;
        }
        if (var1Lifetime1 > field_t - 2) {
          var1Lifetime1 = field_t - 2;
        }
        if (var0Lifetime1 < 24) {
          for (var2Lifetime1 = 0; var2Lifetime1 < 32; var2Lifetime1++) {
            var3_int = var2Lifetime1 - 16;
            if (var3_int < 0) {
              var3_int = -var3_int;
            }
            var4 = var3_int / 2 + 1;
            for (var5 = 0; var5 < 24; var5++) {
              var6 = var5;
              if (var6 <= var4) {
                if (var6 >= var3_int / 2 &&
                  var3_int != 0) {
                  field_I[var2Lifetime1][var6].field_b = true;
                  if (cm.field_o == 1) {
                    field_I[var2Lifetime1][var6].field_v = true;
                  }
                } else {
                  field_I[var2Lifetime1][var6].field_b = false;
                }
                field_I[var2Lifetime1][var6].field_a = true;
                field_I[var2Lifetime1][var6].field_U = -1;
                field_I[var2Lifetime1][var6].field_S = false;
                field_I[var2Lifetime1][var6].field_r = 0;
                if (var3_int == 0) {
                  field_I[var2Lifetime1][var6].field_a = false;
                  field_I[var2Lifetime1][var6].field_E = false;
                  field_I[var2Lifetime1][var6].field_b = false;
                  field_I[var2Lifetime1][var6].field_v = false;
                }
              }
            }
          }
        }
        if (field_T == 0) {
          var2_ref_ea = je.e();
          var3_intLifetime1 = var2_ref_ea.field_x / 32;
          var4Lifetime1 = var2_ref_ea.field_A / 32;
          for (var5Lifetime1 = field_o; var5Lifetime1 < field_o + var3_intLifetime1; var5Lifetime1++) {
            for (var6Lifetime1 = field_f; var6Lifetime1 < field_f + var4Lifetime1; var6Lifetime1++) {
              if (var5Lifetime1 == ca.field_k &&
                var6Lifetime1 == hf.field_t) {
                fn.a(22, 233, 3);
              }
            }
          }
        }
        je.h(var0Lifetime1, var1Lifetime1);
        je.a(var0Lifetime1, var1Lifetime1);
        for (var2Lifetime2 = var0Lifetime1; var2Lifetime2 <= var1Lifetime1; var2Lifetime2++) {
          if (var2Lifetime2 < hf.field_t + 16) {
            for (var3_intLifetime2 = 1; var3_intLifetime2 <= 30; var3_intLifetime2++) {
              if (!field_I[var3_intLifetime2][var2Lifetime2].field_a) {
                if (field_I[var3_intLifetime2][var2Lifetime2].field_S) {
                  field_I[var3_intLifetime2][var2Lifetime2].field_S = false;
                }
                if (field_I[var3_intLifetime2][var2Lifetime2].field_U >= 0) {
                  uf.field_p[jf.b((byte) 63)] = new gf(var3_intLifetime2, var2Lifetime2, field_I[var3_intLifetime2][var2Lifetime2].field_U);
                  field_I[var3_intLifetime2][var2Lifetime2].field_U = -1;
                }
              }
              field_I[var3_intLifetime2][var2Lifetime2].field_s = -1;
              if (!je.c(var3_intLifetime2, var2Lifetime2, 1, 1)) {
                field_I[var3_intLifetime2][var2Lifetime2].field_s = -2;
              }
              if (field_I[var3_intLifetime2][var2Lifetime2].field_a) {
                field_I[var3_intLifetime2][var2Lifetime2].field_s = -3;
              }
              if (!oe.field_b &&
                field_I[var3_intLifetime2][var2Lifetime2].field_U == 3) {
                field_O.b(7, 0, var2Lifetime2, var3_intLifetime2);
              } else {
                if (field_I[var3_intLifetime2][var2Lifetime2].field_U == 5) {
                  for (var4Lifetime2 = var3_intLifetime2 - 1; var4Lifetime2 <= var3_intLifetime2 + 1; var4Lifetime2++) {
                    for (var5Lifetime2 = var2Lifetime2 - 1; var5Lifetime2 <= var2Lifetime2 + 1; var5Lifetime2++) {
                      field_I[var4Lifetime2][var5Lifetime2].field_A = true;
                    }
                  }
                }
              }
              if (!kd.field_i) {
                if (field_I[var3_intLifetime2][var2Lifetime2].field_i <= 0) {
                  field_I[var3_intLifetime2][var2Lifetime2].field_i = 0;
                } else {
                  dupTemp$0 = field_I[var3_intLifetime2][var2Lifetime2];
                  dupTemp$0.field_i = dupTemp$0.field_i - 1;
                  if (sc.field_b &&
                    field_I[var3_intLifetime2][var2Lifetime2].field_i > 160) {
                    var4Lifetime2Lifetime1 = ca.field_k - var3_intLifetime2;
                    var5Lifetime2Lifetime1 = hf.field_t - var2Lifetime2;
                    if (var4Lifetime2Lifetime1 * var4Lifetime2Lifetime1 + var5Lifetime2Lifetime1 * var5Lifetime2Lifetime1 < 40) {
                      if (!field_I[var3_intLifetime2][var2Lifetime2].field_a) {
                        if (!ni.a(0, 11764) &&
                          field_O.i(-62, var3_intLifetime2 << 2, var2Lifetime2 << 2) &&
                          field_O.j(-126, var2Lifetime2 << 2, var3_intLifetime2 << 2) > 50) {
                          ag.a(true, 0, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                        }
                        if (cm.field_o == 1) {
                          if (!ni.a(24, 11764)) {
                            if (field_I[var3_intLifetime2][var2Lifetime2].field_A) {
                              if (je.c(var3_intLifetime2, var2Lifetime2, 1, 1)) {
                                ag.a(true, 24, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                                if (!ni.a(30, 11764) &&
                                  field_O.f(var2Lifetime2, 2, var3_intLifetime2)) {
                                  ag.a(true, 30, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                                }
                              } else {
                                if (!ni.a(30, 11764) &&
                                  field_O.f(var2Lifetime2, 2, var3_intLifetime2)) {
                                  ag.a(true, 30, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                                }
                              }
                            } else {
                              if (!ni.a(30, 11764) &&
                                field_O.f(var2Lifetime2, 2, var3_intLifetime2)) {
                                ag.a(true, 30, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                              }
                            }
                          } else {
                            if (!ni.a(30, 11764) &&
                              field_O.f(var2Lifetime2, 2, var3_intLifetime2)) {
                              ag.a(true, 30, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                            }
                          }
                          if (!ni.a(34, 11764) &&
                            field_O.b(var3_intLifetime2, var2Lifetime2, (byte) 76)) {
                            ag.a(true, 34, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                          }
                        }
                      }
                      if (field_I[var3_intLifetime2][var2Lifetime2].field_U >= 0) {
                        if (!ni.a(5, 11764)) {
                          if (field_I[var3_intLifetime2][var2Lifetime2].field_b) {
                            ag.a(true, 5, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                            if (field_I[var3_intLifetime2][var2Lifetime2].field_U < 3 &&
                              ni.a(8, 11764)) {
                              ag.a(true, 3, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                            }
                          } else {
                            if (field_I[var3_intLifetime2][var2Lifetime2].field_U < 3 &&
                              ni.a(8, 11764)) {
                              ag.a(true, 3, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                            }
                          }
                        } else {
                          if (field_I[var3_intLifetime2][var2Lifetime2].field_U < 3 &&
                            ni.a(8, 11764)) {
                            ag.a(true, 3, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                          }
                        }
                        if (field_I[var3_intLifetime2][var2Lifetime2].field_U == 3) {
                          ag.a(true, 18, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                        }
                        if (field_I[var3_intLifetime2][var2Lifetime2].field_U == 4) {
                          ag.a(true, 20, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                        }
                        if (field_I[var3_intLifetime2][var2Lifetime2].field_U == 5) {
                          ag.a(true, 19, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                          if (field_I[var3_intLifetime2][var2Lifetime2].field_a &&
                            field_I[var3_intLifetime2][var2Lifetime2].field_E) {
                            ag.a(true, 27, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                          }
                        } else {
                          if (field_I[var3_intLifetime2][var2Lifetime2].field_a &&
                            field_I[var3_intLifetime2][var2Lifetime2].field_E) {
                            ag.a(true, 27, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                          }
                        }
                      } else {
                        if (field_I[var3_intLifetime2][var2Lifetime2].field_a &&
                          field_I[var3_intLifetime2][var2Lifetime2].field_E) {
                          ag.a(true, 27, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                        }
                      }
                      if (field_I[var3_intLifetime2][var2Lifetime2].field_a &&
                        field_I[var3_intLifetime2][var2Lifetime2].field_v &&
                        var2Lifetime2 > 12) {
                        ag.a(true, 33, var2Lifetime2 * 32, var3_intLifetime2 * 32);
                      }
                    }
                  }
                }
              }
              var4_ref_je = field_I[var3_intLifetime2][var2Lifetime2];
              if (var4_ref_je.field_i > 128) {
                var4_ref_je.field_V = true;
              }
              L58: {
                if (var4_ref_je.field_e) {
                  if (!var4_ref_je.field_a &&
                    !je.c(var3_intLifetime2, var2Lifetime2, 1, 1)) {
                    if (!(var4_ref_je.field_i >= 80)) {
                      var4_ref_je.field_i = 80;
                    }
                    break L58;
                  }
                  var4_ref_je.field_e = false;
                }
              }
              var5_ref_je = field_I[var3_intLifetime2][var2Lifetime2 - 1];
              je.a(var3_intLifetime2, var2Lifetime2, var4_ref_je, var5_ref_je);
              if (var2Lifetime2 < 6) {
                var4_ref_je.field_i = 255;
              }
              je.a(var3_intLifetime2, var2Lifetime2, var4_ref_je);
              je.b(var3_intLifetime2, var2Lifetime2, var4_ref_je);
            }
          }
        }
        je.d(var0Lifetime1, var1Lifetime1);
        je.f(var0Lifetime1, var1Lifetime1);
        for (var2Lifetime3 = var0Lifetime1; var2Lifetime3 <= var1Lifetime1; var2Lifetime3++) {
          if (var2Lifetime3 < hf.field_t + 16) {
            for (var3_intLifetime3 = 1; var3_intLifetime3 <= 30; var3_intLifetime3++) {
            }
          }
        }
        if (field_u >= field_N[cm.field_o] &&
          !field_J) {
          field_O.a(true, field_I);
        }
        field_O.a(var1Lifetime1, true, field_I, var0Lifetime1);
        field_O.a(var1Lifetime1, -29, var0Lifetime1, field_I);
        field_W = 0;
        field_M = 0;
        var4Lifetime3 = 0;
        stackIn_185_0 = (cm.field_o != 0) ? 0 : 1;
        var5Lifetime3 = stackIn_185_0;
        for (var6Lifetime2 = 0; var6Lifetime2 < field_t; var6Lifetime2++) {
          var2Lifetime4 = 0;
          for (var7 = 0; var7 < 32; var7++) {
            var3 = mh.field_e[var7][var6Lifetime2];
            if (!var3.field_V) {
              if (je.e(var7, var6Lifetime2, 1, 1) > 0) {
                var2Lifetime4++;
                if (field_H > var6Lifetime2 - 2) {
                  field_H = field_H - 1;
                }
              }
            } else {
              if (var6Lifetime2 > var4Lifetime3) {
                var4Lifetime3 = var6Lifetime2;
              }
              var8 = 0;
              if (var3.field_a) {
                var8 = 11184810;
              }
              if (var3.field_b) {
                var8 = 6710886;
              }
              if (var5Lifetime3 != 0 &&
                je.d(var7, var6Lifetime2, 1, 1)) {
                var8 = 65280;
              }
              if (je.c(var7, var6Lifetime2, 1, 1)) {
                var8 = 255;
              }
              var9 = je.e(var7, var6Lifetime2, 1, 1);
              if (var9 > 0) {
                var8 = 16711680;
                var2Lifetime4++;
                if (field_H > var6Lifetime2 - 2) {
                  field_H = field_H - 1;
                }
              }
              if (var9 > 4) {
                var8 = 16776960;
              }
              if (var9 > 8) {
                var8 = 16777215;
              }
              if (var3.field_U > -1) {
                var8 = 16777215;
              }
              eh.a(var7, var6Lifetime2 + 32, var8);
            }
          }
          if (var2Lifetime4 >= 16 &&
            field_t > var6Lifetime2 + 4 &&
            var6Lifetime2 > hf.field_t + 14) {
            field_t = field_t - 1;
          }
        }
    }

    private final static void c(int param0) {
        int var1;
        int var2;
        ql var3;
        int var4;
        int var5;
        int var1Lifetime1;
        int var2Lifetime1;
        var1 = (int)(Math.random() * 27.0) + 2;
        var2 = (int)(Math.random() * 19.0) + param0 + 2;
        field_I[var1][var2].field_a = false;
        field_I[var1][var2].field_b = false;
        if (var1 > 1 &&
          field_I[var1 - 1][var2].field_b) {
          field_I[var1 - 1][var2].field_b = false;
        }
        if (var1 < 31 &&
          field_I[var1 + 1][var2].field_b) {
          field_I[var1 + 1][var2].field_b = false;
        }
        var3 = fd.a(cm.field_o, -1, field_u);
        var4 = 9;
        if (var3.field_h) {
          var4 = 19;
          field_O.h(var1, 4, var2);
        }
        uf.field_p[jf.b((byte) 64)] = new gf(var1, var2, var4);
        uf.field_p[jf.b((byte) 62)] = new gf(var1, var2, (int)(12.0 + Math.random() * 3.0));
        if (var3.field_g) {
          var1Lifetime1 = (int)(Math.random() * 27.0) + 2;
          var2Lifetime1 = (int)(Math.random() * 19.0) + param0 + 2;
          var5 = jf.b((byte) 107);
          if (uf.field_p[var5] == null) {
            uf.field_p[var5] = new gf(var1Lifetime1, var2Lifetime1, 21);
          }
          field_I[var1Lifetime1][var2Lifetime1].field_a = false;
          field_I[var1Lifetime1][var2Lifetime1].field_b = false;
          field_I[var1Lifetime1][var2Lifetime1].field_E = false;
          field_I[var1Lifetime1][var2Lifetime1].field_v = false;
          if (var1Lifetime1 > 1) {
            field_I[var1Lifetime1 - 1][var2Lifetime1].field_b = false;
            field_I[var1Lifetime1 - 1][var2Lifetime1].field_a = false;
            field_I[var1Lifetime1 - 1][var2Lifetime1].field_E = false;
            field_I[var1Lifetime1 - 1][var2Lifetime1].field_v = false;
          }
          if (var1Lifetime1 < 31) {
            field_I[var1Lifetime1 + 1][var2Lifetime1].field_b = false;
            field_I[var1Lifetime1 + 1][var2Lifetime1].field_a = false;
            field_I[var1Lifetime1 + 1][var2Lifetime1].field_E = false;
            field_I[var1Lifetime1 + 1][var2Lifetime1].field_v = false;
          }
          field_O.h(var1Lifetime1, 4, var2Lifetime1);
        }
    }

    final boolean g() {
        if (this.field_a) {
          return true;
        }
        if (!this.field_b) {
          return false;
        }
        return true;
    }

    private je() {
        this.h();
    }

    static {
        field_X = "TVie: ";
        field_j = new ea[2][];
        field_z = new ea[4][];
        field_K = new int[]{0, 1, 2, 0, 2, 1, 0, 1, 0, 2};
        field_x = new ea[2][];
        field_p = new ea[2][];
        field_N = new int[]{20, 31};
        field_d = new ea[2][];
        field_t = 0;
        field_P = new ea[2][];
        field_R = new ea[2][];
        field_h = new int[][]{new int[]{8421504, 13744249, 10976325, 8011818, 4340751, 7170907}, new int[]{16777215, 15202815, 12119039, 7196662, 11849706, 6330319}};
    }
}
