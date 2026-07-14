/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int[] field_d;
    int[] field_j;
    short[] field_s;
    short[] field_h;
    private int field_w;
    short[] field_q;
    int[] field_I;
    int[] field_v;
    int field_E;
    jt[] field_m;
    ava[] field_B;
    int[] field_c;
    short[] field_K;
    int[] field_D;
    byte field_k;
    rga[] field_e;
    byte[] field_z;
    int field_L;
    byte[] field_G;
    byte[] field_u;
    short[] field_y;
    int[] field_p;
    int[] field_l;
    byte[] field_n;
    short[] field_J;
    int field_F;
    byte[] field_g;
    byte[] field_i;
    int[] field_x;
    int field_o;
    byte[] field_C;
    short[] field_t;
    static su field_H;
    int[] field_b;
    int[] field_f;
    short[] field_A;
    short[] field_a;
    short[] field_r;

    final int[][] c(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[][] var16 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 83 % ((param0 - 22) / 49);
        var15 = new int[256];
        var13 = var15;
        var11 = var13;
        var9 = var11;
        var3 = var9;
        var4 = 0;
        var5_int = 0;
        L0: while (true) {
          if (((oc) this).field_o <= var5_int) {
            var16 = new int[var4 - -1][];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var5 = var10;
            var6 = 0;
            L1: while (true) {
              if (var4 < var6) {
                var6 = 0;
                L2: while (true) {
                  if (((oc) this).field_o <= var6) {
                    return var5;
                  } else {
                    var7 = ((oc) this).field_D[var6];
                    if (0 <= var7) {
                      var16 = var14;
                      var3[var7] = var3[var7] + 1;
                      var16[var7][var3[var7]] = var6;
                      var6++;
                      continue L2;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                var5[var6] = new int[var15[var6]];
                var15[var6] = 0;
                var6++;
                continue L1;
              }
            }
          } else {
            var6 = ((oc) this).field_D[var5_int];
            if (-1 >= (var6 ^ -1)) {
              var3[var6] = var3[var6] + 1;
              if (var4 < var6) {
                var4 = var6;
                var5_int++;
                continue L0;
              } else {
                var5_int++;
                continue L0;
              }
            } else {
              var5_int++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_H = null;
        if (param0 != -71) {
            oc.a((byte) 123);
        }
    }

    final int[][] b(byte param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[][] var16 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var15 = new int[256];
        var13 = var15;
        var11 = var13;
        var9 = var11;
        var8 = var9;
        var2 = var8;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (((oc) this).field_m.length <= var4_int) {
            var16 = new int[1 + var3][];
            var14 = var16;
            var12 = var14;
            var10 = var12;
            var4 = var10;
            var5 = 0;
            L1: while (true) {
              if (var3 < var5) {
                L2: {
                  if (param0 < -76) {
                    break L2;
                  } else {
                    int[][] discarded$1 = ((oc) this).a(false, (byte) -5);
                    break L2;
                  }
                }
                var5 = 0;
                L3: while (true) {
                  if (((oc) this).field_m.length <= var5) {
                    return var4;
                  } else {
                    var6 = ((oc) this).field_m[var5].field_b;
                    if ((var6 ^ -1) <= -1) {
                      var2[var6] = var2[var6] + 1;
                      var16[var6][var2[var6]] = var5;
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                var4[var5] = new int[var15[var5]];
                var15[var5] = 0;
                var5++;
                continue L1;
              }
            }
          } else {
            var5 = ((oc) this).field_m[var4_int].field_b;
            if (0 <= var5) {
              var8[var5] = var8[var5] + 1;
              if (var3 < var5) {
                var3 = var5;
                var4_int++;
                continue L0;
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    private final int a(int param0, short param1, oc param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param3 == 1) {
            break L0;
          } else {
            ((oc) this).field_n = null;
            break L0;
          }
        }
        var5 = param2.field_b[param0];
        var6 = param2.field_I[param0];
        var7 = param2.field_p[param0];
        var8 = 0;
        L1: while (true) {
          if (((oc) this).field_E <= var8) {
            L2: {
              ((oc) this).field_b[((oc) this).field_E] = var5;
              ((oc) this).field_I[((oc) this).field_E] = var6;
              ((oc) this).field_p[((oc) this).field_E] = var7;
              ((oc) this).field_y[((oc) this).field_E] = (short)param1;
              stackOut_12_0 = ((oc) this).field_l;
              stackOut_12_1 = ((oc) this).field_E;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              if (null != param2.field_l) {
                stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = param2.field_l[param0];
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                break L2;
              } else {
                stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = -1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                break L2;
              }
            }
            stackIn_15_0[stackIn_15_1] = stackIn_15_2;
            ((oc) this).field_E = ((oc) this).field_E + 1;
            return ((oc) this).field_E;
          } else {
            if (var5 == ((oc) this).field_b[var8]) {
              if (((oc) this).field_I[var8] == var6) {
                if (((oc) this).field_p[var8] == var7) {
                  ((oc) this).field_y[var8] = (short)fh.a((int) ((oc) this).field_y[var8], (int) param1);
                  return var8;
                } else {
                  var8++;
                  continue L1;
                }
              } else {
                var8++;
                continue L1;
              }
            } else {
              var8++;
              continue L1;
            }
          }
        }
    }

    private final void a(byte[] param0, int param1) {
        uia var4 = null;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        uia var65 = null;
        uia var66 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var64 = TombRacer.field_G ? 1 : 0;
          var65 = new uia(param0);
          var66 = var65;
          var4 = new uia(param0);
          var5 = new uia(param0);
          var6 = new uia(param0);
          var7 = new uia(param0);
          var8 = new uia(param0);
          var9 = new uia(param0);
          var66.field_h = param0.length - 23;
          ((oc) this).field_E = var66.d(123);
          ((oc) this).field_o = var66.d(123);
          ((oc) this).field_F = var66.h(255);
          var10 = var66.h(255);
          if ((var10 & 1) != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = stackIn_3_0;
          if ((var10 & 2) != 2) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var12 = stackIn_6_0;
          if ((var10 & 4 ^ -1) != -5) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var13 = stackIn_9_0;
          if (8 != (var10 & 8)) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var14 = stackIn_12_0;
          if (var14 == 0) {
            break L4;
          } else {
            var66.field_h = var66.field_h - 7;
            ((oc) this).field_w = var66.h(255);
            var66.field_h = var66.field_h + 6;
            break L4;
          }
        }
        L5: {
          var15 = var66.h(param1 ^ 255);
          var16 = var66.h(255);
          var17 = var66.h(255);
          var18 = var66.h(255);
          var19 = var66.h(255);
          var20 = var66.d(param1 + 124);
          var21 = var66.d(127);
          var22 = var66.d(param1 + 127);
          var23 = var66.d(124);
          var24 = var66.d(param1 + 124);
          var25 = 0;
          var26 = 0;
          var27 = 0;
          if (0 < ((oc) this).field_F) {
            ((oc) this).field_u = new byte[((oc) this).field_F];
            var66.field_h = 0;
            var28 = 0;
            L6: while (true) {
              if (((oc) this).field_F <= var28) {
                break L5;
              } else {
                L7: {
                  ((oc) this).field_u[var28] = var65.c((byte) 52);
                  var29 = var65.c((byte) 52);
                  if (var29 > -2) {
                    break L7;
                  } else {
                    if (var29 > 3) {
                      break L7;
                    } else {
                      var26++;
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-1 == var29) {
                    var25++;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (var29 == 2) {
                  var27++;
                  var28++;
                  continue L6;
                } else {
                  var28++;
                  continue L6;
                }
              }
            }
          } else {
            break L5;
          }
        }
        L9: {
          var28 = ((oc) this).field_F;
          var29 = var28;
          var28 = var28 + ((oc) this).field_E;
          var30 = var28;
          if (var11 == 0) {
            break L9;
          } else {
            var28 = var28 + ((oc) this).field_o;
            break L9;
          }
        }
        L10: {
          var31 = var28;
          var28 = var28 + ((oc) this).field_o;
          var32 = var28;
          if (var15 != 255) {
            break L10;
          } else {
            var28 = var28 + ((oc) this).field_o;
            break L10;
          }
        }
        L11: {
          var33 = var28;
          if ((var17 ^ -1) == -2) {
            var28 = var28 + ((oc) this).field_o;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          var34 = var28;
          if (1 == var19) {
            var28 = var28 + ((oc) this).field_E;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var35 = var28;
          if (var16 != 1) {
            break L13;
          } else {
            var28 = var28 + ((oc) this).field_o;
            break L13;
          }
        }
        L14: {
          var36 = var28;
          var28 = var28 + var23;
          var37 = var28;
          if ((var18 ^ -1) == -2) {
            var28 = var28 + 2 * ((oc) this).field_o;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var38 = var28;
          var28 = var28 + var24;
          var39 = var28;
          var28 = var28 + ((oc) this).field_o * 2;
          var40 = var28;
          var28 = var28 + var20;
          var41 = var28;
          var28 = var28 + var21;
          var42 = var28;
          var28 = var28 + var22;
          var43 = var28;
          var28 = var28 + var25 * 6;
          var44 = var28;
          var28 = var28 + 6 * var26;
          var45 = 6;
          if (-15 != (((oc) this).field_w ^ -1)) {
            if ((((oc) this).field_w ^ -1) > -16) {
              break L15;
            } else {
              var45 = 9;
              break L15;
            }
          } else {
            var45 = 7;
            break L15;
          }
        }
        L16: {
          var46 = var28;
          var28 = var28 + var45 * var26;
          var47 = var28;
          var28 = var28 + var26;
          var48 = var28;
          var28 = var28 + var26;
          var49 = var28;
          var28 = var28 + (var27 * 2 + var26);
          ((oc) this).field_t = new short[((oc) this).field_o];
          var50 = var28;
          ((oc) this).field_p = new int[((oc) this).field_E];
          ((oc) this).field_a = new short[((oc) this).field_o];
          if (-2 != (var18 ^ -1)) {
            break L16;
          } else {
            if (0 >= ((oc) this).field_F) {
              break L16;
            } else {
              ((oc) this).field_g = new byte[((oc) this).field_o];
              break L16;
            }
          }
        }
        L17: {
          if (var16 != 1) {
            break L17;
          } else {
            ((oc) this).field_n = new byte[((oc) this).field_o];
            break L17;
          }
        }
        L18: {
          if (-1 <= (((oc) this).field_F ^ -1)) {
            break L18;
          } else {
            L19: {
              ((oc) this).field_K = new short[((oc) this).field_F];
              if (0 >= var26) {
                break L19;
              } else {
                ((oc) this).field_i = new byte[var26];
                ((oc) this).field_j = new int[var26];
                ((oc) this).field_x = new int[var26];
                ((oc) this).field_f = new int[var26];
                ((oc) this).field_z = new byte[var26];
                ((oc) this).field_d = new int[var26];
                break L19;
              }
            }
            L20: {
              ((oc) this).field_q = new short[((oc) this).field_F];
              if (0 < var27) {
                ((oc) this).field_c = new int[var27];
                ((oc) this).field_v = new int[var27];
                break L20;
              } else {
                break L20;
              }
            }
            ((oc) this).field_s = new short[((oc) this).field_F];
            break L18;
          }
        }
        L21: {
          if (var11 != 0) {
            ((oc) this).field_G = new byte[((oc) this).field_o];
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          if (255 != var15) {
            ((oc) this).field_k = (byte)var15;
            break L22;
          } else {
            ((oc) this).field_C = new byte[((oc) this).field_o];
            break L22;
          }
        }
        L23: {
          if (1 == var18) {
            ((oc) this).field_r = new short[((oc) this).field_o];
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          ((oc) this).field_A = new short[((oc) this).field_o];
          ((oc) this).field_I = new int[((oc) this).field_E];
          ((oc) this).field_J = new short[((oc) this).field_o];
          if ((var17 ^ -1) != -2) {
            break L24;
          } else {
            ((oc) this).field_D = new int[((oc) this).field_o];
            break L24;
          }
        }
        L25: {
          var66.field_h = var29;
          ((oc) this).field_b = new int[((oc) this).field_E];
          if (var19 == 1) {
            ((oc) this).field_l = new int[((oc) this).field_E];
            break L25;
          } else {
            break L25;
          }
        }
        var4.field_h = var40;
        var5.field_h = var41;
        var6.field_h = var42;
        var7.field_h = var34;
        var51 = 0;
        var52 = 0;
        var53 = 0;
        var54 = 0;
        L26: while (true) {
          if (((oc) this).field_E <= var54) {
            var66.field_h = var39;
            var4.field_h = var30;
            var5.field_h = var32;
            var6.field_h = var35;
            var7.field_h = var33;
            var8.field_h = var37;
            var9.field_h = var38;
            var54 = 0;
            L27: while (true) {
              if (var54 >= ((oc) this).field_o) {
                var66.field_h = var36;
                ((oc) this).field_L = -1;
                var4.field_h = var31;
                var54 = 0;
                var55 = 0;
                var56 = 0;
                var57 = 0;
                var58 = 0;
                L28: while (true) {
                  if (var58 >= ((oc) this).field_o) {
                    L29: {
                      var66.field_h = var43;
                      if (param1 == 0) {
                        break L29;
                      } else {
                        ((oc) this).field_e = null;
                        break L29;
                      }
                    }
                    ((oc) this).field_L = ((oc) this).field_L + 1;
                    var4.field_h = var44;
                    var5.field_h = var46;
                    var6.field_h = var47;
                    var7.field_h = var48;
                    var8.field_h = var49;
                    var58 = 0;
                    L30: while (true) {
                      if (var58 >= ((oc) this).field_F) {
                        L31: {
                          var66.field_h = var50;
                          if (var12 == 0) {
                            break L31;
                          } else {
                            L32: {
                              var58 = var66.h(255);
                              if (0 < var58) {
                                ((oc) this).field_B = new ava[var58];
                                var59 = 0;
                                L33: while (true) {
                                  if (var59 >= var58) {
                                    break L32;
                                  } else {
                                    L34: {
                                      var60 = var66.d(param1 + 121);
                                      var61 = var66.d(122);
                                      if (255 != var15) {
                                        var62 = (byte)var15;
                                        break L34;
                                      } else {
                                        var62 = ((oc) this).field_C[var61];
                                        break L34;
                                      }
                                    }
                                    ((oc) this).field_B[var59] = new ava(var60, (int) ((oc) this).field_a[var61], (int) ((oc) this).field_t[var61], (int) ((oc) this).field_J[var61], (byte) var62);
                                    var59++;
                                    continue L33;
                                  }
                                }
                              } else {
                                break L32;
                              }
                            }
                            var59 = var66.h(255);
                            if (-1 <= (var59 ^ -1)) {
                              break L31;
                            } else {
                              ((oc) this).field_e = new rga[var59];
                              var60 = 0;
                              L35: while (true) {
                                if (var60 >= var59) {
                                  break L31;
                                } else {
                                  var61 = var66.d(121);
                                  var62 = var66.d(123);
                                  ((oc) this).field_e[var60] = new rga(var61, var62);
                                  var60++;
                                  continue L35;
                                }
                              }
                            }
                          }
                        }
                        L36: {
                          if (var13 == 0) {
                            break L36;
                          } else {
                            var58 = var66.h(255);
                            if ((var58 ^ -1) < -1) {
                              ((oc) this).field_m = new jt[var58];
                              var59 = 0;
                              L37: while (true) {
                                if (var59 >= var58) {
                                  break L36;
                                } else {
                                  var60 = var66.d(124);
                                  var61 = var66.d(param1 ^ 123);
                                  var62 = var66.h(param1 + 255);
                                  var63 = var66.c((byte) 60);
                                  ((oc) this).field_m[var59] = new jt(var60, var61, var62, var63);
                                  var59++;
                                  continue L37;
                                }
                              }
                            } else {
                              break L36;
                            }
                          }
                        }
                        return;
                      } else {
                        L38: {
                          var59 = ((oc) this).field_u[var58] & 255;
                          if (var59 != 0) {
                            break L38;
                          } else {
                            ((oc) this).field_s[var58] = (short)var66.d(123);
                            ((oc) this).field_q[var58] = (short)var66.d(125);
                            ((oc) this).field_K[var58] = (short)var66.d(123);
                            break L38;
                          }
                        }
                        L39: {
                          if (-2 != (var59 ^ -1)) {
                            break L39;
                          } else {
                            L40: {
                              ((oc) this).field_s[var58] = (short)var4.d(126);
                              ((oc) this).field_q[var58] = (short)var4.d(123);
                              ((oc) this).field_K[var58] = (short)var4.d(param1 + 122);
                              if (15 > ((oc) this).field_w) {
                                L41: {
                                  ((oc) this).field_j[var58] = var5.d(param1 + 127);
                                  if (((oc) this).field_w < 14) {
                                    ((oc) this).field_f[var58] = var5.d(123);
                                    break L41;
                                  } else {
                                    ((oc) this).field_f[var58] = var5.a(-32768);
                                    break L41;
                                  }
                                }
                                ((oc) this).field_x[var58] = var5.d(kha.b(param1, 125));
                                break L40;
                              } else {
                                ((oc) this).field_j[var58] = var5.a(-32768);
                                ((oc) this).field_f[var58] = var5.a(-32768);
                                ((oc) this).field_x[var58] = var5.a(-32768);
                                break L40;
                              }
                            }
                            ((oc) this).field_i[var58] = var6.c((byte) 87);
                            ((oc) this).field_z[var58] = var7.c((byte) 96);
                            ((oc) this).field_d[var58] = var8.c((byte) 75);
                            break L39;
                          }
                        }
                        L42: {
                          if (var59 == 2) {
                            L43: {
                              ((oc) this).field_s[var58] = (short)var4.d(126);
                              ((oc) this).field_q[var58] = (short)var4.d(127);
                              ((oc) this).field_K[var58] = (short)var4.d(param1 + 123);
                              if (((oc) this).field_w >= 15) {
                                ((oc) this).field_j[var58] = var5.a(-32768);
                                ((oc) this).field_f[var58] = var5.a(-32768);
                                ((oc) this).field_x[var58] = var5.a(-32768);
                                break L43;
                              } else {
                                ((oc) this).field_j[var58] = var5.d(122);
                                if (-15 >= (((oc) this).field_w ^ -1)) {
                                  ((oc) this).field_f[var58] = var5.a(-32768);
                                  ((oc) this).field_x[var58] = var5.d(122);
                                  break L43;
                                } else {
                                  ((oc) this).field_f[var58] = var5.d(param1 + 126);
                                  ((oc) this).field_x[var58] = var5.d(122);
                                  break L43;
                                }
                              }
                            }
                            ((oc) this).field_i[var58] = var6.c((byte) 122);
                            ((oc) this).field_z[var58] = var7.c((byte) 119);
                            ((oc) this).field_d[var58] = var8.c((byte) 88);
                            ((oc) this).field_v[var58] = var8.c((byte) 82);
                            ((oc) this).field_c[var58] = var8.c((byte) 65);
                            break L42;
                          } else {
                            break L42;
                          }
                        }
                        if ((var59 ^ -1) == -4) {
                          L44: {
                            ((oc) this).field_s[var58] = (short)var4.d(125);
                            ((oc) this).field_q[var58] = (short)var4.d(param1 + 124);
                            ((oc) this).field_K[var58] = (short)var4.d(125);
                            if (-16 < (((oc) this).field_w ^ -1)) {
                              L45: {
                                ((oc) this).field_j[var58] = var5.d(123);
                                if ((((oc) this).field_w ^ -1) > -15) {
                                  ((oc) this).field_f[var58] = var5.d(123);
                                  break L45;
                                } else {
                                  ((oc) this).field_f[var58] = var5.a(-32768);
                                  break L45;
                                }
                              }
                              ((oc) this).field_x[var58] = var5.d(123);
                              break L44;
                            } else {
                              ((oc) this).field_j[var58] = var5.a(kha.b(param1, -32768));
                              ((oc) this).field_f[var58] = var5.a(kha.b(param1, -32768));
                              ((oc) this).field_x[var58] = var5.a(param1 + -32768);
                              break L44;
                            }
                          }
                          ((oc) this).field_i[var58] = var6.c((byte) 31);
                          ((oc) this).field_z[var58] = var7.c((byte) 70);
                          ((oc) this).field_d[var58] = var8.c((byte) 32);
                          var58++;
                          continue L30;
                        } else {
                          var58++;
                          continue L30;
                        }
                      }
                    }
                  } else {
                    L46: {
                      var59 = var4.h(255);
                      if (-2 != (var59 ^ -1)) {
                        break L46;
                      } else {
                        L47: {
                          var54 = (short)(var57 + var66.f((byte) -128));
                          var57 = var54;
                          var55 = (short)(var66.f((byte) -128) + var57);
                          var57 = var55;
                          var56 = (short)(var66.f((byte) -128) + var57);
                          var57 = var56;
                          ((oc) this).field_a[var58] = (short)var54;
                          ((oc) this).field_t[var58] = (short)var55;
                          ((oc) this).field_J[var58] = (short)var56;
                          if (var54 <= ((oc) this).field_L) {
                            break L47;
                          } else {
                            ((oc) this).field_L = var54;
                            break L47;
                          }
                        }
                        L48: {
                          if (((oc) this).field_L < var55) {
                            ((oc) this).field_L = var55;
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        if (((oc) this).field_L < var56) {
                          ((oc) this).field_L = var56;
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                    }
                    L49: {
                      if (2 == var59) {
                        var55 = var56;
                        var56 = (short)(var66.f((byte) -128) + var57);
                        ((oc) this).field_a[var58] = (short)var54;
                        var57 = var56;
                        ((oc) this).field_t[var58] = (short)var55;
                        ((oc) this).field_J[var58] = (short)var56;
                        if (((oc) this).field_L < var56) {
                          ((oc) this).field_L = var56;
                          break L49;
                        } else {
                          break L49;
                        }
                      } else {
                        break L49;
                      }
                    }
                    L50: {
                      if (var59 != 3) {
                        break L50;
                      } else {
                        var54 = var56;
                        var56 = (short)(var66.f((byte) -128) + var57);
                        ((oc) this).field_a[var58] = (short)var54;
                        var57 = var56;
                        ((oc) this).field_t[var58] = (short)var55;
                        ((oc) this).field_J[var58] = (short)var56;
                        if (var56 > ((oc) this).field_L) {
                          ((oc) this).field_L = var56;
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                    }
                    if (-5 == (var59 ^ -1)) {
                      var60 = var54;
                      var54 = var55;
                      var55 = var60;
                      var56 = (short)(var57 + var66.f((byte) -128));
                      var57 = var56;
                      ((oc) this).field_a[var58] = (short)var54;
                      ((oc) this).field_t[var58] = (short)var55;
                      ((oc) this).field_J[var58] = (short)var56;
                      if (((oc) this).field_L < var56) {
                        ((oc) this).field_L = var56;
                        var58++;
                        continue L28;
                      } else {
                        var58++;
                        continue L28;
                      }
                    } else {
                      var58++;
                      continue L28;
                    }
                  }
                }
              } else {
                L51: {
                  ((oc) this).field_A[var54] = (short)var66.d(127);
                  if (var11 != 0) {
                    ((oc) this).field_G[var54] = var4.c((byte) 33);
                    break L51;
                  } else {
                    break L51;
                  }
                }
                L52: {
                  if (-256 != var15) {
                    break L52;
                  } else {
                    ((oc) this).field_C[var54] = var5.c((byte) 96);
                    break L52;
                  }
                }
                L53: {
                  if (-2 == var16) {
                    ((oc) this).field_n[var54] = var6.c((byte) 119);
                    break L53;
                  } else {
                    break L53;
                  }
                }
                L54: {
                  if (var17 != 1) {
                    break L54;
                  } else {
                    ((oc) this).field_D[var54] = var7.h(255);
                    break L54;
                  }
                }
                L55: {
                  if ((var18 ^ -1) == -2) {
                    ((oc) this).field_r[var54] = (short)(var8.d(kha.b(param1, 127)) + -1);
                    break L55;
                  } else {
                    break L55;
                  }
                }
                if (((oc) this).field_g != null) {
                  if ((((oc) this).field_r[var54] ^ -1) != 0) {
                    ((oc) this).field_g[var54] = (byte)(var9.h(255) - 1);
                    var54++;
                    continue L27;
                  } else {
                    ((oc) this).field_g[var54] = (byte)-1;
                    var54++;
                    continue L27;
                  }
                } else {
                  var54++;
                  continue L27;
                }
              }
            }
          } else {
            L56: {
              var55 = var66.h(255);
              var56 = 0;
              if (-1 != (var55 & 1)) {
                var56 = var4.f((byte) -128);
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              var57 = 0;
              if (-1 != (2 & var55)) {
                var57 = var5.f((byte) -128);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              var58 = 0;
              if ((var55 & 4) == 0) {
                break L58;
              } else {
                var58 = var6.f((byte) -128);
                break L58;
              }
            }
            ((oc) this).field_b[var54] = var51 + var56;
            ((oc) this).field_I[var54] = var52 + var57;
            ((oc) this).field_p[var54] = var53 - -var58;
            var53 = ((oc) this).field_p[var54];
            var51 = ((oc) this).field_b[var54];
            var52 = ((oc) this).field_I[var54];
            if (1 == var19) {
              ((oc) this).field_l[var54] = var7.h(kha.b(param1, 255));
              var54++;
              continue L26;
            } else {
              var54++;
              continue L26;
            }
          }
        }
    }

    final int[][] a(boolean param0, byte param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int[] var15 = null;
        int[][] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var17 = new int[256];
          var15 = var17;
          var13 = var15;
          var11 = var13;
          var10 = var11;
          var3 = var10;
          var4 = 0;
          if (param0) {
            stackOut_2_0 = ((oc) this).field_E;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((oc) this).field_L;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var6_int = 0;
        L1: while (true) {
          if (var6_int >= var5) {
            L2: {
              if (param1 == 64) {
                break L2;
              } else {
                ((oc) this).field_g = null;
                break L2;
              }
            }
            var18 = new int[var4 + 1][];
            var16 = var18;
            var14 = var16;
            var12 = var14;
            var6 = var12;
            var7 = 0;
            L3: while (true) {
              if (var7 > var4) {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var5) {
                    return var6;
                  } else {
                    var8 = ((oc) this).field_l[var7];
                    if ((var8 ^ -1) <= -1) {
                      var3[var8] = var3[var8] + 1;
                      var18[var8][var3[var8]] = var7;
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              } else {
                var6[var7] = new int[var17[var7]];
                var17[var7] = 0;
                var7++;
                continue L3;
              }
            }
          } else {
            var7 = ((oc) this).field_l[var6_int];
            if (var7 >= 0) {
              var10[var7] = var10[var7] + 1;
              if (var4 < var7) {
                var4 = var7;
                var6_int++;
                continue L1;
              } else {
                var6_int++;
                continue L1;
              }
            } else {
              var6_int++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        L0: {
          var43 = TombRacer.field_G ? 1 : 0;
          var3 = 0;
          var4 = 0;
          var5 = new uia(param1);
          var6 = new uia(param1);
          var7 = new uia(param1);
          var8 = new uia(param1);
          var9 = new uia(param1);
          var5.field_h = -18 + param1.length;
          ((oc) this).field_E = var5.d(param0 + -5349);
          ((oc) this).field_o = var5.d(124);
          ((oc) this).field_F = var5.h(255);
          var10 = var5.h(param0 + -5219);
          var11 = var5.h(param0 ^ 5533);
          var12 = var5.h(255);
          var13 = var5.h(255);
          var14 = var5.h(param0 ^ 5533);
          var15 = var5.d(123);
          var16 = var5.d(125);
          var17 = var5.d(param0 + -5348);
          var18 = var5.d(127);
          var19 = 0;
          var20 = var19;
          var19 = var19 + ((oc) this).field_E;
          var21 = var19;
          var19 = var19 + ((oc) this).field_o;
          var22 = var19;
          if (-256 == (var11 ^ -1)) {
            var19 = var19 + ((oc) this).field_o;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var23 = var19;
          if (1 == var13) {
            var19 = var19 + ((oc) this).field_o;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var24 = var19;
          if (1 == var10) {
            var19 = var19 + ((oc) this).field_o;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var25 = var19;
          if (var14 == 1) {
            var19 = var19 + ((oc) this).field_E;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var26 = var19;
          if (1 == var12) {
            var19 = var19 + ((oc) this).field_o;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var27 = var19;
          var19 = var19 + var18;
          var28 = var19;
          var19 = var19 + ((oc) this).field_o * 2;
          var29 = var19;
          var19 = var19 + ((oc) this).field_F * 6;
          var30 = var19;
          var19 = var19 + var15;
          var31 = var19;
          var19 = var19 + var16;
          var32 = var19;
          ((oc) this).field_p = new int[((oc) this).field_E];
          ((oc) this).field_t = new short[((oc) this).field_o];
          if (-1 <= (((oc) this).field_F ^ -1)) {
            break L5;
          } else {
            ((oc) this).field_u = new byte[((oc) this).field_F];
            ((oc) this).field_s = new short[((oc) this).field_F];
            ((oc) this).field_K = new short[((oc) this).field_F];
            ((oc) this).field_q = new short[((oc) this).field_F];
            break L5;
          }
        }
        L6: {
          if (-2 == (var13 ^ -1)) {
            ((oc) this).field_D = new int[((oc) this).field_o];
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          ((oc) this).field_I = new int[((oc) this).field_E];
          var19 = var19 + var17;
          ((oc) this).field_a = new short[((oc) this).field_o];
          if (255 == var11) {
            ((oc) this).field_C = new byte[((oc) this).field_o];
            break L7;
          } else {
            ((oc) this).field_k = (byte)var11;
            break L7;
          }
        }
        L8: {
          ((oc) this).field_J = new short[((oc) this).field_o];
          ((oc) this).field_A = new short[((oc) this).field_o];
          var5.field_h = var20;
          if ((var14 ^ -1) != -2) {
            break L8;
          } else {
            ((oc) this).field_l = new int[((oc) this).field_E];
            break L8;
          }
        }
        L9: {
          if (1 == var10) {
            ((oc) this).field_G = new byte[((oc) this).field_o];
            ((oc) this).field_g = new byte[((oc) this).field_o];
            ((oc) this).field_r = new short[((oc) this).field_o];
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          ((oc) this).field_b = new int[((oc) this).field_E];
          if ((var12 ^ -1) != -2) {
            break L10;
          } else {
            ((oc) this).field_n = new byte[((oc) this).field_o];
            break L10;
          }
        }
        var6.field_h = var30;
        var7.field_h = var31;
        var8.field_h = var32;
        var9.field_h = var25;
        var33 = 0;
        var34 = 0;
        var35 = 0;
        var36 = 0;
        L11: while (true) {
          if (((oc) this).field_E <= var36) {
            var5.field_h = var28;
            var6.field_h = var24;
            var7.field_h = var22;
            var8.field_h = var26;
            var9.field_h = var23;
            var36 = 0;
            L12: while (true) {
              if (((oc) this).field_o <= var36) {
                ((oc) this).field_L = -1;
                var5.field_h = var27;
                var6.field_h = var21;
                var36 = 0;
                var37 = 0;
                var38 = 0;
                var39 = 0;
                var40 = 0;
                L13: while (true) {
                  if (var40 >= ((oc) this).field_o) {
                    var5.field_h = var29;
                    ((oc) this).field_L = ((oc) this).field_L + 1;
                    var40 = 0;
                    if (param0 == 5474) {
                      L14: while (true) {
                        if (((oc) this).field_F <= var40) {
                          L15: {
                            if (null == ((oc) this).field_g) {
                              break L15;
                            } else {
                              var40 = 0;
                              var44 = 0;
                              var41 = var44;
                              L16: while (true) {
                                if (var44 >= ((oc) this).field_o) {
                                  if (var40 != 0) {
                                    break L15;
                                  } else {
                                    ((oc) this).field_g = null;
                                    break L15;
                                  }
                                } else {
                                  var42 = 255 & ((oc) this).field_g[var44];
                                  if (255 != var42) {
                                    L17: {
                                      if (((oc) this).field_a[var44] != (((oc) this).field_s[var42] & 65535)) {
                                        break L17;
                                      } else {
                                        if (((oc) this).field_t[var44] != (65535 & ((oc) this).field_q[var42])) {
                                          break L17;
                                        } else {
                                          if ((65535 & ((oc) this).field_K[var42]) != ((oc) this).field_J[var44]) {
                                            break L17;
                                          } else {
                                            ((oc) this).field_g[var44] = (byte)-1;
                                            var44++;
                                            continue L16;
                                          }
                                        }
                                      }
                                    }
                                    var40 = 1;
                                    var44++;
                                    continue L16;
                                  } else {
                                    var44++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                          L18: {
                            if (var3 != 0) {
                              break L18;
                            } else {
                              ((oc) this).field_G = null;
                              break L18;
                            }
                          }
                          L19: {
                            if (var4 == 0) {
                              ((oc) this).field_r = null;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          return;
                        } else {
                          ((oc) this).field_u[var40] = (byte) 0;
                          ((oc) this).field_s[var40] = (short)var5.d(kha.b(param0, 5407));
                          ((oc) this).field_q[var40] = (short)var5.d(126);
                          ((oc) this).field_K[var40] = (short)var5.d(kha.b(param0, 5407));
                          var40++;
                          continue L14;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    L20: {
                      var41 = var6.h(255);
                      if (-2 == (var41 ^ -1)) {
                        L21: {
                          var36 = (short)(var39 + var5.f((byte) -128));
                          var39 = var36;
                          var37 = (short)(var39 + var5.f((byte) -128));
                          var39 = var37;
                          var38 = (short)(var39 + var5.f((byte) -128));
                          var39 = var38;
                          ((oc) this).field_a[var40] = (short)var36;
                          ((oc) this).field_t[var40] = (short)var37;
                          ((oc) this).field_J[var40] = (short)var38;
                          if (((oc) this).field_L < var36) {
                            ((oc) this).field_L = var36;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (var37 > ((oc) this).field_L) {
                            ((oc) this).field_L = var37;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (var38 <= ((oc) this).field_L) {
                          break L20;
                        } else {
                          ((oc) this).field_L = var38;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    L23: {
                      if (2 == var41) {
                        var37 = var38;
                        var38 = (short)(var5.f((byte) -128) + var39);
                        ((oc) this).field_a[var40] = (short)var36;
                        var39 = var38;
                        ((oc) this).field_t[var40] = (short)var37;
                        ((oc) this).field_J[var40] = (short)var38;
                        if (((oc) this).field_L < var38) {
                          ((oc) this).field_L = var38;
                          break L23;
                        } else {
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (3 == var41) {
                        var36 = var38;
                        var38 = (short)(var39 + var5.f((byte) -128));
                        ((oc) this).field_a[var40] = (short)var36;
                        var39 = var38;
                        ((oc) this).field_t[var40] = (short)var37;
                        ((oc) this).field_J[var40] = (short)var38;
                        if (((oc) this).field_L < var38) {
                          ((oc) this).field_L = var38;
                          break L24;
                        } else {
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    if ((var41 ^ -1) == -5) {
                      var42 = var36;
                      var36 = var37;
                      var37 = var42;
                      var38 = (short)(var39 + var5.f((byte) -128));
                      ((oc) this).field_a[var40] = (short)var36;
                      var39 = var38;
                      ((oc) this).field_t[var40] = (short)var37;
                      ((oc) this).field_J[var40] = (short)var38;
                      if (((oc) this).field_L < var38) {
                        ((oc) this).field_L = var38;
                        var40++;
                        continue L13;
                      } else {
                        var40++;
                        continue L13;
                      }
                    } else {
                      var40++;
                      continue L13;
                    }
                  }
                }
              } else {
                L25: {
                  ((oc) this).field_A[var36] = (short)var5.d(param0 + -5352);
                  if (-2 == (var10 ^ -1)) {
                    L26: {
                      var37 = var6.h(255);
                      if ((var37 & 1 ^ -1) != -2) {
                        ((oc) this).field_G[var36] = (byte) 0;
                        break L26;
                      } else {
                        ((oc) this).field_G[var36] = (byte) 1;
                        var3 = 1;
                        break L26;
                      }
                    }
                    if (-3 != (2 & var37 ^ -1)) {
                      ((oc) this).field_g[var36] = (byte)-1;
                      ((oc) this).field_r[var36] = (short)-1;
                      break L25;
                    } else {
                      ((oc) this).field_g[var36] = (byte)(var37 >> -852499038);
                      ((oc) this).field_r[var36] = ((oc) this).field_A[var36];
                      ((oc) this).field_A[var36] = (short)127;
                      if (0 != (((oc) this).field_r[var36] ^ -1)) {
                        var4 = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                L27: {
                  if (-256 != (var11 ^ -1)) {
                    break L27;
                  } else {
                    ((oc) this).field_C[var36] = var7.c((byte) 92);
                    break L27;
                  }
                }
                L28: {
                  if (1 == var12) {
                    ((oc) this).field_n[var36] = var8.c((byte) 87);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                if (1 == var13) {
                  ((oc) this).field_D[var36] = var9.h(255);
                  var36++;
                  continue L12;
                } else {
                  var36++;
                  continue L12;
                }
              }
            }
          } else {
            L29: {
              var37 = var5.h(255);
              var38 = 0;
              if (-1 == (var37 & 1 ^ -1)) {
                break L29;
              } else {
                var38 = var6.f((byte) -128);
                break L29;
              }
            }
            L30: {
              var39 = 0;
              if ((var37 & 2) == 0) {
                break L30;
              } else {
                var39 = var7.f((byte) -128);
                break L30;
              }
            }
            L31: {
              var40 = 0;
              if ((4 & var37) == 0) {
                break L31;
              } else {
                var40 = var8.f((byte) -128);
                break L31;
              }
            }
            ((oc) this).field_b[var36] = var33 - -var38;
            ((oc) this).field_I[var36] = var39 + var34;
            ((oc) this).field_p[var36] = var40 + var35;
            var35 = ((oc) this).field_p[var36];
            var34 = ((oc) this).field_I[var36];
            var33 = ((oc) this).field_b[var36];
            if (-2 == (var14 ^ -1)) {
              ((oc) this).field_l[var36] = var9.h(255);
              var36++;
              continue L11;
            } else {
              var36++;
              continue L11;
            }
          }
        }
    }

    oc(byte[] param0) {
        ((oc) this).field_k = (byte) 0;
        ((oc) this).field_L = 0;
        ((oc) this).field_o = 0;
        ((oc) this).field_F = 0;
        ((oc) this).field_w = 12;
        ((oc) this).field_E = 0;
        if (0 == (param0[param0.length + -1] ^ -1)) {
            // ifne L68
            this.a(param0, 0);
        } else {
            this.a(5474, param0);
        }
    }

    oc(oc[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        oc var13_ref_oc = null;
        int var13 = 0;
        oc var14_ref_oc = null;
        int var14 = 0;
        oc var15 = null;
        int var15_int = 0;
        int var16 = 0;
        jt var16_ref_jt = null;
        int var17 = 0;
        int var18 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        byte[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        byte[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        byte[] stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        byte[] stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        byte[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        byte[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        byte[] stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        byte[] stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        ((oc) this).field_k = (byte) 0;
        ((oc) this).field_L = 0;
        ((oc) this).field_o = 0;
        ((oc) this).field_F = 0;
        ((oc) this).field_w = 12;
        ((oc) this).field_E = 0;
        ((oc) this).field_F = 0;
        ((oc) this).field_o = 0;
        ((oc) this).field_E = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        ((oc) this).field_k = (byte) -1;
        var11 = 0;
        var12 = 0;
        L0: while (true) {
          if (param1 <= var12) {
            L1: {
              if ((var4 ^ -1) >= -1) {
                break L1;
              } else {
                ((oc) this).field_e = new rga[var4];
                break L1;
              }
            }
            L2: {
              if (var9 == 0) {
                break L2;
              } else {
                ((oc) this).field_g = new byte[((oc) this).field_o];
                break L2;
              }
            }
            L3: {
              ((oc) this).field_a = new short[((oc) this).field_o];
              if (var10 == 0) {
                break L3;
              } else {
                ((oc) this).field_r = new short[((oc) this).field_o];
                break L3;
              }
            }
            L4: {
              if (((oc) this).field_F <= 0) {
                break L4;
              } else {
                ((oc) this).field_v = new int[((oc) this).field_F];
                ((oc) this).field_z = new byte[((oc) this).field_F];
                ((oc) this).field_c = new int[((oc) this).field_F];
                ((oc) this).field_f = new int[((oc) this).field_F];
                ((oc) this).field_s = new short[((oc) this).field_F];
                ((oc) this).field_q = new short[((oc) this).field_F];
                ((oc) this).field_x = new int[((oc) this).field_F];
                ((oc) this).field_j = new int[((oc) this).field_F];
                ((oc) this).field_K = new short[((oc) this).field_F];
                ((oc) this).field_i = new byte[((oc) this).field_F];
                ((oc) this).field_d = new int[((oc) this).field_F];
                ((oc) this).field_u = new byte[((oc) this).field_F];
                break L4;
              }
            }
            L5: {
              ((oc) this).field_A = new short[((oc) this).field_o];
              if (var7 == 0) {
                break L5;
              } else {
                ((oc) this).field_C = new byte[((oc) this).field_o];
                break L5;
              }
            }
            L6: {
              ((oc) this).field_I = new int[((oc) this).field_E];
              ((oc) this).field_p = new int[((oc) this).field_E];
              ((oc) this).field_y = new short[((oc) this).field_E];
              ((oc) this).field_h = new short[((oc) this).field_o];
              ((oc) this).field_J = new short[((oc) this).field_o];
              ((oc) this).field_b = new int[((oc) this).field_E];
              if (var11 == 0) {
                break L6;
              } else {
                ((oc) this).field_D = new int[((oc) this).field_o];
                break L6;
              }
            }
            L7: {
              ((oc) this).field_l = new int[((oc) this).field_E];
              if ((var5 ^ -1) >= -1) {
                break L7;
              } else {
                ((oc) this).field_m = new jt[var5];
                break L7;
              }
            }
            L8: {
              ((oc) this).field_t = new short[((oc) this).field_o];
              if (var6 == 0) {
                break L8;
              } else {
                ((oc) this).field_G = new byte[((oc) this).field_o];
                break L8;
              }
            }
            L9: {
              if (var8 == 0) {
                break L9;
              } else {
                ((oc) this).field_n = new byte[((oc) this).field_o];
                break L9;
              }
            }
            L10: {
              if (-1 <= (var3 ^ -1)) {
                break L10;
              } else {
                ((oc) this).field_B = new ava[var3];
                break L10;
              }
            }
            var3 = 0;
            var5 = 0;
            var4 = 0;
            ((oc) this).field_o = 0;
            ((oc) this).field_F = 0;
            ((oc) this).field_E = 0;
            var12 = 0;
            L11: while (true) {
              if (param1 <= var12) {
                var12 = 0;
                ((oc) this).field_L = ((oc) this).field_E;
                var13 = 0;
                L12: while (true) {
                  if (param1 <= var13) {
                  } else {
                    var14 = (short)(1 << var13);
                    var15 = param0[var13];
                    if (var15 != null) {
                      var16 = 0;
                      L13: while (true) {
                        if (var15.field_o <= var16) {
                          var16 = 0;
                          L14: while (true) {
                            if (var15.field_F > var16) {
                              L15: {
                                ((oc) this).field_u[((oc) this).field_F] = var15.field_u[var16];
                                var17 = var15.field_u[var16];
                                if (var17 != 0) {
                                  break L15;
                                } else {
                                  ((oc) this).field_s[((oc) this).field_F] = (short)this.a((int) var15.field_s[var16], (short) var14, var15, 1);
                                  ((oc) this).field_q[((oc) this).field_F] = (short)this.a((int) var15.field_q[var16], (short) var14, var15, 1);
                                  ((oc) this).field_K[((oc) this).field_F] = (short)this.a((int) var15.field_K[var16], (short) var14, var15, 1);
                                  break L15;
                                }
                              }
                              L16: {
                                if ((var17 ^ -1) > -2) {
                                  break L16;
                                } else {
                                  if ((var17 ^ -1) < -4) {
                                    break L16;
                                  } else {
                                    ((oc) this).field_s[((oc) this).field_F] = var15.field_s[var16];
                                    ((oc) this).field_q[((oc) this).field_F] = var15.field_q[var16];
                                    ((oc) this).field_K[((oc) this).field_F] = var15.field_K[var16];
                                    ((oc) this).field_j[((oc) this).field_F] = var15.field_j[var16];
                                    ((oc) this).field_f[((oc) this).field_F] = var15.field_f[var16];
                                    ((oc) this).field_x[((oc) this).field_F] = var15.field_x[var16];
                                    ((oc) this).field_i[((oc) this).field_F] = var15.field_i[var16];
                                    ((oc) this).field_z[((oc) this).field_F] = var15.field_z[var16];
                                    ((oc) this).field_d[((oc) this).field_F] = var15.field_d[var16];
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if ((var17 ^ -1) != -3) {
                                  break L17;
                                } else {
                                  ((oc) this).field_v[((oc) this).field_F] = var15.field_v[var16];
                                  ((oc) this).field_c[((oc) this).field_F] = var15.field_c[var16];
                                  break L17;
                                }
                              }
                              ((oc) this).field_F = ((oc) this).field_F + 1;
                              var16++;
                              continue L14;
                            } else {
                              var13++;
                              continue L12;
                            }
                          }
                        } else {
                          if (var9 != 0) {
                            L18: {
                              L19: {
                                var12++;
                                stackOut_100_0 = ((oc) this).field_g;
                                stackOut_100_1 = var12;
                                stackIn_103_0 = stackOut_100_0;
                                stackIn_103_1 = stackOut_100_1;
                                stackIn_101_0 = stackOut_100_0;
                                stackIn_101_1 = stackOut_100_1;
                                if (null == var15.field_g) {
                                  break L19;
                                } else {
                                  stackOut_101_0 = (byte[]) (Object) stackIn_101_0;
                                  stackOut_101_1 = stackIn_101_1;
                                  stackIn_103_0 = stackOut_101_0;
                                  stackIn_103_1 = stackOut_101_1;
                                  stackIn_102_0 = stackOut_101_0;
                                  stackIn_102_1 = stackOut_101_1;
                                  if ((var15.field_g[var16] ^ -1) == 0) {
                                    break L19;
                                  } else {
                                    stackOut_102_0 = (byte[]) (Object) stackIn_102_0;
                                    stackOut_102_1 = stackIn_102_1;
                                    stackOut_102_2 = ((oc) this).field_F + var15.field_g[var16];
                                    stackIn_104_0 = stackOut_102_0;
                                    stackIn_104_1 = stackOut_102_1;
                                    stackIn_104_2 = stackOut_102_2;
                                    break L18;
                                  }
                                }
                              }
                              stackOut_103_0 = (byte[]) (Object) stackIn_103_0;
                              stackOut_103_1 = stackIn_103_1;
                              stackOut_103_2 = -1;
                              stackIn_104_0 = stackOut_103_0;
                              stackIn_104_1 = stackOut_103_1;
                              stackIn_104_2 = stackOut_103_2;
                              break L18;
                            }
                            stackIn_104_0[stackIn_104_1] = (byte)stackIn_104_2;
                            var16++;
                            continue L13;
                          } else {
                            var16++;
                            continue L13;
                          }
                        }
                      }
                    } else {
                      var13++;
                      continue L12;
                    }
                  }
                }
              } else {
                var13 = (short)(1 << var12);
                var14_ref_oc = param0[var12];
                if (var14_ref_oc != null) {
                  L20: {
                    if (var14_ref_oc.field_m == null) {
                      break L20;
                    } else {
                      var15_int = 0;
                      L21: while (true) {
                        if (var15_int >= var14_ref_oc.field_m.length) {
                          break L20;
                        } else {
                          var16_ref_jt = var14_ref_oc.field_m[var15_int];
                          var5++;
                          ((oc) this).field_m[var5] = var16_ref_jt.a(9677, var16_ref_jt.field_a + ((oc) this).field_o);
                          var15_int++;
                          continue L21;
                        }
                      }
                    }
                  }
                  var15_int = 0;
                  L22: while (true) {
                    if (var14_ref_oc.field_o <= var15_int) {
                      L23: {
                        if (null == var14_ref_oc.field_B) {
                          break L23;
                        } else {
                          var15_int = 0;
                          L24: while (true) {
                            if (var14_ref_oc.field_B.length <= var15_int) {
                              break L23;
                            } else {
                              var16 = this.a(var14_ref_oc.field_B[var15_int].field_a, (short) var13, var14_ref_oc, 1);
                              var17 = this.a(var14_ref_oc.field_B[var15_int].field_c, (short) var13, var14_ref_oc, 1);
                              var18 = this.a(var14_ref_oc.field_B[var15_int].field_b, (short) var13, var14_ref_oc, 1);
                              ((oc) this).field_B[var3] = var14_ref_oc.field_B[var15_int].a(0, var17, var18, var16);
                              var3++;
                              var15_int++;
                              continue L24;
                            }
                          }
                        }
                      }
                      if (null != var14_ref_oc.field_e) {
                        var15_int = 0;
                        L25: while (true) {
                          if (var14_ref_oc.field_e.length > var15_int) {
                            var16 = this.a(var14_ref_oc.field_e[var15_int].field_a, (short) var13, var14_ref_oc, 1);
                            ((oc) this).field_e[var4] = var14_ref_oc.field_e[var15_int].a(0, var16);
                            var4++;
                            var15_int++;
                            continue L25;
                          } else {
                            var12++;
                            continue L11;
                          }
                        }
                      } else {
                        var12++;
                        continue L11;
                      }
                    } else {
                      L26: {
                        if (var6 == 0) {
                          break L26;
                        } else {
                          if (null == var14_ref_oc.field_G) {
                            break L26;
                          } else {
                            ((oc) this).field_G[((oc) this).field_o] = var14_ref_oc.field_G[var15_int];
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (var7 == 0) {
                          break L27;
                        } else {
                          if (null != var14_ref_oc.field_C) {
                            ((oc) this).field_C[((oc) this).field_o] = var14_ref_oc.field_C[var15_int];
                            break L27;
                          } else {
                            ((oc) this).field_C[((oc) this).field_o] = var14_ref_oc.field_k;
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (var8 == 0) {
                          break L28;
                        } else {
                          if (null == var14_ref_oc.field_n) {
                            break L28;
                          } else {
                            ((oc) this).field_n[((oc) this).field_o] = var14_ref_oc.field_n[var15_int];
                            break L28;
                          }
                        }
                      }
                      L29: {
                        if (var10 == 0) {
                          break L29;
                        } else {
                          if (null == var14_ref_oc.field_r) {
                            ((oc) this).field_r[((oc) this).field_o] = (short)-1;
                            break L29;
                          } else {
                            ((oc) this).field_r[((oc) this).field_o] = var14_ref_oc.field_r[var15_int];
                            break L29;
                          }
                        }
                      }
                      L30: {
                        if (var11 == 0) {
                          break L30;
                        } else {
                          if (var14_ref_oc.field_D != null) {
                            ((oc) this).field_D[((oc) this).field_o] = var14_ref_oc.field_D[var15_int];
                            break L30;
                          } else {
                            ((oc) this).field_D[((oc) this).field_o] = -1;
                            break L30;
                          }
                        }
                      }
                      ((oc) this).field_a[((oc) this).field_o] = (short)this.a((int) var14_ref_oc.field_a[var15_int], (short) var13, var14_ref_oc, 1);
                      ((oc) this).field_t[((oc) this).field_o] = (short)this.a((int) var14_ref_oc.field_t[var15_int], (short) var13, var14_ref_oc, 1);
                      ((oc) this).field_J[((oc) this).field_o] = (short)this.a((int) var14_ref_oc.field_J[var15_int], (short) var13, var14_ref_oc, 1);
                      ((oc) this).field_h[((oc) this).field_o] = (short)var13;
                      ((oc) this).field_A[((oc) this).field_o] = var14_ref_oc.field_A[var15_int];
                      ((oc) this).field_o = ((oc) this).field_o + 1;
                      var15_int++;
                      continue L22;
                    }
                  }
                } else {
                  var12++;
                  continue L11;
                }
              }
            }
          } else {
            var13_ref_oc = param0[var12];
            if (var13_ref_oc != null) {
              L31: {
                ((oc) this).field_E = ((oc) this).field_E + var13_ref_oc.field_E;
                ((oc) this).field_o = ((oc) this).field_o + var13_ref_oc.field_o;
                ((oc) this).field_F = ((oc) this).field_F + var13_ref_oc.field_F;
                if (var13_ref_oc.field_e == null) {
                  break L31;
                } else {
                  var4 = var4 + var13_ref_oc.field_e.length;
                  break L31;
                }
              }
              L32: {
                if (null == var13_ref_oc.field_m) {
                  break L32;
                } else {
                  var5 = var5 + var13_ref_oc.field_m.length;
                  break L32;
                }
              }
              L33: {
                if (null == var13_ref_oc.field_B) {
                  break L33;
                } else {
                  var3 = var3 + var13_ref_oc.field_B.length;
                  break L33;
                }
              }
              L34: {
                stackOut_10_0 = var6;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (null == var13_ref_oc.field_G) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L34;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L34;
                }
              }
              L35: {
                var6 = stackIn_13_0 | stackIn_13_1;
                stackOut_13_0 = var11;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (null == var13_ref_oc.field_D) {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L35;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L35;
                }
              }
              L36: {
                var11 = stackIn_16_0 | stackIn_16_1;
                if (null == var13_ref_oc.field_C) {
                  L37: {
                    if ((((oc) this).field_k ^ -1) != 0) {
                      break L37;
                    } else {
                      ((oc) this).field_k = var13_ref_oc.field_k;
                      break L37;
                    }
                  }
                  if (((oc) this).field_k == var13_ref_oc.field_k) {
                    break L36;
                  } else {
                    var7 = 1;
                    break L36;
                  }
                } else {
                  var7 = 1;
                  break L36;
                }
              }
              L38: {
                stackOut_22_0 = var8;
                stackIn_24_0 = stackOut_22_0;
                stackIn_23_0 = stackOut_22_0;
                if (null == var13_ref_oc.field_n) {
                  stackOut_24_0 = stackIn_24_0;
                  stackOut_24_1 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  break L38;
                } else {
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  break L38;
                }
              }
              L39: {
                var8 = stackIn_25_0 | stackIn_25_1;
                stackOut_25_0 = var10;
                stackIn_27_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (null == var13_ref_oc.field_r) {
                  stackOut_27_0 = stackIn_27_0;
                  stackOut_27_1 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L39;
                } else {
                  stackOut_26_0 = stackIn_26_0;
                  stackOut_26_1 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  break L39;
                }
              }
              L40: {
                var10 = stackIn_28_0 | stackIn_28_1;
                stackOut_28_0 = var9;
                stackIn_30_0 = stackOut_28_0;
                stackIn_29_0 = stackOut_28_0;
                if (null == var13_ref_oc.field_g) {
                  stackOut_30_0 = stackIn_30_0;
                  stackOut_30_1 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  break L40;
                } else {
                  stackOut_29_0 = stackIn_29_0;
                  stackOut_29_1 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  break L40;
                }
              }
              var9 = stackIn_31_0 | stackIn_31_1;
              var12++;
              continue L0;
            } else {
              var12++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new su(15, 0, 1, 0);
    }
}
